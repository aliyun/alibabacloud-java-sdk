// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateEndpointGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the accelerator.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token used to ensure request idempotence.</p>
     * <p>You can generate the token on your client. Ensure that it is unique across different requests. The value of <code>ClientToken</code> can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> is unique for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1F4B6A4A-C89E-489E-BAF1-52777EE148EF</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run but does not create the resource. The system checks the required parameters, request format, and service limits. If the request fails the dry run, the system returns an error message. If the request passes the dry run, the system returns a 2xx HTTP status code.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request and creates the resource if the request passes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The configurations of the endpoint groups.</p>
     * <p>You can configure up to 10 endpoint groups.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndpointGroupConfigurations")
    public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurations> endpointGroupConfigurations;

    /**
     * <p>The ID of the listener.</p>
     * <blockquote>
     * <p>If the listener protocol is <strong>HTTP</strong> or <strong>HTTPS</strong>, you can create only one endpoint group in each <strong>CreateEndpointGroups</strong> call.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The ID of the region where the accelerator is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateEndpointGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointGroupsRequest self = new CreateEndpointGroupsRequest();
        return TeaModel.build(map, self);
    }

    public CreateEndpointGroupsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateEndpointGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEndpointGroupsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateEndpointGroupsRequest setEndpointGroupConfigurations(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurations> endpointGroupConfigurations) {
        this.endpointGroupConfigurations = endpointGroupConfigurations;
        return this;
    }
    public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurations> getEndpointGroupConfigurations() {
        return this.endpointGroupConfigurations;
    }

    public CreateEndpointGroupsRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateEndpointGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations extends TeaModel {
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
         * <li><p>For endpoint groups of UDP and TCP listeners, the preserve client IP feature is disabled by default. You can enable this feature based on your business requirements.</p>
         * </li>
         * <li><p>For endpoint groups of HTTP and HTTPS listeners, the preserve client IP feature is enabled by default. Client IP addresses are preserved in the X-Forwarded-For header. You cannot disable this feature.</p>
         * </li>
         * <li><p><code>EnableClientIPPreservation</code> and <code>EnableProxyProtocol</code> cannot be set to <code>true</code> at the same time.</p>
         * </li>
         * <li><p>For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">preserve client IP addresses</a>.</p>
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
         * <p>Specifies whether to use the Proxy Protocol to preserve client IP addresses. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: uses the Proxy Protocol to preserve client IP addresses.</p>
         * </li>
         * <li><p><strong>false</strong> (default): does not use the Proxy Protocol to preserve client IP addresses.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>This parameter is available only for endpoint groups that are associated with TCP listeners.</p>
         * </li>
         * <li><p><code>EnableClientIPPreservation</code> and <code>EnableProxyProtocol</code> cannot be set to <code>true</code> at the same time.</p>
         * </li>
         * <li><p>For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">preserve client IP addresses</a>.</p>
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
         * <p>The IP address or domain name of the endpoint.</p>
         * <p>In an endpoint group of an intelligent routing listener, you can enter a maximum of 100 endpoint IP addresses or domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
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
         * <p>The private IP address of the elastic network interface (ENI).</p>
         * <blockquote>
         * <p>This parameter is available only when the endpoint type is <strong>ENI</strong>. If you do not specify this parameter, the system uses the primary private IP address of the ENI.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.168.XX.XX</p>
         */
        @NameInMap("SubAddress")
        public String subAddress;

        /**
         * <p>The type of endpoint in an intelligent routing listener. Valid values:</p>
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
         * <li><p><strong>OSS</strong>: an OSS bucket.</p>
         * </li>
         * <li><p><strong>ENI</strong>: an elastic network interface.</p>
         * </li>
         * <li><p><strong>NLB</strong>: an NLB instance.</p>
         * </li>
         * </ul>
         * <p>In an endpoint group of an intelligent routing listener, you can specify up to 100 endpoints.</p>
         * <blockquote>
         * <ul>
         * <li><p>If the routing type of the listener is <strong>Standard</strong> (intelligent routing), you must configure the endpoint group and endpoint information for the listener. This parameter is required.</p>
         * </li>
         * <li><p>If you set Type to <strong>ECS</strong>, <strong>ENI</strong>, <strong>SLB</strong>, or <strong>IpTarget</strong> and a service-linked role does not exist, the system automatically creates a service-linked role named AliyunServiceRoleForGaVpcEndpoint.</p>
         * </li>
         * <li><p>If you set Type to <strong>ALB</strong> and a service-linked role does not exist, the system automatically creates a service-linked role named AliyunServiceRoleForGaAlb.</p>
         * </li>
         * <li><p>If you set Type to <strong>OSS</strong> and a service-linked role does not exist, the system automatically creates a service-linked role named AliyunServiceRoleForGaOss.</p>
         * </li>
         * <li><p>If you set Type to <strong>NLB</strong> and a service-linked role does not exist, the system automatically creates a service-linked role named AliyunServiceRoleForGaNlb.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178360.html">service-linked roles</a>.</p>
         * </blockquote>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Domain</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>A list of VSwitch IDs.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the VPC.</p>
         * <p>In an endpoint group of an intelligent routing listener, you can specify only one VPC ID.</p>
         * <blockquote>
         * <p>This parameter is required only when you set Type to <strong>IpTarget</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zekzii824szm3hps****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The weight of the endpoint.</p>
         * <p>Valid values: <strong>0</strong> to <strong>255</strong>.</p>
         * <blockquote>
         * <p>If you set the weight of an endpoint to 0, Global Accelerator stops distributing traffic to the endpoint. Proceed with caution.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Weight")
        public Long weight;

        public static CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations self = new CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setApiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setSubAddress(String subAddress) {
            this.subAddress = subAddress;
            return this;
        }
        public String getSubAddress() {
            return this.subAddress;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides extends TeaModel {
        /**
         * <p>The endpoint port used for the port override.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("EndpointPort")
        public Long endpointPort;

        /**
         * <p>The listener port.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>.</p>
         * <blockquote>
         * <ul>
         * <li><p>For TCP listeners, you cannot configure port overrides for a virtual endpoint group. If a virtual endpoint group already exists for the listener, you cannot configure port overrides for the default endpoint group. If port overrides are configured for the default endpoint group, you cannot add a virtual endpoint group.</p>
         * </li>
         * <li><p>After you configure a port override, you cannot change the listener protocol, except for switching between HTTP and HTTPS.</p>
         * </li>
         * <li><p>When you modify the listener port range, the new range must include all listener ports that are used in the port overrides. For example, if the listener port range is 80-82 and a port override is configured to map listener ports to endpoint ports 100-102, you cannot change the listener port range to 80-81.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ListenerPort")
        public Long listenerPort;

        public static CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides self = new CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides setEndpointPort(Long endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Long getEndpointPort() {
            return this.endpointPort;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag extends TeaModel {
        /**
         * <p>This parameter is reserved.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is reserved.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>This parameter is reserved.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag self = new CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigurationsTag extends TeaModel {
        /**
         * <p>The key of the tag. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can enter up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can enter up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEndpointGroupsRequestEndpointGroupConfigurationsTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigurationsTag self = new CreateEndpointGroupsRequestEndpointGroupConfigurationsTag();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurationsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEndpointGroupsRequestEndpointGroupConfigurations extends TeaModel {
        /**
         * <p>The configurations of the endpoints in the endpoint group.</p>
         */
        @NameInMap("EndpointConfigurations")
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        /**
         * <p>The description of the endpoint group.</p>
         * <p>The description can be up to 200 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>EndpointGroup</p>
         */
        @NameInMap("EndpointGroupDescription")
        public String endpointGroupDescription;

        /**
         * <p>The name of the endpoint group.</p>
         * <p>The name must be 1 to 128 characters long, start with a letter or a Chinese character, and contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("EndpointGroupName")
        public String endpointGroupName;

        /**
         * <p>The ID of the region where the endpoint group is deployed.</p>
         * <p>You can enter up to 10 endpoint group region IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
         */
        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        /**
         * <p>The type of the endpoint group in an intelligent routing listener. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong> (default): a default endpoint group.</p>
         * </li>
         * <li><p><strong>virtual</strong>: a virtual endpoint group.</p>
         * </li>
         * </ul>
         * <p>You can enter up to 10 endpoint group types.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        /**
         * <p>The IP version of the backend service. Valid values:</p>
         * <ul>
         * <li><p><strong>IPv4</strong> (default): Global Accelerator uses only IPv4 addresses to communicate with the backend service.</p>
         * </li>
         * <li><p><strong>IPv6</strong>: Global Accelerator uses only IPv6 addresses to communicate with the backend service.</p>
         * </li>
         * <li><p><strong>ProtocolAffinity</strong>: Global Accelerator communicates with the backend service using the same IP version as the client request.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("EndpointIpVersion")
        public String endpointIpVersion;

        /**
         * <p>The protocol version of the backend service. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP1.1</strong> (default): HTTP 1.1.</p>
         * </li>
         * <li><p><strong>HTTP2</strong>: HTTP 2.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can set this parameter only when <code>EndpointRequestProtocol</code> is set to <strong>HTTPS</strong>.</p>
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
         * <li><p><strong>HTTP</strong></p>
         * </li>
         * <li><p><strong>HTTPS</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>You can set this parameter only when you create an endpoint group for an HTTP or HTTPS listener.</p>
         * </li>
         * <li><p>For an HTTP listener, you can set this parameter only to HTTP.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("EndpointRequestProtocol")
        public String endpointRequestProtocol;

        /**
         * <p>Specifies whether to enable health checks for the endpoint group. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables health checks.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables health checks.</p>
         * </li>
         * </ul>
         * <p>You can enable health checks for up to 10 endpoint groups.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The domain name to which health check requests are sent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
         */
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        /**
         * <p>The interval between health checks, in seconds.</p>
         * <p>You can enter up to 10 health check intervals.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckIntervalSeconds")
        public Long healthCheckIntervalSeconds;

        /**
         * <p>The path used for health checks.</p>
         * <p>You can enter up to 10 health check paths.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthcheck</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>You can enter up to 10 ports for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("HealthCheckPort")
        public Long healthCheckPort;

        /**
         * <p>The protocol used for health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>tcp</strong> or <strong>TCP</strong>: TCP protocol.</p>
         * </li>
         * <li><p><strong>http</strong> or <strong>HTTP</strong>: HTTP protocol.</p>
         * </li>
         * <li><p><strong>https</strong> or <strong>HTTPS</strong>: HTTPS protocol.</p>
         * </li>
         * </ul>
         * <p>You can enter up to 10 health check protocols.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The port override settings.</p>
         */
        @NameInMap("PortOverrides")
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> portOverrides;

        /**
         * <p>This parameter is reserved.</p>
         */
        @NameInMap("SystemTag")
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag> systemTag;

        /**
         * <p>The tags to add to the endpoint group. You can specify up to 20 tags.</p>
         */
        @NameInMap("Tag")
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsTag> tag;

        /**
         * <p>The number of consecutive health checks that must succeed for an endpoint to be considered healthy, or fail for it to be considered unhealthy. Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
         * <p>You can enter up to 10 values for the number of consecutive health checks required for a health status change.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ThresholdCount")
        public Long thresholdCount;

        /**
         * <p>The traffic distribution percentage for the endpoint group. If an intelligent routing listener is associated with multiple endpoint groups, this parameter specifies the percentage of traffic that is routed to this endpoint group.</p>
         * <p>Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>100</strong>.</p>
         * <p>You can enter traffic dial values for up to 10 endpoint groups.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TrafficPercentage")
        public Long trafficPercentage;

        public static CreateEndpointGroupsRequestEndpointGroupConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointGroupsRequestEndpointGroupConfigurations self = new CreateEndpointGroupsRequestEndpointGroupConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointConfigurations(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsEndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupDescription(String endpointGroupDescription) {
            this.endpointGroupDescription = endpointGroupDescription;
            return this;
        }
        public String getEndpointGroupDescription() {
            return this.endpointGroupDescription;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupName(String endpointGroupName) {
            this.endpointGroupName = endpointGroupName;
            return this;
        }
        public String getEndpointGroupName() {
            return this.endpointGroupName;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointGroupType(String endpointGroupType) {
            this.endpointGroupType = endpointGroupType;
            return this;
        }
        public String getEndpointGroupType() {
            return this.endpointGroupType;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointIpVersion(String endpointIpVersion) {
            this.endpointIpVersion = endpointIpVersion;
            return this;
        }
        public String getEndpointIpVersion() {
            return this.endpointIpVersion;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointProtocolVersion(String endpointProtocolVersion) {
            this.endpointProtocolVersion = endpointProtocolVersion;
            return this;
        }
        public String getEndpointProtocolVersion() {
            return this.endpointProtocolVersion;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setEndpointRequestProtocol(String endpointRequestProtocol) {
            this.endpointRequestProtocol = endpointRequestProtocol;
            return this;
        }
        public String getEndpointRequestProtocol() {
            return this.endpointRequestProtocol;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }
        public String getHealthCheckHost() {
            return this.healthCheckHost;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckIntervalSeconds(Long healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }
        public Long getHealthCheckIntervalSeconds() {
            return this.healthCheckIntervalSeconds;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckPort(Long healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }
        public Long getHealthCheckPort() {
            return this.healthCheckPort;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setPortOverrides(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> portOverrides) {
            this.portOverrides = portOverrides;
            return this;
        }
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsPortOverrides> getPortOverrides() {
            return this.portOverrides;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setSystemTag(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag> systemTag) {
            this.systemTag = systemTag;
            return this;
        }
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsSystemTag> getSystemTag() {
            return this.systemTag;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setTag(java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<CreateEndpointGroupsRequestEndpointGroupConfigurationsTag> getTag() {
            return this.tag;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setThresholdCount(Long thresholdCount) {
            this.thresholdCount = thresholdCount;
            return this;
        }
        public Long getThresholdCount() {
            return this.thresholdCount;
        }

        public CreateEndpointGroupsRequestEndpointGroupConfigurations setTrafficPercentage(Long trafficPercentage) {
            this.trafficPercentage = trafficPercentage;
            return this;
        }
        public Long getTrafficPercentage() {
            return this.trafficPercentage;
        }

    }

}
