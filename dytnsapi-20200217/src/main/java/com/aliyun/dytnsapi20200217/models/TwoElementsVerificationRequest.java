// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class TwoElementsVerificationRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p>On the <strong>My Applications</strong> page of the <a href="https://dytns.console.aliyun.com/analysis/apply">Cell Phone Number Service console</a>, obtain the authorization ID, which is the authorization code.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QASDW@#**</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The phone number to be verified.</p>
     * <ul>
     * <li>If Mask is set to NORMAL, this field is in plaintext.</li>
     * <li>If Mask is set to MD5, encrypt this field with MD5.</li>
     * <li>If Mask is set to SHA256, encrypt this field with SHA256.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: Letters in the encrypted string are not case-sensitive.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li><p><strong>NORMAL</strong>: No encryption.</p>
     * </li>
     * <li><p><strong>MD5</strong></p>
     * </li>
     * <li><p><strong>SHA256</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MD5</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The name to be verified.</p>
     * <ul>
     * <li>If Mask is set to NORMAL, this field is in plaintext.</li>
     * <li>If Mask is set to MD5, encrypt this field with MD5.</li>
     * <li>If Mask is set to SHA256, encrypt this field with SHA256.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: Letters in the encrypted string are not case-sensitive.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
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
