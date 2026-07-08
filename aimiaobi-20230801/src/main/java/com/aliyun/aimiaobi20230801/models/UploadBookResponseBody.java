// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UploadBookResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data</p>
     */
    @NameInMap("Data")
    public UploadBookResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Operation result. Set to true for success. Set to false for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UploadBookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadBookResponseBody self = new UploadBookResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadBookResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadBookResponseBody setData(UploadBookResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadBookResponseBodyData getData() {
        return this.data;
    }

    public UploadBookResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UploadBookResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadBookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadBookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadBookResponseBodyData extends TeaModel {
        /**
         * <p>Document IDs</p>
         */
        @NameInMap("DocIds")
        public java.util.List<String> docIds;

        /**
         * <p>IDs of duplicate documents</p>
         */
        @NameInMap("ExistedIds")
        public java.util.List<String> existedIds;

        public static UploadBookResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadBookResponseBodyData self = new UploadBookResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadBookResponseBodyData setDocIds(java.util.List<String> docIds) {
            this.docIds = docIds;
            return this;
        }
        public java.util.List<String> getDocIds() {
            return this.docIds;
        }

        public UploadBookResponseBodyData setExistedIds(java.util.List<String> existedIds) {
            this.existedIds = existedIds;
            return this;
        }
        public java.util.List<String> getExistedIds() {
            return this.existedIds;
        }

    }

}
