// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetApprovalProcessResponseBody extends TeaModel {
    /**
     * <p>The approval flow.</p>
     */
    @NameInMap("Process")
    public GetApprovalProcessResponseBodyProcess process;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C81E0B4B-AAEB-5FDD-B27E-3F5AF7EBD7EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApprovalProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalProcessResponseBody self = new GetApprovalProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApprovalProcessResponseBody setProcess(GetApprovalProcessResponseBodyProcess process) {
        this.process = process;
        return this;
    }
    public GetApprovalProcessResponseBodyProcess getProcess() {
        return this.process;
    }

    public GetApprovalProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap extends TeaModel {
        /**
         * <p>The display field.</p>
         * 
         * <strong>example:</strong>
         * <p>名称</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The system field.</p>
         * 
         * <strong>example:</strong>
         * <p>名称</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static GetApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap self = new GetApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public GetApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public GetApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessAppUninstallPolicies extends TeaModel {
        /**
         * <p>The external flow ID.</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The field mapping.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<GetApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of endpoint uninstall policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static GetApprovalProcessResponseBodyProcessAppUninstallPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessAppUninstallPolicies self = new GetApprovalProcessResponseBodyProcessAppUninstallPolicies();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessAppUninstallPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public GetApprovalProcessResponseBodyProcessAppUninstallPolicies setFieldMap(java.util.List<GetApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<GetApprovalProcessResponseBodyProcessAppUninstallPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public GetApprovalProcessResponseBodyProcessAppUninstallPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public GetApprovalProcessResponseBodyProcessAppUninstallPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap extends TeaModel {
        /**
         * <p>The display field.</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The system field.</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static GetApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap self = new GetApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public GetApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public GetApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessDeviceRegistrationPolicies extends TeaModel {
        /**
         * <p>The external flow ID.</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The field mapping.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<GetApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of device registration policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static GetApprovalProcessResponseBodyProcessDeviceRegistrationPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessDeviceRegistrationPolicies self = new GetApprovalProcessResponseBodyProcessDeviceRegistrationPolicies();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessDeviceRegistrationPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public GetApprovalProcessResponseBodyProcessDeviceRegistrationPolicies setFieldMap(java.util.List<GetApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<GetApprovalProcessResponseBodyProcessDeviceRegistrationPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public GetApprovalProcessResponseBodyProcessDeviceRegistrationPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public GetApprovalProcessResponseBodyProcessDeviceRegistrationPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap extends TeaModel {
        /**
         * <p>The display field.</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The system field.</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static GetApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap self = new GetApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public GetApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public GetApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessDlpSendPolicies extends TeaModel {
        /**
         * <p>The external flow ID.</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The field mapping.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<GetApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of file outgoing policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static GetApprovalProcessResponseBodyProcessDlpSendPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessDlpSendPolicies self = new GetApprovalProcessResponseBodyProcessDlpSendPolicies();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessDlpSendPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public GetApprovalProcessResponseBodyProcessDlpSendPolicies setFieldMap(java.util.List<GetApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<GetApprovalProcessResponseBodyProcessDlpSendPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public GetApprovalProcessResponseBodyProcessDlpSendPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public GetApprovalProcessResponseBodyProcessDlpSendPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap extends TeaModel {
        /**
         * <p>The display field.</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The system field.</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static GetApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap self = new GetApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public GetApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public GetApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessDomainBlacklistPolicies extends TeaModel {
        /**
         * <p>The external flow ID.</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The field mapping.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<GetApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of domain name blacklist policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static GetApprovalProcessResponseBodyProcessDomainBlacklistPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessDomainBlacklistPolicies self = new GetApprovalProcessResponseBodyProcessDomainBlacklistPolicies();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessDomainBlacklistPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public GetApprovalProcessResponseBodyProcessDomainBlacklistPolicies setFieldMap(java.util.List<GetApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<GetApprovalProcessResponseBodyProcessDomainBlacklistPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public GetApprovalProcessResponseBodyProcessDomainBlacklistPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public GetApprovalProcessResponseBodyProcessDomainBlacklistPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap extends TeaModel {
        /**
         * <p>The display field.</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The system field.</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static GetApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap self = new GetApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public GetApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public GetApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessDomainWhitelistPolicies extends TeaModel {
        /**
         * <p>The external flow ID.</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The field mapping table.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<GetApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of domain name whitelist policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static GetApprovalProcessResponseBodyProcessDomainWhitelistPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessDomainWhitelistPolicies self = new GetApprovalProcessResponseBodyProcessDomainWhitelistPolicies();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessDomainWhitelistPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public GetApprovalProcessResponseBodyProcessDomainWhitelistPolicies setFieldMap(java.util.List<GetApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<GetApprovalProcessResponseBodyProcessDomainWhitelistPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public GetApprovalProcessResponseBodyProcessDomainWhitelistPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public GetApprovalProcessResponseBodyProcessDomainWhitelistPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap extends TeaModel {
        /**
         * <p>The display field.</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The system field.</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static GetApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap self = new GetApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public GetApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public GetApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessEndpointHardeningPolicies extends TeaModel {
        /**
         * <p>The external flow ID.</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The field mapping.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<GetApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap> fieldMap;

        /**
         * <p>The policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The template ID.</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static GetApprovalProcessResponseBodyProcessEndpointHardeningPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessEndpointHardeningPolicies self = new GetApprovalProcessResponseBodyProcessEndpointHardeningPolicies();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessEndpointHardeningPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public GetApprovalProcessResponseBodyProcessEndpointHardeningPolicies setFieldMap(java.util.List<GetApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<GetApprovalProcessResponseBodyProcessEndpointHardeningPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public GetApprovalProcessResponseBodyProcessEndpointHardeningPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public GetApprovalProcessResponseBodyProcessEndpointHardeningPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessPeripheralBlockPoliciesFieldMap extends TeaModel {
        /**
         * <p>The display field.</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The system field.</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static GetApprovalProcessResponseBodyProcessPeripheralBlockPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessPeripheralBlockPoliciesFieldMap self = new GetApprovalProcessResponseBodyProcessPeripheralBlockPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessPeripheralBlockPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public GetApprovalProcessResponseBodyProcessPeripheralBlockPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public GetApprovalProcessResponseBodyProcessPeripheralBlockPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessPeripheralBlockPolicies extends TeaModel {
        /**
         * <p>The external flow ID.</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The field mapping.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<GetApprovalProcessResponseBodyProcessPeripheralBlockPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of peripheral control policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static GetApprovalProcessResponseBodyProcessPeripheralBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessPeripheralBlockPolicies self = new GetApprovalProcessResponseBodyProcessPeripheralBlockPolicies();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessPeripheralBlockPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public GetApprovalProcessResponseBodyProcessPeripheralBlockPolicies setFieldMap(java.util.List<GetApprovalProcessResponseBodyProcessPeripheralBlockPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<GetApprovalProcessResponseBodyProcessPeripheralBlockPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public GetApprovalProcessResponseBodyProcessPeripheralBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public GetApprovalProcessResponseBodyProcessPeripheralBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap extends TeaModel {
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        @NameInMap("SystemField")
        public String systemField;

        public static GetApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap self = new GetApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public GetApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public GetApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies extends TeaModel {
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        @NameInMap("FieldMap")
        public java.util.List<GetApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap> fieldMap;

        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        @NameInMap("SchemaId")
        public String schemaId;

        public static GetApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies self = new GetApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public GetApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies setFieldMap(java.util.List<GetApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<GetApprovalProcessResponseBodyProcessPrivateAccessBlockPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public GetApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public GetApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessProcessNodes extends TeaModel {
        /**
         * <p>The approver ID.</p>
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
         * <p>王先生</p>
         */
        @NameInMap("Username")
        public String username;

        public static GetApprovalProcessResponseBodyProcessProcessNodes build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessProcessNodes self = new GetApprovalProcessResponseBodyProcessProcessNodes();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessProcessNodes setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public GetApprovalProcessResponseBodyProcessProcessNodes setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap extends TeaModel {
        /**
         * <p>The display field.</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The system field.</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static GetApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap self = new GetApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public GetApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public GetApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessSoftwareBlockPolicies extends TeaModel {
        /**
         * <p>The external flow ID.</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The field mapping.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<GetApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap> fieldMap;

        /**
         * <p>The list of software blocking policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static GetApprovalProcessResponseBodyProcessSoftwareBlockPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessSoftwareBlockPolicies self = new GetApprovalProcessResponseBodyProcessSoftwareBlockPolicies();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessSoftwareBlockPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public GetApprovalProcessResponseBodyProcessSoftwareBlockPolicies setFieldMap(java.util.List<GetApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<GetApprovalProcessResponseBodyProcessSoftwareBlockPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public GetApprovalProcessResponseBodyProcessSoftwareBlockPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public GetApprovalProcessResponseBodyProcessSoftwareBlockPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap extends TeaModel {
        /**
         * <p>The display field.</p>
         */
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

        /**
         * <p>The system field.</p>
         */
        @NameInMap("SystemField")
        public String systemField;

        public static GetApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap self = new GetApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap setDisplayField(String displayField) {
            this.displayField = displayField;
            return this;
        }
        public String getDisplayField() {
            return this.displayField;
        }

        public GetApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap setDisplayFieldValue(String displayFieldValue) {
            this.displayFieldValue = displayFieldValue;
            return this;
        }
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        public GetApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap setSystemField(String systemField) {
            this.systemField = systemField;
            return this;
        }
        public String getSystemField() {
            return this.systemField;
        }

    }

    public static class GetApprovalProcessResponseBodyProcessSoftwareHardeningPolicies extends TeaModel {
        /**
         * <p>The external flow ID.</p>
         */
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        /**
         * <p>The field mapping.</p>
         */
        @NameInMap("FieldMap")
        public java.util.List<GetApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap> fieldMap;

        /**
         * <p>The policy IDs.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The template ID.</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static GetApprovalProcessResponseBodyProcessSoftwareHardeningPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcessSoftwareHardeningPolicies self = new GetApprovalProcessResponseBodyProcessSoftwareHardeningPolicies();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcessSoftwareHardeningPolicies setExternalProcessId(String externalProcessId) {
            this.externalProcessId = externalProcessId;
            return this;
        }
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        public GetApprovalProcessResponseBodyProcessSoftwareHardeningPolicies setFieldMap(java.util.List<GetApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap> fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }
        public java.util.List<GetApprovalProcessResponseBodyProcessSoftwareHardeningPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        public GetApprovalProcessResponseBodyProcessSoftwareHardeningPolicies setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public GetApprovalProcessResponseBodyProcessSoftwareHardeningPolicies setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

    public static class GetApprovalProcessResponseBodyProcess extends TeaModel {
        /**
         * <p>The list of policies associated with endpoint uninstallation.</p>
         */
        @NameInMap("AppUninstallPolicies")
        public GetApprovalProcessResponseBodyProcessAppUninstallPolicies appUninstallPolicies;

        /**
         * <p>The approval type.</p>
         */
        @NameInMap("ApprovalType")
        public Integer approvalType;

        /**
         * <p>The time when the approval flow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-25 10:44:09</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The approval flow description.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一个审批流程</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of policies associated with device registration.</p>
         */
        @NameInMap("DeviceRegistrationPolicies")
        public GetApprovalProcessResponseBodyProcessDeviceRegistrationPolicies deviceRegistrationPolicies;

        /**
         * <p>The list of policies associated with file outgoing.</p>
         */
        @NameInMap("DlpSendPolicies")
        public GetApprovalProcessResponseBodyProcessDlpSendPolicies dlpSendPolicies;

        /**
         * <p>The list of policies associated with the domain name blacklist.</p>
         */
        @NameInMap("DomainBlacklistPolicies")
        public GetApprovalProcessResponseBodyProcessDomainBlacklistPolicies domainBlacklistPolicies;

        /**
         * <p>The list of policies associated with the domain name whitelist.</p>
         */
        @NameInMap("DomainWhitelistPolicies")
        public GetApprovalProcessResponseBodyProcessDomainWhitelistPolicies domainWhitelistPolicies;

        /**
         * <p>The endpoint protection policies.</p>
         */
        @NameInMap("EndpointHardeningPolicies")
        public GetApprovalProcessResponseBodyProcessEndpointHardeningPolicies endpointHardeningPolicies;

        /**
         * <p>The label.</p>
         */
        @NameInMap("EventLabel")
        public String eventLabel;

        /**
         * <p>The external configuration.</p>
         */
        @NameInMap("ExternalConfig")
        public String externalConfig;

        /**
         * <p>The list of policies associated with peripheral control.</p>
         */
        @NameInMap("PeripheralBlockPolicies")
        public GetApprovalProcessResponseBodyProcessPeripheralBlockPolicies peripheralBlockPolicies;

        @NameInMap("PrivateAccessBlockPolicies")
        public GetApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies privateAccessBlockPolicies;

        /**
         * <p>The approval flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-process-35ee09077ee9****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The approval flow name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The list of approval nodes.</p>
         */
        @NameInMap("ProcessNodes")
        public java.util.List<java.util.List<GetApprovalProcessResponseBodyProcessProcessNodes>> processNodes;

        /**
         * <p>The list of policies associated with software blocking.</p>
         */
        @NameInMap("SoftwareBlockPolicies")
        public GetApprovalProcessResponseBodyProcessSoftwareBlockPolicies softwareBlockPolicies;

        /**
         * <p>The software hardening policies.</p>
         */
        @NameInMap("SoftwareHardeningPolicies")
        public GetApprovalProcessResponseBodyProcessSoftwareHardeningPolicies softwareHardeningPolicies;

        public static GetApprovalProcessResponseBodyProcess build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalProcessResponseBodyProcess self = new GetApprovalProcessResponseBodyProcess();
            return TeaModel.build(map, self);
        }

        public GetApprovalProcessResponseBodyProcess setAppUninstallPolicies(GetApprovalProcessResponseBodyProcessAppUninstallPolicies appUninstallPolicies) {
            this.appUninstallPolicies = appUninstallPolicies;
            return this;
        }
        public GetApprovalProcessResponseBodyProcessAppUninstallPolicies getAppUninstallPolicies() {
            return this.appUninstallPolicies;
        }

        public GetApprovalProcessResponseBodyProcess setApprovalType(Integer approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public Integer getApprovalType() {
            return this.approvalType;
        }

        public GetApprovalProcessResponseBodyProcess setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetApprovalProcessResponseBodyProcess setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApprovalProcessResponseBodyProcess setDeviceRegistrationPolicies(GetApprovalProcessResponseBodyProcessDeviceRegistrationPolicies deviceRegistrationPolicies) {
            this.deviceRegistrationPolicies = deviceRegistrationPolicies;
            return this;
        }
        public GetApprovalProcessResponseBodyProcessDeviceRegistrationPolicies getDeviceRegistrationPolicies() {
            return this.deviceRegistrationPolicies;
        }

        public GetApprovalProcessResponseBodyProcess setDlpSendPolicies(GetApprovalProcessResponseBodyProcessDlpSendPolicies dlpSendPolicies) {
            this.dlpSendPolicies = dlpSendPolicies;
            return this;
        }
        public GetApprovalProcessResponseBodyProcessDlpSendPolicies getDlpSendPolicies() {
            return this.dlpSendPolicies;
        }

        public GetApprovalProcessResponseBodyProcess setDomainBlacklistPolicies(GetApprovalProcessResponseBodyProcessDomainBlacklistPolicies domainBlacklistPolicies) {
            this.domainBlacklistPolicies = domainBlacklistPolicies;
            return this;
        }
        public GetApprovalProcessResponseBodyProcessDomainBlacklistPolicies getDomainBlacklistPolicies() {
            return this.domainBlacklistPolicies;
        }

        public GetApprovalProcessResponseBodyProcess setDomainWhitelistPolicies(GetApprovalProcessResponseBodyProcessDomainWhitelistPolicies domainWhitelistPolicies) {
            this.domainWhitelistPolicies = domainWhitelistPolicies;
            return this;
        }
        public GetApprovalProcessResponseBodyProcessDomainWhitelistPolicies getDomainWhitelistPolicies() {
            return this.domainWhitelistPolicies;
        }

        public GetApprovalProcessResponseBodyProcess setEndpointHardeningPolicies(GetApprovalProcessResponseBodyProcessEndpointHardeningPolicies endpointHardeningPolicies) {
            this.endpointHardeningPolicies = endpointHardeningPolicies;
            return this;
        }
        public GetApprovalProcessResponseBodyProcessEndpointHardeningPolicies getEndpointHardeningPolicies() {
            return this.endpointHardeningPolicies;
        }

        public GetApprovalProcessResponseBodyProcess setEventLabel(String eventLabel) {
            this.eventLabel = eventLabel;
            return this;
        }
        public String getEventLabel() {
            return this.eventLabel;
        }

        public GetApprovalProcessResponseBodyProcess setExternalConfig(String externalConfig) {
            this.externalConfig = externalConfig;
            return this;
        }
        public String getExternalConfig() {
            return this.externalConfig;
        }

        public GetApprovalProcessResponseBodyProcess setPeripheralBlockPolicies(GetApprovalProcessResponseBodyProcessPeripheralBlockPolicies peripheralBlockPolicies) {
            this.peripheralBlockPolicies = peripheralBlockPolicies;
            return this;
        }
        public GetApprovalProcessResponseBodyProcessPeripheralBlockPolicies getPeripheralBlockPolicies() {
            return this.peripheralBlockPolicies;
        }

        public GetApprovalProcessResponseBodyProcess setPrivateAccessBlockPolicies(GetApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies privateAccessBlockPolicies) {
            this.privateAccessBlockPolicies = privateAccessBlockPolicies;
            return this;
        }
        public GetApprovalProcessResponseBodyProcessPrivateAccessBlockPolicies getPrivateAccessBlockPolicies() {
            return this.privateAccessBlockPolicies;
        }

        public GetApprovalProcessResponseBodyProcess setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public GetApprovalProcessResponseBodyProcess setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public GetApprovalProcessResponseBodyProcess setProcessNodes(java.util.List<java.util.List<GetApprovalProcessResponseBodyProcessProcessNodes>> processNodes) {
            this.processNodes = processNodes;
            return this;
        }
        public java.util.List<java.util.List<GetApprovalProcessResponseBodyProcessProcessNodes>> getProcessNodes() {
            return this.processNodes;
        }

        public GetApprovalProcessResponseBodyProcess setSoftwareBlockPolicies(GetApprovalProcessResponseBodyProcessSoftwareBlockPolicies softwareBlockPolicies) {
            this.softwareBlockPolicies = softwareBlockPolicies;
            return this;
        }
        public GetApprovalProcessResponseBodyProcessSoftwareBlockPolicies getSoftwareBlockPolicies() {
            return this.softwareBlockPolicies;
        }

        public GetApprovalProcessResponseBodyProcess setSoftwareHardeningPolicies(GetApprovalProcessResponseBodyProcessSoftwareHardeningPolicies softwareHardeningPolicies) {
            this.softwareHardeningPolicies = softwareHardeningPolicies;
            return this;
        }
        public GetApprovalProcessResponseBodyProcessSoftwareHardeningPolicies getSoftwareHardeningPolicies() {
            return this.softwareHardeningPolicies;
        }

    }

}
