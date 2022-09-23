// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateSubsTrialRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoneA")
    public String phoneA;

    @NameInMap("PhoneB")
    public String phoneB;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResType")
    public String resType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateSubsTrialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubsTrialRequest self = new CreateSubsTrialRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubsTrialRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSubsTrialRequest setPhoneA(String phoneA) {
        this.phoneA = phoneA;
        return this;
    }
    public String getPhoneA() {
        return this.phoneA;
    }

    public CreateSubsTrialRequest setPhoneB(String phoneB) {
        this.phoneB = phoneB;
        return this;
    }
    public String getPhoneB() {
        return this.phoneB;
    }

    public CreateSubsTrialRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateSubsTrialRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public CreateSubsTrialRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSubsTrialRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
