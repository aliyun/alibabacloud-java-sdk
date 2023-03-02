// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationProcessResponseBody extends TeaModel {
    /**
     * <p>The progress information of the migration task, including the names of all steps in and status of the migration task.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetMigrationProcessResponseBodyData> data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMigrationProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationProcessResponseBody self = new GetMigrationProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMigrationProcessResponseBody setData(java.util.List<GetMigrationProcessResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetMigrationProcessResponseBodyData> getData() {
        return this.data;
    }

    public GetMigrationProcessResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMigrationProcessResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMigrationProcessResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMigrationProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMigrationProcessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMigrationProcessResponseBodyData extends TeaModel {
        /**
         * <p>The name of the step in the migration task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The running status of the step in the migration task. Valid values:</p>
         * <br>
         * <p>*   INT</p>
         * <p>*   RUNNING</p>
         * <p>*   FAILURE</p>
         * <p>*   SUCCESS</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GetMigrationProcessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMigrationProcessResponseBodyData self = new GetMigrationProcessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMigrationProcessResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetMigrationProcessResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
