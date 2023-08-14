// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisAIRequest extends TeaModel {
    @NameInMap("AuthCode")
    public String authCode;

    @NameInMap("InputNumber")
    public String inputNumber;

    @NameInMap("ModelConfig")
    public String modelConfig;

    @NameInMap("OwnerId")
    public Long ownerId;

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
