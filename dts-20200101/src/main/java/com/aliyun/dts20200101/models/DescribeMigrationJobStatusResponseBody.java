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
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The specification of the data migration instance. Valid values: **small**, **medium**, **large**, **xlarge**, and **2xlarge**. For more information, see [Specifications of data migration instances](https://help.aliyun.com/document_detail/26606.html).</p>
     */
    @NameInMap("MigrationJobClass")
    public String migrationJobClass;

    /**
     * <p>The ID of the data migration instance.</p>
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
     * <br>
     * <p>*   **NotStarted**: The task is not started.</p>
     * <p>*   **Prechecking**: The task is being prechecked.</p>
     * <p>*   **PrecheckFailed**: The task failed to pass the precheck.</p>
     * <p>*   **Migrating**: The task is migrating data.</p>
     * <p>*   **Suspending**: The task is paused.</p>
     * <p>*   **MigrationFailed**: The task failed to migrate data.</p>
     * <p>*   **Finished**: The task is completed.</p>
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
     */
    @NameInMap("MigrationObject")
    public String migrationObject;

    /**
     * <p>The billing method of the data migration instance. The value is **PostPaid** (pay-as-you-go).</p>
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
     */
    @NameInMap("Success")
    public String success;

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
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The migration progress. Unit: %.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of records that have been migrated during full data migration.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of full data migration. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**: Full data migration is not started.</p>
         * <p>*   **Migrating**: Full data migration is in progress.</p>
         * <p>*   **Failed**: Full data migration failed.</p>
         * <p>*   **Finished**: Full data migration is completed.</p>
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
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The latency of incremental data migration. Unit: seconds.</p>
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
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The status of incremental data migration. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**: Incremental data migration is not started.</p>
         * <p>*   **Migrating**: Incremental data migration is in progress.</p>
         * <p>*   **Failed**: Incremental data migration failed.</p>
         * <p>*   **Finished**: Incremental data migration is completed.</p>
         * <p>*   **Catched**: Incremental data migration is not delayed.</p>
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
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database type of the destination instance.</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The endpoint of the destination instance.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the destination instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the destination instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The database service port of the destination instance.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The database account of the destination instance.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The system ID (SID) of the Oracle database.</p>
         * <br>
         * <p>>  This parameter is returned only if the database type of the destination instance is **Oracle**.</p>
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
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("dataInitialization")
        public Boolean dataInitialization;

        /**
         * <p>Indicates whether incremental data migration is performed. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("dataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>Indicates whether schema migration is performed. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
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
         * <br>
         * <p>*   **Success**: The task passed the precheck.</p>
         * <p>*   **Failed**: The task failed to pass the precheck.</p>
         */
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <p>The error message returned if the task failed to pass the precheck.</p>
         * <br>
         * <p>>  This parameter is returned only if the return value of the **CheckStatus** parameter is **Failed**.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The name of the precheck item.</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The method to fix the precheck failure.</p>
         * <br>
         * <p>>  This parameter is returned only if the return value of the **CheckStatus** parameter is **Failed**.</p>
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
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The precheck status. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**</p>
         * <p>*   **Suspending**:</p>
         * <p>*   **Checking**</p>
         * <p>*   **Failed**</p>
         * <p>*   **Finished**</p>
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
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database type of the source instance.</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The endpoint of the source instance.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the source instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the source instance.</p>
         * <br>
         * <p>*   **RDS**: ApsaraDB RDS instance</p>
         * <p>*   **ECS**: self-managed database that is hosted on Elastic Compute Service (ECS)</p>
         * <p>*   **LocalInstance**: self-managed database with a public IP address</p>
         * <p>*   **Express**: self-managed database that is connected over Express Connect, VPN Gateway, or Smart Access Gateway</p>
         * <p>*   **MongoDB**: ApsaraDB for MongoDB instance</p>
         * <p>*   **POLARDB**: PolarDB for MySQL cluster (available only for the China site)</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The database service port of the source instance.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The database account of the source instance.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The SID of the Oracle database.</p>
         * <br>
         * <p>>  This parameter is returned only if the database type of the source instance is **Oracle**.</p>
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
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of schema migration. Unit: %.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of tables whose schemas have been migrated.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of schema migration. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**: Schema migration is not started.</p>
         * <p>*   **Migrating**: Schema migration is in progress.</p>
         * <p>*   **Failed**: Schema migration failed.</p>
         * <p>*   **Finished**: Schema migration is completed.</p>
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
