// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteDatasetDocumentRequest extends TeaModel {
    /**
     * <p>The unique identifier of the dataset. Choose either DatasetId or DatasetName.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasetId")
    public Long datasetId;

    /**
     * <p>Dataset name</p>
     * 
     * <strong>example:</strong>
     * <p>数据集名称</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The user-specified unique ID of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("DocId")
    public String docId;

    /**
     * <p>The internal unique identifier of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("DocUuid")
    public String docUuid;

    /**
     * <p>The unique identifier of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get workspaceId</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteDatasetDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetDocumentRequest self = new DeleteDatasetDocumentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetDocumentRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public DeleteDatasetDocumentRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public DeleteDatasetDocumentRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public DeleteDatasetDocumentRequest setDocUuid(String docUuid) {
        this.docUuid = docUuid;
        return this;
    }
    public String getDocUuid() {
        return this.docUuid;
    }

    public DeleteDatasetDocumentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
