// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectTaskDetailResponseBody extends TeaModel {
    @NameInMap("DataCorrectTaskDetail")
    public GetDataCorrectTaskDetailResponseBodyDataCorrectTaskDetail dataCorrectTaskDetail;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ActualAffectRows")
        public Long actualAffectRows;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBTaskGroupId")
        public Long DBTaskGroupId;

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
