// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerTCPListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>The port used by the backend servers. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    /**
     * <p>The peak bandwidth of the load balancer. The default value is -1, which indicates unlimited bandwidth.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The description of the listener.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether EIP passthrough is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: enable</p>
     * </li>
     * <li><p><strong>off</strong> (Default): disable</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("EipTransmit")
    public String eipTransmit;

    /**
     * <p>The connection timeout. Valid values: <strong>10</strong> to <strong>900</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    /**
     * <p>Specifies whether to enable health checks. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: enable</p>
     * </li>
     * <li><p><strong>off</strong>: disable</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If this parameter is not specified, the value of <code>BackendServerPort</code> is used.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8000</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The response timeout for a health check. If a backend ENS instance does not respond within this timeout period, the health check fails.</p>
     * <ul>
     * <li><p>Default value: 5.</p>
     * </li>
     * <li><p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
     * </li>
     * <li><p>Unit: seconds.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
     * </li>
     * <li><p>If this value is less than the <code>HealthCheckInterval</code> value, the <code>HealthCheckInterval</code> value is used as the timeout period instead.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    /**
     * <p>The domain name used for health checks.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status codes that indicate a successful health check. Valid values:</p>
     * <ul>
     * <li><p><strong>http_2xx</strong> (Default)</p>
     * </li>
     * <li><p><strong>http_3xx</strong></p>
     * </li>
     * <li><p><strong>http_4xx</strong></p>
     * </li>
     * <li><p><strong>http_5xx</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>http_2xx</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval between health checks. Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The health check type. Valid values:</p>
     * <ul>
     * <li><p><strong>tcp</strong> (Default)</p>
     * </li>
     * <li><p><strong>http</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The URI used for health checks. Length: <strong>1</strong> to <strong>80</strong> characters.</p>
     * <blockquote>
     * <ul>
     * <li><p>The URI must start with <code>/</code> but cannot consist solely of <code>/</code>.</p>
     * </li>
     * <li><p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/example/index.html</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The number of consecutive successful health checks required to change the health status of a backend server from <code>fail</code> (unhealthy) to <code>success</code> (healthy). Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The frontend port used by the load balancer instance.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The session persistence timeout.</p>
     * <ul>
     * <li><p>Default value: 0. A value of 0 indicates that session persistence is disabled.</p>
     * </li>
     * <li><p>Valid values: <strong>0</strong> to <strong>3600</strong>.</p>
     * </li>
     * <li><p>Unit: seconds.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <ul>
     * <li><p><strong>wrr</strong>: Weighted Round Robin. Backend servers with higher weights receive more requests.</p>
     * </li>
     * <li><p><strong>wlc</strong>: Weighted Least Connections. In addition to weights, the system considers the number of active connections to each backend server. If multiple backend servers have the same weight, the system selects the backend server with the fewest active connections.</p>
     * </li>
     * <li><p><strong>rr</strong>: Round Robin. The system distributes requests sequentially to the backend servers.</p>
     * </li>
     * <li><p><strong>sch</strong>: Source IP Hash. The system routes requests from the same source IP address to the same backend server.</p>
     * </li>
     * <li><p><strong>tch</strong>: 4-Tuple Hash. The system routes requests that share the same 4-tuple (source IP address, destination IP address, source port, and destination port) to the same backend server.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The status of the listener. Valid values:</p>
     * <ul>
     * <li><p><strong>Running</strong>: The listener is running.</p>
     * </li>
     * <li><p><strong>Stopped</strong>: The listener is stopped.</p>
     * </li>
     * <li><p><strong>Starting</strong>: The listener is being started.</p>
     * </li>
     * <li><p><strong>Configuring</strong>: The listener is being configured.</p>
     * </li>
     * <li><p><strong>Stopping</strong>: The listener is being stopped.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Stopped</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of consecutive failed health checks required to change the health status of a backend server from <code>success</code> (healthy) to <code>fail</code> (unhealthy). Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static DescribeLoadBalancerTCPListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerTCPListenerAttributeResponseBody self = new DescribeLoadBalancerTCPListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setEipTransmit(String eipTransmit) {
        this.eipTransmit = eipTransmit;
        return this;
    }
    public String getEipTransmit() {
        return this.eipTransmit;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeLoadBalancerTCPListenerAttributeResponseBody setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
