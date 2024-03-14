// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi_intl20170725.models;

import com.aliyun.tea.*;

public class CheckVerificationRequest extends TeaModel {
    /**
     * <p>The verification code.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The service ID that is displayed in the Phone Number Verification Service console.</p>
     */
    @NameInMap("ServiceSid")
    public String serviceSid;

    /**
     * <p>The mobile phone number of the recipient. You must add the country code to the beginning of the mobile phone number. Example: 6212345\*\*\*\*01.</p>
     */
    @NameInMap("To")
    public String to;

    /**
     * <p>The unique authentication ID that is returned by calling the StartVerification operation.</p>
     */
    @NameInMap("VerificationId")
    public String verificationId;

    public static CheckVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckVerificationRequest self = new CheckVerificationRequest();
        return TeaModel.build(map, self);
    }

    public CheckVerificationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckVerificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckVerificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckVerificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CheckVerificationRequest setServiceSid(String serviceSid) {
        this.serviceSid = serviceSid;
        return this;
    }
    public String getServiceSid() {
        return this.serviceSid;
    }

    public CheckVerificationRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public CheckVerificationRequest setVerificationId(String verificationId) {
        this.verificationId = verificationId;
        return this;
    }
    public String getVerificationId() {
        return this.verificationId;
    }

}
