// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeEndpointGroupResponseBody extends TeaModel {
    /**
     * <p>The Global Accelerator instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The custom header fields to record in access logs.</p>
     */
    @NameInMap("AccessLogRecordCustomizedHeaderList")
    public java.util.List<String> accessLogRecordCustomizedHeaderList;

    /**
     * <p>Specifies whether to record custom header fields in access logs. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * <li><p><strong>false</strong> (default): No.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can set this parameter to <strong>true</strong> only when <strong>EnableAccessLog</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     */
    @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
    public Boolean accessLogRecordCustomizedHeadersEnabled;

    /**
     * <p>The status of the access log configuration. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: The access log is configured.</p>
     * </li>
     * <li><p><strong>off</strong>: The access log is not configured.</p>
     * </li>
     * <li><p><strong>binding</strong>: The access log is being configured.</p>
     * </li>
     * <li><p><strong>unbinding</strong>: The access log configuration is being removed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AccessLogSwitch")
    public String accessLogSwitch;

    /**
     * <p>The description of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether access logging is enabled.</p>
     * <ul>
     * <li><p><strong>true</strong>: Access logging is enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Access logging is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAccessLog")
    public Boolean enableAccessLog;

    /**
     * <p>The endpoint configurations.</p>
     */
    @NameInMap("EndpointConfigurations")
    public java.util.List<DescribeEndpointGroupResponseBodyEndpointConfigurations> endpointConfigurations;

    /**
     * <p>The endpoint group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp14sz7ftcwwjgrdm****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The list of active IP addresses of the endpoints in the endpoint group.</p>
     * <blockquote>
     * <p>Notice: For an endpoint group configured for back-to-source from a private network, the console displays only the private back-to-source IP addresses and not the public IP addresses. If the network connection type for the backend service of the endpoint group changes (for example, from a private network to a public network, or to a mix of private and public networks), you must monitor the changes in the back-to-source IP addresses and update the access control list (ACL) of the backend service accordingly.</p>
     * </blockquote>
     */
    @NameInMap("EndpointGroupIpList")
    public java.util.List<String> endpointGroupIpList;

    /**
     * <p>The region ID where the endpoint group is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    /**
     * <p>The type of the endpoint group. Valid values:</p>
     * <ul>
     * <li><p><strong>default</strong>: A default endpoint group.</p>
     * </li>
     * <li><p><strong>virtual</strong>: A virtual endpoint group.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("EndpointGroupType")
    public String endpointGroupType;

    /**
     * <p>A list of endpoint IP addresses pending confirmation after a Global Accelerator instance upgrade.</p>
     */
    @NameInMap("EndpointGroupUnconfirmedIpList")
    public java.util.List<String> endpointGroupUnconfirmedIpList;

    /**
     * <p>The IP version used to connect to the backend service. Valid values:</p>
     * <ul>
     * <li><p><strong>IPv4</strong> (default): Global Accelerator connects to the backend service using IPv4.</p>
     * </li>
     * <li><p><strong>IPv6</strong>: Global Accelerator connects to the backend service using IPv6.</p>
     * </li>
     * <li><p><strong>ProtocolAffinity</strong>: Global Accelerator connects to the backend service using the same IP version as the client request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("EndpointIpVersion")
    public String endpointIpVersion;

    /**
     * <p>The private IP addresses of the endpoints.</p>
     */
    @NameInMap("EndpointPrivateIpList")
    public java.util.List<DescribeEndpointGroupResponseBodyEndpointPrivateIpList> endpointPrivateIpList;

    /**
     * <p>The version of the backend service protocol. Valid values:</p>
     * <ul>
     * <li><p><strong>HTTP1.1</strong></p>
     * </li>
     * <li><p><strong>HTTP2</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP2</p>
     */
    @NameInMap("EndpointProtocolVersion")
    public String endpointProtocolVersion;

    /**
     * <p>The protocol used by the backend service. Valid values:</p>
     * <ul>
     * <li><p><strong>HTTP</strong></p>
     * </li>
     * <li><p><strong>HTTPS</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("EndpointRequestProtocol")
    public String endpointRequestProtocol;

    /**
     * <p>The IDs of the associated forwarding rules.</p>
     */
    @NameInMap("ForwardingRuleIds")
    public java.util.List<String> forwardingRuleIds;

    /**
     * <p>Indicates whether health checks are enabled.</p>
     * <ul>
     * <li><p><strong>true</strong>: Health checks are enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Health checks are disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HealthCheckEnabled")
    public Boolean healthCheckEnabled;

    /**
     * <p>The domain name used for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
     */
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    /**
     * <p>The health check interval, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthCheckIntervalSeconds")
    public Integer healthCheckIntervalSeconds;

    /**
     * <p>The path for health check probes.</p>
     * 
     * <strong>example:</strong>
     * <p>/healthcheck</p>
     */
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    /**
     * <p>The port used for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    /**
     * <p>The protocol used for health checks.</p>
     * <ul>
     * <li><p><strong>tcp</strong> or <strong>TCP</strong>: TCP</p>
     * </li>
     * <li><p><strong>http</strong> or <strong>HTTP</strong>: HTTP</p>
     * </li>
     * <li><p><strong>https</strong> or <strong>HTTPS</strong>: HTTPS</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    /**
     * <p>The listener ID.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The name of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The port mapping configuration.</p>
     */
    @NameInMap("PortOverrides")
    public java.util.List<DescribeEndpointGroupResponseBodyPortOverrides> portOverrides;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the service that manages the instance.</p>
     * <blockquote>
     * <p>This parameter is returned only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ALB</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>Indicates whether the instance is a managed instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The instance is a managed instance.</p>
     * </li>
     * <li><p><strong>false</strong>: The instance is not a managed instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>A list of management states for actions that can be performed on the instance.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is returned only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
     * </li>
     * <li><p>When an instance is managed, some operations may be restricted.</p>
     * </li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("ServiceManagedInfos")
    public java.util.List<DescribeEndpointGroupResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The name of the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-01</p>
     */
    @NameInMap("SlsLogStoreName")
    public String slsLogStoreName;

    /**
     * <p>The name of the Log Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>pn-01</p>
     */
    @NameInMap("SlsProjectName")
    public String slsProjectName;

    /**
     * <p>The region of the Log Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SlsRegion")
    public String slsRegion;

    /**
     * <p>The status of the endpoint group.</p>
     * <ul>
     * <li><p><strong>init</strong>: The endpoint group is being initialized.</p>
     * </li>
     * <li><p><strong>active</strong>: The endpoint group is active.</p>
     * </li>
     * <li><p><strong>updating</strong>: The endpoint group is being updated.</p>
     * </li>
     * <li><p><strong>deleting</strong>: The endpoint group is being deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>A list of tags attached to the endpoint group.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeEndpointGroupResponseBodyTags> tags;

    /**
     * <p>The number of consecutive failed health checks before an endpoint is marked as unhealthy.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ThresholdCount")
    public Integer thresholdCount;

    /**
     * <p>The percentage of traffic that is distributed to the endpoint group. This parameter is returned only when a listener is associated with multiple endpoint groups.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TrafficPercentage")
    public Integer trafficPercentage;

    public static DescribeEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointGroupResponseBody self = new DescribeEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointGroupResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeEndpointGroupResponseBody setAccessLogRecordCustomizedHeaderList(java.util.List<String> accessLogRecordCustomizedHeaderList) {
        this.accessLogRecordCustomizedHeaderList = accessLogRecordCustomizedHeaderList;
        return this;
    }
    public java.util.List<String> getAccessLogRecordCustomizedHeaderList() {
        return this.accessLogRecordCustomizedHeaderList;
    }

    public DescribeEndpointGroupResponseBody setAccessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
        this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
        return this;
    }
    public Boolean getAccessLogRecordCustomizedHeadersEnabled() {
        return this.accessLogRecordCustomizedHeadersEnabled;
    }

    public DescribeEndpointGroupResponseBody setAccessLogSwitch(String accessLogSwitch) {
        this.accessLogSwitch = accessLogSwitch;
        return this;
    }
    public String getAccessLogSwitch() {
        return this.accessLogSwitch;
    }

    public DescribeEndpointGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeEndpointGroupResponseBody setEnableAccessLog(Boolean enableAccessLog) {
        this.enableAccessLog = enableAccessLog;
        return this;
    }
    public Boolean getEnableAccessLog() {
        return this.enableAccessLog;
    }

    public DescribeEndpointGroupResponseBody setEndpointConfigurations(java.util.List<DescribeEndpointGroupResponseBodyEndpointConfigurations> endpointConfigurations) {
        this.endpointConfigurations = endpointConfigurations;
        return this;
    }
    public java.util.List<DescribeEndpointGroupResponseBodyEndpointConfigurations> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }

    public DescribeEndpointGroupResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public DescribeEndpointGroupResponseBody setEndpointGroupIpList(java.util.List<String> endpointGroupIpList) {
        this.endpointGroupIpList = endpointGroupIpList;
        return this;
    }
    public java.util.List<String> getEndpointGroupIpList() {
        return this.endpointGroupIpList;
    }

    public DescribeEndpointGroupResponseBody setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public DescribeEndpointGroupResponseBody setEndpointGroupType(String endpointGroupType) {
        this.endpointGroupType = endpointGroupType;
        return this;
    }
    public String getEndpointGroupType() {
        return this.endpointGroupType;
    }

    public DescribeEndpointGroupResponseBody setEndpointGroupUnconfirmedIpList(java.util.List<String> endpointGroupUnconfirmedIpList) {
        this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
        return this;
    }
    public java.util.List<String> getEndpointGroupUnconfirmedIpList() {
        return this.endpointGroupUnconfirmedIpList;
    }

    public DescribeEndpointGroupResponseBody setEndpointIpVersion(String endpointIpVersion) {
        this.endpointIpVersion = endpointIpVersion;
        return this;
    }
    public String getEndpointIpVersion() {
        return this.endpointIpVersion;
    }

    public DescribeEndpointGroupResponseBody setEndpointPrivateIpList(java.util.List<DescribeEndpointGroupResponseBodyEndpointPrivateIpList> endpointPrivateIpList) {
        this.endpointPrivateIpList = endpointPrivateIpList;
        return this;
    }
    public java.util.List<DescribeEndpointGroupResponseBodyEndpointPrivateIpList> getEndpointPrivateIpList() {
        return this.endpointPrivateIpList;
    }

    public DescribeEndpointGroupResponseBody setEndpointProtocolVersion(String endpointProtocolVersion) {
        this.endpointProtocolVersion = endpointProtocolVersion;
        return this;
    }
    public String getEndpointProtocolVersion() {
        return this.endpointProtocolVersion;
    }

    public DescribeEndpointGroupResponseBody setEndpointRequestProtocol(String endpointRequestProtocol) {
        this.endpointRequestProtocol = endpointRequestProtocol;
        return this;
    }
    public String getEndpointRequestProtocol() {
        return this.endpointRequestProtocol;
    }

    public DescribeEndpointGroupResponseBody setForwardingRuleIds(java.util.List<String> forwardingRuleIds) {
        this.forwardingRuleIds = forwardingRuleIds;
        return this;
    }
    public java.util.List<String> getForwardingRuleIds() {
        return this.forwardingRuleIds;
    }

    public DescribeEndpointGroupResponseBody setHealthCheckEnabled(Boolean healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
        return this;
    }
    public Boolean getHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    public DescribeEndpointGroupResponseBody setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public DescribeEndpointGroupResponseBody setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        return this;
    }
    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    public DescribeEndpointGroupResponseBody setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public DescribeEndpointGroupResponseBody setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public DescribeEndpointGroupResponseBody setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public DescribeEndpointGroupResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DescribeEndpointGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeEndpointGroupResponseBody setPortOverrides(java.util.List<DescribeEndpointGroupResponseBodyPortOverrides> portOverrides) {
        this.portOverrides = portOverrides;
        return this;
    }
    public java.util.List<DescribeEndpointGroupResponseBodyPortOverrides> getPortOverrides() {
        return this.portOverrides;
    }

    public DescribeEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEndpointGroupResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DescribeEndpointGroupResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeEndpointGroupResponseBody setServiceManagedInfos(java.util.List<DescribeEndpointGroupResponseBodyServiceManagedInfos> serviceManagedInfos) {
        this.serviceManagedInfos = serviceManagedInfos;
        return this;
    }
    public java.util.List<DescribeEndpointGroupResponseBodyServiceManagedInfos> getServiceManagedInfos() {
        return this.serviceManagedInfos;
    }

    public DescribeEndpointGroupResponseBody setSlsLogStoreName(String slsLogStoreName) {
        this.slsLogStoreName = slsLogStoreName;
        return this;
    }
    public String getSlsLogStoreName() {
        return this.slsLogStoreName;
    }

    public DescribeEndpointGroupResponseBody setSlsProjectName(String slsProjectName) {
        this.slsProjectName = slsProjectName;
        return this;
    }
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

    public DescribeEndpointGroupResponseBody setSlsRegion(String slsRegion) {
        this.slsRegion = slsRegion;
        return this;
    }
    public String getSlsRegion() {
        return this.slsRegion;
    }

    public DescribeEndpointGroupResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeEndpointGroupResponseBody setTags(java.util.List<DescribeEndpointGroupResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeEndpointGroupResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeEndpointGroupResponseBody setThresholdCount(Integer thresholdCount) {
        this.thresholdCount = thresholdCount;
        return this;
    }
    public Integer getThresholdCount() {
        return this.thresholdCount;
    }

    public DescribeEndpointGroupResponseBody setTrafficPercentage(Integer trafficPercentage) {
        this.trafficPercentage = trafficPercentage;
        return this;
    }
    public Integer getTrafficPercentage() {
        return this.trafficPercentage;
    }

    public static class DescribeEndpointGroupResponseBodyEndpointConfigurations extends TeaModel {
        /**
         * <p>The API keys for the endpoint configuration.</p>
         */
        @NameInMap("ApiKeys")
        public java.util.List<String> apiKeys;

        /**
         * <p>Indicates whether client IP preservation is enabled by using the automatic method.</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        /**
         * <p>Indicates whether client IP preservation is enabled using the Proxy Protocol.</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableProxyProtocol")
        public Boolean enableProxyProtocol;

        /**
         * <p>The IP address, domain name, or instance ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>120.XX.XX.21</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The port used for latency probing.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ProbePort")
        public Integer probePort;

        /**
         * <p>The protocol for latency probing. Valid values:</p>
         * <ul>
         * <li><p><strong>tcp</strong>: TCP</p>
         * </li>
         * <li><p><strong>icmp</strong>: ICMP</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("ProbeProtocol")
        public String probeProtocol;

        /**
         * <p>The provider of the endpoint configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <p>The private IP address of the elastic network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>172.168.XX.XX</p>
         */
        @NameInMap("SubAddress")
        public String subAddress;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Domain</strong>: A custom domain name.</p>
         * </li>
         * <li><p><strong>Ip</strong>: A custom IP address.</p>
         * </li>
         * <li><p><strong>IpTarget</strong>: A custom private IP address.</p>
         * </li>
         * <li><p><strong>PublicIp</strong>: An Alibaba Cloud public IP address.</p>
         * </li>
         * <li><p><strong>ECS</strong>: An ECS instance.</p>
         * </li>
         * <li><p><strong>SLB</strong>: An SLB instance.</p>
         * </li>
         * <li><p><strong>ALB</strong>: An ALB instance.</p>
         * </li>
         * <li><p><strong>OSS</strong>: An OSS instance.</p>
         * </li>
         * <li><p><strong>ENI</strong>: An elastic network interface.</p>
         * </li>
         * <li><p><strong>NLB</strong>: An NLB instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ip</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>A list of VSwitch IDs.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-hp30gtnxkfxj1l2xt****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The weight of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeEndpointGroupResponseBodyEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointGroupResponseBodyEndpointConfigurations self = new DescribeEndpointGroupResponseBodyEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setApiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setProbePort(Integer probePort) {
            this.probePort = probePort;
            return this;
        }
        public Integer getProbePort() {
            return this.probePort;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setProbeProtocol(String probeProtocol) {
            this.probeProtocol = probeProtocol;
            return this;
        }
        public String getProbeProtocol() {
            return this.probeProtocol;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setSubAddress(String subAddress) {
            this.subAddress = subAddress;
            return this;
        }
        public String getSubAddress() {
            return this.subAddress;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeEndpointGroupResponseBodyEndpointConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeEndpointGroupResponseBodyEndpointPrivateIpList extends TeaModel {
        @NameInMap("CIDR")
        public String CIDR;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.49.***</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The VSwitch ID in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>gsw-bp1rsfd2frym**</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeEndpointGroupResponseBodyEndpointPrivateIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointGroupResponseBodyEndpointPrivateIpList self = new DescribeEndpointGroupResponseBodyEndpointPrivateIpList();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointGroupResponseBodyEndpointPrivateIpList setCIDR(String CIDR) {
            this.CIDR = CIDR;
            return this;
        }
        public String getCIDR() {
            return this.CIDR;
        }

        public DescribeEndpointGroupResponseBodyEndpointPrivateIpList setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribeEndpointGroupResponseBodyEndpointPrivateIpList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeEndpointGroupResponseBodyPortOverrides extends TeaModel {
        /**
         * <p>The endpoint port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EndpointPort")
        public Integer endpointPort;

        /**
         * <p>The listener port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        public static DescribeEndpointGroupResponseBodyPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointGroupResponseBodyPortOverrides self = new DescribeEndpointGroupResponseBodyPortOverrides();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointGroupResponseBodyPortOverrides setEndpointPort(Integer endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Integer getEndpointPort() {
            return this.endpointPort;
        }

        public DescribeEndpointGroupResponseBodyPortOverrides setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class DescribeEndpointGroupResponseBodyServiceManagedInfos extends TeaModel {
        /**
         * <p>The name of the action on the managed instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Create</strong>: Create an instance.</p>
         * </li>
         * <li><p><strong>Update</strong>: Update the instance.</p>
         * </li>
         * <li><p><strong>Delete</strong>: Delete the instance.</p>
         * </li>
         * <li><p><strong>Associate</strong>: Associate the instance.</p>
         * </li>
         * <li><p><strong>UserUnmanaged</strong>: Releases the instance from service management.</p>
         * </li>
         * <li><p><strong>CreateChild</strong>: Create a child resource.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Update</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <ul>
         * <li><p><strong>Listener</strong>: A listener.</p>
         * </li>
         * <li><p><strong>IpSet</strong>: An acceleration region.</p>
         * </li>
         * <li><p><strong>EndpointGroup</strong>: An endpoint group.</p>
         * </li>
         * <li><p><strong>ForwardingRule</strong>: A forwarding rule.</p>
         * </li>
         * <li><p><strong>Endpoint</strong>: An endpoint.</p>
         * </li>
         * <li><p><strong>EndpointGroupDestination</strong>: A protocol mapping for an endpoint group of a custom routing listener.</p>
         * </li>
         * <li><p><strong>EndpointPolicy</strong>: A traffic policy for an endpoint of a custom routing listener.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only when <strong>Action</strong> is set to <strong>CreateChild</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the action is managed. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The action is managed. You cannot perform this action on the instance.</p>
         * </li>
         * <li><p><strong>false</strong>: The action is not managed. You can perform this action on the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static DescribeEndpointGroupResponseBodyServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointGroupResponseBodyServiceManagedInfos self = new DescribeEndpointGroupResponseBodyServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointGroupResponseBodyServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeEndpointGroupResponseBodyServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public DescribeEndpointGroupResponseBodyServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class DescribeEndpointGroupResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEndpointGroupResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointGroupResponseBodyTags self = new DescribeEndpointGroupResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointGroupResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEndpointGroupResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
