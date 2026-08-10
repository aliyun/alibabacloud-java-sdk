// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelQueryAvailabilityShrinkRequest extends TeaModel {
    /**
     * <p>The account ID of the distributor.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>The number of adults.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AdultCount")
    public Integer adultCount;

    /**
     * <p>The check-in date in the format of yyyy-MM-dd.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-01</p>
     */
    @NameInMap("CheckInDate")
    public String checkInDate;

    /**
     * <p>The check-out date in the format of yyyy-MM-dd.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-03</p>
     */
    @NameInMap("CheckOutDate")
    public String checkOutDate;

    /**
     * <p>The number of children.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChildCount")
    public Integer childCount;

    /**
     * <p>The list of children\&quot;s ages.</p>
     * 
     * <strong>example:</strong>
     * <p>[8]</p>
     */
    @NameInMap("ChildrenAges")
    public String childrenAgesShrink;

    /**
     * <p>The number of rooms.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoomCount")
    public Integer roomCount;

    /**
     * <p>The list of standard hotel IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;H001&quot;]</p>
     */
    @NameInMap("StandardHotelIds")
    public String standardHotelIdsShrink;

    /**
     * <p>TraceId</p>
     * 
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
