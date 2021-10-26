// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateListenerRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientAffinity")
    public String clientAffinity;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("ProxyProtocol")
    public String proxyProtocol;

    @NameInMap("PortRanges")
    public java.util.List<UpdateListenerRequestPortRanges> portRanges;

    @NameInMap("Certificates")
    public java.util.List<UpdateListenerRequestCertificates> certificates;

    @NameInMap("BackendPorts")
    public java.util.List<UpdateListenerRequestBackendPorts> backendPorts;

    @NameInMap("XForwardedForConfig")
    public UpdateListenerRequestXForwardedForConfig XForwardedForConfig;

    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    public static UpdateListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerRequest self = new UpdateListenerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateListenerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateListenerRequest setClientAffinity(String clientAffinity) {
        this.clientAffinity = clientAffinity;
        return this;
    }
    public String getClientAffinity() {
        return this.clientAffinity;
    }

    public UpdateListenerRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateListenerRequest setProxyProtocol(String proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
        return this;
    }
    public String getProxyProtocol() {
        return this.proxyProtocol;
    }

    public UpdateListenerRequest setPortRanges(java.util.List<UpdateListenerRequestPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<UpdateListenerRequestPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public UpdateListenerRequest setCertificates(java.util.List<UpdateListenerRequestCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<UpdateListenerRequestCertificates> getCertificates() {
        return this.certificates;
    }

    public UpdateListenerRequest setBackendPorts(java.util.List<UpdateListenerRequestBackendPorts> backendPorts) {
        this.backendPorts = backendPorts;
        return this;
    }
    public java.util.List<UpdateListenerRequestBackendPorts> getBackendPorts() {
        return this.backendPorts;
    }

    public UpdateListenerRequest setXForwardedForConfig(UpdateListenerRequestXForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
        return this;
    }
    public UpdateListenerRequestXForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public UpdateListenerRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public static class UpdateListenerRequestPortRanges extends TeaModel {
        @NameInMap("FromPort")
        public Integer fromPort;

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

    public static class UpdateListenerRequestCertificates extends TeaModel {
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

    public static class UpdateListenerRequestBackendPorts extends TeaModel {
        @NameInMap("FromPort")
        public Integer fromPort;

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

    public static class UpdateListenerRequestXForwardedForConfig extends TeaModel {
        @NameInMap("XForwardedForGaIdEnabled")
        public Boolean XForwardedForGaIdEnabled;

        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        @NameInMap("XForwardedForPortEnabled")
        public Boolean XForwardedForPortEnabled;

        @NameInMap("XRealIpEnabled")
        public Boolean XRealIpEnabled;

        @NameInMap("XForwardedForGaApEnabled")
        public Boolean XForwardedForGaApEnabled;

        public static UpdateListenerRequestXForwardedForConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerRequestXForwardedForConfig self = new UpdateListenerRequestXForwardedForConfig();
            return TeaModel.build(map, self);
        }

        public UpdateListenerRequestXForwardedForConfig setXForwardedForGaIdEnabled(Boolean XForwardedForGaIdEnabled) {
            this.XForwardedForGaIdEnabled = XForwardedForGaIdEnabled;
            return this;
        }
        public Boolean getXForwardedForGaIdEnabled() {
            return this.XForwardedForGaIdEnabled;
        }

        public UpdateListenerRequestXForwardedForConfig setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
            this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
            return this;
        }
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        public UpdateListenerRequestXForwardedForConfig setXForwardedForPortEnabled(Boolean XForwardedForPortEnabled) {
            this.XForwardedForPortEnabled = XForwardedForPortEnabled;
            return this;
        }
        public Boolean getXForwardedForPortEnabled() {
            return this.XForwardedForPortEnabled;
        }

        public UpdateListenerRequestXForwardedForConfig setXRealIpEnabled(Boolean XRealIpEnabled) {
            this.XRealIpEnabled = XRealIpEnabled;
            return this;
        }
        public Boolean getXRealIpEnabled() {
            return this.XRealIpEnabled;
        }

        public UpdateListenerRequestXForwardedForConfig setXForwardedForGaApEnabled(Boolean XForwardedForGaApEnabled) {
            this.XForwardedForGaApEnabled = XForwardedForGaApEnabled;
            return this;
        }
        public Boolean getXForwardedForGaApEnabled() {
            return this.XForwardedForGaApEnabled;
        }

    }

}
