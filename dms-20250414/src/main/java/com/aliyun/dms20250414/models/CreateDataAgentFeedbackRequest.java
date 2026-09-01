// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentFeedbackRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <strong>example:</strong>
     * <p>{&quot;feedback_type&quot;:&quot;PRODUCT_SUGGESTION&quot;,&quot;user_feedback&quot;: &quot;test&quot;,&quot;email&quot;:&quot;<a href="mailto:yourname@example.com">yourname@example.com</a>&quot;,&quot;is_authorized&quot;:&quot;Y&quot;}</p>
     */
    @NameInMap("FeedbackContent")
    public String feedbackContent;

    /**
     * <strong>example:</strong>
     * <p>ISSUE_REPORT</p>
     */
    @NameInMap("FeedbackType")
    public String feedbackType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LikeValue")
    public Integer likeValue;

    /**
     * <strong>example:</strong>
     * <p>h8r********4fch</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>h8r********4fch_sdesfews</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <strong>example:</strong>
     * <p>SESSION</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <strong>example:</strong>
     * <p>56kv1pvl9uvt9**********bb</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDataAgentFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentFeedbackRequest self = new CreateDataAgentFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentFeedbackRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public CreateDataAgentFeedbackRequest setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
        return this;
    }
    public String getFeedbackContent() {
        return this.feedbackContent;
    }

    public CreateDataAgentFeedbackRequest setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
        return this;
    }
    public String getFeedbackType() {
        return this.feedbackType;
    }

    public CreateDataAgentFeedbackRequest setLikeValue(Integer likeValue) {
        this.likeValue = likeValue;
        return this;
    }
    public Integer getLikeValue() {
        return this.likeValue;
    }

    public CreateDataAgentFeedbackRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CreateDataAgentFeedbackRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public CreateDataAgentFeedbackRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateDataAgentFeedbackRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
