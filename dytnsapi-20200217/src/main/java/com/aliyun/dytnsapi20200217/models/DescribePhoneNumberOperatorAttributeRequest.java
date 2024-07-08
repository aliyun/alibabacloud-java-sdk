// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOperatorAttributeRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p> On the <strong>My Applications</strong> page in the <a href="https://dytns.console.aliyun.com/analysis/apply">Cell Phone Number Service console</a>, you can obtain the authorization code (also known as authorization ID).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Dd1r***4id</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The phone number to be queried.</p>
     * <ul>
     * <li>If the value of Mask is NORMAL, specify an 11-digit phone number in plaintext.</li>
     * <li>If the value of Mask is MD5, specify a 32-bit string that is encrypted by using MD5.</li>
     * <li>If the value of Mask is SHA256, specify a 64-bit string that is encrypted by using SHA256.</li>
     * </ul>
     * <blockquote>
     * <p> Letters in the encrypted strings are not case-sensitive.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139****1234</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method of the phone number. Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: The phone number is not encrypted.</li>
     * <li><strong>MD5</strong>: The phone number is MD5-encrypted.</li>
     * <li><strong>SHA256</strong>: The phone number is SHA256-encrypted.</li>
     * </ul>
     * <blockquote>
     * <p>Letters in the string must be uppercase.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MD5</p>
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
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("ResultCount")
    public String resultCount;

    public static DescribePhoneNumberOperatorAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOperatorAttributeRequest self = new DescribePhoneNumberOperatorAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOperatorAttributeRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public DescribePhoneNumberOperatorAttributeRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public DescribePhoneNumberOperatorAttributeRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public DescribePhoneNumberOperatorAttributeRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public DescribePhoneNumberOperatorAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePhoneNumberOperatorAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePhoneNumberOperatorAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribePhoneNumberOperatorAttributeRequest setResultCount(String resultCount) {
        this.resultCount = resultCount;
        return this;
    }
    public String getResultCount() {
        return this.resultCount;
    }

}
