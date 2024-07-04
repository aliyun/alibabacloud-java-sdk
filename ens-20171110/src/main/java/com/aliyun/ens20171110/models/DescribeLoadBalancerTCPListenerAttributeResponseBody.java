// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerTCPListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>The backend port that is used by the ELB instance. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    /**
     * <p>The maximum bandwidth of the elastic IP address (EIP). Default value: 5. Valid values: <strong>5</strong> to <strong>10000</strong>. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
     * <p>Indicates whether EIP pass-through is enabled. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("EipTransmit")
    public String eipTransmit;

    /**
     * <p>The timeout period of a connection. Valid values: <strong>10</strong> to <strong>900</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

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
     * <p> This parameter is returned only if you set HealthCheck to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8000</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

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
     * <li><p>This parameter is returned only if you set HealthCheck to on.</p>
     * </li>
     * <li><p>If the value of the HealthCheckConnectTimeout parameter is smaller than that of the HealthCheckInterval parameter, the timeout period specified by the HealthCheckConnectTimeout parameter becomes invalid and the value of the HealthCheckInterval parameter is used as the timeout period.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    /**
     * <p>The domain name that is used for health checks.</p>
     * <blockquote>
     * <p> This parameter is returned only if you set HealthCheck to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status codes for a successful health check. Valid values:</p>
     * <ul>
     * <li><strong>http_2xx</strong> (default)</li>
     * <li><strong>http_3xx</strong></li>
     * <li><strong>http_4xx</strong></li>
     * <li><strong>http_5xx</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is returned only if you set HealthCheck to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>http_2xx</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval at which health checks are performed. Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The type of health checks. Valid values:</p>
     * <ul>
     * <li><strong>tcp</strong> (default)</li>
     * <li><strong>http</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The Uniform Resource Identifier (URI) that is used for health checks. The URI must be <strong>1</strong> to <strong>80</strong> characters in length.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The URL must start with a forward slash (<code>/</code>) and contain characters other than forward slashes (<code>/</code>).</p>
     * </li>
     * <li><p>This parameter is returned only if you set HealthCheck to on.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/example/index.html</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The number of consecutive successful health checks that must occur before an unhealthy and inaccessible backend server is declared healthy and accessible. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p> This parameter is returned only if you set HealthCheck to on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The frontend port that is used by the ELB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The timeout period of session persistence.</p>
     * <ul>
     * <li>Default value: 0. If the default value is used, the system disables session persistence.</li>
     * <li>Valid values: <strong>0</strong> to <strong>3600</strong>.</li>
     * <li>Unit: seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
     * <p>Stopped</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of consecutive failed health checks that must occur before a healthy and accessible backend server is declared unhealthy and inaccessible. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <blockquote>
     * <p> This parameter is returned only if you set HealthCheck to on.</p>
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
