// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAirflowResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
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
     * <p>E0D21075-CD3E-4D98-8264-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Root")
    public GetAirflowResponseBodyRoot root;

    /**
     * <p>Indicates whether the request was successful. The following values are returned:</p>
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

    public static GetAirflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAirflowResponseBody self = new GetAirflowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAirflowResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAirflowResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAirflowResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAirflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAirflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAirflowResponseBody setRoot(GetAirflowResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public GetAirflowResponseBodyRoot getRoot() {
        return this.root;
    }

    public GetAirflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAirflowResponseBodyRoot extends TeaModel {
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
         * <p>The specifications of the Airflow instance.</p>
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
         * <p>The custom configurations.</p>
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
         * <p>Deployed</p>
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
         * <p>The time when the instance was created.</p>
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
         * <p>osstest</p>
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
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The path to the Python dependencies file (requirements.txt).</p>
         * 
         * <strong>example:</strong>
         * <p>default/requirements.txt</p>
         */
        @NameInMap("RequirementFile")
        public String requirementFile;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze9gj646bkv****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The startup script that runs before Airflow starts.</p>
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
         * <p>DEPLOYED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1931trfxkvf74v****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zevqv4obraqd5p****</p>
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
         * <p>The ID of the DMS workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>8630242382****</p>
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

        public static GetAirflowResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            GetAirflowResponseBodyRoot self = new GetAirflowResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public GetAirflowResponseBodyRoot setAirflowId(String airflowId) {
            this.airflowId = airflowId;
            return this;
        }
        public String getAirflowId() {
            return this.airflowId;
        }

        public GetAirflowResponseBodyRoot setAirflowName(String airflowName) {
            this.airflowName = airflowName;
            return this;
        }
        public String getAirflowName() {
            return this.airflowName;
        }

        public GetAirflowResponseBodyRoot setAppSpec(String appSpec) {
            this.appSpec = appSpec;
            return this;
        }
        public String getAppSpec() {
            return this.appSpec;
        }

        public GetAirflowResponseBodyRoot setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetAirflowResponseBodyRoot setCustomAirflowCfg(java.util.List<String> customAirflowCfg) {
            this.customAirflowCfg = customAirflowCfg;
            return this;
        }
        public java.util.List<String> getCustomAirflowCfg() {
            return this.customAirflowCfg;
        }

        public GetAirflowResponseBodyRoot setDagsDir(String dagsDir) {
            this.dagsDir = dagsDir;
            return this;
        }
        public String getDagsDir() {
            return this.dagsDir;
        }

        public GetAirflowResponseBodyRoot setDeployErrorMsg(String deployErrorMsg) {
            this.deployErrorMsg = deployErrorMsg;
            return this;
        }
        public String getDeployErrorMsg() {
            return this.deployErrorMsg;
        }

        public GetAirflowResponseBodyRoot setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAirflowResponseBodyRoot setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public GetAirflowResponseBodyRoot setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public GetAirflowResponseBodyRoot setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public GetAirflowResponseBodyRoot setPluginsDir(String pluginsDir) {
            this.pluginsDir = pluginsDir;
            return this;
        }
        public String getPluginsDir() {
            return this.pluginsDir;
        }

        public GetAirflowResponseBodyRoot setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAirflowResponseBodyRoot setRequirementFile(String requirementFile) {
            this.requirementFile = requirementFile;
            return this;
        }
        public String getRequirementFile() {
            return this.requirementFile;
        }

        public GetAirflowResponseBodyRoot setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetAirflowResponseBodyRoot setStartupFile(String startupFile) {
            this.startupFile = startupFile;
            return this;
        }
        public String getStartupFile() {
            return this.startupFile;
        }

        public GetAirflowResponseBodyRoot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAirflowResponseBodyRoot setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetAirflowResponseBodyRoot setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetAirflowResponseBodyRoot setWorkerServerlessReplicas(Integer workerServerlessReplicas) {
            this.workerServerlessReplicas = workerServerlessReplicas;
            return this;
        }
        public Integer getWorkerServerlessReplicas() {
            return this.workerServerlessReplicas;
        }

        public GetAirflowResponseBodyRoot setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetAirflowResponseBodyRoot setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
