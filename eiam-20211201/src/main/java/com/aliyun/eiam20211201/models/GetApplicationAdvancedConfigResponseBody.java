// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationAdvancedConfigResponseBody extends TeaModel {
    @NameInMap("ApplicationAdvancedConfig")
    public GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfig applicationAdvancedConfig;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationAdvancedConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationAdvancedConfigResponseBody self = new GetApplicationAdvancedConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationAdvancedConfigResponseBody setApplicationAdvancedConfig(GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfig applicationAdvancedConfig) {
        this.applicationAdvancedConfig = applicationAdvancedConfig;
        return this;
    }
    public GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfig getApplicationAdvancedConfig() {
        return this.applicationAdvancedConfig;
    }

    public GetApplicationAdvancedConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfigScimServerAdvancedConfig extends TeaModel {
        /**
         * <p>支持的用户自定义字段ID列表。</p>
         */
        @NameInMap("SupportedUserCustomFieldIds")
        public java.util.List<String> supportedUserCustomFieldIds;

        /**
         * <p>用户扩展字段的命名空间。</p>
         * 
         * <strong>example:</strong>
         * <p>urn:ietf:params:scim:schemas:extension:customfield:2.0:User</p>
         */
        @NameInMap("UserCustomFieldNamespace")
        public String userCustomFieldNamespace;

        public static GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfigScimServerAdvancedConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfigScimServerAdvancedConfig self = new GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfigScimServerAdvancedConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfigScimServerAdvancedConfig setSupportedUserCustomFieldIds(java.util.List<String> supportedUserCustomFieldIds) {
            this.supportedUserCustomFieldIds = supportedUserCustomFieldIds;
            return this;
        }
        public java.util.List<String> getSupportedUserCustomFieldIds() {
            return this.supportedUserCustomFieldIds;
        }

        public GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfigScimServerAdvancedConfig setUserCustomFieldNamespace(String userCustomFieldNamespace) {
            this.userCustomFieldNamespace = userCustomFieldNamespace;
            return this;
        }
        public String getUserCustomFieldNamespace() {
            return this.userCustomFieldNamespace;
        }

    }

    public static class GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfig extends TeaModel {
        /**
         * <p>IDaaS EIAM 应用Id</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Scim Server 高阶配置</p>
         */
        @NameInMap("ScimServerAdvancedConfig")
        public GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfigScimServerAdvancedConfig scimServerAdvancedConfig;

        public static GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfig self = new GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfig setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfig setScimServerAdvancedConfig(GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfigScimServerAdvancedConfig scimServerAdvancedConfig) {
            this.scimServerAdvancedConfig = scimServerAdvancedConfig;
            return this;
        }
        public GetApplicationAdvancedConfigResponseBodyApplicationAdvancedConfigScimServerAdvancedConfig getScimServerAdvancedConfig() {
            return this.scimServerAdvancedConfig;
        }

    }

}
