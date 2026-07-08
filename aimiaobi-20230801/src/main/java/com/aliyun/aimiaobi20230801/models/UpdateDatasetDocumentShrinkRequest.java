// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateDatasetDocumentShrinkRequest extends TeaModel {
    /**
     * <p>Unique identifier of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasetId")
    public Long datasetId;

    /**
     * <p>Name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>数据集名称</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The document to update.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Document")
    public String documentShrink;

    /**
     * <p>Unique identifier of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get the workspace ID</a>.</p>
     * 
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
