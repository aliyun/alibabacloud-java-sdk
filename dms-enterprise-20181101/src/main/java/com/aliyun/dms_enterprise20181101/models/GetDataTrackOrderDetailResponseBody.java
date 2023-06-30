// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackOrderDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the ticket.</p>
     */
    @NameInMap("DataTrackOrderDetail")
    public GetDataTrackOrderDetailResponseBodyDataTrackOrderDetail dataTrackOrderDetail;

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
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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
        /**
         * <p>The name that is used to search for the database.</p>
         */
        @NameInMap("DatabaseSearchName")
        public String databaseSearchName;

        /**
         * <p>The ID of the database.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The end time of the time range in which data operations are tracked. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         */
        @NameInMap("JobEndTime")
        public String jobEndTime;

        /**
         * <p>The start time of the time range in which data operations are tracked. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         */
        @NameInMap("JobStartTime")
        public String jobStartTime;

        /**
         * <p>The status of the data tracking task. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The task is being initialized.</p>
         * <p>*   **LISTING**: The binary logs are being obtained.</p>
         * <p>*   **LIST_SUCCESS**: The binary logs are successfully obtained.</p>
         * <p>*   **DOWNLOADING**: The binary logs are being downloaded.</p>
         * <p>*   **DOWNLOAD_FAIL**: The binary logs failed to be downloaded.</p>
         * <p>*   **DOWNLOAD_SUCCESS**: The binary logs are successfully downloaded.</p>
         * <p>*   **FILTERING**: The binary logs are being parsed.</p>
         * <p>*   **FILTER_FAIL**: The binary logs failed to be parsed.</p>
         * <p>*   **FILTER_SUCCESS**: The binary logs are successfully parsed.</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The description of the task status.</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The names of the tables for which data operations are tracked.</p>
         */
        @NameInMap("TableNames")
        public java.util.List<String> tableNames;

        /**
         * <p>The types of data operations that are tracked.</p>
         */
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
