// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitNumberRequest extends TeaModel {
    @NameInMap("ApplyNote")
    public String applyNote;

    @NameInMap("CountryId")
    public String countryId;

    @NameInMap("NumberList")
    public java.util.List<SubmitNumberRequestNumberList> numberList;

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

    public static SubmitNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitNumberRequest self = new SubmitNumberRequest();
        return TeaModel.build(map, self);
    }

    public SubmitNumberRequest setApplyNote(String applyNote) {
        this.applyNote = applyNote;
        return this;
    }
    public String getApplyNote() {
        return this.applyNote;
    }

    public SubmitNumberRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public SubmitNumberRequest setNumberList(java.util.List<SubmitNumberRequestNumberList> numberList) {
        this.numberList = numberList;
        return this;
    }
    public java.util.List<SubmitNumberRequestNumberList> getNumberList() {
        return this.numberList;
    }

    public SubmitNumberRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitNumberRequest setQualificationId(String qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public String getQualificationId() {
        return this.qualificationId;
    }

    public SubmitNumberRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitNumberRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitNumberRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public static class SubmitNumberRequestNumberList extends TeaModel {
        @NameInMap("Amount")
        public Long amount;

        @NameInMap("InboundConcurrency")
        public Long inboundConcurrency;

        @NameInMap("OutboundConcurrency")
        public Long outboundConcurrency;

        @NameInMap("PhoneType")
        public Long phoneType;

        @NameInMap("Support")
        public Long support;

        public static SubmitNumberRequestNumberList build(java.util.Map<String, ?> map) throws Exception {
            SubmitNumberRequestNumberList self = new SubmitNumberRequestNumberList();
            return TeaModel.build(map, self);
        }

        public SubmitNumberRequestNumberList setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public SubmitNumberRequestNumberList setInboundConcurrency(Long inboundConcurrency) {
            this.inboundConcurrency = inboundConcurrency;
            return this;
        }
        public Long getInboundConcurrency() {
            return this.inboundConcurrency;
        }

        public SubmitNumberRequestNumberList setOutboundConcurrency(Long outboundConcurrency) {
            this.outboundConcurrency = outboundConcurrency;
            return this;
        }
        public Long getOutboundConcurrency() {
            return this.outboundConcurrency;
        }

        public SubmitNumberRequestNumberList setPhoneType(Long phoneType) {
            this.phoneType = phoneType;
            return this;
        }
        public Long getPhoneType() {
            return this.phoneType;
        }

        public SubmitNumberRequestNumberList setSupport(Long support) {
            this.support = support;
            return this;
        }
        public Long getSupport() {
            return this.support;
        }

    }

}
