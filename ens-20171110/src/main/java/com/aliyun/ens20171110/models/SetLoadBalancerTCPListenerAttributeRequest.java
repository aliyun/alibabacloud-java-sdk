// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerTCPListenerAttributeRequest extends TeaModel {
    // 设置监听的描述信息。  长度限制为1-80个字符，允许包含字母、数字、“-”、“/”、“.”和“_”等字符。支持中文描述。
    @NameInMap("Description")
    public String description;

    @NameInMap("EipTransmit")
    public String eipTransmit;

    // 连接超时时间。  取值：10~900（秒）。
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    // 健康检查使用的端口。  取值：1~65535。  不设置此参数时，表示使用后端服务端口（BackendServerPort）。
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    // 每次健康检查响应的最大超时时间。  取值：1~300（秒）。  默认值：5。
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    // 用于健康检查的域名
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    // 健康检查正常的HTTP状态码，多个状态码用逗号（,）分割。  取值：http_2xx（默认值） | http_3xx | http_4xx | http_5xx。
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    // 健康检查的时间间隔。  取值：1~50（秒）。
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    // 健康检查类型。  取值：tcp（默认值） | http。
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    // 用于健康检查的URI。长度限制为1~80，只能使用字母、数字、短横线（-）、正斜杠（/）、点号（.）、百分号（%）、#和&amp;这些字符。 URL不能只为/，但必须以/开头。  当TCP监听需要使用HTTP健康检查时可配置此参数，如不配置则按TCP健康检查。
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    // 健康检查连续成功多少次后，将后端服务器的健康检查状态由fail判定为success。  取值： 2~10。
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    // 负载均衡实例前端使用的端口。  取值：1-65535。
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    // 负载均衡实例的ID。
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    // 会话保持的超时时间。  取值：0~3600（秒）。  默认值：0，表示关闭会话保持。
    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    // 度算法。取值：  wrr（默认值）：权重值越高的后端服务器，被轮询到的次数（概率）也越高。 wlc：除了根据每台后端服务器设定的权重值来进行轮询，同时还考虑后端服务器的实际负载（即连接数）。当权重值相同时，当前连接数越小的后端服务器被轮询到的次数（概率）也越高。 rr：按照访问顺序依次将外部请求依序分发到后端服务器。 sch：基于源IP地址的一致性hash，相同的源地址会调度到相同的后端服务器。
    @NameInMap("Scheduler")
    public String scheduler;

    // 健康检查连续失败多少次后，将后端服务器的健康检查状态由success判定为fail。  取值：2~10。
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static SetLoadBalancerTCPListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerTCPListenerAttributeRequest self = new SetLoadBalancerTCPListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerTCPListenerAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setEipTransmit(String eipTransmit) {
        this.eipTransmit = eipTransmit;
        return this;
    }
    public String getEipTransmit() {
        return this.eipTransmit;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public SetLoadBalancerTCPListenerAttributeRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
