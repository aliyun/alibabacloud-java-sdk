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
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B5FD0BC8-2D90-4478-B8EC-A0E92E0B1773</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ActualAffectRows")
        public Long actualAffectRows;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-05 15:08:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the SQL task group.</p>
         * 
         * <strong>example:</strong>
         * <p>1234235</p>
         */
        @NameInMap("DBTaskGroupId")
        public Long DBTaskGroupId;

        /**
         * <p>The state of the SQL task. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The SQL task was initialized.</li>
         * <li><strong>PENDING</strong>: The SQL task waited to be run.</li>
         * <li><strong>BE_SCHEDULED</strong>: The SQL task waited to be scheduled.</li>
         * <li><strong>FAIL</strong>: The SQL task failed.</li>
         * <li><strong>SUCCESS</strong>: The SQL task was successful.</li>
         * <li><strong>PAUSE</strong>: The SQL task was paused.</li>
         * <li><strong>DELETE</strong>: The SQL task was deleted.</li>
         * <li><strong>RUNNING</strong>: The SQL task was being run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
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
