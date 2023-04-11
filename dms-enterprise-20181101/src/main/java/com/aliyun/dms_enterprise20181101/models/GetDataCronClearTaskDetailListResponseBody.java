// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCronClearTaskDetailListResponseBody extends TeaModel {
    /**
     * <p>The historical data cleansing tasks</p>
     */
    @NameInMap("DataCronClearTaskDetailList")
    public java.util.List<GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList> dataCronClearTaskDetailList;

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

    /**
     * <p>The total number of SQL tasks.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetDataCronClearTaskDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCronClearTaskDetailListResponseBody self = new GetDataCronClearTaskDetailListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataCronClearTaskDetailListResponseBody setDataCronClearTaskDetailList(java.util.List<GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList> dataCronClearTaskDetailList) {
        this.dataCronClearTaskDetailList = dataCronClearTaskDetailList;
        return this;
    }
    public java.util.List<GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList> getDataCronClearTaskDetailList() {
        return this.dataCronClearTaskDetailList;
    }

    public GetDataCronClearTaskDetailListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataCronClearTaskDetailListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataCronClearTaskDetailListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCronClearTaskDetailListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataCronClearTaskDetailListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList extends TeaModel {
        /**
         * <p>The number of rows affected by the SQL task.</p>
         */
        @NameInMap("ActualAffectRows")
        public Long actualAffectRows;

        /**
         * <p>The time when the SQL task was created.</p>
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

        public static GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList self = new GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList();
            return TeaModel.build(map, self);
        }

        public GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList setActualAffectRows(Long actualAffectRows) {
            this.actualAffectRows = actualAffectRows;
            return this;
        }
        public Long getActualAffectRows() {
            return this.actualAffectRows;
        }

        public GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList setDBTaskGroupId(Long DBTaskGroupId) {
            this.DBTaskGroupId = DBTaskGroupId;
            return this;
        }
        public Long getDBTaskGroupId() {
            return this.DBTaskGroupId;
        }

        public GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

    }

}
