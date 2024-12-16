// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UploadDocRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Docs")
    public java.util.List<UploadDocRequestDocs> docs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-yigtrrjl377rcbab</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UploadDocRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDocRequest self = new UploadDocRequest();
        return TeaModel.build(map, self);
    }

    public UploadDocRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public UploadDocRequest setDocs(java.util.List<UploadDocRequestDocs> docs) {
        this.docs = docs;
        return this;
    }
    public java.util.List<UploadDocRequestDocs> getDocs() {
        return this.docs;
    }

    public UploadDocRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UploadDocRequestDocs extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DocName")
        public String docName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx/ccc.pdf">http://xxx/ccc.pdf</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        public static UploadDocRequestDocs build(java.util.Map<String, ?> map) throws Exception {
            UploadDocRequestDocs self = new UploadDocRequestDocs();
            return TeaModel.build(map, self);
        }

        public UploadDocRequestDocs setDocName(String docName) {
            this.docName = docName;
            return this;
        }
        public String getDocName() {
            return this.docName;
        }

        public UploadDocRequestDocs setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

}
