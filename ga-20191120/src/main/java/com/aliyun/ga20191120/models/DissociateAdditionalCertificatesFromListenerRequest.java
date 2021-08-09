// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DissociateAdditionalCertificatesFromListenerRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("Domains")
    public java.util.List<String> domains;

    public static DissociateAdditionalCertificatesFromListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateAdditionalCertificatesFromListenerRequest self = new DissociateAdditionalCertificatesFromListenerRequest();
        return TeaModel.build(map, self);
    }

    public DissociateAdditionalCertificatesFromListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DissociateAdditionalCertificatesFromListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DissociateAdditionalCertificatesFromListenerRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DissociateAdditionalCertificatesFromListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DissociateAdditionalCertificatesFromListenerRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

}
