// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerUDPListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>The backend port that is used by the ELB instance. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    /**
     * <p>The maximum bandwidth of the elastic IP address (EIP).</p>
     * <br>
     * <p>*   Default value: 5.</p>
     * <p>*   Valid values: **5** to **10000**.</p>
     * <p>*   Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The description of the listener.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether EIP pass-through is enabled. Valid values:</p>
     * <br>
     * <p>*   **on**</p>
     * <p>*   **off** (default)</p>
     */
    @NameInMap("EipTransmit")
    public String eipTransmit;

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
     * <p>> </p>
     * <br>
     * <p>*   This parameter takes effect only if you set HealthCheck to on.</p>
     * <br>
     * <p>*   If the value of the HealthCheckConnectTimeout parameter is smaller than that of the HealthCheckInterval parameter, the timeout period specified by the HealthCheckConnectTimeout parameter becomes invalid and the value of the HealthCheckInterval parameter is used as the timeout period.</p>
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
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
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
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The frontend port that is used by the ELB instance.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
     * <p>The status of the listener. Valid values:</p>
     * <br>
     * <p>*   **Running**</p>
     * <p>*   **Stopped**</p>
     * <p>*   **Starting**</p>
     * <p>*   **Configuring**</p>
     * <p>*   **Stopping**</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of consecutive failed health checks that must occur before a healthy and accessible backend server is declared unhealthy and inaccessible. Valid values: **2** to **10**.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set HealthCheck to on.</p>
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
