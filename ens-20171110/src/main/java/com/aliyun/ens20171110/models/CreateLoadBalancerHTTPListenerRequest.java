// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerHTTPListenerRequest extends TeaModel {
    /**
     * <p>The description of the listener. The description must be **1** to **80** characters in length.</p>
     * <br>
     * <p>>  The value cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The listener port that is used to redirect HTTP requests to HTTPS.</p>
     */
    @NameInMap("ForwardPort")
    public Integer forwardPort;

    /**
     * <p>Specifies whether to enable the health check feature. Valid values:</p>
     * <br>
     * <p>*   **on**</p>
     * <p>*   **off** (default)</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>The backend port that is used for health checks. Valid values: **1** to **65535**.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name that you want to use for health checks.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status code for a successful health check. Valid values:</p>
     * <br>
     * <p>*   **http\_2xx** (default)</p>
     * <p>*   **http\_3xx**</p>
     * <p>*   **http\_4xx**</p>
     * <p>*   **http\_5xx**</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval at which health checks are performed. Valid values: **1** to **50**. Default value: **2**. Unit: seconds.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The health check method used in HTTP health checks. Valid values:</p>
     * <br>
     * <p>*   **head** (default)</p>
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
     * <p>The Uniform Resource Identifier (URI) that you want to use for health checks. The URI must be **1** to **80** characters in length.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The URL must start with `/` and contain characters other than `/`.</p>
     * <br>
     * <p>*   This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The number of consecutive successful health checks that must occur before an unhealthy and inaccessible backend server is declared healthy and accessible. Valid values: **2** to **10**. Default value: **3**.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The timeout period for idle connections. Default value: 15. Valid values: **1** to **60**. Unit: seconds.</p>
     * <br>
     * <p>>  If no request is received within the specified timeout period, ELB closes the connection. When a request is received, ELB creates a new connection.</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>Specifies whether to enable HTTP-to-HTTPS redirection. Valid values:</p>
     * <br>
     * <p>*   **on**</p>
     * <p>*   **off** (default)</p>
     */
    @NameInMap("ListenerForward")
    public String listenerForward;

    /**
     * <p>The frontend port that is used by the ELB instance. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the Edge Load Balancer (ELB) instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The timeout period of a request. Default value: 60. Valid values: **1** to **180**. Unit: seconds.</p>
     * <br>
     * <p>>  If no response is received from the backend server within the specified timeout period, ALB returns an HTTP 504 error code to the client.</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The routing algorithm. Valid values:</p>
     * <br>
     * <p>*   **wrr**: Backend servers with higher weights receive more requests than backend servers with lower weights. This is the default value.</p>
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
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    /**
     * <p>Specifies whether to use the X-Forwarded-For header to obtain the real IP address of the client. Valid values:</p>
     * <br>
     * <p>*   **on**</p>
     * <p>*   **off** (default)</p>
     */
    @NameInMap("XForwardedFor")
    public String XForwardedFor;

    public static CreateLoadBalancerHTTPListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerHTTPListenerRequest self = new CreateLoadBalancerHTTPListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerHTTPListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLoadBalancerHTTPListenerRequest setForwardPort(Integer forwardPort) {
        this.forwardPort = forwardPort;
        return this;
    }
    public Integer getForwardPort() {
        return this.forwardPort;
    }

    public CreateLoadBalancerHTTPListenerRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public CreateLoadBalancerHTTPListenerRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public CreateLoadBalancerHTTPListenerRequest setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public CreateLoadBalancerHTTPListenerRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public CreateLoadBalancerHTTPListenerRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public CreateLoadBalancerHTTPListenerRequest setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public CreateLoadBalancerHTTPListenerRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public CreateLoadBalancerHTTPListenerRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public CreateLoadBalancerHTTPListenerRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public CreateLoadBalancerHTTPListenerRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public CreateLoadBalancerHTTPListenerRequest setListenerForward(String listenerForward) {
        this.listenerForward = listenerForward;
        return this;
    }
    public String getListenerForward() {
        return this.listenerForward;
    }

    public CreateLoadBalancerHTTPListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateLoadBalancerHTTPListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadBalancerHTTPListenerRequest setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public CreateLoadBalancerHTTPListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateLoadBalancerHTTPListenerRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public CreateLoadBalancerHTTPListenerRequest setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
        return this;
    }
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

}
