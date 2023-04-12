// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelShrinkRequest extends TeaModel {
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
    public String relatedPksShrink;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RoomNum")
    public Integer roomNum;

    @NameInMap("TbOpenId")
    public String tbOpenId;

    public static UpdateHotelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelShrinkRequest self = new UpdateHotelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHotelShrinkRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public UpdateHotelShrinkRequest setEstOpenTime(String estOpenTime) {
        this.estOpenTime = estOpenTime;
        return this;
    }
    public String getEstOpenTime() {
        return this.estOpenTime;
    }

    public UpdateHotelShrinkRequest setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
        return this;
    }
    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public UpdateHotelShrinkRequest setHotelEmail(String hotelEmail) {
        this.hotelEmail = hotelEmail;
        return this;
    }
    public String getHotelEmail() {
        return this.hotelEmail;
    }

    public UpdateHotelShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateHotelShrinkRequest setHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }
    public String getHotelName() {
        return this.hotelName;
    }

    public UpdateHotelShrinkRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateHotelShrinkRequest setRelatedPksShrink(String relatedPksShrink) {
        this.relatedPksShrink = relatedPksShrink;
        return this;
    }
    public String getRelatedPksShrink() {
        return this.relatedPksShrink;
    }

    public UpdateHotelShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateHotelShrinkRequest setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
        return this;
    }
    public Integer getRoomNum() {
        return this.roomNum;
    }

    public UpdateHotelShrinkRequest setTbOpenId(String tbOpenId) {
        this.tbOpenId = tbOpenId;
        return this;
    }
    public String getTbOpenId() {
        return this.tbOpenId;
    }

}
