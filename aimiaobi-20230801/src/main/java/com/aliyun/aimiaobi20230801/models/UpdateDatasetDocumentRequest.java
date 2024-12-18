// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateDatasetDocumentRequest extends TeaModel {
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
    public UpdateDatasetDocumentRequestDocument document;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateDatasetDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetDocumentRequest self = new UpdateDatasetDocumentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetDocumentRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public UpdateDatasetDocumentRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateDatasetDocumentRequest setDocument(UpdateDatasetDocumentRequestDocument document) {
        this.document = document;
        return this;
    }
    public UpdateDatasetDocumentRequestDocument getDocument() {
        return this.document;
    }

    public UpdateDatasetDocumentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateDatasetDocumentRequestDocument extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>用户指定的文档唯一ID</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>内部文档唯一ID</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        public static UpdateDatasetDocumentRequestDocument build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetDocumentRequestDocument self = new UpdateDatasetDocumentRequestDocument();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetDocumentRequestDocument setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public UpdateDatasetDocumentRequestDocument setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public UpdateDatasetDocumentRequestDocument setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
