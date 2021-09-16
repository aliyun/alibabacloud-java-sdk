// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    @NameInMap("SynchronizationInstances")
    public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstances> synchronizationInstances;

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

    public DescribeSynchronizationJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynchronizationJobsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSynchronizationJobsResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSynchronizationJobsResponseBody setSynchronizationInstances(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstances> synchronizationInstances) {
        this.synchronizationInstances = synchronizationInstances;
        return this;
    }
    public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstances> getSynchronizationInstances() {
        return this.synchronizationInstances;
    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
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

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Progress")
        public String progress;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Delay")
        public String delay;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Port")
        public String port;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("EngineName")
        public String engineName;

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

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance extends TeaModel {
        @NameInMap("RPS")
        public String RPS;

        @NameInMap("FLOW")
        public String FLOW;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance setRPS(String RPS) {
            this.RPS = RPS;
            return this;
        }
        public String getRPS() {
            return this.RPS;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance setFLOW(String FLOW) {
            this.FLOW = FLOW;
            return this;
        }
        public String getFLOW() {
            return this.FLOW;
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
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Detail")
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail> detail;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus setDetail(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Port")
        public String port;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("EngineName")
        public String engineName;

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

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Progress")
        public String progress;

        public static DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus self = new DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class DescribeSynchronizationJobsResponseBodySynchronizationInstances extends TeaModel {
        @NameInMap("DataInitialization")
        public String dataInitialization;

        @NameInMap("Status")
        public String status;

        @NameInMap("SynchronizationJobName")
        public String synchronizationJobName;

        @NameInMap("Delay")
        public String delay;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("StructureInitialization")
        public String structureInitialization;

        @NameInMap("SynchronizationJobClass")
        public String synchronizationJobClass;

        @NameInMap("InstanceCreateTime")
        public String instanceCreateTime;

        @NameInMap("SynchronizationJobId")
        public String synchronizationJobId;

        @NameInMap("SynchronizationDirection")
        public String synchronizationDirection;

        @NameInMap("JobCreateTime")
        public String jobCreateTime;

        @NameInMap("Tags")
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags> tags;

        @NameInMap("SynchronizationObjects")
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects> synchronizationObjects;

        @NameInMap("DataInitializationStatus")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DestinationEndpoint")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint destinationEndpoint;

        @NameInMap("Performance")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPerformance performance;

        @NameInMap("PrecheckStatus")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesPrecheckStatus precheckStatus;

        @NameInMap("SourceEndpoint")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesSourceEndpoint sourceEndpoint;

        @NameInMap("StructureInitializationStatus")
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus structureInitializationStatus;

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

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationJobName(String synchronizationJobName) {
            this.synchronizationJobName = synchronizationJobName;
            return this;
        }
        public String getSynchronizationJobName() {
            return this.synchronizationJobName;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
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

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setStructureInitialization(String structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public String getStructureInitialization() {
            return this.structureInitialization;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationJobClass(String synchronizationJobClass) {
            this.synchronizationJobClass = synchronizationJobClass;
            return this;
        }
        public String getSynchronizationJobClass() {
            return this.synchronizationJobClass;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setInstanceCreateTime(String instanceCreateTime) {
            this.instanceCreateTime = instanceCreateTime;
            return this;
        }
        public String getInstanceCreateTime() {
            return this.instanceCreateTime;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationDirection(String synchronizationDirection) {
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setJobCreateTime(String jobCreateTime) {
            this.jobCreateTime = jobCreateTime;
            return this;
        }
        public String getJobCreateTime() {
            return this.jobCreateTime;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setTags(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesTags> getTags() {
            return this.tags;
        }

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setSynchronizationObjects(java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects> synchronizationObjects) {
            this.synchronizationObjects = synchronizationObjects;
            return this;
        }
        public java.util.List<DescribeSynchronizationJobsResponseBodySynchronizationInstancesSynchronizationObjects> getSynchronizationObjects() {
            return this.synchronizationObjects;
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

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setDestinationEndpoint(DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
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

        public DescribeSynchronizationJobsResponseBodySynchronizationInstances setStructureInitializationStatus(DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeSynchronizationJobsResponseBodySynchronizationInstancesStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

    }

}
