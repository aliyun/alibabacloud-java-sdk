// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchImportTermsTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public FetchImportTermsTaskResponseBodyData data;

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
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static FetchImportTermsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchImportTermsTaskResponseBody self = new FetchImportTermsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchImportTermsTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FetchImportTermsTaskResponseBody setData(FetchImportTermsTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FetchImportTermsTaskResponseBodyData getData() {
        return this.data;
    }

    public FetchImportTermsTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FetchImportTermsTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FetchImportTermsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchImportTermsTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FetchImportTermsTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PENDING-待执行、RUNNING-执行中、SUCCESSED-成功、SUSPENDED-暂停、FAILED-失败、CANCELLED-取消</p>
         */
        @NameInMap("Status")
        public String status;

        public static FetchImportTermsTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FetchImportTermsTaskResponseBodyData self = new FetchImportTermsTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FetchImportTermsTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
