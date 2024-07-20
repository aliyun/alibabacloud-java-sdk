// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateListenerRequest extends TeaModel {
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
     * <p>The SSL certificates.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<CreateListenerRequestCertificates> certificates;

    /**
     * <p>Specifies whether to enable client affinity for the listener.</p>
     * <ul>
     * <li>If this parameter is left empty, client affinity is disabled. After client affinity is disabled, requests from a specific client IP address may be forwarded to different endpoints.</li>
     * <li>To enable client affinity, set this parameter to <strong>SOURCE_IP</strong>. In this case, when a client accesses stateful applications, requests from the same client are forwarded to the same endpoint regardless of the source port or protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SOURCE_IP</p>
     */
    @NameInMap("ClientAffinity")
    public String clientAffinity;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not set this parameter, <strong>ClientToken</strong> is set to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> is different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The endpoint group that is associated with the custom routing listener.</p>
     * <p>You can configure at most five endpoint groups for a custom routing listener.</p>
     * <blockquote>
     * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
     * </blockquote>
     */
    @NameInMap("CustomRoutingEndpointGroupConfigurations")
    public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurations> customRoutingEndpointGroupConfigurations;

    /**
     * <p>The description of the listener. The description can be at most 200 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Listener</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The endpoint groups that are associated with the intelligent routing listener.</p>
     * <p>You can configure up to 10 endpoint groups for an intelligent routing listener.</p>
     * <blockquote>
     * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
     * </blockquote>
     */
    @NameInMap("EndpointGroupConfigurations")
    public java.util.List<CreateListenerRequestEndpointGroupConfigurations> endpointGroupConfigurations;

    /**
     * <p>The maximum version of the HTTP protocol. Valid values:</p>
     * <ul>
     * <li><strong>http3</strong></li>
     * <li><strong>http2</strong> (default)</li>
     * <li><strong>http1.1</strong></li>
     * </ul>
     * <blockquote>
     * <p> Only HTTPS listeners support this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>http2</p>
     */
    @NameInMap("HttpVersion")
    public String httpVersion;

    /**
     * <p>The timeout period of idle connections. Unit: seconds.</p>
     * <ul>
     * <li>TCP: 10-900. Default value: 900. Unit: seconds.</li>
     * <li>UDP: 10-20. Default value: 20. Unit: seconds.</li>
     * <li>HTTP/HTTPS: 1-60. Default value: 15. Unit: seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The name of the listener.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>Listener</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The listener ports. Valid values: <strong>1</strong> to <strong>65499</strong>. The maximum number of ports that can be configured depends on the routing type and protocol of the listener. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<CreateListenerRequestPortRanges> portRanges;

    /**
     * <p>The network transmission protocol that you want to use for the listener. Valid values:</p>
     * <ul>
     * <li><strong>tcp</strong>: TCP</li>
     * <li><strong>udp</strong>: UDP</li>
     * <li><strong>http</strong>: HTTP</li>
     * <li><strong>https</strong>: HTTPS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>Specifies whether to preserve client IP addresses. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the feature. After client IP addresses are preserved, you can view client IP addresses on the endpoints.</li>
     * <li><strong>false</strong> (default): disables the feature.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter will be deprecated in the API operations that are used to configure listeners. We recommend that you set this parameter when you call API operations to configure endpoint groups. For more information about the <strong>ProxyProtocol</strong> parameter, see <a href="https://help.aliyun.com/document_detail/153259.html">CreateEndpointGroup</a> and <a href="https://help.aliyun.com/document_detail/153262.html">UpdateEndpointGroup</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProxyProtocol")
    public Boolean proxyProtocol;

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
     * <p>The timeout period for HTTP or HTTPS requests. Unit: seconds.</p>
     * <p>Valid values: 1 to 180. Default value: 60. Unit: seconds.</p>
     * <blockquote>
     * <p> This parameter takes effect only for HTTP or HTTPS listeners. If the backend server does not respond within the timeout period, GA returns an HTTP 504 error code to the client.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The ID of the security policy. Valid values:</p>
     * <ul>
     * <li><p><strong>tls_cipher_policy_1_0</strong></p>
     * <ul>
     * <li>Supported Transport Layer Security (TLS) versions: TLS 1.0, TLS 1.1, and TLS 1.2</li>
     * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_1</strong></p>
     * <ul>
     * <li>Supported TLS versions: TLS 1.1 and TLS 1.2</li>
     * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2</strong></p>
     * <ul>
     * <li>Supported TLS version: TLS 1.2</li>
     * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2_strict</strong></p>
     * <ul>
     * <li>Supported TLS version: TLS 1.2</li>
     * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2_strict_with_1_3</strong></p>
     * <ul>
     * <li>Supported TLS versions: TLS 1.2 and TLS 1.3</li>
     * <li>Supported cipher suites: TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384, TLS_CHACHA20_POLY1305_SHA256, TLS_AES_128_CCM_SHA256, TLS_AES_128_CCM_8_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only when you create an HTTPS listener.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tls_cipher_policy_1_0</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The routing type of the listener. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong> (default): intelligent routing</li>
     * <li><strong>CustomRouting</strong>: custom routing</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager.</li>
     * <li>You can create only listeners of the same routing type for a standard GA instance. You cannot change the routing types of listeners. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The <code>XForward</code> headers.</p>
     */
    @NameInMap("XForwardedForConfig")
    public CreateListenerRequestXForwardedForConfig XForwardedForConfig;

    public static CreateListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateListenerRequest self = new CreateListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateListenerRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateListenerRequest setCertificates(java.util.List<CreateListenerRequestCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<CreateListenerRequestCertificates> getCertificates() {
        return this.certificates;
    }

    public CreateListenerRequest setClientAffinity(String clientAffinity) {
        this.clientAffinity = clientAffinity;
        return this;
    }
    public String getClientAffinity() {
        return this.clientAffinity;
    }

    public CreateListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateListenerRequest setCustomRoutingEndpointGroupConfigurations(java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurations> customRoutingEndpointGroupConfigurations) {
        this.customRoutingEndpointGroupConfigurations = customRoutingEndpointGroupConfigurations;
        return this;
    }
    public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurations> getCustomRoutingEndpointGroupConfigurations() {
        return this.customRoutingEndpointGroupConfigurations;
    }

    public CreateListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateListenerRequest setEndpointGroupConfigurations(java.util.List<CreateListenerRequestEndpointGroupConfigurations> endpointGroupConfigurations) {
        this.endpointGroupConfigurations = endpointGroupConfigurations;
        return this;
    }
    public java.util.List<CreateListenerRequestEndpointGroupConfigurations> getEndpointGroupConfigurations() {
        return this.endpointGroupConfigurations;
    }

    public CreateListenerRequest setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }
    public String getHttpVersion() {
        return this.httpVersion;
    }

    public CreateListenerRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public CreateListenerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateListenerRequest setPortRanges(java.util.List<CreateListenerRequestPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<CreateListenerRequestPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public CreateListenerRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateListenerRequest setProxyProtocol(Boolean proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
        return this;
    }
    public Boolean getProxyProtocol() {
        return this.proxyProtocol;
    }

    public CreateListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateListenerRequest setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public CreateListenerRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public CreateListenerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateListenerRequest setXForwardedForConfig(CreateListenerRequestXForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
        return this;
    }
    public CreateListenerRequestXForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public static class CreateListenerRequestCertificates extends TeaModel {
        /**
         * <p>The ID of the SSL certificate.</p>
         * <blockquote>
         * <p>This parameter is required only when you create an HTTPS listener.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>449****-cn-hangzhou</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateListenerRequestCertificates build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestCertificates self = new CreateListenerRequestCertificates();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestCertificates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class CreateListenerRequestCustomRoutingEndpointGroupConfigurationsDestinationConfigurations extends TeaModel {
        /**
         * <p>The first port used by the endpoint group that is associated with the custom routing listener.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be equal to or smaller than the value of <strong>ToPort</strong>.</p>
         * <p>You can specify up to 20 first ports for an endpoint group of a custom routing listener.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The protocol used by the endpoint group that is associated with the custom routing listener.</p>
         * <p>You can specify up to four protocols in each mapping configuration for an endpoint group of a custom routing listener.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The last port used by the endpoint group that is associated with the custom routing listener.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be equal to or smaller than the value of <strong>ToPort</strong>.</p>
         * <p>You can specify up to 20 last ports for an endpoint group of a custom routing listener.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static CreateListenerRequestCustomRoutingEndpointGroupConfigurationsDestinationConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestCustomRoutingEndpointGroupConfigurationsDestinationConfigurations self = new CreateListenerRequestCustomRoutingEndpointGroupConfigurationsDestinationConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurationsDestinationConfigurations setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurationsDestinationConfigurations setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurationsDestinationConfigurations setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges extends TeaModel {
        /**
         * <p>The first port of the destination port range. The value of this parameter must be in the port range of the endpoint group.</p>
         * <p>This parameter takes effect only if <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify port ranges for up to 20 destinations in each endpoint of a custom routing listener. You can specify up to five first ports for each destination.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the destination port range. The value of this parameter must be in the port range of the endpoint group.</p>
         * <p>This parameter takes effect only if <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify port ranges for up to 20 destinations in each endpoint of a custom routing listener. You can specify up to five end ports for each destination.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges self = new CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations extends TeaModel {
        /**
         * <p>The IP address of the destination to which traffic is forwarded.</p>
         * <p>This parameter takes effect only if <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify up to 20 destination IP addresses for each endpoint of a custom routing listener.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The port range of the destination to which traffic is forwarded. The value of this parameter must fall within the port range of the endpoint group.</p>
         * <p>If you leave this parameter empty, traffic is distributed to all destination ports.</p>
         * <p>This parameter takes effect only if <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify port ranges for up to 20 destinations in each endpoint of a custom routing listener. You can specify up to five port ranges for each destination.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         */
        @NameInMap("PortRanges")
        public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges> portRanges;

        public static CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations self = new CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations setPortRanges(java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

    }

    public static class CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurations extends TeaModel {
        /**
         * <p>The name of the vSwitch that is specified as an endpoint.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-test01</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The destination in the endpoint that is associated with the custom routing listener.</p>
         * <p>You can specify at most 20 destinations in each endpoint of a custom routing listener.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         */
        @NameInMap("PolicyConfigurations")
        public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations> policyConfigurations;

        /**
         * <p>The traffic policy for the endpoint that is associated with the custom routing listener. Valid values:</p>
         * <ul>
         * <li><strong>DenyAll</strong> (default): denies all traffic to the endpoint.</li>
         * <li><strong>AllowAll</strong>: allows all traffic to the endpoint.</li>
         * <li><strong>AllowCustom</strong>: allows traffic only to specified destinations in the endpoint.</li>
         * </ul>
         * <p>If you set this parameter to AllowCustom, you must specify IP addresses and port ranges as the destinations to which traffic is distributed. If you specify only IP addresses and do not specify port ranges, GA can forward traffic to the specified IP addresses over all destination ports.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DenyAll</p>
         */
        @NameInMap("TrafficToEndpointPolicy")
        public String trafficToEndpointPolicy;

        /**
         * <p>The service type of the endpoint that is associated with the custom routing listener.</p>
         * <p>Set the value to <strong>PrivateSubNet</strong>, which specifies a private CIDR block.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PrivateSubNet</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurations self = new CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurations setPolicyConfigurations(java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations> policyConfigurations) {
            this.policyConfigurations = policyConfigurations;
            return this;
        }
        public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations> getPolicyConfigurations() {
            return this.policyConfigurations;
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurations setTrafficToEndpointPolicy(String trafficToEndpointPolicy) {
            this.trafficToEndpointPolicy = trafficToEndpointPolicy;
            return this;
        }
        public String getTrafficToEndpointPolicy() {
            return this.trafficToEndpointPolicy;
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateListenerRequestCustomRoutingEndpointGroupConfigurations extends TeaModel {
        /**
         * <p>The description of the endpoint group that is associated with the custom routing listener.</p>
         * <p>The description cannot exceed 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify at most five endpoint group descriptions.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mapping configurations of the endpoint group that is associated with the custom routing listener.</p>
         * <p>You need to specify the port ranges and protocols used by the endpoint group. The ports are mapped to listener ports.</p>
         * <p>You can specify at most 20 mapping configurations for an endpoint group of a custom routing listener.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         */
        @NameInMap("DestinationConfigurations")
        public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsDestinationConfigurations> destinationConfigurations;

        /**
         * <p>The endpoint that is associated with the custom routing listener.</p>
         * <p>You can configure at most 10 endpoints for an endpoint group of a custom routing listener.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         */
        @NameInMap("EndpointConfigurations")
        public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        /**
         * <p>The region ID of the endpoint group that is associated with the custom routing listener.</p>
         * <p>You can enter the region IDs of up to five endpoint groups.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        /**
         * <p>The name of the endpoint group that is associated with the custom routing listener.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
         * <p>You can specify at most five endpoint group names.</p>
         * <blockquote>
         * <p>You can configure endpoint groups and endpoints for a custom routing listener only if the <strong>Type</strong> parameter is set to <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateListenerRequestCustomRoutingEndpointGroupConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestCustomRoutingEndpointGroupConfigurations self = new CreateListenerRequestCustomRoutingEndpointGroupConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurations setDestinationConfigurations(java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsDestinationConfigurations> destinationConfigurations) {
            this.destinationConfigurations = destinationConfigurations;
            return this;
        }
        public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsDestinationConfigurations> getDestinationConfigurations() {
            return this.destinationConfigurations;
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurations setEndpointConfigurations(java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }
        public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurations setEndpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        public CreateListenerRequestCustomRoutingEndpointGroupConfigurations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations extends TeaModel {
        /**
         * <p>The IP address or domain name of the endpoint that is associated with the intelligent routing listener.</p>
         * <p>You can specify up to 100 endpoint IP addresses or domain names for an endpoint group of an intelligent routing listener.</p>
         * <blockquote>
         * <p> If you set <strong>Type</strong> to <strong>Standard</strong>, you can configure endpoint groups and endpoints, and this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>47.0.XX.XX</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The private IP address of the elastic network interface (ENI).</p>
         * <blockquote>
         * <p> If the endpoint type is <strong>ENI</strong>, you can specify this parameter. If you do not specify this parameter, the primary private IP address of the ENI is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.168.XX.XX</p>
         */
        @NameInMap("SubAddress")
        public String subAddress;

        /**
         * <p>The type of the endpoint that is associated with the intelligent routing listener. Valid values:</p>
         * <ul>
         * <li><strong>Domain</strong>: a custom domain name</li>
         * <li><strong>Ip</strong>: a custom IP address</li>
         * <li><strong>PublicIp</strong>: a public IP address provided by Alibaba Cloud</li>
         * <li><strong>ECS</strong>: an Elastic Compute Service (ECS) instance</li>
         * <li><strong>SLB</strong>: a Server Load Balancer (SLB) instance</li>
         * <li><strong>ALB</strong>: an Application Load Balancer (ALB) instance</li>
         * <li><strong>OSS</strong>: an Object Storage Service (OSS) bucket</li>
         * </ul>
         * <p>You can specify up to 100 endpoint types for an endpoint group of an intelligent routing listener.</p>
         * <blockquote>
         * <ul>
         * <li>If you set <strong>Type</strong> to <strong>Standard</strong>, you can configure endpoint groups and endpoints for an intelligent routing listener, and this parameter is required.</li>
         * <li>If you set this parameter to <strong>ECS</strong> or <strong>SLB</strong> and the service-linked role AliyunServiceRoleForGaVpcEndpoint does not exist, the system automatically creates the service-linked role.</li>
         * <li>If you set this parameter to <strong>ALB</strong> and the service-linked role AliyunServiceRoleForGaAlb does not exist, the system automatically creates the service-linked role.</li>
         * <li>If you set this parameter to <strong>OSS</strong> and the service-linked role AliyunServiceRoleForGaOss does not exist, the system automatically creates the service-linked role.<br>For more information, see <a href="https://help.aliyun.com/document_detail/178360.html">Service linked roles</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Ip</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the endpoint that is associated with the intelligent routing listener.</p>
         * <p>Valid values: <strong>0</strong> to <strong>255</strong>.</p>
         * <p>You can specify the weights of up to 100 endpoints for an endpoint group of an intelligent routing listener.</p>
         * <blockquote>
         * <ul>
         * <li>If you set <strong>Type</strong> to <strong>Standard</strong>, you can configure endpoint groups and endpoints for an intelligent routing listener, and this parameter is required.</li>
         * <li>If you set the weight of an endpoint to 0, GA does not route network traffic to the endpoint. Make sure that you are aware of the impact on your business before you set the endpoint weight to 0.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Weight")
        public Long weight;

        public static CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations self = new CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations setSubAddress(String subAddress) {
            this.subAddress = subAddress;
            return this;
        }
        public String getSubAddress() {
            return this.subAddress;
        }

        public CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

    public static class CreateListenerRequestEndpointGroupConfigurationsPortOverrides extends TeaModel {
        /**
         * <p>The endpoint port that is mapped to the listener port.</p>
         * <p>You can specify up to five endpoint ports.</p>
         * <blockquote>
         * <ul>
         * <li>You can configure endpoint groups and endpoints for an intelligent routing listener only if you set <strong>Type</strong> to <strong>Standard</strong>.</li>
         * <li>Only HTTP and HTTPS intelligent routing listeners support port mappings.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EndpointPort")
        public Long endpointPort;

        /**
         * <p>The listener port that is mapped to the endpoint port.</p>
         * <p>You can specify up to five listener ports.</p>
         * <blockquote>
         * <ul>
         * <li>You can configure endpoint groups and endpoints for an intelligent routing listener only if you set <strong>Type</strong> to <strong>Standard</strong>.</li>
         * <li>Only HTTP and HTTPS intelligent routing listeners support port mappings.</li>
         * <li>The listener port in a port mapping must be the port that is used by the current listener.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ListenerPort")
        public Long listenerPort;

        public static CreateListenerRequestEndpointGroupConfigurationsPortOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestEndpointGroupConfigurationsPortOverrides self = new CreateListenerRequestEndpointGroupConfigurationsPortOverrides();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestEndpointGroupConfigurationsPortOverrides setEndpointPort(Long endpointPort) {
            this.endpointPort = endpointPort;
            return this;
        }
        public Long getEndpointPort() {
            return this.endpointPort;
        }

        public CreateListenerRequestEndpointGroupConfigurationsPortOverrides setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class CreateListenerRequestEndpointGroupConfigurations extends TeaModel {
        /**
         * <p>Specifies whether to use the proxy protocol to preserve client IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <p>You can specify this parameter for up to 10 endpoint groups.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableClientIPPreservationProxyProtocol")
        public Boolean enableClientIPPreservationProxyProtocol;

        /**
         * <p>Specifies whether to preserve client IP addresses by using the TCP Option Address (TOA) module. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <p>You can specify this parameter for up to 10 endpoint groups.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableClientIPPreservationToa")
        public Boolean enableClientIPPreservationToa;

        /**
         * <p>The endpoint that is associated with the intelligent routing listener.</p>
         */
        @NameInMap("EndpointConfigurations")
        public java.util.List<CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        /**
         * <p>The description of the endpoint group that is associated with the intelligent routing listener.</p>
         * <p>The description can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can enter the descriptions of up to 10 endpoint groups.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EndpointGroupDescription")
        public String endpointGroupDescription;

        /**
         * <p>The name of the endpoint group that is associated with the intelligent routing listener.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
         * <p>You can enter the names of up to 10 endpoint groups.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EndpointGroupName")
        public String endpointGroupName;

        /**
         * <p>The region ID of the endpoint group that is associated with the intelligent routing listener.</p>
         * <p>You can enter the region IDs of up to 10 endpoint groups.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        /**
         * <p>The type of the endpoint group associated with the intelligent routing listener. Valid values:</p>
         * <ul>
         * <li><strong>default</strong> (default)</li>
         * <li><strong>virtual</strong></li>
         * </ul>
         * <p>You can specify up to 10 endpoint group types.</p>
         * <blockquote>
         * <ul>
         * <li>You can configure endpoint groups and endpoints for an intelligent routing listener only if you set <strong>Type</strong> to <strong>Standard</strong>.</li>
         * <li>Only HTTP intelligent routing listeners and HTTPS intelligent routing listeners support virtual endpoint groups.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        @NameInMap("EndpointProtocolVersion")
        public String endpointProtocolVersion;

        /**
         * <p>The backend service protocol of the endpoint that is associated with the intelligent routing listener. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong> (default)</li>
         * <li><strong>HTTPS</strong></li>
         * </ul>
         * <p>You can specify up to 10 backend service protocols.</p>
         * <blockquote>
         * <ul>
         * <li>You can configure endpoint groups and endpoints for an intelligent routing listener only if you set <strong>Type</strong> to <strong>Standard</strong>.</li>
         * <li>You can specify this parameter only for HTTP and HTTPS intelligent routing listeners.</li>
         * <li>For an HTTP listener, the protocol must be <strong>HTTP</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("EndpointRequestProtocol")
        public String endpointRequestProtocol;

        /**
         * <p>Specifies whether to enable health checks for the endpoint group. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <p>You can enable the health check feature for up to 10 endpoint groups.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds.</p>
         * <p>You can specify up to 10 health check intervals.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthCheckIntervalSeconds")
        public Long healthCheckIntervalSeconds;

        /**
         * <p>The path to which health check requests are sent.</p>
         * <p>You can specify up to 10 health check paths.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/healthcheck</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The port that is used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>You can specify up to 10 health check ports.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("HealthCheckPort")
        public Long healthCheckPort;

        /**
         * <p>The protocol over which health check requests are sent. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>http</strong></li>
         * <li><strong>https</strong></li>
         * </ul>
         * <p>You can specify up to 10 health check protocols.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
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
        public java.util.List<CreateListenerRequestEndpointGroupConfigurationsPortOverrides> portOverrides;

        /**
         * <p>The number of consecutive health check failures that must occur before a healthy endpoint group is considered unhealthy, or the number of consecutive health check successes that must occur before an unhealthy endpoint group is considered healthy. Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
         * <p>You can specify the number of successful consecutive health checks or failed consecutive health checks for up to 10 endpoint groups.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ThresholdCount")
        public Long thresholdCount;

        /**
         * <p>The traffic distribution ratio. If an intelligent routing listener is associated with multiple endpoint groups, you can configure this parameter to specify the ratio of traffic distributed to each endpoint group.</p>
         * <p>Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>100</strong>.</p>
         * <p>You can specify traffic distribution ratios for up to 10 endpoint groups.</p>
         * <blockquote>
         * <p> You can configure endpoint groups and endpoints only if you set <strong>Type</strong> to <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TrafficPercentage")
        public Long trafficPercentage;

        public static CreateListenerRequestEndpointGroupConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestEndpointGroupConfigurations self = new CreateListenerRequestEndpointGroupConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestEndpointGroupConfigurations setEnableClientIPPreservationProxyProtocol(Boolean enableClientIPPreservationProxyProtocol) {
            this.enableClientIPPreservationProxyProtocol = enableClientIPPreservationProxyProtocol;
            return this;
        }
        public Boolean getEnableClientIPPreservationProxyProtocol() {
            return this.enableClientIPPreservationProxyProtocol;
        }

        public CreateListenerRequestEndpointGroupConfigurations setEnableClientIPPreservationToa(Boolean enableClientIPPreservationToa) {
            this.enableClientIPPreservationToa = enableClientIPPreservationToa;
            return this;
        }
        public Boolean getEnableClientIPPreservationToa() {
            return this.enableClientIPPreservationToa;
        }

        public CreateListenerRequestEndpointGroupConfigurations setEndpointConfigurations(java.util.List<CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }
        public java.util.List<CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        public CreateListenerRequestEndpointGroupConfigurations setEndpointGroupDescription(String endpointGroupDescription) {
            this.endpointGroupDescription = endpointGroupDescription;
            return this;
        }
        public String getEndpointGroupDescription() {
            return this.endpointGroupDescription;
        }

        public CreateListenerRequestEndpointGroupConfigurations setEndpointGroupName(String endpointGroupName) {
            this.endpointGroupName = endpointGroupName;
            return this;
        }
        public String getEndpointGroupName() {
            return this.endpointGroupName;
        }

        public CreateListenerRequestEndpointGroupConfigurations setEndpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        public CreateListenerRequestEndpointGroupConfigurations setEndpointGroupType(String endpointGroupType) {
            this.endpointGroupType = endpointGroupType;
            return this;
        }
        public String getEndpointGroupType() {
            return this.endpointGroupType;
        }

        public CreateListenerRequestEndpointGroupConfigurations setEndpointProtocolVersion(String endpointProtocolVersion) {
            this.endpointProtocolVersion = endpointProtocolVersion;
            return this;
        }
        public String getEndpointProtocolVersion() {
            return this.endpointProtocolVersion;
        }

        public CreateListenerRequestEndpointGroupConfigurations setEndpointRequestProtocol(String endpointRequestProtocol) {
            this.endpointRequestProtocol = endpointRequestProtocol;
            return this;
        }
        public String getEndpointRequestProtocol() {
            return this.endpointRequestProtocol;
        }

        public CreateListenerRequestEndpointGroupConfigurations setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public CreateListenerRequestEndpointGroupConfigurations setHealthCheckIntervalSeconds(Long healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }
        public Long getHealthCheckIntervalSeconds() {
            return this.healthCheckIntervalSeconds;
        }

        public CreateListenerRequestEndpointGroupConfigurations setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public CreateListenerRequestEndpointGroupConfigurations setHealthCheckPort(Long healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }
        public Long getHealthCheckPort() {
            return this.healthCheckPort;
        }

        public CreateListenerRequestEndpointGroupConfigurations setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public CreateListenerRequestEndpointGroupConfigurations setPortOverrides(java.util.List<CreateListenerRequestEndpointGroupConfigurationsPortOverrides> portOverrides) {
            this.portOverrides = portOverrides;
            return this;
        }
        public java.util.List<CreateListenerRequestEndpointGroupConfigurationsPortOverrides> getPortOverrides() {
            return this.portOverrides;
        }

        public CreateListenerRequestEndpointGroupConfigurations setThresholdCount(Long thresholdCount) {
            this.thresholdCount = thresholdCount;
            return this;
        }
        public Long getThresholdCount() {
            return this.thresholdCount;
        }

        public CreateListenerRequestEndpointGroupConfigurations setTrafficPercentage(Long trafficPercentage) {
            this.trafficPercentage = trafficPercentage;
            return this;
        }
        public Long getTrafficPercentage() {
            return this.trafficPercentage;
        }

    }

    public static class CreateListenerRequestPortRanges extends TeaModel {
        /**
         * <p>The first port of the listener port range that you want to use to receive and forward requests to endpoints.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be smaller than or equal to the value of <strong>ToPort</strong>.</p>
         * <p>The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</p>
         * <blockquote>
         * <p>You can configure only one listener port for an HTTP or HTTPS listener. In this case, the first port is the same as the last port.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the listener port range that you want to use to receive and forward requests to endpoints.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be smaller than or equal to the value of <strong>ToPort</strong>.</p>
         * <p>The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</p>
         * <blockquote>
         * <p>You can configure only one listener port for an HTTP or HTTPS listener. In this case, the first port is the same as the last port.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static CreateListenerRequestPortRanges build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestPortRanges self = new CreateListenerRequestPortRanges();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public CreateListenerRequestPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class CreateListenerRequestXForwardedForConfig extends TeaModel {
        /**
         * <p>Specifies whether to use the <code>GA-AP</code> header to retrieve the information about acceleration regions. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong> (default): no</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only when you create an HTTPS or HTTP listener.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForGaApEnabled")
        public Boolean XForwardedForGaApEnabled;

        /**
         * <p>Specifies whether to use the <code>GA-ID</code> header to retrieve the ID of the GA instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong> (default): no</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only when you create an HTTPS or HTTP listener.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForGaIdEnabled")
        public Boolean XForwardedForGaIdEnabled;

        /**
         * <p>Specifies whether to use the <code>GA-X-Forward-Port</code> header to retrieve the listener ports of the GA instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong> (default): no</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only when you create an HTTPS or HTTP listener.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForPortEnabled")
        public Boolean XForwardedForPortEnabled;

        /**
         * <p>Specifies whether to use the <code>GA-X-Forward-Proto</code> header to retrieve the listener protocol of the GA instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong> (default): no</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only when you create an HTTPS or HTTP listener.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Specifies whether to use the <code>X-Real-IP</code> header to retrieve client IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong> (default): no</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only when you create an HTTPS or HTTP listener.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XRealIpEnabled")
        public Boolean XRealIpEnabled;

        public static CreateListenerRequestXForwardedForConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestXForwardedForConfig self = new CreateListenerRequestXForwardedForConfig();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForGaApEnabled(Boolean XForwardedForGaApEnabled) {
            this.XForwardedForGaApEnabled = XForwardedForGaApEnabled;
            return this;
        }
        public Boolean getXForwardedForGaApEnabled() {
            return this.XForwardedForGaApEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForGaIdEnabled(Boolean XForwardedForGaIdEnabled) {
            this.XForwardedForGaIdEnabled = XForwardedForGaIdEnabled;
            return this;
        }
        public Boolean getXForwardedForGaIdEnabled() {
            return this.XForwardedForGaIdEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForPortEnabled(Boolean XForwardedForPortEnabled) {
            this.XForwardedForPortEnabled = XForwardedForPortEnabled;
            return this;
        }
        public Boolean getXForwardedForPortEnabled() {
            return this.XForwardedForPortEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
            this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
            return this;
        }
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXRealIpEnabled(Boolean XRealIpEnabled) {
            this.XRealIpEnabled = XRealIpEnabled;
            return this;
        }
        public Boolean getXRealIpEnabled() {
            return this.XRealIpEnabled;
        }

    }

}
