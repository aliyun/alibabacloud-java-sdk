// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitEnterpriseVocAnalysisTaskShrinkRequest extends TeaModel {
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContentTags")
    public String contentTagsShrink;

    @NameInMap("Contents")
    public String contentsShrink;

    /**
     * <strong>example:</strong>
     * <p>oss://default/bucket-name/materialDocument/tenant_agent/fileName</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    @NameInMap("FilterTags")
    public String filterTagsShrink;

    /**
     * <strong>example:</strong>
     * <p>shortContent</p>
     */
    @NameInMap("MaterialType")
    public String materialType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("PositiveSample")
    public String positiveSample;

    /**
     * <strong>example:</strong>
     * <p>oss://default/bucket-name/path/xxx.xlsx</p>
     */
    @NameInMap("PositiveSampleFileKey")
    public String positiveSampleFileKey;

    /**
     * <strong>example:</strong>
     * <p>lightAppSass</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitEnterpriseVocAnalysisTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEnterpriseVocAnalysisTaskShrinkRequest self = new SubmitEnterpriseVocAnalysisTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setContentTagsShrink(String contentTagsShrink) {
        this.contentTagsShrink = contentTagsShrink;
        return this;
    }
    public String getContentTagsShrink() {
        return this.contentTagsShrink;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setContentsShrink(String contentsShrink) {
        this.contentsShrink = contentsShrink;
        return this;
    }
    public String getContentsShrink() {
        return this.contentsShrink;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setFilterTagsShrink(String filterTagsShrink) {
        this.filterTagsShrink = filterTagsShrink;
        return this;
    }
    public String getFilterTagsShrink() {
        return this.filterTagsShrink;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setPositiveSample(String positiveSample) {
        this.positiveSample = positiveSample;
        return this;
    }
    public String getPositiveSample() {
        return this.positiveSample;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setPositiveSampleFileKey(String positiveSampleFileKey) {
        this.positiveSampleFileKey = positiveSampleFileKey;
        return this;
    }
    public String getPositiveSampleFileKey() {
        return this.positiveSampleFileKey;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public SubmitEnterpriseVocAnalysisTaskShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
