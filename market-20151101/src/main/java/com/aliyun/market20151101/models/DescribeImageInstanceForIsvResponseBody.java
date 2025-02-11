// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeImageInstanceForIsvResponseBody extends TeaModel {
    @NameInMap("ActiveAddress")
    public String activeAddress;

    @NameInMap("AppJson")
    public String appJson;

    @NameInMap("AutoRenewal")
    public String autoRenewal;

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

    @NameInMap("LicenseCode")
    public String licenseCode;

    @NameInMap("Modules")
    public java.util.List<DescribeImageInstanceForIsvResponseBodyModules> modules;

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
    public DescribeImageInstanceForIsvResponseBodyRelationalData relationalData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("SupplierName")
    public String supplierName;

    public static DescribeImageInstanceForIsvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInstanceForIsvResponseBody self = new DescribeImageInstanceForIsvResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageInstanceForIsvResponseBody setActiveAddress(String activeAddress) {
        this.activeAddress = activeAddress;
        return this;
    }
    public String getActiveAddress() {
        return this.activeAddress;
    }

    public DescribeImageInstanceForIsvResponseBody setAppJson(String appJson) {
        this.appJson = appJson;
        return this;
    }
    public String getAppJson() {
        return this.appJson;
    }

    public DescribeImageInstanceForIsvResponseBody setAutoRenewal(String autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public String getAutoRenewal() {
        return this.autoRenewal;
    }

    public DescribeImageInstanceForIsvResponseBody setBeganOn(Long beganOn) {
        this.beganOn = beganOn;
        return this;
    }
    public Long getBeganOn() {
        return this.beganOn;
    }

    public DescribeImageInstanceForIsvResponseBody setComponentJson(String componentJson) {
        this.componentJson = componentJson;
        return this;
    }
    public String getComponentJson() {
        return this.componentJson;
    }

    public DescribeImageInstanceForIsvResponseBody setConstraints(String constraints) {
        this.constraints = constraints;
        return this;
    }
    public String getConstraints() {
        return this.constraints;
    }

    public DescribeImageInstanceForIsvResponseBody setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
        return this;
    }
    public Long getCreatedOn() {
        return this.createdOn;
    }

    public DescribeImageInstanceForIsvResponseBody setEndOn(Long endOn) {
        this.endOn = endOn;
        return this;
    }
    public Long getEndOn() {
        return this.endOn;
    }

    public DescribeImageInstanceForIsvResponseBody setExtendJson(String extendJson) {
        this.extendJson = extendJson;
        return this;
    }
    public String getExtendJson() {
        return this.extendJson;
    }

    public DescribeImageInstanceForIsvResponseBody setHostJson(String hostJson) {
        this.hostJson = hostJson;
        return this;
    }
    public String getHostJson() {
        return this.hostJson;
    }

    public DescribeImageInstanceForIsvResponseBody setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public DescribeImageInstanceForIsvResponseBody setIsTrial(Boolean isTrial) {
        this.isTrial = isTrial;
        return this;
    }
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    public DescribeImageInstanceForIsvResponseBody setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

    public DescribeImageInstanceForIsvResponseBody setModules(java.util.List<DescribeImageInstanceForIsvResponseBodyModules> modules) {
        this.modules = modules;
        return this;
    }
    public java.util.List<DescribeImageInstanceForIsvResponseBodyModules> getModules() {
        return this.modules;
    }

    public DescribeImageInstanceForIsvResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DescribeImageInstanceForIsvResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeImageInstanceForIsvResponseBody setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DescribeImageInstanceForIsvResponseBody setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
        return this;
    }
    public String getProductSkuCode() {
        return this.productSkuCode;
    }

    public DescribeImageInstanceForIsvResponseBody setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeImageInstanceForIsvResponseBody setRelationalData(DescribeImageInstanceForIsvResponseBodyRelationalData relationalData) {
        this.relationalData = relationalData;
        return this;
    }
    public DescribeImageInstanceForIsvResponseBodyRelationalData getRelationalData() {
        return this.relationalData;
    }

    public DescribeImageInstanceForIsvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageInstanceForIsvResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeImageInstanceForIsvResponseBody setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public static class DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues extends TeaModel {
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

        public static DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues self = new DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues();
            return TeaModel.build(map, self);
        }

        public DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

        public DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeImageInstanceForIsvResponseBodyModulesProperties extends TeaModel {
        @NameInMap("DisplayUnit")
        public String displayUnit;

        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("PropertyValues")
        public java.util.List<DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues> propertyValues;

        @NameInMap("ShowType")
        public String showType;

        public static DescribeImageInstanceForIsvResponseBodyModulesProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInstanceForIsvResponseBodyModulesProperties self = new DescribeImageInstanceForIsvResponseBodyModulesProperties();
            return TeaModel.build(map, self);
        }

        public DescribeImageInstanceForIsvResponseBodyModulesProperties setDisplayUnit(String displayUnit) {
            this.displayUnit = displayUnit;
            return this;
        }
        public String getDisplayUnit() {
            return this.displayUnit;
        }

        public DescribeImageInstanceForIsvResponseBodyModulesProperties setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImageInstanceForIsvResponseBodyModulesProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageInstanceForIsvResponseBodyModulesProperties setPropertyValues(java.util.List<DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues> propertyValues) {
            this.propertyValues = propertyValues;
            return this;
        }
        public java.util.List<DescribeImageInstanceForIsvResponseBodyModulesPropertiesPropertyValues> getPropertyValues() {
            return this.propertyValues;
        }

        public DescribeImageInstanceForIsvResponseBodyModulesProperties setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

    }

    public static class DescribeImageInstanceForIsvResponseBodyModules extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public java.util.List<DescribeImageInstanceForIsvResponseBodyModulesProperties> properties;

        public static DescribeImageInstanceForIsvResponseBodyModules build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInstanceForIsvResponseBodyModules self = new DescribeImageInstanceForIsvResponseBodyModules();
            return TeaModel.build(map, self);
        }

        public DescribeImageInstanceForIsvResponseBodyModules setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeImageInstanceForIsvResponseBodyModules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeImageInstanceForIsvResponseBodyModules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageInstanceForIsvResponseBodyModules setProperties(java.util.List<DescribeImageInstanceForIsvResponseBodyModulesProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<DescribeImageInstanceForIsvResponseBodyModulesProperties> getProperties() {
            return this.properties;
        }

    }

    public static class DescribeImageInstanceForIsvResponseBodyRelationalData extends TeaModel {
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        public static DescribeImageInstanceForIsvResponseBodyRelationalData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageInstanceForIsvResponseBodyRelationalData self = new DescribeImageInstanceForIsvResponseBodyRelationalData();
            return TeaModel.build(map, self);
        }

        public DescribeImageInstanceForIsvResponseBodyRelationalData setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

    }

}
