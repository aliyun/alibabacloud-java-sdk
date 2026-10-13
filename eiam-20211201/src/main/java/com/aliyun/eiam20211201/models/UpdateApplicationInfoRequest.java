// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationInfoRequest extends TeaModel {
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
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>Ram Account SSO</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The application owner.</p>
     */
    @NameInMap("ApplicationOwner")
    public UpdateApplicationInfoRequestApplicationOwner applicationOwner;

    /**
     * <p>The application visibility settings.</p>
     */
    @NameInMap("ApplicationVisibility")
    public java.util.List<String> applicationVisibility;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of application extension fields.</p>
     */
    @NameInMap("CustomFields")
    public java.util.List<UpdateApplicationInfoRequestCustomFields> customFields;

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
     * <p>The URL of the application logo.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.aliyuncs.com/logo.png">https://example.aliyuncs.com/logo.png</a></p>
     */
    @NameInMap("LogoUrl")
    public String logoUrl;

    public static UpdateApplicationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationInfoRequest self = new UpdateApplicationInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationInfoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationInfoRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public UpdateApplicationInfoRequest setApplicationOwner(UpdateApplicationInfoRequestApplicationOwner applicationOwner) {
        this.applicationOwner = applicationOwner;
        return this;
    }
    public UpdateApplicationInfoRequestApplicationOwner getApplicationOwner() {
        return this.applicationOwner;
    }

    public UpdateApplicationInfoRequest setApplicationVisibility(java.util.List<String> applicationVisibility) {
        this.applicationVisibility = applicationVisibility;
        return this;
    }
    public java.util.List<String> getApplicationVisibility() {
        return this.applicationVisibility;
    }

    public UpdateApplicationInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateApplicationInfoRequest setCustomFields(java.util.List<UpdateApplicationInfoRequestCustomFields> customFields) {
        this.customFields = customFields;
        return this;
    }
    public java.util.List<UpdateApplicationInfoRequestCustomFields> getCustomFields() {
        return this.customFields;
    }

    public UpdateApplicationInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateApplicationInfoRequest setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public static class UpdateApplicationInfoRequestApplicationOwner extends TeaModel {
        /**
         * <p>The list of group IDs.</p>
         */
        @NameInMap("GroupIds")
        public java.util.List<String> groupIds;

        /**
         * <p>The list of user IDs.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static UpdateApplicationInfoRequestApplicationOwner build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationInfoRequestApplicationOwner self = new UpdateApplicationInfoRequestApplicationOwner();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationInfoRequestApplicationOwner setGroupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        public UpdateApplicationInfoRequestApplicationOwner setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class UpdateApplicationInfoRequestCustomFields extends TeaModel {
        /**
         * <p>The name of the application extension field.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_type</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The value of the application extension field. If FieldName is set to agentType, valid values are bailian, pai, dify, and volcano. If FieldName is set to agentExternalId, enter the relevant value.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        /**
         * <p>The operation type for the application extension field.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        public static UpdateApplicationInfoRequestCustomFields build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationInfoRequestCustomFields self = new UpdateApplicationInfoRequestCustomFields();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationInfoRequestCustomFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public UpdateApplicationInfoRequestCustomFields setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public UpdateApplicationInfoRequestCustomFields setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

    }

}
