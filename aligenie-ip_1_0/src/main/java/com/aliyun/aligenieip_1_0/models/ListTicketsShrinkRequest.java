// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListTicketsShrinkRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("IsDesc")
    public Boolean isDesc;

    @NameInMap("IsNeedCallback")
    public Boolean isNeedCallback;

    @NameInMap("IsNeedCharges")
    public Boolean isNeedCharges;

    @NameInMap("Page")
    public String pageShrink;

    @NameInMap("RoomNo")
    public String roomNo;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    public static ListTicketsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsShrinkRequest self = new ListTicketsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTicketsShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTicketsShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListTicketsShrinkRequest setIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
        return this;
    }
    public Boolean getIsDesc() {
        return this.isDesc;
    }

    public ListTicketsShrinkRequest setIsNeedCallback(Boolean isNeedCallback) {
        this.isNeedCallback = isNeedCallback;
        return this;
    }
    public Boolean getIsNeedCallback() {
        return this.isNeedCallback;
    }

    public ListTicketsShrinkRequest setIsNeedCharges(Boolean isNeedCharges) {
        this.isNeedCharges = isNeedCharges;
        return this;
    }
    public Boolean getIsNeedCharges() {
        return this.isNeedCharges;
    }

    public ListTicketsShrinkRequest setPageShrink(String pageShrink) {
        this.pageShrink = pageShrink;
        return this;
    }
    public String getPageShrink() {
        return this.pageShrink;
    }

    public ListTicketsShrinkRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

    public ListTicketsShrinkRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListTicketsShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTicketsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTicketsShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
