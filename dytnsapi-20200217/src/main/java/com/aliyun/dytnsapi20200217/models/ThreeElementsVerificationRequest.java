// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class ThreeElementsVerificationRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <br>
     * <p>>  On the **My Applications** page in the [Cell Phone Number Service console](https://dytns.console.aliyun.com/analysis/apply), you can obtain the authorization code (also known as authorization ID).</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The ID card number to be verified.</p>
     * <br>
     * <p>*   If the value of Mask is NORMAL, specify a value in plaintext for this field.</p>
     * <p>*   If the value of Mask is MD5, specify a MD5-encrypted value for this field.</p>
     * <p>*   If the value of Mask is SHA256, specify a SHA256-encrypted value for this field.</p>
     * <br>
     * <p>>  Letters in the encrypted strings are not case-sensitive.</p>
     */
    @NameInMap("CertCode")
    public String certCode;

    /**
     * <p>The phone number to be verified.</p>
     * <br>
     * <p>*   If the value of Mask is NORMAL, specify a value in plaintext for this field.</p>
     * <p>*   If the value of Mask is MD5, specify a MD5-encrypted value for this field.</p>
     * <p>*   If the value of Mask is SHA256, specify a SHA256-encrypted value for this field.</p>
     * <br>
     * <p>>  Letters in the encrypted strings are not case-sensitive.</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method. Valid values:</p>
     * <br>
     * <p>*   **NORMAL**: The phone number is not encrypted.</p>
     * <p>*   **MD5**</p>
     * <p>*   **SHA256**</p>
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
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ThreeElementsVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        ThreeElementsVerificationRequest self = new ThreeElementsVerificationRequest();
        return TeaModel.build(map, self);
    }

    public ThreeElementsVerificationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public ThreeElementsVerificationRequest setCertCode(String certCode) {
        this.certCode = certCode;
        return this;
    }
    public String getCertCode() {
        return this.certCode;
    }

    public ThreeElementsVerificationRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public ThreeElementsVerificationRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public ThreeElementsVerificationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ThreeElementsVerificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ThreeElementsVerificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ThreeElementsVerificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
