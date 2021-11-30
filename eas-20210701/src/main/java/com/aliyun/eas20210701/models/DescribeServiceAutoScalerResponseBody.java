// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceAutoScalerResponseBody extends TeaModel {
    // 服务最大实例数
    @NameInMap("MaxReplica")
    public Integer maxReplica;

    // 服务最小实例数
    @NameInMap("MinReplica")
    public Integer minReplica;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 服务名字
    @NameInMap("ServiceName")
    public String serviceName;

    // 扩缩控制器控制策略
    @NameInMap("Strategies")
    public java.util.Map<String, ?> strategies;

    public static DescribeServiceAutoScalerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAutoScalerResponseBody self = new DescribeServiceAutoScalerResponseBody();
        return TeaModel.build(map, self);
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
