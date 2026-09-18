// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotFeedbackRequest extends TeaModel {
    /**
     * <p>The user feedback comment.</p>
     * 
     * <strong>example:</strong>
     * <p>good</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The user satisfaction level. Valid values:</p>
     * <ul>
     * <li>1: satisfied</li>
     * <li>-1: not satisfied</li>
     * <li>0: cancel the evaluation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Feedback")
    public String feedback;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e356c91c-8220-425c-9d86-********</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The primary key ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5243231*****</p>
     */
    @NameInMap("TurnId")
    public String turnId;

    public static KopilotFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        KopilotFeedbackRequest self = new KopilotFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public KopilotFeedbackRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public KopilotFeedbackRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public KopilotFeedbackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public KopilotFeedbackRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public KopilotFeedbackRequest setTurnId(String turnId) {
        this.turnId = turnId;
        return this;
    }
    public String getTurnId() {
        return this.turnId;
    }

}
