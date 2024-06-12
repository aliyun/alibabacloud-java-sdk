// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForPublicRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <br>
     * <p>>  On the **My Applications** page in the [Cell Phone Number Service console](https://dytns.console.aliyun.com/analysis/apply), you can obtain the authorization ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The phone number to be queried.</p>
     * <br>
     * <p>*   If the value of Mask is NORMAL, the value of this field is an 11-digit phone number.</p>
     * <p>*   If the value of Mask is MD5, the value of this field is a 32-bit encrypted string.</p>
     * <p>*   If the value of Mask is SHA256, the value of this field is a 64-bit encrypted string.</p>
     * <br>
     * <p>>  Letters in the encrypted strings are not case-sensitive.</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method of the phone number. Valid values:</p>
     * <br>
     * <p>*   **NORMAL**: The phone number is not encrypted.</p>
     * <p>*   **MD5**</p>
     * <p>*   **SHA256**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mask")
    public String mask;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static PhoneNumberStatusForPublicRequest build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForPublicRequest self = new PhoneNumberStatusForPublicRequest();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForPublicRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public PhoneNumberStatusForPublicRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public PhoneNumberStatusForPublicRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public PhoneNumberStatusForPublicRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PhoneNumberStatusForPublicRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PhoneNumberStatusForPublicRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
