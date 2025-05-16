// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Title: The Importance of Reading
     * I. Introduction
     * II. Body
     * III. Conclusion</p>
     */
    @NameInMap("essayOutline")
    public String essayOutline;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>No less than 100 words</p>
     */
    @NameInMap("essayRequirements")
    public String essayRequirements;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Discuss what to eat</p>
     */
    @NameInMap("essayTopic")
    public String essayTopic;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>essay</p>
     */
    @NameInMap("essayType")
    public String essayType;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("essayWordCount")
    public Long essayWordCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("grade")
    public Long grade;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>streaming</p>
     */
    @NameInMap("responseMode")
    public String responseMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest self = new ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest setEssayOutline(String essayOutline) {
        this.essayOutline = essayOutline;
        return this;
    }
    public String getEssayOutline() {
        return this.essayOutline;
    }

    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest setEssayRequirements(String essayRequirements) {
        this.essayRequirements = essayRequirements;
        return this;
    }
    public String getEssayRequirements() {
        return this.essayRequirements;
    }

    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest setEssayTopic(String essayTopic) {
        this.essayTopic = essayTopic;
        return this;
    }
    public String getEssayTopic() {
        return this.essayTopic;
    }

    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest setEssayType(String essayType) {
        this.essayType = essayType;
        return this;
    }
    public String getEssayType() {
        return this.essayType;
    }

    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest setEssayWordCount(Long essayWordCount) {
        this.essayWordCount = essayWordCount;
        return this;
    }
    public Long getEssayWordCount() {
        return this.essayWordCount;
    }

    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest setGrade(Long grade) {
        this.grade = grade;
        return this;
    }
    public Long getGrade() {
        return this.grade;
    }

    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest setResponseMode(String responseMode) {
        this.responseMode = responseMode;
        return this;
    }
    public String getResponseMode() {
        return this.responseMode;
    }

    public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
