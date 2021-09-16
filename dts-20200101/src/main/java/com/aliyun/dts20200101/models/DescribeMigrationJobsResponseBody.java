// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Success")
    public String success;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("MigrationJobs")
    public DescribeMigrationJobsResponseBodyMigrationJobs migrationJobs;

    public static DescribeMigrationJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobsResponseBody self = new DescribeMigrationJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrationJobsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeMigrationJobsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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

    public DescribeMigrationJobsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeMigrationJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMigrationJobsResponseBody setMigrationJobs(DescribeMigrationJobsResponseBodyMigrationJobs migrationJobs) {
        this.migrationJobs = migrationJobs;
        return this;
    }
    public DescribeMigrationJobsResponseBodyMigrationJobs getMigrationJobs() {
        return this.migrationJobs;
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
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("WholeDatabase")
        public String wholeDatabase;

        @NameInMap("TableList")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList tableList;

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

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject setWholeDatabase(String wholeDatabase) {
            this.wholeDatabase = wholeDatabase;
            return this;
        }
        public String getWholeDatabase() {
            return this.wholeDatabase;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject setTableList(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList tableList) {
            this.tableList = tableList;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList getTableList() {
            return this.tableList;
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

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization extends TeaModel {
        @NameInMap("Percent")
        public String percent;

        @NameInMap("status")
        public String status;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Progress")
        public String progress;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization extends TeaModel {
        @NameInMap("Delay")
        public String delay;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("status")
        public String status;

        @NameInMap("ErrorMessage")
        public String errorMessage;

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

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint extends TeaModel {
        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("Port")
        public String port;

        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("EngineName")
        public String engineName;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode extends TeaModel {
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

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

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public String percent;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint extends TeaModel {
        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("Port")
        public String port;

        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("EngineName")
        public String engineName;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization extends TeaModel {
        @NameInMap("Percent")
        public String percent;

        @NameInMap("status")
        public String status;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Progress")
        public String progress;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob extends TeaModel {
        @NameInMap("MigrationJobName")
        public String migrationJobName;

        @NameInMap("MigrationJobStatus")
        public String migrationJobStatus;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("MigrationJobClass")
        public String migrationJobClass;

        @NameInMap("InstanceCreateTime")
        public String instanceCreateTime;

        @NameInMap("MigrationJobID")
        public String migrationJobID;

        @NameInMap("JobCreateTime")
        public String jobCreateTime;

        @NameInMap("MigrationObject")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject migrationObject;

        @NameInMap("Tags")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTags tags;

        @NameInMap("DataInitialization")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization dataInitialization;

        @NameInMap("DataSynchronization")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization dataSynchronization;

        @NameInMap("DestinationEndpoint")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint destinationEndpoint;

        @NameInMap("MigrationMode")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode migrationMode;

        @NameInMap("Precheck")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck precheck;

        @NameInMap("SourceEndpoint")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint sourceEndpoint;

        @NameInMap("StructureInitialization")
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization structureInitialization;

        public static DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob self = new DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob();
            return TeaModel.build(map, self);
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

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationJobClass(String migrationJobClass) {
            this.migrationJobClass = migrationJobClass;
            return this;
        }
        public String getMigrationJobClass() {
            return this.migrationJobClass;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setInstanceCreateTime(String instanceCreateTime) {
            this.instanceCreateTime = instanceCreateTime;
            return this;
        }
        public String getInstanceCreateTime() {
            return this.instanceCreateTime;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationJobID(String migrationJobID) {
            this.migrationJobID = migrationJobID;
            return this;
        }
        public String getMigrationJobID() {
            return this.migrationJobID;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setJobCreateTime(String jobCreateTime) {
            this.jobCreateTime = jobCreateTime;
            return this;
        }
        public String getJobCreateTime() {
            return this.jobCreateTime;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationObject(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject migrationObject) {
            this.migrationObject = migrationObject;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject getMigrationObject() {
            return this.migrationObject;
        }

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setTags(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobTags getTags() {
            return this.tags;
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

        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationMode(DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode getMigrationMode() {
            return this.migrationMode;
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
