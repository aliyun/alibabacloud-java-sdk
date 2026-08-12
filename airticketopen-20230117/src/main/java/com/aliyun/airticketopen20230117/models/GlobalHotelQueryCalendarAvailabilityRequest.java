// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelQueryCalendarAvailabilityRequest extends TeaModel {
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
     * <p>The end date of the check-in period to query, in the format of yyyy-MM-dd. The date cannot be earlier than the start date. The date range includes both the start and end dates, with a maximum span of 30 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-03</p>
     */
    @NameInMap("CheckInDateEnd")
    public String checkInDateEnd;

    /**
     * <p>The start date of the check-in period to query, in the format of yyyy-MM-dd. The date cannot be earlier than the current day.</p>
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
    public java.util.List<Integer> childrenAges;

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
     * <p>The list of standard hotel IDs on the platform. A maximum of 10 IDs are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;H001&quot;]</p>
     */
    @NameInMap("StandardHotelIds")
    public java.util.List<String> standardHotelIds;

    /**
     * <p>TraceId</p>
     * 
     * <strong>example:</strong>
     * <p>traceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelQueryCalendarAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelQueryCalendarAvailabilityRequest self = new GlobalHotelQueryCalendarAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public GlobalHotelQueryCalendarAvailabilityRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public GlobalHotelQueryCalendarAvailabilityRequest setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
        return this;
    }
    public Integer getAdultCount() {
        return this.adultCount;
    }

    public GlobalHotelQueryCalendarAvailabilityRequest setCheckInDateEnd(String checkInDateEnd) {
        this.checkInDateEnd = checkInDateEnd;
        return this;
    }
    public String getCheckInDateEnd() {
        return this.checkInDateEnd;
    }

    public GlobalHotelQueryCalendarAvailabilityRequest setCheckInDateStart(String checkInDateStart) {
        this.checkInDateStart = checkInDateStart;
        return this;
    }
    public String getCheckInDateStart() {
        return this.checkInDateStart;
    }

    public GlobalHotelQueryCalendarAvailabilityRequest setChildCount(Integer childCount) {
        this.childCount = childCount;
        return this;
    }
    public Integer getChildCount() {
        return this.childCount;
    }

    public GlobalHotelQueryCalendarAvailabilityRequest setChildrenAges(java.util.List<Integer> childrenAges) {
        this.childrenAges = childrenAges;
        return this;
    }
    public java.util.List<Integer> getChildrenAges() {
        return this.childrenAges;
    }

    public GlobalHotelQueryCalendarAvailabilityRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public GlobalHotelQueryCalendarAvailabilityRequest setStandardHotelIds(java.util.List<String> standardHotelIds) {
        this.standardHotelIds = standardHotelIds;
        return this;
    }
    public java.util.List<String> getStandardHotelIds() {
        return this.standardHotelIds;
    }

    public GlobalHotelQueryCalendarAvailabilityRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
