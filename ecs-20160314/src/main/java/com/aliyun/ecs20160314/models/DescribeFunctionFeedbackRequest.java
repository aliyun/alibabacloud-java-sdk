// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeFunctionFeedbackRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Feedback")
    public String feedback;

    @NameInMap("FunctionName")
    public java.util.List<String> functionName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeFunctionFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFunctionFeedbackRequest self = new DescribeFunctionFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFunctionFeedbackRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeFunctionFeedbackRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public DescribeFunctionFeedbackRequest setFunctionName(java.util.List<String> functionName) {
        this.functionName = functionName;
        return this;
    }
    public java.util.List<String> getFunctionName() {
        return this.functionName;
    }

    public DescribeFunctionFeedbackRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeFunctionFeedbackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFunctionFeedbackRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeFunctionFeedbackRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
