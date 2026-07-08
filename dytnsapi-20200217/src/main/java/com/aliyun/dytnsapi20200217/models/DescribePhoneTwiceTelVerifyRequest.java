// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneTwiceTelVerifyRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p>On the <strong>My Applications</strong> page in the <a href="https://dytns.console.aliyun.com/analysis/apply">Phone Number Verification Service console</a>, get the Authorization ID. This ID is your authorization code.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Dd1r***4id</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The phone number to be queried. The number can be a mobile phone number or an encrypted string.</p>
     * <ul>
     * <li><p>If the value of <strong>Mask</strong> is <strong>NORMAL</strong>, <strong>InputNumber</strong> is an 11-digit mobile phone number.</p>
     * </li>
     * <li><p>If the value of <strong>Mask</strong> is <strong>MD5</strong>, <strong>InputNumber</strong> is a 32-bit encrypted string.</p>
     * </li>
     * <li><p>If the value of <strong>Mask</strong> is <strong>SHA256</strong>, <strong>InputNumber</strong> is a 64-bit encrypted string.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The encrypted string is not case-sensitive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139*******</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method of the phone number. Valid values:</p>
     * <ul>
     * <li><p><strong>NORMAL</strong>: The phone number is not encrypted.</p>
     * </li>
     * <li><p><strong>MD5</strong></p>
     * </li>
     * <li><p><strong>SHA256</strong></p>
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

    /**
     * <p>The registration time of a phone number. The time must be in the <code>yyyy-MM-dd HH:mm:ss</code> format. The value of this parameter is the registration time of a mobile phone user in your business. If the registration time is later than the time when a carrier assigns a number, the number is not a recycled number. Otherwise, the number is a recycled number.</p>
     * <blockquote>
     * <ul>
     * <li><p>If a phone number is assigned for multiple times, the system uses the last assignment time as the criterion.</p>
     * </li>
     * <li><p>The registration time must be later than <code>1970-01-01 00:00:00</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-01 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribePhoneTwiceTelVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneTwiceTelVerifyRequest self = new DescribePhoneTwiceTelVerifyRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhoneTwiceTelVerifyRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public DescribePhoneTwiceTelVerifyRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public DescribePhoneTwiceTelVerifyRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public DescribePhoneTwiceTelVerifyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePhoneTwiceTelVerifyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePhoneTwiceTelVerifyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribePhoneTwiceTelVerifyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
