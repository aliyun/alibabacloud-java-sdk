// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchExportTermsTaskResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public FetchExportTermsTaskResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static FetchExportTermsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchExportTermsTaskResponseBody self = new FetchExportTermsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchExportTermsTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FetchExportTermsTaskResponseBody setData(FetchExportTermsTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FetchExportTermsTaskResponseBodyData getData() {
        return this.data;
    }

    public FetchExportTermsTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FetchExportTermsTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FetchExportTermsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchExportTermsTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FetchExportTermsTaskResponseBodyData extends TeaModel {
        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>https//xxxx</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The task execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING-待执行、RUNNING-执行中、SUCCESSED-成功、SUSPENDED-暂停、FAILED-失败、CANCELLED-取消</p>
         */
        @NameInMap("Status")
        public String status;

        public static FetchExportTermsTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FetchExportTermsTaskResponseBodyData self = new FetchExportTermsTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FetchExportTermsTaskResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public FetchExportTermsTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
