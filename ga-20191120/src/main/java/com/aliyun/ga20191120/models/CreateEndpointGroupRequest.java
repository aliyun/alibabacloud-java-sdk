// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateEndpointGroupRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token used to ensure request idempotence.</p>
     * <p>You can generate this token, but you must ensure it is unique for each request. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. Each request has a unique <strong>RequestId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the endpoint group.</p>
     * <p>The description can be up to 200 characters long and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>EndpointGroup</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and service limits. If the request fails the dry run, the system returns an error message. If the request passes the dry run, the system returns an HTTP 2xx status code.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the check, the system returns an HTTP 2xx status code and creates the endpoint group.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The endpoint configurations.</p>
     */
    @NameInMap("EndpointConfigurations")
    public java.util.List<CreateEndpointGroupRequestEndpointConfigurations> endpointConfigurations;

    /**
     * <p>The ID of the region where the endpoint group is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    /**
     * <p>The type of the endpoint group. Valid values:</p>
     * <ul>
     * <li><p><strong>default</strong> (default): a default endpoint group.</p>
     * </li>
     * <li><p><strong>virtual</strong>: a virtual endpoint group.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Before you create a virtual endpoint group for a Layer 4 listener, make sure that you have created a default endpoint group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("EndpointGroupType")
    public String endpointGroupType;

    /**
     * <p>The IP version used to communicate with the backend service. Valid values:</p>
     * <ul>
     * <li><p><strong>IPv4</strong> (default): GA uses only IPv4 to communicate with the backend service.</p>
     * </li>
     * <li><p><strong>IPv6</strong>: GA uses only IPv6 to communicate with the backend service.</p>
     * </li>
     * <li><p><strong>ProtocolAffinity</strong>: GA uses the same IP version as the client request to communicate with the backend service.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("EndpointIpVersion")
    public String endpointIpVersion;

    /**
     * <p>The version of the backend service protocol. Valid values:</p>
     * <ul>
     * <li><p><strong>HTTP1.1</strong> (default): HTTP/1.1.</p>
     * </li>
     * <li><p><strong>HTTP2</strong>: HTTP/2.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only when <code>EndpointRequestProtocol</code> is set to HTTPS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP1.1</p>
     */
    @NameInMap("EndpointProtocolVersion")
    public String endpointProtocolVersion;

    /**
     * <p>The protocol used by the backend service. Valid values:</p>
     * <ul>
     * <li><p><strong>HTTP</strong> (default)</p>
     * </li>
     * <li><p><strong>HTTPS</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is available only for endpoint groups of <strong>HTTP</strong> or <strong>HTTPS</strong> listeners.</p>
     * </li>
     * <li><p>For an <strong>HTTP</strong> listener, the backend service protocol must be <strong>HTTP</strong>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("EndpointRequestProtocol")
    public String endpointRequestProtocol;

    /**
     * <p>Specifies whether to enable health checks. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables health checks.</p>
     * </li>
     * <li><p><strong>false</strong>: disables health checks.</p>
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
     * <p>The path used for health checks.</p>
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
     * <p>The protocol used for health checks. Valid values:</p>
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
     * <p>The ID of the listener.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The name of the endpoint group.</p>
     * <p>The name must be 1 to 128 characters long, start with a letter or a Chinese character, and can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The listener-to-endpoint port mappings.</p>
     */
    @NameInMap("PortOverrides")
    public java.util.List<CreateEndpointGroupRequestPortOverrides> portOverrides;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags of the endpoint group.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateEndpointGroupRequestTag> tag;

    /**
     * <p>The number of consecutive health checks that must succeed or fail before an endpoint\&quot;s status changes between healthy and unhealthy. Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ThresholdCount")
    public Integer thresholdCount;

    /**
     * <p>The percentage of traffic distributed to the endpoint group when the listener is associated with multiple endpoint groups. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TrafficPercentage")
    public Integer trafficPercentage;

    public static CreateEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointGroupRequest self = new CreateEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateEndpointGroupRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEndpointGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEndpointGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateEndpointGroupRequest setEndpointConfigurations(java.util.List<CreateEndpointGroupRequestEndpointConfigurations> endpointConfigurations) {
        this.endpointConfigurations = endpointConfigurations;
        return this;
    }
    public java.util.List<CreateEndpointGroupRequestEndpointConfigurations> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }

    public CreateEndpointGroupRequest setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public CreateEndpointGroupRequest setEndpointGroupType(String endpointGroupType) {
        this.endpointGroupType = endpointGroupType;
        return this;
    }
    public String getEndpointGroupType() {
        return this.endpointGroupType;
    }

    public CreateEndpointGroupRequest setEndpointIpVersion(String endpointIpVersion) {
        this.endpointIpVersion = endpointIpVersion;
        return this;
    }
    public String getEndpointIpVersion() {
        return this.endpointIpVersion;
    }

    public CreateEndpointGroupRequest setEndpointProtocolVersion(String endpointProtocolVersion) {
        this.endpointProtocolVersion = endpointProtocolVersion;
        return this;
    }
    public String getEndpointProtocolVersion() {
        return this.endpointProtocolVersion;
    }

    public CreateEndpointGroupRequest setEndpointRequestProtocol(String endpointRequestProtocol) {
        this.endpointRequestProtocol = endpointRequestProtocol;
        return this;
    }
    public String getEndpointRequestProtocol() {
        return this.endpointRequestProtocol;
    }

    public CreateEndpointGroupRequest setHealthCheckEnabled(Boolean healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
        return this;
    }
    public Boolean getHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    public CreateEndpointGroupRequest setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public CreateEndpointGroupRequest setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        return this;
    }
    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    public CreateEndpointGroupRequest setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public CreateEndpointGroupRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public CreateEndpointGroupRequest setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public CreateEndpointGroupRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateEndpointGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEndpointGroupRequest setPortOverrides(java.util.List<CreateEndpointGroupRequestPortOverrides> portOverrides) {
        this.portOverrides = portOverrides;
        return this;
    }
    public java.util.List<CreateEndpointGroupRequestPortOverrides> getPortOverrides() {
        return this.portOverrides;
    }

    public CreateEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEndpointGroupRequest setTag(java.util.List<CreateEndpointGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEndpointGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateEndpointGroupRequest setThresholdCount(Integer thresholdCount) {
        this.thresholdCount = thresholdCount;
        return this;
    }
    public Integer getThresholdCount() {
        return this.thresholdCount;
    }

    public CreateEndpointGroupRequest setTrafficPercentage(Integer trafficPercentage) {
        this.trafficPercentage = trafficPercentage;
        return this;
    }
    public Integer getTrafficPercentage() {
        return this.trafficPercentage;
    }

    public static class CreateEndpointGroupRequestEndpointConfigurations extends TeaModel {
        /**
         * <p>The API keys for the AI service.</p>
         */
        @NameInMap("ApiKeys")
        public java.util.List<String> apiKeys;

        /**
         * <p>Specifies whether to preserve client source IP addresses. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: preserves client source IP addresses.</p>
         * </li>
         * <li><p><strong>false</strong> (default): does not preserve client source IP addresses.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>By default, this feature is disabled for endpoint groups that are associated with TCP or UDP listeners. You can enable this feature based on your business requirements.</p>
         * </li>
         * <li><p>By default, this feature is enabled for endpoint groups that are associated with HTTP or HTTPS listeners. The source IP address is retrieved from the X-Forwarded-For header field. This feature cannot be disabled.</p>
         * </li>
         * <li><p><code>EnableClientIPPreservation</code> and <code>EnableProxyProtocol</code> cannot both be set to <code>true</code>.</p>
         * </li>
         * <li><p>For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">Preserve client source IP addresses</a>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        /**
         * <p>Specifies whether to use the PROXY protocol to preserve client source IP addresses. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: uses the PROXY protocol.</p>
         * </li>
         * <li><p><strong>false</strong> (default): does not use the PROXY protocol.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>This parameter can be configured only for endpoint groups that are associated with TCP listeners.</p>
         * </li>
         * <li><p><code>EnableClientIPPreservation</code> and <code>EnableProxyProtocol</code> cannot both be set to <code>true</code>.</p>
         * </li>
         * <li><p>For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">Preserve client source IP addresses</a>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableProxyProtocol")
        public Boolean enableProxyProtocol;

        /**
         * <p>The IP address, domain name, or resource ID of the endpoint. The value of this parameter depends on the value of the <code>Type</code> parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120.1.XX.XX</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The AI service provider. Set this to <code>BAILIAN</code> to use Alibaba Cloud Model Studio.</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <p>The private IP address of the ENI.</p>
         * <blockquote>
         * <p>This parameter applies only when the endpoint type is set to <strong>ENI</strong>. If you omit this parameter, the primary private IP address of the ENI is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.168.X.X</p>
         */
        @NameInMap("SubAddress")
        public String subAddress;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Domain</strong>: a custom domain name.</p>
         * </li>
         * <li><p><strong>Ip</strong>: a custom IP address.</p>
         * </li>
         * <li><p><strong>IpTarget</strong>: a custom private IP address.</p>
         * </li>
         * <li><p><strong>PublicIp</strong>: an Alibaba Cloud public IP address.</p>
         * </li>
         * <li><p><strong>ECS</strong>: an Elastic Compute Service (ECS) instance.</p>
         * </li>
         * <li><p><strong>SLB</strong>: a Server Load Balancer (SLB) instance.</p>
         * </li>
         * <li><p><strong>ALB</strong>: an Application Load Balancer (ALB) instance.</p>
         * </li>
         * <li><p><strong>OSS</strong>: an Object Storage Service (OSS) bucket.</p>
         * </li>
         * <li><p><strong>ENI</strong>: an elastic network interface (ENI).</p>
         * </li>
         * <li><p><strong>NLB</strong>: a Network Load Balancer (NLB) instance.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>If you set the endpoint type to <strong>ECS</strong>, <strong>ENI</strong>, <strong>SLB</strong>, <strong>ALB</strong>, <strong>NLB</strong>, or <strong>IpTarget</strong>, the system automatically creates a service-linked role named AliyunServiceRoleForGaVpcEndpoint if the role does not exist.</p>
         * </li>
         * <li><p>If you set the endpoint type to <strong>ALB</strong>, the system automatically creates a service-linked role named AliyunServiceRoleForGaAlb if the role does not exist.</p>
         * </li>
         * <li><p>If you set the endpoint type to <strong>OSS</strong>, the system automatically creates a service-linked role named AliyunServiceRoleForGaOss if the role does not exist.</p>
         * </li>
         * <li><p>If you set the endpoint type to <strong>NLB</strong>, the system automatically creates a service-linked role named AliyunServiceRoleForGaNlb if the role does not exist.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178360.html">Service-linked roles</a>.</p>
         * </blockquote>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ip</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>A list of vSwitches in the VPC.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the Virtual Private Cloud (VPC).</p>
         * <p>You can specify at most one VPC ID for an endpoint group of an intelligent routing listener.</p>
         * <blockquote>
         * <p>This parameter is required only when the endpoint type is set to <strong>IpTarget</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1quce3451z5b2hv****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The weight of the endpoint.</p>
         * <p>Valid values: <strong>0</strong> to <strong>255</strong>.</p>
         * <blockquote>
         * <p>If you set the weight of an endpoint to 0, GA stops distributing traffic to it. Proceed with caution.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateEndpointGroupRequestEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupRequestEndpointConfigurations self = new CreateEndpointGroupRequestEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupRequestEndpointConfigurations setApiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setSubAddress(String subAddress) {
            this.subAddress = subAddress;
            return this;
        }
        public String getSubAddress() {
            return this.subAddress;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateEndpointGroupRequestEndpointConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateEndpointGroupRequestPortOverrides extends TeaModel {
        /**
         * <p>The endpoint port for the port mapping.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EndpointPort")
        public Integer endpointPort;

        /**
         * <p>The listener port for the port mapping.</p>
         * <blockquote>
         * <ul>
         * <li><p>For TCP listeners, you cannot configure port mappings for virtual endpoint groups. If a listener is associated with a virtual endpoint group, you cannot configure port mappings for the default endpoint group. If a default endpoint group has port mappings configured, you cannot add a virtual endpoint group.</p>
         * </li>
         * <li><p>After you configure port mappings, you cannot change the listener protocol, except for switching between HTTP and HTTPS.</p>
         * </li>
         * <li><p>When you modify the listener port range, the new range must include all listener ports used in port mappings. For example, if the listener port range is 80-82 and the listener ports are mapped to endpoint ports 100-102, you cannot change the listener port range to 80-81.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        public static CreateEndpointGroupRequestPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupRequestPortOverrides self = new CreateEndpointGroupRequestPortOverrides();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupRequestPortOverrides setEndpointPort(Integer endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Integer getEndpointPort() {
            return this.endpointPort;
        }

        public CreateEndpointGroupRequestPortOverrides setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class CreateEndpointGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters long and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters long and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>test-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEndpointGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupRequestTag self = new CreateEndpointGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEndpointGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
