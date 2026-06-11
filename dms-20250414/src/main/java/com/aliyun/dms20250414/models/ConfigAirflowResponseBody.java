// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ConfigAirflowResponseBody extends TeaModel {
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
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance not found.</p>
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
     * <p>Information about the Airflow instance.</p>
     */
    @NameInMap("Root")
    public ConfigAirflowResponseBodyRoot root;

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

    public static ConfigAirflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigAirflowResponseBody self = new ConfigAirflowResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigAirflowResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ConfigAirflowResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ConfigAirflowResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ConfigAirflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfigAirflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfigAirflowResponseBody setRoot(ConfigAirflowResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public ConfigAirflowResponseBodyRoot getRoot() {
        return this.root;
    }

    public ConfigAirflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ConfigAirflowResponseBodyRoot extends TeaModel {
        /**
         * <p>The ID of the Airflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>af-7a6ygsh80dx1jn****</p>
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
         * <p>The Airflow instance specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>SMALL</p>
         */
        @NameInMap("AppSpec")
        public String appSpec;

        /**
         * <p>The application type.</p>
         * 
         * <strong>example:</strong>
         * <p>AIRFLOW</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The custom configuration.</p>
         */
        @NameInMap("CustomAirflowCfg")
        public java.util.List<String> customAirflowCfg;

        /**
         * <p>The DAG directory that Airflow scans.</p>
         * 
         * <strong>example:</strong>
         * <p>default/dags</p>
         */
        @NameInMap("DagsDir")
        public String dagsDir;

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
         * <p>test airflow</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The timestamp when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-12T05:46:01.000+0000</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

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
         * <p>The configuration file for dependencies.</p>
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
         * <p>The script that runs before Airflow starts.</p>
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
         * <p>vsw-bp1931trfxkvf74v****</p>
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
         * <p>The number of worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WorkerServerlessReplicas")
        public Integer workerServerlessReplicas;

        /**
         * <p>The DMS workspace ID.</p>
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

        public static ConfigAirflowResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            ConfigAirflowResponseBodyRoot self = new ConfigAirflowResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public ConfigAirflowResponseBodyRoot setAirflowId(String airflowId) {
            this.airflowId = airflowId;
            return this;
        }
        public String getAirflowId() {
            return this.airflowId;
        }

        public ConfigAirflowResponseBodyRoot setAirflowName(String airflowName) {
            this.airflowName = airflowName;
            return this;
        }
        public String getAirflowName() {
            return this.airflowName;
        }

        public ConfigAirflowResponseBodyRoot setAppSpec(String appSpec) {
            this.appSpec = appSpec;
            return this;
        }
        public String getAppSpec() {
            return this.appSpec;
        }

        public ConfigAirflowResponseBodyRoot setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ConfigAirflowResponseBodyRoot setCustomAirflowCfg(java.util.List<String> customAirflowCfg) {
            this.customAirflowCfg = customAirflowCfg;
            return this;
        }
        public java.util.List<String> getCustomAirflowCfg() {
            return this.customAirflowCfg;
        }

        public ConfigAirflowResponseBodyRoot setDagsDir(String dagsDir) {
            this.dagsDir = dagsDir;
            return this;
        }
        public String getDagsDir() {
            return this.dagsDir;
        }

        public ConfigAirflowResponseBodyRoot setDeployErrorMsg(String deployErrorMsg) {
            this.deployErrorMsg = deployErrorMsg;
            return this;
        }
        public String getDeployErrorMsg() {
            return this.deployErrorMsg;
        }

        public ConfigAirflowResponseBodyRoot setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ConfigAirflowResponseBodyRoot setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ConfigAirflowResponseBodyRoot setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public ConfigAirflowResponseBodyRoot setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public ConfigAirflowResponseBodyRoot setPluginsDir(String pluginsDir) {
            this.pluginsDir = pluginsDir;
            return this;
        }
        public String getPluginsDir() {
            return this.pluginsDir;
        }

        public ConfigAirflowResponseBodyRoot setRequirementFile(String requirementFile) {
            this.requirementFile = requirementFile;
            return this;
        }
        public String getRequirementFile() {
            return this.requirementFile;
        }

        public ConfigAirflowResponseBodyRoot setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ConfigAirflowResponseBodyRoot setStartupFile(String startupFile) {
            this.startupFile = startupFile;
            return this;
        }
        public String getStartupFile() {
            return this.startupFile;
        }

        public ConfigAirflowResponseBodyRoot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ConfigAirflowResponseBodyRoot setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ConfigAirflowResponseBodyRoot setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ConfigAirflowResponseBodyRoot setWorkerServerlessReplicas(Integer workerServerlessReplicas) {
            this.workerServerlessReplicas = workerServerlessReplicas;
            return this;
        }
        public Integer getWorkerServerlessReplicas() {
            return this.workerServerlessReplicas;
        }

        public ConfigAirflowResponseBodyRoot setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ConfigAirflowResponseBodyRoot setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
