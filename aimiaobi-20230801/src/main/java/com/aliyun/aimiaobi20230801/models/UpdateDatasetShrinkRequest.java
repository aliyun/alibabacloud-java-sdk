// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateDatasetShrinkRequest extends TeaModel {
    @NameInMap("DatasetConfig")
    public String datasetConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>企业自定义数据集</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasetId")
    public Long datasetId;

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
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateDatasetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetShrinkRequest self = new UpdateDatasetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetShrinkRequest setDatasetConfigShrink(String datasetConfigShrink) {
        this.datasetConfigShrink = datasetConfigShrink;
        return this;
    }
    public String getDatasetConfigShrink() {
        return this.datasetConfigShrink;
    }

    public UpdateDatasetShrinkRequest setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public UpdateDatasetShrinkRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public UpdateDatasetShrinkRequest setSearchDatasetEnable(Integer searchDatasetEnable) {
        this.searchDatasetEnable = searchDatasetEnable;
        return this;
    }
    public Integer getSearchDatasetEnable() {
        return this.searchDatasetEnable;
    }

    public UpdateDatasetShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
