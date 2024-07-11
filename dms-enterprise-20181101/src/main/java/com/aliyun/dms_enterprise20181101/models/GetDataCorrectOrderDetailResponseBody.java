// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectOrderDetailResponseBody extends TeaModel {
    /**
     * <p>The information about the data change ticket.</p>
     */
    @NameInMap("DataCorrectOrderDetail")
    public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail dataCorrectOrderDetail;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
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
     * <p>427688B8-ADFB-4C4E-9D45-EF5C1FD6E23D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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

    public static class GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailCronExtConfig extends TeaModel {
        @NameInMap("CurrentClearTaskCount")
        public Integer currentClearTaskCount;

        @NameInMap("OptimizeTableAfterEveryClearTimes")
        public Integer optimizeTableAfterEveryClearTimes;

        public static GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailCronExtConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailCronExtConfig self = new GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailCronExtConfig();
            return TeaModel.build(map, self);
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailCronExtConfig setCurrentClearTaskCount(Integer currentClearTaskCount) {
            this.currentClearTaskCount = currentClearTaskCount;
            return this;
        }
        public Integer getCurrentClearTaskCount() {
            return this.currentClearTaskCount;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailCronExtConfig setOptimizeTableAfterEveryClearTimes(Integer optimizeTableAfterEveryClearTimes) {
            this.optimizeTableAfterEveryClearTimes = optimizeTableAfterEveryClearTimes;
            return this;
        }
        public Integer getOptimizeTableAfterEveryClearTimes() {
            return this.optimizeTableAfterEveryClearTimes;
        }

    }

    public static class GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailImportExtConfig extends TeaModel {
        @NameInMap("CsvFirstRowIsColumnDef")
        public Boolean csvFirstRowIsColumnDef;

        @NameInMap("IgnoreError")
        public Boolean ignoreError;

        @NameInMap("ImportMode")
        public String importMode;

        @NameInMap("InsertType")
        public String insertType;

        public static GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailImportExtConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailImportExtConfig self = new GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailImportExtConfig();
            return TeaModel.build(map, self);
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailImportExtConfig setCsvFirstRowIsColumnDef(Boolean csvFirstRowIsColumnDef) {
            this.csvFirstRowIsColumnDef = csvFirstRowIsColumnDef;
            return this;
        }
        public Boolean getCsvFirstRowIsColumnDef() {
            return this.csvFirstRowIsColumnDef;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailImportExtConfig setIgnoreError(Boolean ignoreError) {
            this.ignoreError = ignoreError;
            return this;
        }
        public Boolean getIgnoreError() {
            return this.ignoreError;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailImportExtConfig setImportMode(String importMode) {
            this.importMode = importMode;
            return this;
        }
        public String getImportMode() {
            return this.importMode;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailImportExtConfig setInsertType(String insertType) {
            this.insertType = insertType;
            return this;
        }
        public String getInsertType() {
            return this.insertType;
        }

    }

    public static class GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail extends TeaModel {
        @NameInMap("Cron")
        public Boolean cron;

        @NameInMap("CronCallTimes")
        public Integer cronCallTimes;

        @NameInMap("CronExtConfig")
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailCronExtConfig cronExtConfig;

        @NameInMap("CronFormat")
        public String cronFormat;

        @NameInMap("CronLastCallStartTime")
        public String cronLastCallStartTime;

        @NameInMap("CronNextCallTime")
        public String cronNextCallTime;

        @NameInMap("CronStatus")
        public String cronStatus;

        @NameInMap("CsvTableName")
        public String csvTableName;

        @NameInMap("CurrentTaskId")
        public Long currentTaskId;

        @NameInMap("DetailType")
        public String detailType;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("FileEncoding")
        public String fileEncoding;

        @NameInMap("FileType")
        public String fileType;

        @NameInMap("ImportExtConfig")
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailImportExtConfig importExtConfig;

        public static GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail self = new GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail();
            return TeaModel.build(map, self);
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setCron(Boolean cron) {
            this.cron = cron;
            return this;
        }
        public Boolean getCron() {
            return this.cron;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setCronCallTimes(Integer cronCallTimes) {
            this.cronCallTimes = cronCallTimes;
            return this;
        }
        public Integer getCronCallTimes() {
            return this.cronCallTimes;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setCronExtConfig(GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailCronExtConfig cronExtConfig) {
            this.cronExtConfig = cronExtConfig;
            return this;
        }
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailCronExtConfig getCronExtConfig() {
            return this.cronExtConfig;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setCronFormat(String cronFormat) {
            this.cronFormat = cronFormat;
            return this;
        }
        public String getCronFormat() {
            return this.cronFormat;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setCronLastCallStartTime(String cronLastCallStartTime) {
            this.cronLastCallStartTime = cronLastCallStartTime;
            return this;
        }
        public String getCronLastCallStartTime() {
            return this.cronLastCallStartTime;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setCronNextCallTime(String cronNextCallTime) {
            this.cronNextCallTime = cronNextCallTime;
            return this;
        }
        public String getCronNextCallTime() {
            return this.cronNextCallTime;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setCronStatus(String cronStatus) {
            this.cronStatus = cronStatus;
            return this;
        }
        public String getCronStatus() {
            return this.cronStatus;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setCsvTableName(String csvTableName) {
            this.csvTableName = csvTableName;
            return this;
        }
        public String getCsvTableName() {
            return this.csvTableName;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setCurrentTaskId(Long currentTaskId) {
            this.currentTaskId = currentTaskId;
            return this;
        }
        public Long getCurrentTaskId() {
            return this.currentTaskId;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setDetailType(String detailType) {
            this.detailType = detailType;
            return this;
        }
        public String getDetailType() {
            return this.detailType;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setFileEncoding(String fileEncoding) {
            this.fileEncoding = fileEncoding;
            return this;
        }
        public String getFileEncoding() {
            return this.fileEncoding;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail setImportExtConfig(GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailImportExtConfig importExtConfig) {
            this.importExtConfig = importExtConfig;
            return this;
        }
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetailImportExtConfig getImportExtConfig() {
            return this.importExtConfig;
        }

    }

    public static class GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseListDatabase extends TeaModel {
        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>1860****</p>
         */
        @NameInMap("DbId")
        public Integer dbId;

        /**
         * <p>The engine of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment to which the database belongs. Valid values:</p>
         * <ul>
         * <li>product: production environment</li>
         * <li>dev: development environment</li>
         * <li>pre: staging environment</li>
         * <li>test: test environment</li>
         * <li>sit: system integration testing (SIT) environment</li>
         * <li>uat: user acceptance testing (UAT) environment</li>
         * <li>pet: stress testing environment</li>
         * <li>stag: STAG environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a logical database.</li>
         * <li><strong>false</strong>: The database is a physical database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The name that is used to search for the database.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx@xxx:3306</p>
         */
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
        /**
         * <p>The number of affected rows that is obtained by the precheck.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ActualAffectRows")
        public Long actualAffectRows;

        /**
         * <p>The name of the attachment that contains the SQL statements used to change data.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AttachmentName")
        public String attachmentName;

        /**
         * <p>The category of the reason for the data change.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The estimated number of affected rows.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("EstimateAffectRows")
        public Long estimateAffectRows;

        /**
         * <p>The executed SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>update t1 set name = \&quot;xxx\&quot; where id &lt;= 100</p>
         */
        @NameInMap("ExeSQL")
        public String exeSQL;

        /**
         * <p>Indicates whether the precheck result is ignored. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The precheck result is ignored.</li>
         * <li><strong>false</strong>: The precheck result is not ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IgnoreAffectRows")
        public Boolean ignoreAffectRows;

        /**
         * <p>The reason why the precheck result is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IgnoreAffectRowsReason")
        public String ignoreAffectRowsReason;

        /**
         * <p>The name of the attachment that contains the SQL statements used to roll back the data change.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RbAttachmentName")
        public String rbAttachmentName;

        /**
         * <p>The SQL statements used to roll back the data change.</p>
         * 
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("RbSQL")
        public String rbSQL;

        /**
         * <p>The format of the SQL statements used to roll back the data change. Valid values:</p>
         * <ul>
         * <li><strong>TEXT</strong>: text</li>
         * <li><strong>ATTACHMENT</strong>: attachment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("RbSQLType")
        public String rbSQLType;

        /**
         * <p>The format of the SQL statements used to change data. Valid values:</p>
         * <ul>
         * <li><strong>TEXT</strong>: text</li>
         * <li><strong>ATTACHMENT</strong>: attachment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
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
        /**
         * <p>The status of the precheck. Valid values:</p>
         * <ul>
         * <li><strong>WAITING</strong>: The ticket is pending precheck.</li>
         * <li><strong>RUNNING</strong>: The ticket is being prechecked.</li>
         * <li><strong>SUCCESS</strong>: The ticket passes the precheck.</li>
         * <li><strong>FAIL</strong>: The ticket fails the precheck.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <p>The check step of the precheck. Valid values:</p>
         * <ul>
         * <li><strong>SQL_PARSE</strong>: The system checks the syntax of the SQL statement.</li>
         * <li><strong>SQL_TYPE_CHECK</strong>: The system checks the type of the SQL statement.</li>
         * <li><strong>PERMISSION_CHECK</strong>: The system checks the permissions required for the data change.</li>
         * <li><strong>ROW_CHECK</strong>: The system checks the number of affected rows.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PERMISSION_CHECK</p>
         */
        @NameInMap("CheckStep")
        public String checkStep;

        /**
         * <p>The message that indicates a check step.</p>
         * 
         * <strong>example:</strong>
         * <p>tip messsage</p>
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
        @NameInMap("ConfigDetail")
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail configDetail;

        /**
         * <p>The information about the database in which data is changed.</p>
         */
        @NameInMap("DatabaseList")
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailDatabaseList databaseList;

        /**
         * <p>The execution mode of the ticket after the ticket is approved. Valid values:</p>
         * <ul>
         * <li><strong>COMMITOR</strong>: The data change is performed by the user who submits the ticket.</li>
         * <li><strong>AUTO</strong>: The data change is automatically performed after the ticket is approved.</li>
         * <li><strong>LAST_AUDITOR</strong>: The data change is performed by the last approver of the ticket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMMITOR</p>
         */
        @NameInMap("ExecMode")
        public String execMode;

        /**
         * <p>The details of the ticket.</p>
         */
        @NameInMap("OrderDetail")
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailOrderDetail orderDetail;

        /**
         * <p>The precheck details of the ticket.</p>
         */
        @NameInMap("PreCheckDetail")
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailPreCheckDetail preCheckDetail;

        /**
         * <p>The status of the ticket. Valid values:</p>
         * <ul>
         * <li><strong>new</strong>: The ticket is created.</li>
         * <li><strong>precheck</strong>: The ticket is being prechecked.</li>
         * <li><strong>precheck_fail</strong>: The ticket fails the precheck.</li>
         * <li><strong>precheck_success</strong>: The ticket passes the precheck and waits to be submitted for approval.</li>
         * <li><strong>toaudit</strong>: The ticket is being reviewed.</li>
         * <li><strong>Approved</strong>: The ticket is approved.</li>
         * <li><strong>reject</strong>: The ticket is rejected.</li>
         * <li><strong>waiting</strong>: The ticket is submitted and waits to be scheduled.</li>
         * <li><strong>processing</strong>: The ticket is being executed.</li>
         * <li><strong>success</strong>: The ticket is executed.</li>
         * <li><strong>closed</strong>: The ticket is closed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>approved</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail self = new GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetail setConfigDetail(GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail configDetail) {
            this.configDetail = configDetail;
            return this;
        }
        public GetDataCorrectOrderDetailResponseBodyDataCorrectOrderDetailConfigDetail getConfigDetail() {
            return this.configDetail;
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
