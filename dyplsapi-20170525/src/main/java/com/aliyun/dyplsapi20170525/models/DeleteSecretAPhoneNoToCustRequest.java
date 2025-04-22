// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSecretAPhoneNoToCustRequest extends TeaModel {
    /**
     * <p>A号码组ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51</p>
     */
    @NameInMap("ANoWhiteGroupId")
    public Long ANoWhiteGroupId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>A号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>130*****1234</p>
     */
    @NameInMap("PhoneNoA")
    public String phoneNoA;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteSecretAPhoneNoToCustRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretAPhoneNoToCustRequest self = new DeleteSecretAPhoneNoToCustRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecretAPhoneNoToCustRequest setANoWhiteGroupId(Long ANoWhiteGroupId) {
        this.ANoWhiteGroupId = ANoWhiteGroupId;
        return this;
    }
    public Long getANoWhiteGroupId() {
        return this.ANoWhiteGroupId;
    }

    public DeleteSecretAPhoneNoToCustRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSecretAPhoneNoToCustRequest setPhoneNoA(String phoneNoA) {
        this.phoneNoA = phoneNoA;
        return this;
    }
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    public DeleteSecretAPhoneNoToCustRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteSecretAPhoneNoToCustRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
