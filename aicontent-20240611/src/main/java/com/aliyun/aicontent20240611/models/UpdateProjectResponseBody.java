// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class UpdateProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public UpdateProjectResponseBodyData data;

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

    public static UpdateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectResponseBody self = new UpdateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectResponseBody setData(UpdateProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateProjectResponseBodyData getData() {
        return this.data;
    }

    public UpdateProjectResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public UpdateProjectResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public UpdateProjectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateProjectResponseBodyDataProjectAppsApplicationAccessIds extends TeaModel {
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

        public static UpdateProjectResponseBodyDataProjectAppsApplicationAccessIds build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectResponseBodyDataProjectAppsApplicationAccessIds self = new UpdateProjectResponseBodyDataProjectAppsApplicationAccessIds();
            return TeaModel.build(map, self);
        }

        public UpdateProjectResponseBodyDataProjectAppsApplicationAccessIds setApplicationAccessId(String applicationAccessId) {
            this.applicationAccessId = applicationAccessId;
            return this;
        }
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

        public UpdateProjectResponseBodyDataProjectAppsApplicationAccessIds setApplicationAccessSecret(String applicationAccessSecret) {
            this.applicationAccessSecret = applicationAccessSecret;
            return this;
        }
        public String getApplicationAccessSecret() {
            return this.applicationAccessSecret;
        }

    }

    public static class UpdateProjectResponseBodyDataProjectApps extends TeaModel {
        @NameInMap("ApplicationAccessIds")
        public java.util.List<UpdateProjectResponseBodyDataProjectAppsApplicationAccessIds> applicationAccessIds;

        /**
         * <strong>example:</strong>
         * <p>4498</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1889</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        public static UpdateProjectResponseBodyDataProjectApps build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectResponseBodyDataProjectApps self = new UpdateProjectResponseBodyDataProjectApps();
            return TeaModel.build(map, self);
        }

        public UpdateProjectResponseBodyDataProjectApps setApplicationAccessIds(java.util.List<UpdateProjectResponseBodyDataProjectAppsApplicationAccessIds> applicationAccessIds) {
            this.applicationAccessIds = applicationAccessIds;
            return this;
        }
        public java.util.List<UpdateProjectResponseBodyDataProjectAppsApplicationAccessIds> getApplicationAccessIds() {
            return this.applicationAccessIds;
        }

        public UpdateProjectResponseBodyDataProjectApps setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateProjectResponseBodyDataProjectApps setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

    public static class UpdateProjectResponseBodyDataProjectSDK extends TeaModel {
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
         * <p>PHP</p>
         */
        @NameInMap("DevelopLanguage")
        public String developLanguage;

        /**
         * <strong>example:</strong>
         * <p><a href="http://demo.com/doc">http://demo.com/doc</a></p>
         */
        @NameInMap("DocUrl")
        public String docUrl;

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
         * <p>4.13.0</p>
         */
        @NameInMap("SdkVersion")
        public String sdkVersion;

        public static UpdateProjectResponseBodyDataProjectSDK build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectResponseBodyDataProjectSDK self = new UpdateProjectResponseBodyDataProjectSDK();
            return TeaModel.build(map, self);
        }

        public UpdateProjectResponseBodyDataProjectSDK setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateProjectResponseBodyDataProjectSDK setDemoUrl(String demoUrl) {
            this.demoUrl = demoUrl;
            return this;
        }
        public String getDemoUrl() {
            return this.demoUrl;
        }

        public UpdateProjectResponseBodyDataProjectSDK setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public UpdateProjectResponseBodyDataProjectSDK setDevelopLanguage(String developLanguage) {
            this.developLanguage = developLanguage;
            return this;
        }
        public String getDevelopLanguage() {
            return this.developLanguage;
        }

        public UpdateProjectResponseBodyDataProjectSDK setDocUrl(String docUrl) {
            this.docUrl = docUrl;
            return this;
        }
        public String getDocUrl() {
            return this.docUrl;
        }

        public UpdateProjectResponseBodyDataProjectSDK setSdkName(String sdkName) {
            this.sdkName = sdkName;
            return this;
        }
        public String getSdkName() {
            return this.sdkName;
        }

        public UpdateProjectResponseBodyDataProjectSDK setSdkUrl(String sdkUrl) {
            this.sdkUrl = sdkUrl;
            return this;
        }
        public String getSdkUrl() {
            return this.sdkUrl;
        }

        public UpdateProjectResponseBodyDataProjectSDK setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

    }

    public static class UpdateProjectResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-12-10T02:07:16Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ProjectApps")
        public java.util.List<UpdateProjectResponseBodyDataProjectApps> projectApps;

        /**
         * <strong>example:</strong>
         * <p>56160</p>
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
        public java.util.List<UpdateProjectResponseBodyDataProjectSDK> projectSDK;

        /**
         * <strong>example:</strong>
         * <p>WebApplication</p>
         */
        @NameInMap("ProjectType")
        public String projectType;

        public static UpdateProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectResponseBodyData self = new UpdateProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateProjectResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateProjectResponseBodyData setProjectApps(java.util.List<UpdateProjectResponseBodyDataProjectApps> projectApps) {
            this.projectApps = projectApps;
            return this;
        }
        public java.util.List<UpdateProjectResponseBodyDataProjectApps> getProjectApps() {
            return this.projectApps;
        }

        public UpdateProjectResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public UpdateProjectResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public UpdateProjectResponseBodyData setProjectSDK(java.util.List<UpdateProjectResponseBodyDataProjectSDK> projectSDK) {
            this.projectSDK = projectSDK;
            return this;
        }
        public java.util.List<UpdateProjectResponseBodyDataProjectSDK> getProjectSDK() {
            return this.projectSDK;
        }

        public UpdateProjectResponseBodyData setProjectType(String projectType) {
            this.projectType = projectType;
            return this;
        }
        public String getProjectType() {
            return this.projectType;
        }

    }

}
