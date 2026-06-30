// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a value for this parameter on your client. Make sure that the value is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, a 2xx HTTP status code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends the request. If the request passes the check, a 2xx HTTP status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The configurations of the endpoint group.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndpointGroupConfigurations")
    public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurations> endpointGroupConfigurations;

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
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateEndpointGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupsRequest self = new UpdateEndpointGroupsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEndpointGroupsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateEndpointGroupsRequest setEndpointGroupConfigurations(java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurations> endpointGroupConfigurations) {
        this.endpointGroupConfigurations = endpointGroupConfigurations;
        return this;
    }
    public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurations> getEndpointGroupConfigurations() {
        return this.endpointGroupConfigurations;
    }

    public UpdateEndpointGroupsRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateEndpointGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations extends TeaModel {
        @NameInMap("ApiKeys")
        public java.util.List<String> apiKeys;

        /**
         * <p>Specifies whether to preserve client IP addresses. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: preserves client IP addresses.</p>
         * </li>
         * <li><p><strong>false</strong> (default): does not preserve client IP addresses.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>By default, client IP address preservation is disabled for endpoint groups of TCP and UDP listeners. You can enable it based on your business needs.</p>
         * </li>
         * <li><p>Client IP address preservation is enabled by default for endpoint groups of HTTP and HTTPS listeners. The client IP addresses are retrieved from the X-Forwarded-For header field. You cannot disable this feature.</p>
         * </li>
         * <li><p>EnableClientIPPreservation and EnableProxyProtocol cannot be set to true at the same time.</p>
         * </li>
         * <li><p>For more information, see <a href="t1863665.xdita#"></a>.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        /**
         * <p>Specifies whether to use the Proxy Protocol to preserve client IP addresses. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: uses the Proxy Protocol.</p>
         * </li>
         * <li><p><strong>false</strong> (default): does not use the Proxy Protocol.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>This parameter is available only for endpoint groups of TCP listeners.</p>
         * </li>
         * <li><p>EnableClientIPPreservation and EnableProxyProtocol cannot be set to true at the same time.</p>
         * </li>
         * <li><p>For more information, see <a href="t1863665.xdita#"></a>.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("EnableProxyProtocol")
        public Boolean enableProxyProtocol;

        /**
         * <p>The IP address, domain name, or instance ID of the endpoint, based on the value of Type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>47.0.XX.XX</p>
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
         * <p>The private IP address of the ENI.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is available only when the endpoint type is ENI. You can specify this parameter. If you do not specify this parameter, the primary private IP address of the ENI is used.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.168.XX.XX</p>
         */
        @NameInMap("SubAddress")
        public String subAddress;

        /**
         * <p>The type of the endpoint.</p>
         * <ul>
         * <li><p><strong>Domain</strong>: a custom domain name.</p>
         * </li>
         * <li><p><strong>Ip</strong>: a custom IP address.</p>
         * </li>
         * <li><p><strong>IpTarget</strong>: a custom private IP address.</p>
         * </li>
         * <li><p><strong>PublicIp</strong>: an Alibaba Cloud public IP address.</p>
         * </li>
         * <li><p><strong>ECS</strong>: an Alibaba Cloud Elastic Compute Service (ECS) instance.</p>
         * </li>
         * <li><p><strong>SLB</strong>: an Alibaba Cloud Server Load Balancer (SLB) instance.</p>
         * </li>
         * <li><p><strong>ALB</strong>: an Alibaba Cloud Application Load Balancer (ALB) instance.</p>
         * </li>
         * <li><p><strong>OSS</strong>: an Alibaba Cloud Object Storage Service (OSS) bucket.</p>
         * </li>
         * <li><p><strong>ENI</strong>: an Alibaba Cloud Elastic Network Interface (ENI).</p>
         * </li>
         * <li><p><strong>NLB</strong>: an Alibaba Cloud Network Load Balancer (NLB) instance.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>If you set the endpoint type to <strong>ECS</strong>, <strong>ENI</strong>, <strong>SLB</strong>, <strong>NLB</strong>, or <strong>IpTarget</strong>, and the service-linked role does not exist, the system automatically creates a service-linked role named AliyunServiceRoleForGaVpcEndpoint.</p>
         * </li>
         * <li><p>If you set the endpoint type to <strong>ALB</strong>, and the service-linked role does not exist, the system automatically creates a service-linked role named AliyunServiceRoleForGaAlb.</p>
         * </li>
         * <li><p>If you set the endpoint type to <strong>OSS</strong>, and the service-linked role does not exist, the system automatically creates a service-linked role named AliyunServiceRoleForGaOss.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For more information, see <a href="t1963894.xdita#"></a>.</p>
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
         * <p>The list of vSwitches in the VPC.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * <p>You can specify at most one VPC ID for an endpoint group that is associated with a listener that uses smart routing.</p>
         * <blockquote>
         * <p>This parameter is required and takes effect only when the endpoint type is <strong>IpTarget</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf66oesmrqge1t2gs****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The weight of the endpoint.</p>
         * <p>Valid values: <strong>0</strong> to <strong>255</strong>.</p>
         * <blockquote>
         * <p>If you set the weight of an endpoint to 0, GA stops distributing traffic to the endpoint. Handle this with care.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Weight")
        public Long weight;

        public static UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations self = new UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setApiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setSubAddress(String subAddress) {
            this.subAddress = subAddress;
            return this;
        }
        public String getSubAddress() {
            return this.subAddress;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

    public static class UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides extends TeaModel {
        /**
         * <p>The endpoint port.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EndpointPort")
        public Long endpointPort;

        /**
         * <p>The listener port.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>.</p>
         * <blockquote>
         * <ul>
         * <li><p>For TCP listeners, virtual endpoint groups do not support port mapping. If a virtual endpoint group already exists under the listener, you cannot configure port mapping for the default endpoint group. If port mapping is already configured for the default endpoint group, you cannot add a virtual endpoint group.</p>
         * </li>
         * <li><p>After you configure port mapping, the following limits apply to subsequent listener modifications: You cannot change the listener protocol, except for changing it between HTTP and HTTPS.</p>
         * </li>
         * <li><p>Listener port: The modified listener port range must include all listener ports that are currently mapped. For example, if the listener port range is 80-82 and the ports are mapped to endpoint ports 100-102, you cannot change the listener port range to 80-81.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ListenerPort")
        public Long listenerPort;

        public static UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides self = new UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides setEndpointPort(Long endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Long getEndpointPort() {
            return this.endpointPort;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class UpdateEndpointGroupsRequestEndpointGroupConfigurations extends TeaModel {
        /**
         * <p>Specifies whether to use the Proxy Protocol to preserve client IP addresses. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableClientIPPreservationProxyProtocol")
        public Boolean enableClientIPPreservationProxyProtocol;

        /**
         * <p>Specifies whether to use the TCP Option Address (TOA) module to preserve client IP addresses. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableClientIPPreservationToa")
        public Boolean enableClientIPPreservationToa;

        /**
         * <p>The configurations of the endpoint.</p>
         */
        @NameInMap("EndpointConfigurations")
        public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        /**
         * <p>The description of the endpoint group.</p>
         * <p>The description can be up to 200 characters in length and cannot start with http\:// or https\://.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("EndpointGroupDescription")
        public String endpointGroupDescription;

        /**
         * <p>The ID of the endpoint group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp1d2utp8qqe2a44t****</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The name of the endpoint group.</p>
         * <p>The name must be 1 to 128 characters in length, start with a letter or a Chinese character, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("EndpointGroupName")
        public String endpointGroupName;

        @NameInMap("EndpointIpVersion")
        public String endpointIpVersion;

        /**
         * <p>The version of the backend service protocol for endpoints in a listener that uses smart routing. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP1.1</strong> (default): HTTP/1.1</p>
         * </li>
         * <li><p><strong>HTTP2</strong>: HTTP/2</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only when you set EndpointRequestProtocol to HTTPS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP1.1</p>
         */
        @NameInMap("EndpointProtocolVersion")
        public String endpointProtocolVersion;

        /**
         * <p>The protocol of the backend service. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP</strong>: HTTP</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: HTTPS</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>You can set this parameter only when you create an endpoint group for an HTTP or HTTPS listener.</p>
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
         * <p>Specifies whether to enable the health check feature.</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the health check feature.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables the health check feature.</p>
         * </li>
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
        public Long healthCheckIntervalSeconds;

        /**
         * <p>The path of the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthcheck</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The port that is used for health checks.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("HealthCheckPort")
        public Long healthCheckPort;

        /**
         * <p>The protocol that is used for health checks.</p>
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
         * <p>The port mapping.</p>
         */
        @NameInMap("PortOverrides")
        public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> portOverrides;

        /**
         * <p>The number of consecutive health checks that an endpoint must pass to be considered healthy, or fail to be considered unhealthy.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ThresholdCount")
        public Long thresholdCount;

        /**
         * <p>The traffic distribution ratio. If a listener is associated with multiple endpoint groups, you can specify this parameter to distribute traffic to the endpoint groups.</p>
         * <p>Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TrafficPercentage")
        public Long trafficPercentage;

        public static UpdateEndpointGroupsRequestEndpointGroupConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupsRequestEndpointGroupConfigurations self = new UpdateEndpointGroupsRequestEndpointGroupConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEnableClientIPPreservationProxyProtocol(Boolean enableClientIPPreservationProxyProtocol) {
            this.enableClientIPPreservationProxyProtocol = enableClientIPPreservationProxyProtocol;
            return this;
        }
        public Boolean getEnableClientIPPreservationProxyProtocol() {
            return this.enableClientIPPreservationProxyProtocol;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEnableClientIPPreservationToa(Boolean enableClientIPPreservationToa) {
            this.enableClientIPPreservationToa = enableClientIPPreservationToa;
            return this;
        }
        public Boolean getEnableClientIPPreservationToa() {
            return this.enableClientIPPreservationToa;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEndpointConfigurations(java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }
        public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupDescription(String endpointGroupDescription) {
            this.endpointGroupDescription = endpointGroupDescription;
            return this;
        }
        public String getEndpointGroupDescription() {
            return this.endpointGroupDescription;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupName(String endpointGroupName) {
            this.endpointGroupName = endpointGroupName;
            return this;
        }
        public String getEndpointGroupName() {
            return this.endpointGroupName;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEndpointIpVersion(String endpointIpVersion) {
            this.endpointIpVersion = endpointIpVersion;
            return this;
        }
        public String getEndpointIpVersion() {
            return this.endpointIpVersion;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEndpointProtocolVersion(String endpointProtocolVersion) {
            this.endpointProtocolVersion = endpointProtocolVersion;
            return this;
        }
        public String getEndpointProtocolVersion() {
            return this.endpointProtocolVersion;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setEndpointRequestProtocol(String endpointRequestProtocol) {
            this.endpointRequestProtocol = endpointRequestProtocol;
            return this;
        }
        public String getEndpointRequestProtocol() {
            return this.endpointRequestProtocol;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }
        public String getHealthCheckHost() {
            return this.healthCheckHost;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckIntervalSeconds(Long healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }
        public Long getHealthCheckIntervalSeconds() {
            return this.healthCheckIntervalSeconds;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckPort(Long healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }
        public Long getHealthCheckPort() {
            return this.healthCheckPort;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setPortOverrides(java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> portOverrides) {
            this.portOverrides = portOverrides;
            return this;
        }
        public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> getPortOverrides() {
            return this.portOverrides;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setThresholdCount(Long thresholdCount) {
            this.thresholdCount = thresholdCount;
            return this;
        }
        public Long getThresholdCount() {
            return this.thresholdCount;
        }

        public UpdateEndpointGroupsRequestEndpointGroupConfigurations setTrafficPercentage(Long trafficPercentage) {
            this.trafficPercentage = trafficPercentage;
            return this;
        }
        public Long getTrafficPercentage() {
            return this.trafficPercentage;
        }

    }

}
