// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>66898413-EB80-556D-9429-06FE3548F672</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The global configurations of the RAM user provisioning.</p>
     */
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
         * <p>d-00fc2p61****</p>
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
         * <p>10</p>
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
