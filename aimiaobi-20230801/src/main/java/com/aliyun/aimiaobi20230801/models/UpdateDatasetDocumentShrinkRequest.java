// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateDatasetDocumentShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasetId")
    public Long datasetId;

    /**
     * <strong>example:</strong>
     * <p>数据集名称</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Document")
    public String documentShrink;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateDatasetDocumentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetDocumentShrinkRequest self = new UpdateDatasetDocumentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetDocumentShrinkRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public UpdateDatasetDocumentShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateDatasetDocumentShrinkRequest setDocumentShrink(String documentShrink) {
        this.documentShrink = documentShrink;
        return this;
    }
    public String getDocumentShrink() {
        return this.documentShrink;
    }

    public UpdateDatasetDocumentShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
