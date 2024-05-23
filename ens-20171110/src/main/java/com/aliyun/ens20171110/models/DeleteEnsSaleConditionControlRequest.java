// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsSaleConditionControlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliUidAccount")
    public String aliUidAccount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SaleControls")
    public java.util.List<DeleteEnsSaleConditionControlRequestSaleControls> saleControls;

    public static DeleteEnsSaleConditionControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsSaleConditionControlRequest self = new DeleteEnsSaleConditionControlRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnsSaleConditionControlRequest setAliUidAccount(String aliUidAccount) {
        this.aliUidAccount = aliUidAccount;
        return this;
    }
    public String getAliUidAccount() {
        return this.aliUidAccount;
    }

    public DeleteEnsSaleConditionControlRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DeleteEnsSaleConditionControlRequest setSaleControls(java.util.List<DeleteEnsSaleConditionControlRequestSaleControls> saleControls) {
        this.saleControls = saleControls;
        return this;
    }
    public java.util.List<DeleteEnsSaleConditionControlRequestSaleControls> getSaleControls() {
        return this.saleControls;
    }

    public static class DeleteEnsSaleConditionControlRequestSaleControlsConditionControls extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConditionControlModuleCode")
        public String conditionControlModuleCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConditionControlModuleValue")
        public String conditionControlModuleValue;

        public static DeleteEnsSaleConditionControlRequestSaleControlsConditionControls build(java.util.Map<String, ?> map) throws Exception {
            DeleteEnsSaleConditionControlRequestSaleControlsConditionControls self = new DeleteEnsSaleConditionControlRequestSaleControlsConditionControls();
            return TeaModel.build(map, self);
        }

        public DeleteEnsSaleConditionControlRequestSaleControlsConditionControls setConditionControlModuleCode(String conditionControlModuleCode) {
            this.conditionControlModuleCode = conditionControlModuleCode;
            return this;
        }
        public String getConditionControlModuleCode() {
            return this.conditionControlModuleCode;
        }

        public DeleteEnsSaleConditionControlRequestSaleControlsConditionControls setConditionControlModuleValue(String conditionControlModuleValue) {
            this.conditionControlModuleValue = conditionControlModuleValue;
            return this;
        }
        public String getConditionControlModuleValue() {
            return this.conditionControlModuleValue;
        }

    }

    public static class DeleteEnsSaleConditionControlRequestSaleControls extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConditionControls")
        public java.util.List<DeleteEnsSaleConditionControlRequestSaleControlsConditionControls> conditionControls;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        public static DeleteEnsSaleConditionControlRequestSaleControls build(java.util.Map<String, ?> map) throws Exception {
            DeleteEnsSaleConditionControlRequestSaleControls self = new DeleteEnsSaleConditionControlRequestSaleControls();
            return TeaModel.build(map, self);
        }

        public DeleteEnsSaleConditionControlRequestSaleControls setConditionControls(java.util.List<DeleteEnsSaleConditionControlRequestSaleControlsConditionControls> conditionControls) {
            this.conditionControls = conditionControls;
            return this;
        }
        public java.util.List<DeleteEnsSaleConditionControlRequestSaleControlsConditionControls> getConditionControls() {
            return this.conditionControls;
        }

        public DeleteEnsSaleConditionControlRequestSaleControls setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DeleteEnsSaleConditionControlRequestSaleControls setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

    }

}
