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
     * <p>C1D39814-9808-47F8-AFE0-AF167239AC9B</p>
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

    /**
     * <p>The total number of SQL tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ActualAffectRows")
        public Long actualAffectRows;

        /**
         * <p>The time when the SQL task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-14 10:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the SQL task group.</p>
         * 
         * <strong>example:</strong>
         * <p>432523</p>
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
