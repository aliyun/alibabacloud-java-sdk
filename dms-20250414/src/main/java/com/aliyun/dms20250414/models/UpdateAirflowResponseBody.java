// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateAirflowResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>NOT_FOUND</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Unknown error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the updated Airflow instance.</p>
     */
    @NameInMap("Root")
    public UpdateAirflowResponseBodyRoot root;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateAirflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAirflowResponseBody self = new UpdateAirflowResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAirflowResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateAirflowResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateAirflowResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateAirflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAirflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAirflowResponseBody setRoot(UpdateAirflowResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public UpdateAirflowResponseBodyRoot getRoot() {
        return this.root;
    }

    public UpdateAirflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateAirflowResponseBodyRoot extends TeaModel {
        /**
         * <p>The name of the Airflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test airflow</p>
         */
        @NameInMap("AirflowName")
        public String airflowName;

        /**
         * <p>The version of Airflow.</p>
         * 
         * <strong>example:</strong>
         * <p>3.1</p>
         */
        @NameInMap("AirflowVersion")
        public String airflowVersion;

        /**
         * <p>The instance specification.</p>
         * 
         * <strong>example:</strong>
         * <p>SMALL</p>
         */
        @NameInMap("AppSpec")
        public String appSpec;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>AIRFLOW</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>A list of custom configuration items.</p>
         */
        @NameInMap("CustomAirflowCfg")
        public java.util.List<String> customAirflowCfg;

        /**
         * <p>The directory where DAGs are scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>default/dags</p>
         */
        @NameInMap("DagsDir")
        public String dagsDir;

        /**
         * <p>A data mount item.</p>
         */
        @NameInMap("DataMountInfoList")
        public java.util.List<DataMountInfo> dataMountInfoList;

        /**
         * <p>The error message returned upon deployment failure.</p>
         * 
         * <strong>example:</strong>
         * <p>quota exists</p>
         */
        @NameInMap("DeployErrorMsg")
        public String deployErrorMsg;

        /**
         * <p>The description of the Airflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>order schedule</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether serverless mode is enabled.</p>
         */
        @NameInMap("EnableServerless")
        public Boolean enableServerless;

        /**
         * <p>The environment variables.</p>
         * 
         * <strong>example:</strong>
         * <p>k=v</p>
         */
        @NameInMap("Environments")
        public String environments;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-07T15:10:32+08:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The graceful shutdown timeout, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("GracefulShutdownTimeout")
        public Integer gracefulShutdownTimeout;

        /**
         * <p>The name of the Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>osstest</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <p>The path in OSS where logs are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>/airflow</p>
         */
        @NameInMap("OssPath")
        public String ossPath;

        /**
         * <p>The directory where Airflow plugins are scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>default/plugins</p>
         */
        @NameInMap("PluginsDir")
        public String pluginsDir;

        /**
         * <p>The path to the Python requirements file.</p>
         * 
         * <strong>example:</strong>
         * <p>default/requirements.txt</p>
         */
        @NameInMap("RequirementFile")
        public String requirementFile;

        /**
         * <p>The Python package requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>jieba==0.42</p>
         */
        @NameInMap("Requirements")
        public String requirements;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze1nak7h0alg1w5****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The startup script for the Airflow container.</p>
         * 
         * <strong>example:</strong>
         * <p>default/startup.sh</p>
         */
        @NameInMap("StartupFile")
        public String startupFile;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>DEPLOYED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The Airflow instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>af-xxx</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-hp3hyga33aur8tj36****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp16ko44pgciwv0****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The number of worker node replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WorkerServerlessReplicas")
        public Integer workerServerlessReplicas;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86302423828****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static UpdateAirflowResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            UpdateAirflowResponseBodyRoot self = new UpdateAirflowResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public UpdateAirflowResponseBodyRoot setAirflowName(String airflowName) {
            this.airflowName = airflowName;
            return this;
        }
        public String getAirflowName() {
            return this.airflowName;
        }

        public UpdateAirflowResponseBodyRoot setAirflowVersion(String airflowVersion) {
            this.airflowVersion = airflowVersion;
            return this;
        }
        public String getAirflowVersion() {
            return this.airflowVersion;
        }

        public UpdateAirflowResponseBodyRoot setAppSpec(String appSpec) {
            this.appSpec = appSpec;
            return this;
        }
        public String getAppSpec() {
            return this.appSpec;
        }

        public UpdateAirflowResponseBodyRoot setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public UpdateAirflowResponseBodyRoot setCustomAirflowCfg(java.util.List<String> customAirflowCfg) {
            this.customAirflowCfg = customAirflowCfg;
            return this;
        }
        public java.util.List<String> getCustomAirflowCfg() {
            return this.customAirflowCfg;
        }

        public UpdateAirflowResponseBodyRoot setDagsDir(String dagsDir) {
            this.dagsDir = dagsDir;
            return this;
        }
        public String getDagsDir() {
            return this.dagsDir;
        }

        public UpdateAirflowResponseBodyRoot setDataMountInfoList(java.util.List<DataMountInfo> dataMountInfoList) {
            this.dataMountInfoList = dataMountInfoList;
            return this;
        }
        public java.util.List<DataMountInfo> getDataMountInfoList() {
            return this.dataMountInfoList;
        }

        public UpdateAirflowResponseBodyRoot setDeployErrorMsg(String deployErrorMsg) {
            this.deployErrorMsg = deployErrorMsg;
            return this;
        }
        public String getDeployErrorMsg() {
            return this.deployErrorMsg;
        }

        public UpdateAirflowResponseBodyRoot setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateAirflowResponseBodyRoot setEnableServerless(Boolean enableServerless) {
            this.enableServerless = enableServerless;
            return this;
        }
        public Boolean getEnableServerless() {
            return this.enableServerless;
        }

        public UpdateAirflowResponseBodyRoot setEnvironments(String environments) {
            this.environments = environments;
            return this;
        }
        public String getEnvironments() {
            return this.environments;
        }

        public UpdateAirflowResponseBodyRoot setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public UpdateAirflowResponseBodyRoot setGracefulShutdownTimeout(Integer gracefulShutdownTimeout) {
            this.gracefulShutdownTimeout = gracefulShutdownTimeout;
            return this;
        }
        public Integer getGracefulShutdownTimeout() {
            return this.gracefulShutdownTimeout;
        }

        public UpdateAirflowResponseBodyRoot setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public UpdateAirflowResponseBodyRoot setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public UpdateAirflowResponseBodyRoot setPluginsDir(String pluginsDir) {
            this.pluginsDir = pluginsDir;
            return this;
        }
        public String getPluginsDir() {
            return this.pluginsDir;
        }

        public UpdateAirflowResponseBodyRoot setRequirementFile(String requirementFile) {
            this.requirementFile = requirementFile;
            return this;
        }
        public String getRequirementFile() {
            return this.requirementFile;
        }

        public UpdateAirflowResponseBodyRoot setRequirements(String requirements) {
            this.requirements = requirements;
            return this;
        }
        public String getRequirements() {
            return this.requirements;
        }

        public UpdateAirflowResponseBodyRoot setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateAirflowResponseBodyRoot setStartupFile(String startupFile) {
            this.startupFile = startupFile;
            return this;
        }
        public String getStartupFile() {
            return this.startupFile;
        }

        public UpdateAirflowResponseBodyRoot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateAirflowResponseBodyRoot setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public UpdateAirflowResponseBodyRoot setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateAirflowResponseBodyRoot setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public UpdateAirflowResponseBodyRoot setWorkerServerlessReplicas(Integer workerServerlessReplicas) {
            this.workerServerlessReplicas = workerServerlessReplicas;
            return this;
        }
        public Integer getWorkerServerlessReplicas() {
            return this.workerServerlessReplicas;
        }

        public UpdateAirflowResponseBodyRoot setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public UpdateAirflowResponseBodyRoot setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
