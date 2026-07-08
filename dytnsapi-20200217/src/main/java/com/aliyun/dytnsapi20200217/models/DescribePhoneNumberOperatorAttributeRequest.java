// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOperatorAttributeRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p>On the <strong>My Applications</strong> page of the <a href="https://dytns.console.aliyun.com/analysis/apply">Cell Phone Number Service console</a>, obtain the authorization ID, which is the authorization code.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Dd1r***4id</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>A system parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The phone number that you want to query.</p>
     * <ul>
     * <li>If Mask is set to NORMAL, this field is an 11-digit phone number.</li>
     * <li>If Mask is set to MD5, this field is a 32-character encrypted string.</li>
     * <li>If Mask is set to SHA256, this field is a 64-character encrypted string.</li>
     * <li>If Mask is set to SM3, this field is a 64-character encrypted string.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: The letters in the encrypted string are not case-sensitive.</notice></p>
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
     * <li><strong>NORMAL</strong>: no encryption</li>
     * <li><strong>MD5</strong>: MD5 encryption</li>
     * <li><strong>SHA256</strong>: SHA256 encryption</li>
     * <li><strong>SM3</strong>: SM3 encryption</li>
     * </ul>
     * <blockquote>
     * <p>Notice: All letters in the string must be uppercase.</notice></p>
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
     * <p>A system parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
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
