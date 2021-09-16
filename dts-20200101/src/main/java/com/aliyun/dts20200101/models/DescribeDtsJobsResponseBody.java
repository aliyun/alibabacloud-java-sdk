// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobsResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DtsJobList")
    public java.util.List<DescribeDtsJobsResponseBodyDtsJobList> dtsJobList;

    public static DescribeDtsJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobsResponseBody self = new DescribeDtsJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDtsJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDtsJobsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDtsJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDtsJobsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDtsJobsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeDtsJobsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDtsJobsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDtsJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDtsJobsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeDtsJobsResponseBody setDtsJobList(java.util.List<DescribeDtsJobsResponseBodyDtsJobList> dtsJobList) {
        this.dtsJobList = dtsJobList;
        return this;
    }
    public java.util.List<DescribeDtsJobsResponseBodyDtsJobList> getDtsJobList() {
        return this.dtsJobList;
    }

    public static class DescribeDtsJobsResponseBodyDtsJobListTagList extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeDtsJobsResponseBodyDtsJobListTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListTagList self = new DescribeDtsJobsResponseBodyDtsJobListTagList();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeDtsJobsResponseBodyDtsJobListTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Progress")
        public String progress;

        public static DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus self = new DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus self = new DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Progress")
        public String progress;

        public static DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus self = new DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint extends TeaModel {
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Region")
        public String region;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("Port")
        public String port;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("EngineName")
        public String engineName;

        public static DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint self = new DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListMigrationMode extends TeaModel {
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeDtsJobsResponseBodyDtsJobListMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListMigrationMode self = new DescribeDtsJobsResponseBodyDtsJobListMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeDtsJobsResponseBodyDtsJobListMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeDtsJobsResponseBodyDtsJobListMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListPerformance extends TeaModel {
        @NameInMap("Rps")
        public String rps;

        @NameInMap("Flow")
        public String flow;

        public static DescribeDtsJobsResponseBodyDtsJobListPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListPerformance self = new DescribeDtsJobsResponseBodyDtsJobListPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListPerformance setRps(String rps) {
            this.rps = rps;
            return this;
        }
        public String getRps() {
            return this.rps;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPerformance setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckResult")
        public String checkResult;

        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        @NameInMap("CheckItem")
        public String checkItem;

        @NameInMap("RepairMethod")
        public String repairMethod;

        @NameInMap("FailedReason")
        public String failedReason;

        public static DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail self = new DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail> detail;

        public static DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus self = new DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus setDetail(java.util.List<DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Progress")
        public String progress;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint extends TeaModel {
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Region")
        public String region;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("Port")
        public String port;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("EngineName")
        public String engineName;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode extends TeaModel {
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance extends TeaModel {
        @NameInMap("Rps")
        public String rps;

        @NameInMap("Flow")
        public String flow;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance setRps(String rps) {
            this.rps = rps;
            return this;
        }
        public String getRps() {
            return this.rps;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckResult")
        public String checkResult;

        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        @NameInMap("CheckItem")
        public String checkItem;

        @NameInMap("RepairMethod")
        public String repairMethod;

        @NameInMap("FailedReason")
        public String failedReason;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail> detail;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus setDetail(java.util.List<DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint extends TeaModel {
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Region")
        public String region;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("Port")
        public String port;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("EngineName")
        public String engineName;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Progress")
        public String progress;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJob extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DtsJobName")
        public String dtsJobName;

        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Reserved")
        public String reserved;

        @NameInMap("DbObject")
        public String dbObject;

        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint destinationEndpoint;

        @NameInMap("MigrationMode")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode migrationMode;

        @NameInMap("Performance")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance performance;

        @NameInMap("PrecheckStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus precheckStatus;

        @NameInMap("SourceEndpoint")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint sourceEndpoint;

        @NameInMap("StructureInitializationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus structureInitializationStatus;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJob self = new DescribeDtsJobsResponseBodyDtsJobListReverseJob();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }
        public String getDbObject() {
            return this.dbObject;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDataInitializationStatus(DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDataSynchronizationStatus(DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDestinationEndpoint(DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setMigrationMode(DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setPerformance(DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance getPerformance() {
            return this.performance;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setPrecheckStatus(DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setSourceEndpoint(DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setStructureInitializationStatus(DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint extends TeaModel {
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Region")
        public String region;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("Port")
        public String port;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("EngineName")
        public String engineName;

        public static DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint self = new DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Progress")
        public String progress;

        public static DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus self = new DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListRetryState extends TeaModel {
        @NameInMap("RetryCount")
        public Integer retryCount;

        @NameInMap("MaxRetryTime")
        public Integer maxRetryTime;

        @NameInMap("ErrMessage")
        public String errMessage;

        @NameInMap("RetryTarget")
        public String retryTarget;

        @NameInMap("RetryTime")
        public Integer retryTime;

        public static DescribeDtsJobsResponseBodyDtsJobListRetryState build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListRetryState self = new DescribeDtsJobsResponseBodyDtsJobListRetryState();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setRetryTarget(String retryTarget) {
            this.retryTarget = retryTarget;
            return this;
        }
        public String getRetryTarget() {
            return this.retryTarget;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setRetryTime(Integer retryTime) {
            this.retryTime = retryTime;
            return this;
        }
        public Integer getRetryTime() {
            return this.retryTime;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DtsJobName")
        public String dtsJobName;

        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Reserved")
        public String reserved;

        @NameInMap("ConsumptionClient")
        public String consumptionClient;

        @NameInMap("DbObject")
        public String dbObject;

        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        @NameInMap("EndTimestamp")
        public String endTimestamp;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("BeginTimestamp")
        public String beginTimestamp;

        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("TagList")
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListTagList> tagList;

        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DataEtlStatus")
        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus dataEtlStatus;

        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint destinationEndpoint;

        @NameInMap("MigrationMode")
        public DescribeDtsJobsResponseBodyDtsJobListMigrationMode migrationMode;

        @NameInMap("Performance")
        public DescribeDtsJobsResponseBodyDtsJobListPerformance performance;

        @NameInMap("PrecheckStatus")
        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus precheckStatus;

        @NameInMap("ReverseJob")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJob reverseJob;

        @NameInMap("SourceEndpoint")
        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint sourceEndpoint;

        @NameInMap("StructureInitializationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus structureInitializationStatus;

        @NameInMap("RetryState")
        public DescribeDtsJobsResponseBodyDtsJobListRetryState retryState;

        public static DescribeDtsJobsResponseBodyDtsJobList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobList self = new DescribeDtsJobsResponseBodyDtsJobList();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setConsumptionClient(String consumptionClient) {
            this.consumptionClient = consumptionClient;
            return this;
        }
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }
        public String getDbObject() {
            return this.dbObject;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setEndTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setBeginTimestamp(String beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
            return this;
        }
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setTagList(java.util.List<DescribeDtsJobsResponseBodyDtsJobListTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListTagList> getTagList() {
            return this.tagList;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDataInitializationStatus(DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDataSynchronizationStatus(DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDataEtlStatus(DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus dataEtlStatus) {
            this.dataEtlStatus = dataEtlStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDestinationEndpoint(DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMigrationMode(DescribeDtsJobsResponseBodyDtsJobListMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setPerformance(DescribeDtsJobsResponseBodyDtsJobListPerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListPerformance getPerformance() {
            return this.performance;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setPrecheckStatus(DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setReverseJob(DescribeDtsJobsResponseBodyDtsJobListReverseJob reverseJob) {
            this.reverseJob = reverseJob;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJob getReverseJob() {
            return this.reverseJob;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setSourceEndpoint(DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setStructureInitializationStatus(DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setRetryState(DescribeDtsJobsResponseBodyDtsJobListRetryState retryState) {
            this.retryState = retryState;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListRetryState getRetryState() {
            return this.retryState;
        }

    }

}
