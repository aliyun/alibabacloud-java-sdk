// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SendVerificationRequest extends TeaModel {
    /**
     * <p>The business type. Set the value to **CONTACT**.</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The mobile phone number that receives the SMS verification code.</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The mode of sending the SMS verification code. Set the value to **SMS**.</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static SendVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationRequest self = new SendVerificationRequest();
        return TeaModel.build(map, self);
    }

    public SendVerificationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SendVerificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendVerificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendVerificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendVerificationRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public SendVerificationRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
