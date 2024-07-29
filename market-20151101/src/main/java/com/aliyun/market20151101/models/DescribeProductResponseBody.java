// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProductResponseBody extends TeaModel {
    @NameInMap("AuditFailMsg")
    public String auditFailMsg;

    /**
     * <strong>example:</strong>
     * <p>function_fail</p>
     */
    @NameInMap("AuditStatus")
    public String auditStatus;

    /**
     * <strong>example:</strong>
     * <p>1581609600000</p>
     */
    @NameInMap("AuditTime")
    public Long auditTime;

    /**
     * <strong>example:</strong>
     * <p>cmjj01**45</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>523617212</p>
     */
    @NameInMap("FrontCategoryId")
    public Long frontCategoryId;

    /**
     * <strong>example:</strong>
     * <p>1578931200000</p>
     */
    @NameInMap("GmtCreated")
    public Long gmtCreated;

    /**
     * <strong>example:</strong>
     * <p>1578931200000</p>
     */
    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p><a href="https://oss.aliyuncs.com/photogallery/photo/1930532890589852/6245/495d5f19-03e4-4c2e-9c4e-bef9ab6af1e1.png">https://oss.aliyuncs.com/photogallery/photo/1930532890589852/6245/495d5f19-03e4-4c2e-9c4e-bef9ab6af1e1.png</a></p>
     */
    @NameInMap("PicUrl")
    public String picUrl;

    @NameInMap("ProductExtras")
    public DescribeProductResponseBodyProductExtras productExtras;

    @NameInMap("ProductSkus")
    public DescribeProductResponseBodyProductSkus productSkus;

    /**
     * <strong>example:</strong>
     * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("Score")
    public Float score;

    @NameInMap("ShopInfo")
    public DescribeProductResponseBodyShopInfo shopInfo;

    @NameInMap("ShortDescription")
    public String shortDescription;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1526111111****</p>
     */
    @NameInMap("SupplierPk")
    public Long supplierPk;

    /**
     * <strong>example:</strong>
     * <p>MIRROR</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("UseCount")
    public Long useCount;

    public static DescribeProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductResponseBody self = new DescribeProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductResponseBody setAuditFailMsg(String auditFailMsg) {
        this.auditFailMsg = auditFailMsg;
        return this;
    }
    public String getAuditFailMsg() {
        return this.auditFailMsg;
    }

    public DescribeProductResponseBody setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public DescribeProductResponseBody setAuditTime(Long auditTime) {
        this.auditTime = auditTime;
        return this;
    }
    public Long getAuditTime() {
        return this.auditTime;
    }

    public DescribeProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProductResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeProductResponseBody setFrontCategoryId(Long frontCategoryId) {
        this.frontCategoryId = frontCategoryId;
        return this;
    }
    public Long getFrontCategoryId() {
        return this.frontCategoryId;
    }

    public DescribeProductResponseBody setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public DescribeProductResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DescribeProductResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeProductResponseBody setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public DescribeProductResponseBody setProductExtras(DescribeProductResponseBodyProductExtras productExtras) {
        this.productExtras = productExtras;
        return this;
    }
    public DescribeProductResponseBodyProductExtras getProductExtras() {
        return this.productExtras;
    }

    public DescribeProductResponseBody setProductSkus(DescribeProductResponseBodyProductSkus productSkus) {
        this.productSkus = productSkus;
        return this;
    }
    public DescribeProductResponseBodyProductSkus getProductSkus() {
        return this.productSkus;
    }

    public DescribeProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProductResponseBody setScore(Float score) {
        this.score = score;
        return this;
    }
    public Float getScore() {
        return this.score;
    }

    public DescribeProductResponseBody setShopInfo(DescribeProductResponseBodyShopInfo shopInfo) {
        this.shopInfo = shopInfo;
        return this;
    }
    public DescribeProductResponseBodyShopInfo getShopInfo() {
        return this.shopInfo;
    }

    public DescribeProductResponseBody setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }
    public String getShortDescription() {
        return this.shortDescription;
    }

    public DescribeProductResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeProductResponseBody setSupplierPk(Long supplierPk) {
        this.supplierPk = supplierPk;
        return this;
    }
    public Long getSupplierPk() {
        return this.supplierPk;
    }

    public DescribeProductResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeProductResponseBody setUseCount(Long useCount) {
        this.useCount = useCount;
        return this;
    }
    public Long getUseCount() {
        return this.useCount;
    }

    public static class DescribeProductResponseBodyProductExtrasProductExtra extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>product_advantage</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <strong>example:</strong>
         * <p>HTML</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public String values;

        public static DescribeProductResponseBodyProductExtrasProductExtra build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyProductExtrasProductExtra self = new DescribeProductResponseBodyProductExtrasProductExtra();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyProductExtrasProductExtra setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeProductResponseBodyProductExtrasProductExtra setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeProductResponseBodyProductExtrasProductExtra setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public DescribeProductResponseBodyProductExtrasProductExtra setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProductResponseBodyProductExtrasProductExtra setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

    public static class DescribeProductResponseBodyProductExtras extends TeaModel {
        @NameInMap("ProductExtra")
        public java.util.List<DescribeProductResponseBodyProductExtrasProductExtra> productExtra;

        public static DescribeProductResponseBodyProductExtras build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyProductExtras self = new DescribeProductResponseBodyProductExtras();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyProductExtras setProductExtra(java.util.List<DescribeProductResponseBodyProductExtrasProductExtra> productExtra) {
            this.productExtra = productExtra;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyProductExtrasProductExtra> getProductExtra() {
            return this.productExtra;
        }

    }

    public static class DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Min")
        public String min;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Step")
        public String step;

        /**
         * <strong>example:</strong>
         * <p>single_string</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>m-28e213e7t</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue self = new DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValues extends TeaModel {
        @NameInMap("PropertyValue")
        public java.util.List<DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue> propertyValue;

        public static DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValues self = new DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValues();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValues setPropertyValue(java.util.List<DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue> propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValuesPropertyValue> getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesProperty extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DisplayUnit")
        public String displayUnit;

        /**
         * <strong>example:</strong>
         * <p>img_id</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("PropertyValues")
        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValues propertyValues;

        /**
         * <strong>example:</strong>
         * <p>number</p>
         */
        @NameInMap("ShowType")
        public String showType;

        public static DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesProperty build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesProperty self = new DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesProperty();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesProperty setDisplayUnit(String displayUnit) {
            this.displayUnit = displayUnit;
            return this;
        }
        public String getDisplayUnit() {
            return this.displayUnit;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesProperty setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesProperty setPropertyValues(DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValues propertyValues) {
            this.propertyValues = propertyValues;
            return this;
        }
        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesPropertyPropertyValues getPropertyValues() {
            return this.propertyValues;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesProperty setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

    }

    public static class DescribeProductResponseBodyProductSkusProductSkuModulesModuleProperties extends TeaModel {
        @NameInMap("Property")
        public java.util.List<DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesProperty> property;

        public static DescribeProductResponseBodyProductSkusProductSkuModulesModuleProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyProductSkusProductSkuModulesModuleProperties self = new DescribeProductResponseBodyProductSkusProductSkuModulesModuleProperties();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModuleProperties setProperty(java.util.List<DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesProperty> property) {
            this.property = property;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyProductSkusProductSkuModulesModulePropertiesProperty> getProperty() {
            return this.property;
        }

    }

    public static class DescribeProductResponseBodyProductSkusProductSkuModulesModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>img_id</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>248220</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public DescribeProductResponseBodyProductSkusProductSkuModulesModuleProperties properties;

        public static DescribeProductResponseBodyProductSkusProductSkuModulesModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyProductSkusProductSkuModulesModule self = new DescribeProductResponseBodyProductSkusProductSkuModulesModule();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModule setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModule setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProductResponseBodyProductSkusProductSkuModulesModule setProperties(DescribeProductResponseBodyProductSkusProductSkuModulesModuleProperties properties) {
            this.properties = properties;
            return this;
        }
        public DescribeProductResponseBodyProductSkusProductSkuModulesModuleProperties getProperties() {
            return this.properties;
        }

    }

    public static class DescribeProductResponseBodyProductSkusProductSkuModules extends TeaModel {
        @NameInMap("Module")
        public java.util.List<DescribeProductResponseBodyProductSkusProductSkuModulesModule> module;

        public static DescribeProductResponseBodyProductSkusProductSkuModules build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyProductSkusProductSkuModules self = new DescribeProductResponseBodyProductSkusProductSkuModules();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyProductSkusProductSkuModules setModule(java.util.List<DescribeProductResponseBodyProductSkusProductSkuModulesModule> module) {
            this.module = module;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyProductSkusProductSkuModulesModule> getModule() {
            return this.module;
        }

    }

    public static class DescribeProductResponseBodyProductSkusProductSkuOrderPeriodsOrderPeriod extends TeaModel {
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

        public static DescribeProductResponseBodyProductSkusProductSkuOrderPeriodsOrderPeriod build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyProductSkusProductSkuOrderPeriodsOrderPeriod self = new DescribeProductResponseBodyProductSkusProductSkuOrderPeriodsOrderPeriod();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyProductSkusProductSkuOrderPeriodsOrderPeriod setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProductResponseBodyProductSkusProductSkuOrderPeriodsOrderPeriod setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

    }

    public static class DescribeProductResponseBodyProductSkusProductSkuOrderPeriods extends TeaModel {
        @NameInMap("OrderPeriod")
        public java.util.List<DescribeProductResponseBodyProductSkusProductSkuOrderPeriodsOrderPeriod> orderPeriod;

        public static DescribeProductResponseBodyProductSkusProductSkuOrderPeriods build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyProductSkusProductSkuOrderPeriods self = new DescribeProductResponseBodyProductSkusProductSkuOrderPeriods();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyProductSkusProductSkuOrderPeriods setOrderPeriod(java.util.List<DescribeProductResponseBodyProductSkusProductSkuOrderPeriodsOrderPeriod> orderPeriod) {
            this.orderPeriod = orderPeriod;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyProductSkusProductSkuOrderPeriodsOrderPeriod> getOrderPeriod() {
            return this.orderPeriod;
        }

    }

    public static class DescribeProductResponseBodyProductSkusProductSku extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>cmjj01****-Package</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;img_id\&quot;:{\&quot;img_version|img_region\&quot;:{\&quot;V1.7|cn-shenzhen-st3-a01\&quot;:[\&quot;m-wz9ho4hmos0lpxcldqoq\&quot;]}}</p>
         */
        @NameInMap("Constraints")
        public String constraints;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Hidden")
        public Boolean hidden;

        @NameInMap("Modules")
        public DescribeProductResponseBodyProductSkusProductSkuModules modules;

        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("OrderPeriods")
        public DescribeProductResponseBodyProductSkusProductSkuOrderPeriods orderPeriods;

        public static DescribeProductResponseBodyProductSkusProductSku build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyProductSkusProductSku self = new DescribeProductResponseBodyProductSkusProductSku();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyProductSkusProductSku setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeProductResponseBodyProductSkusProductSku setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProductResponseBodyProductSkusProductSku setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public DescribeProductResponseBodyProductSkusProductSku setHidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }
        public Boolean getHidden() {
            return this.hidden;
        }

        public DescribeProductResponseBodyProductSkusProductSku setModules(DescribeProductResponseBodyProductSkusProductSkuModules modules) {
            this.modules = modules;
            return this;
        }
        public DescribeProductResponseBodyProductSkusProductSkuModules getModules() {
            return this.modules;
        }

        public DescribeProductResponseBodyProductSkusProductSku setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProductResponseBodyProductSkusProductSku setOrderPeriods(DescribeProductResponseBodyProductSkusProductSkuOrderPeriods orderPeriods) {
            this.orderPeriods = orderPeriods;
            return this;
        }
        public DescribeProductResponseBodyProductSkusProductSkuOrderPeriods getOrderPeriods() {
            return this.orderPeriods;
        }

    }

    public static class DescribeProductResponseBodyProductSkus extends TeaModel {
        @NameInMap("ProductSku")
        public java.util.List<DescribeProductResponseBodyProductSkusProductSku> productSku;

        public static DescribeProductResponseBodyProductSkus build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyProductSkus self = new DescribeProductResponseBodyProductSkus();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyProductSkus setProductSku(java.util.List<DescribeProductResponseBodyProductSkusProductSku> productSku) {
            this.productSku = productSku;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyProductSkusProductSku> getProductSku() {
            return this.productSku;
        }

    }

    public static class DescribeProductResponseBodyShopInfoTelephones extends TeaModel {
        @NameInMap("Telephone")
        public java.util.List<String> telephone;

        public static DescribeProductResponseBodyShopInfoTelephones build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyShopInfoTelephones self = new DescribeProductResponseBodyShopInfoTelephones();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyShopInfoTelephones setTelephone(java.util.List<String> telephone) {
            this.telephone = telephone;
            return this;
        }
        public java.util.List<String> getTelephone() {
            return this.telephone;
        }

    }

    public static class DescribeProductResponseBodyShopInfoWangWangsWangWang extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>ABC</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeProductResponseBodyShopInfoWangWangsWangWang build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyShopInfoWangWangsWangWang self = new DescribeProductResponseBodyShopInfoWangWangsWangWang();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyShopInfoWangWangsWangWang setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeProductResponseBodyShopInfoWangWangsWangWang setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeProductResponseBodyShopInfoWangWangs extends TeaModel {
        @NameInMap("WangWang")
        public java.util.List<DescribeProductResponseBodyShopInfoWangWangsWangWang> wangWang;

        public static DescribeProductResponseBodyShopInfoWangWangs build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyShopInfoWangWangs self = new DescribeProductResponseBodyShopInfoWangWangs();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyShopInfoWangWangs setWangWang(java.util.List<DescribeProductResponseBodyShopInfoWangWangsWangWang> wangWang) {
            this.wangWang = wangWang;
            return this;
        }
        public java.util.List<DescribeProductResponseBodyShopInfoWangWangsWangWang> getWangWang() {
            return this.wangWang;
        }

    }

    public static class DescribeProductResponseBodyShopInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>46**<a href="mailto:41@example.com">41@example.com</a></p>
         */
        @NameInMap("Emails")
        public String emails;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Telephones")
        public DescribeProductResponseBodyShopInfoTelephones telephones;

        @NameInMap("WangWangs")
        public DescribeProductResponseBodyShopInfoWangWangs wangWangs;

        public static DescribeProductResponseBodyShopInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductResponseBodyShopInfo self = new DescribeProductResponseBodyShopInfo();
            return TeaModel.build(map, self);
        }

        public DescribeProductResponseBodyShopInfo setEmails(String emails) {
            this.emails = emails;
            return this;
        }
        public String getEmails() {
            return this.emails;
        }

        public DescribeProductResponseBodyShopInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProductResponseBodyShopInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProductResponseBodyShopInfo setTelephones(DescribeProductResponseBodyShopInfoTelephones telephones) {
            this.telephones = telephones;
            return this;
        }
        public DescribeProductResponseBodyShopInfoTelephones getTelephones() {
            return this.telephones;
        }

        public DescribeProductResponseBodyShopInfo setWangWangs(DescribeProductResponseBodyShopInfoWangWangs wangWangs) {
            this.wangWangs = wangWangs;
            return this;
        }
        public DescribeProductResponseBodyShopInfoWangWangs getWangWangs() {
            return this.wangWangs;
        }

    }

}
