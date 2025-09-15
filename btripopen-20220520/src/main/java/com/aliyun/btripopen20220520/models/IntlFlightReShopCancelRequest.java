// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopCancelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1017035199763856322</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>JPT2025032400000001</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <strong>example:</strong>
     * <p>JPM20241024354</p>
     */
    @NameInMap("out_re_shop_apply_id")
    public String outReShopApplyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1019202345889633</p>
     */
    @NameInMap("re_shop_apply_id")
    public String reShopApplyId;

    public static IntlFlightReShopCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopCancelRequest self = new IntlFlightReShopCancelRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopCancelRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightReShopCancelRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightReShopCancelRequest setOutReShopApplyId(String outReShopApplyId) {
        this.outReShopApplyId = outReShopApplyId;
        return this;
    }
    public String getOutReShopApplyId() {
        return this.outReShopApplyId;
    }

    public IntlFlightReShopCancelRequest setReShopApplyId(String reShopApplyId) {
        this.reShopApplyId = reShopApplyId;
        return this;
    }
    public String getReShopApplyId() {
        return this.reShopApplyId;
    }

}
