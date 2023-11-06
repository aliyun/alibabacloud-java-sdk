// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListListenersResponseBody extends TeaModel {
    /**
     * <p>The information about the listeners.</p>
     */
    @NameInMap("Listeners")
    public java.util.List<ListListenersResponseBodyListeners> listeners;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The start port in the range of ports used by the backend server.</p>
         */
        @NameInMap("FromPort")
        public String fromPort;

        /**
         * <p>The end port in the range of ports used by the backend server.</p>
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
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the certificate.</p>
         * <br>
         * <p>Only **Server** can be returned, which indicates a server certificate.</p>
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
         * <p>The start port in the range of listener ports used to receive and forward requests to endpoints.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The start port in the range of listener ports used to receive and forward requests to endpoints.</p>
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
         * <p>Managed policy action name, Valid values:</p>
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
         * <br>
         * <p>- true: The managed policy action is managed, and users do not have permission to perform the operation specified in the Action on the managed instance.</p>
         * <br>
         * <p>- false: The managed policy action is not managed, and users have permission to perform the operation specified in the Action on the managed instance.</p>
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
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         * <br>
         * <p>>  This parameter is returned only for HTTP and HTTPS listeners.</p>
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
         * <p>The ID of the GA instance.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>Details about the ports that can be used by the backend server.</p>
         */
        @NameInMap("BackendPorts")
        public java.util.List<ListListenersResponseBodyListenersBackendPorts> backendPorts;

        /**
         * <p>Details about the SSL certificates.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<ListListenersResponseBodyListenersCertificates> certificates;

        /**
         * <p>Indicates whether client affinity is enabled for the listener.</p>
         * <br>
         * <p>*   If **NONE** is returned, client affinity is disabled. In this case, requests from the same client may be forwarded to different endpoints.</p>
         * <p>*   If **SOURCE_IP** is returned, client affinity is enabled. In this case, when a client accesses stateful applications, requests from the same client are always forwarded to the same endpoint regardless of the source port or protocol.</p>
         */
        @NameInMap("ClientAffinity")
        public String clientAffinity;

        /**
         * <p>The timestamp that indicates that the listener was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

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
        public java.util.List<ListListenersResponseBodyListenersPortRanges> portRanges;

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
        public java.util.List<ListListenersResponseBodyListenersServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The state of the listener. Valid values:</p>
         * <br>
         * <p>*   **active**: The listener is normal.</p>
         * <p>*   **init**: The listener is being initialized.</p>
         * <p>*   **updating**: The listener is being configured.</p>
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
