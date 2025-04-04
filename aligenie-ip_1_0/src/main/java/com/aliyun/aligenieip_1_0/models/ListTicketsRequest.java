// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListTicketsRequest extends TeaModel {
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
    public ListTicketsRequestPage page;

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

    public static ListTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsRequest self = new ListTicketsRequest();
        return TeaModel.build(map, self);
    }

    public ListTicketsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTicketsRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListTicketsRequest setIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
        return this;
    }
    public Boolean getIsDesc() {
        return this.isDesc;
    }

    public ListTicketsRequest setIsNeedCallback(Boolean isNeedCallback) {
        this.isNeedCallback = isNeedCallback;
        return this;
    }
    public Boolean getIsNeedCallback() {
        return this.isNeedCallback;
    }

    public ListTicketsRequest setIsNeedCharges(Boolean isNeedCharges) {
        this.isNeedCharges = isNeedCharges;
        return this;
    }
    public Boolean getIsNeedCharges() {
        return this.isNeedCharges;
    }

    public ListTicketsRequest setPage(ListTicketsRequestPage page) {
        this.page = page;
        return this;
    }
    public ListTicketsRequestPage getPage() {
        return this.page;
    }

    public ListTicketsRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

    public ListTicketsRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListTicketsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTicketsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTicketsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListTicketsRequestPage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListTicketsRequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListTicketsRequestPage self = new ListTicketsRequestPage();
            return TeaModel.build(map, self);
        }

        public ListTicketsRequestPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListTicketsRequestPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
