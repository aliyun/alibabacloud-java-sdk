// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerUDPListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>The port used by the backend servers. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    /**
     * <p>The peak bandwidth of the load balancer. A value of -1 indicates that no rate limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The listener name.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable EIP passthrough. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>off</strong> (default): Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("EipTransmit")
    public String eipTransmit;

    /**
     * <p>The connection timeout period. Valid values: <strong>10</strong> to <strong>900</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    /**
     * <p>Specifies whether to enable health checks. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>off</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If you do not specify this parameter, the value of <code>BackendServerPort</code> is used.</p>
     * 
     * <strong>example:</strong>
     * <p>8000</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The timeout period for a health check response. If a backend ENS instance does not respond within the specified timeout period, the health check fails.</p>
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
     * <li><p>This parameter takes effect only when <code>HealthCheck</code> is set to <code>on</code>.</p>
     * </li>
     * <li><p>If the value of <code>HealthCheckConnectTimeout</code> is less than the value of <code>HealthCheckInterval</code>, the value of <code>HealthCheckInterval</code> is used as the timeout period.</p>
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
     * <p>The response string for UDP health checks. The string can contain only letters and digits and can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthCheckExp")
    public String healthCheckExp;

    /**
     * <p>The interval between health checks. Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <code>HealthCheck</code> is set to <code>on</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The request string for UDP health checks. The string can contain only letters and digits and can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("HealthCheckReq")
    public String healthCheckReq;

    /**
     * <p>The number of consecutive successful health checks that must occur before a backend server can be declared healthy. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <code>HealthCheck</code> is set to <code>on</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The listener port.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5D7597CF-1630-54EC-A945-624A33F2E7E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <ul>
     * <li><p><strong>wrr</strong> (Weighted Round Robin): Backend servers with higher weights receive a larger proportion of requests.</p>
     * </li>
     * <li><p><strong>wlc</strong> (Weighted Least Connections): Requests are distributed based on both the weight and the current connection count of each backend server. If backend servers have the same weight, the server with the fewest connections receives more new requests.</p>
     * </li>
     * <li><p><strong>rr</strong> (Round Robin): Requests are distributed to backend servers sequentially.</p>
     * </li>
     * <li><p><strong>sch</strong> (Source IP Hash): Routes requests from the same source IP address to the same backend server by using a consistent hash of the source IP address.</p>
     * </li>
     * <li><p><strong>tch</strong> (4-tuple Hash): Routes packets from the same flow to the same backend server by using a consistent hash of the 4-tuple (source IP address, destination IP address, source port, and destination port).</p>
     * </li>
     * <li><p><strong>qch</strong> (QUIC Connection ID Hash): Uses a consistent hashing algorithm on the QUIC Connection ID to ensure that requests with the same connection ID are always routed to the same backend server.</p>
     * </li>
     * <li><p><strong>iqch</strong> (iQUIC CID Hash): Uses a consistent hashing algorithm on bytes 2, 3, and 4 of the iQUIC CID. Requests where these three bytes are the same are routed to the same backend server.</p>
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
     * <li><p><strong>Starting</strong>: The listener is starting.</p>
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
     * <p>The number of consecutive failed health checks that must occur before a backend server can be declared unhealthy. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <code>HealthCheck</code> is set to <code>on</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static DescribeLoadBalancerUDPListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerUDPListenerAttributeResponseBody self = new DescribeLoadBalancerUDPListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setEipTransmit(String eipTransmit) {
        this.eipTransmit = eipTransmit;
        return this;
    }
    public String getEipTransmit() {
        return this.eipTransmit;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setHealthCheckExp(String healthCheckExp) {
        this.healthCheckExp = healthCheckExp;
        return this;
    }
    public String getHealthCheckExp() {
        return this.healthCheckExp;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setHealthCheckReq(String healthCheckReq) {
        this.healthCheckReq = healthCheckReq;
        return this;
    }
    public String getHealthCheckReq() {
        return this.healthCheckReq;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeLoadBalancerUDPListenerAttributeResponseBody setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
