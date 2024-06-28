// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribePricingModuleResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribePricingModuleResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>This API is not applicable for caller.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C40A8EE0-8084-49FE-B66E-5E1C3B6AE025</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribePricingModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePricingModuleResponseBody self = new DescribePricingModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePricingModuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePricingModuleResponseBody setData(DescribePricingModuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePricingModuleResponseBodyData getData() {
        return this.data;
    }

    public DescribePricingModuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue extends TeaModel {
        /**
         * <p>The attribute value that corresponds to the module code.</p>
         * 
         * <strong>example:</strong>
         * <p>2 Cores and 4 GB Memory (Basic Edition)</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the module values.</p>
         * 
         * <strong>example:</strong>
         * <p>Connections: 4,000 IOPS is related to storage space</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The type of the attribute value that corresponds to the module code. Valid values:</p>
         * <ul>
         * <li>single_float: single value</li>
         * <li>range_float: range value</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>single_string</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The attribute value that corresponds to the module code.</p>
         * <blockquote>
         * <p> If the Type parameter is set to range_float, the valid values of this parameter range from 1024 to 1024000. A value of 1024 indicates that the step size is 1024.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mysql.n2.medium.1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue self = new DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePricingModuleResponseBodyDataAttributeListAttributeValuesAttributeValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
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
        /**
         * <p>The code of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>DBInstanceStorage</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The name of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>Capacity</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The attribute values.</p>
         */
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
        @NameInMap("ConfigList")
        public DescribePricingModuleResponseBodyDataModuleListModuleConfigList configList;

        /**
         * <p>The currency. Default value: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The code of the pricing module.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceType</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The name of the pricing module.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The price type. Valid values:</p>
         * <ul>
         * <li>Usage: usage price</li>
         * <li>Hour: hourly price</li>
         * <li>Day: daily price</li>
         * <li>Week: weekly price</li>
         * <li>Month: monthly price</li>
         * <li>Year: annual price</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PriceType")
        public String priceType;

        public static DescribePricingModuleResponseBodyDataModuleListModule build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseBodyDataModuleListModule self = new DescribePricingModuleResponseBodyDataModuleListModule();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseBodyDataModuleListModule setConfigList(DescribePricingModuleResponseBodyDataModuleListModuleConfigList configList) {
            this.configList = configList;
            return this;
        }
        public DescribePricingModuleResponseBodyDataModuleListModuleConfigList getConfigList() {
            return this.configList;
        }

        public DescribePricingModuleResponseBodyDataModuleListModule setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
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

    public static class DescribePricingModuleResponseBodyData extends TeaModel {
        /**
         * <p>The module attributes.</p>
         */
        @NameInMap("AttributeList")
        public DescribePricingModuleResponseBodyDataAttributeList attributeList;

        /**
         * <p>The pricing information of modules.</p>
         */
        @NameInMap("ModuleList")
        public DescribePricingModuleResponseBodyDataModuleList moduleList;

        public static DescribePricingModuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseBodyData self = new DescribePricingModuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePricingModuleResponseBodyData setAttributeList(DescribePricingModuleResponseBodyDataAttributeList attributeList) {
            this.attributeList = attributeList;
            return this;
        }
        public DescribePricingModuleResponseBodyDataAttributeList getAttributeList() {
            return this.attributeList;
        }

        public DescribePricingModuleResponseBodyData setModuleList(DescribePricingModuleResponseBodyDataModuleList moduleList) {
            this.moduleList = moduleList;
            return this;
        }
        public DescribePricingModuleResponseBodyDataModuleList getModuleList() {
            return this.moduleList;
        }

    }

}
