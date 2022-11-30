// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitNumberShrinkRequest extends TeaModel {
    @NameInMap("ApplyNote")
    public String applyNote;

    @NameInMap("CountryId")
    public String countryId;

    @NameInMap("NumberList")
    public String numberListShrink;

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

    public static SubmitNumberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitNumberShrinkRequest self = new SubmitNumberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitNumberShrinkRequest setApplyNote(String applyNote) {
        this.applyNote = applyNote;
        return this;
    }
    public String getApplyNote() {
        return this.applyNote;
    }

    public SubmitNumberShrinkRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public SubmitNumberShrinkRequest setNumberListShrink(String numberListShrink) {
        this.numberListShrink = numberListShrink;
        return this;
    }
    public String getNumberListShrink() {
        return this.numberListShrink;
    }

    public SubmitNumberShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitNumberShrinkRequest setQualificationId(String qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public String getQualificationId() {
        return this.qualificationId;
    }

    public SubmitNumberShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitNumberShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitNumberShrinkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
