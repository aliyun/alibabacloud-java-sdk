// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class TwoElementsVerificationRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <br>
     * <p>>  On the **My Applications** page in the [Cell Phone Number Service console](https://dytns.console.aliyun.com/analysis/apply), you can obtain the authorization code (also known as authorization ID).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The phone number to be verified.</p>
     * <br>
     * <p>*   If the value of Mask is NORMAL, specify a value in plaintext for this field.</p>
     * <p>*   If the value of Mask is MD5, specify a MD5-encrypted value for this field.</p>
     * <p>*   If the value of Mask is SHA256, specify a SHA256-encrypted value for this field.</p>
     * <br>
     * <p>>  Letters in the encrypted strings are not case-sensitive.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method. Valid values:</p>
     * <br>
     * <p>*   **NORMAL**: plaintext</p>
     * <p>*   **MD5**</p>
     * <p>*   **SHA256**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The name to be verified.</p>
     * <br>
     * <p>*   If the value of Mask is NORMAL, specify a value in plaintext for this field.</p>
     * <p>*   If the value of Mask is MD5, specify a MD5-encrypted value for this field.</p>
     * <p>*   If the value of Mask is SHA256, specify a SHA256-encrypted value for this field.</p>
     * <br>
     * <p>>  Letters in the encrypted strings are not case-sensitive.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static TwoElementsVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        TwoElementsVerificationRequest self = new TwoElementsVerificationRequest();
        return TeaModel.build(map, self);
    }

    public TwoElementsVerificationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public TwoElementsVerificationRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public TwoElementsVerificationRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public TwoElementsVerificationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TwoElementsVerificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TwoElementsVerificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TwoElementsVerificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
