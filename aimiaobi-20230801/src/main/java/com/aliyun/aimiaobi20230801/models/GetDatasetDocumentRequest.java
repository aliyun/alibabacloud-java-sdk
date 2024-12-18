// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDatasetDocumentRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("DocId")
    public String docId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("DocUuid")
    public String docUuid;

    /**
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

    public GetDatasetDocumentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
