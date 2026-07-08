// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForSmsRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p>On the <strong>My Applications</strong> page in the <a href="https://dytns.console.aliyun.com/analysis/apply">Phone Number Pedia console</a>, obtain the authorization ID and use it as the value for this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zf08***pi6</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The phone number to query.</p>
     * <ul>
     * <li><p>If <code>Mask</code> is set to <code>NORMAL</code>, specify an 11-digit phone number.</p>
     * </li>
     * <li><p>If <code>Mask</code> is set to <code>MD5</code>, specify a 32-character encrypted string.</p>
     * </li>
     * <li><p>If <code>Mask</code> is set to <code>SHA256</code>, specify a 64-character encrypted string.</p>
     * </li>
     * <li><p>If <code>Mask</code> is set to <code>SM3</code>, specify a 64-character encrypted string.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The encrypted string is not case-sensitive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>181****1234</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method for the phone number. Valid values:</p>
     * <ul>
     * <li><p><strong>NORMAL</strong>: The number is not encrypted.</p>
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

    public static PhoneNumberStatusForSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForSmsRequest self = new PhoneNumberStatusForSmsRequest();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForSmsRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public PhoneNumberStatusForSmsRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public PhoneNumberStatusForSmsRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public PhoneNumberStatusForSmsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PhoneNumberStatusForSmsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PhoneNumberStatusForSmsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
