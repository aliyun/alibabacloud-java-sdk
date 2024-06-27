// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The list of data migration instances and the details of each instance.</p>
     */
    @NameInMap("MigrationJobs")
    public DescribeMigrationJobsResponseBodyMigrationJobs migrationJobs;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries that can be displayed on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED4846D-ED60-435D-88C0-7EC0CE4D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of data migration instances that belong to your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeMigrationJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobsResponseBody self = new DescribeMigrationJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeMigrationJobsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeMigrationJobsResponseBody setMigrationJobs(DescribeMigrationJobsResponseBodyMigrationJobs migrationJobs) {
        this.migrationJobs = migrationJobs;
        return this;
    }
    public DescribeMigrationJobsResponseBodyMigrationJobs getMigrationJobs() {
        return this.migrationJobs;
    }

    public DescribeMigrationJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMigrationJobsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeMigrationJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrationJobsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeMigrationJobsResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization extends TeaModel {
        /**
         * <p>The error message returned if full data migration failed.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The migration progress. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of records that have been migrated during full data migration.</p>
         * 
         * <strong>example:</strong>
         * <p>200001</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of full data migration. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Full data migration is not started.</li>
         * <li><strong>Migrating</strong>: Full data migration is in progress.</li>
         * <li><strong>Failed</strong>: Full data migration failed.</li>
         * <li><strong>Finished</strong>: Full data migration is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization extends TeaModel {
        /**
         * <p>The latency of incremental data migration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Delay")
        public String delay;

        /**
         * <p>The error message returned if incremental data migration failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of incremental data migration. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The status of incremental data migration. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Incremental data migration is not started.</li>
         * <li><strong>Migrating</strong>: Incremental data migration is in progress.</li>
         * <li><strong>Failed</strong>: Incremental data migration failed.</li>
         * <li><strong>Finished</strong>: Incremental data migration is completed.</li>
         * <li><strong>Catched</strong>: Incremental data migration is not delayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Catched</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint extends TeaModel {
        /**
         * <p>The name of the database to which the migration object in the destination instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database type of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The endpoint of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1zc3iyqe3qw****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>This parameter is returned only if the database type of the destination instance is <strong>Oracle</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The database service port of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The database account of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode extends TeaModel {
        /**
         * <p>Indicates whether full data migration is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        /**
         * <p>Indicates whether incremental data migration is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>Indicates whether schema migration is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList extends TeaModel {
        @NameInMap("Table")
        public java.util.List<String> table;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList setTable(java.util.List<String> table) {
            this.table = table;
            return this;
        }
        public java.util.List<String> getTable() {
            return this.table;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject extends TeaModel {
        /**
         * <p>The name of the database to which the migration object in the source instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The names of the migrated tables.</p>
         */
        @NameInMap("TableList")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList tableList;

        /**
         * <p>Indicates whether an entire database is migrated. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WholeDatabase")
        public String wholeDatabase;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject setTableList(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList tableList) {
            this.tableList = tableList;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList getTableList() {
            return this.tableList;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject setWholeDatabase(String wholeDatabase) {
            this.wholeDatabase = wholeDatabase;
            return this;
        }
        public String getWholeDatabase() {
            return this.wholeDatabase;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject extends TeaModel {
        @NameInMap("SynchronousObject")
        public java.util.List<DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject> synchronousObject;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject setSynchronousObject(java.util.List<DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject> synchronousObject) {
            this.synchronousObject = synchronousObject;
            return this;
        }
        public java.util.List<DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject> getSynchronousObject() {
            return this.synchronousObject;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck extends TeaModel {
        /**
         * <p>The precheck progress. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The precheck result. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: The task passed the precheck.</li>
         * <li><strong>Failed</strong>: The task failed to pass the precheck.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint extends TeaModel {
        /**
         * <p>The name of the database to which the migration object in the source instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database type of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The endpoint of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1i99e8l7913****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>This parameter is returned only if the database type of the source instance is <strong>Oracle</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The database service port of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The database account of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization extends TeaModel {
        /**
         * <p>The error message returned if schema migration failed.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of schema migration. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of tables whose schemas have been migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of schema migration. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: Schema migration is not started.</li>
         * <li><strong>Migrating</strong>: Schema migration is in progress.</li>
         * <li><strong>Failed</strong>: Schema migration failed.</li>
         * <li><strong>Finished</strong>: Schema migration is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that corresponds to the tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTagsTag self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTagsTag> tag;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTags self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTags();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTags setTag(java.util.List<DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob extends TeaModel {
        /**
         * <p>The details of full data migration.</p>
         */
        @NameInMap("DataInitialization")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization dataInitialization;

        /**
         * <p>The details of incremental data migration.</p>
         */
        @NameInMap("DataSynchronization")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization dataSynchronization;

        /**
         * <p>The connection settings of the destination instance.</p>
         */
        @NameInMap("DestinationEndpoint")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint destinationEndpoint;

        /**
         * <p>The time when the data migration instance was created. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-22T09:02:13Z</p>
         */
        @NameInMap("InstanceCreateTime")
        public String instanceCreateTime;

        /**
         * <p>The time when the data migration task was created. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-22T08:53:55Z</p>
         */
        @NameInMap("JobCreateTime")
        public String jobCreateTime;

        /**
         * <p>The specification of the data migration instance. Valid values: <strong>small</strong>, <strong>medium</strong>, <strong>large</strong>, <strong>xlarge</strong>, and <strong>2xlarge</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/26606.html">Specifications of data migration instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2xlarge</p>
         */
        @NameInMap("MigrationJobClass")
        public String migrationJobClass;

        /**
         * <p>The ID of the data migration instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtson2z28evm33****</p>
         */
        @NameInMap("MigrationJobID")
        public String migrationJobID;

        /**
         * <p>The name of the data migration task.</p>
         */
        @NameInMap("MigrationJobName")
        public String migrationJobName;

        /**
         * <p>The status of the data migration task. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The task is not started.</li>
         * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
         * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
         * <li><strong>Migrating</strong>: The task is migrating data.</li>
         * <li><strong>Suspending</strong>: The task is paused.</li>
         * <li><strong>MigrationFailed</strong>: The task failed to migrate data.</li>
         * <li><strong>Finished</strong>: The task is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Migrating</p>
         */
        @NameInMap("MigrationJobStatus")
        public String migrationJobStatus;

        /**
         * <p>The migration types.</p>
         */
        @NameInMap("MigrationMode")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode migrationMode;

        /**
         * <p>The objects that are migrated by the task.</p>
         */
        @NameInMap("MigrationObject")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject migrationObject;

        /**
         * <p>The billing method of the data migration instance. The value is <strong>PostPaid</strong> (pay-as-you-go).</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The precheck details.</p>
         */
        @NameInMap("Precheck")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck precheck;

        /**
         * <p>The connection settings of the source instance.</p>
         */
        @NameInMap("SourceEndpoint")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint sourceEndpoint;

        /**
         * <p>The details of schema migration.</p>
         */
        @NameInMap("StructureInitialization")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization structureInitialization;

        /**
         * <p>The collection of tags.</p>
         */
        @NameInMap("Tags")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTags tags;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setDataInitialization(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setDataSynchronization(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setDestinationEndpoint(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setInstanceCreateTime(String instanceCreateTime) {
            this.instanceCreateTime = instanceCreateTime;
            return this;
        }
        public String getInstanceCreateTime() {
            return this.instanceCreateTime;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setJobCreateTime(String jobCreateTime) {
            this.jobCreateTime = jobCreateTime;
            return this;
        }
        public String getJobCreateTime() {
            return this.jobCreateTime;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationJobClass(String migrationJobClass) {
            this.migrationJobClass = migrationJobClass;
            return this;
        }
        public String getMigrationJobClass() {
            return this.migrationJobClass;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationJobID(String migrationJobID) {
            this.migrationJobID = migrationJobID;
            return this;
        }
        public String getMigrationJobID() {
            return this.migrationJobID;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationJobName(String migrationJobName) {
            this.migrationJobName = migrationJobName;
            return this;
        }
        public String getMigrationJobName() {
            return this.migrationJobName;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationJobStatus(String migrationJobStatus) {
            this.migrationJobStatus = migrationJobStatus;
            return this;
        }
        public String getMigrationJobStatus() {
            return this.migrationJobStatus;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationMode(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationObject(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject migrationObject) {
            this.migrationObject = migrationObject;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject getMigrationObject() {
            return this.migrationObject;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setPrecheck(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck precheck) {
            this.precheck = precheck;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck getPrecheck() {
            return this.precheck;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setSourceEndpoint(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setStructureInitialization(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization getStructureInitialization() {
            return this.structureInitialization;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setTags(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobs extends TeaModel {
        @NameInMap("MigrationJob")
        public java.util.List<DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob> migrationJob;

        public static DescribeMigrationJobsResponseBodyMigrationJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobs self = new DescribeMigrationJobsResponseBodyMigrationJobs();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobs setMigrationJob(java.util.List<DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob> migrationJob) {
            this.migrationJob = migrationJob;
            return this;
        }
        public java.util.List<DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob> getMigrationJob() {
            return this.migrationJob;
        }

    }

}
