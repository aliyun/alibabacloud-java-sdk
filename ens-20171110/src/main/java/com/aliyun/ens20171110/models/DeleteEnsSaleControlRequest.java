// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsSaleControlRequest extends TeaModel {
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
    public java.util.List<DeleteEnsSaleControlRequestSaleControls> saleControls;

    public static DeleteEnsSaleControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsSaleControlRequest self = new DeleteEnsSaleControlRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnsSaleControlRequest setAliUidAccount(String aliUidAccount) {
        this.aliUidAccount = aliUidAccount;
        return this;
    }
    public String getAliUidAccount() {
        return this.aliUidAccount;
    }

    public DeleteEnsSaleControlRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DeleteEnsSaleControlRequest setCustomAccount(String customAccount) {
        this.customAccount = customAccount;
        return this;
    }
    public String getCustomAccount() {
        return this.customAccount;
    }

    public DeleteEnsSaleControlRequest setSaleControls(java.util.List<DeleteEnsSaleControlRequestSaleControls> saleControls) {
        this.saleControls = saleControls;
        return this;
    }
    public java.util.List<DeleteEnsSaleControlRequestSaleControls> getSaleControls() {
        return this.saleControls;
    }

    public static class DeleteEnsSaleControlRequestSaleControls extends TeaModel {
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

        public static DeleteEnsSaleControlRequestSaleControls build(java.util.Map<String, ?> map) throws Exception {
            DeleteEnsSaleControlRequestSaleControls self = new DeleteEnsSaleControlRequestSaleControls();
            return TeaModel.build(map, self);
        }

        public DeleteEnsSaleControlRequestSaleControls setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DeleteEnsSaleControlRequestSaleControls setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

    }

}
