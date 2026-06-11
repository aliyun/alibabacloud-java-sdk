// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAirflowResponseBody extends TeaModel {
    /**
     * <p>Details of the access denial.</p>
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
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Airflow data dictionary.</p>
     */
    @NameInMap("Root")
    public CreateAirflowResponseBodyRoot root;

    /**
     * <p>Indicates whether the request succeeded. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request succeeded.</p>
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

    public static CreateAirflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAirflowResponseBody self = new CreateAirflowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAirflowResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateAirflowResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateAirflowResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateAirflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAirflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAirflowResponseBody setRoot(CreateAirflowResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public CreateAirflowResponseBodyRoot getRoot() {
        return this.root;
    }

    public CreateAirflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAirflowResponseBodyRoot extends TeaModel {
        /**
         * <p>The ID of the Airflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>af-****</p>
         */
        @NameInMap("AirflowId")
        public String airflowId;

        /**
         * <p>The name of the Airflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testairflow</p>
         */
        @NameInMap("AirflowName")
        public String airflowName;

        /**
         * <p>The Airflow version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.1</p>
         */
        @NameInMap("AirflowVersion")
        public String airflowVersion;

        /**
         * <p>The specifications of the Airflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>SMALL</p>
         */
        @NameInMap("AppSpec")
        public String appSpec;

        /**
         * <p>The application type. This value is always airflow.</p>
         * 
         * <strong>example:</strong>
         * <p>airflow</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>Custom Airflow configurations.</p>
         */
        @NameInMap("CustomAirflowCfg")
        public java.util.List<String> customAirflowCfg;

        /**
         * <p>The directory that Airflow scans for DAGs.</p>
         * 
         * <strong>example:</strong>
         * <p>default/dags</p>
         */
        @NameInMap("DagsDir")
        public String dagsDir;

        /**
         * <p>A list of data mount configurations.</p>
         */
        @NameInMap("DataMountInfoList")
        public java.util.List<DataMountInfo> dataMountInfoList;

        /**
         * <p>The deployment error message.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc not found</p>
         */
        @NameInMap("DeployErrorMsg")
        public String deployErrorMsg;

        /**
         * <p>The description of the Airflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>order scheduler</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether to enable serverless workers.</p>
         */
        @NameInMap("EnableServerless")
        public Boolean enableServerless;

        /**
         * <p>The time the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-12T05:46:01.000+0000</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The timeout period for a graceful shutdown, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("GracefulShutdownTimeout")
        public Integer gracefulShutdownTimeout;

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-test</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <p>The OSS path.</p>
         * 
         * <strong>example:</strong>
         * <p>/airflow</p>
         */
        @NameInMap("OssPath")
        public String ossPath;

        /**
         * <p>The plugin directory that Airflow scans.</p>
         * 
         * <strong>example:</strong>
         * <p>default/plugins</p>
         */
        @NameInMap("PluginsDir")
        public String pluginsDir;

        /**
         * <p>The path to the requirements file.</p>
         * 
         * <strong>example:</strong>
         * <p>default/requirements.txt</p>
         */
        @NameInMap("RequirementFile")
        public String requirementFile;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze1nak7h0alg1xxx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The file that is loaded when the Airflow instance starts. You can use this file to set environment variables.</p>
         * 
         * <strong>example:</strong>
         * <p>default/startup.sh</p>
         */
        @NameInMap("StartupFile")
        public String startupFile;

        /**
         * <p>The status of the Airflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>DEPLOYING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The VSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-8vbaf073jawozfpbg****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf63r6coyiw9o5gf****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The number of scaled-out worker nodes.</p>
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
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateAirflowResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            CreateAirflowResponseBodyRoot self = new CreateAirflowResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public CreateAirflowResponseBodyRoot setAirflowId(String airflowId) {
            this.airflowId = airflowId;
            return this;
        }
        public String getAirflowId() {
            return this.airflowId;
        }

        public CreateAirflowResponseBodyRoot setAirflowName(String airflowName) {
            this.airflowName = airflowName;
            return this;
        }
        public String getAirflowName() {
            return this.airflowName;
        }

        public CreateAirflowResponseBodyRoot setAirflowVersion(String airflowVersion) {
            this.airflowVersion = airflowVersion;
            return this;
        }
        public String getAirflowVersion() {
            return this.airflowVersion;
        }

        public CreateAirflowResponseBodyRoot setAppSpec(String appSpec) {
            this.appSpec = appSpec;
            return this;
        }
        public String getAppSpec() {
            return this.appSpec;
        }

        public CreateAirflowResponseBodyRoot setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public CreateAirflowResponseBodyRoot setCustomAirflowCfg(java.util.List<String> customAirflowCfg) {
            this.customAirflowCfg = customAirflowCfg;
            return this;
        }
        public java.util.List<String> getCustomAirflowCfg() {
            return this.customAirflowCfg;
        }

        public CreateAirflowResponseBodyRoot setDagsDir(String dagsDir) {
            this.dagsDir = dagsDir;
            return this;
        }
        public String getDagsDir() {
            return this.dagsDir;
        }

        public CreateAirflowResponseBodyRoot setDataMountInfoList(java.util.List<DataMountInfo> dataMountInfoList) {
            this.dataMountInfoList = dataMountInfoList;
            return this;
        }
        public java.util.List<DataMountInfo> getDataMountInfoList() {
            return this.dataMountInfoList;
        }

        public CreateAirflowResponseBodyRoot setDeployErrorMsg(String deployErrorMsg) {
            this.deployErrorMsg = deployErrorMsg;
            return this;
        }
        public String getDeployErrorMsg() {
            return this.deployErrorMsg;
        }

        public CreateAirflowResponseBodyRoot setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAirflowResponseBodyRoot setEnableServerless(Boolean enableServerless) {
            this.enableServerless = enableServerless;
            return this;
        }
        public Boolean getEnableServerless() {
            return this.enableServerless;
        }

        public CreateAirflowResponseBodyRoot setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public CreateAirflowResponseBodyRoot setGracefulShutdownTimeout(Integer gracefulShutdownTimeout) {
            this.gracefulShutdownTimeout = gracefulShutdownTimeout;
            return this;
        }
        public Integer getGracefulShutdownTimeout() {
            return this.gracefulShutdownTimeout;
        }

        public CreateAirflowResponseBodyRoot setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public CreateAirflowResponseBodyRoot setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public CreateAirflowResponseBodyRoot setPluginsDir(String pluginsDir) {
            this.pluginsDir = pluginsDir;
            return this;
        }
        public String getPluginsDir() {
            return this.pluginsDir;
        }

        public CreateAirflowResponseBodyRoot setRequirementFile(String requirementFile) {
            this.requirementFile = requirementFile;
            return this;
        }
        public String getRequirementFile() {
            return this.requirementFile;
        }

        public CreateAirflowResponseBodyRoot setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateAirflowResponseBodyRoot setStartupFile(String startupFile) {
            this.startupFile = startupFile;
            return this;
        }
        public String getStartupFile() {
            return this.startupFile;
        }

        public CreateAirflowResponseBodyRoot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAirflowResponseBodyRoot setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateAirflowResponseBodyRoot setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateAirflowResponseBodyRoot setWorkerServerlessReplicas(Integer workerServerlessReplicas) {
            this.workerServerlessReplicas = workerServerlessReplicas;
            return this;
        }
        public Integer getWorkerServerlessReplicas() {
            return this.workerServerlessReplicas;
        }

        public CreateAirflowResponseBodyRoot setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public CreateAirflowResponseBodyRoot setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
