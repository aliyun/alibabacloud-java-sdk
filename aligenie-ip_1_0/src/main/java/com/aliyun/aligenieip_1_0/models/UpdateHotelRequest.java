// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("EstOpenTime")
    public String estOpenTime;

    @NameInMap("HotelAddress")
    public String hotelAddress;

    @NameInMap("HotelEmail")
    public String hotelEmail;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("HotelName")
    public String hotelName;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("RelatedPks")
    public java.util.List<String> relatedPks;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RoomNum")
    public Integer roomNum;

    @NameInMap("TbOpenId")
    public String tbOpenId;

    public static UpdateHotelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelRequest self = new UpdateHotelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHotelRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public UpdateHotelRequest setEstOpenTime(String estOpenTime) {
        this.estOpenTime = estOpenTime;
        return this;
    }
    public String getEstOpenTime() {
        return this.estOpenTime;
    }

    public UpdateHotelRequest setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
        return this;
    }
    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public UpdateHotelRequest setHotelEmail(String hotelEmail) {
        this.hotelEmail = hotelEmail;
        return this;
    }
    public String getHotelEmail() {
        return this.hotelEmail;
    }

    public UpdateHotelRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateHotelRequest setHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }
    public String getHotelName() {
        return this.hotelName;
    }

    public UpdateHotelRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateHotelRequest setRelatedPks(java.util.List<String> relatedPks) {
        this.relatedPks = relatedPks;
        return this;
    }
    public java.util.List<String> getRelatedPks() {
        return this.relatedPks;
    }

    public UpdateHotelRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateHotelRequest setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
        return this;
    }
    public Integer getRoomNum() {
        return this.roomNum;
    }

    public UpdateHotelRequest setTbOpenId(String tbOpenId) {
        this.tbOpenId = tbOpenId;
        return this;
    }
    public String getTbOpenId() {
        return this.tbOpenId;
    }

}
