// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisAIRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p> On the ****<a href="https://dytns.console.aliyun.com/analysis/square"><strong>Labels</strong></a> page, find the label that you want to use, click Activate Now, enter the required information, and then submit your application. After your application is approved, you can obtain an authorization code.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HwD***nG</p>
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
     * <p>The model parameter configuration. This field is required by some labels.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;trainingJobId&quot;: &quot;17**********48&quot;}</p>
     */
    @NameInMap("ModelConfig")
    public String modelConfig;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The score threshold for the phone number. Valid values: <strong>0 to 100</strong>.</p>
     * <blockquote>
     * <p> The system provided by Alibaba Cloud determines whether to accept the specified score threshold. When the system does not accept the specified score threshold, the value of this field is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Rate")
    public Long rate;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribePhoneNumberAnalysisAIRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAnalysisAIRequest self = new DescribePhoneNumberAnalysisAIRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAnalysisAIRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public DescribePhoneNumberAnalysisAIRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public DescribePhoneNumberAnalysisAIRequest setModelConfig(String modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public String getModelConfig() {
        return this.modelConfig;
    }

    public DescribePhoneNumberAnalysisAIRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePhoneNumberAnalysisAIRequest setRate(Long rate) {
        this.rate = rate;
        return this;
    }
    public Long getRate() {
        return this.rate;
    }

    public DescribePhoneNumberAnalysisAIRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePhoneNumberAnalysisAIRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
