// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalProcessResponseBody extends TeaModel {
    /**
     * <p>The approval process.</p>
     */
    @NameInMap("Process")
    public UpdateApprovalProcessResponseBodyProcess process;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7E9D7ACD-53D5-56EF-A913-79D148D06299</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApprovalProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApprovalProcessResponseBody self = new UpdateApprovalProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApprovalProcessResponseBody setProcess(UpdateApprovalProcessResponseBodyProcess process) {
        this.process = process;
        return this;
    }
    public UpdateApprovalProcessResponseBodyProcess getProcess() {
        return this.process;
    }

    public UpdateApprovalProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form.</p>
         * 
         * <strong>example:</strong>
         * <p>Reason for reporting</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the control in the external approval form. The value is in the Type%%%Control ID format.</p>
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

        public static UpdateApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap self = new UpdateApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies extends TeaModel {
        /**
         * <p>The ID of the external approval process. If the approval type is 1 (DingTalk) or 3 (Lark), the process code from the external approval platform is returned. For other approval types, an empty value is returned.</p>
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
        public java.util.List<UpdateApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of endpoint uninstallation policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies self = new UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies setFieldMap(java.util.List<UpdateApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form.</p>
         * 
         * <strong>example:</strong>
         * <p>Report domain name</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the control in the external approval form. The value is in the Type%%%Control ID format.</p>
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

        public static UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap self = new UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies extends TeaModel {
        /**
         * <p>The ID of the external approval process. If the approval type is 1 (DingTalk) or 3 (Lark), the process code from the external approval platform is returned. For other approval types, an empty value is returned.</p>
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
        public java.util.List<UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of device registration policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies self = new UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies setFieldMap(java.util.List<UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form.</p>
         * 
         * <strong>example:</strong>
         * <p>File name</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the control in the external approval form. The value is in the Type%%%Control ID format.</p>
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

        public static UpdateApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap self = new UpdateApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessDlpSendPolicies extends TeaModel {
        /**
         * <p>The ID of the external approval process. If the approval type is 1 (DingTalk) or 3 (Lark), the process code from the external approval platform is returned. For other approval types, an empty value is returned.</p>
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
        public java.util.List<UpdateApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of outbound file transfer policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessDlpSendPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessDlpSendPolicies self = new UpdateApprovalProcessResponseBodyProcessDlpSendPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessDlpSendPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessResponseBodyProcessDlpSendPolicies setFieldMap(java.util.List<UpdateApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessResponseBodyProcessDlpSendPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessDlpSendPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form.</p>
         * 
         * <strong>example:</strong>
         * <p>Report website access</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the control in the external approval form. The value is in the Type%%%Control ID format.</p>
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

        public static UpdateApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap self = new UpdateApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies extends TeaModel {
        /**
         * <p>The ID of the external approval process. If the approval type is 1 (DingTalk) or 3 (Lark), the process code from the external approval platform is returned. For other approval types, an empty value is returned.</p>
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
        public java.util.List<UpdateApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of domain name blacklist policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies self = new UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies setFieldMap(java.util.List<UpdateApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form.</p>
         * 
         * <strong>example:</strong>
         * <p>Report website access</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the control in the external approval form. The value is in the Type%%%Control ID format.</p>
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

        public static UpdateApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap self = new UpdateApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies extends TeaModel {
        /**
         * <p>The ID of the external approval process. If the approval type is 1 (DingTalk) or 3 (Lark), the process code from the external approval platform is returned. For other approval types, an empty value is returned.</p>
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
        public java.util.List<UpdateApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of domain name whitelist policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies self = new UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies setFieldMap(java.util.List<UpdateApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form.</p>
         * 
         * <strong>example:</strong>
         * <p>Process name</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the control in the external approval form. The value is in the Type%%%Control ID format.</p>
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

        public static UpdateApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap self = new UpdateApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessEndpointHardeningPolicies extends TeaModel {
        /**
         * <p>The ID of the external approval process. If the approval type is 1 (DingTalk) or 3 (Lark), the process code from the external approval platform is returned. For other approval types, an empty value is returned.</p>
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
        public java.util.List<UpdateApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of endpoint hardening policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessEndpointHardeningPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessEndpointHardeningPolicies self = new UpdateApprovalProcessResponseBodyProcessEndpointHardeningPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessEndpointHardeningPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessResponseBodyProcessEndpointHardeningPolicies setFieldMap(java.util.List<UpdateApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessResponseBodyProcessEndpointHardeningPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessEndpointHardeningPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessPeripheraBlockPoliciesFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form.</p>
         * 
         * <strong>example:</strong>
         * <p>Operating system</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the control in the external approval form. The value is in the Type%%%Control ID format.</p>
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

        public static UpdateApprovalProcessResponseBodyProcessPeripheraBlockPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessPeripheraBlockPoliciesFieldMap self = new UpdateApprovalProcessResponseBodyProcessPeripheraBlockPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies extends TeaModel {
        /**
         * <p>The ID of the external approval process. If the approval type is 1 (DingTalk) or 3 (Lark), the process code from the external approval platform is returned. For other approval types, an empty value is returned.</p>
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
        public java.util.List<UpdateApprovalProcessResponseBodyProcessPeripheraBlockPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of peripheral control policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies self = new UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies setFieldMap(java.util.List<UpdateApprovalProcessResponseBodyProcessPeripheraBlockPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessResponseBodyProcessPeripheraBlockPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form.</p>
         * 
         * <strong>example:</strong>
         * <p>Reported application</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the control in the external approval form. The value is in the Type%%%Control ID format.</p>
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

        public static UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap self = new UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies extends TeaModel {
        /**
         * <p>The ID of the external approval process. If the approval type is 1 (DingTalk) or 3 (Lark), the process code from the external approval platform is returned. For other approval types, an empty value is returned.</p>
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
        public java.util.List<UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of internal network access control policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies self = new UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies setFieldMap(java.util.List<UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessProcessNodes extends TeaModel {
        /**
         * <p>The ID of the approver.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>The username of the approver.</p>
         * 
         * <strong>example:</strong>
         * <p>Mr. Wang</p>
         */
        @NameInMap("Username")
        public String username;

        public static UpdateApprovalProcessResponseBodyProcessProcessNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessProcessNodes self = new UpdateApprovalProcessResponseBodyProcessProcessNodes();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessProcessNodes setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public UpdateApprovalProcessResponseBodyProcessProcessNodes setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form.</p>
         * 
         * <strong>example:</strong>
         * <p>Report software</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the control in the external approval form. The value is in the Type%%%Control ID format.</p>
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

        public static UpdateApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap self = new UpdateApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies extends TeaModel {
        /**
         * <p>The ID of the external approval process. If the approval type is 1 (DingTalk) or 3 (Lark), the process code from the external approval platform is returned. For other approval types, an empty value is returned.</p>
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
        public java.util.List<UpdateApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of software block policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies self = new UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies setFieldMap(java.util.List<UpdateApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap extends TeaModel {
        /**
         * <p>The name of the control in the external approval form.</p>
         * 
         * <strong>example:</strong>
         * <p>Process name</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        /**
         * <p>The type and identifier of the control in the external approval form. The value is in the Type%%%Control ID format.</p>
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

        public static UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap self = new UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies extends TeaModel {
        /**
         * <p>The ID of the external approval process. If the approval type is 1 (DingTalk) or 3 (Lark), the process code from the external approval platform is returned. For other approval types, an empty value is returned.</p>
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
        public java.util.List<UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of software hardening policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies self = new UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies setFieldMap(java.util.List<UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class UpdateApprovalProcessResponseBodyProcess extends TeaModel {
        /**
         * <p>The list of policies associated with endpoint uninstallation.</p>
         */
        @NameInMap("AppUninstallPolicies")
        public UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies appUninstallPolicies;

        /**
         * <p>The approval type. Valid values:</p>
         * <ul>
         * <li>0: Built-in approval.</li>
         * <li>1: DingTalk approval.</li>
         * <li>2: WeCom approval.</li>
         * <li>3: Lark approval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApprovalType")
        public Integer approvalType;

        /**
         * <p>The time when the approval process was created. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11 15:31:39</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>Office endpoint software installation and uninstallation approval process</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of policies associated with device registration.</p>
         */
        @NameInMap("DeviceRegistrationPolicies")
        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies deviceRegistrationPolicies;

        /**
         * <p>The list of policies associated with outbound file transfer.</p>
         */
        @NameInMap("DlpSendPolicies")
        public UpdateApprovalProcessResponseBodyProcessDlpSendPolicies dlpSendPolicies;

        /**
         * <p>The list of policies associated with the domain name blacklist.</p>
         */
        @NameInMap("DomainBlacklistPolicies")
        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies domainBlacklistPolicies;

        /**
         * <p>The list of policies associated with the domain name whitelist.</p>
         */
        @NameInMap("DomainWhitelistPolicies")
        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies domainWhitelistPolicies;

        /**
         * <p>The list of associated endpoint hardening policies.</p>
         */
        @NameInMap("EndpointHardeningPolicies")
        public UpdateApprovalProcessResponseBodyProcessEndpointHardeningPolicies endpointHardeningPolicies;

        /**
         * <p>The event callback URL. This field returns the complete event callback URL of the external platform when the approval type is 1 (DingTalk approval) or 3 (Lark approval). For other approval types, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://callback.example.com/sase/api/v1/approval/dingtalk/callback/9m4e2mr0ui3e8a21">https://callback.example.com/sase/api/v1/approval/dingtalk/callback/9m4e2mr0ui3e8a21</a>****</p>
         */
        @NameInMap("EventLabel")
        public String eventLabel;

        /**
         * <p>The external approval configuration. This field contains the integration information for the external approval platform when the approval type is 1 (DingTalk approval) or 3 (Lark approval). For other approval types, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appKey&quot;:&quot;dingn1a2b3c4d5e6f****&quot;,&quot;appSecret&quot;:&quot;f9c8e7d6a5b4c3d2e1f0a9b8c7d6e5f4a3b2c1d0e9f8a7b6c5d4e3f2a1b0****&quot;,&quot;eventVerifyToken&quot;:&quot;7a8b9c0d1e2f3a4b5c6d7e8f9a0b****&quot;,&quot;eventAesKey&quot;:&quot;1a2b3c4d5e6f7g8h9i0j1k2l3m4n5o6p7q8r9s0t****&quot;}</p>
         */
        @NameInMap("ExternalConfig")
        public String externalConfig;

        /**
         * <p>The list of policies associated with peripheral control.</p>
         */
        @NameInMap("PeripheraBlockPolicies")
        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies peripheraBlockPolicies;

        /**
         * <p>The list of associated internal network access control policies.</p>
         */
        @NameInMap("PrivateAccessBlockPolicies")
        public UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies privateAccessBlockPolicies;

        /**
         * <p>The ID of the approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-process-2677fcf063f5****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The name of the approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>Endpoint software installation approval process</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The list of approval nodes.</p>
         */
        @NameInMap("ProcessNodes")
        public java.util.List<java.util.List<UpdateApprovalProcessResponseBodyProcessProcessNodes>> processNodes;

        /**
         * <p>The list of policies associated with software blocking.</p>
         */
        @NameInMap("SoftwareBlockPolicies")
        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies softwareBlockPolicies;

        /**
         * <p>The list of associated software hardening policies.</p>
         */
        @NameInMap("SoftwareHardeningPolicies")
        public UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies softwareHardeningPolicies;

        public static UpdateApprovalProcessResponseBodyProcess build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalProcessResponseBodyProcess self = new UpdateApprovalProcessResponseBodyProcess();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalProcessResponseBodyProcess setAppUninstallPolicies(UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies appUninstallPolicies) {
            this.appUninstallPolicies = appUninstallPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessAppUninstallPolicies getAppUninstallPolicies() {
            return this.appUninstallPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setApprovalType(Integer approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public Integer getApprovalType() {
            return this.approvalType;
        }

        public UpdateApprovalProcessResponseBodyProcess setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateApprovalProcessResponseBodyProcess setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApprovalProcessResponseBodyProcess setDeviceRegistrationPolicies(UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies deviceRegistrationPolicies) {
            this.deviceRegistrationPolicies = deviceRegistrationPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessDeviceRegistrationPolicies getDeviceRegistrationPolicies() {
            return this.deviceRegistrationPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setDlpSendPolicies(UpdateApprovalProcessResponseBodyProcessDlpSendPolicies dlpSendPolicies) {
            this.dlpSendPolicies = dlpSendPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessDlpSendPolicies getDlpSendPolicies() {
            return this.dlpSendPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setDomainBlacklistPolicies(UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies domainBlacklistPolicies) {
            this.domainBlacklistPolicies = domainBlacklistPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessDomainBlacklistPolicies getDomainBlacklistPolicies() {
            return this.domainBlacklistPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setDomainWhitelistPolicies(UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies domainWhitelistPolicies) {
            this.domainWhitelistPolicies = domainWhitelistPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessDomainWhitelistPolicies getDomainWhitelistPolicies() {
            return this.domainWhitelistPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setEndpointHardeningPolicies(UpdateApprovalProcessResponseBodyProcessEndpointHardeningPolicies endpointHardeningPolicies) {
            this.endpointHardeningPolicies = endpointHardeningPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessEndpointHardeningPolicies getEndpointHardeningPolicies() {
            return this.endpointHardeningPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setEventLabel(String eventLabel) {
            this.eventLabel = eventLabel;
            return this;
        }
        public String getEventLabel() {
            return this.eventLabel;
        }

        public UpdateApprovalProcessResponseBodyProcess setExternalConfig(String externalConfig) {
            this.externalConfig = externalConfig;
            return this;
        }
        public String getExternalConfig() {
            return this.externalConfig;
        }

        public UpdateApprovalProcessResponseBodyProcess setPeripheraBlockPolicies(UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies peripheraBlockPolicies) {
            this.peripheraBlockPolicies = peripheraBlockPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessPeripheraBlockPolicies getPeripheraBlockPolicies() {
            return this.peripheraBlockPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setPrivateAccessBlockPolicies(UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies privateAccessBlockPolicies) {
            this.privateAccessBlockPolicies = privateAccessBlockPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies getPrivateAccessBlockPolicies() {
            return this.privateAccessBlockPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public UpdateApprovalProcessResponseBodyProcess setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public UpdateApprovalProcessResponseBodyProcess setProcessNodes(java.util.List<java.util.List<UpdateApprovalProcessResponseBodyProcessProcessNodes>> processNodes) {
            this.processNodes = processNodes;
            return this;
        }
        public java.util.List<java.util.List<UpdateApprovalProcessResponseBodyProcessProcessNodes>> getProcessNodes() {
            return this.processNodes;
        }

        public UpdateApprovalProcessResponseBodyProcess setSoftwareBlockPolicies(UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies softwareBlockPolicies) {
            this.softwareBlockPolicies = softwareBlockPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessSoftwareBlockPolicies getSoftwareBlockPolicies() {
            return this.softwareBlockPolicies;
        }

        public UpdateApprovalProcessResponseBodyProcess setSoftwareHardeningPolicies(UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies softwareHardeningPolicies) {
            this.softwareHardeningPolicies = softwareHardeningPolicies;
            return this;
        }
        public UpdateApprovalProcessResponseBodyProcessSoftwareHardeningPolicies getSoftwareHardeningPolicies() {
            return this.softwareHardeningPolicies;
        }

    }

}
