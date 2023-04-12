// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CreateHotelShrinkRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("EstOpenTime")
    public String estOpenTime;

    @NameInMap("HotelAddress")
    public String hotelAddress;

    @NameInMap("HotelEmail")
    public String hotelEmail;

    @NameInMap("HotelName")
    public String hotelName;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("RelatedPk")
    public String relatedPk;

    @NameInMap("RelatedPks")
    public String relatedPksShrink;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RoomNum")
    public Integer roomNum;

    @NameInMap("TbOpenId")
    public String tbOpenId;

    public static CreateHotelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHotelShrinkRequest self = new CreateHotelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateHotelShrinkRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateHotelShrinkRequest setEstOpenTime(String estOpenTime) {
        this.estOpenTime = estOpenTime;
        return this;
    }
    public String getEstOpenTime() {
        return this.estOpenTime;
    }

    public CreateHotelShrinkRequest setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
        return this;
    }
    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public CreateHotelShrinkRequest setHotelEmail(String hotelEmail) {
        this.hotelEmail = hotelEmail;
        return this;
    }
    public String getHotelEmail() {
        return this.hotelEmail;
    }

    public CreateHotelShrinkRequest setHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }
    public String getHotelName() {
        return this.hotelName;
    }

    public CreateHotelShrinkRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CreateHotelShrinkRequest setRelatedPk(String relatedPk) {
        this.relatedPk = relatedPk;
        return this;
    }
    public String getRelatedPk() {
        return this.relatedPk;
    }

    public CreateHotelShrinkRequest setRelatedPksShrink(String relatedPksShrink) {
        this.relatedPksShrink = relatedPksShrink;
        return this;
    }
    public String getRelatedPksShrink() {
        return this.relatedPksShrink;
    }

    public CreateHotelShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateHotelShrinkRequest setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
        return this;
    }
    public Integer getRoomNum() {
        return this.roomNum;
    }

    public CreateHotelShrinkRequest setTbOpenId(String tbOpenId) {
        this.tbOpenId = tbOpenId;
        return this;
    }
    public String getTbOpenId() {
        return this.tbOpenId;
    }

}
