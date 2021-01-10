// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeConnectorCapabilityResponseBody extends TeaModel {
    @NameInMap("Connections")
    public java.util.List<DescribeConnectorCapabilityResponseBodyConnections> connections;

    @NameInMap("Connector")
    public DescribeConnectorCapabilityResponseBodyConnector connector;

    @NameInMap("Type")
    public String type;

    @NameInMap("Parameters")
    public java.util.List<DescribeConnectorCapabilityResponseBodyParameters> parameters;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("DocumentUrl")
    public String documentUrl;

    @NameInMap("Visibility")
    public String visibility;

    @NameInMap("DefaultInputs")
    public String defaultInputs;

    @NameInMap("System")
    public Boolean system;

    @NameInMap("Name")
    public String name;

    @NameInMap("Responses")
    public java.util.List<DescribeConnectorCapabilityResponseBodyResponses> responses;

    public static DescribeConnectorCapabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectorCapabilityResponseBody self = new DescribeConnectorCapabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConnectorCapabilityResponseBody setConnections(java.util.List<DescribeConnectorCapabilityResponseBodyConnections> connections) {
        this.connections = connections;
        return this;
    }
    public java.util.List<DescribeConnectorCapabilityResponseBodyConnections> getConnections() {
        return this.connections;
    }

    public DescribeConnectorCapabilityResponseBody setConnector(DescribeConnectorCapabilityResponseBodyConnector connector) {
        this.connector = connector;
        return this;
    }
    public DescribeConnectorCapabilityResponseBodyConnector getConnector() {
        return this.connector;
    }

    public DescribeConnectorCapabilityResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeConnectorCapabilityResponseBody setParameters(java.util.List<DescribeConnectorCapabilityResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<DescribeConnectorCapabilityResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public DescribeConnectorCapabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConnectorCapabilityResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DescribeConnectorCapabilityResponseBody setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
        return this;
    }
    public String getDocumentUrl() {
        return this.documentUrl;
    }

    public DescribeConnectorCapabilityResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public DescribeConnectorCapabilityResponseBody setDefaultInputs(String defaultInputs) {
        this.defaultInputs = defaultInputs;
        return this;
    }
    public String getDefaultInputs() {
        return this.defaultInputs;
    }

    public DescribeConnectorCapabilityResponseBody setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

    public DescribeConnectorCapabilityResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeConnectorCapabilityResponseBody setResponses(java.util.List<DescribeConnectorCapabilityResponseBodyResponses> responses) {
        this.responses = responses;
        return this;
    }
    public java.util.List<DescribeConnectorCapabilityResponseBodyResponses> getResponses() {
        return this.responses;
    }

    public static class DescribeConnectorCapabilityResponseBodyConnections extends TeaModel {
        @NameInMap("Definition")
        public String definition;

        @NameInMap("ConnectionName")
        public String connectionName;

        @NameInMap("Content")
        public String content;

        public static DescribeConnectorCapabilityResponseBodyConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectorCapabilityResponseBodyConnections self = new DescribeConnectorCapabilityResponseBodyConnections();
            return TeaModel.build(map, self);
        }

        public DescribeConnectorCapabilityResponseBodyConnections setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public DescribeConnectorCapabilityResponseBodyConnections setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public DescribeConnectorCapabilityResponseBodyConnections setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DescribeConnectorCapabilityResponseBodyConnectorIcon extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeConnectorCapabilityResponseBodyConnectorIcon build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectorCapabilityResponseBodyConnectorIcon self = new DescribeConnectorCapabilityResponseBodyConnectorIcon();
            return TeaModel.build(map, self);
        }

        public DescribeConnectorCapabilityResponseBodyConnectorIcon setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeConnectorCapabilityResponseBodyConnectorIcon setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeConnectorCapabilityResponseBodyConnectorConnectionParameters extends TeaModel {
        @NameInMap("Type")
        public String type;

        public static DescribeConnectorCapabilityResponseBodyConnectorConnectionParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectorCapabilityResponseBodyConnectorConnectionParameters self = new DescribeConnectorCapabilityResponseBodyConnectorConnectionParameters();
            return TeaModel.build(map, self);
        }

        public DescribeConnectorCapabilityResponseBodyConnectorConnectionParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeConnectorCapabilityResponseBodyConnector extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("DefaultPolicy")
        public java.util.List<String> defaultPolicy;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("Icon")
        public DescribeConnectorCapabilityResponseBodyConnectorIcon icon;

        @NameInMap("ConnectorId")
        public String connectorId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RamMap")
        public String ramMap;

        @NameInMap("Description")
        public String description;

        @NameInMap("BrandColor")
        public String brandColor;

        @NameInMap("Category")
        public String category;

        @NameInMap("ConnectionParameters")
        public DescribeConnectorCapabilityResponseBodyConnectorConnectionParameters connectionParameters;

        @NameInMap("Name")
        public String name;

        public static DescribeConnectorCapabilityResponseBodyConnector build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectorCapabilityResponseBodyConnector self = new DescribeConnectorCapabilityResponseBodyConnector();
            return TeaModel.build(map, self);
        }

        public DescribeConnectorCapabilityResponseBodyConnector setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeConnectorCapabilityResponseBodyConnector setDefaultPolicy(java.util.List<String> defaultPolicy) {
            this.defaultPolicy = defaultPolicy;
            return this;
        }
        public java.util.List<String> getDefaultPolicy() {
            return this.defaultPolicy;
        }

        public DescribeConnectorCapabilityResponseBodyConnector setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public DescribeConnectorCapabilityResponseBodyConnector setIcon(DescribeConnectorCapabilityResponseBodyConnectorIcon icon) {
            this.icon = icon;
            return this;
        }
        public DescribeConnectorCapabilityResponseBodyConnectorIcon getIcon() {
            return this.icon;
        }

        public DescribeConnectorCapabilityResponseBodyConnector setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public DescribeConnectorCapabilityResponseBodyConnector setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeConnectorCapabilityResponseBodyConnector setRamMap(String ramMap) {
            this.ramMap = ramMap;
            return this;
        }
        public String getRamMap() {
            return this.ramMap;
        }

        public DescribeConnectorCapabilityResponseBodyConnector setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConnectorCapabilityResponseBodyConnector setBrandColor(String brandColor) {
            this.brandColor = brandColor;
            return this;
        }
        public String getBrandColor() {
            return this.brandColor;
        }

        public DescribeConnectorCapabilityResponseBodyConnector setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeConnectorCapabilityResponseBodyConnector setConnectionParameters(DescribeConnectorCapabilityResponseBodyConnectorConnectionParameters connectionParameters) {
            this.connectionParameters = connectionParameters;
            return this;
        }
        public DescribeConnectorCapabilityResponseBodyConnectorConnectionParameters getConnectionParameters() {
            return this.connectionParameters;
        }

        public DescribeConnectorCapabilityResponseBodyConnector setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeConnectorCapabilityResponseBodyParametersSubParameters extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Name")
        public String name;

        public static DescribeConnectorCapabilityResponseBodyParametersSubParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectorCapabilityResponseBodyParametersSubParameters self = new DescribeConnectorCapabilityResponseBodyParametersSubParameters();
            return TeaModel.build(map, self);
        }

        public DescribeConnectorCapabilityResponseBodyParametersSubParameters setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeConnectorCapabilityResponseBodyParametersSubParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeConnectorCapabilityResponseBodyParametersSubParameters setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public DescribeConnectorCapabilityResponseBodyParametersSubParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeConnectorCapabilityResponseBodyParameters extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Type")
        public String type;

        @NameInMap("PlaceHolder")
        public String placeHolder;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("Example")
        public String example;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("SubType")
        public String subType;

        @NameInMap("EnumDisplayName")
        public java.util.List<String> enumDisplayName;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Description")
        public String description;

        @NameInMap("Position")
        public String position;

        @NameInMap("Enum")
        public java.util.List<String> _enum;

        @NameInMap("SubParameters")
        public java.util.List<DescribeConnectorCapabilityResponseBodyParametersSubParameters> subParameters;

        @NameInMap("Name")
        public String name;

        public static DescribeConnectorCapabilityResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectorCapabilityResponseBodyParameters self = new DescribeConnectorCapabilityResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeConnectorCapabilityResponseBodyParameters setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeConnectorCapabilityResponseBodyParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeConnectorCapabilityResponseBodyParameters setPlaceHolder(String placeHolder) {
            this.placeHolder = placeHolder;
            return this;
        }
        public String getPlaceHolder() {
            return this.placeHolder;
        }

        public DescribeConnectorCapabilityResponseBodyParameters setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeConnectorCapabilityResponseBodyParameters setExample(String example) {
            this.example = example;
            return this;
        }
        public String getExample() {
            return this.example;
        }

        public DescribeConnectorCapabilityResponseBodyParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeConnectorCapabilityResponseBodyParameters setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public DescribeConnectorCapabilityResponseBodyParameters setEnumDisplayName(java.util.List<String> enumDisplayName) {
            this.enumDisplayName = enumDisplayName;
            return this;
        }
        public java.util.List<String> getEnumDisplayName() {
            return this.enumDisplayName;
        }

        public DescribeConnectorCapabilityResponseBodyParameters setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public DescribeConnectorCapabilityResponseBodyParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConnectorCapabilityResponseBodyParameters setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public DescribeConnectorCapabilityResponseBodyParameters set_enum(java.util.List<String> _enum) {
            this._enum = _enum;
            return this;
        }
        public java.util.List<String> get_enum() {
            return this._enum;
        }

        public DescribeConnectorCapabilityResponseBodyParameters setSubParameters(java.util.List<DescribeConnectorCapabilityResponseBodyParametersSubParameters> subParameters) {
            this.subParameters = subParameters;
            return this;
        }
        public java.util.List<DescribeConnectorCapabilityResponseBodyParametersSubParameters> getSubParameters() {
            return this.subParameters;
        }

        public DescribeConnectorCapabilityResponseBodyParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeConnectorCapabilityResponseBodyResponses extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("Example")
        public String example;

        @NameInMap("Name")
        public String name;

        public static DescribeConnectorCapabilityResponseBodyResponses build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectorCapabilityResponseBodyResponses self = new DescribeConnectorCapabilityResponseBodyResponses();
            return TeaModel.build(map, self);
        }

        public DescribeConnectorCapabilityResponseBodyResponses setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeConnectorCapabilityResponseBodyResponses setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeConnectorCapabilityResponseBodyResponses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConnectorCapabilityResponseBodyResponses setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribeConnectorCapabilityResponseBodyResponses setExample(String example) {
            this.example = example;
            return this;
        }
        public String getExample() {
            return this.example;
        }

        public DescribeConnectorCapabilityResponseBodyResponses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
