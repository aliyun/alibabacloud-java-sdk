// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1017035200254689390</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>F11494210548838170624</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <strong>example:</strong>
     * <p>M132492719472</p>
     */
    @NameInMap("out_re_shop_apply_id")
    public String outReShopApplyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10002612002</p>
     */
    @NameInMap("re_shop_apply_id")
    public String reShopApplyId;

    public static IntlFlightReShopDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopDetailRequest self = new IntlFlightReShopDetailRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopDetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightReShopDetailRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightReShopDetailRequest setOutReShopApplyId(String outReShopApplyId) {
        this.outReShopApplyId = outReShopApplyId;
        return this;
    }
    public String getOutReShopApplyId() {
        return this.outReShopApplyId;
    }

    public IntlFlightReShopDetailRequest setReShopApplyId(String reShopApplyId) {
        this.reShopApplyId = reShopApplyId;
        return this;
    }
    public String getReShopApplyId() {
        return this.reShopApplyId;
    }

}
