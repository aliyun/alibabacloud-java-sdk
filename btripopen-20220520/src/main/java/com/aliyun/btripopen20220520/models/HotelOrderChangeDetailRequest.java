// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderChangeDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123455</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21351235134</p>
     */
    @NameInMap("change_order_id")
    public String changeOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dis123</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1402002197440511306</p>
     */
    @NameInMap("sale_order_id")
    public String saleOrderId;

    public static HotelOrderChangeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderChangeDetailRequest self = new HotelOrderChangeDetailRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderChangeDetailRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelOrderChangeDetailRequest setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public HotelOrderChangeDetailRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public HotelOrderChangeDetailRequest setSaleOrderId(String saleOrderId) {
        this.saleOrderId = saleOrderId;
        return this;
    }
    public String getSaleOrderId() {
        return this.saleOrderId;
    }

}
