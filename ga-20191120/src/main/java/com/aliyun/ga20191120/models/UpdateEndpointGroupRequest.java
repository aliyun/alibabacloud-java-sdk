// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupRequest extends TeaModel {
    /**
     * <p>A client-generated token to ensure the idempotence of the request.</p>
     * <p>The token must be unique across requests and can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> is unique for each API request.</p>
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
     * <p>The configurations of the endpoints.</p>
     */
    @NameInMap("EndpointConfigurations")
    public java.util.List<UpdateEndpointGroupRequestEndpointConfigurations> endpointConfigurations;

    /**
     * <p>The ID of the endpoint group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1dmlohjjz4kqaun****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

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
     * <p>Specifies the IP protocol that GA uses to communicate with endpoints. Valid values: ● <strong>IPv4</strong> (default): Use IPv4. ● <strong>IPv6</strong>: Use IPv6. ● <strong>ProtocolAffinity</strong>: Use the same IP protocol as the client request.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("EndpointIpVersion")
    public String endpointIpVersion;

    /**
     * <p>The version of the backend service protocol. Valid values:</p>
     * <ul>
     * <li><p><strong>HTTP1.1</strong></p>
     * </li>
     * <li><p><strong>HTTP2</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can configure this parameter only when <code>EndpointRequestProtocol</code> is set to HTTPS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP1.1</p>
     */
    @NameInMap("EndpointProtocolVersion")
    public String endpointProtocolVersion;

    /**
     * <p>The backend service protocol. Valid values:</p>
     * <ul>
     * <li><p><strong>HTTP</strong></p>
     * </li>
     * <li><p><strong>HTTPS</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>You can configure this parameter only for endpoint groups of HTTP or HTTPS listeners.</p>
     * </li>
     * <li><p>For an HTTP listener, the backend service protocol must be HTTP.</p>
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
     * <li><p><strong>true</strong>: Enables health checks.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Disables health checks.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HealthCheckEnabled")
    public Boolean healthCheckEnabled;

    /**
     * <p>The domain name for the health check.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
     */
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    /**
     * <p>The interval between health checks, in seconds. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthCheckIntervalSeconds")
    public Integer healthCheckIntervalSeconds;

    /**
     * <p>The path for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>/healthcheck</p>
     */
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    /**
     * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    /**
     * <p>The protocol for health checks. Valid values:</p>
     * <ul>
     * <li><p><strong>tcp</strong> or <strong>TCP</strong></p>
     * </li>
     * <li><p><strong>http</strong> or <strong>HTTP</strong></p>
     * </li>
     * <li><p><strong>https</strong> or <strong>HTTPS</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTPS</p>
     */
    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

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
     * <p>The port override settings.</p>
     */
    @NameInMap("PortOverrides")
    public java.util.List<UpdateEndpointGroupRequestPortOverrides> portOverrides;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of consecutive successful or failed health checks required to change an endpoint\&quot;s health status.</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ThresholdCount")
    public Integer thresholdCount;

    /**
     * <p>The weight of the endpoint group when the listener is associated with multiple endpoint groups.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TrafficPercentage")
    public Integer trafficPercentage;

    public static UpdateEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupRequest self = new UpdateEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEndpointGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEndpointGroupRequest setEndpointConfigurations(java.util.List<UpdateEndpointGroupRequestEndpointConfigurations> endpointConfigurations) {
        this.endpointConfigurations = endpointConfigurations;
        return this;
    }
    public java.util.List<UpdateEndpointGroupRequestEndpointConfigurations> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }

    public UpdateEndpointGroupRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public UpdateEndpointGroupRequest setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public UpdateEndpointGroupRequest setEndpointIpVersion(String endpointIpVersion) {
        this.endpointIpVersion = endpointIpVersion;
        return this;
    }
    public String getEndpointIpVersion() {
        return this.endpointIpVersion;
    }

    public UpdateEndpointGroupRequest setEndpointProtocolVersion(String endpointProtocolVersion) {
        this.endpointProtocolVersion = endpointProtocolVersion;
        return this;
    }
    public String getEndpointProtocolVersion() {
        return this.endpointProtocolVersion;
    }

    public UpdateEndpointGroupRequest setEndpointRequestProtocol(String endpointRequestProtocol) {
        this.endpointRequestProtocol = endpointRequestProtocol;
        return this;
    }
    public String getEndpointRequestProtocol() {
        return this.endpointRequestProtocol;
    }

    public UpdateEndpointGroupRequest setHealthCheckEnabled(Boolean healthCheckEnabled) {
        this.healthCheckEnabled = healthCheckEnabled;
        return this;
    }
    public Boolean getHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    public UpdateEndpointGroupRequest setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public UpdateEndpointGroupRequest setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        return this;
    }
    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    public UpdateEndpointGroupRequest setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public UpdateEndpointGroupRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public UpdateEndpointGroupRequest setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public UpdateEndpointGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEndpointGroupRequest setPortOverrides(java.util.List<UpdateEndpointGroupRequestPortOverrides> portOverrides) {
        this.portOverrides = portOverrides;
        return this;
    }
    public java.util.List<UpdateEndpointGroupRequestPortOverrides> getPortOverrides() {
        return this.portOverrides;
    }

    public UpdateEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateEndpointGroupRequest setThresholdCount(Integer thresholdCount) {
        this.thresholdCount = thresholdCount;
        return this;
    }
    public Integer getThresholdCount() {
        return this.thresholdCount;
    }

    public UpdateEndpointGroupRequest setTrafficPercentage(Integer trafficPercentage) {
        this.trafficPercentage = trafficPercentage;
        return this;
    }
    public Integer getTrafficPercentage() {
        return this.trafficPercentage;
    }

    public static class UpdateEndpointGroupRequestEndpointConfigurations extends TeaModel {
        @NameInMap("ApiKeys")
        public java.util.List<String> apiKeys;

        /**
         * <p>Specifies whether to preserve client source IP addresses. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Preserves client source IP addresses.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Does not preserve client source IP addresses.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>For endpoint groups of TCP or UDP listeners, this feature is disabled by default but can be enabled if needed.</p>
         * </li>
         * <li><p>For endpoint groups of HTTP or HTTPS listeners, client source IP addresses are preserved by default. The client IP addresses are retrieved from the X-Forwarded-For header. You cannot disable this feature.</p>
         * </li>
         * <li><p>You cannot set both <code>EnableClientIPPreservation</code> and <code>EnableProxyProtocol</code> to <code>true</code>.</p>
         * </li>
         * <li><p>For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">preserve client source IP addresses</a>.</p>
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
         * <p>Specifies whether to use the Proxy Protocol to preserve client source IP addresses. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Preserves client source IP addresses.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Does not preserve client source IP addresses.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>You can configure this parameter only for endpoint groups of TCP listeners.</p>
         * </li>
         * <li><p>You cannot set both <code>EnableClientIPPreservation</code> and <code>EnableProxyProtocol</code> to <code>true</code>.</p>
         * </li>
         * <li><p>For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">preserve client source IP addresses</a>.</p>
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
         * <p>Enter an IP address, a domain name, or an instance ID based on the value of the <code>Type</code> parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120.XX.XX.21</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <p>The private IP address of the elastic network interface.</p>
         * <blockquote>
         * <p>If the endpoint type is <strong>ENI</strong>, you can specify this parameter. If you omit this parameter, the primary private IP address of the ENI is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.168.XX.XX</p>
         */
        @NameInMap("SubAddress")
        public String subAddress;

        /**
         * <p>The type of endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Domain</strong>: a custom domain name.</p>
         * </li>
         * <li><p><strong>Ip</strong>: a custom IP address.</p>
         * </li>
         * <li><p><strong>IpTarget</strong>: a custom private IP address.</p>
         * </li>
         * <li><p><strong>PublicIp</strong>: an Alibaba Cloud public IP address.</p>
         * </li>
         * <li><p><strong>ECS</strong>: an ECS instance.</p>
         * </li>
         * <li><p><strong>SLB</strong>: an SLB instance.</p>
         * </li>
         * <li><p><strong>ALB</strong>: an ALB instance.</p>
         * </li>
         * <li><p><strong>OSS</strong>: an OSS instance.</p>
         * </li>
         * <li><p><strong>ENI</strong>: an elastic network interface.</p>
         * </li>
         * <li><p><strong>NLB</strong>: an NLB instance.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>If the endpoint type is <strong>ECS</strong>, <strong>ENI</strong>, <strong>SLB</strong>, or <strong>IpTarget</strong>, and the service-linked role does not exist, the system automatically creates a service-linked role named AliyunServiceRoleForGaVpcEndpoint.</p>
         * </li>
         * <li><p>If the endpoint type is <strong>ALB</strong>, and the service-linked role does not exist, the system automatically creates a service-linked role named AliyunServiceRoleForGaAlb.</p>
         * </li>
         * <li><p>If the endpoint type is <strong>OSS</strong>, and the service-linked role does not exist, the system automatically creates a service-linked role named AliyunServiceRoleForGaOss.</p>
         * </li>
         * <li><p>If the endpoint type is <strong>NLB</strong>, and the service-linked role does not exist, the system automatically creates a service-linked role named AliyunServiceRoleForGaNlb.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178360.html">service-linked roles</a>.</p>
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
         * <p>The ID of the VPC.</p>
         * <p>You can specify at most one VPC ID for an endpoint group that is associated with an intelligent routing listener.</p>
         * <blockquote>
         * <p>This parameter is required only when the endpoint type is <strong>IpTarget</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zen6t0u7xhm0k5iz****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The weight of the endpoint.</p>
         * <p>Valid values: <strong>0</strong> to <strong>255</strong>.</p>
         * <blockquote>
         * <p>If you set the weight of an endpoint to 0, Global Accelerator stops distributing traffic to the endpoint. Proceed with caution.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static UpdateEndpointGroupRequestEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupRequestEndpointConfigurations self = new UpdateEndpointGroupRequestEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setApiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setSubAddress(String subAddress) {
            this.subAddress = subAddress;
            return this;
        }
        public String getSubAddress() {
            return this.subAddress;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public UpdateEndpointGroupRequestEndpointConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateEndpointGroupRequestPortOverrides extends TeaModel {
        /**
         * <p>The endpoint port in the port override settings.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EndpointPort")
        public Integer endpointPort;

        /**
         * <p>The listener port in the port override settings.</p>
         * <blockquote>
         * <ul>
         * <li><p>For TCP listeners, virtual endpoint groups do not support port overrides. If a listener is already associated with a virtual endpoint group, you cannot configure port overrides for the default endpoint group. If the default endpoint group has port overrides configured, you cannot add a virtual endpoint group.</p>
         * </li>
         * <li><p>After you configure port overrides, you can change the listener protocol only between HTTP and HTTPS.</p>
         * </li>
         * <li><p>The updated listener port range must include all listener ports in the configured port overrides. For example, if the listener port range is 80-82 and port overrides are configured to map the ports to endpoint ports 100-102, you cannot update the listener port range to 80-81.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        public static UpdateEndpointGroupRequestPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupRequestPortOverrides self = new UpdateEndpointGroupRequestPortOverrides();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointGroupRequestPortOverrides setEndpointPort(Integer endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Integer getEndpointPort() {
            return this.endpointPort;
        }

        public UpdateEndpointGroupRequestPortOverrides setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

    }

}
