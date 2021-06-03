// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateListenerRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientAffinity")
    public String clientAffinity;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("ProxyProtocol")
    public Boolean proxyProtocol;

    @NameInMap("PortRanges")
    public java.util.List<CreateListenerRequestPortRanges> portRanges;

    @NameInMap("Certificates")
    public java.util.List<CreateListenerRequestCertificates> certificates;

    public static CreateListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateListenerRequest self = new CreateListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateListenerRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateListenerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateListenerRequest setClientAffinity(String clientAffinity) {
        this.clientAffinity = clientAffinity;
        return this;
    }
    public String getClientAffinity() {
        return this.clientAffinity;
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

    public CreateListenerRequest setPortRanges(java.util.List<CreateListenerRequestPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<CreateListenerRequestPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public CreateListenerRequest setCertificates(java.util.List<CreateListenerRequestCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<CreateListenerRequestCertificates> getCertificates() {
        return this.certificates;
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

}
