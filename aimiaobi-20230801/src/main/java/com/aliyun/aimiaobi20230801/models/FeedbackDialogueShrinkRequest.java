// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FeedbackDialogueShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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
    public String ratingTagsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TaskId")
    public String taskId;

    public static FeedbackDialogueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FeedbackDialogueShrinkRequest self = new FeedbackDialogueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FeedbackDialogueShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public FeedbackDialogueShrinkRequest setCustomerResponse(String customerResponse) {
        this.customerResponse = customerResponse;
        return this;
    }
    public String getCustomerResponse() {
        return this.customerResponse;
    }

    public FeedbackDialogueShrinkRequest setGoodText(String goodText) {
        this.goodText = goodText;
        return this;
    }
    public String getGoodText() {
        return this.goodText;
    }

    public FeedbackDialogueShrinkRequest setModifiedResponse(String modifiedResponse) {
        this.modifiedResponse = modifiedResponse;
        return this;
    }
    public String getModifiedResponse() {
        return this.modifiedResponse;
    }

    public FeedbackDialogueShrinkRequest setRating(String rating) {
        this.rating = rating;
        return this;
    }
    public String getRating() {
        return this.rating;
    }

    public FeedbackDialogueShrinkRequest setRatingTagsShrink(String ratingTagsShrink) {
        this.ratingTagsShrink = ratingTagsShrink;
        return this;
    }
    public String getRatingTagsShrink() {
        return this.ratingTagsShrink;
    }

    public FeedbackDialogueShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public FeedbackDialogueShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
