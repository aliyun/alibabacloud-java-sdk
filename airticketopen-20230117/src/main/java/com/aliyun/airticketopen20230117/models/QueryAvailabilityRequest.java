// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class QueryAvailabilityRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
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
    public java.util.List<Integer> childrenAges;

    /**
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
     * <p>string</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static QueryAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailabilityRequest self = new QueryAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public QueryAvailabilityRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public QueryAvailabilityRequest setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
        return this;
    }
    public Integer getAdultCount() {
        return this.adultCount;
    }

    public QueryAvailabilityRequest setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
        return this;
    }
    public String getCheckInDate() {
        return this.checkInDate;
    }

    public QueryAvailabilityRequest setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
        return this;
    }
    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    public QueryAvailabilityRequest setChildCount(Integer childCount) {
        this.childCount = childCount;
        return this;
    }
    public Integer getChildCount() {
        return this.childCount;
    }

    public QueryAvailabilityRequest setChildrenAges(java.util.List<Integer> childrenAges) {
        this.childrenAges = childrenAges;
        return this;
    }
    public java.util.List<Integer> getChildrenAges() {
        return this.childrenAges;
    }

    public QueryAvailabilityRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public QueryAvailabilityRequest setStandardHotelIds(java.util.List<String> standardHotelIds) {
        this.standardHotelIds = standardHotelIds;
        return this;
    }
    public java.util.List<String> getStandardHotelIds() {
        return this.standardHotelIds;
    }

    public QueryAvailabilityRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
