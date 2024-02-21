// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobsResponseBody extends TeaModel {
    /**
     * <p>The list of DTS tasks and the details of each task.</p>
     */
    @NameInMap("DtsJobList")
    public java.util.List<DescribeDtsJobsResponseBodyDtsJobList> dtsJobList;

    /**
     * <p>The dynamic error code. This parameter will be removed in the future.</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic part in the error message. The value of this parameter is used to replace the **%s** variable in the value of the **ErrMessage** parameter.</p>
     * <br>
     * <p>>  For example, if the value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the value of the **DynamicMessage** parameter is **Type**, the specified **Type** parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

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
     * <p>The DTS tasks and the details of each task.</p>
     */
    @NameInMap("EtlDemoList")
    public java.util.List<DescribeDtsJobsResponseBodyEtlDemoList> etlDemoList;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of DTS tasks that meet the query condition.</p>
     */
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

    public static class DescribeDtsJobsResponseBodyDtsJobListDataCloudStatus extends TeaModel {
        /**
         * <p>The error message returned if the task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether the instance needs to be upgraded. Valid values:</p>
         * <br>
         * <p>- **true** </p>
         * <p>- **false**</p>
         */
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        /**
         * <p>The progress of the task. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of tables that have been migrated.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of the task. For more information about the valid values, see the description of the request parameter **Status**.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListDataCloudStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListDataCloudStatus self = new DescribeDtsJobsResponseBodyDtsJobListDataCloudStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataCloudStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataCloudStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataCloudStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataCloudStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyDtsJobListDataCloudStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus extends TeaModel {
        /**
         * <p>The error message returned if the task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the ETL task.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of records that have been processed by the ETL task.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of the ETL task. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**: The task is not started.</p>
         * <p>*   **Migrating**: The task is in progress.</p>
         * <p>*   **Failed**: The task failed.</p>
         * <p>*   **Finished**: The task is complete.</p>
         * <p>*   **Catched**: The task is not delayed.</p>
         */
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
        /**
         * <p>The error message returned if full data synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of full data synchronization. This is expressed as a percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of records that have been synchronized during full data synchronization.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of full data synchronization. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**: The task is not started.</p>
         * <p>*   **Migrating**: The task is in progress.</p>
         * <p>*   **Failed**: The task failed.</p>
         * <p>*   **Finished**: The task is complete.</p>
         */
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
        /**
         * <p>The error message returned if incremental data migration or synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether the instance needs to be upgraded. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         * <br>
         * <p>>  To upgrade a DTS instance, call the [TransferInstanceClass](~~281093~~) operation.</p>
         */
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        /**
         * <p>The progress of incremental data migration or synchronization.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of records that have been migrated or synchronized during incremental data migration or synchronization.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of incremental data migration or synchronization. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**: The task is not started.</p>
         * <p>*   **Migrating**: The task is in progress.</p>
         * <p>*   **Failed**: The task failed.</p>
         * <p>*   **Finished**: The task is complete.</p>
         * <p>*   **Catched**: The task is not delayed.</p>
         */
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
         * <p>The ID of the destination instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the destination instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The endpoint of the destination instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The SID of the Oracle database.</p>
         * <br>
         * <p>>  This parameter is returned only if the **EngineName** parameter of the destination instance is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The database service port of the destination instance.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the region in which the destination instance resides. For more information, see [List of supported regions](~~141033~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <br>
         * <p>*   **DISABLE**: SSL encryption is disabled.</p>
         * <p>*   **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled, and the CA certificate is uploaded.</p>
         * <p>*   **ENABLE_ONLY\_4\_MONGODB_ALTAS**: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.</p>
         * <p>*   **ENABLE_ONLY\_4\_KAFKA_SCRAM_SHA\_256**: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.</p>
         */
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        /**
         * <p>The database account of the destination instance.</p>
         */
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
        /**
         * <p>The error code returned.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The URL of the documentation.</p>
         */
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

    public static class DescribeDtsJobsResponseBodyDtsJobListFullDataCheckStatus extends TeaModel {
        /**
         * <p>The error message returned if the task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the full data verification task. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The progress of the full data verification task.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of the full data verification task. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The verification is not started. </p>
         * <p>- **Checking**: The verification is in progress. </p>
         * <p>- **Failed**: The verification failed. </p>
         * <p>- **Finished**: The verification is complete.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListFullDataCheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListFullDataCheckStatus self = new DescribeDtsJobsResponseBodyDtsJobListFullDataCheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListFullDataCheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListFullDataCheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListFullDataCheckStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyDtsJobListFullDataCheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListIncDataCheckStatus extends TeaModel {
        /**
         * <p>The error message returned if the task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the incremental data verification task. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The progress of the incremental data verification task.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of the incremental data verification task. Valid values:</p>
         * <br>
         * <p>- **Catched**: The verification is delayed. </p>
         * <p>- **NotStarted**: The verification is not started. </p>
         * <p>- **Checking**: The verification is in progress. </p>
         * <p>- **Failed**: The verification failed.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListIncDataCheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListIncDataCheckStatus self = new DescribeDtsJobsResponseBodyDtsJobListIncDataCheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListIncDataCheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListIncDataCheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListIncDataCheckStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyDtsJobListIncDataCheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListMigrationMode extends TeaModel {
        /**
         * <p>Indicates whether full data migration or synchronization is performed. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        /**
         * <p>Indicates whether incremental data migration or synchronization is performed. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>Indicates whether full data verification is performed. Valid values:</p>
         * <p>-  **true**: yes</p>
         * <p>-  **false**: no</p>
         */
        @NameInMap("FullDataCheck")
        public Boolean fullDataCheck;

        /**
         * <p>Indicates whether incremental data verification is performed. Valid values:</p>
         * <p>-  **true**: yes</p>
         * <p>-  **false**: no</p>
         */
        @NameInMap("IncDataCheck")
        public Boolean incDataCheck;

        /**
         * <p>Indicates whether schema migration or schema synchronization is performed. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
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

        public DescribeDtsJobsResponseBodyDtsJobListMigrationMode setFullDataCheck(Boolean fullDataCheck) {
            this.fullDataCheck = fullDataCheck;
            return this;
        }
        public Boolean getFullDataCheck() {
            return this.fullDataCheck;
        }

        public DescribeDtsJobsResponseBodyDtsJobListMigrationMode setIncDataCheck(Boolean incDataCheck) {
            this.incDataCheck = incDataCheck;
            return this;
        }
        public Boolean getIncDataCheck() {
            return this.incDataCheck;
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
        /**
         * <p>The size of data that is migrated or synchronized per second. Unit: MB/s.</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
         */
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
        /**
         * <p>The name of the precheck item.</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>The description of the precheck item.</p>
         */
        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        /**
         * <p>The precheck result. Valid values:</p>
         * <br>
         * <p>*   **Success**</p>
         * <p>*   **Failed**</p>
         */
        @NameInMap("CheckResult")
        public String checkResult;

        /**
         * <p>The error message returned if the task failed to pass the precheck.</p>
         * <br>
         * <p>>  This parameter is returned only if the value of the **CheckResult** parameter is **Failed**.</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The method to fix the precheck failure.</p>
         * <br>
         * <p>>  This parameter is returned only if the value of the **CheckResult** parameter is **Failed**.</p>
         */
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
        /**
         * <p>The result of each precheck item.</p>
         */
        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListPrecheckStatusDetail> detail;

        /**
         * <p>The cause of the precheck failure.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The precheck progress. This is expressed as a percentage.</p>
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
        /**
         * <p>The error message returned if these retries failed.</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The maximum duration of a retry. Unit: seconds.</p>
         */
        @NameInMap("MaxRetryTime")
        public Integer maxRetryTime;

        /**
         * <p>The error code.</p>
         */
        @NameInMap("MigrationErrCode")
        public String migrationErrCode;

        /**
         * <p>The ID of the error code-related documentation.</p>
         */
        @NameInMap("MigrationErrHelpDocId")
        public String migrationErrHelpDocId;

        /**
         * <p>The key of the error code-related documentation.</p>
         */
        @NameInMap("MigrationErrHelpDocKey")
        public String migrationErrHelpDocKey;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("MigrationErrMsg")
        public String migrationErrMsg;

        /**
         * <p>The type of the error code.</p>
         */
        @NameInMap("MigrationErrType")
        public String migrationErrType;

        /**
         * <p>The solution to the error.</p>
         */
        @NameInMap("MigrationErrWorkaround")
        public String migrationErrWorkaround;

        /**
         * <p>The progress of the instance when DTS retries.</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The number of retries that have been performed.</p>
         */
        @NameInMap("RetryCount")
        public Integer retryCount;

        /**
         * <p>The object on which these retries are performed. Valid values:</p>
         * <br>
         * <p>- **srcDB**: the source database </p>
         * <p>- **destDB**: the destination database </p>
         * <p>- **inner_module**: an internal module of DTS</p>
         */
        @NameInMap("RetryTarget")
        public String retryTarget;

        /**
         * <p>The time that has elapsed from the time when the first retry starts. Unit: seconds.</p>
         */
        @NameInMap("RetryTime")
        public Integer retryTime;

        /**
         * <p>Indicates whether the task is being retried. Valid values:</p>
         * <br>
         * <p>- **true**</p>
         * <p>- **false**</p>
         */
        @NameInMap("Retrying")
        public Boolean retrying;

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

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setMigrationErrCode(String migrationErrCode) {
            this.migrationErrCode = migrationErrCode;
            return this;
        }
        public String getMigrationErrCode() {
            return this.migrationErrCode;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setMigrationErrHelpDocId(String migrationErrHelpDocId) {
            this.migrationErrHelpDocId = migrationErrHelpDocId;
            return this;
        }
        public String getMigrationErrHelpDocId() {
            return this.migrationErrHelpDocId;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setMigrationErrHelpDocKey(String migrationErrHelpDocKey) {
            this.migrationErrHelpDocKey = migrationErrHelpDocKey;
            return this;
        }
        public String getMigrationErrHelpDocKey() {
            return this.migrationErrHelpDocKey;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setMigrationErrMsg(String migrationErrMsg) {
            this.migrationErrMsg = migrationErrMsg;
            return this;
        }
        public String getMigrationErrMsg() {
            return this.migrationErrMsg;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setMigrationErrType(String migrationErrType) {
            this.migrationErrType = migrationErrType;
            return this;
        }
        public String getMigrationErrType() {
            return this.migrationErrType;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setMigrationErrWorkaround(String migrationErrWorkaround) {
            this.migrationErrWorkaround = migrationErrWorkaround;
            return this;
        }
        public String getMigrationErrWorkaround() {
            return this.migrationErrWorkaround;
        }

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
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

        public DescribeDtsJobsResponseBodyDtsJobListRetryState setRetrying(Boolean retrying) {
            this.retrying = retrying;
            return this;
        }
        public Boolean getRetrying() {
            return this.retrying;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus extends TeaModel {
        /**
         * <p>The error message returned if initial full data synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of initial full data synchronization. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of entries that have been synchronized during initial full data synchronization.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of initial full data synchronization. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The task is not started. </p>
         * <p>- **Migrating**: The task is in progress. </p>
         * <p>- **Failed**: The task failed. </p>
         * <p>- **Finished**: The task is complete.</p>
         */
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
        /**
         * <p>The error message returned if incremental data synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether the instance needs to be upgraded. Valid values:</p>
         * <br>
         * <p>- **true**</p>
         * <p>- **false**</p>
         * <br>
         * <p>> To upgrade a DTS instance, call the [TransferInstanceClass](~~281093~~) operation.</p>
         */
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        /**
         * <p>The progress of incremental data synchronization. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of entries that have been migrated or synchronized during incremental data migration or synchronization.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of incremental data synchronization.</p>
         */
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
        /**
         * <p>The name of the database that contains the synchronized objects in the destination instance.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database engine of the destination instance.</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The ID of the destination instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the destination instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The endpoint of the destination instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The SID of the Oracle database. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **EngineName** of the destination instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The port number of the destination instance.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the region in which the destination instance resides. For more information, see [List of supported regions](~~141033~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <br>
         * <p>- **DISABLE**: SSL encryption is disabled. </p>
         * <p>- **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled and the CA certificate is uploaded. </p>
         * <p>- **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </p>
         * <p>- **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</p>
         */
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        /**
         * <p>The database account of the destination instance.</p>
         */
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
        /**
         * <p>The error code returned.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The URL of the documentation.</p>
         */
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

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobFullDataCheckStatus extends TeaModel {
        /**
         * <p>The error message returned if the task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the full data verification task. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The progress of the full data verification task.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of the full data verification task. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The verification is not started. </p>
         * <p>- **Checking**: The verification is in progress. </p>
         * <p>- **Failed**: The verification failed. </p>
         * <p>- **Finished**: The verification is complete.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobFullDataCheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobFullDataCheckStatus self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobFullDataCheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobFullDataCheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobFullDataCheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobFullDataCheckStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobFullDataCheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobIncDataCheckStatus extends TeaModel {
        /**
         * <p>The error message returned if the task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the incremental data verification task. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The progress of the incremental data verification task.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of the incremental data verification task. Valid values:</p>
         * <br>
         * <p>- **Catched**: The verification is delayed. </p>
         * <p>- **NotStarted**: The verification is not started. </p>
         * <p>- **Checking**: The verification is in progress. </p>
         * <p>- **Failed**: The verification failed.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDtsJobsResponseBodyDtsJobListReverseJobIncDataCheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsJobsResponseBodyDtsJobListReverseJobIncDataCheckStatus self = new DescribeDtsJobsResponseBodyDtsJobListReverseJobIncDataCheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobIncDataCheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobIncDataCheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobIncDataCheckStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobIncDataCheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode extends TeaModel {
        /**
         * <p>Indicates whether initial full data synchronization is performed. Valid values:</p>
         * <br>
         * <p>-  **true**</p>
         * <p>-  **false**</p>
         */
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        /**
         * <p>Indicates whether incremental data synchronization is performed. Valid values:</p>
         * <p>-  **true**</p>
         * <p>-  **false**</p>
         */
        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>Indicates whether full data verification is performed. Valid values:</p>
         * <p>-  **true**: yes</p>
         * <p>-  **false**: no</p>
         */
        @NameInMap("FullDataCheck")
        public Boolean fullDataCheck;

        /**
         * <p>Indicates whether incremental data verification is performed. Valid values:</p>
         * <p>-  **true**: yes</p>
         * <p>-  **false**: no</p>
         */
        @NameInMap("IncDataCheck")
        public Boolean incDataCheck;

        /**
         * <p>Indicates whether initial schema synchronization is performed. Valid values:</p>
         * <p>-  **true**</p>
         * <p>-  **false**</p>
         */
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

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode setFullDataCheck(Boolean fullDataCheck) {
            this.fullDataCheck = fullDataCheck;
            return this;
        }
        public Boolean getFullDataCheck() {
            return this.fullDataCheck;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode setIncDataCheck(Boolean incDataCheck) {
            this.incDataCheck = incDataCheck;
            return this;
        }
        public Boolean getIncDataCheck() {
            return this.incDataCheck;
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
        /**
         * <p>The size of data that is synchronized per second. Unit: MB/s.</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The number of times that SQL statements are synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
         */
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
        /**
         * <p>The name of the precheck item.</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>The description of the precheck item.</p>
         */
        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        /**
         * <p>The precheck result. Valid values:</p>
         * <br>
         * <p>- **Success**</p>
         * <p>- **Failed**</p>
         */
        @NameInMap("CheckResult")
        public String checkResult;

        /**
         * <p>The error message returned if the task failed to pass the precheck.</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The method to fix a precheck failure.</p>
         */
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
        /**
         * <p>The result of each precheck item.</p>
         */
        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatusDetail> detail;

        /**
         * <p>The error message returned if the precheck failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The precheck progress. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The precheck state. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The precheck is not started. </p>
         * <p>- **Suspending**: The precheck is paused. </p>
         * <p>- **Checking**: The precheck is in progress. </p>
         * <p>- **Failed**: The precheck failed. </p>
         * <p>- **Finished**: The precheck is complete.</p>
         */
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
        /**
         * <p>The name of the database that contains the objects to be migrated from the source instance.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database engine of the source instance.</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The ID of the source instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the source instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The endpoint of the source instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The SID of the Oracle database. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **EngineName** of the source instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The port number of the source instance.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the region in which the source instance resides. For more information, see [Supported regions](~~141033~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <br>
         * <p>- **DISABLE**: SSL encryption is disabled. </p>
         * <p>- **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled and the CA certificate is uploaded. </p>
         * <p>- **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </p>
         * <p>- **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</p>
         */
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        /**
         * <p>The database account of the source instance.</p>
         */
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
        /**
         * <p>The error message returned if initial schema synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of initial schema synchronization. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of tables that have been synchronized during initial schema synchronization.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of initial schema synchronization. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The task is not started. </p>
         * <p>- **Migrating**: The task is in progress. </p>
         * <p>- **Failed**: The task failed. </p>
         * <p>- **Finished**: The task is complete.</p>
         */
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
        /**
         * <p>The start offset of incremental data synchronization. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The CPU utilization of the instance. Unit: percentage.</p>
         */
        @NameInMap("CpuUsage")
        public String cpuUsage;

        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The state of initial full data synchronization.</p>
         */
        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataInitializationStatus dataInitializationStatus;

        /**
         * <p>The state of incremental data synchronization.</p>
         */
        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        /**
         * <p>The schema of the objects that you want to synchronize. The value is a JSON string and can contain regular expressions. For more information, see Objects of DTS tasks.</p>
         */
        @NameInMap("DbObject")
        public String dbObject;

        /**
         * <p>The ID of the DTS dedicated cluster on which a DTS task runs.</p>
         */
        @NameInMap("DedicatedClusterId")
        public String dedicatedClusterId;

        /**
         * <p>The latency of incremental data synchronization. Unit: seconds.</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <p>The connection settings of the destination instance.</p>
         */
        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobDestinationEndpoint destinationEndpoint;

        /**
         * <p>The ID of the data synchronization instance.</p>
         */
        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        /**
         * <p>The instance class. </p>
         * <br>
         * <p>> For more information about the test performance of each instance class, see [Specifications of data synchronization instances](~~26605~~).</p>
         */
        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        /**
         * <p>The synchronization direction. **Reverse** is returned.</p>
         */
        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        /**
         * <p>The ID of the synchronization task.</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The name of the data synchronization task.</p>
         */
        @NameInMap("DtsJobName")
        public String dtsJobName;

        /**
         * <p>The number of DUs that have been used.</p>
         */
        @NameInMap("DuUsage")
        public Long duUsage;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("ErrorDetails")
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListReverseJobErrorDetails> errorDetails;

        /**
         * <p>The error message returned if the task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The checkpoint of the ETL task.</p>
         */
        @NameInMap("EtlSafeCheckpoint")
        public String etlSafeCheckpoint;

        /**
         * <p>The time when the instance expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **PayType** is **PrePaid**.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The state information about the full data verification task.</p>
         */
        @NameInMap("FullDataCheckStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobFullDataCheckStatus fullDataCheckStatus;

        /**
         * <p>The state information about the incremental data verification task.</p>
         */
        @NameInMap("IncDataCheckStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobIncDataCheckStatus incDataCheckStatus;

        @NameInMap("MaxDu")
        public Double maxDu;

        /**
         * <p>The memory that has been used. Unit: MB.</p>
         */
        @NameInMap("MemUsage")
        public String memUsage;

        /**
         * <p>The initial synchronization types.</p>
         */
        @NameInMap("MigrationMode")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobMigrationMode migrationMode;

        @NameInMap("MinDu")
        public Double minDu;

        /**
         * <p>The billing method of the DTS instance. Valid values:</p>
         * <br>
         * <p>- **PrePaid**: subscription</p>
         * <p>- **PostPaid**: pay-as-you-go</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The performance of the data synchronization instance.</p>
         */
        @NameInMap("Performance")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPerformance performance;

        /**
         * <p>The precheck state.</p>
         */
        @NameInMap("PrecheckStatus")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobPrecheckStatus precheckStatus;

        /**
         * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).</p>
         */
        @NameInMap("Reserved")
        public String reserved;

        /**
         * <p>The connection settings of the source instance.</p>
         */
        @NameInMap("SourceEndpoint")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobSourceEndpoint sourceEndpoint;

        /**
         * <p>The state of the DTS instance. For more information about the valid values, see the description of the request parameter **Status**.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The state of initial schema synchronization.</p>
         */
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

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setEtlSafeCheckpoint(String etlSafeCheckpoint) {
            this.etlSafeCheckpoint = etlSafeCheckpoint;
            return this;
        }
        public String getEtlSafeCheckpoint() {
            return this.etlSafeCheckpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setFullDataCheckStatus(DescribeDtsJobsResponseBodyDtsJobListReverseJobFullDataCheckStatus fullDataCheckStatus) {
            this.fullDataCheckStatus = fullDataCheckStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobFullDataCheckStatus getFullDataCheckStatus() {
            return this.fullDataCheckStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setIncDataCheckStatus(DescribeDtsJobsResponseBodyDtsJobListReverseJobIncDataCheckStatus incDataCheckStatus) {
            this.incDataCheckStatus = incDataCheckStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListReverseJobIncDataCheckStatus getIncDataCheckStatus() {
            return this.incDataCheckStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setMaxDu(Double maxDu) {
            this.maxDu = maxDu;
            return this;
        }
        public Double getMaxDu() {
            return this.maxDu;
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

        public DescribeDtsJobsResponseBodyDtsJobListReverseJob setMinDu(Double minDu) {
            this.minDu = minDu;
            return this;
        }
        public Double getMinDu() {
            return this.minDu;
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
        /**
         * <p>The name of the database that contains the objects to be migrated from the source instance.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database engine of the source instance.</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The ID of the source instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the source instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The endpoint of the source instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The SID of the Oracle database. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **EngineName** of the source instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The port number of the source instance.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the region in which the source instance resides. For more information, see [Supported regions](~~141033~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <br>
         * <p>- **DISABLE**: SSL encryption is disabled. </p>
         * <p>- **ENABLE_WITH_CERTIFICAT**E: SSL encryption is enabled and the CA certificate is uploaded. </p>
         * <p>- **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </p>
         * <p>- **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</p>
         */
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        /**
         * <p>The database account of the source instance.</p>
         */
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
        /**
         * <p>The error message returned if schema migration or initial schema synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of schema migration or initial schema synchronization. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of tables that have been migrated or synchronized during schema migration or initial schema synchronization.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of schema migration or initial schema synchronization. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The task is not started. </p>
         * <p>- **Migrating**: The task is in progress. </p>
         * <p>- **Failed**: The task failed. </p>
         * <p>- **Finished**: The task is complete.</p>
         */
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
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         */
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
        /**
         * <p>Indicates whether the **new** change tracking feature is used.</p>
         * <br>
         * <p>>  This parameter is returned only for change tracking instances of the new version.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The start of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("BeginTimestamp")
        public String beginTimestamp;

        /**
         * <p>The start offset of incremental data synchronization. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        /**
         * <p>The downstream client information, in the following format: \<IP address of the downstream client>:\<Random ID generated by DTS>.</p>
         */
        @NameInMap("ConsumptionClient")
        public String consumptionClient;

        /**
         * <p>The CPU utilization of the instance. Unit: percentage.</p>
         */
        @NameInMap("CpuUsage")
        public String cpuUsage;

        /**
         * <p>The point in time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The state of the physical gateway-based migration task.</p>
         */
        @NameInMap("DataCloudStatus")
        public DescribeDtsJobsResponseBodyDtsJobListDataCloudStatus dataCloudStatus;

        /**
         * <p>The state of the extract, transform, and load (ETL) task. Valid values:</p>
         * <br>
         * <p>>  This parameter collection is returned only if an ETL task is configured.</p>
         */
        @NameInMap("DataEtlStatus")
        public DescribeDtsJobsResponseBodyDtsJobListDataEtlStatus dataEtlStatus;

        /**
         * <p>The state of full data synchronization.</p>
         */
        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListDataInitializationStatus dataInitializationStatus;

        /**
         * <p>The state of incremental data migration or synchronization.</p>
         */
        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListDataSynchronizationStatus dataSynchronizationStatus;

        /**
         * <p>The objects that you want to synchronize. The value is a JSON string and can contain regular expressions. For more information, see "Objects of DTS tasks".</p>
         */
        @NameInMap("DbObject")
        public String dbObject;

        /**
         * <p>The ID of the DTS dedicated cluster on which a DTS task runs.</p>
         */
        @NameInMap("DedicatedClusterId")
        public String dedicatedClusterId;

        /**
         * <p>The latency of incremental data synchronization. Unit: seconds.</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <p>The connection settings of the destination instance.</p>
         */
        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobsResponseBodyDtsJobListDestinationEndpoint destinationEndpoint;

        /**
         * <p>The environment tag of the DTS instance. Valid values:</p>
         * <br>
         * <p>- **normal**</p>
         * <p>- **online**</p>
         */
        @NameInMap("DtsBisLabel")
        public String dtsBisLabel;

        /**
         * <p>The ID of the data synchronization instance.</p>
         */
        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        /**
         * <p>The instance class.</p>
         * <br>
         * <p>>  For more information about the test performance of each instance class, see [Specifications of data synchronization instances](~~26605~~).</p>
         */
        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        /**
         * <p>The synchronization direction. The value is **Reverse**.</p>
         */
        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        /**
         * <p>The ID of the data synchronization task.</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The name of the data synchronization task.</p>
         */
        @NameInMap("DtsJobName")
        public String dtsJobName;

        /**
         * <p>The number of DUs that have been used.</p>
         */
        @NameInMap("DuUsage")
        public Long duUsage;

        /**
         * <p>The end of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("EndTimestamp")
        public String endTimestamp;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("ErrorDetails")
        public java.util.List<DescribeDtsJobsResponseBodyDtsJobListErrorDetails> errorDetails;

        /**
         * <p>The error message returned if the task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The checkpoint of the ETL task.</p>
         */
        @NameInMap("EtlSafeCheckpoint")
        public String etlSafeCheckpoint;

        /**
         * <p>The point in time when the instance expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         * <br>
         * <p>>  This parameter is returned only if the value of the **PayType** parameter is **PrePaid**.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The state information about the full data verification task.</p>
         */
        @NameInMap("FullDataCheckStatus")
        public DescribeDtsJobsResponseBodyDtsJobListFullDataCheckStatus fullDataCheckStatus;

        /**
         * <p>The state information about the incremental data verification task.</p>
         */
        @NameInMap("IncDataCheckStatus")
        public DescribeDtsJobsResponseBodyDtsJobListIncDataCheckStatus incDataCheckStatus;

        /**
         * <p>The type of the DTS task. Valid values:</p>
         * <br>
         * <p>- **MIGRATION**: data migration task </p>
         * <p>- **SYNC**: data synchronization task </p>
         * <p>- **SUBSCRIBE**: change tracking task</p>
         */
        @NameInMap("JobType")
        public String jobType;

        @NameInMap("MaxDu")
        public Double maxDu;

        /**
         * <p>The memory that has been used. Unit: MB.</p>
         */
        @NameInMap("MemUsage")
        public String memUsage;

        /**
         * <p>The error code.</p>
         */
        @NameInMap("MigrationErrCode")
        public String migrationErrCode;

        /**
         * <p>The ID of the error code-related documentation.</p>
         */
        @NameInMap("MigrationErrHelpDocId")
        public String migrationErrHelpDocId;

        /**
         * <p>The key of the error code-related documentation.</p>
         */
        @NameInMap("MigrationErrHelpDocKey")
        public String migrationErrHelpDocKey;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("MigrationErrMsg")
        public String migrationErrMsg;

        /**
         * <p>The type of the error code.</p>
         */
        @NameInMap("MigrationErrType")
        public String migrationErrType;

        /**
         * <p>The solution to the error.</p>
         */
        @NameInMap("MigrationErrWorkaround")
        public String migrationErrWorkaround;

        /**
         * <p>The migration or synchronization modes.</p>
         */
        @NameInMap("MigrationMode")
        public DescribeDtsJobsResponseBodyDtsJobListMigrationMode migrationMode;

        @NameInMap("MinDu")
        public Double minDu;

        /**
         * <p>The source of the task. Valid values:</p>
         * <br>
         * <p>*   **PTS**</p>
         * <p>*   **DMS**</p>
         * <p>*   **DTS**</p>
         */
        @NameInMap("OriginType")
        public String originType;

        /**
         * <p>The billing method of the DTS instance. Valid values:</p>
         * <br>
         * <p>*   **PrePaid**: subscription</p>
         * <p>*   **PostPaid**: pay-as-you-go</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The performance of the data migration or synchronization instance.</p>
         */
        @NameInMap("Performance")
        public DescribeDtsJobsResponseBodyDtsJobListPerformance performance;

        /**
         * <p>The precheck state.</p>
         */
        @NameInMap("PrecheckStatus")
        public DescribeDtsJobsResponseBodyDtsJobListPrecheckStatus precheckStatus;

        /**
         * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).</p>
         */
        @NameInMap("Reserved")
        public String reserved;

        /**
         * <p>The name of the resource group.</p>
         */
        @NameInMap("ResourceGroupDisplayName")
        public String resourceGroupDisplayName;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The information about the retries performed by DTS due to an exception.</p>
         */
        @NameInMap("RetryState")
        public DescribeDtsJobsResponseBodyDtsJobListRetryState retryState;

        /**
         * <p>The details of the data synchronization task in the reverse direction. </p>
         * <br>
         * <p>> This parameter is returned only for two-way data synchronization tasks.</p>
         */
        @NameInMap("ReverseJob")
        public DescribeDtsJobsResponseBodyDtsJobListReverseJob reverseJob;

        /**
         * <p>The connection settings of the source instance.</p>
         */
        @NameInMap("SourceEndpoint")
        public DescribeDtsJobsResponseBodyDtsJobListSourceEndpoint sourceEndpoint;

        /**
         * <p>The state of the DTS instance. For more information about the valid values, see the description of the request parameter **Status**.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The state of schema migration or initial schema synchronization.</p>
         */
        @NameInMap("StructureInitializationStatus")
        public DescribeDtsJobsResponseBodyDtsJobListStructureInitializationStatus structureInitializationStatus;

        /**
         * <p>The tags of the task.</p>
         */
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

        public DescribeDtsJobsResponseBodyDtsJobList setDataCloudStatus(DescribeDtsJobsResponseBodyDtsJobListDataCloudStatus dataCloudStatus) {
            this.dataCloudStatus = dataCloudStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListDataCloudStatus getDataCloudStatus() {
            return this.dataCloudStatus;
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

        public DescribeDtsJobsResponseBodyDtsJobList setDtsBisLabel(String dtsBisLabel) {
            this.dtsBisLabel = dtsBisLabel;
            return this;
        }
        public String getDtsBisLabel() {
            return this.dtsBisLabel;
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

        public DescribeDtsJobsResponseBodyDtsJobList setEtlSafeCheckpoint(String etlSafeCheckpoint) {
            this.etlSafeCheckpoint = etlSafeCheckpoint;
            return this;
        }
        public String getEtlSafeCheckpoint() {
            return this.etlSafeCheckpoint;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setFullDataCheckStatus(DescribeDtsJobsResponseBodyDtsJobListFullDataCheckStatus fullDataCheckStatus) {
            this.fullDataCheckStatus = fullDataCheckStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListFullDataCheckStatus getFullDataCheckStatus() {
            return this.fullDataCheckStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setIncDataCheckStatus(DescribeDtsJobsResponseBodyDtsJobListIncDataCheckStatus incDataCheckStatus) {
            this.incDataCheckStatus = incDataCheckStatus;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListIncDataCheckStatus getIncDataCheckStatus() {
            return this.incDataCheckStatus;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMaxDu(Double maxDu) {
            this.maxDu = maxDu;
            return this;
        }
        public Double getMaxDu() {
            return this.maxDu;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMemUsage(String memUsage) {
            this.memUsage = memUsage;
            return this;
        }
        public String getMemUsage() {
            return this.memUsage;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMigrationErrCode(String migrationErrCode) {
            this.migrationErrCode = migrationErrCode;
            return this;
        }
        public String getMigrationErrCode() {
            return this.migrationErrCode;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMigrationErrHelpDocId(String migrationErrHelpDocId) {
            this.migrationErrHelpDocId = migrationErrHelpDocId;
            return this;
        }
        public String getMigrationErrHelpDocId() {
            return this.migrationErrHelpDocId;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMigrationErrHelpDocKey(String migrationErrHelpDocKey) {
            this.migrationErrHelpDocKey = migrationErrHelpDocKey;
            return this;
        }
        public String getMigrationErrHelpDocKey() {
            return this.migrationErrHelpDocKey;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMigrationErrMsg(String migrationErrMsg) {
            this.migrationErrMsg = migrationErrMsg;
            return this;
        }
        public String getMigrationErrMsg() {
            return this.migrationErrMsg;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMigrationErrType(String migrationErrType) {
            this.migrationErrType = migrationErrType;
            return this;
        }
        public String getMigrationErrType() {
            return this.migrationErrType;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMigrationErrWorkaround(String migrationErrWorkaround) {
            this.migrationErrWorkaround = migrationErrWorkaround;
            return this;
        }
        public String getMigrationErrWorkaround() {
            return this.migrationErrWorkaround;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMigrationMode(DescribeDtsJobsResponseBodyDtsJobListMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeDtsJobsResponseBodyDtsJobListMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeDtsJobsResponseBodyDtsJobList setMinDu(Double minDu) {
            this.minDu = minDu;
            return this;
        }
        public Double getMinDu() {
            return this.minDu;
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

        public DescribeDtsJobsResponseBodyDtsJobList setResourceGroupDisplayName(String resourceGroupDisplayName) {
            this.resourceGroupDisplayName = resourceGroupDisplayName;
            return this;
        }
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
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
        /**
         * <p>The error message returned if the ETL task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the ETL task. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of entries that have been processed by the ETL task.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of the ETL task. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The task is not started. </p>
         * <p>- **Migrating**: The task is in progress. </p>
         * <p>- **Failed**: The task failed. </p>
         * <p>- **Finished**: The task is complete. </p>
         * <p>- **Catched**: The task is not delayed.</p>
         */
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
        /**
         * <p>The error message returned if full data migration or initial full data synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of full data migration or initial full data synchronization. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of entries that have been migrated or synchronized during full data migration or initial full data synchronization.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of full data migration or initial full data synchronization. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The task is not started. </p>
         * <p>- **Migrating**: The task is in progress. </p>
         * <p>- **Failed**: The task failed. </p>
         * <p>- **Finished**: The task is complete.</p>
         */
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
        /**
         * <p>The error message returned if incremental data migration or synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether the instance needs to be upgraded. Valid values:</p>
         * <br>
         * <p>- **true**</p>
         * <p>- **false**</p>
         * <br>
         * <p>> To upgrade a DTS instance, call the [TransferInstanceClass](~~281093~~) operation.</p>
         */
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        /**
         * <p>The progress of incremental data migration or synchronization. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of entries that have been migrated or synchronized during incremental data migration or synchronization.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of incremental data migration or synchronization. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The task is not started. </p>
         * <p>- **Migrating**: The task is in progress. </p>
         * <p>- **Failed**: The task failed. </p>
         * <p>- **Finished**: The task is complete. </p>
         * <p>- **Catched**: The task is not delayed.</p>
         */
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
        /**
         * <p>The name of the database that contains the migrated objects in the destination instance.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database engine of the destination instance.</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The ID of the destination instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the destination instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The endpoint of the destination instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The SID of the Oracle database. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **EngineName** of the destination instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The port number of the destination instance.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the region in which the destination instance resides. For more information, see [Supported regions](~~141033~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <br>
         * <p>- **DISABLE**: SSL encryption is disabled. </p>
         * <p>- **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled and the CA certificate is uploaded. </p>
         * <p>- **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </p>
         * <p>- **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</p>
         */
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        /**
         * <p>The database account of the destination instance.</p>
         */
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
        /**
         * <p>Indicates whether full data migration or initial full data synchronization is performed. Valid values:</p>
         * <br>
         * <p>- **true**</p>
         * <p>- **false**</p>
         */
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        /**
         * <p>Indicates whether incremental data migration or synchronization is performed. Valid values:</p>
         * <br>
         * <p>- **true**</p>
         * <p>- **false**</p>
         */
        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>Indicates whether schema migration or initial schema synchronization is performed. Valid values:</p>
         * <br>
         * <p>- **true**</p>
         * <p>- **false**</p>
         */
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
        /**
         * <p>The size of data that is migrated or synchronized per second. Unit: MB/s.</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
         */
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
        /**
         * <p>The name of the precheck item.</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>The description of the precheck item.</p>
         */
        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        /**
         * <p>The precheck result. Valid values:</p>
         * <br>
         * <p>- **Success**</p>
         * <p>- **Failed**</p>
         */
        @NameInMap("CheckResult")
        public String checkResult;

        /**
         * <p>The error message returned if the task failed to pass the precheck. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **CheckResult** is **Failed**.</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The method to fix a precheck failure. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **CheckResult** is **Failed**.</p>
         */
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
        /**
         * <p>The result of each precheck item.</p>
         */
        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatusDetail> detail;

        /**
         * <p>The error message returned if the precheck failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The precheck progress. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The precheck state. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The precheck is not started. </p>
         * <p>- **Suspending**: The precheck is paused. </p>
         * <p>- **Checking**: The precheck is in progress. </p>
         * <p>- **Failed**: The precheck failed. </p>
         * <p>- **Finished**: The precheck is complete.</p>
         */
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
        /**
         * <p>The error message returned if these retries failed.</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The maximum duration of a retry. Unit: seconds.</p>
         */
        @NameInMap("MaxRetryTime")
        public Integer maxRetryTime;

        /**
         * <p>The progress of the instance when DTS retries.</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The number of retries that have been performed.</p>
         */
        @NameInMap("RetryCount")
        public Integer retryCount;

        /**
         * <p>The object on which these retries are performed. Valid values:</p>
         * <br>
         * <p>- **srcDB**: the source database </p>
         * <p>- **destDB**: the destination database </p>
         * <p>- **inner_module**: an internal module of DTS</p>
         */
        @NameInMap("RetryTarget")
        public String retryTarget;

        /**
         * <p>The time that has elapsed from the time when the first retry starts. Unit: seconds.</p>
         */
        @NameInMap("RetryTime")
        public Integer retryTime;

        /**
         * <p>Indicates whether the task is being retried. Valid values:</p>
         * <br>
         * <p>- **true**</p>
         * <p>- **false**</p>
         */
        @NameInMap("Retrying")
        public Boolean retrying;

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

        public DescribeDtsJobsResponseBodyEtlDemoListRetryState setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListRetryState setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public DescribeDtsJobsResponseBodyEtlDemoListRetryState setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
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

        public DescribeDtsJobsResponseBodyEtlDemoListRetryState setRetrying(Boolean retrying) {
            this.retrying = retrying;
            return this;
        }
        public Boolean getRetrying() {
            return this.retrying;
        }

    }

    public static class DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus extends TeaModel {
        /**
         * <p>The error message returned if initial full data synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of initial full data synchronization. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of entries that have been synchronized during initial full data synchronization.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of initial full data synchronization. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The task is not started. </p>
         * <p>- **Migrating**: The task is in progress. </p>
         * <p>- **Failed**: The task failed. </p>
         * <p>- **Finished**: The task is complete.</p>
         */
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
        /**
         * <p>The error message returned if incremental data synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether the instance needs to be upgraded. Valid values:</p>
         * <br>
         * <p>- **true**</p>
         * <p>- **false**</p>
         * <br>
         * <p>> To upgrade a DTS instance, call the [TransferInstanceClass](~~281093~~) operation.</p>
         */
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        /**
         * <p>The progress of incremental data synchronization. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of entries that have been migrated or synchronized during incremental data migration or synchronization.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of incremental data synchronization.</p>
         */
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
        /**
         * <p>The name of the database that contains the synchronized objects in the destination instance.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database engine of the destination instance.</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The ID of the destination instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the destination instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The endpoint of the destination instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The SID of the Oracle database. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **EngineName** of the destination instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The port number of the destination instance.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the region in which the destination instance resides. For more information, see [Supported regions](~~141033~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <br>
         * <p>- **DISABLE**: SSL encryption is disabled. </p>
         * <p>- **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled and the CA certificate is uploaded. </p>
         * <p>- **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </p>
         * <p>- **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</p>
         */
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        /**
         * <p>The database account of the destination instance.</p>
         */
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
        /**
         * <p>Indicates whether full data migration or initial full data synchronization is performed. Valid values:</p>
         * <br>
         * <p>- **true**</p>
         * <p>- **false**</p>
         */
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        /**
         * <p>Indicates whether incremental data migration or synchronization is performed. Valid values:</p>
         * <br>
         * <p>- **true**</p>
         * <p>- **false**</p>
         */
        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>Indicates whether schema migration or initial schema synchronization is performed. Valid values:</p>
         * <br>
         * <p>- **true**</p>
         * <p>- **false**</p>
         */
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
        /**
         * <p>The size of data that is migrated or synchronized per second. Unit: MB/s.</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
         */
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
        /**
         * <p>The name of the precheck item.</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>The description of the precheck item.</p>
         */
        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        /**
         * <p>The precheck result. Valid values:</p>
         * <br>
         * <p>- **Success**</p>
         * <p>- **Failed**</p>
         */
        @NameInMap("CheckResult")
        public String checkResult;

        /**
         * <p>The error message returned if the task failed to pass the precheck. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **CheckResult** is **Failed**.</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The method to fix a precheck failure. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **CheckResult** is **Failed**.</p>
         */
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
        /**
         * <p>The result of each precheck item.</p>
         */
        @NameInMap("Detail")
        public java.util.List<DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatusDetail> detail;

        /**
         * <p>The error message returned if the precheck failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The precheck progress. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The precheck state. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The precheck is not started. </p>
         * <p>- **Suspending**: The precheck is paused. </p>
         * <p>- **Checking**: The precheck is in progress. </p>
         * <p>- **Failed**: The precheck failed. </p>
         * <p>- **Finished**: The precheck is complete.</p>
         */
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
        /**
         * <p>The name of the database that contains the objects to be migrated from the source instance.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database engine of the source instance.</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The ID of the source instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the source instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The endpoint of the source instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The SID of the Oracle database. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **EngineName** of the source instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The port number of the source instance.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the region in which the source instance resides. For more information, see [Supported regions](~~141033~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <br>
         * <p>- **DISABLE**: SSL encryption is disabled. </p>
         * <p>- **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled and the CA certificate is uploaded. </p>
         * <p>- **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </p>
         * <p>- **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</p>
         */
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        /**
         * <p>The database account of the source instance.</p>
         */
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
        /**
         * <p>The error message returned if initial schema synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of initial schema synchronization. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of tables that have been synchronized during initial schema synchronization.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of initial schema synchronization. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The task is not started. </p>
         * <p>- **Migrating**: The task is in progress. </p>
         * <p>- **Failed**: The task failed. </p>
         * <p>- **Finished**: The task is complete.</p>
         */
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
        /**
         * <p>The start offset of incremental data synchronization. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The state of initial full data synchronization.</p>
         */
        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataInitializationStatus dataInitializationStatus;

        /**
         * <p>The state of incremental data synchronization.</p>
         */
        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        /**
         * <p>The schema of the objects that you want to synchronize. The value is a JSON string and can contain regular expressions. For more information, see Objects of DTS tasks.</p>
         */
        @NameInMap("DbObject")
        public String dbObject;

        /**
         * <p>The latency of incremental data synchronization. Unit: seconds.</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <p>The connection settings of the destination instance.</p>
         */
        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobDestinationEndpoint destinationEndpoint;

        /**
         * <p>The ID of the data synchronization instance.</p>
         */
        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        /**
         * <p>The instance class. </p>
         * <br>
         * <p>> For more information about the test performance of each instance class, see [Specifications of data synchronization instances](~~26605~~).</p>
         */
        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        /**
         * <p>The synchronization direction. **Reverse** is returned.</p>
         */
        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        /**
         * <p>The ID of the synchronization task.</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The name of the data synchronization task.</p>
         */
        @NameInMap("DtsJobName")
        public String dtsJobName;

        /**
         * <p>The error message returned if the task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The checkpoint of the ETL task.</p>
         */
        @NameInMap("EtlSafeCheckpoint")
        public String etlSafeCheckpoint;

        /**
         * <p>The time when the instance expires. The time follows the ISO 8601 standard in the* yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **PayType** is **PrePaid**.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The migration types or initial synchronization types.</p>
         */
        @NameInMap("MigrationMode")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobMigrationMode migrationMode;

        /**
         * <p>The billing method of the DTS instance. Valid values:</p>
         * <br>
         * <p>- **PrePaid**: subscription</p>
         * <p>- **PostPaid**: pay-as-you-go</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The performance of the data migration or synchronization instance.</p>
         */
        @NameInMap("Performance")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPerformance performance;

        /**
         * <p>The precheck state.</p>
         */
        @NameInMap("PrecheckStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobPrecheckStatus precheckStatus;

        /**
         * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).</p>
         */
        @NameInMap("Reserved")
        public String reserved;

        /**
         * <p>The connection settings of the source instance.</p>
         */
        @NameInMap("SourceEndpoint")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJobSourceEndpoint sourceEndpoint;

        /**
         * <p>The state of the DTS instance. For more information about the valid values, see the description of the request parameter **Status**.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The state of initial schema synchronization.</p>
         */
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

        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob setEtlSafeCheckpoint(String etlSafeCheckpoint) {
            this.etlSafeCheckpoint = etlSafeCheckpoint;
            return this;
        }
        public String getEtlSafeCheckpoint() {
            return this.etlSafeCheckpoint;
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
        /**
         * <p>The name of the database that contains the objects to be migrated from the source instance.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database engine of the source instance.</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The ID of the source instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the source instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The endpoint of the source instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The SID of the Oracle database. </p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **EngineName** of the source instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The port number of the source instance.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the region in which the source instance resides. For more information, see [Supported regions](~~141033~~).</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <br>
         * <p>- **DISABLE**: SSL encryption is disabled. </p>
         * <p>- **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled and the CA certificate is uploaded. </p>
         * <p>- **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. </p>
         * <p>- **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.</p>
         */
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        /**
         * <p>The database account of the source instance.</p>
         */
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
        /**
         * <p>The error message returned if schema migration or initial schema synchronization failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of schema migration or initial schema synchronization. Unit: percentage.</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of tables that have been migrated or synchronized during schema migration or initial schema synchronization.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The state of schema migration or initial schema synchronization. Valid values:</p>
         * <br>
         * <p>- **NotStarted**: The task is not started. </p>
         * <p>- **Migrating**: The task is in progress. </p>
         * <p>- **Failed**: The task failed. </p>
         * <p>- **Finished**: The task is complete.</p>
         */
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
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
        /**
         * <p>Indicates whether the **new** change tracking feature is used. </p>
         * <br>
         * <p>> This parameter is returned only for change tracking instances of the new version.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The start of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("BeginTimestamp")
        public String beginTimestamp;

        /**
         * <p>The start offset of incremental data migration or data synchronization. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        /**
         * <p>The downstream client information in the following format: <IP address of the downstream client>:<Random ID generated by DTS>.</p>
         */
        @NameInMap("ConsumptionClient")
        public String consumptionClient;

        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:s*sZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The state of the ETL task. </p>
         * <br>
         * <p>> This parameter collection is returned only if an ETL task is configured.</p>
         */
        @NameInMap("DataEtlStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListDataEtlStatus dataEtlStatus;

        /**
         * <p>The state of full data migration or initial full data synchronization.</p>
         */
        @NameInMap("DataInitializationStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListDataInitializationStatus dataInitializationStatus;

        /**
         * <p>The state of incremental data migration or synchronization.</p>
         */
        @NameInMap("DataSynchronizationStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListDataSynchronizationStatus dataSynchronizationStatus;

        /**
         * <p>The objects of the data migration, data synchronization, or change tracking task. For more information, see [Objects of DTS tasks](~~209545~~).</p>
         */
        @NameInMap("DbObject")
        public String dbObject;

        /**
         * <p>The latency of incremental data migration or synchronization. </p>
         * <br>
         * <p>> If you query data migration tasks, the unit of this parameter is milliseconds. If you query data synchronization tasks, the unit of this parameter is seconds.</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <p>The connection settings of the destination instance.</p>
         */
        @NameInMap("DestinationEndpoint")
        public DescribeDtsJobsResponseBodyEtlDemoListDestinationEndpoint destinationEndpoint;

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
         */
        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        /**
         * <p>The instance class. </p>
         * <br>
         * <p>> For more information about the test performance of each instance class, see [Specifications of data migration instances](~~26606~~) and [Specifications of data synchronization instances](~~26605~~).</p>
         */
        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <br>
         * <p>- **Forward**</p>
         * <p>- **Reverse**</p>
         * <br>
         * <p>> This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.</p>
         */
        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The name of the data migration, data synchronization, or change tracking task.</p>
         */
        @NameInMap("DtsJobName")
        public String dtsJobName;

        /**
         * <p>The end of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("EndTimestamp")
        public String endTimestamp;

        /**
         * <p>The error message returned if the task failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The checkpoint of the ETL task.</p>
         */
        @NameInMap("EtlSafeCheckpoint")
        public String etlSafeCheckpoint;

        /**
         * <p>The time when the instance expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         * <br>
         * <p>> This parameter is returned only if the returned value of **PayType** is **PrePaid**.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The type of the DTS task. Valid values:</p>
         * <br>
         * <p>- **MIGRATION**: data migration task </p>
         * <p>- **SYNC**: data synchronization task </p>
         * <p>- **SUBSCRIBE**: change tracking task</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The migration types or initial synchronization types.</p>
         */
        @NameInMap("MigrationMode")
        public DescribeDtsJobsResponseBodyEtlDemoListMigrationMode migrationMode;

        /**
         * <p>The source of the task.</p>
         * <p>- **PTS**</p>
         * <p>- **DMS**</p>
         * <p>- **DTS**</p>
         */
        @NameInMap("OriginType")
        public String originType;

        /**
         * <p>The billing method of the DTS instance. Valid values:</p>
         * <br>
         * <p>- **PrePaid**: subscription </p>
         * <p>- **PostPaid**: pay-as-you-go</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The performance of the data migration or synchronization instance.</p>
         */
        @NameInMap("Performance")
        public DescribeDtsJobsResponseBodyEtlDemoListPerformance performance;

        /**
         * <p>The precheck state.</p>
         */
        @NameInMap("PrecheckStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListPrecheckStatus precheckStatus;

        /**
         * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).</p>
         */
        @NameInMap("Reserved")
        public String reserved;

        /**
         * <p>The name of the resource group.</p>
         */
        @NameInMap("ResourceGroupDisplayName")
        public String resourceGroupDisplayName;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The information about the retries performed by DTS due to an exception.</p>
         */
        @NameInMap("RetryState")
        public DescribeDtsJobsResponseBodyEtlDemoListRetryState retryState;

        /**
         * <p>The details of the data synchronization task in the reverse direction. </p>
         * <br>
         * <p>> This parameter is returned only for two-way data synchronization tasks.</p>
         */
        @NameInMap("ReverseJob")
        public DescribeDtsJobsResponseBodyEtlDemoListReverseJob reverseJob;

        /**
         * <p>The connection settings of the source instance.</p>
         */
        @NameInMap("SourceEndpoint")
        public DescribeDtsJobsResponseBodyEtlDemoListSourceEndpoint sourceEndpoint;

        /**
         * <p>The state of the DTS instance. For more information about the valid values, see the description of the request parameter **Status**.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The state of schema migration or initial schema synchronization.</p>
         */
        @NameInMap("StructureInitializationStatus")
        public DescribeDtsJobsResponseBodyEtlDemoListStructureInitializationStatus structureInitializationStatus;

        /**
         * <p>The tags of the task.</p>
         */
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

        public DescribeDtsJobsResponseBodyEtlDemoList setEtlSafeCheckpoint(String etlSafeCheckpoint) {
            this.etlSafeCheckpoint = etlSafeCheckpoint;
            return this;
        }
        public String getEtlSafeCheckpoint() {
            return this.etlSafeCheckpoint;
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

        public DescribeDtsJobsResponseBodyEtlDemoList setResourceGroupDisplayName(String resourceGroupDisplayName) {
            this.resourceGroupDisplayName = resourceGroupDisplayName;
            return this;
        }
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
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
