// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeGadInstanceDtsMembersResponseBody extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-28 17:34:53.0</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DbEngineType")
    public String dbEngineType;

    /**
     * <p>The list of tasks and the execution details of each task.</p>
     */
    @NameInMap("DtsJobList")
    public java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobList> dtsJobList;

    /**
     * <p>The dynamic error code. This parameter will be deprecated soon.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace the <strong>%s</strong> in the <strong>ErrMessage</strong> response parameter.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the specified request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>present environment is not support,so skip.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned when a call error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The ID of the active-active instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1i99e8l7913****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the active-active instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The region ID of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C166D79D-436B-45F0-B5A5-25E1959F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the active geo-redundancy instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeGadInstanceDtsMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstanceDtsMembersResponseBody self = new DescribeGadInstanceDtsMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstanceDtsMembersResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeGadInstanceDtsMembersResponseBody setDbEngineType(String dbEngineType) {
        this.dbEngineType = dbEngineType;
        return this;
    }
    public String getDbEngineType() {
        return this.dbEngineType;
    }

    public DescribeGadInstanceDtsMembersResponseBody setDtsJobList(java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobList> dtsJobList) {
        this.dtsJobList = dtsJobList;
        return this;
    }
    public java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobList> getDtsJobList() {
        return this.dtsJobList;
    }

    public DescribeGadInstanceDtsMembersResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeGadInstanceDtsMembersResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeGadInstanceDtsMembersResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeGadInstanceDtsMembersResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeGadInstanceDtsMembersResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeGadInstanceDtsMembersResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGadInstanceDtsMembersResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeGadInstanceDtsMembersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGadInstanceDtsMembersResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeGadInstanceDtsMembersResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGadInstanceDtsMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGadInstanceDtsMembersResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeGadInstanceDtsMembersResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGadInstanceDtsMembersResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeGadInstanceDtsMembersResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataCloudStatus extends TeaModel {
        /**
         * <p>The error message for a failed task.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified product does not exist.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether the instance specifications need to be upgraded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        /**
         * <p>The task progress. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of tables that have been migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of the physical migration to the cloud task.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataCloudStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataCloudStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataCloudStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataCloudStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataCloudStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataCloudStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataCloudStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataCloudStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataEtlStatus extends TeaModel {
        /**
         * <p>The error message for a failed ETL task.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified product does not exist.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ETL task progress. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of records for which the ETL task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The log level of the log information. Multiple statuses are separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: Normal.</li>
         * <li><strong>WARN</strong>: Warning.</li>
         * <li><strong>ERROR</strong>: Error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataEtlStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataEtlStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataEtlStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataEtlStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataEtlStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataEtlStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataEtlStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataInitializationStatus extends TeaModel {
        /**
         * <p>The error message for failed full data migration or initial data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>The deviceName is empty.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of full data migration or initial data synchronization. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of records for which full data migration or initial data synchronization is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of full data migration or initial data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataInitializationStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataSynchronizationStatus extends TeaModel {
        /**
         * <p>The error message for failed incremental data migration or synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>The deviceName format is incorrect.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether the instance specifications need to be upgraded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>To upgrade the instance specifications, call the <a href="https://help.aliyun.com/document_detail/281093.html">TransferInstanceClass</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        /**
         * <p>The progress of incremental data migration or synchronization. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of records for which incremental data migration or synchronization is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The log level of the log information. Multiple statuses are separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: Normal.</li>
         * <li><strong>WARN</strong>: Warning.</li>
         * <li><strong>ERROR</strong>: Error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataSynchronizationStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataSynchronizationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataSynchronizationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint extends TeaModel {
        /**
         * <p>The name of the database to which the migration objects in the instance belong.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database engine type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1imrtn6fq7h****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The SID of the Oracle database.</p>
         * <blockquote>
         * <p>This parameter is returned only when the <strong>EngineName</strong> parameter of the destination instance is set to <strong>Oracle</strong> and the Oracle database is a non-RAC instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The database service port of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether an SSL-secured connection is used. Valid values:</p>
         * <ul>
         * <li><strong>DISABLE</strong>: SSL-secured connections are not used.</li>
         * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL-secured connections are used, and a CA certificate is uploaded.</li>
         * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL-secured connections to AWS MongoDB Atlas are used.</li>
         * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to connect to Kafka.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISABLE</p>
         */
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>dts</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListErrorDetails extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The URL of the help document.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong>.ali</strong>.com/**</p>
         */
        @NameInMap("HelpUrl")
        public String helpUrl;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListErrorDetails self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListErrorDetails setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListErrorDetails setHelpUrl(String helpUrl) {
            this.helpUrl = helpUrl;
            return this;
        }
        public String getHelpUrl() {
            return this.helpUrl;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListFullDataCheckStatus extends TeaModel {
        /**
         * <p>The error message for a failed task.</p>
         * 
         * <strong>example:</strong>
         * <p>device status is offline</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the full data verification task. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The completion progress of the full data verification task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status information of full data verification.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListFullDataCheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListFullDataCheckStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListFullDataCheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListFullDataCheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListFullDataCheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListFullDataCheckStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListFullDataCheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListIncDataCheckStatus extends TeaModel {
        /**
         * <p>The error message for a failed task.</p>
         * 
         * <strong>example:</strong>
         * <p>voice intercom existed</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the incremental data verification task. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The completion progress of the incremental data verification task.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status information of incremental data verification.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListIncDataCheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListIncDataCheckStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListIncDataCheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListIncDataCheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListIncDataCheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListIncDataCheckStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListIncDataCheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListMigrationMode extends TeaModel {
        /**
         * <p>Indicates whether full data migration or initial full data synchronization is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        /**
         * <p>Indicates whether incremental data migration or synchronization is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>Indicates whether full data validation is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FullDataCheck")
        public Boolean fullDataCheck;

        /**
         * <p>Indicates whether incremental data validation is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IncDataCheck")
        public Boolean incDataCheck;

        /**
         * <p>Indicates whether schema migration or initial schema synchronization is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListMigrationMode self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListMigrationMode setFullDataCheck(Boolean fullDataCheck) {
            this.fullDataCheck = fullDataCheck;
            return this;
        }
        public Boolean getFullDataCheck() {
            return this.fullDataCheck;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListMigrationMode setIncDataCheck(Boolean incDataCheck) {
            this.incDataCheck = incDataCheck;
            return this;
        }
        public Boolean getIncDataCheck() {
            return this.incDataCheck;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListPerformance extends TeaModel {
        /**
         * <p>The data migration or synchronization traffic per second, in MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The number of SQL statements migrated or synchronized per second, including BEGIN, COMMIT, DML statements (INSERT, DELETE, and UPDATE), and DDL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Rps")
        public String rps;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListPerformance self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPerformance setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPerformance setRps(String rps) {
            this.rps = rps;
            return this;
        }
        public String getRps() {
            return this.rps;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatusDetail extends TeaModel {
        /**
         * <p>The precheck item.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_CONN_SRC</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>The description of the precheck item.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_CONN_SRC_DETAIL</p>
         */
        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        /**
         * <p>The check result. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: The item passed the check.</li>
         * <li><strong>Failed</strong>: The item failed the check.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("CheckResult")
        public String checkResult;

        /**
         * <p>The error message for the failed precheck.</p>
         * <blockquote>
         * <p>This parameter is returned only when the <strong>CheckResult</strong> parameter is set to <strong>Failed</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Original error: Access denied for user \&quot;dtstest\&quot;@\&quot;100.104.***.**\&quot; (using password: YES)</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The solution for the failed precheck.</p>
         * <blockquote>
         * <p>This parameter is returned only when the <strong>CheckResult</strong> parameter is set to <strong>Failed</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
         */
        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatusDetail self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatusDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatusDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatusDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatusDetail setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatus extends TeaModel {
        /**
         * <p>The execution status of each precheck item.</p>
         */
        @NameInMap("Detail")
        public java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatusDetail> detail;

        /**
         * <p>The error message for the precheck failure.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK__ERROR_SAME_OBJ.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The overall progress of the precheck, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The precheck status.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatus setDetail(java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState extends TeaModel {
        /**
         * <p>The error message returned when a call error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bi6e22ay243****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The maximum retry time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>7200</p>
         */
        @NameInMap("MaxRetryTime")
        public Integer maxRetryTime;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>dts.retry.err.0046</p>
         */
        @NameInMap("MigrationErrCode")
        public String migrationErrCode;

        /**
         * <p>The ID of the help document for the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>462133</p>
         */
        @NameInMap("MigrationErrHelpDocId")
        public String migrationErrHelpDocId;

        /**
         * <p>The key of the help document for the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-RETRY-ERR-0046</p>
         */
        @NameInMap("MigrationErrHelpDocKey")
        public String migrationErrHelpDocKey;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>dts.retry.err.0046.msg</p>
         */
        @NameInMap("MigrationErrMsg")
        public String migrationErrMsg;

        /**
         * <p>The type of the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ForeignKey</p>
         */
        @NameInMap("MigrationErrType")
        public String migrationErrType;

        /**
         * <p>The error workaround.</p>
         * 
         * <strong>example:</strong>
         * <p>dts.retry.err.0046.workaround</p>
         */
        @NameInMap("MigrationErrWorkaround")
        public String migrationErrWorkaround;

        /**
         * <p>The instance progress.</p>
         * 
         * <strong>example:</strong>
         * <p>03</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RetryCount")
        public Integer retryCount;

        /**
         * <p>The retry target. Valid values:</p>
         * <ul>
         * <li><strong>srcDB</strong>: The source database.</li>
         * <li><strong>destDB</strong>: The destination database.</li>
         * <li><strong>inner_module</strong>: The internal module of DTS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>srcDB</p>
         */
        @NameInMap("RetryTarget")
        public String retryTarget;

        /**
         * <p>The elapsed retry time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("RetryTime")
        public Integer retryTime;

        /**
         * <p>Indicates whether the task is being retried. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Retrying")
        public Boolean retrying;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setMigrationErrCode(String migrationErrCode) {
            this.migrationErrCode = migrationErrCode;
            return this;
        }
        public String getMigrationErrCode() {
            return this.migrationErrCode;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setMigrationErrHelpDocId(String migrationErrHelpDocId) {
            this.migrationErrHelpDocId = migrationErrHelpDocId;
            return this;
        }
        public String getMigrationErrHelpDocId() {
            return this.migrationErrHelpDocId;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setMigrationErrHelpDocKey(String migrationErrHelpDocKey) {
            this.migrationErrHelpDocKey = migrationErrHelpDocKey;
            return this;
        }
        public String getMigrationErrHelpDocKey() {
            return this.migrationErrHelpDocKey;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setMigrationErrMsg(String migrationErrMsg) {
            this.migrationErrMsg = migrationErrMsg;
            return this;
        }
        public String getMigrationErrMsg() {
            return this.migrationErrMsg;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setMigrationErrType(String migrationErrType) {
            this.migrationErrType = migrationErrType;
            return this;
        }
        public String getMigrationErrType() {
            return this.migrationErrType;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setMigrationErrWorkaround(String migrationErrWorkaround) {
            this.migrationErrWorkaround = migrationErrWorkaround;
            return this;
        }
        public String getMigrationErrWorkaround() {
            return this.migrationErrWorkaround;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setRetryTarget(String retryTarget) {
            this.retryTarget = retryTarget;
            return this;
        }
        public String getRetryTarget() {
            return this.retryTarget;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setRetryTime(Integer retryTime) {
            this.retryTime = retryTime;
            return this;
        }
        public Integer getRetryTime() {
            return this.retryTime;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState setRetrying(Boolean retrying) {
            this.retrying = retrying;
            return this;
        }
        public Boolean getRetrying() {
            return this.retrying;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataInitializationStatus extends TeaModel {
        /**
         * <p>The error message for the initial full data synchronization failure.</p>
         * 
         * <strong>example:</strong>
         * <p>The deviceName format is incorrect.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of initial full data synchronization, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of records for which initial full data synchronization is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>43071</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of initial full data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataInitializationStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataSynchronizationStatus extends TeaModel {
        /**
         * <p>The error message for the incremental data synchronization failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance not found.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether the instance specifications need to be upgraded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>To upgrade the instance specifications, call the <a href="https://help.aliyun.com/document_detail/281093.html">TransferInstanceClass</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        /**
         * <p>The progress of incremental data synchronization, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of records for which incremental data migration or synchronization is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of incremental data synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataSynchronizationStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataSynchronizationStatus setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataSynchronizationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint extends TeaModel {
        /**
         * <p>The name of the database to which the synchronized objects belong in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database engine type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1162kryivb8****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The SID of the Oracle database.</p>
         * <blockquote>
         * <p>This parameter is returned only when the <strong>EngineName</strong> parameter of the destination instance is set to <strong>Oracle</strong> and the Oracle database is a non-RAC instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The database service port of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether an SSL-secured connection is used. Valid values:</p>
         * <ul>
         * <li><strong>DISABLE</strong>: SSL-secured connections are not used.</li>
         * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL-secured connections are used, and a CA certificate is uploaded.</li>
         * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL-secured connections to AWS MongoDB Atlas are used.</li>
         * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to connect to Kafka.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISABLE</p>
         */
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>dts</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobErrorDetails extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-31009</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The URL of the help document.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong>.ali</strong>.com/**</p>
         */
        @NameInMap("HelpUrl")
        public String helpUrl;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobErrorDetails self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobErrorDetails setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobErrorDetails setHelpUrl(String helpUrl) {
            this.helpUrl = helpUrl;
            return this;
        }
        public String getHelpUrl() {
            return this.helpUrl;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobFullDataCheckStatus extends TeaModel {
        /**
         * <p>The error message for a failed task.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the full data verification task. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The completion progress of the full data verification task.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status information of full data verification.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobFullDataCheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobFullDataCheckStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobFullDataCheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobFullDataCheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobFullDataCheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobFullDataCheckStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobFullDataCheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobIncDataCheckStatus extends TeaModel {
        /**
         * <p>The error message for a failed task.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of the incremental data verification task. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The completion progress of the incremental data verification task.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status information of incremental data verification.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobIncDataCheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobIncDataCheckStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobIncDataCheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobIncDataCheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobIncDataCheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobIncDataCheckStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobIncDataCheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobMigrationMode extends TeaModel {
        /**
         * <p>Specifies whether to perform initial full data synchronization. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataInitialization")
        public Boolean dataInitialization;

        /**
         * <p>Specifies whether to perform incremental data synchronization. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        /**
         * <p>Indicates whether full data validation is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FullDataCheck")
        public Boolean fullDataCheck;

        /**
         * <p>Indicates whether incremental data validation is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IncDataCheck")
        public Boolean incDataCheck;

        /**
         * <p>Specifies whether to perform initial schema synchronization. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StructureInitialization")
        public Boolean structureInitialization;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobMigrationMode self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobMigrationMode();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobMigrationMode setDataInitialization(Boolean dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobMigrationMode setFullDataCheck(Boolean fullDataCheck) {
            this.fullDataCheck = fullDataCheck;
            return this;
        }
        public Boolean getFullDataCheck() {
            return this.fullDataCheck;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobMigrationMode setIncDataCheck(Boolean incDataCheck) {
            this.incDataCheck = incDataCheck;
            return this;
        }
        public Boolean getIncDataCheck() {
            return this.incDataCheck;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobMigrationMode setStructureInitialization(Boolean structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPerformance extends TeaModel {
        /**
         * <p>The data synchronization traffic per second, in MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The number of SQL statements synchronized per second, including BEGIN, COMMIT, DML statements (INSERT, DELETE, and UPDATE), and DDL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Rps")
        public String rps;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPerformance self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPerformance();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPerformance setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPerformance setRps(String rps) {
            this.rps = rps;
            return this;
        }
        public String getRps() {
            return this.rps;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatusDetail extends TeaModel {
        /**
         * <p>The precheck item.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_CONN_SRC</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>The description of the precheck item.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_CONN_SRC_DETAIL</p>
         */
        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        /**
         * <p>The precheck result. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: The item passed the precheck.</li>
         * <li><strong>Failed</strong>: The item failed the precheck.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("CheckResult")
        public String checkResult;

        /**
         * <p>The error message returned when the precheck fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Original error: Access denied for user \&quot;dtstest\&quot;@\&quot;100.104.***.**\&quot; (using password: YES)</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The solution provided when the precheck fails.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
         */
        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatusDetail self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatusDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatusDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatusDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatusDetail setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatus extends TeaModel {
        /**
         * <p>The execution status of each precheck item.</p>
         */
        @NameInMap("Detail")
        public java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatusDetail> detail;

        /**
         * <p>The error message for the precheck failure.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK__ERROR_SAME_OBJ.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The overall progress of the precheck, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The precheck status.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatus setDetail(java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint extends TeaModel {
        /**
         * <p>The name of the database to which the migration objects in the instance belong.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database type of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The source instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1imrtn6fq7h****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The SID of the Oracle database.</p>
         * <blockquote>
         * <p>This parameter is returned only when the <strong>EngineName</strong> parameter of the source instance is set to <strong>Oracle</strong> and the Oracle database is a non-RAC instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The database service port of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether an SSL-secured connection is used. Valid values:</p>
         * <ul>
         * <li><strong>DISABLE</strong>: SSL-secured connections are not used.</li>
         * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL-secured connections are used, and a CA certificate is uploaded.</li>
         * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL-secured connections to AWS MongoDB Atlas are used.</li>
         * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to connect to Kafka.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISABLE</p>
         */
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>dts</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobStructureInitializationStatus extends TeaModel {
        /**
         * <p>The error message returned when initial schema synchronization fails.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of initial schema synchronization, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of tables for which initial schema synchronization is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of initial schema synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobStructureInitializationStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob extends TeaModel {
        /**
         * <p>The checkpoint for incremental data synchronization. The value is a UNIX timestamp, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1616980369</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The current CPU utilization of the instance. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("CpuUsage")
        public String cpuUsage;

        /**
         * <p>The task creation time, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-28 17:34:53.0</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The status of initial full data synchronization.</p>
         */
        @NameInMap("DataInitializationStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataInitializationStatus dataInitializationStatus;

        /**
         * <p>The status of incremental data synchronization.</p>
         */
        @NameInMap("DataSynchronizationStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        /**
         * <p>The schema definition of the synchronized objects. The value is a JSON string and supports specific regular expressions. For more information and examples, see the object configuration instructions for migration, synchronization, or change tracking.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dtstestdata&quot;: { &quot;name&quot;: &quot;dtstestdata&quot;, &quot;all&quot;: true }}</p>
         */
        @NameInMap("DbObject")
        public String dbObject;

        /**
         * <p>The ID of the dedicated DTS cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dtscluster_dpwl3**********</p>
         */
        @NameInMap("DedicatedClusterId")
        public String dedicatedClusterId;

        /**
         * <p>The latency, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <p>The connection information of the destination instance.</p>
         */
        @NameInMap("DestinationEndpoint")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint destinationEndpoint;

        /**
         * <p>The instance ID of the data synchronization instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsi03e3zty16i****</p>
         */
        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        /**
         * <p>The specifications of the synchronization link.</p>
         * <blockquote>
         * <p>For more information about the specifications and performance test results of each link, see <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization links</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>large</p>
         */
        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        /**
         * <p>The description of the DTS task.</p>
         * 
         * <strong>example:</strong>
         * <p>Reverse</p>
         */
        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>i03e3zty16i****</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The name of the DTS task.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        @NameInMap("DtsJobName")
        public String dtsJobName;

        /**
         * <p>The used resources of the dedicated DTS cluster. Unit: DU.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("DuUsage")
        public Long duUsage;

        /**
         * <p>The error details.</p>
         */
        @NameInMap("ErrorDetails")
        public java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobErrorDetails> errorDetails;

        /**
         * <p>The error message for a failed task.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance not found.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The safe checkpoint of the ETL task.</p>
         * 
         * <strong>example:</strong>
         * <p>1610540493</p>
         */
        @NameInMap("EtlSafeCheckpoint")
        public String etlSafeCheckpoint;

        /**
         * <p>The expiration time of the instance, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is in UTC.</p>
         * <blockquote>
         * <p>This parameter is returned only when the <strong>PayType</strong> parameter is set to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-03-16T08:01:19Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The status information of full data verification.</p>
         */
        @NameInMap("FullDataCheckStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobFullDataCheckStatus fullDataCheckStatus;

        /**
         * <p>The status information of incremental data verification.</p>
         */
        @NameInMap("IncDataCheckStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobIncDataCheckStatus incDataCheckStatus;

        /**
         * <p>The DU upper limit of the serverless instance.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("MaxDu")
        public Double maxDu;

        /**
         * <p>The amount of used memory, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MemUsage")
        public String memUsage;

        /**
         * <p>The type of initial synchronization.</p>
         */
        @NameInMap("MigrationMode")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobMigrationMode migrationMode;

        /**
         * <p>The minimum number of DUs for the serverless instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinDu")
        public Double minDu;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: Subscription.</li>
         * <li><strong>PostPaid</strong>: Pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The performance information of the synchronization link.</p>
         */
        @NameInMap("Performance")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPerformance performance;

        /**
         * <p>The precheck status.</p>
         */
        @NameInMap("PrecheckStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatus precheckStatus;

        /**
         * <p>The reserved parameters of DTS. The value is a JSON string. You can specify this parameter to meet special requirements, such as specifying whether to automatically start the precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved parameter description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;srcHostPorts\&quot;:\&quot;\&quot;,\&quot;whitelist.dms.online.ddl.enable\&quot;:false,\&quot;filterDDL\&quot;:false,\&quot;sqlparser.dms.original.ddl\&quot;:true,\&quot;srcOracleType\&quot;:\&quot;sid\&quot;,\&quot;maxRetryTime\&quot;:43200,\&quot;destSSL\&quot;:\&quot;0\&quot;,\&quot;destOracleType\&quot;:\&quot;sid\&quot;,\&quot;srcSSL\&quot;:\&quot;0\&quot;,\&quot;dbListCaseChangeMode\&quot;:\&quot;default\&quot;,\&quot;SourceEngineVersion\&quot;:\&quot;8.0.18\&quot;,\&quot;srcNetType\&quot;:\&quot;VPC\&quot;,\&quot;destNetType\&quot;:\&quot;VPC\&quot;,\&quot;srcVpcNetMappingInst\&quot;:\&quot;172.16.1**.<strong>:10803\&quot;,\&quot;destVpcNetMappingInst\&quot;:\&quot;172.16.1</strong>.**:11077\&quot;,\&quot;useJobTask\&quot;:\&quot;1\&quot;}</p>
         */
        @NameInMap("Reserved")
        public String reserved;

        /**
         * <p>The connection information of the source instance.</p>
         */
        @NameInMap("SourceEndpoint")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint sourceEndpoint;

        /**
         * <p>The status of the reverse synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status of initial schema synchronization.</p>
         */
        @NameInMap("StructureInitializationStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobStructureInitializationStatus structureInitializationStatus;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setCpuUsage(String cpuUsage) {
            this.cpuUsage = cpuUsage;
            return this;
        }
        public String getCpuUsage() {
            return this.cpuUsage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setDataInitializationStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setDataSynchronizationStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setDbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }
        public String getDbObject() {
            return this.dbObject;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setDedicatedClusterId(String dedicatedClusterId) {
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }
        public String getDedicatedClusterId() {
            return this.dedicatedClusterId;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setDestinationEndpoint(DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setDtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setDuUsage(Long duUsage) {
            this.duUsage = duUsage;
            return this;
        }
        public Long getDuUsage() {
            return this.duUsage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setErrorDetails(java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setEtlSafeCheckpoint(String etlSafeCheckpoint) {
            this.etlSafeCheckpoint = etlSafeCheckpoint;
            return this;
        }
        public String getEtlSafeCheckpoint() {
            return this.etlSafeCheckpoint;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setFullDataCheckStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobFullDataCheckStatus fullDataCheckStatus) {
            this.fullDataCheckStatus = fullDataCheckStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobFullDataCheckStatus getFullDataCheckStatus() {
            return this.fullDataCheckStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setIncDataCheckStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobIncDataCheckStatus incDataCheckStatus) {
            this.incDataCheckStatus = incDataCheckStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobIncDataCheckStatus getIncDataCheckStatus() {
            return this.incDataCheckStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setMaxDu(Double maxDu) {
            this.maxDu = maxDu;
            return this;
        }
        public Double getMaxDu() {
            return this.maxDu;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setMemUsage(String memUsage) {
            this.memUsage = memUsage;
            return this;
        }
        public String getMemUsage() {
            return this.memUsage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setMigrationMode(DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setMinDu(Double minDu) {
            this.minDu = minDu;
            return this;
        }
        public Double getMinDu() {
            return this.minDu;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setPerformance(DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPerformance getPerformance() {
            return this.performance;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setPrecheckStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setSourceEndpoint(DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob setStructureInitializationStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJobStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint extends TeaModel {
        /**
         * <p>The name of the database to which the migration objects in the source instance belong.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database type of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The source instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1162kryivb8****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The endpoint of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The SID of the Oracle database.</p>
         * <blockquote>
         * <p>This parameter is returned only when the <strong>EngineName</strong> parameter of the source instance is set to <strong>Oracle</strong> and the Oracle database is a non-RAC instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The database service port of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The region where the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether an SSL-secured connection is used. Valid values:</p>
         * <ul>
         * <li><strong>DISABLE</strong>: SSL-secured connections are not used.</li>
         * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL-secured connections are used, and a CA certificate is uploaded.</li>
         * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL-secured connections to AWS MongoDB Atlas are used.</li>
         * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to connect to Kafka.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISABLE</p>
         */
        @NameInMap("SslSolutionEnum")
        public String sslSolutionEnum;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>dts</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint setSslSolutionEnum(String sslSolutionEnum) {
            this.sslSolutionEnum = sslSolutionEnum;
            return this;
        }
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListStructureInitializationStatus extends TeaModel {
        /**
         * <p>The error message returned when schema migration or initial schema synchronization fails.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The progress of schema migration or initial schema synchronization, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <p>The number of tables for which schema migration or initial schema synchronization is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status of schema migration or initial schema synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListStructureInitializationStatus self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobListTagList extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobListTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobListTagList self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobListTagList();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeGadInstanceDtsMembersResponseBodyDtsJobList extends TeaModel {
        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>new</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The start time of the timestamp range saved in the change tracking instance, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-15T08:25:34Z</p>
         */
        @NameInMap("BeginTimestamp")
        public String beginTimestamp;

        /**
         * <p>The checkpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>1616899019</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The downstream consumption checkpoint of the change tracking instance, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-23T07:30:31Z</p>
         */
        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        /**
         * <p>The downstream consumption client information, which consists of the IP address and a random number generated by DTS.</p>
         * 
         * <strong>example:</strong>
         * <p>114...:dts******</p>
         */
        @NameInMap("ConsumptionClient")
        public String consumptionClient;

        /**
         * <p>The current CPU utilization of the instance. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CpuUsage")
        public String cpuUsage;

        /**
         * <p>The task creation time, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-28 17:34:53.0</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The status of the physical migration to the cloud task.</p>
         */
        @NameInMap("DataCloudStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataCloudStatus dataCloudStatus;

        /**
         * <p>The status of the ETL task.</p>
         * <blockquote>
         * <p>This parameter collection is returned only after an ETL task is configured.</p>
         * </blockquote>
         */
        @NameInMap("DataEtlStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataEtlStatus dataEtlStatus;

        /**
         * <p>The status of full data migration or initial data synchronization.</p>
         */
        @NameInMap("DataInitializationStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataInitializationStatus dataInitializationStatus;

        /**
         * <p>The status of incremental data migration or synchronization.</p>
         */
        @NameInMap("DataSynchronizationStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataSynchronizationStatus dataSynchronizationStatus;

        /**
         * <p>The migration, synchronization, or change tracking objects. For more information about the definitions, see <a href="https://help.aliyun.com/document_detail/209545.html">Description of migration, synchronization, or change tracking objects</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dtstestdata&quot;: { &quot;name&quot;: &quot;dtstestdata&quot;, &quot;all&quot;: true }}</p>
         */
        @NameInMap("DbObject")
        public String dbObject;

        /**
         * <p>The ID of the dedicated DTS cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dtscluster_ft7y3**********</p>
         */
        @NameInMap("DedicatedClusterId")
        public String dedicatedClusterId;

        /**
         * <p>The latency of incremental data migration or synchronization.</p>
         * <blockquote>
         * <p>If you query a data migration task, the unit of this parameter is milliseconds. If you query a data synchronization task, the unit of this parameter is seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <p>The connection information of the destination instance.</p>
         */
        @NameInMap("DestinationEndpoint")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint destinationEndpoint;

        /**
         * <p>The environment tag of the DTS instance. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>online</strong>: Online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("DtsBisLabel")
        public String dtsBisLabel;

        /**
         * <p>The ID of the data migration, data synchronization, or subscribe instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsi03e3zty16i****</p>
         */
        @NameInMap("DtsInstanceID")
        public String dtsInstanceID;

        /**
         * <p>The link specifications.</p>
         * <blockquote>
         * <p>For more information about the specifications and performance tests of each link, see <a href="https://help.aliyun.com/document_detail/26606.html">Specifications for data migration links</a> and <a href="https://help.aliyun.com/document_detail/26605.html">Specifications for data synchronization links</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>large</p>
         */
        @NameInMap("DtsJobClass")
        public String dtsJobClass;

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong>: Forward.</li>
         * <li><strong>Reverse</strong>: Reverse.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when the topology of the data synchronization instance is two-way synchronization.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        @NameInMap("DtsJobDirection")
        public String dtsJobDirection;

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>i03e3zty16i****</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The name of the DTS task.</p>
         * 
         * <strong>example:</strong>
         * <p>TestNg_polardb_cn-beijing_cn-beijing_polardb</p>
         */
        @NameInMap("DtsJobName")
        public String dtsJobName;

        /**
         * <p>The used resources of the dedicated DTS cluster. Unit: DU.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("DuUsage")
        public Long duUsage;

        /**
         * <p>The end backup timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-26T14:03:21Z</p>
         */
        @NameInMap("EndTimestamp")
        public String endTimestamp;

        /**
         * <p>The error details.</p>
         */
        @NameInMap("ErrorDetails")
        public java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListErrorDetails> errorDetails;

        /**
         * <p>The error message for a failed task.</p>
         * 
         * <strong>example:</strong>
         * <p>The deviceName is empty.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The safe checkpoint of the ETL task.</p>
         * 
         * <strong>example:</strong>
         * <p>1610540493</p>
         */
        @NameInMap("EtlSafeCheckpoint")
        public String etlSafeCheckpoint;

        /**
         * <p>The expiration time of the instance, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is in UTC.</p>
         * <blockquote>
         * <p>This parameter is returned only when the <strong>PayType</strong> parameter is set to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-03-16T08:01:19Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The status information of full data verification.</p>
         */
        @NameInMap("FullDataCheckStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListFullDataCheckStatus fullDataCheckStatus;

        /**
         * <p>The status information of incremental data verification.</p>
         */
        @NameInMap("IncDataCheckStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListIncDataCheckStatus incDataCheckStatus;

        /**
         * <p>The DTS task type.</p>
         * 
         * <strong>example:</strong>
         * <p>SYNC</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The DU upper limit of the serverless instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        @NameInMap("MaxDu")
        public Double maxDu;

        /**
         * <p>The used memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MemUsage")
        public String memUsage;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>dts.retry.err.0046</p>
         */
        @NameInMap("MigrationErrCode")
        public String migrationErrCode;

        /**
         * <p>The ID of the help document for the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>462133</p>
         */
        @NameInMap("MigrationErrHelpDocId")
        public String migrationErrHelpDocId;

        /**
         * <p>The key of the help document for the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-RETRY-ERR-0046</p>
         */
        @NameInMap("MigrationErrHelpDocKey")
        public String migrationErrHelpDocKey;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>dts.retry.err.0046.msg</p>
         */
        @NameInMap("MigrationErrMsg")
        public String migrationErrMsg;

        /**
         * <p>The type of the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ForeignKey</p>
         */
        @NameInMap("MigrationErrType")
        public String migrationErrType;

        /**
         * <p>The error workaround.</p>
         * 
         * <strong>example:</strong>
         * <p>dts.retry.err.0046.workaround</p>
         */
        @NameInMap("MigrationErrWorkaround")
        public String migrationErrWorkaround;

        /**
         * <p>The migration type or initial synchronization type.</p>
         */
        @NameInMap("MigrationMode")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListMigrationMode migrationMode;

        /**
         * <p>The minimum number of DUs for the serverless instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinDu")
        public Double minDu;

        /**
         * <p>The source of the task. Valid values:</p>
         * <ul>
         * <li><strong>PTS task</strong></li>
         * <li><strong>DMS task</strong></li>
         * <li><strong>DTS task</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DTS</p>
         */
        @NameInMap("OriginType")
        public String originType;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: Subscription.</li>
         * <li><strong>PostPaid</strong>: Pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The performance information of the migration or synchronization link.</p>
         */
        @NameInMap("Performance")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPerformance performance;

        /**
         * <p>The precheck status.</p>
         */
        @NameInMap("PrecheckStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatus precheckStatus;

        /**
         * <p>The reserved parameter for DTS. The value is a JSON string. You can specify this parameter to meet special requirements, such as whether to automatically start the precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved parameter description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;srcHostPorts\&quot;:\&quot;\&quot;,\&quot;whitelist.dms.online.ddl.enable\&quot;:false,\&quot;filterDDL\&quot;:false,\&quot;sqlparser.dms.original.ddl\&quot;:true,\&quot;srcOracleType\&quot;:\&quot;sid\&quot;,\&quot;maxRetryTime\&quot;:43200,\&quot;destSSL\&quot;:\&quot;0\&quot;,\&quot;destOracleType\&quot;:\&quot;sid\&quot;,\&quot;srcSSL\&quot;:\&quot;0\&quot;,\&quot;dbListCaseChangeMode\&quot;:\&quot;default\&quot;,\&quot;SourceEngineVersion\&quot;:\&quot;8.0.18\&quot;,\&quot;srcNetType\&quot;:\&quot;VPC\&quot;,\&quot;destNetType\&quot;:\&quot;VPC\&quot;,\&quot;srcVpcNetMappingInst\&quot;:\&quot;172.16.1**.<strong>:10803\&quot;,\&quot;destVpcNetMappingInst\&quot;:\&quot;172.16.1</strong>.**:11077\&quot;,\&quot;useJobTask\&quot;:\&quot;1\&quot;}</p>
         */
        @NameInMap("Reserved")
        public String reserved;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>default resource group</p>
         */
        @NameInMap("ResourceGroupDisplayName")
        public String resourceGroupDisplayName;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The retry state of DTS due to a task exception.</p>
         */
        @NameInMap("RetryState")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState retryState;

        /**
         * <p>The execution details of the reverse synchronization task.</p>
         * <blockquote>
         * <p>This parameter collection is returned only when the task is a data synchronization task and the topology type is two-way.</p>
         * </blockquote>
         */
        @NameInMap("ReverseJob")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob reverseJob;

        /**
         * <p>The connection information of the source instance.</p>
         */
        @NameInMap("SourceEndpoint")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint sourceEndpoint;

        /**
         * <p>The DTS instance status. Valid values:</p>
         * <p>Status of a data migration node:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The node is not started.</li>
         * <li><strong>Prechecking</strong>: The precheck is in progress.</li>
         * <li><strong>PrecheckFailed</strong>: The precheck failed.</li>
         * <li><strong>PreCheckPass</strong>: The precheck passed.</li>
         * <li><strong>NotConfigured</strong>: The node is not configured.</li>
         * <li><strong>Migrating</strong>: The migration is in progress.</li>
         * <li><strong>Suspending</strong>: The node is being paused.</li>
         * <li><strong>MigrationFailed</strong>: The migration failed.</li>
         * <li><strong>Finished</strong>: The node is completed.</li>
         * <li><strong>Retrying</strong>: The node is being retried.</li>
         * <li><strong>Upgrade</strong>: The node is being upgraded.</li>
         * <li><strong>Locked</strong>: The node is locked.</li>
         * <li><strong>Downgrade</strong>: The node is being downgraded.</li>
         * </ul>
         * <p>Status of a data synchronization node:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The node is not started.</li>
         * <li><strong>Prechecking</strong>: The precheck is in progress.</li>
         * <li><strong>PrecheckFailed</strong>: The precheck failed.</li>
         * <li><strong>PreCheckPass</strong>: The precheck passed.</li>
         * <li><strong>NotConfigured</strong>: The node is not configured.</li>
         * <li><strong>Initializing</strong>: Initial synchronization is in progress.</li>
         * <li><strong>InitializeFailed</strong>: Initial synchronization failed.</li>
         * <li><strong>Synchronizing</strong>: Data synchronization is in progress.</li>
         * <li><strong>Failed</strong>: The synchronization failed.</li>
         * <li><strong>Suspending</strong>: The node is being paused.</li>
         * <li><strong>Modifying</strong>: The synchronization objects are being modified.</li>
         * <li><strong>Finished</strong>: The node is completed.</li>
         * <li><strong>Retrying</strong>: The node is being retried.</li>
         * <li><strong>Upgrade</strong>: The node is being upgraded.</li>
         * <li><strong>Locked</strong>: The node is locked.</li>
         * <li><strong>Downgrade</strong>: The node is being downgraded.</li>
         * </ul>
         * <p>Status of a subscribe node:</p>
         * <ul>
         * <li><strong>NotConfigured</strong>: The node is not configured.</li>
         * <li><strong>NotStarted</strong>: The node is not started.</li>
         * <li><strong>Prechecking</strong>: The precheck is in progress.</li>
         * <li><strong>PrecheckFailed</strong>: The precheck failed.</li>
         * <li><strong>PreCheckPass</strong>: The precheck passed.</li>
         * <li><strong>Starting</strong>: The node is being started.</li>
         * <li><strong>Normal</strong>: The node is running normally.</li>
         * <li><strong>Retrying</strong>: The node is being retried.</li>
         * <li><strong>Abnormal</strong>: The node is abnormal.</li>
         * <li><strong>Upgrade</strong>: The node is being upgraded.</li>
         * <li><strong>Locked</strong>: The node is locked.</li>
         * <li><strong>Downgrade</strong>: The node is being downgraded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status of schema migration or initial schema synchronization.</p>
         */
        @NameInMap("StructureInitializationStatus")
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListStructureInitializationStatus structureInitializationStatus;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("TagList")
        public java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListTagList> tagList;

        public static DescribeGadInstanceDtsMembersResponseBodyDtsJobList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstanceDtsMembersResponseBodyDtsJobList self = new DescribeGadInstanceDtsMembersResponseBodyDtsJobList();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setBeginTimestamp(String beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
            return this;
        }
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setConsumptionClient(String consumptionClient) {
            this.consumptionClient = consumptionClient;
            return this;
        }
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setCpuUsage(String cpuUsage) {
            this.cpuUsage = cpuUsage;
            return this;
        }
        public String getCpuUsage() {
            return this.cpuUsage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDataCloudStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataCloudStatus dataCloudStatus) {
            this.dataCloudStatus = dataCloudStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataCloudStatus getDataCloudStatus() {
            return this.dataCloudStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDataEtlStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataEtlStatus dataEtlStatus) {
            this.dataEtlStatus = dataEtlStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDataInitializationStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDataSynchronizationStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }
        public String getDbObject() {
            return this.dbObject;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDedicatedClusterId(String dedicatedClusterId) {
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }
        public String getDedicatedClusterId() {
            return this.dedicatedClusterId;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDestinationEndpoint(DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDtsBisLabel(String dtsBisLabel) {
            this.dtsBisLabel = dtsBisLabel;
            return this;
        }
        public String getDtsBisLabel() {
            return this.dtsBisLabel;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setDuUsage(Long duUsage) {
            this.duUsage = duUsage;
            return this;
        }
        public Long getDuUsage() {
            return this.duUsage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setEndTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setErrorDetails(java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setEtlSafeCheckpoint(String etlSafeCheckpoint) {
            this.etlSafeCheckpoint = etlSafeCheckpoint;
            return this;
        }
        public String getEtlSafeCheckpoint() {
            return this.etlSafeCheckpoint;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setFullDataCheckStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListFullDataCheckStatus fullDataCheckStatus) {
            this.fullDataCheckStatus = fullDataCheckStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListFullDataCheckStatus getFullDataCheckStatus() {
            return this.fullDataCheckStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setIncDataCheckStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListIncDataCheckStatus incDataCheckStatus) {
            this.incDataCheckStatus = incDataCheckStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListIncDataCheckStatus getIncDataCheckStatus() {
            return this.incDataCheckStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setMaxDu(Double maxDu) {
            this.maxDu = maxDu;
            return this;
        }
        public Double getMaxDu() {
            return this.maxDu;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setMemUsage(String memUsage) {
            this.memUsage = memUsage;
            return this;
        }
        public String getMemUsage() {
            return this.memUsage;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setMigrationErrCode(String migrationErrCode) {
            this.migrationErrCode = migrationErrCode;
            return this;
        }
        public String getMigrationErrCode() {
            return this.migrationErrCode;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setMigrationErrHelpDocId(String migrationErrHelpDocId) {
            this.migrationErrHelpDocId = migrationErrHelpDocId;
            return this;
        }
        public String getMigrationErrHelpDocId() {
            return this.migrationErrHelpDocId;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setMigrationErrHelpDocKey(String migrationErrHelpDocKey) {
            this.migrationErrHelpDocKey = migrationErrHelpDocKey;
            return this;
        }
        public String getMigrationErrHelpDocKey() {
            return this.migrationErrHelpDocKey;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setMigrationErrMsg(String migrationErrMsg) {
            this.migrationErrMsg = migrationErrMsg;
            return this;
        }
        public String getMigrationErrMsg() {
            return this.migrationErrMsg;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setMigrationErrType(String migrationErrType) {
            this.migrationErrType = migrationErrType;
            return this;
        }
        public String getMigrationErrType() {
            return this.migrationErrType;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setMigrationErrWorkaround(String migrationErrWorkaround) {
            this.migrationErrWorkaround = migrationErrWorkaround;
            return this;
        }
        public String getMigrationErrWorkaround() {
            return this.migrationErrWorkaround;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setMigrationMode(DescribeGadInstanceDtsMembersResponseBodyDtsJobListMigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setMinDu(Double minDu) {
            this.minDu = minDu;
            return this;
        }
        public Double getMinDu() {
            return this.minDu;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setOriginType(String originType) {
            this.originType = originType;
            return this;
        }
        public String getOriginType() {
            return this.originType;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setPerformance(DescribeGadInstanceDtsMembersResponseBodyDtsJobListPerformance performance) {
            this.performance = performance;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPerformance getPerformance() {
            return this.performance;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setPrecheckStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setReserved(String reserved) {
            this.reserved = reserved;
            return this;
        }
        public String getReserved() {
            return this.reserved;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setResourceGroupDisplayName(String resourceGroupDisplayName) {
            this.resourceGroupDisplayName = resourceGroupDisplayName;
            return this;
        }
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setRetryState(DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState retryState) {
            this.retryState = retryState;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListRetryState getRetryState() {
            return this.retryState;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setReverseJob(DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob reverseJob) {
            this.reverseJob = reverseJob;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListReverseJob getReverseJob() {
            return this.reverseJob;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setSourceEndpoint(DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setStructureInitializationStatus(DescribeGadInstanceDtsMembersResponseBodyDtsJobListStructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }
        public DescribeGadInstanceDtsMembersResponseBodyDtsJobListStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public DescribeGadInstanceDtsMembersResponseBodyDtsJobList setTagList(java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeGadInstanceDtsMembersResponseBodyDtsJobListTagList> getTagList() {
            return this.tagList;
        }

    }

}
