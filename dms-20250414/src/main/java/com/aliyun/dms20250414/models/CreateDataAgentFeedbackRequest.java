// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentFeedbackRequest extends TeaModel {
    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The feedback content. You can directly enter the feedback content, or pass a JSON string for the issue report scenario as shown in the example. The feedback_type field corresponds to the issue type, user_feedback corresponds to the issue description, email corresponds to the contact email address, and is_authorized indicates whether to authorize log access for troubleshooting.</p>
     * <p>feedback_type issue types. Valid values:</p>
     * <ul>
     * <li><strong>ANALYSIS_RESULT_INACCURATE</strong>: Inaccurate analysis result.</li>
     * <li><strong>RUNTIME_ERROR</strong>: Runtime error.</li>
     * <li><strong>REPORT_EXCEPTION</strong>: Report exception.</li>
     * <li><strong>SLOW_RESPONSE</strong>: Slow response.</li>
     * <li><strong>PRODUCT_SUGGESTION</strong>: Product suggestion.</li>
     * <li><strong>OTHER</strong>: Other.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;feedback_type&quot;:&quot;PRODUCT_SUGGESTION&quot;,&quot;user_feedback&quot;: &quot;test&quot;,&quot;email&quot;:&quot;<a href="mailto:yourname@example.com">yourname@example.com</a>&quot;,&quot;is_authorized&quot;:&quot;Y&quot;}</p>
     */
    @NameInMap("FeedbackContent")
    public String feedbackContent;

    /**
     * <p>The feedback type. Valid values:</p>
     * <ul>
     * <li><strong>ISSUE_REPORT</strong>: issue report.</li>
     * <li><strong>CANCEL_CHAT</strong>: task cancellation.</li>
     * <li><strong>LIKE</strong>: like.</li>
     * <li><strong>DISLIKE</strong>: dislike.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ISSUE_REPORT</p>
     */
    @NameInMap("FeedbackType")
    public String feedbackType;

    /**
     * <p>The like value. This parameter is used only for like and dislike scenarios. Do not pass this parameter for other scenarios. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: like.</li>
     * <li><strong>-1</strong>: dislike.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LikeValue")
    public Integer likeValue;

    /**
     * <p>The agent session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>h8r********4fch</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The feedback target ID.</p>
     * <ul>
     * <li>For issue reports, use SessionId + underscore + random UUID.</li>
     * <li>For other feedback types, pass the checkpoint of the current SSE message stream.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>h8r********4fch_sdesfews</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The feedback target. Valid values:</p>
     * <ul>
     * <li><strong>SESSION</strong>: session (used for issue reports).</li>
     * <li><strong>CHAT</strong>: chat (used for task cancellation).</li>
     * <li><strong>REPORT</strong>: report.</li>
     * <li><strong>PLAN</strong>: execution plan.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SESSION</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The workspace ID.</p>
     * 
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
