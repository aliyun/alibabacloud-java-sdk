// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceAutoScalerRequest extends TeaModel {
    @NameInMap("max")
    public Integer max;

    @NameInMap("min")
    public Integer min;

    @NameInMap("scaleStrategies")
    public java.util.List<UpdateServiceAutoScalerRequestScaleStrategies> scaleStrategies;

    public static UpdateServiceAutoScalerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceAutoScalerRequest self = new UpdateServiceAutoScalerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceAutoScalerRequest setMax(Integer max) {
        this.max = max;
        return this;
    }
    public Integer getMax() {
        return this.max;
    }

    public UpdateServiceAutoScalerRequest setMin(Integer min) {
        this.min = min;
        return this;
    }
    public Integer getMin() {
        return this.min;
    }

    public UpdateServiceAutoScalerRequest setScaleStrategies(java.util.List<UpdateServiceAutoScalerRequestScaleStrategies> scaleStrategies) {
        this.scaleStrategies = scaleStrategies;
        return this;
    }
    public java.util.List<UpdateServiceAutoScalerRequestScaleStrategies> getScaleStrategies() {
        return this.scaleStrategies;
    }

    public static class UpdateServiceAutoScalerRequestScaleStrategies extends TeaModel {
        @NameInMap("metricName")
        public String metricName;

        @NameInMap("service")
        public String service;

        @NameInMap("threshold")
        public Float threshold;

        public static UpdateServiceAutoScalerRequestScaleStrategies build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceAutoScalerRequestScaleStrategies self = new UpdateServiceAutoScalerRequestScaleStrategies();
            return TeaModel.build(map, self);
        }

        public UpdateServiceAutoScalerRequestScaleStrategies setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public UpdateServiceAutoScalerRequestScaleStrategies setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public UpdateServiceAutoScalerRequestScaleStrategies setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
