// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterServiceConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Config")
    public DescribeClusterServiceConfigResponseBodyConfig config;

    public static DescribeClusterServiceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterServiceConfigResponseBody self = new DescribeClusterServiceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterServiceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterServiceConfigResponseBody setConfig(DescribeClusterServiceConfigResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribeClusterServiceConfigResponseBodyConfig getConfig() {
        return this.config;
    }

    public static class DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Description")
        public String description;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("IsCustom")
        public Boolean isCustom;

        public static DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue self = new DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue setIsCustom(Boolean isCustom) {
            this.isCustom = isCustom;
            return this;
        }
        public Boolean getIsCustom() {
            return this.isCustom;
        }

    }

    public static class DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueList extends TeaModel {
        @NameInMap("ConfigItemValue")
        public java.util.List<DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue> configItemValue;

        public static DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueList self = new DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueList setConfigItemValue(java.util.List<DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue> configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public java.util.List<DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueListConfigItemValue> getConfigItemValue() {
            return this.configItemValue;
        }

    }

    public static class DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValue extends TeaModel {
        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("ScopeId")
        public Long scopeId;

        @NameInMap("ConfigItemValueList")
        public DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueList configItemValueList;

        @NameInMap("AllowCustom")
        public Boolean allowCustom;

        @NameInMap("Scope")
        public String scope;

        public static DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValue self = new DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValue();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValue setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValue setScopeId(Long scopeId) {
            this.scopeId = scopeId;
            return this;
        }
        public Long getScopeId() {
            return this.scopeId;
        }

        public DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValue setConfigItemValueList(DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueList configItemValueList) {
            this.configItemValueList = configItemValueList;
            return this;
        }
        public DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValueConfigItemValueList getConfigItemValueList() {
            return this.configItemValueList;
        }

        public DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValue setAllowCustom(Boolean allowCustom) {
            this.allowCustom = allowCustom;
            return this;
        }
        public Boolean getAllowCustom() {
            return this.allowCustom;
        }

        public DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValue setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

    public static class DescribeClusterServiceConfigResponseBodyConfigConfigValueList extends TeaModel {
        @NameInMap("ConfigValue")
        public java.util.List<DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValue> configValue;

        public static DescribeClusterServiceConfigResponseBodyConfigConfigValueList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigResponseBodyConfigConfigValueList self = new DescribeClusterServiceConfigResponseBodyConfigConfigValueList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigResponseBodyConfigConfigValueList setConfigValue(java.util.List<DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValue> configValue) {
            this.configValue = configValue;
            return this;
        }
        public java.util.List<DescribeClusterServiceConfigResponseBodyConfigConfigValueListConfigValue> getConfigValue() {
            return this.configValue;
        }

    }

    public static class DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyTypes extends TeaModel {
        @NameInMap("propertyType")
        public java.util.List<String> propertyType;

        public static DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyTypes self = new DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyTypes();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyTypes setPropertyType(java.util.List<String> propertyType) {
            this.propertyType = propertyType;
            return this;
        }
        public java.util.List<String> getPropertyType() {
            return this.propertyType;
        }

    }

    public static class DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoEffectWay extends TeaModel {
        @NameInMap("EffectType")
        public String effectType;

        @NameInMap("InvokeServiceName")
        public String invokeServiceName;

        public static DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoEffectWay build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoEffectWay self = new DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoEffectWay();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoEffectWay setEffectType(String effectType) {
            this.effectType = effectType;
            return this;
        }
        public String getEffectType() {
            return this.effectType;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoEffectWay setInvokeServiceName(String invokeServiceName) {
            this.invokeServiceName = invokeServiceName;
            return this;
        }
        public String getInvokeServiceName() {
            return this.invokeServiceName;
        }

    }

    public static class DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntriesValueEntryInfo extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        public static DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntriesValueEntryInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntriesValueEntryInfo self = new DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntriesValueEntryInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntriesValueEntryInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntriesValueEntryInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntriesValueEntryInfo setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntries extends TeaModel {
        @NameInMap("ValueEntryInfo")
        public java.util.List<DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntriesValueEntryInfo> valueEntryInfo;

        public static DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntries self = new DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntries();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntries setValueEntryInfo(java.util.List<DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntriesValueEntryInfo> valueEntryInfo) {
            this.valueEntryInfo = valueEntryInfo;
            return this;
        }
        public java.util.List<DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntriesValueEntryInfo> getValueEntryInfo() {
            return this.valueEntryInfo;
        }

    }

    public static class DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Maximum")
        public String maximum;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Hidden")
        public Boolean hidden;

        @NameInMap("IncrememtStep")
        public String incrememtStep;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("Entries")
        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntries entries;

        @NameInMap("Mimimum")
        public String mimimum;

        public static DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes self = new DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes setMaximum(String maximum) {
            this.maximum = maximum;
            return this;
        }
        public String getMaximum() {
            return this.maximum;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes setHidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }
        public Boolean getHidden() {
            return this.hidden;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes setIncrememtStep(String incrememtStep) {
            this.incrememtStep = incrememtStep;
            return this;
        }
        public String getIncrememtStep() {
            return this.incrememtStep;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes setEntries(DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntries entries) {
            this.entries = entries;
            return this;
        }
        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributesEntries getEntries() {
            return this.entries;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes setMimimum(String mimimum) {
            this.mimimum = mimimum;
            return this;
        }
        public String getMimimum() {
            return this.mimimum;
        }

    }

    public static class DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Value")
        public String value;

        @NameInMap("PropertyTypes")
        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyTypes propertyTypes;

        @NameInMap("Description")
        public String description;

        @NameInMap("EffectWay")
        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoEffectWay effectWay;

        @NameInMap("Component")
        public String component;

        @NameInMap("PropertyValueAttributes")
        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes propertyValueAttributes;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ServiceName")
        public String serviceName;

        public static DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo self = new DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo setPropertyTypes(DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyTypes propertyTypes) {
            this.propertyTypes = propertyTypes;
            return this;
        }
        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyTypes getPropertyTypes() {
            return this.propertyTypes;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo setEffectWay(DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoEffectWay effectWay) {
            this.effectWay = effectWay;
            return this;
        }
        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoEffectWay getEffectWay() {
            return this.effectWay;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo setComponent(String component) {
            this.component = component;
            return this;
        }
        public String getComponent() {
            return this.component;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo setPropertyValueAttributes(DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes propertyValueAttributes) {
            this.propertyValueAttributes = propertyValueAttributes;
            return this;
        }
        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfoPropertyValueAttributes getPropertyValueAttributes() {
            return this.propertyValueAttributes;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class DescribeClusterServiceConfigResponseBodyConfigPropertyInfoList extends TeaModel {
        @NameInMap("PropertyInfo")
        public java.util.List<DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo> propertyInfo;

        public static DescribeClusterServiceConfigResponseBodyConfigPropertyInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigResponseBodyConfigPropertyInfoList self = new DescribeClusterServiceConfigResponseBodyConfigPropertyInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoList setPropertyInfo(java.util.List<DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo> propertyInfo) {
            this.propertyInfo = propertyInfo;
            return this;
        }
        public java.util.List<DescribeClusterServiceConfigResponseBodyConfigPropertyInfoListPropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

    }

    public static class DescribeClusterServiceConfigResponseBodyConfig extends TeaModel {
        @NameInMap("Applied")
        public String applied;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ConfigVersion")
        public String configVersion;

        @NameInMap("ConfigValueList")
        public DescribeClusterServiceConfigResponseBodyConfigConfigValueList configValueList;

        @NameInMap("Author")
        public String author;

        @NameInMap("PropertyInfoList")
        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoList propertyInfoList;

        @NameInMap("ServiceName")
        public String serviceName;

        public static DescribeClusterServiceConfigResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigResponseBodyConfig self = new DescribeClusterServiceConfigResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigResponseBodyConfig setApplied(String applied) {
            this.applied = applied;
            return this;
        }
        public String getApplied() {
            return this.applied;
        }

        public DescribeClusterServiceConfigResponseBodyConfig setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeClusterServiceConfigResponseBodyConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeClusterServiceConfigResponseBodyConfig setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public DescribeClusterServiceConfigResponseBodyConfig setConfigValueList(DescribeClusterServiceConfigResponseBodyConfigConfigValueList configValueList) {
            this.configValueList = configValueList;
            return this;
        }
        public DescribeClusterServiceConfigResponseBodyConfigConfigValueList getConfigValueList() {
            return this.configValueList;
        }

        public DescribeClusterServiceConfigResponseBodyConfig setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public DescribeClusterServiceConfigResponseBodyConfig setPropertyInfoList(DescribeClusterServiceConfigResponseBodyConfigPropertyInfoList propertyInfoList) {
            this.propertyInfoList = propertyInfoList;
            return this;
        }
        public DescribeClusterServiceConfigResponseBodyConfigPropertyInfoList getPropertyInfoList() {
            return this.propertyInfoList;
        }

        public DescribeClusterServiceConfigResponseBodyConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
