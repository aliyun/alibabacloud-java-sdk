// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribePricingModuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribePricingModuleResponseData data;

    public static DescribePricingModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePricingModuleResponse self = new DescribePricingModuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribePricingModuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePricingModuleResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePricingModuleResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePricingModuleResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePricingModuleResponse setData(DescribePricingModuleResponseData data) {
        this.data = data;
        return this;
    }
    public DescribePricingModuleResponseData getData() {
        return this.data;
    }

    public static class DescribePricingModuleResponseDataModuleListModuleConfigList extends TeaModel {
        // ConfigList
        @NameInMap("ConfigList")
        @Validation(required = true)
        public java.util.List<String> configList;

        public static DescribePricingModuleResponseDataModuleListModuleConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataModuleListModuleConfigList self = new DescribePricingModuleResponseDataModuleListModuleConfigList();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseDataModuleListModuleConfigList setConfigList(java.util.List<String> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<String> getConfigList() {
            return this.configList;
        }

    }

    public static class DescribePricingModuleResponseDataModuleListModule extends TeaModel {
        @NameInMap("ModuleCode")
        @Validation(required = true)
        public String moduleCode;

        @NameInMap("ModuleName")
        @Validation(required = true)
        public String moduleName;

        @NameInMap("PriceType")
        @Validation(required = true)
        public String priceType;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("ConfigList")
        @Validation(required = true)
        public DescribePricingModuleResponseDataModuleListModuleConfigList configList;

        public static DescribePricingModuleResponseDataModuleListModule build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataModuleListModule self = new DescribePricingModuleResponseDataModuleListModule();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseDataModuleListModule setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribePricingModuleResponseDataModuleListModule setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DescribePricingModuleResponseDataModuleListModule setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

        public DescribePricingModuleResponseDataModuleListModule setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribePricingModuleResponseDataModuleListModule setConfigList(DescribePricingModuleResponseDataModuleListModuleConfigList configList) {
            this.configList = configList;
            return this;
        }
        public DescribePricingModuleResponseDataModuleListModuleConfigList getConfigList() {
            return this.configList;
        }

    }

    public static class DescribePricingModuleResponseDataModuleList extends TeaModel {
        @NameInMap("Module")
        @Validation(required = true)
        public java.util.List<DescribePricingModuleResponseDataModuleListModule> module;

        public static DescribePricingModuleResponseDataModuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataModuleList self = new DescribePricingModuleResponseDataModuleList();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseDataModuleList setModule(java.util.List<DescribePricingModuleResponseDataModuleListModule> module) {
            this.module = module;
            return this;
        }
        public java.util.List<DescribePricingModuleResponseDataModuleListModule> getModule() {
            return this.module;
        }

    }

    public static class DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        public static DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue self = new DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class DescribePricingModuleResponseDataAttributeListAttributeValues extends TeaModel {
        @NameInMap("AttributeValue")
        @Validation(required = true)
        public java.util.List<DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue> attributeValue;

        public static DescribePricingModuleResponseDataAttributeListAttributeValues build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataAttributeListAttributeValues self = new DescribePricingModuleResponseDataAttributeListAttributeValues();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseDataAttributeListAttributeValues setAttributeValue(java.util.List<DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue> attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public java.util.List<DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue> getAttributeValue() {
            return this.attributeValue;
        }

    }

    public static class DescribePricingModuleResponseDataAttributeListAttribute extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        @NameInMap("Values")
        @Validation(required = true)
        public DescribePricingModuleResponseDataAttributeListAttributeValues values;

        public static DescribePricingModuleResponseDataAttributeListAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataAttributeListAttribute self = new DescribePricingModuleResponseDataAttributeListAttribute();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseDataAttributeListAttribute setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePricingModuleResponseDataAttributeListAttribute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePricingModuleResponseDataAttributeListAttribute setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribePricingModuleResponseDataAttributeListAttribute setValues(DescribePricingModuleResponseDataAttributeListAttributeValues values) {
            this.values = values;
            return this;
        }
        public DescribePricingModuleResponseDataAttributeListAttributeValues getValues() {
            return this.values;
        }

    }

    public static class DescribePricingModuleResponseDataAttributeList extends TeaModel {
        @NameInMap("Attribute")
        @Validation(required = true)
        public java.util.List<DescribePricingModuleResponseDataAttributeListAttribute> attribute;

        public static DescribePricingModuleResponseDataAttributeList build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataAttributeList self = new DescribePricingModuleResponseDataAttributeList();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseDataAttributeList setAttribute(java.util.List<DescribePricingModuleResponseDataAttributeListAttribute> attribute) {
            this.attribute = attribute;
            return this;
        }
        public java.util.List<DescribePricingModuleResponseDataAttributeListAttribute> getAttribute() {
            return this.attribute;
        }

    }

    public static class DescribePricingModuleResponseData extends TeaModel {
        @NameInMap("ModuleList")
        @Validation(required = true)
        public DescribePricingModuleResponseDataModuleList moduleList;

        @NameInMap("AttributeList")
        @Validation(required = true)
        public DescribePricingModuleResponseDataAttributeList attributeList;

        public static DescribePricingModuleResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseData self = new DescribePricingModuleResponseData();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseData setModuleList(DescribePricingModuleResponseDataModuleList moduleList) {
            this.moduleList = moduleList;
            return this;
        }
        public DescribePricingModuleResponseDataModuleList getModuleList() {
            return this.moduleList;
        }

        public DescribePricingModuleResponseData setAttributeList(DescribePricingModuleResponseDataAttributeList attributeList) {
            this.attributeList = attributeList;
            return this;
        }
        public DescribePricingModuleResponseDataAttributeList getAttributeList() {
            return this.attributeList;
        }

    }

}
