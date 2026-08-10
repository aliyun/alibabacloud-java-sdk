// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelQueryCalendarAvailabilityShrinkRequest extends TeaModel {
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
     * <p>The end date of the check-in date range in the format yyyy-MM-dd.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-03</p>
     */
    @NameInMap("CheckInDateEnd")
    public String checkInDateEnd;

    /**
     * <p>The start date of the check-in date range in the format yyyy-MM-dd.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-01</p>
     */
    @NameInMap("CheckInDateStart")
    public String checkInDateStart;

    /**
     * <p>The number of children.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ChildCount")
    public Integer childCount;

    /**
     * <p>The list of children\&quot;s ages.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
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
     * <p>The IDs of the hotels.</p>
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
     * <p>traceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelQueryCalendarAvailabilityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelQueryCalendarAvailabilityShrinkRequest self = new GlobalHotelQueryCalendarAvailabilityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GlobalHotelQueryCalendarAvailabilityShrinkRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public GlobalHotelQueryCalendarAvailabilityShrinkRequest setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
        return this;
    }
    public Integer getAdultCount() {
        return this.adultCount;
    }

    public GlobalHotelQueryCalendarAvailabilityShrinkRequest setCheckInDateEnd(String checkInDateEnd) {
        this.checkInDateEnd = checkInDateEnd;
        return this;
    }
    public String getCheckInDateEnd() {
        return this.checkInDateEnd;
    }

    public GlobalHotelQueryCalendarAvailabilityShrinkRequest setCheckInDateStart(String checkInDateStart) {
        this.checkInDateStart = checkInDateStart;
        return this;
    }
    public String getCheckInDateStart() {
        return this.checkInDateStart;
    }

    public GlobalHotelQueryCalendarAvailabilityShrinkRequest setChildCount(Integer childCount) {
        this.childCount = childCount;
        return this;
    }
    public Integer getChildCount() {
        return this.childCount;
    }

    public GlobalHotelQueryCalendarAvailabilityShrinkRequest setChildrenAgesShrink(String childrenAgesShrink) {
        this.childrenAgesShrink = childrenAgesShrink;
        return this;
    }
    public String getChildrenAgesShrink() {
        return this.childrenAgesShrink;
    }

    public GlobalHotelQueryCalendarAvailabilityShrinkRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public GlobalHotelQueryCalendarAvailabilityShrinkRequest setStandardHotelIdsShrink(String standardHotelIdsShrink) {
        this.standardHotelIdsShrink = standardHotelIdsShrink;
        return this;
    }
    public String getStandardHotelIdsShrink() {
        return this.standardHotelIdsShrink;
    }

    public GlobalHotelQueryCalendarAvailabilityShrinkRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
