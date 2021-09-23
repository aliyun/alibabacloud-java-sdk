// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerTCPListenerRequest extends TeaModel {
    // 负载均衡实例的ID。
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    // 负载均衡实例前端使用的端口。  取值：1-65535。
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    // 设置监听的描述信息。  长度限制为1-80个字符，允许包含字母、数字、“-”、“/”、“.”和“_”等字符。支持中文描述。
    @NameInMap("Description")
    public String description;

    // 度算法。取值：  wrr（默认值）：权重值越高的后端服务器，被轮询到的次数（概率）也越高。 wlc：除了根据每台后端服务器设定的权重值来进行轮询，同时还考虑后端服务器的实际负载（即连接数）。当权重值相同时，当前连接数越小的后端服务器被轮询到的次数（概率）也越高。 rr：按照访问顺序依次将外部请求依序分发到后端服务器。 sch：基于源IP地址的一致性hash，相同的源地址会调度到相同的后端服务器。
    @NameInMap("Scheduler")
    public String scheduler;

    // 会话保持的超时时间。  取值：0~3600（秒）。  默认值：0，表示关闭会话保持。
    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    // 连接超时时间。  取值：10~900（秒）。
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    // 健康检查连续成功多少次后，将后端服务器的健康检查状态由fail判定为success。  取值： 2~10。
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    // 健康检查连续失败多少次后，将后端服务器的健康检查状态由success判定为fail。  取值：2~10。
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    // 每次健康检查响应的最大超时时间。  取值：1~300（秒）。  默认值：5。
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    // 健康检查的时间间隔。  取值：1~50（秒）。
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    // 用于健康检查的域名
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    // 用于健康检查的URI。长度限制为1~80，只能使用字母、数字、短横线（-）、正斜杠（/）、点号（.）、百分号（%）、#和&amp;这些字符。 URL不能只为/，但必须以/开头。  当TCP监听需要使用HTTP健康检查时可配置此参数，如不配置则按TCP健康检查。
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    // 健康检查正常的HTTP状态码，多个状态码用逗号（,）分割。  取值：http_2xx（默认值） | http_3xx | http_4xx | http_5xx。
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    // 健康检查类型。  取值：tcp（默认值） | http。
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    // 负载均衡实例后端使用的端口，取值：1~65535
    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    // 健康检查使用的端口。  取值：1~65535。  不设置此参数时，表示使用后端服务端口（BackendServerPort）。
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    public static CreateLoadBalancerTCPListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerTCPListenerRequest self = new CreateLoadBalancerTCPListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerTCPListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadBalancerTCPListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateLoadBalancerTCPListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLoadBalancerTCPListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateLoadBalancerTCPListenerRequest setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public CreateLoadBalancerTCPListenerRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public CreateLoadBalancerTCPListenerRequest setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

}
