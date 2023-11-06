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
     * <p>*   **white**: a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists apply to scenarios in which you want to allow only specified IP addresses to access an application. Your service may be adversely affected if the whitelist is not properly configured. After you configure a whitelist for a listener, only requests from the IP addresses that are added to the whitelist are forwarded by the listener. If the whitelist is enabled but no IP addresses are added to the ACL, the listener does not forward requests.</p>
     * <p>*   **black**: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are blocked. Blacklists apply to scenarios in which you want to deny access from specific IP addresses to an application. If the blacklist is enabled but no IP addresses are added to the ACL, the listener forwards all requests.</p>
     * <br>
     * <p>If the value of **Status** is **on**, this parameter is returned.</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>Details about the backend ports.</p>
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
     * <p>*   If **NONE** is returned, client affinity is disabled. In this case, requests from the same client may be forwarded to different endpoints.</p>
     * <p>*   If **SOURCE_IP** is returned, client affinity is enabled. In this case, when a client accesses stateful applications, requests from the same client are always forwarded to the same endpoint regardless of the source port or protocol.</p>
     */
    @NameInMap("ClientAffinity")
    public String clientAffinity;

    /**
     * <p>The timestamp when the listener was created. Unit: milliseconds.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the listener.</p>
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
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Details about the listener ports.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<DescribeListenerResponseBodyPortRanges> portRanges;

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
     * <p>Indicates whether the client IP address preservation feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: The client IP address preservation feature is enabled. After client IP addresses are reserved, you can view the source IP addresses of clients over the backend service.</p>
     * <p>*   **false**: The client IP address preservation feature is disabled.</p>
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

    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The ID of the security policy.</p>
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
     * <p>>  This parameter is returned only for HTTPS listeners.</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The service ID to which the managed instance belongs.</p>
     * <br>
     * <p>>  Valid only when the ServiceManaged parameter is True.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>Is it a managed instance. Valid values:</p>
     * <br>
     * <p>- true</p>
     * <p>- false</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>A list of action policies that users can execute on this managed instance.</p>
     */
    @NameInMap("ServiceManagedInfos")
    public java.util.List<DescribeListenerResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The state of the listener. Valid values:</p>
     * <br>
     * <p>*   **configuring**: The listener is being configured.</p>
     * <p>*   **init**: The listener is being initialized.</p>
     * <p>*   **updating**: The listener is being updated.</p>
     * <p>*   **deleting**: The listener is being deleted.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The routing type of the listener. Valid values:</p>
     * <br>
     * <p>*   **Standard**: intelligent routing</p>
     * <p>*   **CustomRouting**: custom routing</p>
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
         * <p>The start port in the range of ports used by the backend server to receive requests.</p>
         * <br>
         * <p>This parameter is returned only when you configure an HTTPS listener and the listening port is the same port used by the backend server to provide services.</p>
         */
        @NameInMap("FromPort")
        public String fromPort;

        /**
         * <p>The end port in the range of ports used by the backend server to receive requests.</p>
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
         * <p>The type of the certificate.</p>
         * <br>
         * <p>Only **Server** can be returned. This value Server indicates a server certificate.</p>
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
         * <p>The start port in the range of listening ports used to receive and forward requests to endpoints.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The end port in the range of listening ports used to receive and forward requests to endpoints.</p>
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
         * <p>*   **on**: enabled</p>
         * <p>*   **off**: disabled</p>
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
         * <p>Managed policy action name, Valid values:</p>
         * <br>
         * <p>- Create</p>
         * <p>- Update</p>
         * <p>- Delete</p>
         * <p>- Associate</p>
         * <p>- UserUnmanaged</p>
         * <p>- CreateChild</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>Sub resource type, Valid values:</p>
         * <br>
         * <p>- Listener</p>
         * <p>- IpSet</p>
         * <p>- EndpointGroup</p>
         * <p>- ForwardingRule</p>
         * <p>- Endpoint</p>
         * <p>- EndpointGroupDestination</p>
         * <p>- EndpointPolicy</p>
         * <br>
         * <p>>Only valid when the Action parameter is CreateChild.</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Is the managed policy action managed, Valid values:</p>
         * <p>- **true**: The managed policy action is managed, and users do not have permission to perform the operation specified in the Action on the managed instance.</p>
         * <p>- **false**: The managed policy action is not managed, and users have permission to perform the operation specified in the Action on the managed instance.</p>
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
         * <p>Indicates whether the `GA-AP` header is used to retrieve the information about acceleration regions. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         * <br>
         * <p>>  This parameter is returned only for HTTP and HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForGaApEnabled")
        public Boolean XForwardedForGaApEnabled;

        /**
         * <p>Indicates whether the `GA-ID` header is used to retrieve the ID of the GA instance. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         * <br>
         * <p>>  This parameter is returned only for HTTP and HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForGaIdEnabled")
        public Boolean XForwardedForGaIdEnabled;

        /**
         * <p>Indicates whether the `GA-X-Forward-Port` header is used to retrieve the listener ports of the GA instance. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         * <br>
         * <p>>  This parameter is returned only for HTTP and HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForPortEnabled")
        public Boolean XForwardedForPortEnabled;

        /**
         * <p>Indicates whether the `GA-X-Forward-Proto` header is used to retrieve the listener protocol of the GA instance. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
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
