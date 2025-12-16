// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationAdvancedConfigRequest extends TeaModel {
    /**
     * <p>IDaaS的应用资源ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
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
    public UpdateApplicationAdvancedConfigRequestScimServerAdvancedConfig scimServerAdvancedConfig;

    public static UpdateApplicationAdvancedConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationAdvancedConfigRequest self = new UpdateApplicationAdvancedConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationAdvancedConfigRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationAdvancedConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateApplicationAdvancedConfigRequest setScimServerAdvancedConfig(UpdateApplicationAdvancedConfigRequestScimServerAdvancedConfig scimServerAdvancedConfig) {
        this.scimServerAdvancedConfig = scimServerAdvancedConfig;
        return this;
    }
    public UpdateApplicationAdvancedConfigRequestScimServerAdvancedConfig getScimServerAdvancedConfig() {
        return this.scimServerAdvancedConfig;
    }

    public static class UpdateApplicationAdvancedConfigRequestScimServerAdvancedConfig extends TeaModel {
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

        public static UpdateApplicationAdvancedConfigRequestScimServerAdvancedConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationAdvancedConfigRequestScimServerAdvancedConfig self = new UpdateApplicationAdvancedConfigRequestScimServerAdvancedConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationAdvancedConfigRequestScimServerAdvancedConfig setSupportedUserCustomFieldIds(java.util.List<String> supportedUserCustomFieldIds) {
            this.supportedUserCustomFieldIds = supportedUserCustomFieldIds;
            return this;
        }
        public java.util.List<String> getSupportedUserCustomFieldIds() {
            return this.supportedUserCustomFieldIds;
        }

        public UpdateApplicationAdvancedConfigRequestScimServerAdvancedConfig setUserCustomFieldNamespace(String userCustomFieldNamespace) {
            this.userCustomFieldNamespace = userCustomFieldNamespace;
            return this;
        }
        public String getUserCustomFieldNamespace() {
            return this.userCustomFieldNamespace;
        }

    }

}
