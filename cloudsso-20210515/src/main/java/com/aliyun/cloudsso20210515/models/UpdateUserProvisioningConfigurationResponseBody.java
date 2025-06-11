// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserProvisioningConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BBC2ED1D-FAC5-3DF8-B63C-992B85B08DD9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The global configurations of the RAM user provisioning.</p>
     */
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
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-28T03:55:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The default URL for a CloudSSO user who logs on to the Alibaba Cloud Management Console.</p>
         * <p>Default value: <a href="https://homenew.console.aliyun.com">https://homenew.console.aliyun.com</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://homenew.console.aliyun.com">https://homenew.console.aliyun.com</a></p>
         */
        @NameInMap("DefaultLandingPage")
        public String defaultLandingPage;

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-003qew84****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The duration of the logon session.</p>
         * <p>Unit: hours.</p>
         * <p>Valid values: 1 to 24.</p>
         * <p>Default value: 6.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("SessionDuration")
        public Integer sessionDuration;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-28T03:55:42Z</p>
         */
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
