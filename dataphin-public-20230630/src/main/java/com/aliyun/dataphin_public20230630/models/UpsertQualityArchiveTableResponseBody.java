// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityArchiveTableResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The submit status of the asynchronous task.</p>
     */
    @NameInMap("Data")
    public UpsertQualityArchiveTableResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error details returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpsertQualityArchiveTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityArchiveTableResponseBody self = new UpsertQualityArchiveTableResponseBody();
        return TeaModel.build(map, self);
    }

    public UpsertQualityArchiveTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpsertQualityArchiveTableResponseBody setData(UpsertQualityArchiveTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpsertQualityArchiveTableResponseBodyData getData() {
        return this.data;
    }

    public UpsertQualityArchiveTableResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpsertQualityArchiveTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpsertQualityArchiveTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpsertQualityArchiveTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpsertQualityArchiveTableResponseBodyData extends TeaModel {
        /**
         * <p>The progress ID of the asynchronous task. This is an asynchronous operation. After a successful submission, only this ID is returned. Call GetQualityArchiveTableProgress to poll the task status and retrieve the final archived table information.</p>
         * 
         * <strong>example:</strong>
         * <p>d78f0b5c9a1e4f2ab3c6d5e4f7a8b9c0</p>
         */
        @NameInMap("ProgressId")
        public String progressId;

        public static UpsertQualityArchiveTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityArchiveTableResponseBodyData self = new UpsertQualityArchiveTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpsertQualityArchiveTableResponseBodyData setProgressId(String progressId) {
            this.progressId = progressId;
            return this;
        }
        public String getProgressId() {
            return this.progressId;
        }

    }

}
