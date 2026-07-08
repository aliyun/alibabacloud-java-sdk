// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOnlineTimeRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p>Log on to the <a href="https://dytns.console.aliyun.com/analysis/apply">Cell Phone Number Service console</a>, go to the <strong>My Applications</strong> page, and obtain the authorization ID, which is the authorization code.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QASDW@#**</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The external carrier. Valid values:</p>
     * <ul>
     * <li><strong>MOBILE</strong>: China Mobile.</li>
     * <li><strong>UNICOM</strong>: China Unicom.</li>
     * <li><strong>TELECOM</strong>: China Telecom.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: This parameter is optional. Alibaba Cloud automatically determines the carrier type based on the phone number. The value of this field has no impact on the query result.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>UNICOM</p>
     */
    @NameInMap("Carrier")
    public String carrier;

    /**
     * <p>The phone number to be queried.</p>
     * <ul>
     * <li>If Mask is set to NORMAL, this field is an 11-digit phone number.</li>
     * <li>If Mask is set to MD5, this field is a 32-character encrypted string.</li>
     * <li>If Mask is set to SHA256, this field is a 64-character encrypted string.</li>
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
     * <p>The encryption method of the phone number. Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: no encryption</li>
     * <li><strong>MD5</strong></li>
     * <li><strong>SHA256</strong></li>
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

    public static DescribePhoneNumberOnlineTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOnlineTimeRequest self = new DescribePhoneNumberOnlineTimeRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOnlineTimeRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public DescribePhoneNumberOnlineTimeRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public DescribePhoneNumberOnlineTimeRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public DescribePhoneNumberOnlineTimeRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public DescribePhoneNumberOnlineTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePhoneNumberOnlineTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePhoneNumberOnlineTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
