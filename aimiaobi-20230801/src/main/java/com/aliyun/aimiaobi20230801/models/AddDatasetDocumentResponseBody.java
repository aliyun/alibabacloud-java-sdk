// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AddDatasetDocumentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddDatasetDocumentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddDatasetDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDatasetDocumentResponseBody self = new AddDatasetDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDatasetDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddDatasetDocumentResponseBody setData(AddDatasetDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddDatasetDocumentResponseBodyData getData() {
        return this.data;
    }

    public AddDatasetDocumentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddDatasetDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddDatasetDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDatasetDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddDatasetDocumentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>文档业务唯一标识</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>8df2d69d63a247b6b52ff455b2d426b6</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static AddDatasetDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddDatasetDocumentResponseBodyData self = new AddDatasetDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddDatasetDocumentResponseBodyData setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public AddDatasetDocumentResponseBodyData setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public AddDatasetDocumentResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AddDatasetDocumentResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public AddDatasetDocumentResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
