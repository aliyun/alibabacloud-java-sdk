// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackOrderDetailResponseBody extends TeaModel {
    @NameInMap("DataTrackOrderDetail")
    public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail dataTrackOrderDetail;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDataTrackOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataTrackOrderDetailResponseBody self = new GetDataTrackOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataTrackOrderDetailResponseBody setDataTrackOrderDetail(GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail dataTrackOrderDetail) {
        this.dataTrackOrderDetail = dataTrackOrderDetail;
        return this;
    }
    public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail getDataTrackOrderDetail() {
        return this.dataTrackOrderDetail;
    }

    public GetDataTrackOrderDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataTrackOrderDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataTrackOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataTrackOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail extends TeaModel {
        @NameInMap("DatabaseSearchName")
        public String databaseSearchName;

        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("JobEndTime")
        public String jobEndTime;

        @NameInMap("JobStartTime")
        public String jobStartTime;

        @NameInMap("JobStatus")
        public String jobStatus;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("TableNames")
        public java.util.List<String> tableNames;

        @NameInMap("TrackTypes")
        public java.util.List<String> trackTypes;

        public static GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail self = new GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail setDatabaseSearchName(String databaseSearchName) {
            this.databaseSearchName = databaseSearchName;
            return this;
        }
        public String getDatabaseSearchName() {
            return this.databaseSearchName;
        }

        public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail setJobEndTime(String jobEndTime) {
            this.jobEndTime = jobEndTime;
            return this;
        }
        public String getJobEndTime() {
            return this.jobEndTime;
        }

        public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail setJobStartTime(String jobStartTime) {
            this.jobStartTime = jobStartTime;
            return this;
        }
        public String getJobStartTime() {
            return this.jobStartTime;
        }

        public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail setTableNames(java.util.List<String> tableNames) {
            this.tableNames = tableNames;
            return this;
        }
        public java.util.List<String> getTableNames() {
            return this.tableNames;
        }

        public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail setTrackTypes(java.util.List<String> trackTypes) {
            this.trackTypes = trackTypes;
            return this;
        }
        public java.util.List<String> getTrackTypes() {
            return this.trackTypes;
        }

    }

}
