// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsSaleControlRequest extends TeaModel {
    @NameInMap("AliUidAccount")
    public String aliUidAccount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("CustomAccount")
    public String customAccount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SaleControls")
    public java.util.List<CreateEnsSaleControlRequestSaleControls> saleControls;

    public static CreateEnsSaleControlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsSaleControlRequest self = new CreateEnsSaleControlRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnsSaleControlRequest setAliUidAccount(String aliUidAccount) {
        this.aliUidAccount = aliUidAccount;
        return this;
    }
    public String getAliUidAccount() {
        return this.aliUidAccount;
    }

    public CreateEnsSaleControlRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateEnsSaleControlRequest setCustomAccount(String customAccount) {
        this.customAccount = customAccount;
        return this;
    }
    public String getCustomAccount() {
        return this.customAccount;
    }

    public CreateEnsSaleControlRequest setSaleControls(java.util.List<CreateEnsSaleControlRequestSaleControls> saleControls) {
        this.saleControls = saleControls;
        return this;
    }
    public java.util.List<CreateEnsSaleControlRequestSaleControls> getSaleControls() {
        return this.saleControls;
    }

    public static class CreateEnsSaleControlRequestSaleControlsConditionControls extends TeaModel {
        @NameInMap("ConditionControlModuleCode")
        public String conditionControlModuleCode;

        @NameInMap("ConditionControlModuleValue")
        public String conditionControlModuleValue;

        public static CreateEnsSaleControlRequestSaleControlsConditionControls build(java.util.Map<String, ?> map) throws Exception {
            CreateEnsSaleControlRequestSaleControlsConditionControls self = new CreateEnsSaleControlRequestSaleControlsConditionControls();
            return TeaModel.build(map, self);
        }

        public CreateEnsSaleControlRequestSaleControlsConditionControls setConditionControlModuleCode(String conditionControlModuleCode) {
            this.conditionControlModuleCode = conditionControlModuleCode;
            return this;
        }
        public String getConditionControlModuleCode() {
            return this.conditionControlModuleCode;
        }

        public CreateEnsSaleControlRequestSaleControlsConditionControls setConditionControlModuleValue(String conditionControlModuleValue) {
            this.conditionControlModuleValue = conditionControlModuleValue;
            return this;
        }
        public String getConditionControlModuleValue() {
            return this.conditionControlModuleValue;
        }

    }

    public static class CreateEnsSaleControlRequestSaleControlsModuleValue extends TeaModel {
        @NameInMap("ModuleMaxValue")
        public String moduleMaxValue;

        @NameInMap("ModuleMinValue")
        public String moduleMinValue;

        @NameInMap("ModuleValue")
        public java.util.List<String> moduleValue;

        public static CreateEnsSaleControlRequestSaleControlsModuleValue build(java.util.Map<String, ?> map) throws Exception {
            CreateEnsSaleControlRequestSaleControlsModuleValue self = new CreateEnsSaleControlRequestSaleControlsModuleValue();
            return TeaModel.build(map, self);
        }

        public CreateEnsSaleControlRequestSaleControlsModuleValue setModuleMaxValue(String moduleMaxValue) {
            this.moduleMaxValue = moduleMaxValue;
            return this;
        }
        public String getModuleMaxValue() {
            return this.moduleMaxValue;
        }

        public CreateEnsSaleControlRequestSaleControlsModuleValue setModuleMinValue(String moduleMinValue) {
            this.moduleMinValue = moduleMinValue;
            return this;
        }
        public String getModuleMinValue() {
            return this.moduleMinValue;
        }

        public CreateEnsSaleControlRequestSaleControlsModuleValue setModuleValue(java.util.List<String> moduleValue) {
            this.moduleValue = moduleValue;
            return this;
        }
        public java.util.List<String> getModuleValue() {
            return this.moduleValue;
        }

    }

    public static class CreateEnsSaleControlRequestSaleControls extends TeaModel {
        @NameInMap("ConditionControls")
        public java.util.List<CreateEnsSaleControlRequestSaleControlsConditionControls> conditionControls;

        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ModuleValue")
        public CreateEnsSaleControlRequestSaleControlsModuleValue moduleValue;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        public static CreateEnsSaleControlRequestSaleControls build(java.util.Map<String, ?> map) throws Exception {
            CreateEnsSaleControlRequestSaleControls self = new CreateEnsSaleControlRequestSaleControls();
            return TeaModel.build(map, self);
        }

        public CreateEnsSaleControlRequestSaleControls setConditionControls(java.util.List<CreateEnsSaleControlRequestSaleControlsConditionControls> conditionControls) {
            this.conditionControls = conditionControls;
            return this;
        }
        public java.util.List<CreateEnsSaleControlRequestSaleControlsConditionControls> getConditionControls() {
            return this.conditionControls;
        }

        public CreateEnsSaleControlRequestSaleControls setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEnsSaleControlRequestSaleControls setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public CreateEnsSaleControlRequestSaleControls setModuleValue(CreateEnsSaleControlRequestSaleControlsModuleValue moduleValue) {
            this.moduleValue = moduleValue;
            return this;
        }
        public CreateEnsSaleControlRequestSaleControlsModuleValue getModuleValue() {
            return this.moduleValue;
        }

        public CreateEnsSaleControlRequestSaleControls setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateEnsSaleControlRequestSaleControls setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

    }

}
