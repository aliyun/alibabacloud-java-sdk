// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The update command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateStandardRequestUpdateCommand updateCommand;

    public static UpdateStandardRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardRequest self = new UpdateStandardRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStandardRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateStandardRequest setUpdateCommand(UpdateStandardRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateStandardRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateStandardRequestUpdateCommandEffectiveTimeConfig extends TeaModel {
        /**
         * <p>The end time of the effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-30 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of the effective period.</p>
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

        public static UpdateStandardRequestUpdateCommandEffectiveTimeConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardRequestUpdateCommandEffectiveTimeConfig self = new UpdateStandardRequestUpdateCommandEffectiveTimeConfig();
            return TeaModel.build(map, self);
        }

        public UpdateStandardRequestUpdateCommandEffectiveTimeConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateStandardRequestUpdateCommandEffectiveTimeConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UpdateStandardRequestUpdateCommandEffectiveTimeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig extends TeaModel {
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

        public static UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig self = new UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig();
            return TeaModel.build(map, self);
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig setIsCaseSensitive(Boolean isCaseSensitive) {
            this.isCaseSensitive = isCaseSensitive;
            return this;
        }
        public Boolean getIsCaseSensitive() {
            return this.isCaseSensitive;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate extends TeaModel {
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

        public static UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate self = new UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList extends TeaModel {
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

        public static UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList self = new UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList();
            return TeaModel.build(map, self);
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList extends TeaModel {
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
         * <p>The operator. If the validation type is EXPRESSION, valid values:</p>
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
         * <p>The value to compare against.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList self = new UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList();
            return TeaModel.build(map, self);
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList extends TeaModel {
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
        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig attributeMonitorConfig;

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
         * <p>The monitoring configuration ID. If left empty, a new monitoring configuration is created. If an existing monitoring configuration ID is specified, the corresponding monitoring configuration is updated.</p>
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
        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate qualityRuleTemplate;

        /**
         * <p>The rule configurations. This parameter is required when the monitoring type is QUALITY.</p>
         */
        @NameInMap("RuleConfigList")
        public java.util.List<UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList> ruleConfigList;

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
        public java.util.List<UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList> ruleValidateConfigList;

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

        public static UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList self = new UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList();
            return TeaModel.build(map, self);
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setAttributeId(Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public Long getAttributeId() {
            return this.attributeId;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setAttributeMonitorConfig(UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig attributeMonitorConfig) {
            this.attributeMonitorConfig = attributeMonitorConfig;
            return this;
        }
        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListAttributeMonitorConfig getAttributeMonitorConfig() {
            return this.attributeMonitorConfig;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setMonitorFrom(String monitorFrom) {
            this.monitorFrom = monitorFrom;
            return this;
        }
        public String getMonitorFrom() {
            return this.monitorFrom;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setQualityRuleTemplate(UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate qualityRuleTemplate) {
            this.qualityRuleTemplate = qualityRuleTemplate;
            return this;
        }
        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListQualityRuleTemplate getQualityRuleTemplate() {
            return this.qualityRuleTemplate;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setRuleConfigList(java.util.List<UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList> ruleConfigList) {
            this.ruleConfigList = ruleConfigList;
            return this;
        }
        public java.util.List<UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleConfigList> getRuleConfigList() {
            return this.ruleConfigList;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setRuleSubType(String ruleSubType) {
            this.ruleSubType = ruleSubType;
            return this;
        }
        public String getRuleSubType() {
            return this.ruleSubType;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setRuleValidateConfigList(java.util.List<UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList> ruleValidateConfigList) {
            this.ruleValidateConfigList = ruleValidateConfigList;
            return this;
        }
        public java.util.List<UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigListRuleValidateConfigList> getRuleValidateConfigList() {
            return this.ruleValidateConfigList;
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfig extends TeaModel {
        /**
         * <p>The list of standard monitoring configurations.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("StandardMonitorConfigList")
        public java.util.List<UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList> standardMonitorConfigList;

        public static UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfig self = new UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfig();
            return TeaModel.build(map, self);
        }

        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfig setStandardMonitorConfigList(java.util.List<UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList> standardMonitorConfigList) {
            this.standardMonitorConfigList = standardMonitorConfigList;
            return this;
        }
        public java.util.List<UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfigStandardMonitorConfigList> getStandardMonitorConfigList() {
            return this.standardMonitorConfigList;
        }

    }

    public static class UpdateStandardRequestUpdateCommandStandardSetReference extends TeaModel {
        /**
         * <p>The standard set ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public Long id;

        public static UpdateStandardRequestUpdateCommandStandardSetReference build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardRequestUpdateCommandStandardSetReference self = new UpdateStandardRequestUpdateCommandStandardSetReference();
            return TeaModel.build(map, self);
        }

        public UpdateStandardRequestUpdateCommandStandardSetReference setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class UpdateStandardRequestUpdateCommandStandardTemplateReferenceAttributeValueList extends TeaModel {
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

        public static UpdateStandardRequestUpdateCommandStandardTemplateReferenceAttributeValueList build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardRequestUpdateCommandStandardTemplateReferenceAttributeValueList self = new UpdateStandardRequestUpdateCommandStandardTemplateReferenceAttributeValueList();
            return TeaModel.build(map, self);
        }

        public UpdateStandardRequestUpdateCommandStandardTemplateReferenceAttributeValueList setAttributeId(Long attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public Long getAttributeId() {
            return this.attributeId;
        }

        public UpdateStandardRequestUpdateCommandStandardTemplateReferenceAttributeValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateStandardRequestUpdateCommandStandardTemplateReference extends TeaModel {
        /**
         * <p>The attribute values corresponding to the attributes in the referenced template. If left empty, default values are used.</p>
         */
        @NameInMap("AttributeValueList")
        public java.util.List<UpdateStandardRequestUpdateCommandStandardTemplateReferenceAttributeValueList> attributeValueList;

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
         * <p>The version number of the standard template. The latest version is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static UpdateStandardRequestUpdateCommandStandardTemplateReference build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardRequestUpdateCommandStandardTemplateReference self = new UpdateStandardRequestUpdateCommandStandardTemplateReference();
            return TeaModel.build(map, self);
        }

        public UpdateStandardRequestUpdateCommandStandardTemplateReference setAttributeValueList(java.util.List<UpdateStandardRequestUpdateCommandStandardTemplateReferenceAttributeValueList> attributeValueList) {
            this.attributeValueList = attributeValueList;
            return this;
        }
        public java.util.List<UpdateStandardRequestUpdateCommandStandardTemplateReferenceAttributeValueList> getAttributeValueList() {
            return this.attributeValueList;
        }

        public UpdateStandardRequestUpdateCommandStandardTemplateReference setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateStandardRequestUpdateCommandStandardTemplateReference setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class UpdateStandardRequestUpdateCommand extends TeaModel {
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
        public UpdateStandardRequestUpdateCommandEffectiveTimeConfig effectiveTimeConfig;

        /**
         * <p>Specifies whether to generate a standard code based on rules. If set to true, the standard code specified in the attribute values is ignored and regenerated.</p>
         */
        @NameInMap("NeedGenerateStandardCode")
        public Boolean needGenerateStandardCode;

        /**
         * <p>The owner. If not specified, the current user is used.</p>
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
        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfig standardGeneralMonitorConfig;

        /**
         * <p>The lookup table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
         * <p>The reference to the standard set that the current standard belongs to.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("StandardSetReference")
        public UpdateStandardRequestUpdateCommandStandardSetReference standardSetReference;

        /**
         * <p>The status of the standard.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        @NameInMap("StandardStatus")
        public String standardStatus;

        /**
         * <p>The standard template to which the standard belongs.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("StandardTemplateReference")
        public UpdateStandardRequestUpdateCommandStandardTemplateReference standardTemplateReference;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static UpdateStandardRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardRequestUpdateCommand self = new UpdateStandardRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateStandardRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateStandardRequestUpdateCommand setEffectiveTimeConfig(UpdateStandardRequestUpdateCommandEffectiveTimeConfig effectiveTimeConfig) {
            this.effectiveTimeConfig = effectiveTimeConfig;
            return this;
        }
        public UpdateStandardRequestUpdateCommandEffectiveTimeConfig getEffectiveTimeConfig() {
            return this.effectiveTimeConfig;
        }

        public UpdateStandardRequestUpdateCommand setNeedGenerateStandardCode(Boolean needGenerateStandardCode) {
            this.needGenerateStandardCode = needGenerateStandardCode;
            return this;
        }
        public Boolean getNeedGenerateStandardCode() {
            return this.needGenerateStandardCode;
        }

        public UpdateStandardRequestUpdateCommand setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public UpdateStandardRequestUpdateCommand setStandardGeneralMonitorConfig(UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfig standardGeneralMonitorConfig) {
            this.standardGeneralMonitorConfig = standardGeneralMonitorConfig;
            return this;
        }
        public UpdateStandardRequestUpdateCommandStandardGeneralMonitorConfig getStandardGeneralMonitorConfig() {
            return this.standardGeneralMonitorConfig;
        }

        public UpdateStandardRequestUpdateCommand setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public UpdateStandardRequestUpdateCommand setStandardSetReference(UpdateStandardRequestUpdateCommandStandardSetReference standardSetReference) {
            this.standardSetReference = standardSetReference;
            return this;
        }
        public UpdateStandardRequestUpdateCommandStandardSetReference getStandardSetReference() {
            return this.standardSetReference;
        }

        public UpdateStandardRequestUpdateCommand setStandardStatus(String standardStatus) {
            this.standardStatus = standardStatus;
            return this;
        }
        public String getStandardStatus() {
            return this.standardStatus;
        }

        public UpdateStandardRequestUpdateCommand setStandardTemplateReference(UpdateStandardRequestUpdateCommandStandardTemplateReference standardTemplateReference) {
            this.standardTemplateReference = standardTemplateReference;
            return this;
        }
        public UpdateStandardRequestUpdateCommandStandardTemplateReference getStandardTemplateReference() {
            return this.standardTemplateReference;
        }

        public UpdateStandardRequestUpdateCommand setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
