// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddressGetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("action_type")
    public Integer actionType;

    @NameInMap("arr_city_code")
    public String arrCityCode;

    @NameInMap("arr_city_name")
    public String arrCityName;

    @NameInMap("car_scenes_code")
    public String carScenesCode;

    @NameInMap("dep_city_code")
    public String depCityCode;

    @NameInMap("dep_city_name")
    public String depCityName;

    @NameInMap("dep_date")
    public String depDate;

    /**
     * <strong>example:</strong>
     * <p>460e254b5a5b4bd0801744a2790e5d78</p>
     */
    @NameInMap("itinerary_id")
    public String itineraryId;

    @NameInMap("order_Id")
    public String orderId;

    @NameInMap("phone")
    public String phone;

    @NameInMap("sub_corp_id")
    public String subCorpId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://alibtrip.open.com">https://alibtrip.open.com</a></p>
     */
    @NameInMap("taobao_callback_url")
    public String taobaoCallbackUrl;

    @NameInMap("traveler_id")
    public String travelerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("type")
    public Integer type;

    @NameInMap("use_booking_proxy")
    public Integer useBookingProxy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static AddressGetRequest build(java.util.Map<String, ?> map) throws Exception {
        AddressGetRequest self = new AddressGetRequest();
        return TeaModel.build(map, self);
    }

    public AddressGetRequest setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }
    public Integer getActionType() {
        return this.actionType;
    }

    public AddressGetRequest setArrCityCode(String arrCityCode) {
        this.arrCityCode = arrCityCode;
        return this;
    }
    public String getArrCityCode() {
        return this.arrCityCode;
    }

    public AddressGetRequest setArrCityName(String arrCityName) {
        this.arrCityName = arrCityName;
        return this;
    }
    public String getArrCityName() {
        return this.arrCityName;
    }

    public AddressGetRequest setCarScenesCode(String carScenesCode) {
        this.carScenesCode = carScenesCode;
        return this;
    }
    public String getCarScenesCode() {
        return this.carScenesCode;
    }

    public AddressGetRequest setDepCityCode(String depCityCode) {
        this.depCityCode = depCityCode;
        return this;
    }
    public String getDepCityCode() {
        return this.depCityCode;
    }

    public AddressGetRequest setDepCityName(String depCityName) {
        this.depCityName = depCityName;
        return this;
    }
    public String getDepCityName() {
        return this.depCityName;
    }

    public AddressGetRequest setDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }
    public String getDepDate() {
        return this.depDate;
    }

    public AddressGetRequest setItineraryId(String itineraryId) {
        this.itineraryId = itineraryId;
        return this;
    }
    public String getItineraryId() {
        return this.itineraryId;
    }

    public AddressGetRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AddressGetRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public AddressGetRequest setSubCorpId(String subCorpId) {
        this.subCorpId = subCorpId;
        return this;
    }
    public String getSubCorpId() {
        return this.subCorpId;
    }

    public AddressGetRequest setTaobaoCallbackUrl(String taobaoCallbackUrl) {
        this.taobaoCallbackUrl = taobaoCallbackUrl;
        return this;
    }
    public String getTaobaoCallbackUrl() {
        return this.taobaoCallbackUrl;
    }

    public AddressGetRequest setTravelerId(String travelerId) {
        this.travelerId = travelerId;
        return this;
    }
    public String getTravelerId() {
        return this.travelerId;
    }

    public AddressGetRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public AddressGetRequest setUseBookingProxy(Integer useBookingProxy) {
        this.useBookingProxy = useBookingProxy;
        return this;
    }
    public Integer getUseBookingProxy() {
        return this.useBookingProxy;
    }

    public AddressGetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
