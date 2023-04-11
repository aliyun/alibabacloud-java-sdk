// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectTaskDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the data change task.</p>
     */
    @NameInMap("DataCorrectTaskDetail")
    public GetDataCorrectTaskDetailResponseBodyDataCorrectTaskDetail dataCorrectTaskDetail;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataCorrectTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectTaskDetailResponseBody self = new GetDataCorrectTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectTaskDetailResponseBody setDataCorrectTaskDetail(GetDataCorrectTaskDetailResponseBodyDataCorrectTaskDetail dataCorrectTaskDetail) {
        this.dataCorrectTaskDetail = dataCorrectTaskDetail;
        return this;
    }
    public GetDataCorrectTaskDetailResponseBodyDataCorrectTaskDetail getDataCorrectTaskDetail() {
        return this.dataCorrectTaskDetail;
    }

    public GetDataCorrectTaskDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataCorrectTaskDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataCorrectTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCorrectTaskDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataCorrectTaskDetailResponseBodyDataCorrectTaskDetail extends TeaModel {
        /**
         * <p>The number of rows affected by the SQL statement.</p>
         */
        @NameInMap("ActualAffectRows")
        public Long actualAffectRows;

        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the SQL task group.</p>
         */
        @NameInMap("DBTaskGroupId")
        public Long DBTaskGroupId;

        /**
         * <p>The state of the SQL task. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The SQL task was initialized.</p>
         * <p>*   **PENDING**: The SQL task waited to be run.</p>
         * <p>*   **BE_SCHEDULED**: The SQL task waited to be scheduled.</p>
         * <p>*   **FAIL**: The SQL task failed.</p>
         * <p>*   **SUCCESS**: The SQL task was successful.</p>
         * <p>*   **PAUSE**: The SQL task was paused.</p>
         * <p>*   **DELETE**: The SQL task was deleted.</p>
         * <p>*   **RUNNING**: The SQL task was being run.</p>
         */
        @NameInMap("jobStatus")
        public String jobStatus;

        public static GetDataCorrectTaskDetailResponseBodyDataCorrectTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDataCorrectTaskDetailResponseBodyDataCorrectTaskDetail self = new GetDataCorrectTaskDetailResponseBodyDataCorrectTaskDetail();
            return TeaModel.build(map, self);
        }

        public GetDataCorrectTaskDetailResponseBodyDataCorrectTaskDetail setActualAffectRows(Long actualAffectRows) {
            this.actualAffectRows = actualAffectRows;
            return this;
        }
        public Long getActualAffectRows() {
            return this.actualAffectRows;
        }

        public GetDataCorrectTaskDetailResponseBodyDataCorrectTaskDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDataCorrectTaskDetailResponseBodyDataCorrectTaskDetail setDBTaskGroupId(Long DBTaskGroupId) {
            this.DBTaskGroupId = DBTaskGroupId;
            return this;
        }
        public Long getDBTaskGroupId() {
            return this.DBTaskGroupId;
        }

        public GetDataCorrectTaskDetailResponseBodyDataCorrectTaskDetail setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

    }

}
