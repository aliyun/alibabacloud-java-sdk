// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappMigrationVerifiedRequest extends TeaModel {
    /**
     * <p>The space ID of the RAM user within the independent software vendor (ISV) account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861380001234</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The verification code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>828798</p>
     */
    @NameInMap("VerifyCode")
    public String verifyCode;

    public static ChatappMigrationVerifiedRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatappMigrationVerifiedRequest self = new ChatappMigrationVerifiedRequest();
        return TeaModel.build(map, self);
    }

    public ChatappMigrationVerifiedRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ChatappMigrationVerifiedRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChatappMigrationVerifiedRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ChatappMigrationVerifiedRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ChatappMigrationVerifiedRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ChatappMigrationVerifiedRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
