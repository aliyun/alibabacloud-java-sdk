// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CreateProjectResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public CreateProjectResponseBodyData data;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message returned if the request fails.</p>
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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectResponseBody self = new CreateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectResponseBody setData(CreateProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProjectResponseBodyData getData() {
        return this.data;
    }

    public CreateProjectResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateProjectResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateProjectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateProjectResponseBodyDataProjectAppsApplicationAccessIds extends TeaModel {
        /**
         * <p>The app key.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("applicationAccessId")
        public String applicationAccessId;

        /**
         * <p>The app secret. This parameter is returned only for requests sent from the console.</p>
         * 
         * <strong>example:</strong>
         * <p>MyAppSecret</p>
         */
        @NameInMap("applicationAccessSecret")
        public String applicationAccessSecret;

        public static CreateProjectResponseBodyDataProjectAppsApplicationAccessIds build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectResponseBodyDataProjectAppsApplicationAccessIds self = new CreateProjectResponseBodyDataProjectAppsApplicationAccessIds();
            return TeaModel.build(map, self);
        }

        public CreateProjectResponseBodyDataProjectAppsApplicationAccessIds setApplicationAccessId(String applicationAccessId) {
            this.applicationAccessId = applicationAccessId;
            return this;
        }
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

        public CreateProjectResponseBodyDataProjectAppsApplicationAccessIds setApplicationAccessSecret(String applicationAccessSecret) {
            this.applicationAccessSecret = applicationAccessSecret;
            return this;
        }
        public String getApplicationAccessSecret() {
            return this.applicationAccessSecret;
        }

    }

    public static class CreateProjectResponseBodyDataProjectApps extends TeaModel {
        /**
         * <p>The access credentials for the application.</p>
         */
        @NameInMap("ApplicationAccessIds")
        public java.util.List<CreateProjectResponseBodyDataProjectAppsApplicationAccessIds> applicationAccessIds;

        /**
         * <p>The internal ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>4867</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4910</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        public static CreateProjectResponseBodyDataProjectApps build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectResponseBodyDataProjectApps self = new CreateProjectResponseBodyDataProjectApps();
            return TeaModel.build(map, self);
        }

        public CreateProjectResponseBodyDataProjectApps setApplicationAccessIds(java.util.List<CreateProjectResponseBodyDataProjectAppsApplicationAccessIds> applicationAccessIds) {
            this.applicationAccessIds = applicationAccessIds;
            return this;
        }
        public java.util.List<CreateProjectResponseBodyDataProjectAppsApplicationAccessIds> getApplicationAccessIds() {
            return this.applicationAccessIds;
        }

        public CreateProjectResponseBodyDataProjectApps setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectResponseBodyDataProjectApps setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

    public static class CreateProjectResponseBodyDataProjectSDK extends TeaModel {
        /**
         * <p>The SDK\&quot;s creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-15T09:17:39Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The demo\&quot;s URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://demo.com/demo">http://demo.com/demo</a></p>
         */
        @NameInMap("DemoUrl")
        public String demoUrl;

        /**
         * <p>The deployment mode. Valid values: client or server.</p>
         * 
         * <strong>example:</strong>
         * <p>客户端</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The development language.</p>
         * 
         * <strong>example:</strong>
         * <p>C++</p>
         */
        @NameInMap("DevelopLanguage")
        public String developLanguage;

        /**
         * <p>The SDK\&quot;s documentation URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://demo.com/doc">http://demo.com/doc</a></p>
         */
        @NameInMap("DocUrl")
        public String docUrl;

        /**
         * <p>The name of the SDK.</p>
         * 
         * <strong>example:</strong>
         * <p>C SDK</p>
         */
        @NameInMap("SdkName")
        public String sdkName;

        /**
         * <p>The SDK\&quot;s download URL.</p>
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
         * <p>4.12.8</p>
         */
        @NameInMap("SdkVersion")
        public String sdkVersion;

        public static CreateProjectResponseBodyDataProjectSDK build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectResponseBodyDataProjectSDK self = new CreateProjectResponseBodyDataProjectSDK();
            return TeaModel.build(map, self);
        }

        public CreateProjectResponseBodyDataProjectSDK setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateProjectResponseBodyDataProjectSDK setDemoUrl(String demoUrl) {
            this.demoUrl = demoUrl;
            return this;
        }
        public String getDemoUrl() {
            return this.demoUrl;
        }

        public CreateProjectResponseBodyDataProjectSDK setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public CreateProjectResponseBodyDataProjectSDK setDevelopLanguage(String developLanguage) {
            this.developLanguage = developLanguage;
            return this;
        }
        public String getDevelopLanguage() {
            return this.developLanguage;
        }

        public CreateProjectResponseBodyDataProjectSDK setDocUrl(String docUrl) {
            this.docUrl = docUrl;
            return this;
        }
        public String getDocUrl() {
            return this.docUrl;
        }

        public CreateProjectResponseBodyDataProjectSDK setSdkName(String sdkName) {
            this.sdkName = sdkName;
            return this;
        }
        public String getSdkName() {
            return this.sdkName;
        }

        public CreateProjectResponseBodyDataProjectSDK setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        public CreateProjectResponseBodyDataProjectSDK setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

    }

    public static class CreateProjectResponseBodyData extends TeaModel {
        /**
         * <p>The project\&quot;s creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-15T09:17:39Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The applications in the project.</p>
         */
        @NameInMap("ProjectApps")
        public java.util.List<CreateProjectResponseBodyDataProjectApps> projectApps;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>124187</p>
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
         * <p>The SDKs for the project.</p>
         */
        @NameInMap("ProjectSDK")
        public java.util.List<CreateProjectResponseBodyDataProjectSDK> projectSDK;

        /**
         * <p>The project type.</p>
         * 
         * <strong>example:</strong>
         * <p>WebApplication</p>
         */
        @NameInMap("ProjectType")
        public String projectType;

        public static CreateProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectResponseBodyData self = new CreateProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProjectResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateProjectResponseBodyData setProjectApps(java.util.List<CreateProjectResponseBodyDataProjectApps> projectApps) {
            this.projectApps = projectApps;
            return this;
        }
        public java.util.List<CreateProjectResponseBodyDataProjectApps> getProjectApps() {
            return this.projectApps;
        }

        public CreateProjectResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateProjectResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public CreateProjectResponseBodyData setProjectSDK(java.util.List<CreateProjectResponseBodyDataProjectSDK> projectSDK) {
            this.projectSDK = projectSDK;
            return this;
        }
        public java.util.List<CreateProjectResponseBodyDataProjectSDK> getProjectSDK() {
            return this.projectSDK;
        }

        public CreateProjectResponseBodyData setProjectType(String projectType) {
            this.projectType = projectType;
            return this;
        }
        public String getProjectType() {
            return this.projectType;
        }

    }

}
