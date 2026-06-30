// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListListenersResponseBody extends TeaModel {
    /**
     * <p>The details of the listeners.</p>
     */
    @NameInMap("Listeners")
    public java.util.List<ListListenersResponseBodyListeners> listeners;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListListenersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListenersResponseBody self = new ListListenersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListListenersResponseBody setListeners(java.util.List<ListListenersResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<ListListenersResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public ListListenersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListListenersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListListenersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListListenersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListListenersResponseBodyListenersBackendPorts extends TeaModel {
        /**
         * <p>The start port of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public String fromPort;

        /**
         * <p>The end port of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ToPort")
        public String toPort;

        public static ListListenersResponseBodyListenersBackendPorts build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersBackendPorts self = new ListListenersResponseBodyListenersBackendPorts();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersBackendPorts setFromPort(String fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public String getFromPort() {
            return this.fromPort;
        }

        public ListListenersResponseBodyListenersBackendPorts setToPort(String toPort) {
            this.toPort = toPort;
            return this;
        }
        public String getToPort() {
            return this.toPort;
        }

    }

    public static class ListListenersResponseBodyListenersCertificates extends TeaModel {
        /**
         * <p>The ID of the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>44983xxxx-cn-hangzhou</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the certificate.</p>
         * <p>Only <strong>Server</strong>, which indicates a server-side certificate, is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Server</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListListenersResponseBodyListenersCertificates build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersCertificates self = new ListListenersResponseBodyListenersCertificates();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersCertificates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListListenersResponseBodyListenersCertificates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListListenersResponseBodyListenersPortRanges extends TeaModel {
        /**
         * <p>The start port used to receive and forward requests to endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The end port used to receive and forward requests to endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static ListListenersResponseBodyListenersPortRanges build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersPortRanges self = new ListListenersResponseBodyListenersPortRanges();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public ListListenersResponseBodyListenersPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class ListListenersResponseBodyListenersServiceManagedInfos extends TeaModel {
        /**
         * <p>The name of the managed policy action. Valid values:</p>
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
         * <li><p><strong>CreateChild</strong>: Create a child resource in the current instance.</p>
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
         * <li><p><strong>EndpointGroupDestination</strong>: protocol mapping of an endpoint group that is associated with a custom routing listener.</p>
         * </li>
         * <li><p><strong>EndpointPolicy</strong>: traffic policy for an endpoint that is associated with a custom routing listener.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only if the value of <strong>Action</strong> is <strong>CreateChild</strong>.</p>
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
         * <li><p><strong>true</strong>: The action is managed. You cannot perform the specified action on the managed instance.</p>
         * </li>
         * <li><p><strong>false</strong>: The action is not managed. You can perform the specified action on the managed instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static ListListenersResponseBodyListenersServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersServiceManagedInfos self = new ListListenersResponseBodyListenersServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListListenersResponseBodyListenersServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public ListListenersResponseBodyListenersServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class ListListenersResponseBodyListenersXForwardedForConfig extends TeaModel {
        /**
         * <p>Indicates whether the <code>GA-AP</code> header is used to retrieve the acceleration region information.</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
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
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
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
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
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
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
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
         * <p>Indicates whether the <code>X-Real-IP</code> header is used to retrieve the real IP address of the client.</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
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

        public static ListListenersResponseBodyListenersXForwardedForConfig build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersXForwardedForConfig self = new ListListenersResponseBodyListenersXForwardedForConfig();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForGaApEnabled(Boolean XForwardedForGaApEnabled) {
            this.XForwardedForGaApEnabled = XForwardedForGaApEnabled;
            return this;
        }
        public Boolean getXForwardedForGaApEnabled() {
            return this.XForwardedForGaApEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForGaIdEnabled(Boolean XForwardedForGaIdEnabled) {
            this.XForwardedForGaIdEnabled = XForwardedForGaIdEnabled;
            return this;
        }
        public Boolean getXForwardedForGaIdEnabled() {
            return this.XForwardedForGaIdEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForPortEnabled(Boolean XForwardedForPortEnabled) {
            this.XForwardedForPortEnabled = XForwardedForPortEnabled;
            return this;
        }
        public Boolean getXForwardedForPortEnabled() {
            return this.XForwardedForPortEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
            this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
            return this;
        }
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXRealIpEnabled(Boolean XRealIpEnabled) {
            this.XRealIpEnabled = XRealIpEnabled;
            return this;
        }
        public Boolean getXRealIpEnabled() {
            return this.XRealIpEnabled;
        }

    }

    public static class ListListenersResponseBodyListeners extends TeaModel {
        /**
         * <p>The ID of the Global Accelerator instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The port mapping of the backend server.</p>
         */
        @NameInMap("BackendPorts")
        public java.util.List<ListListenersResponseBodyListenersBackendPorts> backendPorts;

        /**
         * <p>The details of the SSL certificate.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<ListListenersResponseBodyListenersCertificates> certificates;

        /**
         * <p>Client affinity.</p>
         * <ul>
         * <li><p><strong>NONE</strong>: Client affinity is disabled. Requests from the same client are not always routed to the same endpoint.</p>
         * </li>
         * <li><p><strong>SOURCE_IP</strong>: Client affinity is enabled. When a client accesses a stateful application, all requests from the same client are routed to the same endpoint regardless of the source port or protocol.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SOURCE_IP</p>
         */
        @NameInMap("ClientAffinity")
        public String clientAffinity;

        /**
         * <p>The UNIX timestamp that indicates when the listener was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1577786252000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

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
         * <p>The listener port range.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<ListListenersResponseBodyListenersPortRanges> portRanges;

        /**
         * <p>The transport layer protocol used by the listener.</p>
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
         * <li><p><strong>true</strong>: The proxy protocol is used to preserve client IP addresses. After you enable the proxy protocol, you can retrieve the source IP addresses of clients from the backend servers.</p>
         * </li>
         * <li><p><strong>false</strong>: The proxy protocol is not used to preserve client IP addresses.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ProxyProtocol")
        @Deprecated
        public Boolean proxyProtocol;

        /**
         * <p>The timeout period for HTTP or HTTPS requests. Unit: seconds.</p>
         * <blockquote>
         * <p>This parameter is available only for HTTP and HTTPS listeners. If a backend server does not respond within the timeout period, Global Accelerator returns an HTTP 504 error to the client.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RequestTimeout")
        public Integer requestTimeout;

        /**
         * <p>The ID of the security policy instance.</p>
         * <ul>
         * <li><p><strong>tls_cipher_policy_1_0</strong></p>
         * <ul>
         * <li><p>Supported TLS versions: TLSv1.0, TLSv1.1, and TLSv1.2.</p>
         * </li>
         * <li><p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_1</strong></p>
         * <ul>
         * <li><p>Supported TLS versions: TLSv1.1 and TLSv1.2.</p>
         * </li>
         * <li><p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2</strong></p>
         * <ul>
         * <li><p>Supported TLS version: TLSv1.2.</p>
         * </li>
         * <li><p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2_strict</strong></p>
         * <ul>
         * <li><p>Supported TLS version: TLSv1.2.</p>
         * </li>
         * <li><p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2_strict_with_1_3</strong></p>
         * <ul>
         * <li><p>Supported TLS versions: TLSv1.2 and TLSv1.3.</p>
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
         * <p>This parameter is returned only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
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
         * <li><p>This parameter is returned only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
         * </li>
         * <li><p>When an instance is managed, you cannot perform some operations on the instance.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListListenersResponseBodyListenersServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The status of the listener.</p>
         * <ul>
         * <li><p><strong>active</strong>: The listener is running.</p>
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
         * <li><p><strong>Standard</strong>: smart routing.</p>
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
         * <p>The configuration of the <code>XForward</code> fields.</p>
         */
        @NameInMap("XForwardedForConfig")
        public ListListenersResponseBodyListenersXForwardedForConfig XForwardedForConfig;

        public static ListListenersResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListeners self = new ListListenersResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListeners setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListListenersResponseBodyListeners setBackendPorts(java.util.List<ListListenersResponseBodyListenersBackendPorts> backendPorts) {
            this.backendPorts = backendPorts;
            return this;
        }
        public java.util.List<ListListenersResponseBodyListenersBackendPorts> getBackendPorts() {
            return this.backendPorts;
        }

        public ListListenersResponseBodyListeners setCertificates(java.util.List<ListListenersResponseBodyListenersCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<ListListenersResponseBodyListenersCertificates> getCertificates() {
            return this.certificates;
        }

        public ListListenersResponseBodyListeners setClientAffinity(String clientAffinity) {
            this.clientAffinity = clientAffinity;
            return this;
        }
        public String getClientAffinity() {
            return this.clientAffinity;
        }

        public ListListenersResponseBodyListeners setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListListenersResponseBodyListeners setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListListenersResponseBodyListeners setHttpVersion(String httpVersion) {
            this.httpVersion = httpVersion;
            return this;
        }
        public String getHttpVersion() {
            return this.httpVersion;
        }

        public ListListenersResponseBodyListeners setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        public ListListenersResponseBodyListeners setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListListenersResponseBodyListeners setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListListenersResponseBodyListeners setPortRanges(java.util.List<ListListenersResponseBodyListenersPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<ListListenersResponseBodyListenersPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public ListListenersResponseBodyListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        @Deprecated
        public ListListenersResponseBodyListeners setProxyProtocol(Boolean proxyProtocol) {
            this.proxyProtocol = proxyProtocol;
            return this;
        }
        public Boolean getProxyProtocol() {
            return this.proxyProtocol;
        }

        public ListListenersResponseBodyListeners setRequestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        public ListListenersResponseBodyListeners setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public ListListenersResponseBodyListeners setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListListenersResponseBodyListeners setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListListenersResponseBodyListeners setServiceManagedInfos(java.util.List<ListListenersResponseBodyListenersServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }
        public java.util.List<ListListenersResponseBodyListenersServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

        public ListListenersResponseBodyListeners setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListListenersResponseBodyListeners setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListListenersResponseBodyListeners setXForwardedForConfig(ListListenersResponseBodyListenersXForwardedForConfig XForwardedForConfig) {
            this.XForwardedForConfig = XForwardedForConfig;
            return this;
        }
        public ListListenersResponseBodyListenersXForwardedForConfig getXForwardedForConfig() {
            return this.XForwardedForConfig;
        }

    }

}
