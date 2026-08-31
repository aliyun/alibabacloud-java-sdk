// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityArchiveTableProgressResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The asynchronous task progress details.</p>
     */
    @NameInMap("Data")
    public GetQualityArchiveTableProgressResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
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

    public static GetQualityArchiveTableProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityArchiveTableProgressResponseBody self = new GetQualityArchiveTableProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityArchiveTableProgressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityArchiveTableProgressResponseBody setData(GetQualityArchiveTableProgressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityArchiveTableProgressResponseBodyData getData() {
        return this.data;
    }

    public GetQualityArchiveTableProgressResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityArchiveTableProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityArchiveTableProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityArchiveTableProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityArchiveTableProgressResponseBodyData extends TeaModel {
        /**
         * <p>The archived table ID. This parameter is returned after the task succeeds and can be used to switch the active table.</p>
         * 
         * <strong>example:</strong>
         * <p>88012</p>
         */
        @NameInMap("ArchiveTableId")
        public Long archiveTableId;

        /**
         * <p>The full name of the archived table. This parameter is returned after the task succeeds. When creating a table, the name includes the automatically appended _exception_data suffix.</p>
         * 
         * <strong>example:</strong>
         * <p>Train.a01_reanme3_exception_data</p>
         */
        @NameInMap("ArchiveTableName")
        public String archiveTableName;

        /**
         * <p>The reason for the task failure. This parameter is returned only when Status is FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>The archived table name already exists!</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>PROGRESS: In progress.</li>
         * <li>SUCCESS: Succeeded.</li>
         * <li>FAILED: Failed.</li>
         * <li>CANCEL: Canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetQualityArchiveTableProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityArchiveTableProgressResponseBodyData self = new GetQualityArchiveTableProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityArchiveTableProgressResponseBodyData setArchiveTableId(Long archiveTableId) {
            this.archiveTableId = archiveTableId;
            return this;
        }
        public Long getArchiveTableId() {
            return this.archiveTableId;
        }

        public GetQualityArchiveTableProgressResponseBodyData setArchiveTableName(String archiveTableName) {
            this.archiveTableName = archiveTableName;
            return this;
        }
        public String getArchiveTableName() {
            return this.archiveTableName;
        }

        public GetQualityArchiveTableProgressResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetQualityArchiveTableProgressResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
