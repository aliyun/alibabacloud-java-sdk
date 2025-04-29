// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveStyleLearningResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("AigcResult")
    public String aigcResult;

    @NameInMap("CustomTextIdList")
    public java.util.List<Long> customTextIdList;

    @NameInMap("MaterialIdList")
    public java.util.List<Long> materialIdList;

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

    public static SaveStyleLearningResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveStyleLearningResultRequest self = new SaveStyleLearningResultRequest();
        return TeaModel.build(map, self);
    }

    public SaveStyleLearningResultRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SaveStyleLearningResultRequest setAigcResult(String aigcResult) {
        this.aigcResult = aigcResult;
        return this;
    }
    public String getAigcResult() {
        return this.aigcResult;
    }

    public SaveStyleLearningResultRequest setCustomTextIdList(java.util.List<Long> customTextIdList) {
        this.customTextIdList = customTextIdList;
        return this;
    }
    public java.util.List<Long> getCustomTextIdList() {
        return this.customTextIdList;
    }

    public SaveStyleLearningResultRequest setMaterialIdList(java.util.List<Long> materialIdList) {
        this.materialIdList = materialIdList;
        return this;
    }
    public java.util.List<Long> getMaterialIdList() {
        return this.materialIdList;
    }

    public SaveStyleLearningResultRequest setRewriteResult(String rewriteResult) {
        this.rewriteResult = rewriteResult;
        return this;
    }
    public String getRewriteResult() {
        return this.rewriteResult;
    }

    public SaveStyleLearningResultRequest setStyleName(String styleName) {
        this.styleName = styleName;
        return this;
    }
    public String getStyleName() {
        return this.styleName;
    }

    public SaveStyleLearningResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
