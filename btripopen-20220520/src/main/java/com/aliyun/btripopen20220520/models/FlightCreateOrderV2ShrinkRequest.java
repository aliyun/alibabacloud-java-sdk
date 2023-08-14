// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCreateOrderV2ShrinkRequest extends TeaModel {
    @NameInMap("async_create_order_key")
    public String asyncCreateOrderKey;

    @NameInMap("async_create_order_mode")
    public Boolean asyncCreateOrderMode;

    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    @NameInMap("contact_info")
    public String contactInfoShrink;

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("ota_item_id")
    public String otaItemId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("total_price_cent")
    public Long totalPriceCent;

    @NameInMap("travelers")
    public String travelersShrink;

    public static FlightCreateOrderV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightCreateOrderV2ShrinkRequest self = new FlightCreateOrderV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightCreateOrderV2ShrinkRequest setAsyncCreateOrderKey(String asyncCreateOrderKey) {
        this.asyncCreateOrderKey = asyncCreateOrderKey;
        return this;
    }
    public String getAsyncCreateOrderKey() {
        return this.asyncCreateOrderKey;
    }

    public FlightCreateOrderV2ShrinkRequest setAsyncCreateOrderMode(Boolean asyncCreateOrderMode) {
        this.asyncCreateOrderMode = asyncCreateOrderMode;
        return this;
    }
    public Boolean getAsyncCreateOrderMode() {
        return this.asyncCreateOrderMode;
    }

    public FlightCreateOrderV2ShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public FlightCreateOrderV2ShrinkRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public FlightCreateOrderV2ShrinkRequest setContactInfoShrink(String contactInfoShrink) {
        this.contactInfoShrink = contactInfoShrink;
        return this;
    }
    public String getContactInfoShrink() {
        return this.contactInfoShrink;
    }

    public FlightCreateOrderV2ShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightCreateOrderV2ShrinkRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public FlightCreateOrderV2ShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightCreateOrderV2ShrinkRequest setTotalPriceCent(Long totalPriceCent) {
        this.totalPriceCent = totalPriceCent;
        return this;
    }
    public Long getTotalPriceCent() {
        return this.totalPriceCent;
    }

    public FlightCreateOrderV2ShrinkRequest setTravelersShrink(String travelersShrink) {
        this.travelersShrink = travelersShrink;
        return this;
    }
    public String getTravelersShrink() {
        return this.travelersShrink;
    }

}
