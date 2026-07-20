// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopCreateRequest extends TeaModel {
    /**
     * <p>The key for the asynchronous application.</p>
     * 
     * <strong>example:</strong>
     * <p>asyncKey_2390u230slgw023</p>
     */
    @NameInMap("async_apply_key")
    public String asyncApplyKey;

    /**
     * <p>Specifies whether to use the asynchronous commit pattern. If asynchronous commit is used, only a key is returned before the application result is available.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("async_apply_mode")
    public Boolean asyncApplyMode;

    /**
     * <p>The business travel order ID. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1017035199702438072</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>The ID of the rebooking product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d01eb358456b4ba38eb4d8f1499186da_0</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    /**
     * <p>The external order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3881646464813400064</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <p>The external rebooking application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>JPM20241024354</p>
     */
    @NameInMap("out_re_shop_apply_id")
    public String outReShopApplyId;

    /**
     * <p>The rebooking group key returned by the inquiry operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edcac4f4c79d40ccb141ddb6da567e65</p>
     */
    @NameInMap("passenger_journey_group_key")
    public String passengerJourneyGroupKey;

    /**
     * <p>The rebooking reason code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("re_shop_reason_code")
    public String reShopReasonCode;

    /**
     * <p>The list of passengers selected for rebooking.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_passengers")
    public java.util.List<IntlFlightReShopCreateRequestSelectedPassengers> selectedPassengers;

    /**
     * <p>The total rebooking fee (excluding the service fee), in cents.
     *      * Total rebooking fee = cabin upgrade fee + handling fee + tax difference (applicable to international flights).
     *      * Pass in this parameter when fees are incurred to verify whether the price has changed.</p>
     * 
     * <strong>example:</strong>
     * <p>1400</p>
     */
    @NameInMap("total_re_shop_fee")
    public Long totalReShopFee;

    public static IntlFlightReShopCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopCreateRequest self = new IntlFlightReShopCreateRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopCreateRequest setAsyncApplyKey(String asyncApplyKey) {
        this.asyncApplyKey = asyncApplyKey;
        return this;
    }
    public String getAsyncApplyKey() {
        return this.asyncApplyKey;
    }

    public IntlFlightReShopCreateRequest setAsyncApplyMode(Boolean asyncApplyMode) {
        this.asyncApplyMode = asyncApplyMode;
        return this;
    }
    public Boolean getAsyncApplyMode() {
        return this.asyncApplyMode;
    }

    public IntlFlightReShopCreateRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightReShopCreateRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public IntlFlightReShopCreateRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightReShopCreateRequest setOutReShopApplyId(String outReShopApplyId) {
        this.outReShopApplyId = outReShopApplyId;
        return this;
    }
    public String getOutReShopApplyId() {
        return this.outReShopApplyId;
    }

    public IntlFlightReShopCreateRequest setPassengerJourneyGroupKey(String passengerJourneyGroupKey) {
        this.passengerJourneyGroupKey = passengerJourneyGroupKey;
        return this;
    }
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    public IntlFlightReShopCreateRequest setReShopReasonCode(String reShopReasonCode) {
        this.reShopReasonCode = reShopReasonCode;
        return this;
    }
    public String getReShopReasonCode() {
        return this.reShopReasonCode;
    }

    public IntlFlightReShopCreateRequest setSelectedPassengers(java.util.List<IntlFlightReShopCreateRequestSelectedPassengers> selectedPassengers) {
        this.selectedPassengers = selectedPassengers;
        return this;
    }
    public java.util.List<IntlFlightReShopCreateRequestSelectedPassengers> getSelectedPassengers() {
        return this.selectedPassengers;
    }

    public IntlFlightReShopCreateRequest setTotalReShopFee(Long totalReShopFee) {
        this.totalReShopFee = totalReShopFee;
        return this;
    }
    public Long getTotalReShopFee() {
        return this.totalReShopFee;
    }

    public static class IntlFlightReShopCreateRequestSelectedPassengers extends TeaModel {
        /**
         * <p>The full name of the passenger.</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("full_name")
        public String fullName;

        /**
         * <p>The ID of the passenger.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        @NameInMap("passenger_id")
        public Long passengerId;

        public static IntlFlightReShopCreateRequestSelectedPassengers build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopCreateRequestSelectedPassengers self = new IntlFlightReShopCreateRequestSelectedPassengers();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopCreateRequestSelectedPassengers setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightReShopCreateRequestSelectedPassengers setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

    }

}
