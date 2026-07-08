// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateDatasetDocumentResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data.</p>
     */
    @NameInMap("Data")
    public UpdateDatasetDocumentResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDatasetDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetDocumentResponseBody self = new UpdateDatasetDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDatasetDocumentResponseBody setData(UpdateDatasetDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDatasetDocumentResponseBodyData getData() {
        return this.data;
    }

    public UpdateDatasetDocumentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateDatasetDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateDatasetDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDatasetDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateDatasetDocumentResponseBodyData extends TeaModel {
        /**
         * <p>Category UUID</p>
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
         * <p>用户指定的文档唯一ID</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <p>Internal unique ID of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>内部文档唯一ID</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <p>Extension field 1</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend1")
        public String extend1;

        /**
         * <p>Extension field 2</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend2")
        public String extend2;

        /**
         * <p>Extension field 3</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend3")
        public String extend3;

        /**
         * <p>Tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <p>Document title.</p>
         * 
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        public static UpdateDatasetDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetDocumentResponseBodyData self = new UpdateDatasetDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetDocumentResponseBodyData setCategoryUuid(String categoryUuid) {
            this.categoryUuid = categoryUuid;
            return this;
        }
        public String getCategoryUuid() {
            return this.categoryUuid;
        }

        public UpdateDatasetDocumentResponseBodyData setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public UpdateDatasetDocumentResponseBodyData setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public UpdateDatasetDocumentResponseBodyData setExtend1(String extend1) {
            this.extend1 = extend1;
            return this;
        }
        public String getExtend1() {
            return this.extend1;
        }

        public UpdateDatasetDocumentResponseBodyData setExtend2(String extend2) {
            this.extend2 = extend2;
            return this;
        }
        public String getExtend2() {
            return this.extend2;
        }

        public UpdateDatasetDocumentResponseBodyData setExtend3(String extend3) {
            this.extend3 = extend3;
            return this;
        }
        public String getExtend3() {
            return this.extend3;
        }

        public UpdateDatasetDocumentResponseBodyData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public UpdateDatasetDocumentResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
