// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateListenerRequest extends TeaModel {
    /**
     * <p>The ID of the Global Accelerator instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The SSL certificates for an HTTPS listener.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<CreateListenerRequestCertificates> certificates;

    /**
     * <p>The client affinity for the listener.</p>
     * <ul>
     * <li><p>By default, client affinity is disabled, and requests from the same client may be routed to different endpoints.</p>
     * </li>
     * <li><p>Set to <strong>SOURCE_IP</strong> to enable client affinity. This setting directs all requests from the same client to the same endpoint, regardless of the source port or protocol.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SOURCE_IP</p>
     */
    @NameInMap("ClientAffinity")
    public String clientAffinity;

    /**
     * <p>A client token that ensures the idempotence of the request.</p>
     * <p>Generate a unique token on your client for each request. The token must contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you omit this parameter, the system uses the request\&quot;s <strong>RequestId</strong> as the <strong>ClientToken</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configurations of the endpoint groups for a custom routing listener.</p>
     * <p>You can specify up to five endpoint groups.</p>
     * <blockquote>
     * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
     * </blockquote>
     */
    @NameInMap("CustomRoutingEndpointGroupConfigurations")
    public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurations> customRoutingEndpointGroupConfigurations;

    /**
     * <p>The description of the listener.</p>
     * <p>The description can be up to 200 characters long and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Listener</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configurations of the endpoint groups for a standard listener.</p>
     * <p>You can specify up to 10 endpoint groups.</p>
     * <blockquote>
     * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
     * </blockquote>
     */
    @NameInMap("EndpointGroupConfigurations")
    public java.util.List<CreateListenerRequestEndpointGroupConfigurations> endpointGroupConfigurations;

    /**
     * <p>The maximum HTTP version. Valid values:</p>
     * <ul>
     * <li><p><strong>http3</strong>: HTTP/3</p>
     * </li>
     * <li><p><strong>http2</strong> (default): HTTP/2</p>
     * </li>
     * <li><p><strong>http1.1</strong>: HTTP/1.1</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter applies only to HTTPS listeners.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>http2</p>
     */
    @NameInMap("HttpVersion")
    public String httpVersion;

    /**
     * <p>The connection idle timeout, in seconds.</p>
     * <ul>
     * <li><p>TCP: 10–900 seconds. Default: 900 seconds.</p>
     * </li>
     * <li><p>UDP: 10–20 seconds. Default: 20 seconds.</p>
     * </li>
     * <li><p>HTTP/HTTPS: 1–60 seconds. Default: 15 seconds.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The name of the listener.</p>
     * <p>The name must be 1 to 128 characters long, start with a letter or a Chinese character, and can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>Listener</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The listener port range. The port numbers must be within the range of <strong>1</strong> to <strong>65499</strong>. The maximum number of allowed ports depends on the listener\&quot;s routing type and protocol. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener ports</a>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<CreateListenerRequestPortRanges> portRanges;

    /**
     * <p>The listener\&quot;s network protocol. Valid values:</p>
     * <ul>
     * <li><p><strong>tcp</strong>: TCP.</p>
     * </li>
     * <li><p><strong>udp</strong>: UDP.</p>
     * </li>
     * <li><p><strong>http</strong>: HTTP.</p>
     * </li>
     * <li><p><strong>https</strong>: HTTPS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The region ID of the Global Accelerator instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request timeout for HTTP/HTTPS connections, in seconds.</p>
     * <p>Valid values: 1–180 seconds. Default: 60 seconds.</p>
     * <blockquote>
     * <p>This parameter applies only to HTTP or HTTPS listeners. If the backend server does not respond within the timeout period, Global Accelerator returns an HTTP 504 error to the client.</p>
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
     * <li><p>Supported TLS versions: TLS 1.0, TLS 1.1, and TLS 1.2.</p>
     * </li>
     * <li><p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_1</strong></p>
     * <ul>
     * <li><p>Supported TLS versions: TLS 1.1 and TLS 1.2.</p>
     * </li>
     * <li><p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2</strong></p>
     * <ul>
     * <li><p>Supported TLS version: TLS 1.2.</p>
     * </li>
     * <li><p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2_strict</strong></p>
     * <ul>
     * <li><p>Supported TLS version: TLS 1.2.</p>
     * </li>
     * <li><p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2_strict_with_1_3</strong></p>
     * <ul>
     * <li><p>Supported TLS versions: TLS 1.2 and TLS 1.3.</p>
     * </li>
     * <li><p>Supported cipher suites: TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384, TLS_CHACHA20_POLY1305_SHA256, TLS_AES_128_CCM_SHA256, TLS_AES_128_CCM_8_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter applies only to HTTPS listeners.</p>
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
     * <li><p><strong>Standard</strong> (default): standard routing.</p>
     * </li>
     * <li><p><strong>CustomRouting</strong>: custom routing.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Custom routing is in invitation-only preview. To use this feature, contact your Alibaba Cloud account manager.</p>
     * </li>
     * <li><p>A standard Global Accelerator instance supports only one routing type for all of its listeners. The routing type cannot be changed after the listener is created. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Settings for <code>X-Forwarded-For</code> related headers.</p>
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
         * <p>This parameter is required only for HTTPS listeners.</p>
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
         * <p>The first port of the backend service.</p>
         * <p>The valid port range is <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be less than or equal to the value of <strong>ToPort</strong>.</p>
         * <p>In each endpoint group for a custom routing type listener, you can enter up to 20 backend service starting ports.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The protocols of the backend service.</p>
         * <p>You can specify up to four backend service protocols for each mapping configuration.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
         * </blockquote>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The last port of the backend service.</p>
         * <p>The valid port range is <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be less than or equal to the value of <strong>ToPort</strong>.</p>
         * <p>In each endpoint group of a listener of the custom routing type, you can enter a maximum of 20 backend service ports.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
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
         * <p>The first port of the destination that is allowed to receive traffic. The port must be within the port range of the backend service.</p>
         * <p>This parameter is required only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify up to 20 port ranges for each endpoint, and up to 5 first ports for each destination.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the destination that is allowed to receive traffic. The port must be within the port range of the backend service.</p>
         * <p>This parameter is required only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify up to 20 port ranges for each endpoint, and up to 5 last ports for each destination.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
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
         * <p>The IP address of the destination that is allowed to receive traffic.</p>
         * <p>This parameter is required only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify up to 20 destination IP addresses for each endpoint.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The port range of the destination that is allowed to receive traffic. The port range must be within the port range of the backend service.</p>
         * <p>If you leave this parameter empty, all ports of the destination are allowed.</p>
         * <p>This parameter is required only when <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>.</p>
         * <p>You can specify up to 20 port ranges for each endpoint, and up to 5 port ranges for each destination.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
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
         * <p>The vSwitch of the custom routing listener.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-test01</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The destination configurations for a custom routing listener.</p>
         * <p>You can specify up to 20 destinations for each endpoint.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
         * </blockquote>
         */
        @NameInMap("PolicyConfigurations")
        public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurationsPolicyConfigurations> policyConfigurations;

        /**
         * <p>The traffic policy for the backend service of a custom routing listener. Valid values:</p>
         * <ul>
         * <li><p><strong>DenyAll</strong> (default): Denies all traffic to the specified backend service.</p>
         * </li>
         * <li><p><strong>AllowAll</strong>: Allows all traffic to the specified backend service.</p>
         * </li>
         * <li><p><strong>AllowCustom</strong>: Allows traffic to specific destinations.
         * You must specify the IP addresses and port ranges of the allowed destinations. If no port range is specified, all ports of the destination are allowed.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DenyAll</p>
         */
        @NameInMap("TrafficToEndpointPolicy")
        public String trafficToEndpointPolicy;

        /**
         * <p>The type of the backend service for a custom routing listener. Valid value:</p>
         * <p><strong>PrivateSubNet</strong> (default): a private CIDR block.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
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
         * <p>The description of the endpoint group.</p>
         * <p>The description can be up to 200 characters long and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can enter up to 5 endpoint group descriptions.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mapping configurations for the endpoint group.</p>
         * <p>You must specify the port ranges and protocols for the backend service. The settings are mapped to the associated listener port ranges.</p>
         * <p>You can specify up to 20 mapping configurations for each endpoint group.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
         * </blockquote>
         */
        @NameInMap("DestinationConfigurations")
        public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsDestinationConfigurations> destinationConfigurations;

        /**
         * <p>The endpoint configurations.</p>
         * <p>You can specify up to 10 endpoints for each endpoint group.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
         * </blockquote>
         */
        @NameInMap("EndpointConfigurations")
        public java.util.List<CreateListenerRequestCustomRoutingEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        /**
         * <p>The ID of the region where the endpoint group is created.</p>
         * <p>You can enter up to 5 endpoint group region IDs.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("EndpointGroupRegion")
        public String endpointGroupRegion;

        /**
         * <p>The name of the endpoint group.</p>
         * <p>The name must be 1 to 128 characters long, start with a letter or a Chinese character, and can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>You can enter up to 5 endpoint group names.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>CustomRouting</strong>.</p>
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
        @NameInMap("ApiKeys")
        public java.util.List<String> apiKeys;

        /**
         * <p>Specifies whether to preserve client source IP addresses. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the feature.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables the feature.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>This feature is disabled by default for endpoint groups of TCP or UDP listeners. You can enable it as needed.</p>
         * </li>
         * <li><p>This feature is enabled by default for endpoint groups of HTTP or HTTPS listeners. Client source IP addresses are retrieved from the <code>X-Forwarded-For</code> header. You cannot disable this feature.</p>
         * </li>
         * <li><p>You cannot set both <code>EnableClientIPPreservation</code> and <code>EnableProxyProtocol</code> to <code>true</code>.</p>
         * </li>
         * <li><p>For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">Preserve client source IP addresses</a>.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("EnableClientIPPreservation")
        public Boolean enableClientIPPreservation;

        /**
         * <p>Specifies whether to use the proxy protocol to preserve client source IP addresses. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the feature.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables the feature.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>You can configure this parameter only for endpoint groups of TCP listeners.</p>
         * </li>
         * <li><p>You cannot set both <code>EnableClientIPPreservation</code> and <code>EnableProxyProtocol</code> to <code>true</code>.</p>
         * </li>
         * <li><p>For more information, see <a href="https://help.aliyun.com/document_detail/158080.html">Preserve client source IP addresses</a>.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("EnableProxyProtocol")
        public Boolean enableProxyProtocol;

        /**
         * <p>The IP address or domain name of the endpoint.</p>
         * <p>In an endpoint group of an intelligent routing listener, you can enter up to 100 IP addresses or domain names of endpoints.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </blockquote>
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
         * <p>If the endpoint type is <strong>ENI</strong>, you can specify this parameter. If you do not specify this parameter, the primary private IP address of the ENI is used.</p>
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
         * <li><p><strong>Domain</strong>: a custom domain name.</p>
         * </li>
         * <li><p><strong>Ip</strong>: a custom IP address.</p>
         * </li>
         * <li><p><strong>PublicIp</strong>: a public IP address of an Alibaba Cloud service.</p>
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
         * <li><p><strong>IpTarget</strong>: a custom private IP address.</p>
         * </li>
         * </ul>
         * <p>You can specify up to 100 endpoints in an endpoint group.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </li>
         * <li><p>When you add endpoints, Global Accelerator may create service-linked roles to access your resources. The role created depends on the endpoint type:</p>
         * </li>
         * <li></li>
         * <li></li>
         * <li></li>
         * </ul>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178360.html">Service-linked roles</a>.</p>
         * </blockquote>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Ip</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The list of vSwitches in the VPC. You can specify up to two vSwitch IDs.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the Virtual Private Cloud (VPC).</p>
         * <p>In an endpoint group of an intelligent routing listener, you can enter a maximum of 1 VPC ID.</p>
         * <blockquote>
         * <p>This parameter is required only for <strong>IpTarget</strong> endpoints.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp13r1kpr2lel****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The weight of the endpoint.</p>
         * <p>Valid values: <strong>0</strong> to <strong>255</strong>.</p>
         * <p>In an endpoint group for an intelligent routing type listener, you can enter weights for up to 100 endpoints.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </li>
         * <li><p>If an endpoint\&quot;s weight is set to 0, Global Accelerator stops sending traffic to it. Use this setting with caution.</p>
         * </li>
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

        public CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations setApiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        public CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
            this.enableClientIPPreservation = enableClientIPPreservation;
            return this;
        }
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        public CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
        }

        public CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
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

        public CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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
         * <p>The endpoint port that is specified in the port mapping.</p>
         * <p>You can enter a maximum of 5 endpoint ports for port mapping.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </li>
         * <li><p>For TCP listeners, you cannot configure a port mapping for a virtual endpoint group. If a virtual endpoint group already exists for the listener, you cannot configure a port mapping for the default endpoint group. If a port mapping is configured for the default endpoint group, you cannot add a virtual endpoint group to the listener.</p>
         * </li>
         * <li><p>After you configure a port mapping, you cannot modify the listener protocol, except for switching between HTTP and HTTPS.</p>
         * </li>
         * <li><p>When you modify the listener port range, make sure that the new port range includes all listener ports that are specified in the port mapping. For example, if the listener port range is 80-82 and the listener ports are mapped to the endpoint ports 100-102, you cannot change the listener port range to 80-81.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EndpointPort")
        public Long endpointPort;

        /**
         * <p>The listener port that is specified in the port mapping.</p>
         * <p>You can enter up to 5 listener ports for port mappings.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </li>
         * <li><p>For TCP listeners, you cannot configure a port mapping for a virtual endpoint group. If a virtual endpoint group already exists for the listener, you cannot configure a port mapping for the default endpoint group. If a port mapping is configured for the default endpoint group, you cannot add a virtual endpoint group to the listener.</p>
         * </li>
         * <li><p>After you configure a port mapping, you cannot modify the listener protocol, except for switching between HTTP and HTTPS.</p>
         * </li>
         * <li><p>When you modify the listener port range, make sure that the new port range includes all listener ports that are specified in the port mapping. For example, if the listener port range is 80-82 and the listener ports are mapped to the endpoint ports 100-102, you cannot change the listener port range to 80-81.</p>
         * </li>
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
         * <p>The endpoint configurations.</p>
         */
        @NameInMap("EndpointConfigurations")
        public java.util.List<CreateListenerRequestEndpointGroupConfigurationsEndpointConfigurations> endpointConfigurations;

        /**
         * <p>The description of the endpoint group.</p>
         * <p>The description can be up to 200 characters long and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can enter up to 10 endpoint group descriptions.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EndpointGroupDescription")
        public String endpointGroupDescription;

        /**
         * <p>The name of the endpoint group.</p>
         * <p>The name must be 1 to 128 characters long, start with a letter or a Chinese character, and can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>You can enter up to 10 endpoint group names.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EndpointGroupName")
        public String endpointGroupName;

        /**
         * <p>The ID of the region where the endpoint group is created.</p>
         * <p>You can enter up to 10 endpoint group region IDs.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </blockquote>
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
         * <p>You can enter up to 10 endpoint group types.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </li>
         * <li><p>You can create virtual endpoint groups only for HTTP or HTTPS listeners.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        /**
         * <p>The IP version used by the backend service. Valid values:</p>
         * <ul>
         * <li><p><strong>IPv4</strong> (default): GA uses only IPv4 addresses to communicate with backend services.</p>
         * </li>
         * <li><p><strong>IPv6</strong>: GA uses only IPv6 addresses to communicate with backend services.</p>
         * </li>
         * <li><p><strong>ProtocolAffinity</strong>: GA uses the same IP version as the client request to communicate with backend services.</p>
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
         * <li><p><strong>HTTP1.1</strong> (default): HTTP/1.1</p>
         * </li>
         * <li><p><strong>HTTP2</strong>: HTTP/2</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only when EndpointRequestProtocol is set to HTTPS.</p>
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
         * <p>You can enter up to 10 backend service protocols.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </li>
         * <li><p>You can configure this parameter only for endpoint groups of HTTP or HTTPS listeners.</p>
         * </li>
         * <li><p>For an HTTP listener, the backend service protocol must be <strong>HTTP</strong>.</p>
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
         * <p>Specifies whether to enable health checks for the endpoint group. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enables health checks.</p>
         * </li>
         * <li><p><strong>false</strong> (Default): Disables health checks.</p>
         * </li>
         * </ul>
         * <p>You can enable health checks for up to 10 endpoint groups.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The domain name that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
         */
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        /**
         * <p>The health check interval, in seconds.</p>
         * <p>You can enter up to 10 health check intervals.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthCheckIntervalSeconds")
        public Long healthCheckIntervalSeconds;

        /**
         * <p>The path to which health check requests are sent.</p>
         * <p>You can enter up to 10 health check paths.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/healthcheck</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The port that is used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>You can enter a maximum of 10 ports for health checks.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
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
         * <li><p><strong>tcp</strong> or <strong>TCP</strong>: TCP</p>
         * </li>
         * <li><p><strong>http</strong> or <strong>HTTP</strong>: HTTP</p>
         * </li>
         * <li><p><strong>https</strong> or <strong>HTTPS</strong>: HTTPS</p>
         * </li>
         * </ul>
         * <p>You can enter up to 10 health check protocols.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The port mapping. You can specify up to five port mappings.</p>
         */
        @NameInMap("PortOverrides")
        public java.util.List<CreateListenerRequestEndpointGroupConfigurationsPortOverrides> portOverrides;

        /**
         * <p>The number of consecutive successful health checks required to mark an endpoint as healthy, or consecutive failed health checks to mark an endpoint as unhealthy.
         * Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
         * <p>You can enter up to 10 values for the number of consecutive health checks required to trigger a health status change.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ThresholdCount")
        public Long thresholdCount;

        /**
         * <p>The traffic distribution ratio. If a standard listener is associated with multiple endpoint groups, this parameter specifies the percentage of traffic that is distributed to each endpoint group.</p>
         * <p>Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>100</strong>.</p>
         * <p>You can enter traffic distribution values for up to 10 endpoint groups.</p>
         * <blockquote>
         * <p>This parameter applies only when the listener\&quot;s routing type (<strong>Type</strong>) is <strong>Standard</strong>.</p>
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

        public CreateListenerRequestEndpointGroupConfigurations setEndpointIpVersion(String endpointIpVersion) {
            this.endpointIpVersion = endpointIpVersion;
            return this;
        }
        public String getEndpointIpVersion() {
            return this.endpointIpVersion;
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

        public CreateListenerRequestEndpointGroupConfigurations setHealthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }
        public String getHealthCheckHost() {
            return this.healthCheckHost;
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
         * <p>The first port in the listener range used to receive and forward requests to endpoints.</p>
         * <p>The port number must be in the range of <strong>1</strong> to <strong>65499</strong>, and the value of <strong>FromPort</strong> must be less than or equal to the value of <strong>ToPort</strong>.</p>
         * <blockquote>
         * <p>For HTTP or HTTPS listeners, you can specify only one listener port. In this case, the value of <strong>FromPort</strong> must be the same as the value of <strong>ToPort</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port in the listener range used to receive and forward requests to endpoints.</p>
         * <p>The port number must be in the range of <strong>1</strong> to <strong>65499</strong>, and the value of <strong>FromPort</strong> must be less than or equal to the value of <strong>ToPort</strong>.</p>
         * <blockquote>
         * <p>For HTTP or HTTPS listeners, you can specify only one listener port. In this case, the value of <strong>FromPort</strong> must be the same as the value of <strong>ToPort</strong>.</p>
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
         * <p>Specifies whether to use the <code>GA-AP</code> header to pass information about the acceleration region to the backend server. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong> (Default)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter applies only to HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForGaApEnabled")
        public Boolean XForwardedForGaApEnabled;

        /**
         * <p>Specifies whether to use the <code>GA-ID</code> header to pass the Global Accelerator instance ID to the backend server. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong> (Default)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter applies only to HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForGaIdEnabled")
        public Boolean XForwardedForGaIdEnabled;

        /**
         * <p>Specifies whether to use the <code>GA-X-Forward-Port</code> header to pass the listener port of the Global Accelerator instance to the backend server. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong> (Default)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter applies only to HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForPortEnabled")
        public Boolean XForwardedForPortEnabled;

        /**
         * <p>Specifies whether to use the <code>GA-X-Forward-Proto</code> header to pass the listener protocol of the Global Accelerator instance to the backend server. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong> (Default)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter applies only to HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Specifies whether to use the <code>X-Real-IP</code> header to pass the client\&quot;s real IP address to the backend server. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong> (Default)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter applies only to HTTP and HTTPS listeners.</p>
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
