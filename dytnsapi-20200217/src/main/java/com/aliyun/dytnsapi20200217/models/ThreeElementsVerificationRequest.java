// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class ThreeElementsVerificationRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p>On the <strong>My Applications</strong> page of the <a href="https://dytns.console.aliyun.com/analysis/apply">Cell Phone Number Service console</a>, the authorization ID is the authorization code.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QASDW@#**</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The ID card number to be verified.</p>
     * <ul>
     * <li>If Mask is set to NORMAL, this field is in plaintext.</li>
     * <li>If Mask is set to MD5, encrypt this field by using MD5.</li>
     * <li>If Mask is set to SHA256, encrypt this field by using SHA256.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: Letters in the encrypted string are case-insensitive.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>83d8040d3cb2181e04****dc6ff5566d4493876a4a5da782887446356b0a787e</p>
     */
    @NameInMap("CertCode")
    public String certCode;

    /**
     * <p>The phone number to be verified.</p>
     * <ul>
     * <li>If Mask is set to NORMAL, this field is in plaintext.</li>
     * <li>If Mask is set to MD5, encrypt this field by using MD5.</li>
     * <li>If Mask is set to SHA256, encrypt this field by using SHA256.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: Letters in the encrypted string are case-insensitive.</p>
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
     * <li>If Mask is set to MD5, encrypt this field by using MD5.</li>
     * <li>If Mask is set to SHA256, encrypt this field by using SHA256.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: Letters in the encrypted string are case-insensitive.</p>
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
