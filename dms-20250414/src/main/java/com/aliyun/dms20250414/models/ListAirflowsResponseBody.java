// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAirflowsResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>NOT_FOUND</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The error code. This parameter is returned when an error occurs.</p>
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
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>NesLoKLEdIZrKhDT7I2gS****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Root")
    public ListAirflowsResponseBodyRoot root;

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

    public static ListAirflowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAirflowsResponseBody self = new ListAirflowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAirflowsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAirflowsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAirflowsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAirflowsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAirflowsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAirflowsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAirflowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAirflowsResponseBody setRoot(ListAirflowsResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public ListAirflowsResponseBodyRoot getRoot() {
        return this.root;
    }

    public ListAirflowsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAirflowsResponseBodyRootList extends TeaModel {
        /**
         * <p>The ID of the Airflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>af-7a6ygsh80d****</p>
         */
        @NameInMap("AirflowId")
        public String airflowId;

        /**
         * <p>The name of the Airflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-airflow</p>
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
         * <p>The type.</p>
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
         * <p>The DAGs folder that Airflow scans.</p>
         * 
         * <strong>example:</strong>
         * <p>default/dags</p>
         */
        @NameInMap("DagsDir")
        public String dagsDir;

        /**
         * <p>The error message returned when the deployment fails.</p>
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
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the Airflow instance was created.</p>
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
         * <p>The path in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>/airflow</p>
         */
        @NameInMap("OssPath")
        public String ossPath;

        /**
         * <p>The plugins folder that Airflow scans.</p>
         * 
         * <strong>example:</strong>
         * <p>default/plugins</p>
         */
        @NameInMap("PluginsDir")
        public String pluginsDir;

        /**
         * <p>The path to the file that contains the dependencies.</p>
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
         * <p>sg-2ze1nak7h0alg1w****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The path to the script that is loaded when Airflow starts.</p>
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
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6sxdc22x7sbdb****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbbfm33dy0y1pek****</p>
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
         * <p>The ID of the zone in the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListAirflowsResponseBodyRootList build(java.util.Map<String, ?> map) throws Exception {
            ListAirflowsResponseBodyRootList self = new ListAirflowsResponseBodyRootList();
            return TeaModel.build(map, self);
        }

        public ListAirflowsResponseBodyRootList setAirflowId(String airflowId) {
            this.airflowId = airflowId;
            return this;
        }
        public String getAirflowId() {
            return this.airflowId;
        }

        public ListAirflowsResponseBodyRootList setAirflowName(String airflowName) {
            this.airflowName = airflowName;
            return this;
        }
        public String getAirflowName() {
            return this.airflowName;
        }

        public ListAirflowsResponseBodyRootList setAppSpec(String appSpec) {
            this.appSpec = appSpec;
            return this;
        }
        public String getAppSpec() {
            return this.appSpec;
        }

        public ListAirflowsResponseBodyRootList setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListAirflowsResponseBodyRootList setCustomAirflowCfg(java.util.List<String> customAirflowCfg) {
            this.customAirflowCfg = customAirflowCfg;
            return this;
        }
        public java.util.List<String> getCustomAirflowCfg() {
            return this.customAirflowCfg;
        }

        public ListAirflowsResponseBodyRootList setDagsDir(String dagsDir) {
            this.dagsDir = dagsDir;
            return this;
        }
        public String getDagsDir() {
            return this.dagsDir;
        }

        public ListAirflowsResponseBodyRootList setDeployErrorMsg(String deployErrorMsg) {
            this.deployErrorMsg = deployErrorMsg;
            return this;
        }
        public String getDeployErrorMsg() {
            return this.deployErrorMsg;
        }

        public ListAirflowsResponseBodyRootList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAirflowsResponseBodyRootList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListAirflowsResponseBodyRootList setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public ListAirflowsResponseBodyRootList setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public ListAirflowsResponseBodyRootList setPluginsDir(String pluginsDir) {
            this.pluginsDir = pluginsDir;
            return this;
        }
        public String getPluginsDir() {
            return this.pluginsDir;
        }

        public ListAirflowsResponseBodyRootList setRequirementFile(String requirementFile) {
            this.requirementFile = requirementFile;
            return this;
        }
        public String getRequirementFile() {
            return this.requirementFile;
        }

        public ListAirflowsResponseBodyRootList setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListAirflowsResponseBodyRootList setStartupFile(String startupFile) {
            this.startupFile = startupFile;
            return this;
        }
        public String getStartupFile() {
            return this.startupFile;
        }

        public ListAirflowsResponseBodyRootList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAirflowsResponseBodyRootList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListAirflowsResponseBodyRootList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListAirflowsResponseBodyRootList setWorkerServerlessReplicas(Integer workerServerlessReplicas) {
            this.workerServerlessReplicas = workerServerlessReplicas;
            return this;
        }
        public Integer getWorkerServerlessReplicas() {
            return this.workerServerlessReplicas;
        }

        public ListAirflowsResponseBodyRootList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListAirflowsResponseBodyRootList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListAirflowsResponseBodyRoot extends TeaModel {
        /**
         * <p>The list of data.</p>
         */
        @NameInMap("List")
        public java.util.List<ListAirflowsResponseBodyRootList> list;

        /**
         * <p>The total number of matching Airflow instances.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAirflowsResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            ListAirflowsResponseBodyRoot self = new ListAirflowsResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public ListAirflowsResponseBodyRoot setList(java.util.List<ListAirflowsResponseBodyRootList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListAirflowsResponseBodyRootList> getList() {
            return this.list;
        }

        public ListAirflowsResponseBodyRoot setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
