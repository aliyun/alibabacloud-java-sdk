// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobsResponseBody extends TeaModel {
    @NameInMap("DtsJobList")
    public java.util.List<DescribeDtsJobsResponseBodyDtsJobList> dtsJobList;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("EtlDemoList")
    public java.util.List<DescribeDtsJobsResponseBodyEtlDemoList> etlDemoList;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDtsJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobsResponseBody self = new DescribeDtsJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobsResponseBody setDtsJobList(java.util.List<DescribeDtsJobsResponseBodyDtsJobList> dtsJobList) {
        this.dtsJobList = dtsJobList;
        return this;
    }
    public java.util.List<DescribeDtsJobsResponseBodyDtsJobList> getDtsJobList() {
        return this.dtsJobList;
    }

    public DescribeDtsJobsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeDtsJobsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDtsJobsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDtsJobsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDtsJobsResponseBody setEtlDemoList(java.util.List<DescribeDtsJobsResponseBodyEtlDemoList> etlDemoList) {
        this.etlDemoList = etlDemoList;
        return this;
    }
    public java.util.List<DescribeDtsJobsResponseBodyEtlDemoList> getEtlDemoList() {
        return this.etlDemoList;
    }

    public DescribeDtsJobsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDtsJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDtsJobsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDtsJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDtsJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDtsJobsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus self = new DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus self = new DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus self = new DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
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

        public DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint self = new DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListErrorDetails extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("HelpUrl")
        public String helpUrl;

        public static DescribeDtsJobsResponseBodyDtsJobListErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListErrorDetails self = new DescribeDtsJobsResponseBodyDtsJobListErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListErrorDetails setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeDtsJobsResponseBodyDtsJobListErrorDetails setHelpUrl(String helpUrl) {
            this.helpUrl = helpUrl;
            return this;
        }
        public String getHelpUrl() {
            return this.helpUrl;
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
        @NameInMap("Flow")
        public String flow;

        @NameInMap("Rps")
        public String rps;

        public static DescribeDtsJobsResponseBodyDtsJobListPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListPerformance self = new DescribeDtsJobsResponseBodyDtsJobListPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListPerformance setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPerformance setRps(String rps) {
            this.rps = rps;
            return this;
        }
        public String getRps() {
            return this.rps;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckItem")
        public String checkItem;

        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        @NameInMap("CheckResult")
        public String checkResult;

        @NameInMap("FailedReason")
        public String failedReason;

        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail self = new DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus self = new DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus setDetail(java.util.List<DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListRetryState extends TeaModel {
        @NameInMap("ErrMessage")
        public String errMessage;

        @NameInMap("MaxRetryTime")
        public Integer maxRetryTime;

        @NameInMap("RetryCount")
        public Integer retryCount;

        @NameInMap("RetryTarget")
        public String retryTarget;

        @NameInMap("RetryTime")
        public Integer retryTime;

        public static DescribeDtsJobsResponseBodyDtsJobListRetryState build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListRetryState self = new DescribeDtsJobsResponseBodyDtsJobListRetryState();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
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

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
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

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobErrorDetails extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("HelpUrl")
        public String helpUrl;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobErrorDetails self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobErrorDetails setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobErrorDetails setHelpUrl(String helpUrl) {
            this.helpUrl = helpUrl;
            return this;
        }
        public String getHelpUrl() {
            return this.helpUrl;
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
        @NameInMap("Flow")
        public String flow;

        @NameInMap("Rps")
        public String rps;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance setRps(String rps) {
            this.rps = rps;
            return this;
        }
        public String getRps() {
            return this.rps;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckItem")
        public String checkItem;

        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        @NameInMap("CheckResult")
        public String checkResult;

        @NameInMap("FailedReason")
        public String failedReason;

        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus setDetail(java.util.List<DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJob extends TeaModel {
        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("CpuUsage")
        public String cpuUsage;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DbObject")
        public String dbObject;

        @NameInMap("DedicatedClusterId")
        public String dedicatedClusterId;

        @NameInMap("Delay")
        public Long delay;

        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("DtsJobName")
        public String dtsJobName;

        @NameInMap("DuUsage")
        public Long duUsage;

        @NameInMap("ErrorDetails")
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListReverseJobErrorDetails> errorDetails;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("MemUsage")
        public String memUsage;

        @NameInMap("MigrationMode")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode migrationMode;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Performance")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance performance;

        @NameInMap("PrecheckStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        public String reserved;

        @NameInMap("SourceEndpoint")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        public String status;

        @NameInMap("StructureInitializationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobStructureInitializationStatus structureInitializationStatus;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJob self = new DescribeDtsJobsResponseBodyDtsJobListReverseJob();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setCpuUsage(String cpuUsage) {
            this.cpuUsage = cpuUsage;
            return this;
        }
        public String getCpuUsage() {
            return this.cpuUsage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }
        public String getDbObject() {
            return this.dbObject;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDedicatedClusterId(String dedicatedClusterId) {
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }
        public String getDedicatedClusterId() {
            return this.dedicatedClusterId;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDestinationEndpoint(DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setDuUsage(Long duUsage) {
            this.duUsage = duUsage;
            return this;
        }
        public Long getDuUsage() {
            return this.duUsage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setErrorDetails(java.util.List<DescribeDtsJobsResponseBodyDtsJobListReverseJobErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListReverseJobErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setMemUsage(String memUsage) {
            this.memUsage = memUsage;
            return this;
        }
        public String getMemUsage() {
            return this.memUsage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setMigrationMode(DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
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

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setSourceEndpoint(DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint self = new DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus self = new DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListTagList extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDtsJobsResponseBodyDtsJobListTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListTagList self = new DescribeDtsJobsResponseBodyDtsJobListTagList();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDtsJobsResponseBodyDtsJobListTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobList extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BeginTimestamp")
        public String beginTimestamp;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        public String consumptionClient;

        @NameInMap("CpuUsage")
        public String cpuUsage;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataEtlStatus")
        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus dataEtlStatus;

        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DbObject")
        public String dbObject;

        @NameInMap("DedicatedClusterId")
        public String dedicatedClusterId;

        @NameInMap("Delay")
        public Long delay;

        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("DtsJobName")
        public String dtsJobName;

        @NameInMap("DuUsage")
        public Long duUsage;

        @NameInMap("EndTimestamp")
        public String endTimestamp;

        @NameInMap("ErrorDetails")
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListErrorDetails> errorDetails;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("MemUsage")
        public String memUsage;

        @NameInMap("MigrationMode")
        public DescribeDtsJobsResponseBodyDtsJobListMigrationMode migrationMode;

        @NameInMap("OriginType")
        public String originType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Performance")
        public DescribeDtsJobsResponseBodyDtsJobListPerformance performance;

        @NameInMap("PrecheckStatus")
        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        public String reserved;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RetryState")
        public DescribeDtsJobsResponseBodyDtsJobListRetryState retryState;

        @NameInMap("ReverseJob")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJob reverseJob;

        @NameInMap("SourceEndpoint")
        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        public String status;

        @NameInMap("StructureInitializationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus structureInitializationStatus;

        @NameInMap("TagList")
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListTagList> tagList;

        public static DescribeDtsJobsResponseBodyDtsJobList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobList self = new DescribeDtsJobsResponseBodyDtsJobList();
            return TeaModel.build(map, self);
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

        public DescribeDtsJobsResponseBodyDtsJobList setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setConsumptionClient(String consumptionClient) {
            this.consumptionClient = consumptionClient;
            return this;
        }
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setCpuUsage(String cpuUsage) {
            this.cpuUsage = cpuUsage;
            return this;
        }
        public String getCpuUsage() {
            return this.cpuUsage;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDataEtlStatus(DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus dataEtlStatus) {
            this.dataEtlStatus = dataEtlStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
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

        public DescribeDtsJobsResponseBodyDtsJobList setDbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }
        public String getDbObject() {
            return this.dbObject;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDedicatedClusterId(String dedicatedClusterId) {
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }
        public String getDedicatedClusterId() {
            return this.dedicatedClusterId;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDestinationEndpoint(DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setDuUsage(Long duUsage) {
            this.duUsage = duUsage;
            return this;
        }
        public Long getDuUsage() {
            return this.duUsage;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setEndTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setErrorDetails(java.util.List<DescribeDtsJobsResponseBodyDtsJobListErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListErrorDetails> getErrorDetails() {
            return this.errorDetails;
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

        public DescribeDtsJobsResponseBodyDtsJobList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMemUsage(String memUsage) {
            this.memUsage = memUsage;
            return this;
        }
        public String getMemUsage() {
            return this.memUsage;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMigrationMode(DescribeDtsJobsResponseBodyDtsJobListMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
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

        public DescribeDtsJobsResponseBodyDtsJobList setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setRetryState(DescribeDtsJobsResponseBodyDtsJobListRetryState retryState) {
            this.retryState = retryState;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListRetryState getRetryState() {
            return this.retryState;
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

        public DescribeDtsJobsResponseBodyDtsJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setStructureInitializationStatus(DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setTagList(java.util.List<DescribeDtsJobsResponseBodyDtsJobListTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListTagList> getTagList() {
            return this.tagList;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListDataEtlStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyEtlDemoListDataEtlStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListDataEtlStatus self = new DescribeDtsJobsResponseBodyEtlDemoListDataEtlStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataEtlStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataEtlStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataEtlStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataEtlStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyEtlDemoListDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListDataInitializationStatus self = new DescribeDtsJobsResponseBodyEtlDemoListDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus self = new DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint self = new DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListMigrationMode extends TeaModel {
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeDtsJobsResponseBodyEtlDemoListMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListMigrationMode self = new DescribeDtsJobsResponseBodyEtlDemoListMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListPerformance extends TeaModel {
        @NameInMap("Flow")
        public String flow;

        @NameInMap("Rps")
        public String rps;

        public static DescribeDtsJobsResponseBodyEtlDemoListPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListPerformance self = new DescribeDtsJobsResponseBodyEtlDemoListPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListPerformance setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListPerformance setRps(String rps) {
            this.rps = rps;
            return this;
        }
        public String getRps() {
            return this.rps;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckItem")
        public String checkItem;

        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        @NameInMap("CheckResult")
        public String checkResult;

        @NameInMap("FailedReason")
        public String failedReason;

        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail self = new DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatus self = new DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatus setDetail(java.util.List<DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListRetryState extends TeaModel {
        @NameInMap("ErrMessage")
        public String errMessage;

        @NameInMap("MaxRetryTime")
        public Integer maxRetryTime;

        @NameInMap("RetryCount")
        public Integer retryCount;

        @NameInMap("RetryTarget")
        public String retryTarget;

        @NameInMap("RetryTime")
        public Integer retryTime;

        public static DescribeDtsJobsResponseBodyEtlDemoListRetryState build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListRetryState self = new DescribeDtsJobsResponseBodyEtlDemoListRetryState();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListRetryState setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListRetryState setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListRetryState setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListRetryState setRetryTarget(String retryTarget) {
            this.retryTarget = retryTarget;
            return this;
        }
        public String getRetryTarget() {
            return this.retryTarget;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListRetryState setRetryTime(Integer retryTime) {
            this.retryTime = retryTime;
            return this;
        }
        public Integer getRetryTime() {
            return this.retryTime;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus self = new DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus self = new DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint self = new DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListReverseJobMigrationMode extends TeaModel {
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeDtsJobsResponseBodyEtlDemoListReverseJobMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListReverseJobMigrationMode self = new DescribeDtsJobsResponseBodyEtlDemoListReverseJobMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListReverseJobPerformance extends TeaModel {
        @NameInMap("Flow")
        public String flow;

        @NameInMap("Rps")
        public String rps;

        public static DescribeDtsJobsResponseBodyEtlDemoListReverseJobPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListReverseJobPerformance self = new DescribeDtsJobsResponseBodyEtlDemoListReverseJobPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPerformance setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPerformance setRps(String rps) {
            this.rps = rps;
            return this;
        }
        public String getRps() {
            return this.rps;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckItem")
        public String checkItem;

        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        @NameInMap("CheckResult")
        public String checkResult;

        @NameInMap("FailedReason")
        public String failedReason;

        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail self = new DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatus self = new DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatus setDetail(java.util.List<DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint self = new DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListReverseJobStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyEtlDemoListReverseJobStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListReverseJobStructureInitializationStatus self = new DescribeDtsJobsResponseBodyEtlDemoListReverseJobStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListReverseJob extends TeaModel {
        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DbObject")
        public String dbObject;

        @NameInMap("Delay")
        public Long delay;

        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("DtsJobName")
        public String dtsJobName;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("MigrationMode")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobMigrationMode migrationMode;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Performance")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPerformance performance;

        @NameInMap("PrecheckStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        public String reserved;

        @NameInMap("SourceEndpoint")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        public String status;

        @NameInMap("StructureInitializationStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobStructureInitializationStatus structureInitializationStatus;

        public static DescribeDtsJobsResponseBodyEtlDemoListReverseJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListReverseJob self = new DescribeDtsJobsResponseBodyEtlDemoListReverseJob();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setDataInitializationStatus(DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setDataSynchronizationStatus(DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setDbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }
        public String getDbObject() {
            return this.dbObject;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setDestinationEndpoint(DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setDtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setMigrationMode(DescribeDtsJobsResponseBodyEtlDemoListReverseJobMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setPerformance(DescribeDtsJobsResponseBodyEtlDemoListReverseJobPerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPerformance getPerformance() {
            return this.performance;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setPrecheckStatus(DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setSourceEndpoint(DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setStructureInitializationStatus(DescribeDtsJobsResponseBodyEtlDemoListReverseJobStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("Port")
        public String port;

        @NameInMap("Region")
        public String region;

        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint self = new DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyEtlDemoListStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListStructureInitializationStatus self = new DescribeDtsJobsResponseBodyEtlDemoListStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListTagList extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDtsJobsResponseBodyEtlDemoListTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoListTagList self = new DescribeDtsJobsResponseBodyEtlDemoListTagList();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoListTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoList extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BeginTimestamp")
        public String beginTimestamp;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        public String consumptionClient;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataEtlStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListDataEtlStatus dataEtlStatus;

        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DbObject")
        public String dbObject;

        @NameInMap("Delay")
        public Long delay;

        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("DtsJobName")
        public String dtsJobName;

        @NameInMap("EndTimestamp")
        public String endTimestamp;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("MigrationMode")
        public DescribeDtsJobsResponseBodyEtlDemoListMigrationMode migrationMode;

        @NameInMap("OriginType")
        public String originType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Performance")
        public DescribeDtsJobsResponseBodyEtlDemoListPerformance performance;

        @NameInMap("PrecheckStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        public String reserved;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RetryState")
        public DescribeDtsJobsResponseBodyEtlDemoListRetryState retryState;

        @NameInMap("ReverseJob")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob reverseJob;

        @NameInMap("SourceEndpoint")
        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        public String status;

        @NameInMap("StructureInitializationStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListStructureInitializationStatus structureInitializationStatus;

        @NameInMap("TagList")
        public java.util.List<DescribeDtsJobsResponseBodyEtlDemoListTagList> tagList;

        public static DescribeDtsJobsResponseBodyEtlDemoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyEtlDemoList self = new DescribeDtsJobsResponseBodyEtlDemoList();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setBeginTimestamp(String beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
            return this;
        }
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setConsumptionClient(String consumptionClient) {
            this.consumptionClient = consumptionClient;
            return this;
        }
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setDataEtlStatus(DescribeDtsJobsResponseBodyEtlDemoListDataEtlStatus dataEtlStatus) {
            this.dataEtlStatus = dataEtlStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setDataInitializationStatus(DescribeDtsJobsResponseBodyEtlDemoListDataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setDataSynchronizationStatus(DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setDbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }
        public String getDbObject() {
            return this.dbObject;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setDestinationEndpoint(DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setDtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setEndTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setMigrationMode(DescribeDtsJobsResponseBodyEtlDemoListMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setPerformance(DescribeDtsJobsResponseBodyEtlDemoListPerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListPerformance getPerformance() {
            return this.performance;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setPrecheckStatus(DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setRetryState(DescribeDtsJobsResponseBodyEtlDemoListRetryState retryState) {
            this.retryState = retryState;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListRetryState getRetryState() {
            return this.retryState;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setReverseJob(DescribeDtsJobsResponseBodyEtlDemoListReverseJob reverseJob) {
            this.reverseJob = reverseJob;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob getReverseJob() {
            return this.reverseJob;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setSourceEndpoint(DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setStructureInitializationStatus(DescribeDtsJobsResponseBodyEtlDemoListStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyEtlDemoListStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public DescribeDtsJobsResponseBodyEtlDemoList setTagList(java.util.List<DescribeDtsJobsResponseBodyEtlDemoListTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeDtsJobsResponseBodyEtlDemoListTagList> getTagList() {
            return this.tagList;
        }

    }

}
