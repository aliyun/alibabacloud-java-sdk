// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisAIRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p>In <strong>Cell Phone Number Service</strong> -&gt; <a href="https://dytns.console.aliyun.com/analysis/square"><strong>Tag Square</strong></a>, select a tag and submit a usage application. After the application is approved, you will receive the authorization code.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HwD***nG</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The phone number to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>187****5620</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The model parameter configuration (required by some tag capabilities).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;trainingJobId&quot;: &quot;17**********48&quot;}</p>
     */
    @NameInMap("ModelConfig")
    public String modelConfig;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number score threshold. Valid values: <strong>0 to 100</strong>.</p>
     * <blockquote>
     * <p>Whether to accept the specified score threshold is determined by the server. When the specified score threshold is not accepted, the data entered in this field is invalid.</p>
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
