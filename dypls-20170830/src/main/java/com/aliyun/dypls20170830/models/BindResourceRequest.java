// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class BindResourceRequest extends TeaModel {
    @NameInMap("AsrModelId")
    public String asrModelId;

    @NameInMap("AsrStatus")
    public Boolean asrStatus;

    @NameInMap("AxnExtensionB")
    public String axnExtensionB;

    @NameInMap("BillId")
    public String billId;

    @NameInMap("ExpTime")
    public String expTime;

    @NameInMap("IsRecord")
    public Boolean isRecord;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoneNoA")
    public String phoneNoA;

    @NameInMap("PhoneNoB")
    public String phoneNoB;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResType")
    public Integer resType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecretNo")
    public String secretNo;

    public static BindResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindResourceRequest self = new BindResourceRequest();
        return TeaModel.build(map, self);
    }

    public BindResourceRequest setAsrModelId(String asrModelId) {
        this.asrModelId = asrModelId;
        return this;
    }
    public String getAsrModelId() {
        return this.asrModelId;
    }

    public BindResourceRequest setAsrStatus(Boolean asrStatus) {
        this.asrStatus = asrStatus;
        return this;
    }
    public Boolean getAsrStatus() {
        return this.asrStatus;
    }

    public BindResourceRequest setAxnExtensionB(String axnExtensionB) {
        this.axnExtensionB = axnExtensionB;
        return this;
    }
    public String getAxnExtensionB() {
        return this.axnExtensionB;
    }

    public BindResourceRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public BindResourceRequest setExpTime(String expTime) {
        this.expTime = expTime;
        return this;
    }
    public String getExpTime() {
        return this.expTime;
    }

    public BindResourceRequest setIsRecord(Boolean isRecord) {
        this.isRecord = isRecord;
        return this;
    }
    public Boolean getIsRecord() {
        return this.isRecord;
    }

    public BindResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindResourceRequest setPhoneNoA(String phoneNoA) {
        this.phoneNoA = phoneNoA;
        return this;
    }
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    public BindResourceRequest setPhoneNoB(String phoneNoB) {
        this.phoneNoB = phoneNoB;
        return this;
    }
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    public BindResourceRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public BindResourceRequest setResType(Integer resType) {
        this.resType = resType;
        return this;
    }
    public Integer getResType() {
        return this.resType;
    }

    public BindResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindResourceRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

}
