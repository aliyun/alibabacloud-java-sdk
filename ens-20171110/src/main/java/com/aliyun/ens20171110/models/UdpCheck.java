// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UdpCheck extends TeaModel {
    // 健康检查使用的端口。取值：1-65535  不设置此参数时，表示使用后端服务端口（BackendServerPort）。
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    // 接收来自运行状况检查的响应需要等待的时间。  如果后端ENS在指定的时间内没有正确响应，则判定为健康检查失败。  取值：1-300（秒）。默认为5秒
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    // 健康检查的时间间隔。  取值：1-50（秒）。
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    // 健康检查连续成功多少次后，将后端服务器的健康检查状态由fail判定为success。  取值：2-10。
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    // 健康检查连续失败多少次后，将后端服务器的健康检查状态由success判定为fail。  取值：2-10。
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static UdpCheck build(java.util.Map<String, ?> map) throws Exception {
        UdpCheck self = new UdpCheck();
        return TeaModel.build(map, self);
    }

    public UdpCheck setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public UdpCheck setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public UdpCheck setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public UdpCheck setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public UdpCheck setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
