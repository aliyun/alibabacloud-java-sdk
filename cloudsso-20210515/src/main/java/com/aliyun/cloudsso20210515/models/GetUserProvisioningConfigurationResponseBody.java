// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserProvisioningConfiguration")
    public GetUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration userProvisioningConfiguration;

    public static GetUserProvisioningConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningConfigurationResponseBody self = new GetUserProvisioningConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserProvisioningConfigurationResponseBody setUserProvisioningConfiguration(GetUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration userProvisioningConfiguration) {
        this.userProvisioningConfiguration = userProvisioningConfiguration;
        return this;
    }
    public GetUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration getUserProvisioningConfiguration() {
        return this.userProvisioningConfiguration;
    }

    public static class GetUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DefaultLandingPage")
        public String defaultLandingPage;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("SessionDuration")
        public Integer sessionDuration;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration self = new GetUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration();
            return TeaModel.build(map, self);
        }

        public GetUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration setDefaultLandingPage(String defaultLandingPage) {
            this.defaultLandingPage = defaultLandingPage;
            return this;
        }
        public String getDefaultLandingPage() {
            return this.defaultLandingPage;
        }

        public GetUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public GetUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration setSessionDuration(Integer sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }
        public Integer getSessionDuration() {
            return this.sessionDuration;
        }

        public GetUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
