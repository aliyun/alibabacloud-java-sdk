// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class QueryProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public QueryProjectResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static QueryProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectResponseBody self = new QueryProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProjectResponseBody setData(QueryProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProjectResponseBodyData getData() {
        return this.data;
    }

    public QueryProjectResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryProjectResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryProjectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryProjectResponseBodyDataProjectAppsApplicationAccessIds extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("applicationAccessId")
        public String applicationAccessId;

        /**
         * <strong>example:</strong>
         * <p>MyAppSecret</p>
         */
        @NameInMap("applicationAccessSecret")
        public String applicationAccessSecret;

        public static QueryProjectResponseBodyDataProjectAppsApplicationAccessIds build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectResponseBodyDataProjectAppsApplicationAccessIds self = new QueryProjectResponseBodyDataProjectAppsApplicationAccessIds();
            return TeaModel.build(map, self);
        }

        public QueryProjectResponseBodyDataProjectAppsApplicationAccessIds setApplicationAccessId(String applicationAccessId) {
            this.applicationAccessId = applicationAccessId;
            return this;
        }
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

        public QueryProjectResponseBodyDataProjectAppsApplicationAccessIds setApplicationAccessSecret(String applicationAccessSecret) {
            this.applicationAccessSecret = applicationAccessSecret;
            return this;
        }
        public String getApplicationAccessSecret() {
            return this.applicationAccessSecret;
        }

    }

    public static class QueryProjectResponseBodyDataProjectApps extends TeaModel {
        @NameInMap("ApplicationAccessIds")
        public java.util.List<QueryProjectResponseBodyDataProjectAppsApplicationAccessIds> applicationAccessIds;

        /**
         * <strong>example:</strong>
         * <p>2144</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>159</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        public static QueryProjectResponseBodyDataProjectApps build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectResponseBodyDataProjectApps self = new QueryProjectResponseBodyDataProjectApps();
            return TeaModel.build(map, self);
        }

        public QueryProjectResponseBodyDataProjectApps setApplicationAccessIds(java.util.List<QueryProjectResponseBodyDataProjectAppsApplicationAccessIds> applicationAccessIds) {
            this.applicationAccessIds = applicationAccessIds;
            return this;
        }
        public java.util.List<QueryProjectResponseBodyDataProjectAppsApplicationAccessIds> getApplicationAccessIds() {
            return this.applicationAccessIds;
        }

        public QueryProjectResponseBodyDataProjectApps setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryProjectResponseBodyDataProjectApps setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

    public static class QueryProjectResponseBodyDataProjectSDK extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-11-01T13:40:53Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p><a href="http://demo.com/demo">http://demo.com/demo</a></p>
         */
        @NameInMap("DemoUrl")
        public String demoUrl;

        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <strong>example:</strong>
         * <p>JAVA</p>
         */
        @NameInMap("DevelopLanguage")
        public String developLanguage;

        /**
         * <strong>example:</strong>
         * <p><a href="http://demo.com/doc">http://demo.com/doc</a></p>
         */
        @NameInMap("DocUrl")
        public String docUrl;

        /**
         * <strong>example:</strong>
         * <p>JSSDK</p>
         */
        @NameInMap("SdkName")
        public String sdkName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://demo.com/sdk.zip">http://demo.com/sdk.zip</a></p>
         */
        @NameInMap("SdkUrl")
        public String sdkUrl;

        /**
         * <strong>example:</strong>
         * <p>5.1.0</p>
         */
        @NameInMap("SdkVersion")
        public String sdkVersion;

        public static QueryProjectResponseBodyDataProjectSDK build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectResponseBodyDataProjectSDK self = new QueryProjectResponseBodyDataProjectSDK();
            return TeaModel.build(map, self);
        }

        public QueryProjectResponseBodyDataProjectSDK setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryProjectResponseBodyDataProjectSDK setDemoUrl(String demoUrl) {
            this.demoUrl = demoUrl;
            return this;
        }
        public String getDemoUrl() {
            return this.demoUrl;
        }

        public QueryProjectResponseBodyDataProjectSDK setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public QueryProjectResponseBodyDataProjectSDK setDevelopLanguage(String developLanguage) {
            this.developLanguage = developLanguage;
            return this;
        }
        public String getDevelopLanguage() {
            return this.developLanguage;
        }

        public QueryProjectResponseBodyDataProjectSDK setDocUrl(String docUrl) {
            this.docUrl = docUrl;
            return this;
        }
        public String getDocUrl() {
            return this.docUrl;
        }

        public QueryProjectResponseBodyDataProjectSDK setSdkName(String sdkName) {
            this.sdkName = sdkName;
            return this;
        }
        public String getSdkName() {
            return this.sdkName;
        }

        public QueryProjectResponseBodyDataProjectSDK setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        public QueryProjectResponseBodyDataProjectSDK setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

    }

    public static class QueryProjectResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-11-01T13:40:53Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ProjectApps")
        public java.util.List<QueryProjectResponseBodyDataProjectApps> projectApps;

        /**
         * <strong>example:</strong>
         * <p>67055</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>MyProject</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectSDK")
        public java.util.List<QueryProjectResponseBodyDataProjectSDK> projectSDK;

        /**
         * <strong>example:</strong>
         * <p>WebApplication</p>
         */
        @NameInMap("ProjectType")
        public String projectType;

        public static QueryProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectResponseBodyData self = new QueryProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProjectResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryProjectResponseBodyData setProjectApps(java.util.List<QueryProjectResponseBodyDataProjectApps> projectApps) {
            this.projectApps = projectApps;
            return this;
        }
        public java.util.List<QueryProjectResponseBodyDataProjectApps> getProjectApps() {
            return this.projectApps;
        }

        public QueryProjectResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryProjectResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public QueryProjectResponseBodyData setProjectSDK(java.util.List<QueryProjectResponseBodyDataProjectSDK> projectSDK) {
            this.projectSDK = projectSDK;
            return this;
        }
        public java.util.List<QueryProjectResponseBodyDataProjectSDK> getProjectSDK() {
            return this.projectSDK;
        }

        public QueryProjectResponseBodyData setProjectType(String projectType) {
            this.projectType = projectType;
            return this;
        }
        public String getProjectType() {
            return this.projectType;
        }

    }

}
