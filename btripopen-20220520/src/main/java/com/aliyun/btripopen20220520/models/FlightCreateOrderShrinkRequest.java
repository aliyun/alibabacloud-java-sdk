// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCreateOrderShrinkRequest extends TeaModel {
    @NameInMap("arr_airport_code")
    public String arrAirportCode;

    @NameInMap("arr_city_code")
    public String arrCityCode;

    @NameInMap("auto_pay")
    public Integer autoPay;

    @NameInMap("buyer_name")
    public String buyerName;

    @NameInMap("buyer_unique_key")
    public String buyerUniqueKey;

    @NameInMap("contact_info")
    public String contactInfoShrink;

    @NameInMap("dep_airport_code")
    public String depAirportCode;

    @NameInMap("dep_city_code")
    public String depCityCode;

    @NameInMap("dep_date")
    public String depDate;

    @NameInMap("dis_order_id")
    public String disOrderId;

    @NameInMap("order_attr")
    public String orderAttrShrink;

    @NameInMap("order_params")
    public String orderParams;

    @NameInMap("ota_item_id")
    public String otaItemId;

    @NameInMap("price")
    public Long price;

    @NameInMap("receipt_address")
    public String receiptAddress;

    @NameInMap("receipt_target")
    public Integer receiptTarget;

    @NameInMap("receipt_title")
    public String receiptTitle;

    @NameInMap("traveler_info_list")
    public String travelerInfoListShrink;

    @NameInMap("trip_type")
    public Integer tripType;

    public static FlightCreateOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightCreateOrderShrinkRequest self = new FlightCreateOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightCreateOrderShrinkRequest setArrAirportCode(String arrAirportCode) {
        this.arrAirportCode = arrAirportCode;
        return this;
    }
    public String getArrAirportCode() {
        return this.arrAirportCode;
    }

    public FlightCreateOrderShrinkRequest setArrCityCode(String arrCityCode) {
        this.arrCityCode = arrCityCode;
        return this;
    }
    public String getArrCityCode() {
        return this.arrCityCode;
    }

    public FlightCreateOrderShrinkRequest setAutoPay(Integer autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Integer getAutoPay() {
        return this.autoPay;
    }

    public FlightCreateOrderShrinkRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public FlightCreateOrderShrinkRequest setBuyerUniqueKey(String buyerUniqueKey) {
        this.buyerUniqueKey = buyerUniqueKey;
        return this;
    }
    public String getBuyerUniqueKey() {
        return this.buyerUniqueKey;
    }

    public FlightCreateOrderShrinkRequest setContactInfoShrink(String contactInfoShrink) {
        this.contactInfoShrink = contactInfoShrink;
        return this;
    }
    public String getContactInfoShrink() {
        return this.contactInfoShrink;
    }

    public FlightCreateOrderShrinkRequest setDepAirportCode(String depAirportCode) {
        this.depAirportCode = depAirportCode;
        return this;
    }
    public String getDepAirportCode() {
        return this.depAirportCode;
    }

    public FlightCreateOrderShrinkRequest setDepCityCode(String depCityCode) {
        this.depCityCode = depCityCode;
        return this;
    }
    public String getDepCityCode() {
        return this.depCityCode;
    }

    public FlightCreateOrderShrinkRequest setDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }
    public String getDepDate() {
        return this.depDate;
    }

    public FlightCreateOrderShrinkRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public FlightCreateOrderShrinkRequest setOrderAttrShrink(String orderAttrShrink) {
        this.orderAttrShrink = orderAttrShrink;
        return this;
    }
    public String getOrderAttrShrink() {
        return this.orderAttrShrink;
    }

    public FlightCreateOrderShrinkRequest setOrderParams(String orderParams) {
        this.orderParams = orderParams;
        return this;
    }
    public String getOrderParams() {
        return this.orderParams;
    }

    public FlightCreateOrderShrinkRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public FlightCreateOrderShrinkRequest setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public FlightCreateOrderShrinkRequest setReceiptAddress(String receiptAddress) {
        this.receiptAddress = receiptAddress;
        return this;
    }
    public String getReceiptAddress() {
        return this.receiptAddress;
    }

    public FlightCreateOrderShrinkRequest setReceiptTarget(Integer receiptTarget) {
        this.receiptTarget = receiptTarget;
        return this;
    }
    public Integer getReceiptTarget() {
        return this.receiptTarget;
    }

    public FlightCreateOrderShrinkRequest setReceiptTitle(String receiptTitle) {
        this.receiptTitle = receiptTitle;
        return this;
    }
    public String getReceiptTitle() {
        return this.receiptTitle;
    }

    public FlightCreateOrderShrinkRequest setTravelerInfoListShrink(String travelerInfoListShrink) {
        this.travelerInfoListShrink = travelerInfoListShrink;
        return this;
    }
    public String getTravelerInfoListShrink() {
        return this.travelerInfoListShrink;
    }

    public FlightCreateOrderShrinkRequest setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

}
