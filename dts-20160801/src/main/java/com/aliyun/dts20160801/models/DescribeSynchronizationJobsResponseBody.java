// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SynchronizationInstances")
    public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstances> synchronizationInstances;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeSynchronizationJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobsResponseBody self = new DescribeSynchronizationJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSynchronizationJobsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSynchronizationJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynchronizationJobsResponseBody setSynchronizationInstances(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstances> synchronizationInstances) {
        this.synchronizationInstances = synchronizationInstances;
        return this;
    }
    public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstances> getSynchronizationInstances() {
        return this.synchronizationInstances;
    }

    public DescribeSynchronizationJobsResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus extends TeaModel {
        @NameInMap("Delay")
        public String delay;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance extends TeaModel {
        @NameInMap("FLOW")
        public String FLOW;

        @NameInMap("RPS")
        public String RPS;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance setFLOW(String FLOW) {
            this.FLOW = FLOW;
            return this;
        }
        public String getFLOW() {
            return this.FLOW;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance setRPS(String RPS) {
            this.RPS = RPS;
            return this;
        }
        public String getRPS() {
            return this.RPS;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail> detail;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus setDetail(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects extends TeaModel {
        @NameInMap("NewSchemaName")
        public String newSchemaName;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("TableExcludes")
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes> tableExcludes;

        @NameInMap("TableIncludes")
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes> tableIncludes;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects setNewSchemaName(String newSchemaName) {
            this.newSchemaName = newSchemaName;
            return this;
        }
        public String getNewSchemaName() {
            return this.newSchemaName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects setTableExcludes(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes> tableExcludes) {
            this.tableExcludes = tableExcludes;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableExcludes> getTableExcludes() {
            return this.tableExcludes;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects setTableIncludes(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes> tableIncludes) {
            this.tableIncludes = tableIncludes;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjectsTableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstances extends TeaModel {
        @NameInMap("DataInitialization")
        public String dataInitialization;

        @NameInMap("DataInitializationStatus")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("Delay")
        public String delay;

        @NameInMap("DestinationEndpoint")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint destinationEndpoint;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Performance")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance performance;

        @NameInMap("PrecheckStatus")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus precheckStatus;

        @NameInMap("SourceEndpoint")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        public String status;

        @NameInMap("StructureInitialization")
        public String structureInitialization;

        @NameInMap("StructureInitializationStatus")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus structureInitializationStatus;

        @NameInMap("SynchronizationJobClass")
        public String synchronizationJobClass;

        @NameInMap("SynchronizationJobId")
        public String synchronizationJobId;

        @NameInMap("SynchronizationJobName")
        public String synchronizationJobName;

        @NameInMap("SynchronizationObjects")
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects> synchronizationObjects;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstances self = new DescribeSynchronizationJobsResponseBodySynchronizationInstances();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setDataInitialization(String dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public String getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setDataInitializationStatus(DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setDataSynchronizationStatus(DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setDestinationEndpoint(DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setPerformance(DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance getPerformance() {
            return this.performance;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setPrecheckStatus(DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSourceEndpoint(DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setStructureInitialization(String structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public String getStructureInitialization() {
            return this.structureInitialization;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setStructureInitializationStatus(DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationJobClass(String synchronizationJobClass) {
            this.synchronizationJobClass = synchronizationJobClass;
            return this;
        }
        public String getSynchronizationJobClass() {
            return this.synchronizationJobClass;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationJobName(String synchronizationJobName) {
            this.synchronizationJobName = synchronizationJobName;
            return this;
        }
        public String getSynchronizationJobName() {
            return this.synchronizationJobName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationObjects(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects> synchronizationObjects) {
            this.synchronizationObjects = synchronizationObjects;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects> getSynchronizationObjects() {
            return this.synchronizationObjects;
        }

    }

}
