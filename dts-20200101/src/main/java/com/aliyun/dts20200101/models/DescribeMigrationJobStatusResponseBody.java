// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobStatusResponseBody extends TeaModel {
    /**
     * <p>The status of full data migration.</p>
     */
    @NameInMap("DataInitializationStatus")
    public DescribeMigrationJobStatusResponseBodyDataInitializationStatus dataInitializationStatus;

    /**
     * <p>The status of incremental data migration.</p>
     */
    @NameInMap("DataSynchronizationStatus")
    public DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus dataSynchronizationStatus;

    /**
     * <p>The connection settings of the destination instance.</p>
     */
    @NameInMap("DestinationEndpoint")
    public DescribeMigrationJobStatusResponseBodyDestinationEndpoint destinationEndpoint;

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
     * <p>dtsz2v12jfo309****</p>
     */
    @NameInMap("MigrationJobId")
    public String migrationJobId;

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
    public DescribeMigrationJobStatusResponseBodyMigrationMode migrationMode;

    /**
     * <p>The objects that are migrated by the task.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;DBName\&quot;:\&quot;dtstestdata\&quot;,\&quot;TableIncludes\&quot;:[{\&quot;TableName\&quot;:\&quot;customer\&quot;}]}]</p>
     */
    @NameInMap("MigrationObject")
    public String migrationObject;

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
    @NameInMap("PrecheckStatus")
    public DescribeMigrationJobStatusResponseBodyPrecheckStatus precheckStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A032E3B4-929B-48E9-97B9-37587CBF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The connection settings of the source instance.</p>
     */
    @NameInMap("SourceEndpoint")
    public DescribeMigrationJobStatusResponseBodySourceEndpoint sourceEndpoint;

    /**
     * <p>The status of schema migration.</p>
     */
    @NameInMap("StructureInitializationStatus")
    public DescribeMigrationJobStatusResponseBodyStructureInitializationStatus structureInitializationStatus;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>z2v12jfo309****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeMigrationJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobStatusResponseBody self = new DescribeMigrationJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobStatusResponseBody setDataInitializationStatus(DescribeMigrationJobStatusResponseBodyDataInitializationStatus dataInitializationStatus) {
        this.dataInitializationStatus = dataInitializationStatus;
        return this;
    }
    public DescribeMigrationJobStatusResponseBodyDataInitializationStatus getDataInitializationStatus() {
        return this.dataInitializationStatus;
    }

    public DescribeMigrationJobStatusResponseBody setDataSynchronizationStatus(DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus dataSynchronizationStatus) {
        this.dataSynchronizationStatus = dataSynchronizationStatus;
        return this;
    }
    public DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus getDataSynchronizationStatus() {
        return this.dataSynchronizationStatus;
    }

    public DescribeMigrationJobStatusResponseBody setDestinationEndpoint(DescribeMigrationJobStatusResponseBodyDestinationEndpoint destinationEndpoint) {
        this.destinationEndpoint = destinationEndpoint;
        return this;
    }
    public DescribeMigrationJobStatusResponseBodyDestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    public DescribeMigrationJobStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeMigrationJobStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeMigrationJobStatusResponseBody setMigrationJobClass(String migrationJobClass) {
        this.migrationJobClass = migrationJobClass;
        return this;
    }
    public String getMigrationJobClass() {
        return this.migrationJobClass;
    }

    public DescribeMigrationJobStatusResponseBody setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public DescribeMigrationJobStatusResponseBody setMigrationJobName(String migrationJobName) {
        this.migrationJobName = migrationJobName;
        return this;
    }
    public String getMigrationJobName() {
        return this.migrationJobName;
    }

    public DescribeMigrationJobStatusResponseBody setMigrationJobStatus(String migrationJobStatus) {
        this.migrationJobStatus = migrationJobStatus;
        return this;
    }
    public String getMigrationJobStatus() {
        return this.migrationJobStatus;
    }

    public DescribeMigrationJobStatusResponseBody setMigrationMode(DescribeMigrationJobStatusResponseBodyMigrationMode migrationMode) {
        this.migrationMode = migrationMode;
        return this;
    }
    public DescribeMigrationJobStatusResponseBodyMigrationMode getMigrationMode() {
        return this.migrationMode;
    }

    public DescribeMigrationJobStatusResponseBody setMigrationObject(String migrationObject) {
        this.migrationObject = migrationObject;
        return this;
    }
    public String getMigrationObject() {
        return this.migrationObject;
    }

    public DescribeMigrationJobStatusResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeMigrationJobStatusResponseBody setPrecheckStatus(DescribeMigrationJobStatusResponseBodyPrecheckStatus precheckStatus) {
        this.precheckStatus = precheckStatus;
        return this;
    }
    public DescribeMigrationJobStatusResponseBodyPrecheckStatus getPrecheckStatus() {
        return this.precheckStatus;
    }

    public DescribeMigrationJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrationJobStatusResponseBody setSourceEndpoint(DescribeMigrationJobStatusResponseBodySourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public DescribeMigrationJobStatusResponseBodySourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public DescribeMigrationJobStatusResponseBody setStructureInitializationStatus(DescribeMigrationJobStatusResponseBodyStructureInitializationStatus structureInitializationStatus) {
        this.structureInitializationStatus = structureInitializationStatus;
        return this;
    }
    public DescribeMigrationJobStatusResponseBodyStructureInitializationStatus getStructureInitializationStatus() {
        return this.structureInitializationStatus;
    }

    public DescribeMigrationJobStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeMigrationJobStatusResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class DescribeMigrationJobStatusResponseBodyDataInitializationStatus extends TeaModel {
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
        @NameInMap("Status")
        public String status;

        public static DescribeMigrationJobStatusResponseBodyDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobStatusResponseBodyDataInitializationStatus self = new DescribeMigrationJobStatusResponseBodyDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobStatusResponseBodyDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobStatusResponseBodyDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeMigrationJobStatusResponseBodyDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeMigrationJobStatusResponseBodyDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus extends TeaModel {
        /**
         * <p>The UNIX timestamp generated when the latest incremental data is migrated. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1612507847</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

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
        @NameInMap("Status")
        public String status;

        public static DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus self = new DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMigrationJobStatusResponseBodyDestinationEndpoint extends TeaModel {
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
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

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

        /**
         * <p>The system ID (SID) of the Oracle database.</p>
         * <blockquote>
         * <p> This parameter is returned only if the database type of the destination instance is <strong>Oracle</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("oracleSID")
        public String oracleSID;

        public static DescribeMigrationJobStatusResponseBodyDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobStatusResponseBodyDestinationEndpoint self = new DescribeMigrationJobStatusResponseBodyDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobStatusResponseBodyDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeMigrationJobStatusResponseBodyDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeMigrationJobStatusResponseBodyDestinationEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeMigrationJobStatusResponseBodyDestinationEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMigrationJobStatusResponseBodyDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeMigrationJobStatusResponseBodyDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeMigrationJobStatusResponseBodyDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeMigrationJobStatusResponseBodyDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

    }

    public static class DescribeMigrationJobStatusResponseBodyMigrationMode extends TeaModel {
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
        @NameInMap("dataInitialization")
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
        @NameInMap("dataSynchronization")
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
        @NameInMap("structureInitialization")
        public Boolean structureInitialization;

        public static DescribeMigrationJobStatusResponseBodyMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobStatusResponseBodyMigrationMode self = new DescribeMigrationJobStatusResponseBodyMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobStatusResponseBodyMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeMigrationJobStatusResponseBodyMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeMigrationJobStatusResponseBodyMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeMigrationJobStatusResponseBodyPrecheckStatusDetailCheckItem extends TeaModel {
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
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <p>The error message returned if the task failed to pass the precheck.</p>
         * <blockquote>
         * <p> This parameter is returned only if the return value of the <strong>CheckStatus</strong> parameter is <strong>Failed</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Original error: Access denied for user \&quot;dtstest\&quot;@\&quot;100.104.***.**\&quot; (using password: YES)</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The name of the precheck item.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_CONN_SRC</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The method to fix the precheck failure.</p>
         * <blockquote>
         * <p> This parameter is returned only if the return value of the <strong>CheckStatus</strong> parameter is <strong>Failed</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
         */
        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeMigrationJobStatusResponseBodyPrecheckStatusDetailCheckItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobStatusResponseBodyPrecheckStatusDetailCheckItem self = new DescribeMigrationJobStatusResponseBodyPrecheckStatusDetailCheckItem();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobStatusResponseBodyPrecheckStatusDetailCheckItem setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeMigrationJobStatusResponseBodyPrecheckStatusDetailCheckItem setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobStatusResponseBodyPrecheckStatusDetailCheckItem setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeMigrationJobStatusResponseBodyPrecheckStatusDetailCheckItem setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeMigrationJobStatusResponseBodyPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckItem")
        public java.util.List<DescribeMigrationJobStatusResponseBodyPrecheckStatusDetailCheckItem> checkItem;

        public static DescribeMigrationJobStatusResponseBodyPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobStatusResponseBodyPrecheckStatusDetail self = new DescribeMigrationJobStatusResponseBodyPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobStatusResponseBodyPrecheckStatusDetail setCheckItem(java.util.List<DescribeMigrationJobStatusResponseBodyPrecheckStatusDetailCheckItem> checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public java.util.List<DescribeMigrationJobStatusResponseBodyPrecheckStatusDetailCheckItem> getCheckItem() {
            return this.checkItem;
        }

    }

    public static class DescribeMigrationJobStatusResponseBodyPrecheckStatus extends TeaModel {
        /**
         * <p>The result of each precheck item.</p>
         */
        @NameInMap("Detail")
        public DescribeMigrationJobStatusResponseBodyPrecheckStatusDetail detail;

        /**
         * <p>The precheck progress. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The precheck status. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong></li>
         * <li><strong>Suspending</strong>:</li>
         * <li><strong>Checking</strong></li>
         * <li><strong>Failed</strong></li>
         * <li><strong>Finished</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeMigrationJobStatusResponseBodyPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobStatusResponseBodyPrecheckStatus self = new DescribeMigrationJobStatusResponseBodyPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobStatusResponseBodyPrecheckStatus setDetail(DescribeMigrationJobStatusResponseBodyPrecheckStatusDetail detail) {
            this.detail = detail;
            return this;
        }
        public DescribeMigrationJobStatusResponseBodyPrecheckStatusDetail getDetail() {
            return this.detail;
        }

        public DescribeMigrationJobStatusResponseBodyPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeMigrationJobStatusResponseBodyPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMigrationJobStatusResponseBodySourceEndpoint extends TeaModel {
        /**
         * <p>The name of the database to which the migration object in the source instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdatabase</p>
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
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the source instance.</p>
         * <ul>
         * <li><strong>RDS</strong>: ApsaraDB RDS instance</li>
         * <li><strong>ECS</strong>: self-managed database that is hosted on Elastic Compute Service (ECS)</li>
         * <li><strong>LocalInstance</strong>: self-managed database with a public IP address</li>
         * <li><strong>Express</strong>: self-managed database that is connected over Express Connect, VPN Gateway, or Smart Access Gateway</li>
         * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance</li>
         * <li><strong>POLARDB</strong>: PolarDB for MySQL cluster (available only for the China site)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

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

        /**
         * <p>The SID of the Oracle database.</p>
         * <blockquote>
         * <p> This parameter is returned only if the database type of the source instance is <strong>Oracle</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtstestdatabase</p>
         */
        @NameInMap("oracleSID")
        public String oracleSID;

        public static DescribeMigrationJobStatusResponseBodySourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobStatusResponseBodySourceEndpoint self = new DescribeMigrationJobStatusResponseBodySourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobStatusResponseBodySourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeMigrationJobStatusResponseBodySourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeMigrationJobStatusResponseBodySourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeMigrationJobStatusResponseBodySourceEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMigrationJobStatusResponseBodySourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeMigrationJobStatusResponseBodySourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeMigrationJobStatusResponseBodySourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeMigrationJobStatusResponseBodySourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

    }

    public static class DescribeMigrationJobStatusResponseBodyStructureInitializationStatus extends TeaModel {
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
        @NameInMap("Status")
        public String status;

        public static DescribeMigrationJobStatusResponseBodyStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobStatusResponseBodyStructureInitializationStatus self = new DescribeMigrationJobStatusResponseBodyStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobStatusResponseBodyStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobStatusResponseBodyStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeMigrationJobStatusResponseBodyStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeMigrationJobStatusResponseBodyStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
