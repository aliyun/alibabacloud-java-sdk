// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class ServiceDef extends TeaModel {
    @NameInMap("AccessTypes")
    public java.util.List<AccessTypeDef> accessTypes;

    @NameInMap("Configs")
    public java.util.List<ServiceDefConfigs> configs;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("DataMaskDef")
    public ServiceDefDataMaskDef dataMaskDef;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Enums")
    public java.util.List<ServiceDefEnums> enums;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ImplClass")
    public String implClass;

    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    @NameInMap("Label")
    public String label;

    @NameInMap("Name")
    public String name;

    @NameInMap("Options")
    public java.util.Map<String, String> options;

    @NameInMap("RbKeyDescription")
    public String rbKeyDescription;

    @NameInMap("RbKeyLabel")
    public String rbKeyLabel;

    @NameInMap("Resources")
    public java.util.List<ResourceDef> resources;

    @NameInMap("RowFilterDef")
    public ServiceDefRowFilterDef rowFilterDef;

    @NameInMap("UpdateTime")
    public Long updateTime;

    @NameInMap("Version")
    public Long version;

    public static ServiceDef build(java.util.Map<String, ?> map) throws Exception {
        ServiceDef self = new ServiceDef();
        return TeaModel.build(map, self);
    }

    public ServiceDef setAccessTypes(java.util.List<AccessTypeDef> accessTypes) {
        this.accessTypes = accessTypes;
        return this;
    }
    public java.util.List<AccessTypeDef> getAccessTypes() {
        return this.accessTypes;
    }

    public ServiceDef setConfigs(java.util.List<ServiceDefConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ServiceDefConfigs> getConfigs() {
        return this.configs;
    }

    public ServiceDef setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ServiceDef setDataMaskDef(ServiceDefDataMaskDef dataMaskDef) {
        this.dataMaskDef = dataMaskDef;
        return this;
    }
    public ServiceDefDataMaskDef getDataMaskDef() {
        return this.dataMaskDef;
    }

    public ServiceDef setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ServiceDef setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ServiceDef setEnums(java.util.List<ServiceDefEnums> enums) {
        this.enums = enums;
        return this;
    }
    public java.util.List<ServiceDefEnums> getEnums() {
        return this.enums;
    }

    public ServiceDef setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ServiceDef setImplClass(String implClass) {
        this.implClass = implClass;
        return this;
    }
    public String getImplClass() {
        return this.implClass;
    }

    public ServiceDef setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public ServiceDef setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ServiceDef setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ServiceDef setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public ServiceDef setRbKeyDescription(String rbKeyDescription) {
        this.rbKeyDescription = rbKeyDescription;
        return this;
    }
    public String getRbKeyDescription() {
        return this.rbKeyDescription;
    }

    public ServiceDef setRbKeyLabel(String rbKeyLabel) {
        this.rbKeyLabel = rbKeyLabel;
        return this;
    }
    public String getRbKeyLabel() {
        return this.rbKeyLabel;
    }

    public ServiceDef setResources(java.util.List<ResourceDef> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ResourceDef> getResources() {
        return this.resources;
    }

    public ServiceDef setRowFilterDef(ServiceDefRowFilterDef rowFilterDef) {
        this.rowFilterDef = rowFilterDef;
        return this;
    }
    public ServiceDefRowFilterDef getRowFilterDef() {
        return this.rowFilterDef;
    }

    public ServiceDef setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public ServiceDef setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public static class ServiceDefConfigs extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("Label")
        public String label;

        @NameInMap("Mandatory")
        public Boolean mandatory;

        @NameInMap("Name")
        public String name;

        @NameInMap("RbKeyDescription")
        public String rbKeyDescription;

        @NameInMap("RbKeyLabel")
        public String rbKeyLabel;

        @NameInMap("RbKeyValidationMessage")
        public String rbKeyValidationMessage;

        @NameInMap("SubType")
        public String subType;

        @NameInMap("Type")
        public String type;

        @NameInMap("UiHint")
        public String uiHint;

        @NameInMap("ValidationMessage")
        public String validationMessage;

        @NameInMap("ValidationRegEx")
        public String validationRegEx;

        public static ServiceDefConfigs build(java.util.Map<String, ?> map) throws Exception {
            ServiceDefConfigs self = new ServiceDefConfigs();
            return TeaModel.build(map, self);
        }

        public ServiceDefConfigs setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ServiceDefConfigs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ServiceDefConfigs setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ServiceDefConfigs setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ServiceDefConfigs setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }
        public Boolean getMandatory() {
            return this.mandatory;
        }

        public ServiceDefConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ServiceDefConfigs setRbKeyDescription(String rbKeyDescription) {
            this.rbKeyDescription = rbKeyDescription;
            return this;
        }
        public String getRbKeyDescription() {
            return this.rbKeyDescription;
        }

        public ServiceDefConfigs setRbKeyLabel(String rbKeyLabel) {
            this.rbKeyLabel = rbKeyLabel;
            return this;
        }
        public String getRbKeyLabel() {
            return this.rbKeyLabel;
        }

        public ServiceDefConfigs setRbKeyValidationMessage(String rbKeyValidationMessage) {
            this.rbKeyValidationMessage = rbKeyValidationMessage;
            return this;
        }
        public String getRbKeyValidationMessage() {
            return this.rbKeyValidationMessage;
        }

        public ServiceDefConfigs setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ServiceDefConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ServiceDefConfigs setUiHint(String uiHint) {
            this.uiHint = uiHint;
            return this;
        }
        public String getUiHint() {
            return this.uiHint;
        }

        public ServiceDefConfigs setValidationMessage(String validationMessage) {
            this.validationMessage = validationMessage;
            return this;
        }
        public String getValidationMessage() {
            return this.validationMessage;
        }

        public ServiceDefConfigs setValidationRegEx(String validationRegEx) {
            this.validationRegEx = validationRegEx;
            return this;
        }
        public String getValidationRegEx() {
            return this.validationRegEx;
        }

    }

    public static class ServiceDefDataMaskDefMaskTypes extends TeaModel {
        @NameInMap("DataMaskOptions")
        public java.util.Map<String, String> dataMaskOptions;

        @NameInMap("Description")
        public String description;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

        @NameInMap("RbKeyDescription")
        public String rbKeyDescription;

        @NameInMap("RbKeyLabel")
        public String rbKeyLabel;

        @NameInMap("Transformer")
        public String transformer;

        public static ServiceDefDataMaskDefMaskTypes build(java.util.Map<String, ?> map) throws Exception {
            ServiceDefDataMaskDefMaskTypes self = new ServiceDefDataMaskDefMaskTypes();
            return TeaModel.build(map, self);
        }

        public ServiceDefDataMaskDefMaskTypes setDataMaskOptions(java.util.Map<String, String> dataMaskOptions) {
            this.dataMaskOptions = dataMaskOptions;
            return this;
        }
        public java.util.Map<String, String> getDataMaskOptions() {
            return this.dataMaskOptions;
        }

        public ServiceDefDataMaskDefMaskTypes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ServiceDefDataMaskDefMaskTypes setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ServiceDefDataMaskDefMaskTypes setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ServiceDefDataMaskDefMaskTypes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ServiceDefDataMaskDefMaskTypes setRbKeyDescription(String rbKeyDescription) {
            this.rbKeyDescription = rbKeyDescription;
            return this;
        }
        public String getRbKeyDescription() {
            return this.rbKeyDescription;
        }

        public ServiceDefDataMaskDefMaskTypes setRbKeyLabel(String rbKeyLabel) {
            this.rbKeyLabel = rbKeyLabel;
            return this;
        }
        public String getRbKeyLabel() {
            return this.rbKeyLabel;
        }

        public ServiceDefDataMaskDefMaskTypes setTransformer(String transformer) {
            this.transformer = transformer;
            return this;
        }
        public String getTransformer() {
            return this.transformer;
        }

    }

    public static class ServiceDefDataMaskDef extends TeaModel {
        @NameInMap("AccessTypes")
        public java.util.List<AccessTypeDef> accessTypes;

        @NameInMap("MaskTypes")
        public java.util.List<ServiceDefDataMaskDefMaskTypes> maskTypes;

        @NameInMap("Resources")
        public java.util.List<ResourceDef> resources;

        public static ServiceDefDataMaskDef build(java.util.Map<String, ?> map) throws Exception {
            ServiceDefDataMaskDef self = new ServiceDefDataMaskDef();
            return TeaModel.build(map, self);
        }

        public ServiceDefDataMaskDef setAccessTypes(java.util.List<AccessTypeDef> accessTypes) {
            this.accessTypes = accessTypes;
            return this;
        }
        public java.util.List<AccessTypeDef> getAccessTypes() {
            return this.accessTypes;
        }

        public ServiceDefDataMaskDef setMaskTypes(java.util.List<ServiceDefDataMaskDefMaskTypes> maskTypes) {
            this.maskTypes = maskTypes;
            return this;
        }
        public java.util.List<ServiceDefDataMaskDefMaskTypes> getMaskTypes() {
            return this.maskTypes;
        }

        public ServiceDefDataMaskDef setResources(java.util.List<ResourceDef> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<ResourceDef> getResources() {
            return this.resources;
        }

    }

    public static class ServiceDefEnumsElements extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

        @NameInMap("RbKeyLabel")
        public String rbKeyLabel;

        public static ServiceDefEnumsElements build(java.util.Map<String, ?> map) throws Exception {
            ServiceDefEnumsElements self = new ServiceDefEnumsElements();
            return TeaModel.build(map, self);
        }

        public ServiceDefEnumsElements setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ServiceDefEnumsElements setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ServiceDefEnumsElements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ServiceDefEnumsElements setRbKeyLabel(String rbKeyLabel) {
            this.rbKeyLabel = rbKeyLabel;
            return this;
        }
        public String getRbKeyLabel() {
            return this.rbKeyLabel;
        }

    }

    public static class ServiceDefEnums extends TeaModel {
        @NameInMap("DefaultIndex")
        public Integer defaultIndex;

        @NameInMap("Elements")
        public java.util.List<ServiceDefEnumsElements> elements;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("Name")
        public String name;

        public static ServiceDefEnums build(java.util.Map<String, ?> map) throws Exception {
            ServiceDefEnums self = new ServiceDefEnums();
            return TeaModel.build(map, self);
        }

        public ServiceDefEnums setDefaultIndex(Integer defaultIndex) {
            this.defaultIndex = defaultIndex;
            return this;
        }
        public Integer getDefaultIndex() {
            return this.defaultIndex;
        }

        public ServiceDefEnums setElements(java.util.List<ServiceDefEnumsElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ServiceDefEnumsElements> getElements() {
            return this.elements;
        }

        public ServiceDefEnums setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ServiceDefEnums setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ServiceDefRowFilterDef extends TeaModel {
        @NameInMap("AccessTypes")
        public java.util.List<AccessTypeDef> accessTypes;

        @NameInMap("Resources")
        public java.util.List<ResourceDef> resources;

        public static ServiceDefRowFilterDef build(java.util.Map<String, ?> map) throws Exception {
            ServiceDefRowFilterDef self = new ServiceDefRowFilterDef();
            return TeaModel.build(map, self);
        }

        public ServiceDefRowFilterDef setAccessTypes(java.util.List<AccessTypeDef> accessTypes) {
            this.accessTypes = accessTypes;
            return this;
        }
        public java.util.List<AccessTypeDef> getAccessTypes() {
            return this.accessTypes;
        }

        public ServiceDefRowFilterDef setResources(java.util.List<ResourceDef> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<ResourceDef> getResources() {
            return this.resources;
        }

    }

}
