// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListListenersResponseBody extends TeaModel {
    @NameInMap("Listeners")
    public java.util.List<ListListenersResponseBodyListeners> listeners;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("FromPort")
        public String fromPort;

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
        @NameInMap("Id")
        public String id;

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
        @NameInMap("FromPort")
        public Integer fromPort;

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

    public static class ListListenersResponseBodyListenersXForwardedForConfig extends TeaModel {
        @NameInMap("XForwardedForGaApEnabled")
        public Boolean XForwardedForGaApEnabled;

        @NameInMap("XForwardedForGaIdEnabled")
        public Boolean XForwardedForGaIdEnabled;

        @NameInMap("XForwardedForPortEnabled")
        public Boolean XForwardedForPortEnabled;

        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

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
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("BackendPorts")
        public java.util.List<ListListenersResponseBodyListenersBackendPorts> backendPorts;

        @NameInMap("Certificates")
        public java.util.List<ListListenersResponseBodyListenersCertificates> certificates;

        @NameInMap("ClientAffinity")
        public String clientAffinity;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("Name")
        public String name;

        @NameInMap("PortRanges")
        public java.util.List<ListListenersResponseBodyListenersPortRanges> portRanges;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("ProxyProtocol")
        public Boolean proxyProtocol;

        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        @NameInMap("State")
        public String state;

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

        public ListListenersResponseBodyListeners setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public ListListenersResponseBodyListeners setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
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
