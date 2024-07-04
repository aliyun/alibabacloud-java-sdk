// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpdateEnsSaleControlRequest extends TeaModel {
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
    public java.util.List<UpdateEnsSaleControlRequestSaleControls> saleControls;

    public static UpdateEnsSaleControlRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnsSaleControlRequest self = new UpdateEnsSaleControlRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnsSaleControlRequest setAliUidAccount(String aliUidAccount) {
        this.aliUidAccount = aliUidAccount;
        return this;
    }
    public String getAliUidAccount() {
        return this.aliUidAccount;
    }

    public UpdateEnsSaleControlRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public UpdateEnsSaleControlRequest setCustomAccount(String customAccount) {
        this.customAccount = customAccount;
        return this;
    }
    public String getCustomAccount() {
        return this.customAccount;
    }

    public UpdateEnsSaleControlRequest setSaleControls(java.util.List<UpdateEnsSaleControlRequestSaleControls> saleControls) {
        this.saleControls = saleControls;
        return this;
    }
    public java.util.List<UpdateEnsSaleControlRequestSaleControls> getSaleControls() {
        return this.saleControls;
    }

    public static class UpdateEnsSaleControlRequestSaleControlsConditionControls extends TeaModel {
        @NameInMap("ConditionControlModuleCode")
        public String conditionControlModuleCode;

        @NameInMap("ConditionControlModuleValue")
        public String conditionControlModuleValue;

        public static UpdateEnsSaleControlRequestSaleControlsConditionControls build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnsSaleControlRequestSaleControlsConditionControls self = new UpdateEnsSaleControlRequestSaleControlsConditionControls();
            return TeaModel.build(map, self);
        }

        public UpdateEnsSaleControlRequestSaleControlsConditionControls setConditionControlModuleCode(String conditionControlModuleCode) {
            this.conditionControlModuleCode = conditionControlModuleCode;
            return this;
        }
        public String getConditionControlModuleCode() {
            return this.conditionControlModuleCode;
        }

        public UpdateEnsSaleControlRequestSaleControlsConditionControls setConditionControlModuleValue(String conditionControlModuleValue) {
            this.conditionControlModuleValue = conditionControlModuleValue;
            return this;
        }
        public String getConditionControlModuleValue() {
            return this.conditionControlModuleValue;
        }

    }

    public static class UpdateEnsSaleControlRequestSaleControlsModuleValue extends TeaModel {
        @NameInMap("ModuleMaxValue")
        public String moduleMaxValue;

        @NameInMap("ModuleMinValue")
        public String moduleMinValue;

        @NameInMap("ModuleValue")
        public java.util.List<String> moduleValue;

        public static UpdateEnsSaleControlRequestSaleControlsModuleValue build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnsSaleControlRequestSaleControlsModuleValue self = new UpdateEnsSaleControlRequestSaleControlsModuleValue();
            return TeaModel.build(map, self);
        }

        public UpdateEnsSaleControlRequestSaleControlsModuleValue setModuleMaxValue(String moduleMaxValue) {
            this.moduleMaxValue = moduleMaxValue;
            return this;
        }
        public String getModuleMaxValue() {
            return this.moduleMaxValue;
        }

        public UpdateEnsSaleControlRequestSaleControlsModuleValue setModuleMinValue(String moduleMinValue) {
            this.moduleMinValue = moduleMinValue;
            return this;
        }
        public String getModuleMinValue() {
            return this.moduleMinValue;
        }

        public UpdateEnsSaleControlRequestSaleControlsModuleValue setModuleValue(java.util.List<String> moduleValue) {
            this.moduleValue = moduleValue;
            return this;
        }
        public java.util.List<String> getModuleValue() {
            return this.moduleValue;
        }

    }

    public static class UpdateEnsSaleControlRequestSaleControls extends TeaModel {
        @NameInMap("ConditionControls")
        public java.util.List<UpdateEnsSaleControlRequestSaleControlsConditionControls> conditionControls;

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
        public UpdateEnsSaleControlRequestSaleControlsModuleValue moduleValue;

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

        public static UpdateEnsSaleControlRequestSaleControls build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnsSaleControlRequestSaleControls self = new UpdateEnsSaleControlRequestSaleControls();
            return TeaModel.build(map, self);
        }

        public UpdateEnsSaleControlRequestSaleControls setConditionControls(java.util.List<UpdateEnsSaleControlRequestSaleControlsConditionControls> conditionControls) {
            this.conditionControls = conditionControls;
            return this;
        }
        public java.util.List<UpdateEnsSaleControlRequestSaleControlsConditionControls> getConditionControls() {
            return this.conditionControls;
        }

        public UpdateEnsSaleControlRequestSaleControls setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateEnsSaleControlRequestSaleControls setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public UpdateEnsSaleControlRequestSaleControls setModuleValue(UpdateEnsSaleControlRequestSaleControlsModuleValue moduleValue) {
            this.moduleValue = moduleValue;
            return this;
        }
        public UpdateEnsSaleControlRequestSaleControlsModuleValue getModuleValue() {
            return this.moduleValue;
        }

        public UpdateEnsSaleControlRequestSaleControls setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateEnsSaleControlRequestSaleControls setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

    }

}
