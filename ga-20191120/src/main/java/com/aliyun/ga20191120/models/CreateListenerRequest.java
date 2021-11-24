// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateListenerRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("Certificates")
    public java.util.List<CreateListenerRequestCertificates> certificates;

    @NameInMap("ClientAffinity")
    public String clientAffinity;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("PortRanges")
    public java.util.List<CreateListenerRequestPortRanges> portRanges;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("ProxyProtocol")
    public Boolean proxyProtocol;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    @NameInMap("XForwardedForConfig")
    public CreateListenerRequestXForwardedForConfig XForwardedForConfig;

    public static CreateListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateListenerRequest self = new CreateListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateListenerRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateListenerRequest setCertificates(java.util.List<CreateListenerRequestCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<CreateListenerRequestCertificates> getCertificates() {
        return this.certificates;
    }

    public CreateListenerRequest setClientAffinity(String clientAffinity) {
        this.clientAffinity = clientAffinity;
        return this;
    }
    public String getClientAffinity() {
        return this.clientAffinity;
    }

    public CreateListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateListenerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateListenerRequest setPortRanges(java.util.List<CreateListenerRequestPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<CreateListenerRequestPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public CreateListenerRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateListenerRequest setProxyProtocol(Boolean proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
        return this;
    }
    public Boolean getProxyProtocol() {
        return this.proxyProtocol;
    }

    public CreateListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateListenerRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public CreateListenerRequest setXForwardedForConfig(CreateListenerRequestXForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
        return this;
    }
    public CreateListenerRequestXForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public static class CreateListenerRequestCertificates extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static CreateListenerRequestCertificates build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestCertificates self = new CreateListenerRequestCertificates();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestCertificates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class CreateListenerRequestPortRanges extends TeaModel {
        @NameInMap("FromPort")
        public Integer fromPort;

        @NameInMap("ToPort")
        public Integer toPort;

        public static CreateListenerRequestPortRanges build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestPortRanges self = new CreateListenerRequestPortRanges();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public CreateListenerRequestPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class CreateListenerRequestXForwardedForConfig extends TeaModel {
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

        public static CreateListenerRequestXForwardedForConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestXForwardedForConfig self = new CreateListenerRequestXForwardedForConfig();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForGaApEnabled(Boolean XForwardedForGaApEnabled) {
            this.XForwardedForGaApEnabled = XForwardedForGaApEnabled;
            return this;
        }
        public Boolean getXForwardedForGaApEnabled() {
            return this.XForwardedForGaApEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForGaIdEnabled(Boolean XForwardedForGaIdEnabled) {
            this.XForwardedForGaIdEnabled = XForwardedForGaIdEnabled;
            return this;
        }
        public Boolean getXForwardedForGaIdEnabled() {
            return this.XForwardedForGaIdEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForPortEnabled(Boolean XForwardedForPortEnabled) {
            this.XForwardedForPortEnabled = XForwardedForPortEnabled;
            return this;
        }
        public Boolean getXForwardedForPortEnabled() {
            return this.XForwardedForPortEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
            this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
            return this;
        }
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXRealIpEnabled(Boolean XRealIpEnabled) {
            this.XRealIpEnabled = XRealIpEnabled;
            return this;
        }
        public Boolean getXRealIpEnabled() {
            return this.XRealIpEnabled;
        }

    }

}
