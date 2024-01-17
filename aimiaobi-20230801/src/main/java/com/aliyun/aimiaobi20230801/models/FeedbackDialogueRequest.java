// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FeedbackDialogueRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("CustomerResponse")
    public String customerResponse;

    @NameInMap("GoodText")
    public String goodText;

    @NameInMap("ModifiedResponse")
    public String modifiedResponse;

    @NameInMap("Rating")
    public String rating;

    @NameInMap("RatingTags")
    public java.util.List<String> ratingTags;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TaskId")
    public String taskId;

    public static FeedbackDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        FeedbackDialogueRequest self = new FeedbackDialogueRequest();
        return TeaModel.build(map, self);
    }

    public FeedbackDialogueRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public FeedbackDialogueRequest setCustomerResponse(String customerResponse) {
        this.customerResponse = customerResponse;
        return this;
    }
    public String getCustomerResponse() {
        return this.customerResponse;
    }

    public FeedbackDialogueRequest setGoodText(String goodText) {
        this.goodText = goodText;
        return this;
    }
    public String getGoodText() {
        return this.goodText;
    }

    public FeedbackDialogueRequest setModifiedResponse(String modifiedResponse) {
        this.modifiedResponse = modifiedResponse;
        return this;
    }
    public String getModifiedResponse() {
        return this.modifiedResponse;
    }

    public FeedbackDialogueRequest setRating(String rating) {
        this.rating = rating;
        return this;
    }
    public String getRating() {
        return this.rating;
    }

    public FeedbackDialogueRequest setRatingTags(java.util.List<String> ratingTags) {
        this.ratingTags = ratingTags;
        return this;
    }
    public java.util.List<String> getRatingTags() {
        return this.ratingTags;
    }

    public FeedbackDialogueRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public FeedbackDialogueRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
