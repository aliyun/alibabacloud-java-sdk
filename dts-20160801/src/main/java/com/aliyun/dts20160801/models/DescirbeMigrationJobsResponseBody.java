// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DescirbeMigrationJobsResponseBody extends TeaModel {
    @NameInMap("MigrationJobs")
    public DescirbeMigrationJobsResponseBodyMigrationJobs migrationJobs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescirbeMigrationJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescirbeMigrationJobsResponseBody self = new DescirbeMigrationJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescirbeMigrationJobsResponseBody setMigrationJobs(DescirbeMigrationJobsResponseBodyMigrationJobs migrationJobs) {
        this.migrationJobs = migrationJobs;
        return this;
    }
    public DescirbeMigrationJobsResponseBodyMigrationJobs getMigrationJobs() {
        return this.migrationJobs;
    }

    public DescirbeMigrationJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescirbeMigrationJobsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescirbeMigrationJobsResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("status")
        public String status;

        public static DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization build(java.util.Map<String, ?> map) throws Exception {
            DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization self = new DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization();
            return TeaModel.build(map, self);
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization extends TeaModel {
        @NameInMap("Delay")
        public String delay;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("status")
        public String status;

        public static DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization build(java.util.Map<String, ?> map) throws Exception {
            DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization self = new DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization();
            return TeaModel.build(map, self);
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("UserName")
        public String userName;

        public static DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint self = new DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode extends TeaModel {
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode self = new DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList extends TeaModel {
        @NameInMap("Table")
        public java.util.List<String> table;

        public static DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList build(java.util.Map<String, ?> map) throws Exception {
            DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList self = new DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList();
            return TeaModel.build(map, self);
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList setTable(java.util.List<String> table) {
            this.table = table;
            return this;
        }
        public java.util.List<String> getTable() {
            return this.table;
        }

    }

    public static class DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("TableList")
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList tableList;

        @NameInMap("WholeDatabase")
        public String wholeDatabase;

        public static DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject build(java.util.Map<String, ?> map) throws Exception {
            DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject self = new DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject();
            return TeaModel.build(map, self);
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject setTableList(DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList tableList) {
            this.tableList = tableList;
            return this;
        }
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObjectTableList getTableList() {
            return this.tableList;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject setWholeDatabase(String wholeDatabase) {
            this.wholeDatabase = wholeDatabase;
            return this;
        }
        public String getWholeDatabase() {
            return this.wholeDatabase;
        }

    }

    public static class DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject extends TeaModel {
        @NameInMap("SynchronousObject")
        public java.util.List<DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject> synchronousObject;

        public static DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject build(java.util.Map<String, ?> map) throws Exception {
            DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject self = new DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject();
            return TeaModel.build(map, self);
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject setSynchronousObject(java.util.List<DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject> synchronousObject) {
            this.synchronousObject = synchronousObject;
            return this;
        }
        public java.util.List<DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObjectSynchronousObject> getSynchronousObject() {
            return this.synchronousObject;
        }

    }

    public static class DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck extends TeaModel {
        @NameInMap("Percent")
        public String percent;

        @NameInMap("Status")
        public String status;

        public static DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck build(java.util.Map<String, ?> map) throws Exception {
            DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck self = new DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck();
            return TeaModel.build(map, self);
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("UserName")
        public String userName;

        public static DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint self = new DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("status")
        public String status;

        public static DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization build(java.util.Map<String, ?> map) throws Exception {
            DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization self = new DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization();
            return TeaModel.build(map, self);
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob extends TeaModel {
        @NameInMap("DataInitialization")
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization dataInitialization;

        @NameInMap("DataSynchronization")
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization dataSynchronization;

        @NameInMap("DestinationEndpoint")
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint destinationEndpoint;

        @NameInMap("MigrationJobClass")
        public String migrationJobClass;

        @NameInMap("MigrationJobID")
        public String migrationJobID;

        @NameInMap("MigrationJobName")
        public String migrationJobName;

        @NameInMap("MigrationJobStatus")
        public String migrationJobStatus;

        @NameInMap("MigrationMode")
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode migrationMode;

        @NameInMap("MigrationObject")
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject migrationObject;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Precheck")
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck precheck;

        @NameInMap("SourceEndpoint")
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint sourceEndpoint;

        @NameInMap("StructureInitialization")
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization structureInitialization;

        public static DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob build(java.util.Map<String, ?> map) throws Exception {
            DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob self = new DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob();
            return TeaModel.build(map, self);
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setDataInitialization(DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataInitialization getDataInitialization() {
            return this.dataInitialization;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setDataSynchronization(DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDataSynchronization getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setDestinationEndpoint(DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationJobClass(String migrationJobClass) {
            this.migrationJobClass = migrationJobClass;
            return this;
        }
        public String getMigrationJobClass() {
            return this.migrationJobClass;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationJobID(String migrationJobID) {
            this.migrationJobID = migrationJobID;
            return this;
        }
        public String getMigrationJobID() {
            return this.migrationJobID;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationJobName(String migrationJobName) {
            this.migrationJobName = migrationJobName;
            return this;
        }
        public String getMigrationJobName() {
            return this.migrationJobName;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationJobStatus(String migrationJobStatus) {
            this.migrationJobStatus = migrationJobStatus;
            return this;
        }
        public String getMigrationJobStatus() {
            return this.migrationJobStatus;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationMode(DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setMigrationObject(DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject migrationObject) {
            this.migrationObject = migrationObject;
            return this;
        }
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobMigrationObject getMigrationObject() {
            return this.migrationObject;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setPrecheck(DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck precheck) {
            this.precheck = precheck;
            return this;
        }
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobPrecheck getPrecheck() {
            return this.precheck;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setSourceEndpoint(DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob setStructureInitialization(DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJobStructureInitialization getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescirbeMigrationJobsResponseBodyMigrationJobs extends TeaModel {
        @NameInMap("MigrationJob")
        public java.util.List<DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob> migrationJob;

        public static DescirbeMigrationJobsResponseBodyMigrationJobs build(java.util.Map<String, ?> map) throws Exception {
            DescirbeMigrationJobsResponseBodyMigrationJobs self = new DescirbeMigrationJobsResponseBodyMigrationJobs();
            return TeaModel.build(map, self);
        }

        public DescirbeMigrationJobsResponseBodyMigrationJobs setMigrationJob(java.util.List<DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob> migrationJob) {
            this.migrationJob = migrationJob;
            return this;
        }
        public java.util.List<DescirbeMigrationJobsResponseBodyMigrationJobsMigrationJob> getMigrationJob() {
            return this.migrationJob;
        }

    }

}
