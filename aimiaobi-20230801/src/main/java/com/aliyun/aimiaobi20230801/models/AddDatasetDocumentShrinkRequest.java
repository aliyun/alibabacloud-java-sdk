// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AddDatasetDocumentShrinkRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddDatasetDocumentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDatasetDocumentShrinkRequest self = new AddDatasetDocumentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddDatasetDocumentShrinkRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public AddDatasetDocumentShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public AddDatasetDocumentShrinkRequest setDocumentShrink(String documentShrink) {
        this.documentShrink = documentShrink;
        return this;
    }
    public String getDocumentShrink() {
        return this.documentShrink;
    }

    public AddDatasetDocumentShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
