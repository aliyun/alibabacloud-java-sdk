// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveStyleLearningResultShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("AigcResult")
    public String aigcResult;

    @NameInMap("CustomTextIdList")
    public String customTextIdListShrink;

    @NameInMap("MaterialIdList")
    public String materialIdListShrink;

    @NameInMap("RewriteResult")
    public String rewriteResult;

    @NameInMap("StyleName")
    public String styleName;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static SaveStyleLearningResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveStyleLearningResultShrinkRequest self = new SaveStyleLearningResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveStyleLearningResultShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SaveStyleLearningResultShrinkRequest setAigcResult(String aigcResult) {
        this.aigcResult = aigcResult;
        return this;
    }
    public String getAigcResult() {
        return this.aigcResult;
    }

    public SaveStyleLearningResultShrinkRequest setCustomTextIdListShrink(String customTextIdListShrink) {
        this.customTextIdListShrink = customTextIdListShrink;
        return this;
    }
    public String getCustomTextIdListShrink() {
        return this.customTextIdListShrink;
    }

    public SaveStyleLearningResultShrinkRequest setMaterialIdListShrink(String materialIdListShrink) {
        this.materialIdListShrink = materialIdListShrink;
        return this;
    }
    public String getMaterialIdListShrink() {
        return this.materialIdListShrink;
    }

    public SaveStyleLearningResultShrinkRequest setRewriteResult(String rewriteResult) {
        this.rewriteResult = rewriteResult;
        return this;
    }
    public String getRewriteResult() {
        return this.rewriteResult;
    }

    public SaveStyleLearningResultShrinkRequest setStyleName(String styleName) {
        this.styleName = styleName;
        return this;
    }
    public String getStyleName() {
        return this.styleName;
    }

    public SaveStyleLearningResultShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
