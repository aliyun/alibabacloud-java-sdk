// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectOrderDetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DataCorrectOrderDetail")
    public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail dataCorrectOrderDetail;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The message that indicates a check step.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Logic")
        public Boolean logic;

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
        @NameInMap("ActualAffectRows")
        public Long actualAffectRows;

        @NameInMap("AttachmentName")
        public String attachmentName;

        @NameInMap("Classify")
        public String classify;

        @NameInMap("EstimateAffectRows")
        public Long estimateAffectRows;

        @NameInMap("ExeSQL")
        public String exeSQL;

        @NameInMap("IgnoreAffectRows")
        public Boolean ignoreAffectRows;

        @NameInMap("IgnoreAffectRowsReason")
        public String ignoreAffectRowsReason;

        @NameInMap("RbAttachmentName")
        public String rbAttachmentName;

        @NameInMap("RbSQL")
        public String rbSQL;

        @NameInMap("RbSQLType")
        public String rbSQLType;

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
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CheckStep")
        public String checkStep;

        /**
         * <p>Queries the information about a data change ticket in Data Management (DMS).</p>
         */
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
        @NameInMap("DatabaseList")
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseList databaseList;

        @NameInMap("ExecMode")
        public String execMode;

        @NameInMap("OrderDetail")
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail orderDetail;

        /**
         * <p>The precheck details of the ticket.</p>
         */
        @NameInMap("PreCheckDetail")
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetail preCheckDetail;

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
