// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateListenerRequest extends TeaModel {
    /**
     * <p>The range of ports that are used by backend servers to receive requests.</p>
     */
    @NameInMap("BackendPorts")
    public java.util.List<UpdateListenerRequestBackendPorts> backendPorts;

    /**
     * <p>The SSL certificate.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<UpdateListenerRequestCertificates> certificates;

    /**
     * <p>Specifies whether to enable client affinity for the listener.</p>
     * <ul>
     * <li>If this parameter is left empty, client affinity is disabled. After client affinity is disabled, requests from a specific client IP address may be forwarded to different endpoints.</li>
     * <li>To enable client affinity, set this parameter to <strong>SOURCE_IP</strong>. In this case, when a client accesses stateful applications, requests from the same client are always forwarded to the same endpoint regardless of the source port or protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SOURCE_IP</p>
     */
    @NameInMap("ClientAffinity")
    public String clientAffinity;

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
     * <p>The description of the listener.</p>
     * <p>The description can be up to 200 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Listener</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum version of the HTTP protocol. Valid values:</p>
     * <ul>
     * <li><strong>http3</strong></li>
     * <li><strong>http2</strong></li>
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
     * <p>The timeout period for idle connections. Unit: seconds.</p>
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
     * <p>The ID of the listener.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The name of the listener.</p>
     * <p>The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>Listener</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The listener ports that are used to receive requests and forward the requests to endpoints.</p>
     * <p>Valid values: <strong>1</strong> to <strong>65499</strong>.</p>
     * <p>The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<UpdateListenerRequestPortRanges> portRanges;

    /**
     * <p>The network transmission protocol that is used by the listener. Valid values:</p>
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
     * <p>Specifies whether to reserve client IP addresses. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables client IP preservation. After client IP addresses are reserved, you can view client IP addresses on the endpoints.</li>
     * <li><strong>false</strong> (default): disables client IP preservation.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter will be deprecated in the API operations that are used to configure listeners. We recommend that you set this parameter when you call API operations to configure endpoint groups. For more information about the <strong>ProxyProtocol</strong> parameter, see <a href="https://help.aliyun.com/document_detail/153259.html">CreateEndpointGroup</a> and <a href="https://help.aliyun.com/document_detail/153262.html">UpdateEndpointGroup</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProxyProtocol")
    public String proxyProtocol;

    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The timeout period for HTTP or HTTPS requests.</p>
     * <p>Valid values: 1 to 180. Default value: 60. Unit: seconds.</p>
     * <blockquote>
     * <p> This parameter takes effect only for HTTP or HTTPS listeners. If the backend server does not respond within the timeout period, GA returns an HTTP 504 error code to the client.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The ID of the security policy. Valid values:</p>
     * <ul>
     * <li><p><strong>tls_cipher_policy_1_0</strong></p>
     * <ul>
     * <li>Supported Transport Layer Security (TLS) versions: TLS 1.0, TLS 1.1, and TLS 1.2</li>
     * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_1</strong></p>
     * <ul>
     * <li>Supported TLS versions: TLS 1.1 and TLS 1.2</li>
     * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2</strong></p>
     * <ul>
     * <li>Supported TLS version: TLS 1.2</li>
     * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</li>
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
     * <p>The <code>XForward</code> headers.</p>
     */
    @NameInMap("XForwardedForConfig")
    public UpdateListenerRequestXForwardedForConfig XForwardedForConfig;

    public static UpdateListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerRequest self = new UpdateListenerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateListenerRequest setBackendPorts(java.util.List<UpdateListenerRequestBackendPorts> backendPorts) {
        this.backendPorts = backendPorts;
        return this;
    }
    public java.util.List<UpdateListenerRequestBackendPorts> getBackendPorts() {
        return this.backendPorts;
    }

    public UpdateListenerRequest setCertificates(java.util.List<UpdateListenerRequestCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<UpdateListenerRequestCertificates> getCertificates() {
        return this.certificates;
    }

    public UpdateListenerRequest setClientAffinity(String clientAffinity) {
        this.clientAffinity = clientAffinity;
        return this;
    }
    public String getClientAffinity() {
        return this.clientAffinity;
    }

    public UpdateListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateListenerRequest setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }
    public String getHttpVersion() {
        return this.httpVersion;
    }

    public UpdateListenerRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public UpdateListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateListenerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateListenerRequest setPortRanges(java.util.List<UpdateListenerRequestPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<UpdateListenerRequestPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public UpdateListenerRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateListenerRequest setProxyProtocol(String proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
        return this;
    }
    public String getProxyProtocol() {
        return this.proxyProtocol;
    }

    public UpdateListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateListenerRequest setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public UpdateListenerRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public UpdateListenerRequest setXForwardedForConfig(UpdateListenerRequestXForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
        return this;
    }
    public UpdateListenerRequestXForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public static class UpdateListenerRequestBackendPorts extends TeaModel {
        /**
         * <p>The first port in the range of ports that are used by backend servers to receive requests.</p>
         * <blockquote>
         * <p>This parameter is required only when you configure an HTTPS or HTTP listener and the listener port is different from the service port of the backend servers. In this case, the first port that is used by the backend servers to receive requests must be the same as the last port.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port in the range of ports that are used by backend servers to receive requests.</p>
         * <blockquote>
         * <p>This parameter is required only when you configure an HTTPS or HTTP listener and the listener port is different from the service port of the backend servers. In this case, the first port that is used by the backend servers to receive requests must be the same as the last port.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static UpdateListenerRequestBackendPorts build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerRequestBackendPorts self = new UpdateListenerRequestBackendPorts();
            return TeaModel.build(map, self);
        }

        public UpdateListenerRequestBackendPorts setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public UpdateListenerRequestBackendPorts setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class UpdateListenerRequestCertificates extends TeaModel {
        /**
         * <p>The ID of the SSL certificate.</p>
         * <blockquote>
         * <p>This parameter is required only when you configure an HTTPS listener.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>449****-cn-hangzhou</p>
         */
        @NameInMap("Id")
        public String id;

        public static UpdateListenerRequestCertificates build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerRequestCertificates self = new UpdateListenerRequestCertificates();
            return TeaModel.build(map, self);
        }

        public UpdateListenerRequestCertificates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class UpdateListenerRequestPortRanges extends TeaModel {
        /**
         * <p>The first port of the listener port range that is used to receive and forward requests to endpoints.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The <strong>FromPort</strong> value must be smaller than or equal to the <strong>ToPort</strong> value.</p>
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
         * <p>The last port of the listener port range that is used to receive and forward requests to endpoints.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The <strong>FromPort</strong> value must be smaller than or equal to the <strong>ToPort</strong> value.</p>
         * <p>The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see <a href="https://help.aliyun.com/document_detail/153216.html">Listener overview</a>.</p>
         * <blockquote>
         * <p>You can configure only one listener port for an HTTP or HTTPS listener. In this case, the first port is the same as the last port.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static UpdateListenerRequestPortRanges build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerRequestPortRanges self = new UpdateListenerRequestPortRanges();
            return TeaModel.build(map, self);
        }

        public UpdateListenerRequestPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public UpdateListenerRequestPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class UpdateListenerRequestXForwardedForConfig extends TeaModel {
        /**
         * <p>Specifies whether to use the <code>GA-AP</code> header to retrieve information about acceleration regions. Valid values:</p>
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

        public static UpdateListenerRequestXForwardedForConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerRequestXForwardedForConfig self = new UpdateListenerRequestXForwardedForConfig();
            return TeaModel.build(map, self);
        }

        public UpdateListenerRequestXForwardedForConfig setXForwardedForGaApEnabled(Boolean XForwardedForGaApEnabled) {
            this.XForwardedForGaApEnabled = XForwardedForGaApEnabled;
            return this;
        }
        public Boolean getXForwardedForGaApEnabled() {
            return this.XForwardedForGaApEnabled;
        }

        public UpdateListenerRequestXForwardedForConfig setXForwardedForGaIdEnabled(Boolean XForwardedForGaIdEnabled) {
            this.XForwardedForGaIdEnabled = XForwardedForGaIdEnabled;
            return this;
        }
        public Boolean getXForwardedForGaIdEnabled() {
            return this.XForwardedForGaIdEnabled;
        }

        public UpdateListenerRequestXForwardedForConfig setXForwardedForPortEnabled(Boolean XForwardedForPortEnabled) {
            this.XForwardedForPortEnabled = XForwardedForPortEnabled;
            return this;
        }
        public Boolean getXForwardedForPortEnabled() {
            return this.XForwardedForPortEnabled;
        }

        public UpdateListenerRequestXForwardedForConfig setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
            this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
            return this;
        }
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        public UpdateListenerRequestXForwardedForConfig setXRealIpEnabled(Boolean XRealIpEnabled) {
            this.XRealIpEnabled = XRealIpEnabled;
            return this;
        }
        public Boolean getXRealIpEnabled() {
            return this.XRealIpEnabled;
        }

    }

}
