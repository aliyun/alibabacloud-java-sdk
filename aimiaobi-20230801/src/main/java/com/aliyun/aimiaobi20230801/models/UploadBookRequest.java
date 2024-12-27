// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UploadBookRequest extends TeaModel {
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Docs")
    public java.util.List<UploadBookRequestDocs> docs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-ipe7d81yq4sl5jmk</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UploadBookRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadBookRequest self = new UploadBookRequest();
        return TeaModel.build(map, self);
    }

    public UploadBookRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public UploadBookRequest setDocs(java.util.List<UploadBookRequestDocs> docs) {
        this.docs = docs;
        return this;
    }
    public java.util.List<UploadBookRequestDocs> getDocs() {
        return this.docs;
    }

    public UploadBookRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UploadBookRequestDocs extends TeaModel {
        @NameInMap("DocName")
        public String docName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx/ccc.pdf">http://xxx/ccc.pdf</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        public static UploadBookRequestDocs build(java.util.Map<String, ?> map) throws Exception {
            UploadBookRequestDocs self = new UploadBookRequestDocs();
            return TeaModel.build(map, self);
        }

        public UploadBookRequestDocs setDocName(String docName) {
            this.docName = docName;
            return this;
        }
        public String getDocName() {
            return this.docName;
        }

        public UploadBookRequestDocs setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

}
