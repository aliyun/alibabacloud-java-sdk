// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerUDPListenerAttributeRequest extends TeaModel {
    /**
     * <p>The name of the listener. The name must be <strong>1</strong> to <strong>80</strong> characters long.</p>
     * <blockquote>
     * <p>The name cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable EIP passthrough. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enables EIP passthrough.</p>
     * </li>
     * <li><p><strong>off</strong> (default): Disables EIP passthrough.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("EipTransmit")
    public String eipTransmit;

    /**
     * <p>The timeout for established connections, in seconds. The value must be an integer from <strong>10</strong> to <strong>900</strong>. The default value is <strong>900</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    /**
     * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. Defaults to the backend server port (<code>BackendServerPort</code>) if not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The timeout for a health check response. If a backend ENS instance does not respond within this timeout period, the health check fails.</p>
     * <ul>
     * <li><p>Default value: 5</p>
     * </li>
     * <li><p>Valid values: <strong>1</strong> to <strong>300</strong></p>
     * </li>
     * <li><p>Unit: seconds</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the value of <code>HealthCheckConnectTimeout</code> is less than the value of <code>HealthCheckInterval</code>, the system ignores <code>HealthCheckConnectTimeout</code> and uses the value of <code>HealthCheckInterval</code> as the timeout period.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    /**
     * <p>The expected response string for a UDP listener health check. The string can contain only letters and digits and must be at most 64 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthCheckExp")
    public String healthCheckExp;

    /**
     * <p>The interval, in seconds, between consecutive health checks. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The request string for a UDP listener health check. The string can contain only letters and digits and must be at most 64 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("HealthCheckReq")
    public String healthCheckReq;

    /**
     * <p>The number of consecutive successful health checks required to mark an unhealthy backend server as healthy. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The listener port to modify. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the load balancer instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5pzipr2fszqtl2xf64uy5****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <ul>
     * <li><p><strong>wrr</strong>: Weighted Round Robin. Backend servers with higher weights receive a larger proportion of requests.</p>
     * </li>
     * <li><p><strong>wlc</strong>: Weighted Least Connections. Requests are distributed based on both the weights and the number of active connections of backend servers. If servers have the same weight, the server with the fewest active connections receives more requests.</p>
     * </li>
     * <li><p><strong>rr</strong>: Round Robin. Requests are distributed to backend servers in sequence.</p>
     * </li>
     * <li><p><strong>sch</strong>: Source IP Hash. A consistent hash based on the source IP address. Requests from the same source IP address are routed to the same backend server.</p>
     * </li>
     * <li><p><strong>tch</strong>: 4-Tuple Hash. A consistent hash based on the 4-tuple (source IP, destination IP, source port, and destination port). Flows with the same 4-tuple are routed to the same backend server.</p>
     * </li>
     * <li><p><strong>qch</strong>: QUIC Connection ID Hash. A consistent hash based on the QUIC Connection ID. Requests with the same QUIC Connection ID are routed to the same backend server.</p>
     * </li>
     * <li><p><strong>iqch</strong>: iQUIC CID Hash. A consistent hash based on three specific bytes (from the second to the fourth byte) of the iQUIC CID. Requests with identical values in these three bytes are routed to the same backend server.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The number of consecutive failed health checks required to mark a healthy backend server as unhealthy. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static SetLoadBalancerUDPListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerUDPListenerAttributeRequest self = new SetLoadBalancerUDPListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerUDPListenerAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setEipTransmit(String eipTransmit) {
        this.eipTransmit = eipTransmit;
        return this;
    }
    public String getEipTransmit() {
        return this.eipTransmit;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthCheckExp(String healthCheckExp) {
        this.healthCheckExp = healthCheckExp;
        return this;
    }
    public String getHealthCheckExp() {
        return this.healthCheckExp;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthCheckReq(String healthCheckReq) {
        this.healthCheckReq = healthCheckReq;
        return this;
    }
    public String getHealthCheckReq() {
        return this.healthCheckReq;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public SetLoadBalancerUDPListenerAttributeRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
