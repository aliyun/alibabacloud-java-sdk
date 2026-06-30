// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeListenerResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The type of the ACL.</p>
     * <ul>
     * <li><p><strong>white</strong>: a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists are suitable for applications that allow access only from specific IP addresses. If you enable a whitelist but do not add an IP address to the ACL, the GA listener does not forward requests.</p>
     * </li>
     * <li><p><strong>black</strong>: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are denied. Blacklists are suitable for applications that deny access from specific IP addresses. If you enable a blacklist but do not add an IP address to the ACL, the GA listener forwards all requests.</p>
     * </li>
     * </ul>
     * <p>This parameter is returned when an ACL is associated with the listener.</p>
     * 
     * <strong>example:</strong>
     * <p>white</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The backend port information.</p>
     */
    @NameInMap("BackendPorts")
    public java.util.List<DescribeListenerResponseBodyBackendPorts> backendPorts;

    /**
     * <p>The list of SSL certificates.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<DescribeListenerResponseBodyCertificates> certificates;

    /**
     * <p>Client affinity.</p>
     * <ul>
     * <li><p>If <strong>NONE</strong> is returned, client affinity is disabled. In this case, requests from the same client may be forwarded to different endpoints.</p>
     * </li>
     * <li><p>If <strong>SOURCE_IP</strong> is returned, client affinity is enabled. When a client accesses a stateful application, all requests from the same client are forwarded to the same endpoint regardless of the source port or protocol.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SOURCE_IP</p>
     */
    @NameInMap("ClientAffinity")
    public String clientAffinity;

    /**
     * <p>The timestamp that indicates when the listener was created. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1577786252000</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the listener.</p>
     * 
     * <strong>example:</strong>
     * <p>Listener</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum version of the HTTP protocol. Valid values:</p>
     * <ul>
     * <li><p><strong>http3</strong>: HTTP/3.</p>
     * </li>
     * <li><p><strong>http2</strong>: HTTP/2.</p>
     * </li>
     * <li><p><strong>http1.1</strong>: HTTP/1.1.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only for HTTPS listeners.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>http2</p>
     */
    @NameInMap("HttpVersion")
    public String httpVersion;

    /**
     * <p>The timeout period for idle connections. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The listener ID.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The name of the listener.</p>
     * 
     * <strong>example:</strong>
     * <p>Listener</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The listener port information.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<DescribeListenerResponseBodyPortRanges> portRanges;

    /**
     * <p>The network transport protocol that is used by the listener.</p>
     * <ul>
     * <li><p><strong>TCP</strong>: TCP.</p>
     * </li>
     * <li><p><strong>UDP</strong>: UDP.</p>
     * </li>
     * <li><p><strong>HTTP</strong>: HTTP.</p>
     * </li>
     * <li><p><strong>HTTPS</strong>: HTTPS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>Indicates whether the proxy protocol is used to preserve client IP addresses.</p>
     * <ul>
     * <li><p><strong>true</strong>: The proxy protocol is used to preserve client IP addresses. After this feature is enabled, you can view the original IP addresses of clients on the backend service.</p>
     * </li>
     * <li><p><strong>false</strong>: The proxy protocol is not used to preserve client IP addresses.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProxyProtocol")
    @Deprecated
    public Boolean proxyProtocol;

    /**
     * <p>The access control policy groups that are associated with the listener.</p>
     */
    @NameInMap("RelatedAcls")
    public java.util.List<DescribeListenerResponseBodyRelatedAcls> relatedAcls;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timeout period for HTTP or HTTPS requests. Unit: seconds.</p>
     * <blockquote>
     * <p>This parameter is available only for HTTP and HTTPS listeners. If a backend server does not respond within the timeout period, GA returns an HTTP 504 error to the client.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The ID of the security policy.</p>
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
     * <li><p>Supported TLS versions: TLS 1.2.</p>
     * </li>
     * <li><p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2_strict</strong></p>
     * <ul>
     * <li><p>Supported TLS versions: TLS 1.2.</p>
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
     * <p>This parameter is available only for HTTPS listeners.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tls_cipher_policy_1_0</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The ID of the service that manages the instance.</p>
     * <blockquote>
     * <p>This parameter is returned only when <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ALB</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>Indicates whether the instance is a managed instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The instance is a managed instance.</p>
     * </li>
     * <li><p><strong>false</strong>: The instance is not a managed instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The actions that you can perform on the managed instance.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is returned only when <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
     * </li>
     * <li><p>When the instance is in a managed state, you cannot perform some operations on the instance.</p>
     * </li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("ServiceManagedInfos")
    public java.util.List<DescribeListenerResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The status of the listener.</p>
     * <ul>
     * <li><p><strong>configuring</strong>: The listener is being configured.</p>
     * </li>
     * <li><p><strong>init</strong>: The listener is being initialized.</p>
     * </li>
     * <li><p><strong>updating</strong>: The listener is being updated.</p>
     * </li>
     * <li><p><strong>deleting</strong>: The listener is being deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The routing type of the listener.</p>
     * <ul>
     * <li><p><strong>Standard</strong>: intelligent routing.</p>
     * </li>
     * <li><p><strong>CustomRouting</strong>: custom routing.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The configurations of the <code>X-Forwarded-For</code> headers.</p>
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

    @Deprecated
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
         * <p>The start port of the backend server that is used to receive requests.</p>
         * <p>This parameter is returned only when the listener protocol is HTTPS and the listener port is the same as the service port of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public String fromPort;

        /**
         * <p>The end port of the backend server that is used to receive requests.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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
         * 
         * <strong>example:</strong>
         * <p>449****-cn-hangzhou</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the certificate.</p>
         * <p>Only <strong>Server</strong> is returned, which indicates a server-side certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Server</p>
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
         * <p>The start of the listener port range that is used to receive and forward requests to endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The end of the listener port range that is used to receive and forward requests to endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * <p>The ID of the access control list (ACL) that is associated with the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>Indicates whether the access control feature is enabled.</p>
         * <ul>
         * <li><strong>Associated</strong>: The access control feature is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Associated</p>
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
         * <ul>
         * <li><p><strong>Create</strong>: Create an instance.</p>
         * </li>
         * <li><p><strong>Update</strong>: Update the current instance.</p>
         * </li>
         * <li><p><strong>Delete</strong>: Delete the current instance.</p>
         * </li>
         * <li><p><strong>Associate</strong>: Associate the instance with other resources.</p>
         * </li>
         * <li><p><strong>UserUnmanaged</strong>: Unmanage the instance.</p>
         * </li>
         * <li><p><strong>CreateChild</strong>: Create a child resource in the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Update</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <ul>
         * <li><p><strong>Listener</strong>: listener.</p>
         * </li>
         * <li><p><strong>IpSet</strong>: acceleration region.</p>
         * </li>
         * <li><p><strong>EndpointGroup</strong>: endpoint group.</p>
         * </li>
         * <li><p><strong>ForwardingRule</strong>: forwarding rule.</p>
         * </li>
         * <li><p><strong>Endpoint</strong>: endpoint.</p>
         * </li>
         * <li><p><strong>EndpointGroupDestination</strong>: protocol mapping of an endpoint group associated with a custom routing listener.</p>
         * </li>
         * <li><p><strong>EndpointPolicy</strong>: traffic policy of an endpoint associated with a custom routing listener.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Action</strong> is set to <strong>CreateChild</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified action is managed. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The specified action is managed. You cannot perform the specified action on the managed instance.</p>
         * </li>
         * <li><p><strong>false</strong>: The specified action is not managed. You can perform the specified action on the managed instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>Indicates whether the <code>GA-AP</code> header is used to retrieve information about the acceleration region.</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only for HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForGaApEnabled")
        public Boolean XForwardedForGaApEnabled;

        /**
         * <p>Indicates whether the <code>GA-ID</code> header is used to retrieve the ID of the GA instance.</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only for HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForGaIdEnabled")
        public Boolean XForwardedForGaIdEnabled;

        /**
         * <p>Indicates whether the <code>GA-X-Forward-Port</code> header is used to retrieve the listener port of the GA instance.</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only for HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForPortEnabled")
        public Boolean XForwardedForPortEnabled;

        /**
         * <p>Indicates whether the <code>GA-X-Forward-Proto</code> header is used to retrieve the listener protocol of the GA instance.</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only for HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Indicates whether the <code>X-Real-IP</code> header is used to retrieve the real IP addresses of clients.</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only for HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
