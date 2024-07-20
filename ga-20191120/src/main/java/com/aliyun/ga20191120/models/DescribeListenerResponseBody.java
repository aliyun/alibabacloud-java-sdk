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
     * <p>The type of the ACL. Valid values:</p>
     * <ul>
     * <li><strong>white</strong>: a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists are suitable for scenarios in which you want to allow only specific IP addresses to access an application. If a whitelist is improperly configured, risks may arise. After a whitelist is configured for a listener, only requests from the IP addresses that are added to the whitelist are distributed by the listener. If the whitelist is enabled but no IP addresses are added to the ACL, the listener does not forward requests.</li>
     * <li><strong>black</strong>: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are blocked. Blacklists are suitable for scenarios in which you want to deny access from specific IP addresses to an application. If the blacklist is enabled but no IP addresses are added to the ACL, the listener forwards all requests.</li>
     * </ul>
     * <p>This parameter is returned only if the value of <strong>Status</strong> is <strong>on</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>white</p>
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
     * <ul>
     * <li>If <strong>NONE</strong> is returned, client affinity is disabled. Requests from the same client may be forwarded to different endpoints.</li>
     * <li>If <strong>SOURCE_IP</strong> is returned, client affinity is enabled. When a client accesses stateful applications, requests from the same client are forwarded to the same endpoint regardless of the source port or protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SOURCE_IP</p>
     */
    @NameInMap("ClientAffinity")
    public String clientAffinity;

    /**
     * <p>The time when the listener was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
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
     * <li><strong>http3</strong></li>
     * <li><strong>http2</strong></li>
     * <li><strong>http1.1</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is returned only for HTTPS listeners.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>http2</p>
     */
    @NameInMap("HttpVersion")
    public String httpVersion;

    /**
     * <p>The timeout period of idle connections. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The ID of the listener.</p>
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
     * <p>The information about the listener ports.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<DescribeListenerResponseBodyPortRanges> portRanges;

    /**
     * <p>The network transmission protocol that is used by the listener. Valid values:</p>
     * <ul>
     * <li><strong>tcp</strong>: TCP.</li>
     * <li><strong>udp</strong>: UDP.</li>
     * <li><strong>http</strong>: HTTP.</li>
     * <li><strong>https</strong>: HTTPS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>Indicates whether the client IP address preservation feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> You can view the source IP addresses of clients over the backend service.</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
     * 
     * <strong>example:</strong>
     * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timeout period of HTTP or HTTPS requests. Unit: seconds.</p>
     * <blockquote>
     * <p> This parameter is returned only for HTTP and HTTPS listeners. If no responses are received from the backend server within the specified timeout period, GA returns the HTTP 504 error code to the client.</p>
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
     * <li>Supported Transport Layer Security (TLS) versions: TLS 1.0, TLS 1.1, and TLS 1.2.</li>
     * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_1</strong></p>
     * <ul>
     * <li>Supported TLS versions: TLS 1.1 and TLS 1.2.</li>
     * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2</strong></p>
     * <ul>
     * <li>Supported TLS version: TLS 1.2.</li>
     * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2_strict</strong></p>
     * <ul>
     * <li>Supported TLS version: TLS 1.2.</li>
     * <li>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.</li>
     * </ul>
     * </li>
     * <li><p><strong>tls_cipher_policy_1_2_strict_with_1_3</strong></p>
     * <ul>
     * <li>Supported TLS versions: TLS 1.2 and TLS 1.3.</li>
     * <li>Supported cipher suites: TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384, TLS_CHACHA20_POLY1305_SHA256, TLS_AES_128_CCM_SHA256, TLS_AES_128_CCM_8_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> This parameter is returned only for HTTPS listeners.</p>
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
     * <p> This parameter is returned only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ALB</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>Indicates whether the instance is managed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The actions that users can perform on the managed instance.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is returned only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</li>
     * <li>Users can perform only specific actions on a managed instance.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("ServiceManagedInfos")
    public java.util.List<DescribeListenerResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The status of the listener. Valid values:</p>
     * <ul>
     * <li><strong>configuring</strong>: The listener is being configured.</li>
     * <li><strong>init</strong>: The listener is being initialized.</li>
     * <li><strong>updating</strong>: The listener is being updated.</li>
     * <li><strong>deleting:</strong> The listener is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The routing type of the listener. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: intelligent routing.</li>
     * <li><strong>CustomRouting</strong>: custom routing.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The configurations of the <code>XForward</code> headers.</p>
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
         * <p>This parameter is returned only if an HTTPS listener is configured and the listener port is the same as the service port of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public String fromPort;

        /**
         * <p>The last port in the range of ports that are used by the backend server to receive requests.</p>
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
         * <p>The type of the SSL certificate.</p>
         * <p>Only <strong>Server</strong> may be returned, which indicates a server certificate.</p>
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
         * <p>The first port in the range of listener ports that are used to receive and forward requests to endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port in the range of listener ports that are used to receive and forward requests to endpoints.</p>
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
         * <p>The ID of the ACL that is associated with the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>Indicates whether the access control feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled.</li>
         * <li><strong>off</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
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
         * <li><strong>Create</strong></li>
         * <li><strong>Update</strong></li>
         * <li><strong>Delete</strong></li>
         * <li><strong>Associate</strong></li>
         * <li><strong>UserUnmanaged</strong></li>
         * <li><strong>CreateChild</strong></li>
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
         * <li><strong>Listener</strong>: a listener.</li>
         * <li><strong>IpSet</strong>: an acceleration region.</li>
         * <li><strong>EndpointGroup</strong>: an endpoint group.</li>
         * <li><strong>ForwardingRule</strong>: a forwarding rule.</li>
         * <li><strong>Endpoint</strong>: an endpoint.</li>
         * <li><strong>EndpointGroupDestination</strong>: a protocol mapping of an endpoint group associated with a custom routing listener.</li>
         * <li><strong>EndpointPolicy</strong>: a traffic policy of an endpoint associated with a custom routing listener.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only if the value of <strong>Action</strong> is <strong>CreateChild</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed.</p>
         * <ul>
         * <li><strong>true</strong>: The specified actions are managed, and users cannot perform the specified actions on the managed instance.</li>
         * <li><strong>false</strong>: The specified actions are not managed, and users can perform the specified actions on the managed instance.</li>
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
         * <p>Indicates whether the <code>GA-AP</code> header is used to retrieve information about acceleration regions. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForGaApEnabled")
        public Boolean XForwardedForGaApEnabled;

        /**
         * <p>Indicates whether the <code>GA-ID</code> header is used to retrieve the ID of the GA instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForGaIdEnabled")
        public Boolean XForwardedForGaIdEnabled;

        /**
         * <p>Indicates whether the <code>GA-X-Forward-Port</code> header is used to retrieve the listener ports of the GA instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForPortEnabled")
        public Boolean XForwardedForPortEnabled;

        /**
         * <p>Indicates whether the <code>GA-X-Forward-Proto</code> header is used to retrieve the listener protocol of the GA instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Indicates whether the <code>X-Real-IP</code> header is used to retrieve client IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for HTTP and HTTPS listeners.</p>
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
