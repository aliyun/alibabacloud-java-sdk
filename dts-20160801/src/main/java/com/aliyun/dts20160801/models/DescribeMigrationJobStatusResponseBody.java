// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobStatusResponseBody extends TeaModel {
    @NameInMap("DataInitializationStatus")
    public DescribeMigrationJobStatusResponseBodyDataInitializationStatus dataInitializationStatus;

    @NameInMap("DataSynchronizationStatus")
    public DescribeMigrationJobStatusResponseBodyDataSynchronizationStatus dataSynchronizationStatus;

    @NameInMap("DestinationEndpoint")
    public DescribeMigrationJobStatusResponseBodyDestinationEndpoint destinationEndpoint;

    @NameInMap("MigrationJobClass")
    public String migrationJobClass;

    @NameInMap("MigrationJobId")
    public String migrationJobId;

    @NameInMap("MigrationJobName")
    public String migrationJobName;

    @NameInMap("MigrationJobStatus")
    public String migrationJobStatus;

    @NameInMap("MigrationMode")
    public DescribeMigrationJobStatusResponseBodyMigrationMode migrationMode;

    @NameInMap("MigrationObject")
    public String migrationObject;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PrecheckStatus")
    public DescribeMigrationJobStatusResponseBodyPrecheckStatus precheckStatus;

    @NameInMap("SourceEndpoint")
    public DescribeMigrationJobStatusResponseBodySourceEndpoint sourceEndpoint;

    @NameInMap("StructureInitializationStatus")
    public DescribeMigrationJobStatusResponseBodyStructureInitializationStatus structureInitializationStatus;

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

    public static class DescribeMigrationJobStatusResponseBodyDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

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
        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("Delay")
        public String delay;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

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
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Port")
        public String port;

        @NameInMap("UserName")
        public String userName;

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
        @NameInMap("dataInitialization")
        public Boolean dataInitialization;

        @NameInMap("dataSynchronization")
        public Boolean dataSynchronization;

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

        @NameInMap("Percent")
        public String percent;

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
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Port")
        public String port;

        @NameInMap("UserName")
        public String userName;

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
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

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
