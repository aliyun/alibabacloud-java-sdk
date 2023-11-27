// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserProvisioningConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserProvisioningConfiguration")
    public UpdateUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration userProvisioningConfiguration;

    public static UpdateUserProvisioningConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserProvisioningConfigurationResponseBody self = new UpdateUserProvisioningConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserProvisioningConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserProvisioningConfigurationResponseBody setUserProvisioningConfiguration(UpdateUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration userProvisioningConfiguration) {
        this.userProvisioningConfiguration = userProvisioningConfiguration;
        return this;
    }
    public UpdateUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration getUserProvisioningConfiguration() {
        return this.userProvisioningConfiguration;
    }

    public static class UpdateUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration extends TeaModel {
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

        public static UpdateUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration self = new UpdateUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration setDefaultLandingPage(String defaultLandingPage) {
            this.defaultLandingPage = defaultLandingPage;
            return this;
        }
        public String getDefaultLandingPage() {
            return this.defaultLandingPage;
        }

        public UpdateUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public UpdateUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration setSessionDuration(Integer sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }
        public Integer getSessionDuration() {
            return this.sessionDuration;
        }

        public UpdateUserProvisioningConfigurationResponseBodyUserProvisioningConfiguration setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
