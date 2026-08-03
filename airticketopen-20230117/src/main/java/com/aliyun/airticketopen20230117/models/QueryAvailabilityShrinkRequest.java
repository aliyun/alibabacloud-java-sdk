// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class QueryAvailabilityShrinkRequest extends TeaModel {
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
    public String childrenAgesShrink;

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
    public String standardHotelIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static QueryAvailabilityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailabilityShrinkRequest self = new QueryAvailabilityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryAvailabilityShrinkRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public QueryAvailabilityShrinkRequest setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
        return this;
    }
    public Integer getAdultCount() {
        return this.adultCount;
    }

    public QueryAvailabilityShrinkRequest setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
        return this;
    }
    public String getCheckInDate() {
        return this.checkInDate;
    }

    public QueryAvailabilityShrinkRequest setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
        return this;
    }
    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    public QueryAvailabilityShrinkRequest setChildCount(Integer childCount) {
        this.childCount = childCount;
        return this;
    }
    public Integer getChildCount() {
        return this.childCount;
    }

    public QueryAvailabilityShrinkRequest setChildrenAgesShrink(String childrenAgesShrink) {
        this.childrenAgesShrink = childrenAgesShrink;
        return this;
    }
    public String getChildrenAgesShrink() {
        return this.childrenAgesShrink;
    }

    public QueryAvailabilityShrinkRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public QueryAvailabilityShrinkRequest setStandardHotelIdsShrink(String standardHotelIdsShrink) {
        this.standardHotelIdsShrink = standardHotelIdsShrink;
        return this;
    }
    public String getStandardHotelIdsShrink() {
        return this.standardHotelIdsShrink;
    }

    public QueryAvailabilityShrinkRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
