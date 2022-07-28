// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceAutoScalerResponseBody extends TeaModel {
    @NameInMap("CurrentValues")
    public java.util.Map<String, ?> currentValues;

    @NameInMap("MaxReplica")
    public Integer maxReplica;

    @NameInMap("MinReplica")
    public Integer minReplica;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Strategies")
    public java.util.Map<String, ?> strategies;

    public static DescribeServiceAutoScalerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAutoScalerResponseBody self = new DescribeServiceAutoScalerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAutoScalerResponseBody setCurrentValues(java.util.Map<String, ?> currentValues) {
        this.currentValues = currentValues;
        return this;
    }
    public java.util.Map<String, ?> getCurrentValues() {
        return this.currentValues;
    }

    public DescribeServiceAutoScalerResponseBody setMaxReplica(Integer maxReplica) {
        this.maxReplica = maxReplica;
        return this;
    }
    public Integer getMaxReplica() {
        return this.maxReplica;
    }

    public DescribeServiceAutoScalerResponseBody setMinReplica(Integer minReplica) {
        this.minReplica = minReplica;
        return this;
    }
    public Integer getMinReplica() {
        return this.minReplica;
    }

    public DescribeServiceAutoScalerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceAutoScalerResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeServiceAutoScalerResponseBody setStrategies(java.util.Map<String, ?> strategies) {
        this.strategies = strategies;
        return this;
    }
    public java.util.Map<String, ?> getStrategies() {
        return this.strategies;
    }

}
