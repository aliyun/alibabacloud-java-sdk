// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateFunctionFeedbackRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Feedback")
    public String feedback;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Suggestion")
    public String suggestion;

    public static CreateFunctionFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionFeedbackRequest self = new CreateFunctionFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public CreateFunctionFeedbackRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateFunctionFeedbackRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public CreateFunctionFeedbackRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public CreateFunctionFeedbackRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFunctionFeedbackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFunctionFeedbackRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFunctionFeedbackRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateFunctionFeedbackRequest setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
    public String getSuggestion() {
        return this.suggestion;
    }

}
