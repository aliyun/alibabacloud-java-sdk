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
     * <br>
     * <p>*   If this parameter is left empty, client affinity is disabled. After client affinity is disabled, requests from a specific client IP address may be forwarded to different endpoints.</p>
     * <p>*   To enable client affinity, set this parameter to **SOURCE_IP**. In this case, when a client accesses stateful applications, requests from the same client are always forwarded to the same endpoint regardless of the source port or protocol.</p>
     */
    @NameInMap("ClientAffinity")
    public String clientAffinity;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the listener. The description can be at most 200 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The ID of the listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The name of the listener.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The listener ports that are used to receive requests and forward the requests to endpoints.</p>
     * <br>
     * <p>Valid values: **1** to **65499**.</p>
     * <br>
     * <p>The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see [Listener overview](~~153216~~).</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<UpdateListenerRequestPortRanges> portRanges;

    /**
     * <p>The network transmission protocol that is used by the listener. Valid values:</p>
     * <br>
     * <p>*   **tcp**: TCP</p>
     * <p>*   **udp**: UDP</p>
     * <p>*   **http**: HTTP</p>
     * <p>*   **https**: HTTPS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>Specifies whether to reserve client IP addresses. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: enables client IP preservation. After client IP addresses are reserved, you can view client IP addresses on the endpoints.</p>
     * <p>*   **false** (default): disables client IP preservation.</p>
     * <br>
     * <p>> This parameter will be deprecated in the API operations that are used to configure listeners. We recommend that you set this parameter when you call API operations to configure endpoint groups. For more information about the **ProxyProtocol** parameter, see [CreateEndpointGroup](~~153259~~) and [UpdateEndpointGroup](~~153262~~).</p>
     */
    @NameInMap("ProxyProtocol")
    public String proxyProtocol;

    /**
     * <p>The region ID of the GA instance. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The ID of the security policy. Valid values:</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_0**</p>
     * <br>
     * <p>    *   Supported Transport Layer Security (TLS) versions: TLS 1.0, TLS 1.1, and TLS 1.2</p>
     * <p>    *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_1**</p>
     * <br>
     * <p>    *   Supported TLS versions: TLS 1.1 and TLS 1.2</p>
     * <p>    *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_2**</p>
     * <br>
     * <p>    *   Supported TLS version: TLS 1.2</p>
     * <p>    *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_2\_strict**</p>
     * <br>
     * <p>    *   Supported TLS version: TLS 1.2</p>
     * <p>    *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_2\_strict_with\_1\_3**</p>
     * <br>
     * <p>    *   Supported TLS versions: TLS 1.2 and TLS 1.3</p>
     * <p>    *   Supported cipher suites: TLS_AES\_128\_GCM_SHA256, TLS_AES\_256\_GCM_SHA384, TLS_CHACHA20\_POLY1305\_SHA256, TLS_AES\_128\_CCM_SHA256, TLS_AES\_128\_CCM\_8\_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</p>
     * <br>
     * <p>> This parameter is available only when you create an HTTPS listener.</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The `XForward` headers.</p>
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
         * <br>
         * <p>> This parameter is required only when you configure an HTTPS or HTTP listener and the listener port is different from the service port of the backend servers. In this case, the first port that is used by the backend servers to receive requests must be the same as the last port.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port in the range of ports that are used by backend servers to receive requests.</p>
         * <br>
         * <p>> This parameter is required only when you configure an HTTPS or HTTP listener and the listener port is different from the service port of the backend servers. In this case, the first port that is used by the backend servers to receive requests must be the same as the last port.</p>
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
         * <br>
         * <p>> This parameter is required only when you configure an HTTPS listener.</p>
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
         * <br>
         * <p>Valid values: **1** to **65499**. The **FromPort** value must be smaller than or equal to the **ToPort** value.</p>
         * <br>
         * <p>The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see [Listener overview](~~153216~~).</p>
         * <br>
         * <p>> You can configure only one listener port for an HTTP or HTTPS listener. In this case, the first port is the same as the last port.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the listener port range that is used to receive and forward requests to endpoints.</p>
         * <br>
         * <p>Valid values: **1** to **65499**. The **FromPort** value must be smaller than or equal to the **ToPort** value.</p>
         * <br>
         * <p>The maximum number of ports that can be configured varies based on the routing type and protocol of the listener. For more information, see [Listener overview](~~153216~~).</p>
         * <br>
         * <p>> You can configure only one listener port for an HTTP or HTTPS listener. In this case, the first port is the same as the last port.</p>
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
         * <p>Specifies whether to use the `GA-AP` header to retrieve information about acceleration regions. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false** (default): no</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS or HTTP listener.</p>
         */
        @NameInMap("XForwardedForGaApEnabled")
        public Boolean XForwardedForGaApEnabled;

        /**
         * <p>Specifies whether to use the `GA-ID` header to retrieve the ID of the GA instance. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false** (default): no</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS or HTTP listener.</p>
         */
        @NameInMap("XForwardedForGaIdEnabled")
        public Boolean XForwardedForGaIdEnabled;

        /**
         * <p>Specifies whether to use the `GA-X-Forward-Port` header to retrieve the listener ports of the GA instance. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false** (default): no</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS or HTTP listener.</p>
         */
        @NameInMap("XForwardedForPortEnabled")
        public Boolean XForwardedForPortEnabled;

        /**
         * <p>Specifies whether to use the `GA-X-Forward-Proto` header to retrieve the listener protocol of the GA instance. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false** (default): no</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS or HTTP listener.</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Specifies whether to use the `X-Real-IP` header to retrieve client IP addresses. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false** (default): no</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS or HTTP listener.</p>
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
