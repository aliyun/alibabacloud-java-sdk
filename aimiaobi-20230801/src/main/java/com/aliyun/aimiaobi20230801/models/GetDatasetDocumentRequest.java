// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDatasetDocumentRequest extends TeaModel {
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
     * <p>User-defined unique ID of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("DocId")
    public String docId;

    /**
     * <p>Internal unique identifier of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("DocUuid")
    public String docUuid;

    /**
     * <p>List of fields to include in the response.</p>
     */
    @NameInMap("IncludeFields")
    public java.util.List<String> includeFields;

    /**
     * <p>Unique identifier of your Alibaba Cloud Model Studio workspace. <a href="https://help.aliyun.com/document_detail/2782167.html">Get the workspace ID</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDatasetDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetDocumentRequest self = new GetDatasetDocumentRequest();
        return TeaModel.build(map, self);
    }

    public GetDatasetDocumentRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public GetDatasetDocumentRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public GetDatasetDocumentRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public GetDatasetDocumentRequest setDocUuid(String docUuid) {
        this.docUuid = docUuid;
        return this;
    }
    public String getDocUuid() {
        return this.docUuid;
    }

    public GetDatasetDocumentRequest setIncludeFields(java.util.List<String> includeFields) {
        this.includeFields = includeFields;
        return this;
    }
    public java.util.List<String> getIncludeFields() {
        return this.includeFields;
    }

    public GetDatasetDocumentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
