// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FeedbackDialogueShrinkRequest extends TeaModel {
    /**
     * <p>The unique ID of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fcb14f25c9ee41ccad33a049de8f941b_p_outbound_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The feedback.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CustomerResponse")
    public String customerResponse;

    /**
     * <p>The generated content that is considered good.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GoodText")
    public String goodText;

    /**
     * <p>The modified generated result.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ModifiedResponse")
    public String modifiedResponse;

    /**
     * <p>thumbsDown: Dislike, thumbsUp: Like</p>
     * 
     * <strong>example:</strong>
     * <p>thumbsDown</p>
     */
    @NameInMap("Rating")
    public String rating;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("RatingTags")
    public String ratingTagsShrink;

    /**
     * <p>The ID of a single-turn conversation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>75bf82fa-b71b-45d7-ae40-0b00e496cd9e</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The ID of the page.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
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
