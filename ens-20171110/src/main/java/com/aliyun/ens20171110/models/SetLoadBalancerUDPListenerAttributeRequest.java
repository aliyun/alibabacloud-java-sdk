// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerUDPListenerAttributeRequest extends TeaModel {
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
     * <p>The response string for UDP listener health checks. The string can be up to 64 characters in length and can contain only letters and digits.</p>
     */
    @NameInMap("HealthCheckExp")
    public String healthCheckExp;

    /**
     * <p>The interval at which health checks are performed. Valid values: **1** to **50**. Unit: seconds.</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The request string for UDP listener health checks. The string can be up to 64 characters in length and can contain only letters and digits.</p>
     */
    @NameInMap("HealthCheckReq")
    public String healthCheckReq;

    /**
     * <p>The number of consecutive successful health checks that must occur before an unhealthy and inaccessible backend server is declared healthy and accessible. Valid values: **2** to **10**.</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

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
     * <p>The routing algorithm. Valid values:</p>
     * <br>
     * <p>*   **wrr**: Backend servers with higher weights receive more requests than those with lower weights.</p>
     * <p>*   **wlc**: Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections on a backend server. If two backend servers have the same weight, the backend server that has fewer connections receives more requests.</p>
     * <p>*   **rr**: Requests are distributed to backend servers in sequence.</p>
     * <p>*   **sch**: consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</p>
     * <p>*   **qch**: consistent hashing that is based on QUIC connection IDs. Requests that contain the same QUIC connection ID are distributed to the same backend server.</p>
     * <p>*   **iqch**: consistent hashing that is based on specific three bytes of the iQUIC CIDs. Requests whose second to fourth bytes are the same are distributed to the same backend server.</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The number of consecutive failed health checks that must occur before a healthy and accessible backend server is declared unhealthy and inaccessible. Valid values: **2** to **10**.</p>
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
