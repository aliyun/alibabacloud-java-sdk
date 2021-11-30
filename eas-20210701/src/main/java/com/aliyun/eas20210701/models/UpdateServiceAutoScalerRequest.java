// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceAutoScalerRequest extends TeaModel {
    // 最大 replica 数，需要大于MinReplica
    @NameInMap("Max")
    public Integer max;

    // 最小 replica 数，需要大于0
    @NameInMap("Min")
    public Integer min;

    // map 类型的策略定义
    @NameInMap("Strategies")
    public UpdateServiceAutoScalerRequestStrategies strategies;

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

    public UpdateServiceAutoScalerRequest setStrategies(UpdateServiceAutoScalerRequestStrategies strategies) {
        this.strategies = strategies;
        return this;
    }
    public UpdateServiceAutoScalerRequestStrategies getStrategies() {
        return this.strategies;
    }

    public static class UpdateServiceAutoScalerRequestStrategies extends TeaModel {
        // 最大 replica 数，需要大于MinReplica
        @NameInMap("Cpu")
        public Float cpu;

        // 每个实例支持的最大qps数，超出即扩容
        @NameInMap("Qps")
        public Float qps;

        public static UpdateServiceAutoScalerRequestStrategies build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceAutoScalerRequestStrategies self = new UpdateServiceAutoScalerRequestStrategies();
            return TeaModel.build(map, self);
        }

        public UpdateServiceAutoScalerRequestStrategies setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public UpdateServiceAutoScalerRequestStrategies setQps(Float qps) {
            this.qps = qps;
            return this;
        }
        public Float getQps() {
            return this.qps;
        }

    }

}
