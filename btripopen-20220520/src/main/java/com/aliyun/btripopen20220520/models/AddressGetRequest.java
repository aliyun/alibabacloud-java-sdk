// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddressGetRequest extends TeaModel {
    @NameInMap("action_type")
    public Integer actionType;

    @NameInMap("car_scenes_code")
    public String carScenesCode;

    @NameInMap("itinerary_id")
    public String itineraryId;

    @NameInMap("phone")
    public String phone;

    @NameInMap("sub_corp_id")
    public String subCorpId;

    @NameInMap("type")
    public Integer type;

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

    public AddressGetRequest setCarScenesCode(String carScenesCode) {
        this.carScenesCode = carScenesCode;
        return this;
    }
    public String getCarScenesCode() {
        return this.carScenesCode;
    }

    public AddressGetRequest setItineraryId(String itineraryId) {
        this.itineraryId = itineraryId;
        return this;
    }
    public String getItineraryId() {
        return this.itineraryId;
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

    public AddressGetRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public AddressGetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
