// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerHTTPSListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>The maximum bandwidth of the EIP.</p>
     * <ul>
     * <li>Default value: 5.</li>
     * <li>Valid values: <strong>5</strong> to <strong>10000</strong>.</li>
     * <li>Unit: Mbit/s.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The description of the listener. The description must be <strong>1</strong> to <strong>80</strong> characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The listener port that is used to redirect HTTP requests to HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ForwardPort")
    public Integer forwardPort;

    /**
     * <p>Indicates whether the health check feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>The port that is used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If an empty string is returned for this parameter, the port specified by BackendServerPort is used for health checks.</p>
     * <blockquote>
     * <p> This parameter is returned only if the HealthCheck parameter is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9902</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name that is used for health checks.</p>
     * <blockquote>
     * <p> This parameter is returned only if the HealthCheck parameter is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.test.com">www.test.com</a></p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status code for a successful health check. Valid values:</p>
     * <ul>
     * <li><strong>http_2xx</strong> (default)</li>
     * <li><strong>http_3xx</strong>.</li>
     * <li><strong>http_4xx</strong></li>
     * <li><strong>http_5xx</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is returned only if the HealthCheck parameter is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>http_2xx</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval at which health checks are performed. Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
     * <blockquote>
     * <p> This parameter is returned only if the HealthCheck parameter is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The health check method used in HTTP health checks. Valid values:</p>
     * <ul>
     * <li><strong>head</strong>: requests the head of the page.</li>
     * <li><strong>get</strong>: requests the specified part of the page and returns the entity body.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is returned only if the HealthCheck parameter is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>head</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The timeout period of a health check response. If a backend server does not respond within the specified timeout period, the server fails to pass the health check.</p>
     * <ul>
     * <li>Default value: 5.</li>
     * <li>Valid values: <strong>1</strong> to <strong>300</strong>.</li>
     * <li>Unit: seconds.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is returned only if the HealthCheck parameter is set to on.</p>
     * </li>
     * <li><p>If the value of the HealthCheckTimeout parameter is smaller than the value of the HealthCheckInterval parameter, the timeout period specified by the HealthCheckTimeout parameter becomes invalid and the value of the HealthCheckInterval parameter is used as the timeout period.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The URI that is used for health checks. The URI must be <strong>1</strong> to <strong>80</strong> characters in length.</p>
     * <ul>
     * <li>The URL must start with <code>/</code> and contain characters other than <code>/</code>.</li>
     * <li>This parameter is returned only if the HealthCheck parameter is set to on.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/checkpreload.htm</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The number of consecutive successful health checks that must occur before an unhealthy and inaccessible backend server is declared healthy and accessible. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p> This parameter is returned only if the HealthCheck parameter is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The timeout period for idle connections. Default value: 15. Valid values: <strong>1</strong> to <strong>60</strong>. Unit: seconds.</p>
     * <blockquote>
     * <p> If no request is received within the specified timeout period, ELB closes the connection. When another request is received, CLB establishes a new connection.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>Indicates whether HTTP-to-HTTPS redirection is enabled. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("ListenerForward")
    public String listenerForward;

    /**
     * <p>The frontend port that is used by the ELB instance. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timeout period of requests. Default value: 60. Valid values: <strong>1</strong> to <strong>180</strong>. Unit: seconds.</p>
     * <blockquote>
     * <p> If no response is received from the backend server within the specified timeout period, ELB returns an HTTP 504 error code to the client.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The routing algorithm. Valid values:</p>
     * <ul>
     * <li><strong>wrr</strong>: Backend servers with higher weights receive more requests than those with lower weights.</li>
     * <li><strong>wlc</strong>: Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections to a backend server. If two backend servers have the same weight, the backend server that has fewer connections receives more requests.</li>
     * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
     * <li><strong>sch</strong>: consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</li>
     * <li><strong>qch</strong>: consistent hashing that is based on QUIC connection IDs. Requests that contain the same QUIC connection ID are distributed to the same backend server.</li>
     * <li><strong>iqch</strong>: consistent hashing that is based on specific three bytes of the iQUIC CIDs. Requests whose second to fourth bytes are the same are distributed to the same backend server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The ID of the server certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>6027667</p>
     */
    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    /**
     * <p>The status of the listener. Valid values:</p>
     * <ul>
     * <li><strong>Running</strong></li>
     * <li><strong>Stopped</strong></li>
     * <li><strong>Starting</strong></li>
     * <li><strong>Configuring</strong></li>
     * <li><strong>Stopping</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of consecutive failed health checks that must occur before a healthy and accessible backend server is declared unhealthy and inaccessible. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p> This parameter is returned only if the HealthCheck parameter is set to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static DescribeLoadBalancerHTTPSListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerHTTPSListenerAttributeResponseBody self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setForwardPort(Integer forwardPort) {
        this.forwardPort = forwardPort;
        return this;
    }
    public Integer getForwardPort() {
        return this.forwardPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setListenerForward(String listenerForward) {
        this.listenerForward = listenerForward;
        return this;
    }
    public String getListenerForward() {
        return this.listenerForward;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
