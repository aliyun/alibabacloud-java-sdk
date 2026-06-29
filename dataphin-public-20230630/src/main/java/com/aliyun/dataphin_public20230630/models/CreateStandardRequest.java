// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardRequest extends TeaModel {
    /**
     * <p>The create command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateStandardRequestCreateCommand createCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateStandardRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardRequest self = new CreateStandardRequest();
        return TeaModel.build(map, self);
    }

    public CreateStandardRequest setCreateCommand(CreateStandardRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateStandardRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateStandardRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateStandardRequestCreateCommandEffectiveTimeConfig extends TeaModel {
        /**
         * <p>The end of the effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-30 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start of the effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The effective period type. Valid values:</p>
         * <ul>
         * <li>FOREVER: permanent.</li>
         * <li>TIME_PERIOD: time period.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TIME_PERIOD</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateStandardRequestCreateCommandEffectiveTimeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRequestCreateCommandEffectiveTimeConfig self = new CreateStandardRequestCreateCommandEffectiveTimeConfig();
            return TeaModel.build(map, self);
        }

        public CreateStandardRequestCreateCommandEffectiveTimeConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateStandardRequestCreateCommandEffectiveTimeConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateStandardRequestCreateCommandEffectiveTimeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig extends TeaModel {
        /**
         * <p>The field to check.</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>Specifies whether the check is case-sensitive.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("IsCaseSensitive")
        public Boolean isCaseSensitive;

        /**
         * <p>The monitoring method. Valid values:</p>
         * <ul>
         * <li>METADATA: metadata monitoring.</li>
         * <li>QUALITY: data quality monitoring.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>METADATA</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig self = new CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig();
            return TeaModel.build(map, self);
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig setIsCaseSensitive(Boolean isCaseSensitive) {
            this.isCaseSensitive = isCaseSensitive;
            return this;
        }
        public Boolean getIsCaseSensitive() {
            return this.isCaseSensitive;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate extends TeaModel {
        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The template name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template source. Valid values:</p>
         * <ul>
         * <li>FROM_SYSTEM: system template.</li>
         * <li>CUSTOMIZED: custom template.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate self = new CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate();
            return TeaModel.build(map, self);
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList extends TeaModel {
        /**
         * <p>The configuration item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The configuration item value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList self = new CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList();
            return TeaModel.build(map, self);
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList extends TeaModel {
        /**
         * <p>The validation configuration ID. This ID is randomly generated by the business and must be unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The metric. This parameter is required when the validation type is EXPRESSION.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The metric name. This parameter is required when the validation type is EXPRESSION.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>If the validation type is EXPRESSION, valid values:</p>
         * <ul>
         * <li>EQUAL: equal to.</li>
         * <li>NOT_EQUAL: not equal to.</li>
         * <li>LARGER: greater than.</li>
         * <li>LARGE_OR_EQUAL: greater than or equal to.</li>
         * <li>SMALLER: less than.</li>
         * <li>SMALLER_OR_EQUAL: less than or equal to.</li>
         * </ul>
         * <p>If the validation type is RELATION, valid values:</p>
         * <ul>
         * <li>AND: and.</li>
         * <li>OR: or.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The parent validation configuration ID. The parent rule validation type can only be RELATION.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The rule validation type. Valid values:</p>
         * <ul>
         * <li>RELATION: relation.</li>
         * <li>EXPRESSION: expression.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RELATION</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value to compare.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList self = new CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList();
            return TeaModel.build(map, self);
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList extends TeaModel {
        /**
         * <p>The associated attribute ID.</p>
         * 
         * <strong>example:</strong>
         * <p>112</p>
         */
        @NameInMap("AttributeId")
        public Long attributeId;

        /**
         * <p>The monitoring configuration for the associated attribute.</p>
         */
        @NameInMap("AttributeMonitorConfig")
        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig attributeMonitorConfig;

        /**
         * <p>The attribute name.</p>
         * 
         * <strong>example:</strong>
         * <p>teset</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The monitoring configuration ID. If this parameter is left empty, a new monitoring configuration is created. If an existing monitoring configuration ID is specified, the corresponding monitoring configuration is updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The method used to add the monitoring configuration. Valid values:</p>
         * <ul>
         * <li>BY_USER: manually added.</li>
         * <li>BY_SYSTEM_ATTRIBUTE: preset by system attribute.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_SYSTEM_ATTRIBUTE</p>
         */
        @NameInMap("MonitorFrom")
        public String monitorFrom;

        /**
         * <p>The rule template. This parameter is required when the monitoring type is QUALITY.</p>
         */
        @NameInMap("QualityRuleTemplate")
        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate qualityRuleTemplate;

        /**
         * <p>The rule configurations. This parameter is required when the monitoring type is QUALITY.</p>
         */
        @NameInMap("RuleConfigList")
        public java.util.List<CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList> ruleConfigList;

        /**
         * <p>The rule name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule subtype. This parameter is required when the monitoring type is QUALITY. Valid values:</p>
         * <ul>
         * <li>BY_ATTRIBUTE: configured based on attributes.</li>
         * <li>CUSTOMIZED: custom configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZED</p>
         */
        @NameInMap("RuleSubType")
        public String ruleSubType;

        /**
         * <p>The rule validation configurations. This parameter is required when the monitoring type is QUALITY.</p>
         */
        @NameInMap("RuleValidateConfigList")
        public java.util.List<CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList> ruleValidateConfigList;

        /**
         * <p>The monitoring type. Valid values:</p>
         * <ul>
         * <li>METADATA: metadata monitoring.</li>
         * <li>QUALITY: data quality monitoring.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>METADATA</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList self = new CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList();
            return TeaModel.build(map, self);
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setAttributeId(Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public Long getAttributeId() {
            return this.attributeId;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setAttributeMonitorConfig(CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig attributeMonitorConfig) {
            this.attributeMonitorConfig = attributeMonitorConfig;
            return this;
        }
        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig getAttributeMonitorConfig() {
            return this.attributeMonitorConfig;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setMonitorFrom(String monitorFrom) {
            this.monitorFrom = monitorFrom;
            return this;
        }
        public String getMonitorFrom() {
            return this.monitorFrom;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setQualityRuleTemplate(CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate qualityRuleTemplate) {
            this.qualityRuleTemplate = qualityRuleTemplate;
            return this;
        }
        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate getQualityRuleTemplate() {
            return this.qualityRuleTemplate;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setRuleConfigList(java.util.List<CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList> ruleConfigList) {
            this.ruleConfigList = ruleConfigList;
            return this;
        }
        public java.util.List<CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList> getRuleConfigList() {
            return this.ruleConfigList;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setRuleSubType(String ruleSubType) {
            this.ruleSubType = ruleSubType;
            return this;
        }
        public String getRuleSubType() {
            return this.ruleSubType;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setRuleValidateConfigList(java.util.List<CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList> ruleValidateConfigList) {
            this.ruleValidateConfigList = ruleValidateConfigList;
            return this;
        }
        public java.util.List<CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList> getRuleValidateConfigList() {
            return this.ruleValidateConfigList;
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateStandardRequestCreateCommandStandardGeneralMonitorConfig extends TeaModel {
        /**
         * <p>The list of standard monitoring configurations.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("StandardMonitorConfigList")
        public java.util.List<CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList> standardMonitorConfigList;

        public static CreateStandardRequestCreateCommandStandardGeneralMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRequestCreateCommandStandardGeneralMonitorConfig self = new CreateStandardRequestCreateCommandStandardGeneralMonitorConfig();
            return TeaModel.build(map, self);
        }

        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfig setStandardMonitorConfigList(java.util.List<CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList> standardMonitorConfigList) {
            this.standardMonitorConfigList = standardMonitorConfigList;
            return this;
        }
        public java.util.List<CreateStandardRequestCreateCommandStandardGeneralMonitorConfigStandardMonitorConfigList> getStandardMonitorConfigList() {
            return this.standardMonitorConfigList;
        }

    }

    public static class CreateStandardRequestCreateCommandStandardSetReference extends TeaModel {
        /**
         * <p>The standard set ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public Long id;

        public static CreateStandardRequestCreateCommandStandardSetReference build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRequestCreateCommandStandardSetReference self = new CreateStandardRequestCreateCommandStandardSetReference();
            return TeaModel.build(map, self);
        }

        public CreateStandardRequestCreateCommandStandardSetReference setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateStandardRequestCreateCommandStandardTemplateReferenceAttributeValueList extends TeaModel {
        /**
         * <p>The attribute ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("AttributeId")
        public Long attributeId;

        /**
         * <p>The attribute value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateStandardRequestCreateCommandStandardTemplateReferenceAttributeValueList build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRequestCreateCommandStandardTemplateReferenceAttributeValueList self = new CreateStandardRequestCreateCommandStandardTemplateReferenceAttributeValueList();
            return TeaModel.build(map, self);
        }

        public CreateStandardRequestCreateCommandStandardTemplateReferenceAttributeValueList setAttributeId(Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public Long getAttributeId() {
            return this.attributeId;
        }

        public CreateStandardRequestCreateCommandStandardTemplateReferenceAttributeValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateStandardRequestCreateCommandStandardTemplateReference extends TeaModel {
        /**
         * <p>The attribute values corresponding to the attributes in the referenced template. If this parameter is left empty, default values are used.</p>
         */
        @NameInMap("AttributeValueList")
        public java.util.List<CreateStandardRequestCreateCommandStandardTemplateReferenceAttributeValueList> attributeValueList;

        /**
         * <p>The standard template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The standard template version number. The latest version is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static CreateStandardRequestCreateCommandStandardTemplateReference build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRequestCreateCommandStandardTemplateReference self = new CreateStandardRequestCreateCommandStandardTemplateReference();
            return TeaModel.build(map, self);
        }

        public CreateStandardRequestCreateCommandStandardTemplateReference setAttributeValueList(java.util.List<CreateStandardRequestCreateCommandStandardTemplateReferenceAttributeValueList> attributeValueList) {
            this.attributeValueList = attributeValueList;
            return this;
        }
        public java.util.List<CreateStandardRequestCreateCommandStandardTemplateReferenceAttributeValueList> getAttributeValueList() {
            return this.attributeValueList;
        }

        public CreateStandardRequestCreateCommandStandardTemplateReference setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateStandardRequestCreateCommandStandardTemplateReference setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class CreateStandardRequestCreateCommand extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The effective period configuration.</p>
         */
        @NameInMap("EffectiveTimeConfig")
        public CreateStandardRequestCreateCommandEffectiveTimeConfig effectiveTimeConfig;

        /**
         * <p>Specifies whether to generate a standard code based on rules. If this parameter is set to true, the standard code specified in the attribute values is ignored and a new standard code is generated.</p>
         */
        @NameInMap("NeedGenerateStandardCode")
        public Boolean needGenerateStandardCode;

        /**
         * <p>The owner. If this parameter is not specified, the current user is used.</p>
         * 
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The standard monitoring configuration.</p>
         */
        @NameInMap("StandardGeneralMonitorConfig")
        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfig standardGeneralMonitorConfig;

        /**
         * <p>The reference to the standard set.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("StandardSetReference")
        public CreateStandardRequestCreateCommandStandardSetReference standardSetReference;

        /**
         * <p>The standard template to which the standard belongs.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("StandardTemplateReference")
        public CreateStandardRequestCreateCommandStandardTemplateReference standardTemplateReference;

        public static CreateStandardRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardRequestCreateCommand self = new CreateStandardRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateStandardRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStandardRequestCreateCommand setEffectiveTimeConfig(CreateStandardRequestCreateCommandEffectiveTimeConfig effectiveTimeConfig) {
            this.effectiveTimeConfig = effectiveTimeConfig;
            return this;
        }
        public CreateStandardRequestCreateCommandEffectiveTimeConfig getEffectiveTimeConfig() {
            return this.effectiveTimeConfig;
        }

        public CreateStandardRequestCreateCommand setNeedGenerateStandardCode(Boolean needGenerateStandardCode) {
            this.needGenerateStandardCode = needGenerateStandardCode;
            return this;
        }
        public Boolean getNeedGenerateStandardCode() {
            return this.needGenerateStandardCode;
        }

        public CreateStandardRequestCreateCommand setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public CreateStandardRequestCreateCommand setStandardGeneralMonitorConfig(CreateStandardRequestCreateCommandStandardGeneralMonitorConfig standardGeneralMonitorConfig) {
            this.standardGeneralMonitorConfig = standardGeneralMonitorConfig;
            return this;
        }
        public CreateStandardRequestCreateCommandStandardGeneralMonitorConfig getStandardGeneralMonitorConfig() {
            return this.standardGeneralMonitorConfig;
        }

        public CreateStandardRequestCreateCommand setStandardSetReference(CreateStandardRequestCreateCommandStandardSetReference standardSetReference) {
            this.standardSetReference = standardSetReference;
            return this;
        }
        public CreateStandardRequestCreateCommandStandardSetReference getStandardSetReference() {
            return this.standardSetReference;
        }

        public CreateStandardRequestCreateCommand setStandardTemplateReference(CreateStandardRequestCreateCommandStandardTemplateReference standardTemplateReference) {
            this.standardTemplateReference = standardTemplateReference;
            return this;
        }
        public CreateStandardRequestCreateCommandStandardTemplateReference getStandardTemplateReference() {
            return this.standardTemplateReference;
        }

    }

}
