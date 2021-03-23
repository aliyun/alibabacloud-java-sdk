// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribePricingModuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public DescribePricingModuleResponseBodyData data;

    public static DescribePricingModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePricingModuleResponseBody self = new DescribePricingModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePricingModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePricingModuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePricingModuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePricingModuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePricingModuleResponseBody setData(DescribePricingModuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePricingModuleResponseBodyData getData() {
        return this.data;
    }

    public static class DescribePricingModuleResponseBodyDataModuleListModuleConfigList extends TeaModel {
        @NameInMap("ConfigList")
        public java.util.List<String> configList;

        public static DescribePricingModuleResponseBodyDataModuleListModuleConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseBodyDataModuleListModuleConfigList self = new DescribePricingModuleResponseBodyDataModuleListModuleConfigList();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseBodyDataModuleListModuleConfigList setConfigList(java.util.List<String> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<String> getConfigList() {
            return this.configList;
        }

    }

    public static class DescribePricingModuleResponseBodyDataModuleListModule extends TeaModel {
        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("PriceType")
        public String priceType;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("ConfigList")
        public DescribePricingModuleResponseBodyDataModuleListModuleConfigList configList;

        public static DescribePricingModuleResponseBodyDataModuleListModule build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseBodyDataModuleListModule self = new DescribePricingModuleResponseBodyDataModuleListModule();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseBodyDataModuleListModule setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribePricingModuleResponseBodyDataModuleListModule setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DescribePricingModuleResponseBodyDataModuleListModule setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

        public DescribePricingModuleResponseBodyDataModuleListModule setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribePricingModuleResponseBodyDataModuleListModule setConfigList(DescribePricingModuleResponseBodyDataModuleListModuleConfigList configList) {
            this.configList = configList;
            return this;
        }
        public DescribePricingModuleResponseBodyDataModuleListModuleConfigList getConfigList() {
            return this.configList;
        }

    }

    public static class DescribePricingModuleResponseBodyDataModuleList extends TeaModel {
        @NameInMap("Module")
        public java.util.List<DescribePricingModuleResponseBodyDataModuleListModule> module;

        public static DescribePricingModuleResponseBodyDataModuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseBodyDataModuleList self = new DescribePricingModuleResponseBodyDataModuleList();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseBodyDataModuleList setModule(java.util.List<DescribePricingModuleResponseBodyDataModuleListModule> module) {
            this.module = module;
            return this;
        }
        public java.util.List<DescribePricingModuleResponseBodyDataModuleListModule> getModule() {
            return this.module;
        }

    }

    public static class DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        @NameInMap("Remark")
        public String remark;

        public static DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue self = new DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class DescribePricingModuleResponseBodyDataAttributeListAttributeValues extends TeaModel {
        @NameInMap("AttributeValue")
        public java.util.List<DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue> attributeValue;

        public static DescribePricingModuleResponseBodyDataAttributeListAttributeValues build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseBodyDataAttributeListAttributeValues self = new DescribePricingModuleResponseBodyDataAttributeListAttributeValues();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttributeValues setAttributeValue(java.util.List<DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue> attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public java.util.List<DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue> getAttributeValue() {
            return this.attributeValue;
        }

    }

    public static class DescribePricingModuleResponseBodyDataAttributeListAttribute extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Values")
        public DescribePricingModuleResponseBodyDataAttributeListAttributeValues values;

        public static DescribePricingModuleResponseBodyDataAttributeListAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseBodyDataAttributeListAttribute self = new DescribePricingModuleResponseBodyDataAttributeListAttribute();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttribute setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttribute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttribute setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttribute setValues(DescribePricingModuleResponseBodyDataAttributeListAttributeValues values) {
            this.values = values;
            return this;
        }
        public DescribePricingModuleResponseBodyDataAttributeListAttributeValues getValues() {
            return this.values;
        }

    }

    public static class DescribePricingModuleResponseBodyDataAttributeList extends TeaModel {
        @NameInMap("Attribute")
        public java.util.List<DescribePricingModuleResponseBodyDataAttributeListAttribute> attribute;

        public static DescribePricingModuleResponseBodyDataAttributeList build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseBodyDataAttributeList self = new DescribePricingModuleResponseBodyDataAttributeList();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseBodyDataAttributeList setAttribute(java.util.List<DescribePricingModuleResponseBodyDataAttributeListAttribute> attribute) {
            this.attribute = attribute;
            return this;
        }
        public java.util.List<DescribePricingModuleResponseBodyDataAttributeListAttribute> getAttribute() {
            return this.attribute;
        }

    }

    public static class DescribePricingModuleResponseBodyData extends TeaModel {
        @NameInMap("ModuleList")
        public DescribePricingModuleResponseBodyDataModuleList moduleList;

        @NameInMap("AttributeList")
        public DescribePricingModuleResponseBodyDataAttributeList attributeList;

        public static DescribePricingModuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseBodyData self = new DescribePricingModuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseBodyData setModuleList(DescribePricingModuleResponseBodyDataModuleList moduleList) {
            this.moduleList = moduleList;
            return this;
        }
        public DescribePricingModuleResponseBodyDataModuleList getModuleList() {
            return this.moduleList;
        }

        public DescribePricingModuleResponseBodyData setAttributeList(DescribePricingModuleResponseBodyDataAttributeList attributeList) {
            this.attributeList = attributeList;
            return this;
        }
        public DescribePricingModuleResponseBodyDataAttributeList getAttributeList() {
            return this.attributeList;
        }

    }

}
