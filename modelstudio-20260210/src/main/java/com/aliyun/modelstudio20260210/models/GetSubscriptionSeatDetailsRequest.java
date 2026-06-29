// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetSubscriptionSeatDetailsRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1. Valid values: positive integers.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The seat assignment status filter. Set to true for assigned seats, false for unassigned seats, or null for all seats.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("QueryAssigned")
    public Boolean queryAssigned;

    /**
     * <p>The seat ID.</p>
     * 
     * <strong>example:</strong>
     * <p>seat-123456</p>
     */
    @NameInMap("SeatId")
    public String seatId;

    /**
     * <p>The seat type (specType). Valid values:</p>
     * <ul>
     * <li>standard: standard seat.</li>
     * <li>pro: pro seat.</li>
     * <li>max: premium seat.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("SeatType")
    public String seatType;

    /**
     * <p>The list of seat statuses used for filtering.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    public static GetSubscriptionSeatDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionSeatDetailsRequest self = new GetSubscriptionSeatDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionSeatDetailsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetSubscriptionSeatDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSubscriptionSeatDetailsRequest setQueryAssigned(Boolean queryAssigned) {
        this.queryAssigned = queryAssigned;
        return this;
    }
    public Boolean getQueryAssigned() {
        return this.queryAssigned;
    }

    public GetSubscriptionSeatDetailsRequest setSeatId(String seatId) {
        this.seatId = seatId;
        return this;
    }
    public String getSeatId() {
        return this.seatId;
    }

    public GetSubscriptionSeatDetailsRequest setSeatType(String seatType) {
        this.seatType = seatType;
        return this;
    }
    public String getSeatType() {
        return this.seatType;
    }

    public GetSubscriptionSeatDetailsRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}
