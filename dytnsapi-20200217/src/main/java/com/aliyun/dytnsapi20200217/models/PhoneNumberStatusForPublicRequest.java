// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForPublicRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p>On the <strong>My Applications</strong> page of the <a href="https://dytns.console.aliyun.com/analysis/apply">Phone Number Intelligence console</a>, you can obtain the authorization ID and use it as the authorization code.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Dd1r***4id</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The phone number to be queried.</p>
     * <ul>
     * <li><p>If <code>Mask</code> is set to <code>NORMAL</code>, this parameter must be an 11-digit mobile phone number.</p>
     * </li>
     * <li><p>If <code>Mask</code> is set to <code>MD5</code>, this parameter must be a 32-character encrypted string.</p>
     * </li>
     * <li><p>If <code>Mask</code> is set to <code>SHA256</code>, this parameter must be a 64-character encrypted string.</p>
     * </li>
     * <li><p>If <code>Mask</code> is set to <code>SM3</code>, this parameter must be a 64-character encrypted string.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The encrypted strings are case-insensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>139****1234</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li><p><strong>NORMAL</strong>: The phone number is not encrypted.</p>
     * </li>
     * <li><p><strong>MD5</strong></p>
     * </li>
     * <li><p><strong>SHA256</strong></p>
     * </li>
     * <li><p><strong>SM3</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
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
