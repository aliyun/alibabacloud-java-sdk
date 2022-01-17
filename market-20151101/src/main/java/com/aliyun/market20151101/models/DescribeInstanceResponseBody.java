// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("AppJson")
    public String appJson;

    @NameInMap("BeganOn")
    public Long beganOn;

    @NameInMap("ComponentJson")
    public String componentJson;

    @NameInMap("Constraints")
    public String constraints;

    @NameInMap("CreatedOn")
    public Long createdOn;

    @NameInMap("EndOn")
    public Long endOn;

    @NameInMap("ExtendJson")
    public String extendJson;

    @NameInMap("HostJson")
    public String hostJson;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("IsTrial")
    public Boolean isTrial;

    @NameInMap("Modules")
    public DescribeInstanceResponseBodyModules modules;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("ProductSkuCode")
    public String productSkuCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("RelationalData")
    public DescribeInstanceResponseBodyRelationalData relationalData;

    @NameInMap("Status")
    public String status;

    @NameInMap("SupplierName")
    public String supplierName;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setAppJson(String appJson) {
        this.appJson = appJson;
        return this;
    }
    public String getAppJson() {
        return this.appJson;
    }

    public DescribeInstanceResponseBody setBeganOn(Long beganOn) {
        this.beganOn = beganOn;
        return this;
    }
    public Long getBeganOn() {
        return this.beganOn;
    }

    public DescribeInstanceResponseBody setComponentJson(String componentJson) {
        this.componentJson = componentJson;
        return this;
    }
    public String getComponentJson() {
        return this.componentJson;
    }

    public DescribeInstanceResponseBody setConstraints(String constraints) {
        this.constraints = constraints;
        return this;
    }
    public String getConstraints() {
        return this.constraints;
    }

    public DescribeInstanceResponseBody setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
        return this;
    }
    public Long getCreatedOn() {
        return this.createdOn;
    }

    public DescribeInstanceResponseBody setEndOn(Long endOn) {
        this.endOn = endOn;
        return this;
    }
    public Long getEndOn() {
        return this.endOn;
    }

    public DescribeInstanceResponseBody setExtendJson(String extendJson) {
        this.extendJson = extendJson;
        return this;
    }
    public String getExtendJson() {
        return this.extendJson;
    }

    public DescribeInstanceResponseBody setHostJson(String hostJson) {
        this.hostJson = hostJson;
        return this;
    }
    public String getHostJson() {
        return this.hostJson;
    }

    public DescribeInstanceResponseBody setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceResponseBody setIsTrial(Boolean isTrial) {
        this.isTrial = isTrial;
        return this;
    }
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    public DescribeInstanceResponseBody setModules(DescribeInstanceResponseBodyModules modules) {
        this.modules = modules;
        return this;
    }
    public DescribeInstanceResponseBodyModules getModules() {
        return this.modules;
    }

    public DescribeInstanceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DescribeInstanceResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeInstanceResponseBody setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DescribeInstanceResponseBody setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
        return this;
    }
    public String getProductSkuCode() {
        return this.productSkuCode;
    }

    public DescribeInstanceResponseBody setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeInstanceResponseBody setRelationalData(DescribeInstanceResponseBodyRelationalData relationalData) {
        this.relationalData = relationalData;
        return this;
    }
    public DescribeInstanceResponseBodyRelationalData getRelationalData() {
        return this.relationalData;
    }

    public DescribeInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeInstanceResponseBody setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public static class DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Step")
        public String step;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue self = new DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValues extends TeaModel {
        @NameInMap("PropertyValue")
        public java.util.List<DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue> propertyValue;

        public static DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValues self = new DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValues();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValues setPropertyValue(java.util.List<DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue> propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValuesPropertyValue> getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class DescribeInstanceResponseBodyModulesModulePropertiesProperty extends TeaModel {
        @NameInMap("DisplayUnit")
        public String displayUnit;

        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("PropertyValues")
        public DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValues propertyValues;

        @NameInMap("ShowType")
        public String showType;

        public static DescribeInstanceResponseBodyModulesModulePropertiesProperty build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyModulesModulePropertiesProperty self = new DescribeInstanceResponseBodyModulesModulePropertiesProperty();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesProperty setDisplayUnit(String displayUnit) {
            this.displayUnit = displayUnit;
            return this;
        }
        public String getDisplayUnit() {
            return this.displayUnit;
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesProperty setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesProperty setPropertyValues(DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValues propertyValues) {
            this.propertyValues = propertyValues;
            return this;
        }
        public DescribeInstanceResponseBodyModulesModulePropertiesPropertyPropertyValues getPropertyValues() {
            return this.propertyValues;
        }

        public DescribeInstanceResponseBodyModulesModulePropertiesProperty setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

    }

    public static class DescribeInstanceResponseBodyModulesModuleProperties extends TeaModel {
        @NameInMap("Property")
        public java.util.List<DescribeInstanceResponseBodyModulesModulePropertiesProperty> property;

        public static DescribeInstanceResponseBodyModulesModuleProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyModulesModuleProperties self = new DescribeInstanceResponseBodyModulesModuleProperties();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyModulesModuleProperties setProperty(java.util.List<DescribeInstanceResponseBodyModulesModulePropertiesProperty> property) {
            this.property = property;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyModulesModulePropertiesProperty> getProperty() {
            return this.property;
        }

    }

    public static class DescribeInstanceResponseBodyModulesModule extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public DescribeInstanceResponseBodyModulesModuleProperties properties;

        public static DescribeInstanceResponseBodyModulesModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyModulesModule self = new DescribeInstanceResponseBodyModulesModule();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyModulesModule setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeInstanceResponseBodyModulesModule setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeInstanceResponseBodyModulesModule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceResponseBodyModulesModule setProperties(DescribeInstanceResponseBodyModulesModuleProperties properties) {
            this.properties = properties;
            return this;
        }
        public DescribeInstanceResponseBodyModulesModuleProperties getProperties() {
            return this.properties;
        }

    }

    public static class DescribeInstanceResponseBodyModules extends TeaModel {
        @NameInMap("Module")
        public java.util.List<DescribeInstanceResponseBodyModulesModule> module;

        public static DescribeInstanceResponseBodyModules build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyModules self = new DescribeInstanceResponseBodyModules();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyModules setModule(java.util.List<DescribeInstanceResponseBodyModulesModule> module) {
            this.module = module;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyModulesModule> getModule() {
            return this.module;
        }

    }

    public static class DescribeInstanceResponseBodyRelationalData extends TeaModel {
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        public static DescribeInstanceResponseBodyRelationalData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyRelationalData self = new DescribeInstanceResponseBodyRelationalData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyRelationalData setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

    }

}
