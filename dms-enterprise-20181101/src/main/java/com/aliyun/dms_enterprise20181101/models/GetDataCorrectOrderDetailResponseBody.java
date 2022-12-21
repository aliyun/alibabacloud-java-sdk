// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectOrderDetailResponseBody extends TeaModel {
    // The information about the data change ticket.
    @NameInMap("DataCorrectOrderDetail")
    public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail dataCorrectOrderDetail;

    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned if the request fails.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // - **true**: The request is successful.
    // - **false**: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static GetDataCorrectOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectOrderDetailResponseBody self = new GetDataCorrectOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectOrderDetailResponseBody setDataCorrectOrderDetail(GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail dataCorrectOrderDetail) {
        this.dataCorrectOrderDetail = dataCorrectOrderDetail;
        return this;
    }
    public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail getDataCorrectOrderDetail() {
        return this.dataCorrectOrderDetail;
    }

    public GetDataCorrectOrderDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataCorrectOrderDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataCorrectOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCorrectOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase extends TeaModel {
        // The ID of the database.
        @NameInMap("DbId")
        public Integer dbId;

        // The engine of the database.
        @NameInMap("DbType")
        public String dbType;

        // The type of the environment to which the database belongs. Valid values:
        // 
        // - product: production environment
        // - dev: development environment
        // - pre: staging environment
        // - test: test environment
        // - sit: system integration testing (SIT) environment
        // - uat: user acceptance testing (UAT) environment
        // - pet: stress testing environment
        // - stag: STAG environment
        @NameInMap("EnvType")
        public String envType;

        // Indicates whether the database is a logical database. Valid values:
        // 
        // - **true**: The database is a logical database.
        // - **false**: The database is a physical database.
        @NameInMap("Logic")
        public Boolean logic;

        // The name that is used to search for the database.
        @NameInMap("SearchName")
        public String searchName;

        public static GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase build(java.util.Map<String, ?> map) throws Exception {
            GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase self = new GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase();
            return TeaModel.build(map, self);
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

    public static class GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseList extends TeaModel {
        @NameInMap("Database")
        public java.util.List<GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase> database;

        public static GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseList build(java.util.Map<String, ?> map) throws Exception {
            GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseList self = new GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseList();
            return TeaModel.build(map, self);
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseList setDatabase(java.util.List<GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase> database) {
            this.database = database;
            return this;
        }
        public java.util.List<GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase> getDatabase() {
            return this.database;
        }

    }

    public static class GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail extends TeaModel {
        // The number of affected rows that is obtained by the precheck.
        @NameInMap("ActualAffectRows")
        public Long actualAffectRows;

        // The name of the attachment that contains the SQL statements used to change data.
        @NameInMap("AttachmentName")
        public String attachmentName;

        // The category of the reason for the data change.
        @NameInMap("Classify")
        public String classify;

        // The estimated number of affected rows.
        @NameInMap("EstimateAffectRows")
        public Long estimateAffectRows;

        // The executed SQL statements.
        @NameInMap("ExeSQL")
        public String exeSQL;

        // Indicates whether the precheck result is ignored. Valid values:
        // 
        // - **true**: The precheck result is ignored.
        // - **false**: The precheck result is not ignored.
        @NameInMap("IgnoreAffectRows")
        public Boolean ignoreAffectRows;

        // The reason why the precheck result is ignored.
        @NameInMap("IgnoreAffectRowsReason")
        public String ignoreAffectRowsReason;

        // The name of the attachment that contains the SQL statements used to roll back the data change.
        @NameInMap("RbAttachmentName")
        public String rbAttachmentName;

        // The SQL statements used to roll back the data change.
        @NameInMap("RbSQL")
        public String rbSQL;

        // The format of the SQL statements used to roll back the data change. Valid values:
        // 
        // - **TEXT**: text
        // - **ATTACHMENT**: attachment
        @NameInMap("RbSQLType")
        public String rbSQLType;

        // The format of the SQL statements used to change data. Valid values:
        // 
        // - **TEXT**: text
        // - **ATTACHMENT**: attachment
        @NameInMap("SqlType")
        public String sqlType;

        public static GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail self = new GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail setActualAffectRows(Long actualAffectRows) {
            this.actualAffectRows = actualAffectRows;
            return this;
        }
        public Long getActualAffectRows() {
            return this.actualAffectRows;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail setEstimateAffectRows(Long estimateAffectRows) {
            this.estimateAffectRows = estimateAffectRows;
            return this;
        }
        public Long getEstimateAffectRows() {
            return this.estimateAffectRows;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail setExeSQL(String exeSQL) {
            this.exeSQL = exeSQL;
            return this;
        }
        public String getExeSQL() {
            return this.exeSQL;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail setIgnoreAffectRows(Boolean ignoreAffectRows) {
            this.ignoreAffectRows = ignoreAffectRows;
            return this;
        }
        public Boolean getIgnoreAffectRows() {
            return this.ignoreAffectRows;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail setIgnoreAffectRowsReason(String ignoreAffectRowsReason) {
            this.ignoreAffectRowsReason = ignoreAffectRowsReason;
            return this;
        }
        public String getIgnoreAffectRowsReason() {
            return this.ignoreAffectRowsReason;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail setRbAttachmentName(String rbAttachmentName) {
            this.rbAttachmentName = rbAttachmentName;
            return this;
        }
        public String getRbAttachmentName() {
            return this.rbAttachmentName;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail setRbSQL(String rbSQL) {
            this.rbSQL = rbSQL;
            return this;
        }
        public String getRbSQL() {
            return this.rbSQL;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail setRbSQLType(String rbSQLType) {
            this.rbSQLType = rbSQLType;
            return this;
        }
        public String getRbSQLType() {
            return this.rbSQLType;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

    }

    public static class GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetailTaskCheckDO extends TeaModel {
        // The status of the precheck. Valid values:
        // 
        // *   **WAITING**: The ticket is pending precheck.
        // *   **RUNNING**: The ticket is being prechecked.
        // *   **SUCCESS**: The ticket passes the precheck.
        // *   **FAIL**: The ticket fails the precheck.
        @NameInMap("CheckStatus")
        public String checkStatus;

        // The check step of the precheck. Valid values:
        // 
        // *   **SQL_PARSE**: The system checks the syntax of the SQL statement.
        // *   **SQL_TYPE_CHECK**: The system checks the type of the SQL statement.
        // *   **PERMISSION_CHECK**: The system checks the permissions required for the data change.
        // *   **ROW_CHECK**: The system checks the number of affected rows.
        @NameInMap("CheckStep")
        public String checkStep;

        // The message that indicates a check step.
        @NameInMap("UserTip")
        public String userTip;

        public static GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetailTaskCheckDO build(java.util.Map<String, ?> map) throws Exception {
            GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetailTaskCheckDO self = new GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetailTaskCheckDO();
            return TeaModel.build(map, self);
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetailTaskCheckDO setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetailTaskCheckDO setCheckStep(String checkStep) {
            this.checkStep = checkStep;
            return this;
        }
        public String getCheckStep() {
            return this.checkStep;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetailTaskCheckDO setUserTip(String userTip) {
            this.userTip = userTip;
            return this;
        }
        public String getUserTip() {
            return this.userTip;
        }

    }

    public static class GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetail extends TeaModel {
        @NameInMap("TaskCheckDO")
        public java.util.List<GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetailTaskCheckDO> taskCheckDO;

        public static GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetail self = new GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetail();
            return TeaModel.build(map, self);
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetail setTaskCheckDO(java.util.List<GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetailTaskCheckDO> taskCheckDO) {
            this.taskCheckDO = taskCheckDO;
            return this;
        }
        public java.util.List<GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetailTaskCheckDO> getTaskCheckDO() {
            return this.taskCheckDO;
        }

    }

    public static class GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail extends TeaModel {
        // The information about the database in which data is changed.
        @NameInMap("DatabaseList")
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseList databaseList;

        // The execution mode of the ticket after the ticket is approved. Valid values:
        // 
        // - **COMMITOR**: The data change is performed by the user who submits the ticket.
        // - **AUTO**: The data change is automatically performed after the ticket is approved.
        // - **LAST_AUDITOR**: The data change is performed by the last approver of the ticket.
        @NameInMap("ExecMode")
        public String execMode;

        // The details of the ticket.
        @NameInMap("OrderDetail")
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail orderDetail;

        // The precheck details of the ticket.
        @NameInMap("PreCheckDetail")
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetail preCheckDetail;

        // The status of the ticket. Valid values:
        // 
        // - **new**: The ticket is created.
        // - **precheck**: The ticket is being prechecked.
        // - **precheck_fail**: The ticket fails the precheck.
        // - **precheck_success**: The ticket passes the precheck and waits to be submitted for approval.
        // - **toaudit**: The ticket is being reviewed.
        // - **Approved**: The ticket is approved.
        // - **reject**: The ticket is rejected.
        // - **waiting**: The ticket is submitted and waits to be scheduled.
        // - **processing**: The ticket is being executed.
        // - **success**: The ticket is executed.
        // - **closed**: The ticket is closed.
        @NameInMap("Status")
        public String status;

        public static GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail self = new GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail setDatabaseList(GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseList databaseList) {
            this.databaseList = databaseList;
            return this;
        }
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseList getDatabaseList() {
            return this.databaseList;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail setExecMode(String execMode) {
            this.execMode = execMode;
            return this;
        }
        public String getExecMode() {
            return this.execMode;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail setOrderDetail(GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail orderDetail) {
            this.orderDetail = orderDetail;
            return this;
        }
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail getOrderDetail() {
            return this.orderDetail;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail setPreCheckDetail(GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetail preCheckDetail) {
            this.preCheckDetail = preCheckDetail;
            return this;
        }
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetail getPreCheckDetail() {
            return this.preCheckDetail;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
