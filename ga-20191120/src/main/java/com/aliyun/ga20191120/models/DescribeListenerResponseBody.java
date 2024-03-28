// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeListenerResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The type of the ACL. Valid values:</p>
     * <br>
     * <p>*   **white**: a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists are suitable for scenarios in which you want to allow only specific IP addresses to access an application. If a whitelist is improperly configured, risks may arise. After a whitelist is configured for a listener, only requests from the IP addresses that are added to the whitelist are distributed by the listener. If the whitelist is enabled but no IP addresses are added to the ACL, the listener does not forward requests.</p>
     * <p>*   **black**: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are blocked. Blacklists are suitable for scenarios in which you want to deny access from specific IP addresses to an application. If the blacklist is enabled but no IP addresses are added to the ACL, the listener forwards all requests.</p>
     * <br>
     * <p>This parameter is returned only if the value of **Status** is **on**.</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The information about the backend ports.</p>
     */
    @NameInMap("BackendPorts")
    public java.util.List<DescribeListenerResponseBodyBackendPorts> backendPorts;

    /**
     * <p>The SSL certificates.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<DescribeListenerResponseBodyCertificates> certificates;

    /**
     * <p>Indicates whether client affinity is enabled for the listener.</p>
     * <br>
     * <p>*   If **NONE** is returned, client affinity is disabled. Requests from the same client may be forwarded to different endpoints.</p>
     * <p>*   If **SOURCE_IP** is returned, client affinity is enabled. When a client accesses stateful applications, requests from the same client are forwarded to the same endpoint regardless of the source port or protocol.</p>
     */
    @NameInMap("ClientAffinity")
    public String clientAffinity;

    /**
     * <p>The time when the listener was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the listener.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum version of the HTTP protocol. Valid values:</p>
     * <br>
     * <p>*   **http3**</p>
     * <p>*   **http2**</p>
     * <p>*   **http1.1**</p>
     * <br>
     * <p>>  This parameter is returned only for HTTPS listeners.</p>
     */
    @NameInMap("HttpVersion")
    public String httpVersion;

    /**
     * <p>The timeout period of idle connections. Unit: seconds.</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The ID of the listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The name of the listener.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The information about the listener ports.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<DescribeListenerResponseBodyPortRanges> portRanges;

    /**
     * <p>The network transmission protocol that is used by the listener. Valid values:</p>
     * <br>
     * <p>*   **tcp**: TCP.</p>
     * <p>*   **udp**: UDP.</p>
     * <p>*   **http**: HTTP.</p>
     * <p>*   **https**: HTTPS.</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>Indicates whether the client IP address preservation feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **true** You can view the source IP addresses of clients over the backend service.</p>
     * <p>*   **false**</p>
     */
    @NameInMap("ProxyProtocol")
    public Boolean proxyProtocol;

    /**
     * <p>The information about the access control list (ACL) that is associated with the listener.</p>
     */
    @NameInMap("RelatedAcls")
    public java.util.List<DescribeListenerResponseBodyRelatedAcls> relatedAcls;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timeout period of HTTP or HTTPS requests. Unit: seconds.</p>
     * <br>
     * <p>>  This parameter is returned only for HTTP and HTTPS listeners. If no responses are received from the backend server within the specified timeout period, GA returns the HTTP 504 error code to the client.</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The ID of the security policy.</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_0**</p>
     * <br>
     * <p>    *   Supported Transport Layer Security (TLS) versions: TLS 1.0, TLS 1.1, and TLS 1.2.</p>
     * <p>    *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_1**</p>
     * <br>
     * <p>    *   Supported TLS versions: TLS 1.1 and TLS 1.2.</p>
     * <p>    *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_2**</p>
     * <br>
     * <p>    *   Supported TLS version: TLS 1.2.</p>
     * <p>    *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_2\_strict**</p>
     * <br>
     * <p>    *   Supported TLS version: TLS 1.2.</p>
     * <p>    *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.</p>
     * <br>
     * <p>*   **tls_cipher_policy\_1\_2\_strict_with\_1\_3**</p>
     * <br>
     * <p>    *   Supported TLS versions: TLS 1.2 and TLS 1.3.</p>
     * <p>    *   Supported cipher suites: TLS_AES\_128\_GCM_SHA256, TLS_AES\_256\_GCM_SHA384, TLS_CHACHA20\_POLY1305\_SHA256, TLS_AES\_128\_CCM_SHA256, TLS_AES\_128\_CCM\_8\_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.</p>
     * <br>
     * <p>>  This parameter is returned only for HTTPS listeners.</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The ID of the service that manages the instance.</p>
     * <br>
     * <p>>  This parameter is returned only if the value of **ServiceManaged** is **true**.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>Indicates whether the instance is managed. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The actions that users can perform on the managed instance.</p>
     * <p>>*   This parameter is returned only if the value of **ServiceManaged** is **true**.</p>
     * <p>>*   Users can perform only specific actions on a managed instance.</p>
     */
    @NameInMap("ServiceManagedInfos")
    public java.util.List<DescribeListenerResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The status of the listener. Valid values:</p>
     * <br>
     * <p>*   **configuring**: The listener is being configured.</p>
     * <p>*   **init**: The listener is being initialized.</p>
     * <p>*   **updating**: The listener is being updated.</p>
     * <p>*   **deleting:** The listener is being deleted.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The routing type of the listener. Valid values:</p>
     * <br>
     * <p>*   **Standard**: intelligent routing.</p>
     * <p>*   **CustomRouting**: custom routing.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The configurations of the `XForward` headers.</p>
     */
    @NameInMap("XForwardedForConfig")
    public DescribeListenerResponseBodyXForwardedForConfig XForwardedForConfig;

    public static DescribeListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeListenerResponseBody self = new DescribeListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeListenerResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeListenerResponseBody setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public DescribeListenerResponseBody setBackendPorts(java.util.List<DescribeListenerResponseBodyBackendPorts> backendPorts) {
        this.backendPorts = backendPorts;
        return this;
    }
    public java.util.List<DescribeListenerResponseBodyBackendPorts> getBackendPorts() {
        return this.backendPorts;
    }

    public DescribeListenerResponseBody setCertificates(java.util.List<DescribeListenerResponseBodyCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<DescribeListenerResponseBodyCertificates> getCertificates() {
        return this.certificates;
    }

    public DescribeListenerResponseBody setClientAffinity(String clientAffinity) {
        this.clientAffinity = clientAffinity;
        return this;
    }
    public String getClientAffinity() {
        return this.clientAffinity;
    }

    public DescribeListenerResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeListenerResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeListenerResponseBody setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }
    public String getHttpVersion() {
        return this.httpVersion;
    }

    public DescribeListenerResponseBody setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public DescribeListenerResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DescribeListenerResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeListenerResponseBody setPortRanges(java.util.List<DescribeListenerResponseBodyPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<DescribeListenerResponseBodyPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public DescribeListenerResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeListenerResponseBody setProxyProtocol(Boolean proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
        return this;
    }
    public Boolean getProxyProtocol() {
        return this.proxyProtocol;
    }

    public DescribeListenerResponseBody setRelatedAcls(java.util.List<DescribeListenerResponseBodyRelatedAcls> relatedAcls) {
        this.relatedAcls = relatedAcls;
        return this;
    }
    public java.util.List<DescribeListenerResponseBodyRelatedAcls> getRelatedAcls() {
        return this.relatedAcls;
    }

    public DescribeListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeListenerResponseBody setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public DescribeListenerResponseBody setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public DescribeListenerResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DescribeListenerResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeListenerResponseBody setServiceManagedInfos(java.util.List<DescribeListenerResponseBodyServiceManagedInfos> serviceManagedInfos) {
        this.serviceManagedInfos = serviceManagedInfos;
        return this;
    }
    public java.util.List<DescribeListenerResponseBodyServiceManagedInfos> getServiceManagedInfos() {
        return this.serviceManagedInfos;
    }

    public DescribeListenerResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeListenerResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeListenerResponseBody setXForwardedForConfig(DescribeListenerResponseBodyXForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
        return this;
    }
    public DescribeListenerResponseBodyXForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public static class DescribeListenerResponseBodyBackendPorts extends TeaModel {
        /**
         * <p>The first port in the range of ports that are used by the backend server to receive requests.</p>
         * <br>
         * <p>This parameter is returned only if an HTTPS listener is configured and the listener port is the same as the service port of the backend server.</p>
         */
        @NameInMap("FromPort")
        public String fromPort;

        /**
         * <p>The last port in the range of ports that are used by the backend server to receive requests.</p>
         */
        @NameInMap("ToPort")
        public String toPort;

        public static DescribeListenerResponseBodyBackendPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeListenerResponseBodyBackendPorts self = new DescribeListenerResponseBodyBackendPorts();
            return TeaModel.build(map, self);
        }

        public DescribeListenerResponseBodyBackendPorts setFromPort(String fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public String getFromPort() {
            return this.fromPort;
        }

        public DescribeListenerResponseBodyBackendPorts setToPort(String toPort) {
            this.toPort = toPort;
            return this;
        }
        public String getToPort() {
            return this.toPort;
        }

    }

    public static class DescribeListenerResponseBodyCertificates extends TeaModel {
        /**
         * <p>The ID of the SSL certificate.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the SSL certificate.</p>
         * <br>
         * <p>Only **Server** may be returned, which indicates a server certificate.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeListenerResponseBodyCertificates build(java.util.Map<String, ?> map) throws Exception {
            DescribeListenerResponseBodyCertificates self = new DescribeListenerResponseBodyCertificates();
            return TeaModel.build(map, self);
        }

        public DescribeListenerResponseBodyCertificates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeListenerResponseBodyCertificates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeListenerResponseBodyPortRanges extends TeaModel {
        /**
         * <p>The first port in the range of listener ports that are used to receive and forward requests to endpoints.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port in the range of listener ports that are used to receive and forward requests to endpoints.</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static DescribeListenerResponseBodyPortRanges build(java.util.Map<String, ?> map) throws Exception {
            DescribeListenerResponseBodyPortRanges self = new DescribeListenerResponseBodyPortRanges();
            return TeaModel.build(map, self);
        }

        public DescribeListenerResponseBodyPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public DescribeListenerResponseBodyPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class DescribeListenerResponseBodyRelatedAcls extends TeaModel {
        /**
         * <p>The ID of the ACL that is associated with the listener.</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>Indicates whether the access control feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: enabled.</p>
         * <p>*   **off**: disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeListenerResponseBodyRelatedAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeListenerResponseBodyRelatedAcls self = new DescribeListenerResponseBodyRelatedAcls();
            return TeaModel.build(map, self);
        }

        public DescribeListenerResponseBodyRelatedAcls setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeListenerResponseBodyRelatedAcls setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeListenerResponseBodyServiceManagedInfos extends TeaModel {
        /**
         * <p>The name of the action on the managed instance. Valid values:</p>
         * <br>
         * <p>*   **Create**</p>
         * <p>*   **Update**</p>
         * <p>*   **Delete**</p>
         * <p>*   **Associate**</p>
         * <p>*   **UserUnmanaged**</p>
         * <p>*   **CreateChild**</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <br>
         * <p>*   **Listener**: a listener.</p>
         * <p>*   **IpSet**: an acceleration region.</p>
         * <p>*   **EndpointGroup**: an endpoint group.</p>
         * <p>*   **ForwardingRule**: a forwarding rule.</p>
         * <p>*   **Endpoint**: an endpoint.</p>
         * <p>*   **EndpointGroupDestination**: a protocol mapping of an endpoint group associated with a custom routing listener.</p>
         * <p>*   **EndpointPolicy**: a traffic policy of an endpoint associated with a custom routing listener.</p>
         * <br>
         * <p>>  This parameter is returned only if the value of **Action** is **CreateChild**.</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed.</p>
         * <br>
         * <p>*   **true**: The specified actions are managed, and users cannot perform the specified actions on the managed instance.</p>
         * <p>*   **false**: The specified actions are not managed, and users can perform the specified actions on the managed instance.</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static DescribeListenerResponseBodyServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeListenerResponseBodyServiceManagedInfos self = new DescribeListenerResponseBodyServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public DescribeListenerResponseBodyServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeListenerResponseBodyServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public DescribeListenerResponseBodyServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class DescribeListenerResponseBodyXForwardedForConfig extends TeaModel {
        /**
         * <p>Indicates whether the `GA-AP` header is used to retrieve information about acceleration regions. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter is returned only for HTTP and HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForGaApEnabled")
        public Boolean XForwardedForGaApEnabled;

        /**
         * <p>Indicates whether the `GA-ID` header is used to retrieve the ID of the GA instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter is returned only for HTTP and HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForGaIdEnabled")
        public Boolean XForwardedForGaIdEnabled;

        /**
         * <p>Indicates whether the `GA-X-Forward-Port` header is used to retrieve the listener ports of the GA instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter is returned only for HTTP and HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForPortEnabled")
        public Boolean XForwardedForPortEnabled;

        /**
         * <p>Indicates whether the `GA-X-Forward-Proto` header is used to retrieve the listener protocol of the GA instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter is returned only for HTTP and HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Indicates whether the `X-Real-IP` header is used to retrieve client IP addresses. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter is returned only for HTTP and HTTPS listeners.</p>
         */
        @NameInMap("XRealIpEnabled")
        public Boolean XRealIpEnabled;

        public static DescribeListenerResponseBodyXForwardedForConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeListenerResponseBodyXForwardedForConfig self = new DescribeListenerResponseBodyXForwardedForConfig();
            return TeaModel.build(map, self);
        }

        public DescribeListenerResponseBodyXForwardedForConfig setXForwardedForGaApEnabled(Boolean XForwardedForGaApEnabled) {
            this.XForwardedForGaApEnabled = XForwardedForGaApEnabled;
            return this;
        }
        public Boolean getXForwardedForGaApEnabled() {
            return this.XForwardedForGaApEnabled;
        }

        public DescribeListenerResponseBodyXForwardedForConfig setXForwardedForGaIdEnabled(Boolean XForwardedForGaIdEnabled) {
            this.XForwardedForGaIdEnabled = XForwardedForGaIdEnabled;
            return this;
        }
        public Boolean getXForwardedForGaIdEnabled() {
            return this.XForwardedForGaIdEnabled;
        }

        public DescribeListenerResponseBodyXForwardedForConfig setXForwardedForPortEnabled(Boolean XForwardedForPortEnabled) {
            this.XForwardedForPortEnabled = XForwardedForPortEnabled;
            return this;
        }
        public Boolean getXForwardedForPortEnabled() {
            return this.XForwardedForPortEnabled;
        }

        public DescribeListenerResponseBodyXForwardedForConfig setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
            this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
            return this;
        }
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        public DescribeListenerResponseBodyXForwardedForConfig setXRealIpEnabled(Boolean XRealIpEnabled) {
            this.XRealIpEnabled = XRealIpEnabled;
            return this;
        }
        public Boolean getXRealIpEnabled() {
            return this.XRealIpEnabled;
        }

    }

}
