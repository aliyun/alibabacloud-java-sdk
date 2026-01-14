// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong> performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The configurations of the endpoint groups.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndpointGroupConfigurations")
    public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurations> endpointGroupConfigurations;

    /**
     * <p>The listener ID.</p>
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
         * <p> For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">Preserve client IP addresses</a>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </blockquote>
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
         */
        @NameInMap("EnableProxyProtocol")
        public Boolean enableProxyProtocol;

        /**
         * <p>The IP address, domain name, or instance ID based on the value of Type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>47.0.XX.XX</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The private IP address of the ENI.</p>
         * <blockquote>
         * <p> If you set the endpoint type to ENI, you can specify this parameter. 
         * If you leave this parameter empty, the primary private IP address of the ENI is used.</p>
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
         * <li>If you set this parameter to <strong>ECS</strong>, <strong>ENI</strong>, <strong>SLB</strong>, <strong>ALB</strong>, <strong>NLB</strong>, or <strong>IpTarget</strong> and the AliyunServiceRoleForGaVpcEndpoint service-linked role does not exist, the system automatically creates the role.</li>
         * <li>If you set this parameter to <strong>ALB</strong> and the AliyunServiceRoleForGaAlb service-linked role does not exist, the system automatically creates the role.</li>
         * <li>If you set this parameter to <strong>OSS</strong> and the AliyunServiceRoleForGaOss service-linked role does not exist, the system automatically creates the role.<blockquote>
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
         * <p>vpc-uf66oesmrqge1t2gs****</p>
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
        public Long weight;

        public static UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations self = new UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations();
            return TeaModel.build(map, self);
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
         * <p>Specifies whether to use the proxy protocol to preserve client IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableClientIPPreservationToa")
        public Boolean enableClientIPPreservationToa;

        /**
         * <p>The configurations of the endpoints in the endpoint group.</p>
         */
        @NameInMap("EndpointConfigurations")
        public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        /**
         * <p>The description of the endpoint group.</p>
         * <p>The description cannot exceed 200 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("EndpointGroupDescription")
        public String endpointGroupDescription;

        /**
         * <p>The endpoint ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp1d2utp8qqe2a44t****</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The name of the endpoint group.</p>
         * <p>The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("EndpointGroupName")
        public String endpointGroupName;

        @NameInMap("EndpointIpVersion")
        public String endpointIpVersion;

        /**
         * <p>The backend service protocol of the endpoint that is associated with the intelligent routing listener. Valid values:</p>
         * <ul>
         * <li><strong>HTTP1.1</strong> (default)</li>
         * <li><strong>HTTP2</strong></li>
         * </ul>
         * <blockquote>
         * <p> You can specify this parameter only if EndpointRequestProtocol is set to HTTPS.</p>
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
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can specify this parameter only if the listener that is associated with the endpoint group uses HTTP or HTTPS.</li>
         * <li>The backend service protocol of an HTTP listener must be HTTP.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("EndpointRequestProtocol")
        public String endpointRequestProtocol;

        /**
         * <p>Specifies whether to enable the health check feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the health check feature.</li>
         * <li><strong>false</strong> (default): disables the health check feature.</li>
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
         * <p>The interval at which health checks are performed. Unit: seconds. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthCheckIntervalSeconds")
        public Long healthCheckIntervalSeconds;

        /**
         * <p>The health check path.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthcheck</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The port that you want to use for health checks.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("HealthCheckPort")
        public Long healthCheckPort;

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
         * <p>The port mappings.</p>
         */
        @NameInMap("PortOverrides")
        public java.util.List<UpdateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> portOverrides;

        /**
         * <p>The number of failed consecutive health checks that must occur before a healthy endpoint group is considered unhealthy or the number of successful consecutive health checks that must occur before an unhealthy endpoint group is considered healthy.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ThresholdCount")
        public Long thresholdCount;

        /**
         * <p>The traffic ratio of the endpoint group when the specified listener is associated with multiple endpoint groups.</p>
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
