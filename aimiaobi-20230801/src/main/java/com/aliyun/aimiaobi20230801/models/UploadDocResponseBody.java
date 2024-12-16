// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UploadDocResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UploadDocResponseBodyData data;

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
     * <p>Id of the request</p>
     * 
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

    public static UploadDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadDocResponseBody self = new UploadDocResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadDocResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadDocResponseBody setData(UploadDocResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadDocResponseBodyData getData() {
        return this.data;
    }

    public UploadDocResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UploadDocResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadDocResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadDocResponseBodyData extends TeaModel {
        @NameInMap("DocIds")
        public java.util.List<String> docIds;

        @NameInMap("ExistedIds")
        public java.util.List<String> existedIds;

        public static UploadDocResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadDocResponseBodyData self = new UploadDocResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadDocResponseBodyData setDocIds(java.util.List<String> docIds) {
            this.docIds = docIds;
            return this;
        }
        public java.util.List<String> getDocIds() {
            return this.docIds;
        }

        public UploadDocResponseBodyData setExistedIds(java.util.List<String> existedIds) {
            this.existedIds = existedIds;
            return this;
        }
        public java.util.List<String> getExistedIds() {
            return this.existedIds;
        }

    }

}
