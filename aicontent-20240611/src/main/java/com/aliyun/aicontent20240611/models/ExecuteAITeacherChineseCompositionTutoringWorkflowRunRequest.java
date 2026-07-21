// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest extends TeaModel {
    /**
     * <p>The essay outline.</p>
     * 
     * <strong>example:</strong>
     * <p>题目： 春天的色彩
     * 开头： 开门见山，点明主题。
     * 中间： 分段描写春天的不同色彩。
     * 结尾： 总结全文，抒发情感。</p>
     */
    @NameInMap("essayOutline")
    public String essayOutline;

    /**
     * <p>The essay requirements.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>生动形象，字数不得少于100字</p>
     */
    @NameInMap("essayRequirements")
    public String essayRequirements;

    /**
     * <p>The essay topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>春天的景色</p>
     */
    @NameInMap("essayTopic")
    public String essayTopic;

    /**
     * <p>The essay type.</p>
     * <p>outline: An outline.</p>
     * <p>essay: A full essay.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>essay</p>
     */
    @NameInMap("essayType")
    public String essayType;

    /**
     * <p>The target word count.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("essayWordCount")
    public Long essayWordCount;

    /**
     * <p>The student\&quot;s grade level.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("grade")
    public Long grade;

    /**
     * <p>The response mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>streaming</p>
     */
    @NameInMap("responseMode")
    public String responseMode;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
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
