// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerHTTPListenerAttributeRequest extends TeaModel {
    /**
     * <p>The description of the listener. The description must be **1** to **80** characters in length.</p>
     * <br>
     * <p>>  The value cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the health check feature. Valid values:</p>
     * <br>
     * <p>*   **on**</p>
     * <p>*   **off**</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>The port that is used for health checks. Valid values: **1** to **65535**. If you leave this parameter empty, the port specified by BackendServerPort is used for health checks.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name that is used for health checks.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status code for a successful health check. Valid values:</p>
     * <br>
     * <p>*   **http_2xx** (default)</p>
     * <p>*   **http_3xx**.</p>
     * <p>*   **http_4xx**</p>
     * <p>*   **http_5xx**</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval at which health checks are performed. Valid values: **1** to **50**. Unit: seconds.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The health check method used in HTTP health checks. Valid values:</p>
     * <br>
     * <p>*   **head**</p>
     * <p>*   **get**</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The timeout period of a health check response. If a backend server does not respond within the specified timeout period, the server fails to pass the health check.</p>
     * <br>
     * <p>*   Default value: 5.</p>
     * <p>*   Valid values: **1** to **300**.</p>
     * <p>*   Unit: seconds.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter takes effect only if you set HealthCheck to on.</p>
     * <br>
     * <p>*   If the value of the HealthCheckTimeout parameter is smaller than the value of the HealthCheckInterval parameter, the timeout period specified by the HealthCheckTimeout parameter becomes invalid and the value of the HealthCheckInterval parameter is used as the timeout period.</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The Uniform Resource Identifier (URI) that is used for health checks. The URI must be **1** to **80** characters in length.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The URL must start with a forward slash (`/`) and contain characters other than forward slashes (`/`).</p>
     * <br>
     * <p>*   This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The number of consecutive successful health checks that must occur before an unhealthy and inaccessible backend server is declared healthy and accessible. Valid values: **2** to **10**.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The timeout period for idle connections. Default value: 15. Valid values: **1** to **60**. Unit: seconds.</p>
     * <br>
     * <p>>  If no request is received within the specified timeout period, ELB closes the connection. When another request is received, CLB establishes a new connection.</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

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
     * <p>The timeout period of requests. Default value: 60. Valid values: **1** to **180**. Unit: seconds.</p>
     * <br>
     * <p>>  If no response is received from the backend server within the specified timeout period, ELB returns an HTTP 504 error code to the client.</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The routing algorithm. Valid values:</p>
     * <br>
     * <p>*   **wrr**: Backend servers with higher weights receive more requests than those with lower weights.</p>
     * <p>*   **wlc**: Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections to a backend server. If two backend servers have the same weight, the backend server that has fewer connections receives more requests.</p>
     * <p>*   **rr**: Requests are distributed to backend servers in sequence.</p>
     * <p>*   **sch**: consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</p>
     * <p>*   **qch**: consistent hashing that is based on QUIC connection IDs. Requests that contain the same QUIC connection ID are distributed to the same backend server.</p>
     * <p>*   **iqch**: consistent hashing that is based on specific three bytes of the iQUIC CIDs. Requests whose second to fourth bytes are the same are distributed to the same backend server.</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The number of consecutive failed health checks that must occur before a healthy and accessible backend server is declared unhealthy and inaccessible. Valid values: **2** to **10**.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static SetLoadBalancerHTTPListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerHTTPListenerAttributeRequest self = new SetLoadBalancerHTTPListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public SetLoadBalancerHTTPListenerAttributeRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
