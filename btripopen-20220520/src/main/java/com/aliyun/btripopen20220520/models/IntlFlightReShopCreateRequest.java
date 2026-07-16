// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopCreateRequest extends TeaModel {
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
    public java.util.List<IntlFlightReShopCreateRequestSelectedPassengers> selectedPassengers;

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
        @NameInMap("full_name")
        public String fullName;

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
