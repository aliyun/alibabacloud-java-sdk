// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationAdvancedConfigRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The advanced configuration of the SCIM server.</p>
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
         * <p>A list of IDs of supported custom user fields.</p>
         */
        @NameInMap("SupportedUserCustomFieldIds")
        public java.util.List<String> supportedUserCustomFieldIds;

        /**
         * <p>The namespace of the user extension fields.</p>
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
