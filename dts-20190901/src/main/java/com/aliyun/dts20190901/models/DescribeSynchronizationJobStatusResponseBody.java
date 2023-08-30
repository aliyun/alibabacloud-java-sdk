// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobStatusResponseBody extends TeaModel {
    @NameInMap("Checkpoint")
    public String checkpoint;

    @NameInMap("DataInitialization")
    public String dataInitialization;

    @NameInMap("DataInitializationStatus")
    public DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus dataInitializationStatus;

    @NameInMap("DataSynchronizationStatus")
    public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus dataSynchronizationStatus;

    @NameInMap("Delay")
    public String delay;

    @NameInMap("DestinationEndpoint")
    public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint destinationEndpoint;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Performance")
    public DescribeSynchronizationJobStatusResponseBodyPerformance performance;

    @NameInMap("PrecheckStatus")
    public DescribeSynchronizationJobStatusResponseBodyPrecheckStatus precheckStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceEndpoint")
    public DescribeSynchronizationJobStatusResponseBodySourceEndpoint sourceEndpoint;

    @NameInMap("Status")
    public String status;

    @NameInMap("StructureInitialization")
    public String structureInitialization;

    @NameInMap("StructureInitializationStatus")
    public DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus structureInitializationStatus;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("SynchronizationJobClass")
    public String synchronizationJobClass;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    @NameInMap("SynchronizationJobName")
    public String synchronizationJobName;

    @NameInMap("SynchronizationObjects")
    public java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjects> synchronizationObjects;

    public static DescribeSynchronizationJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobStatusResponseBody self = new DescribeSynchronizationJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobStatusResponseBody setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public DescribeSynchronizationJobStatusResponseBody setDataInitialization(String dataInitialization) {
        this.dataInitialization = dataInitialization;
        return this;
    }
    public String getDataInitialization() {
        return this.dataInitialization;
    }

    public DescribeSynchronizationJobStatusResponseBody setDataInitializationStatus(DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus dataInitializationStatus) {
        this.dataInitializationStatus = dataInitializationStatus;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus getDataInitializationStatus() {
        return this.dataInitializationStatus;
    }

    public DescribeSynchronizationJobStatusResponseBody setDataSynchronizationStatus(DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus dataSynchronizationStatus) {
        this.dataSynchronizationStatus = dataSynchronizationStatus;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus getDataSynchronizationStatus() {
        return this.dataSynchronizationStatus;
    }

    public DescribeSynchronizationJobStatusResponseBody setDelay(String delay) {
        this.delay = delay;
        return this;
    }
    public String getDelay() {
        return this.delay;
    }

    public DescribeSynchronizationJobStatusResponseBody setDestinationEndpoint(DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint destinationEndpoint) {
        this.destinationEndpoint = destinationEndpoint;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    public DescribeSynchronizationJobStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeSynchronizationJobStatusResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeSynchronizationJobStatusResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeSynchronizationJobStatusResponseBody setPerformance(DescribeSynchronizationJobStatusResponseBodyPerformance performance) {
        this.performance = performance;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodyPerformance getPerformance() {
        return this.performance;
    }

    public DescribeSynchronizationJobStatusResponseBody setPrecheckStatus(DescribeSynchronizationJobStatusResponseBodyPrecheckStatus precheckStatus) {
        this.precheckStatus = precheckStatus;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodyPrecheckStatus getPrecheckStatus() {
        return this.precheckStatus;
    }

    public DescribeSynchronizationJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynchronizationJobStatusResponseBody setSourceEndpoint(DescribeSynchronizationJobStatusResponseBodySourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodySourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public DescribeSynchronizationJobStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSynchronizationJobStatusResponseBody setStructureInitialization(String structureInitialization) {
        this.structureInitialization = structureInitialization;
        return this;
    }
    public String getStructureInitialization() {
        return this.structureInitialization;
    }

    public DescribeSynchronizationJobStatusResponseBody setStructureInitializationStatus(DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus structureInitializationStatus) {
        this.structureInitializationStatus = structureInitializationStatus;
        return this;
    }
    public DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus getStructureInitializationStatus() {
        return this.structureInitializationStatus;
    }

    public DescribeSynchronizationJobStatusResponseBody setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public DescribeSynchronizationJobStatusResponseBody setSynchronizationJobClass(String synchronizationJobClass) {
        this.synchronizationJobClass = synchronizationJobClass;
        return this;
    }
    public String getSynchronizationJobClass() {
        return this.synchronizationJobClass;
    }

    public DescribeSynchronizationJobStatusResponseBody setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public DescribeSynchronizationJobStatusResponseBody setSynchronizationJobName(String synchronizationJobName) {
        this.synchronizationJobName = synchronizationJobName;
        return this;
    }
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    public DescribeSynchronizationJobStatusResponseBody setSynchronizationObjects(java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjects> synchronizationObjects) {
        this.synchronizationObjects = synchronizationObjects;
        return this;
    }
    public java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjects> getSynchronizationObjects() {
        return this.synchronizationObjects;
    }

    public static class DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus self = new DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus extends TeaModel {
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

        public static DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus self = new DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobStatusResponseBodyDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint extends TeaModel {
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

        public static DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint self = new DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeSynchronizationJobStatusResponseBodyDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodyPerformance extends TeaModel {
        @NameInMap("FLOW")
        public String FLOW;

        @NameInMap("RPS")
        public String RPS;

        public static DescribeSynchronizationJobStatusResponseBodyPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyPerformance self = new DescribeSynchronizationJobStatusResponseBodyPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyPerformance setFLOW(String FLOW) {
            this.FLOW = FLOW;
            return this;
        }
        public String getFLOW() {
            return this.FLOW;
        }

        public DescribeSynchronizationJobStatusResponseBodyPerformance setRPS(String RPS) {
            this.RPS = RPS;
            return this;
        }
        public String getRPS() {
            return this.RPS;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail self = new DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodyPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail> detail;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobStatusResponseBodyPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyPrecheckStatus self = new DescribeSynchronizationJobStatusResponseBodyPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatus setDetail(java.util.List<DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobStatusResponseBodyPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobStatusResponseBodyPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodySourceEndpoint extends TeaModel {
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

        public static DescribeSynchronizationJobStatusResponseBodySourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodySourceEndpoint self = new DescribeSynchronizationJobStatusResponseBodySourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodySourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeSynchronizationJobStatusResponseBodySourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSynchronizationJobStatusResponseBodySourceEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSynchronizationJobStatusResponseBodySourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSynchronizationJobStatusResponseBodySourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeSynchronizationJobStatusResponseBodySourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus self = new DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSynchronizationJobStatusResponseBodyStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        public static DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes self = new DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        public static DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes self = new DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeSynchronizationJobStatusResponseBodySynchronizationObjects extends TeaModel {
        @NameInMap("NewSchemaName")
        public String newSchemaName;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("TableExcludes")
        public java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes> tableExcludes;

        @NameInMap("TableIncludes")
        public java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes> tableIncludes;

        public static DescribeSynchronizationJobStatusResponseBodySynchronizationObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobStatusResponseBodySynchronizationObjects self = new DescribeSynchronizationJobStatusResponseBodySynchronizationObjects();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobStatusResponseBodySynchronizationObjects setNewSchemaName(String newSchemaName) {
            this.newSchemaName = newSchemaName;
            return this;
        }
        public String getNewSchemaName() {
            return this.newSchemaName;
        }

        public DescribeSynchronizationJobStatusResponseBodySynchronizationObjects setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeSynchronizationJobStatusResponseBodySynchronizationObjects setTableExcludes(java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes> tableExcludes) {
            this.tableExcludes = tableExcludes;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableExcludes> getTableExcludes() {
            return this.tableExcludes;
        }

        public DescribeSynchronizationJobStatusResponseBodySynchronizationObjects setTableIncludes(java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes> tableIncludes) {
            this.tableIncludes = tableIncludes;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobStatusResponseBodySynchronizationObjectsTableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

    }

}
