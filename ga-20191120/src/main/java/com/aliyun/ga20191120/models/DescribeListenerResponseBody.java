// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeListenerResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("AclType")
    public String aclType;

    @NameInMap("BackendPorts")
    public java.util.List<DescribeListenerResponseBodyBackendPorts> backendPorts;

    @NameInMap("Certificates")
    public java.util.List<DescribeListenerResponseBodyCertificates> certificates;

    @NameInMap("ClientAffinity")
    public String clientAffinity;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PortRanges")
    public java.util.List<DescribeListenerResponseBodyPortRanges> portRanges;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("ProxyProtocol")
    public Boolean proxyProtocol;

    @NameInMap("RelatedAcls")
    public java.util.List<DescribeListenerResponseBodyRelatedAcls> relatedAcls;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    @NameInMap("State")
    public String state;

    @NameInMap("Type")
    public String type;

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

    public DescribeListenerResponseBody setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
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
        @NameInMap("FromPort")
        public String fromPort;

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
        @NameInMap("Id")
        public String id;

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
        @NameInMap("FromPort")
        public Integer fromPort;

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
        @NameInMap("AclId")
        public String aclId;

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

    public static class DescribeListenerResponseBodyXForwardedForConfig extends TeaModel {
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
