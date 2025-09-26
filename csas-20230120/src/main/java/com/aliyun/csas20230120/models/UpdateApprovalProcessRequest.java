// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalProcessRequest extends TeaModel {
    @NameInMap("ApprovalType")
    public Integer approvalType;

    @NameInMap("Description")
    public String description;

    @NameInMap("EventLabel")
    public String eventLabel;

    @NameInMap("ExternalConfig")
    public String externalConfig;

    @NameInMap("MatchSchemaConfigs")
    public UpdateApprovalProcessRequestMatchSchemaConfigs matchSchemaConfigs;

    @NameInMap("MatchSchemas")
    public UpdateApprovalProcessRequestMatchSchemas matchSchemas;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-process-f16bf74b2b29****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    @NameInMap("ProcessName")
    public String processName;

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
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

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
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfigFieldMap> fieldMap;

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
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

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
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfigFieldMap> fieldMap;

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
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

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
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfigFieldMap> fieldMap;

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
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

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
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfigFieldMap> fieldMap;

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
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

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
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfigFieldMap> fieldMap;

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
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

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
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfigFieldMap> fieldMap;

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
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

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
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfigFieldMap> fieldMap;

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

    public static class UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfigFieldMap extends TeaModel {
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

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
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfigFieldMap> fieldMap;

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
        @NameInMap("DisplayField")
        public String displayField;

        @NameInMap("DisplayFieldValue")
        public String displayFieldValue;

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
        @NameInMap("ExternalProcessId")
        public String externalProcessId;

        @NameInMap("FieldMap")
        public java.util.List<UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareHardeningSchemaConfigFieldMap> fieldMap;

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
        @NameInMap("AppUninstallSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsAppUninstallSchemaConfig appUninstallSchemaConfig;

        @NameInMap("DeviceRegistrationSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsDeviceRegistrationSchemaConfig deviceRegistrationSchemaConfig;

        @NameInMap("DlpSendSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsDlpSendSchemaConfig dlpSendSchemaConfig;

        @NameInMap("DomainBlacklistSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainBlacklistSchemaConfig domainBlacklistSchemaConfig;

        @NameInMap("DomainWhitelistSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsDomainWhitelistSchemaConfig domainWhitelistSchemaConfig;

        @NameInMap("EndpointHardeningSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsEndpointHardeningSchemaConfig endpointHardeningSchemaConfig;

        @NameInMap("PeripheralBlockSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsPeripheralBlockSchemaConfig peripheralBlockSchemaConfig;

        @NameInMap("SoftwareBlockSchemaConfig")
        public UpdateApprovalProcessRequestMatchSchemaConfigsSoftwareBlockSchemaConfig softwareBlockSchemaConfig;

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
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("AppUninstallSchemaId")
        public String appUninstallSchemaId;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DeviceRegistrationSchemaId")
        public String deviceRegistrationSchemaId;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DlpSendSchemaId")
        public String dlpSendSchemaId;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DomainBlacklistSchemaId")
        public String domainBlacklistSchemaId;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("DomainWhitelistSchemaId")
        public String domainWhitelistSchemaId;

        @NameInMap("EndpointHardeningSchemaId")
        public String endpointHardeningSchemaId;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("PeripheralBlockSchemaId")
        public String peripheralBlockSchemaId;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SoftwareBlockSchemaId")
        public String softwareBlockSchemaId;

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
