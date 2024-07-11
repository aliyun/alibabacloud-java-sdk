// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderChangeApplyShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123122</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3685792244476194816</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("reason")
    public String reason;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("room_info_list")
    public String roomInfoListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1402002197440511306</p>
     */
    @NameInMap("sale_order_id")
    public String saleOrderId;

    public static HotelOrderChangeApplyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderChangeApplyShrinkRequest self = new HotelOrderChangeApplyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderChangeApplyShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelOrderChangeApplyShrinkRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public HotelOrderChangeApplyShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public HotelOrderChangeApplyShrinkRequest setRoomInfoListShrink(String roomInfoListShrink) {
        this.roomInfoListShrink = roomInfoListShrink;
        return this;
    }
    public String getRoomInfoListShrink() {
        return this.roomInfoListShrink;
    }

    public HotelOrderChangeApplyShrinkRequest setSaleOrderId(String saleOrderId) {
        this.saleOrderId = saleOrderId;
        return this;
    }
    public String getSaleOrderId() {
        return this.saleOrderId;
    }

}
