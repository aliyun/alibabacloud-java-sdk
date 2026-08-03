// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelQueryAvailabilityShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AdultCount")
    public Integer adultCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-01</p>
     */
    @NameInMap("CheckInDate")
    public String checkInDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-03</p>
     */
    @NameInMap("CheckOutDate")
    public String checkOutDate;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChildCount")
    public Integer childCount;

    /**
     * <strong>example:</strong>
     * <p>[8]</p>
     */
    @NameInMap("ChildrenAges")
    public String childrenAgesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoomCount")
    public Integer roomCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;H001&quot;]</p>
     */
    @NameInMap("StandardHotelIds")
    public String standardHotelIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelQueryAvailabilityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelQueryAvailabilityShrinkRequest self = new GlobalHotelQueryAvailabilityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GlobalHotelQueryAvailabilityShrinkRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public GlobalHotelQueryAvailabilityShrinkRequest setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
        return this;
    }
    public Integer getAdultCount() {
        return this.adultCount;
    }

    public GlobalHotelQueryAvailabilityShrinkRequest setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
        return this;
    }
    public String getCheckInDate() {
        return this.checkInDate;
    }

    public GlobalHotelQueryAvailabilityShrinkRequest setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
        return this;
    }
    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    public GlobalHotelQueryAvailabilityShrinkRequest setChildCount(Integer childCount) {
        this.childCount = childCount;
        return this;
    }
    public Integer getChildCount() {
        return this.childCount;
    }

    public GlobalHotelQueryAvailabilityShrinkRequest setChildrenAgesShrink(String childrenAgesShrink) {
        this.childrenAgesShrink = childrenAgesShrink;
        return this;
    }
    public String getChildrenAgesShrink() {
        return this.childrenAgesShrink;
    }

    public GlobalHotelQueryAvailabilityShrinkRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public GlobalHotelQueryAvailabilityShrinkRequest setStandardHotelIdsShrink(String standardHotelIdsShrink) {
        this.standardHotelIdsShrink = standardHotelIdsShrink;
        return this;
    }
    public String getStandardHotelIdsShrink() {
        return this.standardHotelIdsShrink;
    }

    public GlobalHotelQueryAvailabilityShrinkRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
