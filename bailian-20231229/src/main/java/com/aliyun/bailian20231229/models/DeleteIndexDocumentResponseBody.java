// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteIndexDocumentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Index.InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteIndexDocumentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteIndexDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndexDocumentResponseBody self = new DeleteIndexDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIndexDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteIndexDocumentResponseBody setData(DeleteIndexDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteIndexDocumentResponseBodyData getData() {
        return this.data;
    }

    public DeleteIndexDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteIndexDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIndexDocumentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeleteIndexDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteIndexDocumentResponseBodyData extends TeaModel {
        @NameInMap("DeletedDocument")
        public java.util.List<String> deletedDocument;

        public static DeleteIndexDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteIndexDocumentResponseBodyData self = new DeleteIndexDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteIndexDocumentResponseBodyData setDeletedDocument(java.util.List<String> deletedDocument) {
            this.deletedDocument = deletedDocument;
            return this;
        }
        public java.util.List<String> getDeletedDocument() {
            return this.deletedDocument;
        }

    }

}
