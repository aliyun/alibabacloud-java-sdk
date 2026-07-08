// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitEnterpriseVocAnalysisTaskShrinkRequest extends TeaModel {
    /**
     * <p>The API key for integration access. For more information, see <a href="https://help.aliyun.com/zh/model-studio/get-api-key?spm=a2c4g.11186623.help-menu-2400256.d_2_0_0.1cbdb0a8lsT1n3">Get an API key</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-sdfs2-wewerwe-ere</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The content tags.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContentTags")
    public String contentTagsShrink;

    /**
     * <p>The material content to be mined.</p>
     */
    @NameInMap("Contents")
    public String contentsShrink;

    /**
     * <p>The key of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://default/bucket-name/materialDocument/tenant_agent/fileName</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <p>The filter tags.</p>
     */
    @NameInMap("FilterTags")
    public String filterTagsShrink;

    /**
     * <p>The material type. Valid values: \<code>shortContent\\</code> (long or short comments, or tickets) and \<code>dialogue\\</code> (dialogues).</p>
     * 
     * <strong>example:</strong>
     * <p>shortContent</p>
     */
    @NameInMap("MaterialType")
    public String materialType;

    /**
     * <p>The ID of the model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>The content of the positive sample.</p>
     * 
     * <strong>example:</strong>
     * <p>正面样本</p>
     */
    @NameInMap("PositiveSample")
    public String positiveSample;

    /**
     * <p>The key of the positive sample file.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://default/bucket-name/path/xxx.xlsx</p>
     */
    @NameInMap("PositiveSampleFileKey")
    public String positiveSampleFileKey;

    /**
     * <p>The task type. Valid values: \<code>lightAppSass\\</code> (invoked from a Software as a Service (SaaS) page) and \<code>sdkBatchTask\\</code> (SDK batch task).</p>
     * 
     * <strong>example:</strong>
     * <p>lightAppSass</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The ID of the Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a workspace ID</a>.</p>
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
