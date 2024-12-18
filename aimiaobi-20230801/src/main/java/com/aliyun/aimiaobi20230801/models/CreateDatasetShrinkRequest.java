// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateDatasetShrinkRequest extends TeaModel {
    @NameInMap("DatasetConfig")
    public String datasetConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>企业自定义数据集</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>businessDataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <strong>example:</strong>
     * <p>CustomSemanticSearch</p>
     */
    @NameInMap("DatasetType")
    public String datasetType;

    @NameInMap("DocumentHandleConfig")
    public String documentHandleConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SearchDatasetEnable")
    public Integer searchDatasetEnable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDatasetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetShrinkRequest self = new CreateDatasetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetShrinkRequest setDatasetConfigShrink(String datasetConfigShrink) {
        this.datasetConfigShrink = datasetConfigShrink;
        return this;
    }
    public String getDatasetConfigShrink() {
        return this.datasetConfigShrink;
    }

    public CreateDatasetShrinkRequest setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public CreateDatasetShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateDatasetShrinkRequest setDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public String getDatasetType() {
        return this.datasetType;
    }

    public CreateDatasetShrinkRequest setDocumentHandleConfigShrink(String documentHandleConfigShrink) {
        this.documentHandleConfigShrink = documentHandleConfigShrink;
        return this;
    }
    public String getDocumentHandleConfigShrink() {
        return this.documentHandleConfigShrink;
    }

    public CreateDatasetShrinkRequest setSearchDatasetEnable(Integer searchDatasetEnable) {
        this.searchDatasetEnable = searchDatasetEnable;
        return this;
    }
    public Integer getSearchDatasetEnable() {
        return this.searchDatasetEnable;
    }

    public CreateDatasetShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
