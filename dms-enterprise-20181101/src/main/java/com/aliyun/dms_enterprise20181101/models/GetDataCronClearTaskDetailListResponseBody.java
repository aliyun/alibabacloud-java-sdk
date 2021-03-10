// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCronClearTaskDetailListResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("DataCronClearTaskDetailList")
    public java.util.List<GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList> dataCronClearTaskDetailList;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetDataCronClearTaskDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCronClearTaskDetailListResponseBody self = new GetDataCronClearTaskDetailListResponseBody();
        return TeaModel.build(map, self);
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

    public GetDataCronClearTaskDetailListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataCronClearTaskDetailListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataCronClearTaskDetailListResponseBody setDataCronClearTaskDetailList(java.util.List<GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList> dataCronClearTaskDetailList) {
        this.dataCronClearTaskDetailList = dataCronClearTaskDetailList;
        return this;
    }
    public java.util.List<GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList> getDataCronClearTaskDetailList() {
        return this.dataCronClearTaskDetailList;
    }

    public GetDataCronClearTaskDetailListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList extends TeaModel {
        @NameInMap("DBTaskGroupId")
        public Long DBTaskGroupId;

        @NameInMap("jobStatus")
        public String jobStatus;

        @NameInMap("ActualAffectRows")
        public Long actualAffectRows;

        @NameInMap("CreateTime")
        public String createTime;

        public static GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList self = new GetDataCronClearTaskDetailListResponseBodyDataCronClearTaskDetailList();
            return TeaModel.build(map, self);
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

    }

}
