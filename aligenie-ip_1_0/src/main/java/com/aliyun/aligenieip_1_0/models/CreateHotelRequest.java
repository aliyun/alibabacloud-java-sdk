// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CreateHotelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>333566791</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-1 00:00:00</p>
     */
    @NameInMap("EstOpenTime")
    public String estOpenTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HotelAddress")
    public String hotelAddress;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@hotel.com">test@hotel.com</a></p>
     */
    @NameInMap("HotelEmail")
    public String hotelEmail;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HotelName")
    public String hotelName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13xxxxxxxx</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jTO****Rw</p>
     */
    @NameInMap("RelatedPk")
    public String relatedPk;

    /**
     * <p>酒店关联产品列表</p>
     */
    @NameInMap("RelatedPks")
    public java.util.List<String> relatedPks;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("RoomNum")
    public Integer roomNum;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAEV***E3d3Z2ETwh</p>
     */
    @NameInMap("TbOpenId")
    public String tbOpenId;

    public static CreateHotelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHotelRequest self = new CreateHotelRequest();
        return TeaModel.build(map, self);
    }

    public CreateHotelRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateHotelRequest setEstOpenTime(String estOpenTime) {
        this.estOpenTime = estOpenTime;
        return this;
    }
    public String getEstOpenTime() {
        return this.estOpenTime;
    }

    public CreateHotelRequest setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
        return this;
    }
    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public CreateHotelRequest setHotelEmail(String hotelEmail) {
        this.hotelEmail = hotelEmail;
        return this;
    }
    public String getHotelEmail() {
        return this.hotelEmail;
    }

    public CreateHotelRequest setHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }
    public String getHotelName() {
        return this.hotelName;
    }

    public CreateHotelRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CreateHotelRequest setRelatedPk(String relatedPk) {
        this.relatedPk = relatedPk;
        return this;
    }
    public String getRelatedPk() {
        return this.relatedPk;
    }

    public CreateHotelRequest setRelatedPks(java.util.List<String> relatedPks) {
        this.relatedPks = relatedPks;
        return this;
    }
    public java.util.List<String> getRelatedPks() {
        return this.relatedPks;
    }

    public CreateHotelRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateHotelRequest setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
        return this;
    }
    public Integer getRoomNum() {
        return this.roomNum;
    }

    public CreateHotelRequest setTbOpenId(String tbOpenId) {
        this.tbOpenId = tbOpenId;
        return this;
    }
    public String getTbOpenId() {
        return this.tbOpenId;
    }

}
