// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateDatasetDocumentRequest extends TeaModel {
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
    public UpdateDatasetDocumentRequestDocument document;

    /**
     * <p>Unique identifier of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get the workspace ID</a>.</p>
     * 
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
         * <p>UUID of the category</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("CategoryUuid")
        public String categoryUuid;

        /**
         * <p>User-defined unique ID for the document.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <p>Unique ID of the document in the system.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <p>Extension field 1</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Extend1")
        public String extend1;

        /**
         * <p>Extension field 2</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Extend2")
        public String extend2;

        /**
         * <p>Extension field 3</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Extend3")
        public String extend3;

        /**
         * <p>Tags</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <p>Document title.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        public static UpdateDatasetDocumentRequestDocument build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetDocumentRequestDocument self = new UpdateDatasetDocumentRequestDocument();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetDocumentRequestDocument setCategoryUuid(String categoryUuid) {
            this.categoryUuid = categoryUuid;
            return this;
        }
        public String getCategoryUuid() {
            return this.categoryUuid;
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

        public UpdateDatasetDocumentRequestDocument setExtend1(String extend1) {
            this.extend1 = extend1;
            return this;
        }
        public String getExtend1() {
            return this.extend1;
        }

        public UpdateDatasetDocumentRequestDocument setExtend2(String extend2) {
            this.extend2 = extend2;
            return this;
        }
        public String getExtend2() {
            return this.extend2;
        }

        public UpdateDatasetDocumentRequestDocument setExtend3(String extend3) {
            this.extend3 = extend3;
            return this;
        }
        public String getExtend3() {
            return this.extend3;
        }

        public UpdateDatasetDocumentRequestDocument setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
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
