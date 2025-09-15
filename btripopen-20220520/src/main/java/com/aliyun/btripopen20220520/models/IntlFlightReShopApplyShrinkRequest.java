// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopApplyShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>asyncKey_2390u230slgw023</p>
     */
    @NameInMap("async_apply_key")
    public String asyncApplyKey;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("async_apply_mode")
    public Boolean asyncApplyMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1017035199907040165</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>D1736316966048SC4877</p>
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
     * <p>edcac4f4c79d40ccb141ddb6da567e65</p>
     */
    @NameInMap("passenger_journey_group_key")
    public String passengerJourneyGroupKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("re_shop_reason_code")
    public String reShopReasonCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_journeys")
    public String selectedJourneysShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_passengers")
    public String selectedPassengersShrink;

    @NameInMap("user_intention_memo")
    public String userIntentionMemo;

    public static IntlFlightReShopApplyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopApplyShrinkRequest self = new IntlFlightReShopApplyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopApplyShrinkRequest setAsyncApplyKey(String asyncApplyKey) {
        this.asyncApplyKey = asyncApplyKey;
        return this;
    }
    public String getAsyncApplyKey() {
        return this.asyncApplyKey;
    }

    public IntlFlightReShopApplyShrinkRequest setAsyncApplyMode(Boolean asyncApplyMode) {
        this.asyncApplyMode = asyncApplyMode;
        return this;
    }
    public Boolean getAsyncApplyMode() {
        return this.asyncApplyMode;
    }

    public IntlFlightReShopApplyShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightReShopApplyShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightReShopApplyShrinkRequest setOutReShopApplyId(String outReShopApplyId) {
        this.outReShopApplyId = outReShopApplyId;
        return this;
    }
    public String getOutReShopApplyId() {
        return this.outReShopApplyId;
    }

    public IntlFlightReShopApplyShrinkRequest setPassengerJourneyGroupKey(String passengerJourneyGroupKey) {
        this.passengerJourneyGroupKey = passengerJourneyGroupKey;
        return this;
    }
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    public IntlFlightReShopApplyShrinkRequest setReShopReasonCode(String reShopReasonCode) {
        this.reShopReasonCode = reShopReasonCode;
        return this;
    }
    public String getReShopReasonCode() {
        return this.reShopReasonCode;
    }

    public IntlFlightReShopApplyShrinkRequest setSelectedJourneysShrink(String selectedJourneysShrink) {
        this.selectedJourneysShrink = selectedJourneysShrink;
        return this;
    }
    public String getSelectedJourneysShrink() {
        return this.selectedJourneysShrink;
    }

    public IntlFlightReShopApplyShrinkRequest setSelectedPassengersShrink(String selectedPassengersShrink) {
        this.selectedPassengersShrink = selectedPassengersShrink;
        return this;
    }
    public String getSelectedPassengersShrink() {
        return this.selectedPassengersShrink;
    }

    public IntlFlightReShopApplyShrinkRequest setUserIntentionMemo(String userIntentionMemo) {
        this.userIntentionMemo = userIntentionMemo;
        return this;
    }
    public String getUserIntentionMemo() {
        return this.userIntentionMemo;
    }

}
