// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class QueryProjectListResponseBody extends TeaModel {
    /**
     * <p>A list of projects.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<QueryProjectListResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static QueryProjectListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectListResponseBody self = new QueryProjectListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProjectListResponseBody setData(java.util.List<QueryProjectListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryProjectListResponseBodyData> getData() {
        return this.data;
    }

    public QueryProjectListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryProjectListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryProjectListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryProjectListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryProjectListResponseBodyDataProjectAppsApplicationAccessIds extends TeaModel {
        /**
         * <p>The application access ID, also known as the appkey.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("applicationAccessId")
        public String applicationAccessId;

        /**
         * <p>The application access secret. This field is returned only for requests made from the console.</p>
         * 
         * <strong>example:</strong>
         * <p>MyAppSecret</p>
         */
        @NameInMap("applicationAccessSecret")
        public String applicationAccessSecret;

        public static QueryProjectListResponseBodyDataProjectAppsApplicationAccessIds build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectListResponseBodyDataProjectAppsApplicationAccessIds self = new QueryProjectListResponseBodyDataProjectAppsApplicationAccessIds();
            return TeaModel.build(map, self);
        }

        public QueryProjectListResponseBodyDataProjectAppsApplicationAccessIds setApplicationAccessId(String applicationAccessId) {
            this.applicationAccessId = applicationAccessId;
            return this;
        }
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

        public QueryProjectListResponseBodyDataProjectAppsApplicationAccessIds setApplicationAccessSecret(String applicationAccessSecret) {
            this.applicationAccessSecret = applicationAccessSecret;
            return this;
        }
        public String getApplicationAccessSecret() {
            return this.applicationAccessSecret;
        }

    }

    public static class QueryProjectListResponseBodyDataProjectApps extends TeaModel {
        /**
         * <p>A list of access credentials for the application.</p>
         */
        @NameInMap("ApplicationAccessIds")
        public java.util.List<QueryProjectListResponseBodyDataProjectAppsApplicationAccessIds> applicationAccessIds;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4700</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4747</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        public static QueryProjectListResponseBodyDataProjectApps build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectListResponseBodyDataProjectApps self = new QueryProjectListResponseBodyDataProjectApps();
            return TeaModel.build(map, self);
        }

        public QueryProjectListResponseBodyDataProjectApps setApplicationAccessIds(java.util.List<QueryProjectListResponseBodyDataProjectAppsApplicationAccessIds> applicationAccessIds) {
            this.applicationAccessIds = applicationAccessIds;
            return this;
        }
        public java.util.List<QueryProjectListResponseBodyDataProjectAppsApplicationAccessIds> getApplicationAccessIds() {
            return this.applicationAccessIds;
        }

        public QueryProjectListResponseBodyDataProjectApps setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryProjectListResponseBodyDataProjectApps setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

    public static class QueryProjectListResponseBodyDataProjectSDK extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-16T08:23:19Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The demo URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://demo.com/demo">http://demo.com/demo</a></p>
         */
        @NameInMap("DemoUrl")
        public String demoUrl;

        /**
         * <p>The deployment mode. Valid values: client-side and server-side.</p>
         * 
         * <strong>example:</strong>
         * <p>服务端</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The development language.</p>
         * 
         * <strong>example:</strong>
         * <p>JAVA</p>
         */
        @NameInMap("DevelopLanguage")
        public String developLanguage;

        /**
         * <p>The documentation URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://demo.com/doc">http://demo.com/doc</a></p>
         */
        @NameInMap("DocUrl")
        public String docUrl;

        /**
         * <p>The SDK name.</p>
         * 
         * <strong>example:</strong>
         * <p>GO AUTH</p>
         */
        @NameInMap("SdkName")
        public String sdkName;

        /**
         * <p>The SDK URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://demo.com/sdk.zip">http://demo.com/sdk.zip</a></p>
         */
        @NameInMap("SdkUrl")
        public String sdkUrl;

        /**
         * <p>The SDK version.</p>
         * 
         * <strong>example:</strong>
         * <p>.3.52</p>
         */
        @NameInMap("SdkVersion")
        public String sdkVersion;

        public static QueryProjectListResponseBodyDataProjectSDK build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectListResponseBodyDataProjectSDK self = new QueryProjectListResponseBodyDataProjectSDK();
            return TeaModel.build(map, self);
        }

        public QueryProjectListResponseBodyDataProjectSDK setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryProjectListResponseBodyDataProjectSDK setDemoUrl(String demoUrl) {
            this.demoUrl = demoUrl;
            return this;
        }
        public String getDemoUrl() {
            return this.demoUrl;
        }

        public QueryProjectListResponseBodyDataProjectSDK setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public QueryProjectListResponseBodyDataProjectSDK setDevelopLanguage(String developLanguage) {
            this.developLanguage = developLanguage;
            return this;
        }
        public String getDevelopLanguage() {
            return this.developLanguage;
        }

        public QueryProjectListResponseBodyDataProjectSDK setDocUrl(String docUrl) {
            this.docUrl = docUrl;
            return this;
        }
        public String getDocUrl() {
            return this.docUrl;
        }

        public QueryProjectListResponseBodyDataProjectSDK setSdkName(String sdkName) {
            this.sdkName = sdkName;
            return this;
        }
        public String getSdkName() {
            return this.sdkName;
        }

        public QueryProjectListResponseBodyDataProjectSDK setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        public QueryProjectListResponseBodyDataProjectSDK setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

    }

    public static class QueryProjectListResponseBodyData extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-18 12:10:22</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>A list of applications in the project.</p>
         */
        @NameInMap("ProjectApps")
        public java.util.List<QueryProjectListResponseBodyDataProjectApps> projectApps;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4910</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyProject</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>A list of SDKs for the project.</p>
         */
        @NameInMap("ProjectSDK")
        public java.util.List<QueryProjectListResponseBodyDataProjectSDK> projectSDK;

        /**
         * <p>The project type.</p>
         * 
         * <strong>example:</strong>
         * <p>WebApplication</p>
         */
        @NameInMap("ProjectType")
        public String projectType;

        public static QueryProjectListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectListResponseBodyData self = new QueryProjectListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProjectListResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryProjectListResponseBodyData setProjectApps(java.util.List<QueryProjectListResponseBodyDataProjectApps> projectApps) {
            this.projectApps = projectApps;
            return this;
        }
        public java.util.List<QueryProjectListResponseBodyDataProjectApps> getProjectApps() {
            return this.projectApps;
        }

        public QueryProjectListResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryProjectListResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public QueryProjectListResponseBodyData setProjectSDK(java.util.List<QueryProjectListResponseBodyDataProjectSDK> projectSDK) {
            this.projectSDK = projectSDK;
            return this;
        }
        public java.util.List<QueryProjectListResponseBodyDataProjectSDK> getProjectSDK() {
            return this.projectSDK;
        }

        public QueryProjectListResponseBodyData setProjectType(String projectType) {
            this.projectType = projectType;
            return this;
        }
        public String getProjectType() {
            return this.projectType;
        }

    }

}
