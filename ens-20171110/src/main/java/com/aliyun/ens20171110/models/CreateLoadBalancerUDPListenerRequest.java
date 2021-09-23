// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerUDPListenerRequest extends TeaModel {
    // 负载均衡实例的ID。
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    // 负载均衡实例前端使用的端口。  取值：1-65535。
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    // 设置监听的描述信息。  长度限制为1-80个字符，允许包含字母、数字、“-”、“/”、“.”和“_”等字符。支持中文描述。
    @NameInMap("Description")
    public String description;

    // 调度算法。取值：  wrr（默认值）：权重值越高的后端服务器，被轮询到的次数（概率）也越高。 wlc：除了根据每台后端服务器设定的权重值来进行轮询，同时还考虑后端服务器的实际负载（即连接数）。当权重值相同时，当前连接数越小的后端服务器被轮询到的次数（概率）也越高。 rr：按照访问顺序依次将外部请求依序分发到后端服务器。 sch：基于源IP地址的一致性hash，相同的源地址会调度到相同的后端服务器。
    @NameInMap("Scheduler")
    public String scheduler;

    // 健康检查连续成功多少次后，将后端服务器的健康检查状态由fail判定为success。  取值：2-10。
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    // 健康检查连续失败多少次后，将后端服务器的健康检查状态由success判定为fail。  取值：2-10。
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    // 接收来自运行状况检查的响应需要等待的时间。  如果后端ENS在指定的时间内没有正确响应，则判定为健康检查失败。  取值：1-300（秒）。默认为5秒
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    // 健康检查的时间间隔。  取值：1-50（秒）。
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    // 负载均衡实例后端使用的端口，取值：1~65535
    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    // 健康检查使用的端口。取值：1-65535  不设置此参数时，表示使用后端服务端口（BackendServerPort）
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    // UDP监听健康检查的请求串，只允许包含字母、数字，最大长度限制为64个字符。
    @NameInMap("HealthCheckReq")
    public String healthCheckReq;

    // UDP监听健康检查的响应串，只允许包含字母、数字，最大长度限制为64个字符。
    @NameInMap("HealthCheckExp")
    public String healthCheckExp;

    public static CreateLoadBalancerUDPListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerUDPListenerRequest self = new CreateLoadBalancerUDPListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerUDPListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadBalancerUDPListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateLoadBalancerUDPListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLoadBalancerUDPListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public CreateLoadBalancerUDPListenerRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public CreateLoadBalancerUDPListenerRequest setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckReq(String healthCheckReq) {
        this.healthCheckReq = healthCheckReq;
        return this;
    }
    public String getHealthCheckReq() {
        return this.healthCheckReq;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckExp(String healthCheckExp) {
        this.healthCheckExp = healthCheckExp;
        return this;
    }
    public String getHealthCheckExp() {
        return this.healthCheckExp;
    }

}
