// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p>Log on to the <a href="https://dytns.console.aliyun.com/analysis/apply">Phone Number Service console</a>, go to the <strong>My Applications</strong> page, and obtain the authorization ID, which is the authorization code.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QASDW@#**</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The phone number to be queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>187****5620</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method of the phone number. Valid values:</p>
     * <ul>
     * <li><p><strong>NORMAL</strong>: no encryption</p>
     * </li>
     * <li><p><strong>MD5</strong></p>
     * </li>
     * <li><p><strong>SHA256</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The type of the phone number. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: mobile phone number</p>
     * </li>
     * <li><p><strong>1</strong>: mobile IMEI number</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NumberType")
    public Long numberType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The score threshold of the phone number. Valid values: <strong>0 to 100</strong>.</p>
     * <blockquote>
     * <p>Notice: Whether the specified score threshold is accepted is determined by the server. When the specified score threshold is not accepted, the data entered in this field is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Rate")
    public Long rate;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribePhoneNumberAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAnalysisRequest self = new DescribePhoneNumberAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAnalysisRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public DescribePhoneNumberAnalysisRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public DescribePhoneNumberAnalysisRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public DescribePhoneNumberAnalysisRequest setNumberType(Long numberType) {
        this.numberType = numberType;
        return this;
    }
    public Long getNumberType() {
        return this.numberType;
    }

    public DescribePhoneNumberAnalysisRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePhoneNumberAnalysisRequest setRate(Long rate) {
        this.rate = rate;
        return this;
    }
    public Long getRate() {
        return this.rate;
    }

    public DescribePhoneNumberAnalysisRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePhoneNumberAnalysisRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
