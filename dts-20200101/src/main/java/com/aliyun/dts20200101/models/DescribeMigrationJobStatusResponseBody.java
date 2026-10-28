// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobStatusResponseBody extends TeaModel {
    /**
     * <p>The status of the full data migration.</p>
     */
    @NameInMap("DataInitializationStatus")
    public DescribeMigrationJobStatusResponseBodyDataInitializationStatus dataInitializationStatus;

    /**
     * <p>The status of the incremental data migration.</p>
     */
    @NameInMap("DataSynchronizationStatus")
    public DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus dataSynchronizationStatus;

    /**
     * <p>The connection information of the destination instance.</p>
     */
    @NameInMap("DestinationEndpoint")
    public DescribeMigrationJobStatusResponseBodyDestinationEndpoint destinationEndpoint;

    /**
     * <p>The error code returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The specifications of the data migration instance. Valid values: <strong>small</strong>, <strong>medium</strong>, <strong>large</strong>, <strong>xlarge</strong>, and <strong>2xlarge</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/26606.html">Specifications of data migration links</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2xlarge</p>
     */
    @NameInMap("MigrationJobClass")
    public String migrationJobClass;

    /**
     * <p>The instance ID of the data migration instance.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsxxxxxxxx</p>
     */
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    /**
     * <p>The name of the data migration instance.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL migration</p>
     */
    @NameInMap("MigrationJobName")
    public String migrationJobName;

    /**
     * <p>The status of the data migration task. Valid values:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: The task is not started.</li>
     * <li><strong>Prechecking</strong>: The precheck is in progress.</li>
     * <li><strong>PrecheckFailed</strong>: The precheck failed.</li>
     * <li><strong>Migrating</strong>: The migration is in progress.</li>
     * <li><strong>Suspending</strong>: The task is being suspended.</li>
     * <li><strong>MigrationFailed</strong>: The migration failed.</li>
     * <li><strong>Finished</strong>: The migration is complete.</li>
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
     * <p>The migration objects.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;DBName\&quot;:\&quot;dtstestdata\&quot;,\&quot;TableIncludes\&quot;:[{\&quot;TableName\&quot;:\&quot;customer\&quot;}]}]</p>
     */
    @NameInMap("MigrationObject")
    public String migrationObject;

    /**
     * <p>The billing method of the data migration task. The value is fixed to <strong>PostPaid</strong> (pay-as-you-go).</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The precheck status.</p>
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
     * <p>The connection information of the source instance.</p>
     */
    @NameInMap("SourceEndpoint")
    public DescribeMigrationJobStatusResponseBodySourceEndpoint sourceEndpoint;

    /**
     * <p>The status of the schema migration.</p>
     */
    @NameInMap("StructureInitializationStatus")
    public DescribeMigrationJobStatusResponseBodyStructureInitializationStatus structureInitializationStatus;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The ID of the data migration task.</p>
     * 
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
         * <p>The error message returned if the full data migration fails.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the full data migration. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of records for which the initial full data synchronization is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>200001</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of the full data migration. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The migration is not started.</li>
         * <li><strong>Migrating</strong>: The migration is in progress.</li>
         * <li><strong>Failed</strong>: The migration failed.</li>
         * <li><strong>Finished</strong>: The migration is complete.</li>
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
         * <p>The timestamp of the latest incremental data record migrated. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1571040679</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The migration latency of the incremental data migration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Delay")
        public String delay;

        /**
         * <p>The error message returned if the incremental data migration fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The task has failed for too long and cannot be recovered</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the incremental data migration. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The status of the incremental data migration. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The migration is not started.</li>
         * <li><strong>Migrating</strong>: The migration is in progress.</li>
         * <li><strong>Failed</strong>: The migration failed.</li>
         * <li><strong>Finished</strong>: The migration is complete.</li>
         * <li><strong>Catched</strong>: No latency.</li>
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
         * <p>The name of the database to which the migration objects in the destination instance belong.</p>
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
         * <p>The instance ID of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bpxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The destination instance type.</p>
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
         * <p>This parameter is returned only when the database type of the destination instance is <strong>Oracle</strong>.</p>
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
         * <p>Specifies whether to migrate full data. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("dataInitialization")
        public Boolean dataInitialization;

        /**
         * <p>Specifies whether to migrate incremental data. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><strong>false</strong>。</p>
         */
        @NameInMap("dataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>Specifies whether to perform schema migration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><strong>false</strong>。</p>
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
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ItemName")
        public String itemName;

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
        @NameInMap("Detail")
        public DescribeMigrationJobStatusResponseBodyPrecheckStatusDetail detail;

        /**
         * <p>The overall progress of the precheck. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The status of the precheck. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The precheck is not started.</li>
         * <li><strong>Checking</strong>: The precheck is in progress.</li>
         * <li><strong>Failed</strong>: The precheck failed.</li>
         * <li><strong>Finished</strong>: The precheck is complete.</li>
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
         * <p>The name of the database to which the migration objects in the source instance belong.</p>
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
         * <p>The instance ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1i99e8l7913****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the source instance. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: An ApsaraDB RDS instance.</li>
         * <li><strong>ECS</strong>: A self-managed database hosted on an ECS instance.</li>
         * <li><strong>LocalInstance</strong>: A self-managed database with a public IP address.</li>
         * <li><strong>Express</strong>: A self-managed database connected over an Express Connect circuit, a VPN gateway, or a Smart Access Gateway (SAG).</li>
         * <li><strong>MongoDB</strong>: An ApsaraDB for MongoDB instance.</li>
         * <li><strong>POLARDB</strong>: A PolarDB for MySQL cluster. This value is available only on the Alibaba Cloud China site.</li>
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
         * <p>This parameter is returned only when the database type of the source instance is Oracle.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
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
         * <p>The error message returned if the schema migration fails.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the schema migration. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of tables for which the schema migration is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of the schema migration. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The migration is not started.</li>
         * <li><strong>Migrating</strong>: The migration is in progress.</li>
         * <li><strong>Failed</strong>: The migration failed.</li>
         * <li><strong>Finished</strong>: The migration is complete.</li>
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
