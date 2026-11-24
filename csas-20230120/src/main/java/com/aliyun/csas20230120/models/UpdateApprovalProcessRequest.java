// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalProcessRequest extends TeaModel {
    /**
     * <p>The approval type. Valid values: 0 (built-in approval), 1 (DingTalk approval), 2 (WeCom approval), and 3 (Lark approval). Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApprovalType")
    public Integer approvalType;

    /**
     * <p>The description of the approval process. The description must be 1 to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>Office endpoint software installation and uninstallation approval process</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The event callback identifier. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter is used to generate the event callback URL for the external platform. You can pass a complete callback URL, and the server retains only the part after the callback path prefix.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://callback.example.com/sase/api/v1/approval/dingtalk/callback/9m4e2mr0ui3e8a21">https://callback.example.com/sase/api/v1/approval/dingtalk/callback/9m4e2mr0ui3e8a21</a>****</p>
     */
    @NameInMap("EventLabel")
    public String eventLabel;

    /**
     * <p>The integration configuration for the external approval platform. This parameter is required when the approval type is 1 (DingTalk approval) or 3 (Lark approval). It includes integration parameters such as appKey and appSecret, and must be passed as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;appKey&quot;:&quot;dingn1a2b3c4d5e6f****&quot;,&quot;appSecret&quot;:&quot;f9c8e7d6a5b4c3d2e1f0a9b8c7d6e5f4a3b2c1d0e9f8a7b6c5d4e3f2a1b0****&quot;,&quot;eventVerifyToken&quot;:&quot;7a8b9c0d1e2f3a4b5c6d7e8f9a0b****&quot;,&quot;eventAesKey&quot;:&quot;1a2b3c4d5e6f7g8h9i0j1k2l3m4n5o6p7q8r9s0t****&quot;}</p>
     */
    @NameInMap("ExternalConfig")
    public String externalConfig;

    /**
     * <p>The external approval template configurations. Configure the approval template ID, external approval process ID, and field mappings based on the policy type. This parameter is used only when ApprovalType is set to 1 (DingTalk approval), 2 (WeCom approval), or 3 (Lark approval). If this parameter is not passed, the existing template associations of the approval process are cleared. The approval templates associated with business policies cannot be cleared.</p>
     */
    @NameInMap("MatchSchemaConfigs")
    public UpdateApprovalProcessRequestMatchSchemaConfigs matchSchemaConfigs;

    /**
     * <p>The matched approval templates.</p>
     */
    @NameInMap("MatchSchemas")
    public UpdateApprovalProcessRequestMatchSchemas matchSchemas;

    /**
     * <p>The ID of the approval process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-process-f16bf74b2b29****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>The name of the approval process. The name must be 1 to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>Endpoint software installation approval process</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>The list of approval nodes. You can define up to 5 approval nodes.</p>
     */
    @NameInMap("ProcessNodes")
    public java.util.List<java.util.List<String>> processNodes;

    public static UpdateApprovalProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApprovalProcessRequest self = new UpdateApprovalProcessRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApprovalProcessRequest setApprovalType(Integer approvalType) {
        this.approvalType = approvalType;
        return this;
    }
    public Integer getApprovalType() {
        return this.approvalType;
    }

    public UpdateApprovalProcessRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApprovalProcessRequest setEventLabel(String eventLabel) {
        this.eventLabel = eventLabel;
        return this;
    }
    public String getEventLabel() {
        return this.eventLabel;
    }

    public UpdateApprovalProcessRequest setExternalConfig(String externalConfig) {
        this.externalConfig = externalConfig;
        return this;
    }
    public String getExternalConfig() {
        return this.externalConfig;
    }

    public UpdateApprovalProcessRequest setMatchSchemaConfigs(UpdateApprovalProcessRequestMatchSchemaConfigs matchSchemaConfigs) {
        this.matchSchemaConfigs = matchSchemaConfigs;
        return this;
    }
    public UpdateApprovalProcessRequestMatchSchemaConfigs getMatchSchemaConfigs() {
        return this.matchSchemaConfigs;
    }

    public UpdateApprovalProcessRequest setMatchSchemas(UpdateApprovalProcessRequestMatchSchemas matchSchemas) {
        this.matchSchemas = matchSchemas;
        return this;
    }
    public UpdateApprovalProcessRequestMatchSchemas getMatchSchemas() {
        return this.matchSchemas;
    }

    public UpdateApprovalProcessRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public UpdateApprovalProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public UpdateApprovalProcessRequest setProcessNodes(java.util.List<java.util.List<String>> processNodes) {
        this.processNodes = processNodes;
        return this;
    }
    public java.util.List<java.util.List<String>> getProcessNodes() {
        return this.processNodes;
    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfigFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form. This parameter is used to locate the form control when the approval type is 1 (DingTalk approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Reason for reporting</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the external approval form control, in the format of Type%%%ControlID. This parameter is used to locate the form control when the approval type is 2 (WeCom approval) or 3 (Lark approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Textarea%%%widget-1a2b****</p>
         */
        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The identifier of the system field, such as approvalReason.</p>
         * 
         * <strong>example:</strong>
         * <p>approvalReason</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfigFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfigFieldMap self = new UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfigFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfigFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfigFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfigFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfig extends TeaModel {
        /**
         * <p>The ID of the external approval process. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter specifies the process code (processCode) of the external platform.</p>
         * 
         * <strong>example:</strong>
         * <p>PROC-1a2b3c4d5e6f****</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The mapping list between system fields and external approval form controls.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfigFieldMap> fieldMap;

        /**
         * <p>The ID of the approval template. The ID must be consistent with the template ID of the corresponding policy type in MatchSchemas. If this parameter is left empty, the approval template association is not saved for this policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfig self = new UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfig setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfig setFieldMap(java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfigFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfig setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfigFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form. This parameter is used to locate the form control when the approval type is 1 (DingTalk approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Report domain name</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the external approval form control, in the format of Type%%%ControlID. This parameter is used to locate the form control when the approval type is 2 (WeCom approval) or 3 (Lark approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Textarea%%%widget-1a2b****</p>
         */
        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The identifier of the system field, such as report_domain.</p>
         * 
         * <strong>example:</strong>
         * <p>report_domain</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfigFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfigFieldMap self = new UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfigFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfigFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfigFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfigFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfig extends TeaModel {
        /**
         * <p>The ID of the external approval process. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter specifies the process code (processCode) of the external platform.</p>
         * 
         * <strong>example:</strong>
         * <p>PROC-1a2b3c4d5e6f****</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The mapping list between system fields and external approval form controls.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfigFieldMap> fieldMap;

        /**
         * <p>The ID of the approval template. The ID must be consistent with the template ID of the corresponding policy type in MatchSchemas. If this parameter is left empty, the approval template association is not saved for this policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfig self = new UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfig setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfig setFieldMap(java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfigFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfig setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfigFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form. This parameter is used to locate the form control when the approval type is 1 (DingTalk approval).</p>
         * 
         * <strong>example:</strong>
         * <p>File name</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the external approval form control, in the format of Type%%%ControlID. This parameter is used to locate the form control when the approval type is 2 (WeCom approval) or 3 (Lark approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Textarea%%%widget-1a2b****</p>
         */
        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The identifier of the system field, such as fileName.</p>
         * 
         * <strong>example:</strong>
         * <p>fileName</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfigFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfigFieldMap self = new UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfigFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfigFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfigFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfigFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfig extends TeaModel {
        /**
         * <p>The ID of the external approval process. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter specifies the process code (processCode) of the external platform.</p>
         * 
         * <strong>example:</strong>
         * <p>PROC-1a2b3c4d5e6f****</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The mapping list between system fields and external approval form controls.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfigFieldMap> fieldMap;

        /**
         * <p>The ID of the approval template. The ID must be consistent with the template ID of the corresponding policy type in MatchSchemas. If this parameter is left empty, the approval template association is not saved for this policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfig self = new UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfig setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfig setFieldMap(java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfigFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfig setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfigFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form. This parameter is used to locate the form control when the approval type is 1 (DingTalk approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Report website access</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the external approval form control, in the format of Type%%%ControlID. This parameter is used to locate the form control when the approval type is 2 (WeCom approval) or 3 (Lark approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Textarea%%%widget-1a2b****</p>
         */
        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The identifier of the system field, such as reportDomain.</p>
         * 
         * <strong>example:</strong>
         * <p>reportDomain</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfigFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfigFieldMap self = new UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfigFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfigFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfigFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfigFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfig extends TeaModel {
        /**
         * <p>The ID of the external approval process. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter specifies the process code (processCode) of the external platform.</p>
         * 
         * <strong>example:</strong>
         * <p>PROC-1a2b3c4d5e6f****</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The mapping list between system fields and external approval form controls.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfigFieldMap> fieldMap;

        /**
         * <p>The ID of the approval template. The ID must be consistent with the template ID of the corresponding policy type in MatchSchemas. If this parameter is left empty, the approval template association is not saved for this policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfig self = new UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfig setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfig setFieldMap(java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfigFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfig setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfigFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form. This parameter is used to locate the form control when the approval type is 1 (DingTalk approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Report website access</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the external approval form control, in the format of Type%%%ControlID. This parameter is used to locate the form control when the approval type is 2 (WeCom approval) or 3 (Lark approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Textarea%%%widget-1a2b****</p>
         */
        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The identifier of the system field, such as reportDomain.</p>
         * 
         * <strong>example:</strong>
         * <p>reportDomain</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfigFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfigFieldMap self = new UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfigFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfigFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfigFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfigFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfig extends TeaModel {
        /**
         * <p>The ID of the external approval process. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter specifies the process code (processCode) of the external platform.</p>
         * 
         * <strong>example:</strong>
         * <p>PROC-1a2b3c4d5e6f****</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The mapping list between system fields and external approval form controls.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfigFieldMap> fieldMap;

        /**
         * <p>The ID of the approval template. The ID must be consistent with the template ID of the corresponding policy type in MatchSchemas. If this parameter is left empty, the approval template association is not saved for this policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfig self = new UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfig setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfig setFieldMap(java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfigFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfig setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfigFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form. This parameter is used to locate the form control when the approval type is 1 (DingTalk approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Process name</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the external approval form control, in the format of Type%%%ControlID. This parameter is used to locate the form control when the approval type is 2 (WeCom approval) or 3 (Lark approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Textarea%%%widget-1a2b****</p>
         */
        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The system field identifier, such as processName.</p>
         * 
         * <strong>example:</strong>
         * <p>processName</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfigFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfigFieldMap self = new UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfigFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfigFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfigFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfigFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfig extends TeaModel {
        /**
         * <p>The ID of the external approval process. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter specifies the process code (processCode) of the external platform.</p>
         * 
         * <strong>example:</strong>
         * <p>PROC-1a2b3c4d5e6f****</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The mapping list between system fields and external approval form controls.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfigFieldMap> fieldMap;

        /**
         * <p>The ID of the approval template. The ID must be consistent with the template ID of the corresponding policy type in MatchSchemas. If this parameter is left empty, the approval template association is not saved for this policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfig self = new UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfig setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfig setFieldMap(java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfigFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfig setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfigFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form. This parameter is used to locate the form control when the approval type is 1 (DingTalk approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Operating system</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the external approval form control, in the format of Type%%%ControlID. This parameter is used to locate the form control when the approval type is 2 (WeCom approval) or 3 (Lark approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Textarea%%%widget-1a2b****</p>
         */
        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The identifier of the system field, such as devType.</p>
         * 
         * <strong>example:</strong>
         * <p>devType</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfigFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfigFieldMap self = new UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfigFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfigFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfigFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfigFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfig extends TeaModel {
        /**
         * <p>The ID of the external approval process. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter specifies the process code (processCode) of the external platform.</p>
         * 
         * <strong>example:</strong>
         * <p>PROC-1a2b3c4d5e6f****</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The mapping list between system fields and external approval form controls.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfigFieldMap> fieldMap;

        /**
         * <p>The ID of the approval template. The ID must be consistent with the template ID of the corresponding policy type in MatchSchemas. If this parameter is left empty, the approval template association is not saved for this policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfig self = new UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfig setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfig setFieldMap(java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfigFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfig setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfigFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form. This parameter is used to locate the form control when the approval type is 1 (DingTalk approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Reported application</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the external approval form control, in the format of Type%%%ControlID. This parameter is used to locate the form control when the approval type is 2 (WeCom approval) or 3 (Lark approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Textarea%%%widget-1a2b****</p>
         */
        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The system field identifier, such as applicationId.</p>
         * 
         * <strong>example:</strong>
         * <p>applicationId</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfigFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfigFieldMap self = new UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfigFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfigFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfigFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfigFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfig extends TeaModel {
        /**
         * <p>The ID of the external approval process. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter specifies the process code (processCode) of the external platform.</p>
         * 
         * <strong>example:</strong>
         * <p>PROC-1a2b3c4d5e6f****</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The mapping list between system fields and external approval form controls.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfigFieldMap> fieldMap;

        /**
         * <p>The ID of the approval template. The ID must be consistent with the template ID of the corresponding policy type in MatchSchemas. If this parameter is left empty, the approval template association is not saved for this policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfig self = new UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfig setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfig setFieldMap(java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfigFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfig setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfigFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form. This parameter is used to locate the form control when the approval type is 1 (DingTalk approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Report software</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the external approval form control, in the format of Type%%%ControlID. This parameter is used to locate the form control when the approval type is 2 (WeCom approval) or 3 (Lark approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Textarea%%%widget-1a2b****</p>
         */
        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The identifier of the system field, such as softwareName.</p>
         * 
         * <strong>example:</strong>
         * <p>softwareName</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfigFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfigFieldMap self = new UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfigFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfigFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfigFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfigFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfig extends TeaModel {
        /**
         * <p>The ID of the external approval process. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter specifies the process code (processCode) of the external platform.</p>
         * 
         * <strong>example:</strong>
         * <p>PROC-1a2b3c4d5e6f****</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The mapping list between system fields and external approval form controls.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfigFieldMap> fieldMap;

        /**
         * <p>The ID of the approval template. The ID must be consistent with the template ID of the corresponding policy type in MatchSchemas. If this parameter is left empty, the approval template association is not saved for this policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfig self = new UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfig setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfig setFieldMap(java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfigFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfig setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfigFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form. This parameter is used to locate the form control when the approval type is 1 (DingTalk approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Process name</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the external approval form control, in the format of Type%%%ControlID. This parameter is used to locate the form control when the approval type is 2 (WeCom approval) or 3 (Lark approval).</p>
         * 
         * <strong>example:</strong>
         * <p>Textarea%%%widget-1a2b****</p>
         */
        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The system field identifier, such as processName.</p>
         * 
         * <strong>example:</strong>
         * <p>processName</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfigFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfigFieldMap self = new UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfigFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfigFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfigFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfigFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfig extends TeaModel {
        /**
         * <p>The ID of the external approval process. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter specifies the process code (processCode) of the external platform.</p>
         * 
         * <strong>example:</strong>
         * <p>PROC-1a2b3c4d5e6f****</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The mapping list between system fields and external approval form controls.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfigFieldMap> fieldMap;

        /**
         * <p>The ID of the approval template. The ID must be consistent with the template ID of the corresponding policy type in MatchSchemas. If this parameter is left empty, the approval template association is not saved for this policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfig self = new UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfig setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfig setFieldMap(java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfigFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfig setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemaConfigs extends TeaModel {
        /**
         * <p>The approval template configuration for the application uninstallation policy.</p>
         */
        @NameInMap("AppUninstallSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfig appUninstallSchemaConfig;

        /**
         * <p>The approval template configuration for the device registration policy.</p>
         */
        @NameInMap("DeviceRegistrationSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfig deviceRegistrationSchemaConfig;

        /**
         * <p>The approval template configuration for the file outbound sending policy.</p>
         */
        @NameInMap("DlpSendSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfig dlpSendSchemaConfig;

        /**
         * <p>The approval template configuration for the domain name blacklist policy.</p>
         */
        @NameInMap("DomainBlacklistSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfig domainBlacklistSchemaConfig;

        /**
         * <p>The approval template configuration for the domain name whitelist policy.</p>
         */
        @NameInMap("DomainWhitelistSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfig domainWhitelistSchemaConfig;

        /**
         * <p>The approval template configuration for the endpoint hardening policy.</p>
         */
        @NameInMap("EndpointHardeningSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfig endpointHardeningSchemaConfig;

        /**
         * <p>The approval template configuration for the peripheral control policy.</p>
         */
        @NameInMap("PeripheralBlockSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfig peripheralBlockSchemaConfig;

        /**
         * <p>The approval template configuration for the internal network access control policy.</p>
         */
        @NameInMap("PrivateAccessBlockSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfig privateAccessBlockSchemaConfig;

        /**
         * <p>The approval template configuration for the software blocking policy.</p>
         */
        @NameInMap("SoftwareBlockSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfig softwareBlockSchemaConfig;

        /**
         * <p>The approval template configuration for the software hardening policy.</p>
         */
        @NameInMap("SoftwareHardeningSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfig softwareHardeningSchemaConfig;

        public static UpdateApprovalProcessRequestMatchSchemaConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemaConfigs self = new UpdateApprovalProcessRequestMatchSchemaConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigs setAppUninstallSchemaConfig(UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfig appUninstallSchemaConfig) {
            this.appUninstallSchemaConfig = appUninstallSchemaConfig;
            return this;
        }
        public UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfig getAppUninstallSchemaConfig() {
            return this.appUninstallSchemaConfig;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigs setDeviceRegistrationSchemaConfig(UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfig deviceRegistrationSchemaConfig) {
            this.deviceRegistrationSchemaConfig = deviceRegistrationSchemaConfig;
            return this;
        }
        public UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfig getDeviceRegistrationSchemaConfig() {
            return this.deviceRegistrationSchemaConfig;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigs setDlpSendSchemaConfig(UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfig dlpSendSchemaConfig) {
            this.dlpSendSchemaConfig = dlpSendSchemaConfig;
            return this;
        }
        public UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfig getDlpSendSchemaConfig() {
            return this.dlpSendSchemaConfig;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigs setDomainBlacklistSchemaConfig(UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfig domainBlacklistSchemaConfig) {
            this.domainBlacklistSchemaConfig = domainBlacklistSchemaConfig;
            return this;
        }
        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfig getDomainBlacklistSchemaConfig() {
            return this.domainBlacklistSchemaConfig;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigs setDomainWhitelistSchemaConfig(UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfig domainWhitelistSchemaConfig) {
            this.domainWhitelistSchemaConfig = domainWhitelistSchemaConfig;
            return this;
        }
        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfig getDomainWhitelistSchemaConfig() {
            return this.domainWhitelistSchemaConfig;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigs setEndpointHardeningSchemaConfig(UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfig endpointHardeningSchemaConfig) {
            this.endpointHardeningSchemaConfig = endpointHardeningSchemaConfig;
            return this;
        }
        public UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfig getEndpointHardeningSchemaConfig() {
            return this.endpointHardeningSchemaConfig;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigs setPeripheralBlockSchemaConfig(UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfig peripheralBlockSchemaConfig) {
            this.peripheralBlockSchemaConfig = peripheralBlockSchemaConfig;
            return this;
        }
        public UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfig getPeripheralBlockSchemaConfig() {
            return this.peripheralBlockSchemaConfig;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigs setPrivateAccessBlockSchemaConfig(UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfig privateAccessBlockSchemaConfig) {
            this.privateAccessBlockSchemaConfig = privateAccessBlockSchemaConfig;
            return this;
        }
        public UpdateApprovalProcessRequestMatchSchemaConfigsPrivateAccessBlockSchemaConfig getPrivateAccessBlockSchemaConfig() {
            return this.privateAccessBlockSchemaConfig;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigs setSoftwareBlockSchemaConfig(UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfig softwareBlockSchemaConfig) {
            this.softwareBlockSchemaConfig = softwareBlockSchemaConfig;
            return this;
        }
        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfig getSoftwareBlockSchemaConfig() {
            return this.softwareBlockSchemaConfig;
        }

        public UpdateApprovalProcessRequestMatchSchemaConfigs setSoftwareHardeningSchemaConfig(UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfig softwareHardeningSchemaConfig) {
            this.softwareHardeningSchemaConfig = softwareHardeningSchemaConfig;
            return this;
        }
        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfig getSoftwareHardeningSchemaConfig() {
            return this.softwareHardeningSchemaConfig;
        }

    }

    public static class UpdateApprovalProcessRequestMatchSchemas extends TeaModel {
        /**
         * <p>The ID of the application uninstallation approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("AppUninstallSchemaId")
        public String appUninstallSchemaId;

        /**
         * <p>The ID of the device registration approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DeviceRegistrationSchemaId")
        public String deviceRegistrationSchemaId;

        /**
         * <p>The ID of the file outbound sending approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DlpSendSchemaId")
        public String dlpSendSchemaId;

        /**
         * <p>The ID of the domain name blacklist approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DomainBlacklistSchemaId")
        public String domainBlacklistSchemaId;

        /**
         * <p>The ID of the domain name whitelist approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DomainWhitelistSchemaId")
        public String domainWhitelistSchemaId;

        /**
         * <p>The ID of the endpoint hardening approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("EndpointHardeningSchemaId")
        public String endpointHardeningSchemaId;

        /**
         * <p>The ID of the peripheral control approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("PeripheralBlockSchemaId")
        public String peripheralBlockSchemaId;

        /**
         * <p>The ID of the internal network access control approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("PrivateAccessBlockSchemaId")
        public String privateAccessBlockSchemaId;

        /**
         * <p>The ID of the software blocking approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SoftwareBlockSchemaId")
        public String softwareBlockSchemaId;

        /**
         * <p>The ID of the software hardening approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SoftwareHardeningSchemaId")
        public String softwareHardeningSchemaId;

        public static UpdateApprovalProcessRequestMatchSchemas build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessRequestMatchSchemas self = new UpdateApprovalProcessRequestMatchSchemas();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessRequestMatchSchemas setAppUninstallSchemaId(String appUninstallSchemaId) {
            this.appUninstallSchemaId = appUninstallSchemaId;
            return this;
        }
        public String getAppUninstallSchemaId() {
            return this.appUninstallSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setDeviceRegistrationSchemaId(String deviceRegistrationSchemaId) {
            this.deviceRegistrationSchemaId = deviceRegistrationSchemaId;
            return this;
        }
        public String getDeviceRegistrationSchemaId() {
            return this.deviceRegistrationSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setDlpSendSchemaId(String dlpSendSchemaId) {
            this.dlpSendSchemaId = dlpSendSchemaId;
            return this;
        }
        public String getDlpSendSchemaId() {
            return this.dlpSendSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setDomainBlacklistSchemaId(String domainBlacklistSchemaId) {
            this.domainBlacklistSchemaId = domainBlacklistSchemaId;
            return this;
        }
        public String getDomainBlacklistSchemaId() {
            return this.domainBlacklistSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setDomainWhitelistSchemaId(String domainWhitelistSchemaId) {
            this.domainWhitelistSchemaId = domainWhitelistSchemaId;
            return this;
        }
        public String getDomainWhitelistSchemaId() {
            return this.domainWhitelistSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setEndpointHardeningSchemaId(String endpointHardeningSchemaId) {
            this.endpointHardeningSchemaId = endpointHardeningSchemaId;
            return this;
        }
        public String getEndpointHardeningSchemaId() {
            return this.endpointHardeningSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setPeripheralBlockSchemaId(String peripheralBlockSchemaId) {
            this.peripheralBlockSchemaId = peripheralBlockSchemaId;
            return this;
        }
        public String getPeripheralBlockSchemaId() {
            return this.peripheralBlockSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setPrivateAccessBlockSchemaId(String privateAccessBlockSchemaId) {
            this.privateAccessBlockSchemaId = privateAccessBlockSchemaId;
            return this;
        }
        public String getPrivateAccessBlockSchemaId() {
            return this.privateAccessBlockSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setSoftwareBlockSchemaId(String softwareBlockSchemaId) {
            this.softwareBlockSchemaId = softwareBlockSchemaId;
            return this;
        }
        public String getSoftwareBlockSchemaId() {
            return this.softwareBlockSchemaId;
        }

        public UpdateApprovalProcessRequestMatchSchemas setSoftwareHardeningSchemaId(String softwareHardeningSchemaId) {
            this.softwareHardeningSchemaId = softwareHardeningSchemaId;
            return this;
        }
        public String getSoftwareHardeningSchemaId() {
            return this.softwareHardeningSchemaId;
        }

    }

}
