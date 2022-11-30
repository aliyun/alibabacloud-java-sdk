// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitSipTrunkRequest extends TeaModel {
    @NameInMap("ApplyNote")
    public String applyNote;

    @NameInMap("CountryId")
    public String countryId;

    @NameInMap("InboundIpPorts")
    public String inboundIpPorts;

    @NameInMap("OutboundIps")
    public String outboundIps;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("QualificationId")
    public String qualificationId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Scene")
    public String scene;

    public static SubmitSipTrunkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSipTrunkRequest self = new SubmitSipTrunkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSipTrunkRequest setApplyNote(String applyNote) {
        this.applyNote = applyNote;
        return this;
    }
    public String getApplyNote() {
        return this.applyNote;
    }

    public SubmitSipTrunkRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public SubmitSipTrunkRequest setInboundIpPorts(String inboundIpPorts) {
        this.inboundIpPorts = inboundIpPorts;
        return this;
    }
    public String getInboundIpPorts() {
        return this.inboundIpPorts;
    }

    public SubmitSipTrunkRequest setOutboundIps(String outboundIps) {
        this.outboundIps = outboundIps;
        return this;
    }
    public String getOutboundIps() {
        return this.outboundIps;
    }

    public SubmitSipTrunkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitSipTrunkRequest setQualificationId(String qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public String getQualificationId() {
        return this.qualificationId;
    }

    public SubmitSipTrunkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitSipTrunkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitSipTrunkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
