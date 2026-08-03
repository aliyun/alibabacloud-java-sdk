// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class QueryCalendarAvailabilityRequest extends TeaModel {
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
     * <p>2026-08-03</p>
     */
    @NameInMap("CheckInDateEnd")
    public String checkInDateEnd;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-01</p>
     */
    @NameInMap("CheckInDateStart")
    public String checkInDateStart;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ChildCount")
    public Integer childCount;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ChildrenAges")
    public java.util.List<Integer> childrenAges;

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
    public java.util.List<String> standardHotelIds;

    /**
     * <strong>example:</strong>
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static QueryCalendarAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCalendarAvailabilityRequest self = new QueryCalendarAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public QueryCalendarAvailabilityRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public QueryCalendarAvailabilityRequest setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
        return this;
    }
    public Integer getAdultCount() {
        return this.adultCount;
    }

    public QueryCalendarAvailabilityRequest setCheckInDateEnd(String checkInDateEnd) {
        this.checkInDateEnd = checkInDateEnd;
        return this;
    }
    public String getCheckInDateEnd() {
        return this.checkInDateEnd;
    }

    public QueryCalendarAvailabilityRequest setCheckInDateStart(String checkInDateStart) {
        this.checkInDateStart = checkInDateStart;
        return this;
    }
    public String getCheckInDateStart() {
        return this.checkInDateStart;
    }

    public QueryCalendarAvailabilityRequest setChildCount(Integer childCount) {
        this.childCount = childCount;
        return this;
    }
    public Integer getChildCount() {
        return this.childCount;
    }

    public QueryCalendarAvailabilityRequest setChildrenAges(java.util.List<Integer> childrenAges) {
        this.childrenAges = childrenAges;
        return this;
    }
    public java.util.List<Integer> getChildrenAges() {
        return this.childrenAges;
    }

    public QueryCalendarAvailabilityRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public QueryCalendarAvailabilityRequest setStandardHotelIds(java.util.List<String> standardHotelIds) {
        this.standardHotelIds = standardHotelIds;
        return this;
    }
    public java.util.List<String> getStandardHotelIds() {
        return this.standardHotelIds;
    }

    public QueryCalendarAvailabilityRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
