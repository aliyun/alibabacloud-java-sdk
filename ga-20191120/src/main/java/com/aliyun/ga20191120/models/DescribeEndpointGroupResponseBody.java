// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeEndpointGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("AccessLogRecordCustomizedHeaderList")
    public java.util.List<String> accessLogRecordCustomizedHeaderList;

    @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
    public Boolean accessLogRecordCustomizedHeadersEnabled;

    /**
     * <p>Indicates the binding status between the Simple Log Service project and the endpoint group. Valid values:</p>
     * <ul>
     * <li><strong>on:</strong> The endpoint group is bound to the Simple Log Service project.</li>
     * <li><strong>off:</strong> The endpoint group is not bound to the Simple Log Service project.</li>
     * <li><strong>binding:</strong> The endpoint group is being bound to the Simple Log Service project.</li>
     * <li><strong>unbinding:</strong> The endpoint group is being unbound from the Simple Log Service project.</li>
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
     * <p>Indicates whether the access log feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAccessLog")
    public Boolean enableAccessLog;

    /**
     * <p>The configurations of endpoints in the endpoint group.</p>
     */
    @NameInMap("EndpointConfigurations")
    public java.util.List<DescribeEndpointGroupResponseBodyEndpointConfigurations> endpointConfigurations;

    /**
     * <p>The ID of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp14sz7ftcwwjgrdm****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The active endpoint IP addresses of the endpoint group.</p>
     */
    @NameInMap("EndpointGroupIpList")
    public java.util.List<String> endpointGroupIpList;

    /**
     * <p>The ID of the region where the endpoint group is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    /**
     * <p>The type of endpoint group. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: a default endpoint group</li>
     * <li><strong>virtual</strong>: a virtual endpoint group</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("EndpointGroupType")
    public String endpointGroupType;

    /**
     * <p>The endpoint group IP addresses to be confirmed. After the GA instance is upgraded, the IP addresses that are added to the endpoint group need to be confirmed.</p>
     */
    @NameInMap("EndpointGroupUnconfirmedIpList")
    public java.util.List<String> endpointGroupUnconfirmedIpList;

    @NameInMap("EndpointIpVersion")
    public String endpointIpVersion;

    @NameInMap("EndpointPrivateIpList")
    public java.util.List<DescribeEndpointGroupResponseBodyEndpointPrivateIpList> endpointPrivateIpList;

    /**
     * <p>The version of the protocol that is used by the backend service.</p>
     * <ul>
     * <li><strong>HTTP1.1</strong></li>
     * <li><strong>HTTP2</strong></li>
     * </ul>
     */
    @NameInMap("EndpointProtocolVersion")
    public String endpointProtocolVersion;

    /**
     * <p>The protocol that is used by the backend service.</p>
     * <ul>
     * <li><strong>HTTP</strong></li>
     * <li><strong>HTTPS</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("EndpointRequestProtocol")
    public String endpointRequestProtocol;

    /**
     * <p>The ID of the forwarding rule that is associated with the endpoint group.</p>
     */
    @NameInMap("ForwardingRuleIds")
    public java.util.List<String> forwardingRuleIds;

    /**
     * <p>Indicates whether the health check feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled</li>
     * <li><strong>false</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HealthCheckEnabled")
    public Boolean healthCheckEnabled;

    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    /**
     * <p>The interval between two consecutive health checks. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthCheckIntervalSeconds")
    public Integer healthCheckIntervalSeconds;

    /**
     * <p>The path to which health check probes are sent.</p>
     * 
     * <strong>example:</strong>
     * <p>/healthcheck</p>
     */
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    /**
     * <p>The port that is used for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    /**
     * <p>The protocol over which health check requests are sent. Valid values:</p>
     * <ul>
     * <li><strong>tcp</strong> or <strong>TCP</strong></li>
     * <li><strong>http</strong> or <strong>HTTP</strong></li>
     * <li><strong>https</strong> or <strong>HTTPS</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    /**
     * <p>The ID of the listener.</p>
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
     * <p>The mappings between ports.</p>
     */
    @NameInMap("PortOverrides")
    public java.util.List<DescribeEndpointGroupResponseBodyPortOverrides> portOverrides;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the service that manages the GA instance.</p>
     * <blockquote>
     * <p> This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ALB</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>Indicates whether the instance is managed.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The actions that users can perform on the managed instance.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</li>
     * <li>Users can perform only specific actions on a managed instance.</li>
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
     * <p>The status of the endpoint group. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: The endpoint group is being initialized.</li>
     * <li><strong>active</strong>: The endpoint group is running as expected.</li>
     * <li><strong>updating</strong>: The endpoint group is being updated.</li>
     * <li><strong>deleting</strong>: The endpoint group is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The tag of the endpoint group.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeEndpointGroupResponseBodyTags> tags;

    /**
     * <p>The number of consecutive failed health checks that must occur before an endpoint is considered unhealthy.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ThresholdCount")
    public Integer thresholdCount;

    /**
     * <p>The traffic ratio of the endpoint group when the specified listener is associated with multiple endpoint groups.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
         * <p>Indicates whether the client IP address preservation feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        /**
         * <p>Indicates whether the proxy protocol is used to preserve client IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableProxyProtocol")
        public Boolean enableProxyProtocol;

        /**
         * <p>The IP address, domain name, or ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>120.XX.XX.21</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The port that is used to monitor latency.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ProbePort")
        public Integer probePort;

        /**
         * <p>The protocol that is used to monitor latency. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>icmp</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("ProbeProtocol")
        public String probeProtocol;

        /**
         * <p>The private IP address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>172.168.XX.XX</p>
         */
        @NameInMap("SubAddress")
        public String subAddress;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Domain</strong>: a custom domain name.</li>
         * <li><strong>Ip</strong>: a custom IP address.</li>
         * <li><strong>IpTarget</strong>: a custom private IP address.</li>
         * <li><strong>PublicIp</strong>: a public IP address provided by Alibaba Cloud.</li>
         * <li><strong>ECS</strong>: an Elastic Compute Service (ECS) instance.</li>
         * <li><strong>SLB</strong>: a Server Load Balancer (SLB) instance.</li>
         * <li><strong>ALB</strong> an Application Load Balancer (ALB) instance.</li>
         * <li><strong>OSS</strong>: an Object Storage Service (OSS) bucket.</li>
         * <li><strong>ENI</strong>: an elastic network interface (ENI).</li>
         * <li><strong>NLB</strong>: a Network Load Balancer (NLB) instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ip</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The IDs of vSwitches that are deployed in the VPC.</p>
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
         * <p>20</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeEndpointGroupResponseBodyEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointGroupResponseBodyEndpointConfigurations self = new DescribeEndpointGroupResponseBodyEndpointConfigurations();
            return TeaModel.build(map, self);
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

        @NameInMap("PrivateIp")
        public String privateIp;

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
         * <p>The name of the action on the managed instance.</p>
         * <ul>
         * <li><strong>Create</strong></li>
         * <li><strong>Update</strong></li>
         * <li><strong>Delete</strong></li>
         * <li><strong>Associate</strong></li>
         * <li><strong>UserUnmanaged</strong></li>
         * <li><strong>CreateChild</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Update</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource.</p>
         * <ul>
         * <li><strong>Listener:</strong> listener.</li>
         * <li><strong>IpSet:</strong> acceleration region.</li>
         * <li><strong>EndpointGroup:</strong> endpoint group.</li>
         * <li><strong>ForwardingRule:</strong> forwarding rule.</li>
         * <li><strong>Endpoint:</strong> endpoint.</li>
         * <li><strong>EndpointGroupDestination:</strong> protocol mapping of an endpoint group associated with a custom routing listener.</li>
         * <li><strong>EndpointPolicy:</strong> traffic policy of an endpoint associated with a custom routing listener.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only if the value of <strong>Action</strong> is <strong>CreateChild</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed.</p>
         * <ul>
         * <li><strong>true:</strong> The specified actions are managed. Users cannot perform the specified actions on the managed instance.****</li>
         * <li><strong>false:</strong> The specified actions are not managed. Users can perform the specified actions on the managed instance.</li>
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
         * <p>The tag key of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the endpoint group.</p>
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
