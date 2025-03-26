// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest extends TeaModel {
    @NameInMap("essayOutline")
    public String essayOutline;

    @NameInMap("essayRequirements")
    public String essayRequirements;

    @NameInMap("essayTopic")
    public String essayTopic;

    /**
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
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("grade")
    public Long grade;

    /**
     * <strong>example:</strong>
     * <p>streaming</p>
     */
    @NameInMap("responseMode")
    public String responseMode;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxx</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest self = new ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest setEssayOutline(String essayOutline) {
        this.essayOutline = essayOutline;
        return this;
    }
    public String getEssayOutline() {
        return this.essayOutline;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest setEssayRequirements(String essayRequirements) {
        this.essayRequirements = essayRequirements;
        return this;
    }
    public String getEssayRequirements() {
        return this.essayRequirements;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest setEssayTopic(String essayTopic) {
        this.essayTopic = essayTopic;
        return this;
    }
    public String getEssayTopic() {
        return this.essayTopic;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest setEssayType(String essayType) {
        this.essayType = essayType;
        return this;
    }
    public String getEssayType() {
        return this.essayType;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest setEssayWordCount(Long essayWordCount) {
        this.essayWordCount = essayWordCount;
        return this;
    }
    public Long getEssayWordCount() {
        return this.essayWordCount;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest setGrade(Long grade) {
        this.grade = grade;
        return this;
    }
    public Long getGrade() {
        return this.grade;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest setResponseMode(String responseMode) {
        this.responseMode = responseMode;
        return this;
    }
    public String getResponseMode() {
        return this.responseMode;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
