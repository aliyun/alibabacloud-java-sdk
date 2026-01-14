// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the endpoint group.</p>
     * <p>The description can be up to 200 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>EndpointGroup</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configurations of the endpoints in the endpoint group.</p>
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
     * <p>The ID of the region where the endpoint group is created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    @NameInMap("EndpointIpVersion")
    public String endpointIpVersion;

    /**
     * <p>The protocol version that is used by the backend service. Valid values:</p>
     * <ul>
     * <li><strong>HTTP1.1</strong></li>
     * <li><strong>HTTP2</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only when you set EndpointRequestProtocol to HTTPS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP1.1</p>
     */
    @NameInMap("EndpointProtocolVersion")
    public String endpointProtocolVersion;

    /**
     * <p>The protocol that is used by the backend service. Valid values:</p>
     * <ul>
     * <li><strong>HTTP</strong></li>
     * <li><strong>HTTPS</strong></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can set this parameter only when the listener that is associated with the endpoint group uses the HTTP or HTTPS protocol.</li>
     * <li>For an HTTP listener, the backend service protocol must be HTTP.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("EndpointRequestProtocol")
    public String endpointRequestProtocol;

    /**
     * <p>Specifies whether to enable the health check feature. Valid values: Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The health check feature is enabled.</li>
     * <li><strong>false</strong> (default)</li>
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
     * <p>The interval between two consecutive health checks. Unit: seconds. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthCheckIntervalSeconds")
    public Integer healthCheckIntervalSeconds;

    /**
     * <p>The path to which health check requests are sent.</p>
     * 
     * <strong>example:</strong>
     * <p>/healthcheck</p>
     */
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    /**
     * <p>The port that is used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    /**
     * <p>The protocol over which to send health check requests. Valid values:</p>
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
     * <p>The name of the endpoint group.</p>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The port mapping.</p>
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
     * <p>The number of consecutive health check failures that must occur before a healthy endpoint group is considered unhealthy, or the number of consecutive health check successes that must occur before an unhealthy endpoint group is considered healthy.</p>
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
        /**
         * <p>Specifies whether to automatically preserve client IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>By default, client IP address preservation is disabled for an endpoint group of a UDP or TCP listener. You can configure this parameter based on your business requirements.</li>
         * <li>By default, client IP address preservation is enabled for an endpoint group of an HTTP or HTTP listener. You can obtain client IP addresses by using the X-Forwarded-For header. You cannot disable the feature.</li>
         * <li>EnableClientIPPreservation and EnableProxyProtocol cannot be set to true at the same time.<blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">Preserve client IP addresses</a>.</p>
         * </blockquote>
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
         * <p>Specifies whether to use the proxy protocol to preserve client IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is available only to endpoint groups of TCP listeners.</li>
         * <li>EnableClientIPPreservation and EnableProxyProtocol cannot be set to true at the same time.<blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">Preserve client IP addresses</a>.</p>
         * </blockquote>
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
         * <p>Enter the IP address, domain name, or instance ID based on the value of the Type parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120.XX.XX.21</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The private IP address of the ENI.</p>
         * <blockquote>
         * <p> This parameter is available only when you set the endpoint type to <strong>ENI</strong>. If you leave this parameter empty, the primary private IP address of the ENI is used.</p>
         * </blockquote>
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
         * <li><strong>ALB</strong>: an Application Load Balancer (ALB) instance.</li>
         * <li><strong>OSS</strong>: an Object Storage Service (OSS) bucket.</li>
         * <li><strong>ENI</strong>: an elastic network interface (ENI).</li>
         * <li><strong>NLB</strong>: a Network Load Balancer (NLB) instance.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you set this parameter to <strong>ECS</strong>, <strong>ENI</strong>, <strong>SLB</strong>, <strong>ALB</strong>, <strong>NLB</strong>, or <strong>IpTarget</strong>, and the AliyunServiceRoleForGaVpcEndpoint service-linked role does not exist, the system automatically creates the role.</li>
         * <li>If you set this parameter to <strong>ALB</strong> and the AliyunServiceRoleForGaAlb service-linked role does not exist, the system automatically creates the role.</li>
         * <li>If you set this parameter to <strong>OSS</strong> and the AliyunServiceRoleForGaOss service-linked role does not exist, the system automatically creates the role.</li>
         * <li>If you set this parameter to <strong>NLB</strong> and the AliyunServiceRoleForGaNlb service-linked role does not exist, the system automatically creates the role.<blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178360.html">Service-linked roles</a>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The virtual private cloud (VPC) ID.</p>
         * <p>You can specify one VPC ID for an endpoint group of an intelligent routing listener.</p>
         * <blockquote>
         * <p> This parameter is valid and required only if Type is set to <strong>IpTarget</strong>.</p>
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
         * <p> If you set the weight of an endpoint to 0, GA stops distributing traffic to the endpoint. Proceed with caution.</p>
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
         * <p>The endpoint port that is mapped to the listener port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EndpointPort")
        public Integer endpointPort;

        /**
         * <p>The listener port that is mapped to the endpoint port.</p>
         * <blockquote>
         * <ul>
         * <li>You cannot configure port mappings for virtual endpoint groups of TCP listeners. If a virtual endpoint group already exists on the listener, you cannot configure port mappings for the default endpoint group. If port mappings are configured for the default endpoint group, you cannot add a virtual endpoint group.</li>
         * <li>If you configure port mappings for a listener, you cannot modify the listener protocol. You can only switch between HTTP and HTTPS.</li>
         * <li>Listener port: When you modify the listener port range, make sure that the port range includes the ports configured in port mappings. For example, if you set the listener port range to 80 to 82 and map the listener ports to endpoint ports 100 to 102, you cannot change the listener port range to 80 to 81.</li>
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
