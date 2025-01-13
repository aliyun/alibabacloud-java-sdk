// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListTicketsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2022-09-14 14:23:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af7***536</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDesc")
    public Boolean isDesc;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsNeedCallback")
    public Boolean isNeedCallback;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsNeedCharges")
    public Boolean isNeedCharges;

    @NameInMap("Page")
    public String pageShrink;

    /**
     * <strong>example:</strong>
     * <p>1211</p>
     */
    @NameInMap("RoomNo")
    public String roomNo;

    /**
     * <strong>example:</strong>
     * <p>gmtCalled</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <strong>example:</strong>
     * <p>2022-04-08 09:39:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>waiting</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
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
