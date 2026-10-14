// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerUDPListenerRequest extends TeaModel {
    /**
     * <p>The port used by the backend servers. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

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
     * <p>Specifies whether EIP pass-through is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enables EIP pass-through.</p>
     * </li>
     * <li><p><strong>off</strong> (default): Disables EIP pass-through.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("EipTransmit")
    public String eipTransmit;

    /**
     * <p>The timeout for established connections. Valid values: <strong>10</strong> to <strong>900</strong>. Default value: <strong>900</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    /**
     * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If you do not specify this parameter, the port specified by <code>BackendServerPort</code> is used.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The maximum time to wait for a response to a health check. A health check fails if a backend ENS instance does not respond within this time.</p>
     * <ul>
     * <li><p>Default value: 5.</p>
     * </li>
     * <li><p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
     * </li>
     * <li><p>Unit: seconds.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this timeout is shorter than the health check interval (<code>HealthCheckInterval</code>), the interval value is used for the timeout instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    /**
     * <p>The expected response string for UDP health checks. The string must be up to 64 characters long and contain only letters and digits.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthCheckExp")
    public String healthCheckExp;

    /**
     * <p>The interval between health checks, in seconds. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>2</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The request string for UDP health checks. The string must be up to 64 characters long and contain only letters and digits.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("HealthCheckReq")
    public String healthCheckReq;

    /**
     * <p>The number of consecutive successful health checks required for a backend server to be considered healthy. Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The listener port used to receive requests and forward them to backend servers. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <blockquote>
     * <p>For UDP listeners, ports 250, 4789, and 4790 are system-reserved and not available for use.</p>
     * </blockquote>
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
     * <p>lb-5q73cv04zeyh43lh74lp4****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <ul>
     * <li><p><strong>wrr</strong> (default): Weighted Round Robin. Backend servers with a higher weight receive more requests.</p>
     * </li>
     * <li><p><strong>wlc</strong>: Weighted Least Connections. Requests are distributed based on both the weight and the number of current connections of each backend server. If multiple backend servers have the same weight, the one with the fewest active connections receives the next request.</p>
     * </li>
     * <li><p><strong>rr</strong>: Round Robin. Requests are distributed to backend servers sequentially.</p>
     * </li>
     * <li><p><strong>sch</strong>: Source IP Hash. Requests from the same source IP address are routed to the same backend server.</p>
     * </li>
     * <li><p><strong>tch</strong>: Four-tuple Hash. Requests are routed to backend servers based on a hash of four values: source IP address, destination IP address, source port, and destination port. Flows with the same four values are routed to the same backend server.</p>
     * </li>
     * <li><p><strong>qch</strong>: QUIC Connection ID Hash. Requests with the same QUIC Connection ID are routed to the same backend server.</p>
     * </li>
     * <li><p><strong>iqch</strong>: A consistent hash algorithm for iQUIC Connection IDs. Flows with the same second, third, and fourth bytes in the iQUIC CID are routed to the same backend server.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The number of consecutive failed health checks required for a backend server to be considered unhealthy. Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static CreateLoadBalancerUDPListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerUDPListenerRequest self = new CreateLoadBalancerUDPListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerUDPListenerRequest setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public CreateLoadBalancerUDPListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLoadBalancerUDPListenerRequest setEipTransmit(String eipTransmit) {
        this.eipTransmit = eipTransmit;
        return this;
    }
    public String getEipTransmit() {
        return this.eipTransmit;
    }

    public CreateLoadBalancerUDPListenerRequest setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckExp(String healthCheckExp) {
        this.healthCheckExp = healthCheckExp;
        return this;
    }
    public String getHealthCheckExp() {
        return this.healthCheckExp;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckReq(String healthCheckReq) {
        this.healthCheckReq = healthCheckReq;
        return this;
    }
    public String getHealthCheckReq() {
        return this.healthCheckReq;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public CreateLoadBalancerUDPListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateLoadBalancerUDPListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadBalancerUDPListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateLoadBalancerUDPListenerRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
