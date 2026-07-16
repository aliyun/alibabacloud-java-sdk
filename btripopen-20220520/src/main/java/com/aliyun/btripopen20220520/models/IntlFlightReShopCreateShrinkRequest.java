// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopCreateShrinkRequest extends TeaModel {
    @NameInMap("async_apply_key")
    public String asyncApplyKey;

    @NameInMap("async_apply_mode")
    public Boolean asyncApplyMode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("out_re_shop_apply_id")
    public String outReShopApplyId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_journey_group_key")
    public String passengerJourneyGroupKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("re_shop_reason_code")
    public String reShopReasonCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_passengers")
    public String selectedPassengersShrink;

    @NameInMap("total_re_shop_fee")
    public Long totalReShopFee;

    public static IntlFlightReShopCreateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopCreateShrinkRequest self = new IntlFlightReShopCreateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopCreateShrinkRequest setAsyncApplyKey(String asyncApplyKey) {
        this.asyncApplyKey = asyncApplyKey;
        return this;
    }
    public String getAsyncApplyKey() {
        return this.asyncApplyKey;
    }

    public IntlFlightReShopCreateShrinkRequest setAsyncApplyMode(Boolean asyncApplyMode) {
        this.asyncApplyMode = asyncApplyMode;
        return this;
    }
    public Boolean getAsyncApplyMode() {
        return this.asyncApplyMode;
    }

    public IntlFlightReShopCreateShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightReShopCreateShrinkRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public IntlFlightReShopCreateShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightReShopCreateShrinkRequest setOutReShopApplyId(String outReShopApplyId) {
        this.outReShopApplyId = outReShopApplyId;
        return this;
    }
    public String getOutReShopApplyId() {
        return this.outReShopApplyId;
    }

    public IntlFlightReShopCreateShrinkRequest setPassengerJourneyGroupKey(String passengerJourneyGroupKey) {
        this.passengerJourneyGroupKey = passengerJourneyGroupKey;
        return this;
    }
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    public IntlFlightReShopCreateShrinkRequest setReShopReasonCode(String reShopReasonCode) {
        this.reShopReasonCode = reShopReasonCode;
        return this;
    }
    public String getReShopReasonCode() {
        return this.reShopReasonCode;
    }

    public IntlFlightReShopCreateShrinkRequest setSelectedPassengersShrink(String selectedPassengersShrink) {
        this.selectedPassengersShrink = selectedPassengersShrink;
        return this;
    }
    public String getSelectedPassengersShrink() {
        return this.selectedPassengersShrink;
    }

    public IntlFlightReShopCreateShrinkRequest setTotalReShopFee(Long totalReShopFee) {
        this.totalReShopFee = totalReShopFee;
        return this;
    }
    public Long getTotalReShopFee() {
        return this.totalReShopFee;
    }

}
