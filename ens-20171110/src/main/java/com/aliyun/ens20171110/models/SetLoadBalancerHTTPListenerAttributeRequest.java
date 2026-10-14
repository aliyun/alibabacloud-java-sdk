// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerHTTPListenerAttributeRequest extends TeaModel {
    /**
     * <p>The listener name. The name must be <strong>1</strong> to <strong>80</strong> characters in length.</p>
     * <blockquote>
     * <p>The name cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Listener description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable health checks. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If this parameter is not configured in Settings, the backend service port (BackendServerPort) is used.</p>
     * <blockquote>
     * <p>This parameter takes effect only when HealthCheck is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65500</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name used for health checks.</p>
     * <blockquote>
     * <p>This parameter takes effect only when HealthCheck is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status code that indicates a successful health check. Valid values:</p>
     * <ul>
     * <li><strong>http_2xx</strong> (default).</li>
     * <li><strong>http_3xx</strong>.</li>
     * <li><strong>http_4xx</strong>.</li>
     * <li><strong>http_5xx</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when HealthCheck is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>http_2xx</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval between two consecutive health checks. Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
     * <blockquote>
     * <p>This parameter takes effect only when HealthCheck is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The health check method for the HTTP listener. Valid values:</p>
     * <ul>
     * <li><strong>head</strong>.</li>
     * <li><strong>get</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when HealthCheck is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>head</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The amount of time to wait for a response from a health check. If the backend ECS instance does not respond within the specified time, the health check fails.</p>
     * <ul>
     * <li>Default value: 5 seconds.</li>
     * <li>Valid values: <strong>1</strong> to <strong>300</strong>.</li>
     * <li>Unit: seconds.<blockquote>
     * <ul>
     * <li>This parameter takes effect only when HealthCheck is set to on.</li>
     * <li>If the value of HealthCheckTimeout is less than the value of HealthCheckInterval, HealthCheckTimeout becomes ineffective and the timeout period equals the value of HealthCheckInterval.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The URI used for health checks. The URI must be <strong>1</strong> to <strong>80</strong> characters in length.</p>
     * <blockquote>
     * <ul>
     * <li>The URI cannot be only <code>/</code> but must start with <code>/</code>.</li>
     * <li>This parameter takes effect only when HealthCheck is set to on.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/checkpreload.htm</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The number of consecutive successful health checks required before a backend server is declared healthy (changing the status from fail to success). Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when HealthCheck is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The idle connection timeout period. Default value: 15 seconds. Valid values: <strong>1</strong> to <strong>60</strong>. Unit: seconds.</p>
     * <blockquote>
     * <p>If no access request is received within the timeout period, the load balancing instance temporarily breaks the current connection and re-establishes a new connection when the next request arrives.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The listener port whose attributes you want to modify. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the load balancing instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5snthcyu1x10g7tywj7iu****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The request timeout period. Default value: 60 seconds. Valid values: <strong>1</strong> to <strong>180</strong>. Unit: seconds.</p>
     * <blockquote>
     * <p>If no response is received from the backend server within the timeout period, the load balancing instance stops waiting and returns an HTTP 504 error code to the client.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <ul>
     * <li><strong>wrr</strong>: Backend servers with higher weights are polled more frequently.</li>
     * <li><strong>wlc</strong>: Requests are distributed based on the weight and actual load (number of connections) of each backend server. When the weights are the same, backend servers with fewer connections are polled more frequently.</li>
     * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
     * <li><strong>sch</strong>: Consistent hashing based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</li>
     * <li><strong>qch</strong>: Consistent hashing based on QUIC Connection IDs. Requests with the same QUIC Connection ID are distributed to the same backend server.</li>
     * <li><strong>iqch</strong>: Consistent hashing based on specific three bytes of the iQUIC CID. Requests with the same 2nd to 4th bytes are distributed to the same backend server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The number of consecutive failed health checks required before a backend server is declared unhealthy (changing the status from success to fail). Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when HealthCheck is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    /**
     * <p>Specifies whether to use the X-Forwarded-For header to retrieve the originating IP address of the client. Valid values:</p>
     * <ul>
     * <li><strong>on</strong> (default): enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("XForwardedFor")
    public String XForwardedFor;

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

    public SetLoadBalancerHTTPListenerAttributeRequest setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
        return this;
    }
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

}
