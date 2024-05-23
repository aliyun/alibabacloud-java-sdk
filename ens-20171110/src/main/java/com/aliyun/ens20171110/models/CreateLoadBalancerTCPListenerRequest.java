// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerTCPListenerRequest extends TeaModel {
    /**
     * <p>The backend port that is used by the ELB instance. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    /**
     * <p>The description of the listener. The description must be **1** to **80** characters in length.</p>
     * <br>
     * <p>>  The value cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable Elastic IP address (EIP) pass-through. Valid values:</p>
     * <br>
     * <p>*   **on**</p>
     * <p>*   **off** (default)</p>
     */
    @NameInMap("EipTransmit")
    public String eipTransmit;

    /**
     * <p>The timeout period of a connection. Valid values: **10** to **900**. Default value: **900**. Unit: seconds.</p>
     */
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    /**
     * <p>The port that is used for health checks. Valid values: **1** to **65535**. If you leave this parameter empty, the port specified for BackendServerPort is used for health checks.</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The timeout period of a health check response. If a backend server does not respond within the specified timeout period, the server fails to pass the health check.</p>
     * <br>
     * <p>*   Default value: 5.</p>
     * <p>*   Valid values: **1** to **300**.</p>
     * <p>*   Unit: seconds.</p>
     * <br>
     * <p>>  If the value that you specified for HealthCheckConnectTimeout is smaller than the value of HealthCheckInterval, HealthCheckConnectTimeout becomes invalid and the timeout period that you specified for HealthCheckInterval is used.</p>
     */
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    /**
     * <p>The domain name that you want to use for health checks.</p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status codes for a successful health check. Valid values:</p>
     * <br>
     * <p>*   **http_2xx** (default)</p>
     * <p>*   **http_3xx**.</p>
     * <p>*   **http_4xx**</p>
     * <p>*   **http_5xx**</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval at which health checks are performed. Valid values: **1** to **50**. Default value: **2**. Unit: seconds.</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The type of health checks. Valid values:</p>
     * <br>
     * <p>*   **tcp** (default)</p>
     * <p>*   **http**</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The Uniform Resource Identifier (URI) that you want to use for health checks. The URI must be **1** to **80** characters in length.</p>
     * <br>
     * <p>>  The URL must start with `/` and contain characters other than `/`.</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The number of consecutive successful health checks that must occur before an unhealthy and inaccessible backend server is declared healthy and accessible. Valid values: **2** to **10**. Default value: **3**.</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The frontend port that is used by the ELB instance. Valid values: **1** to **65535**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the Edge Load Balancer (ELB) instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The timeout period of session persistence.</p>
     * <br>
     * <p>*   Default value: 0. If the default value is used, the system disables session persistence.</p>
     * <p>*   Valid values: **0** to **3600**.</p>
     * <p>*   Unit: seconds.</p>
     */
    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <br>
     * <p>*   **wrr** (default): Backend servers with higher weights receive more requests than backend servers with lower weights.</p>
     * <p>*   **wlc**: Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections on a backend server. If two backend servers have the same weight, the backend server that has fewer connections receives more requests.</p>
     * <p>*   **rr**: Requests are distributed to backend servers in sequence.</p>
     * <p>*   **sch**: consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</p>
     * <p>*   **qch**: consistent hashing that is based on QUIC connection IDs. Requests that contain the same QUIC connection ID are distributed to the same backend server.</p>
     * <p>*   **iqch**: consistent hashing that is based on specific three bytes of the iQUIC CIDs. Requests whose second to fourth bytes are the same are distributed to the same backend server.</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The number of consecutive failed health checks that must occur before a healthy and accessible backend server is declared unhealthy and inaccessible. Valid values: **2** to **10**. Default value: **3**.</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static CreateLoadBalancerTCPListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerTCPListenerRequest self = new CreateLoadBalancerTCPListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerTCPListenerRequest setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public CreateLoadBalancerTCPListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLoadBalancerTCPListenerRequest setEipTransmit(String eipTransmit) {
        this.eipTransmit = eipTransmit;
        return this;
    }
    public String getEipTransmit() {
        return this.eipTransmit;
    }

    public CreateLoadBalancerTCPListenerRequest setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public CreateLoadBalancerTCPListenerRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public CreateLoadBalancerTCPListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateLoadBalancerTCPListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadBalancerTCPListenerRequest setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public CreateLoadBalancerTCPListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateLoadBalancerTCPListenerRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
