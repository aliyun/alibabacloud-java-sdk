// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetSubscriptionSeatDetailsRequest extends TeaModel {
    /**
     * <p>The ID of the caller account that initiates this call.</p>
     * 
     * <strong>example:</strong>
     * <p>acc_123456789</p>
     */
    @NameInMap("CallerUacAccountId")
    public String callerUacAccountId;

    /**
     * <p>The product namespace ID. For the TokenPlan product, this field is fixed to namespace-1.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace-1</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

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
     * <li>standard</li>
     * <li>pro</li>
     * <li>max.</li>
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

    /**
     * <p>The string form of StatusList.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;CREATING\&quot;,\&quot;NORMAL\&quot;]</p>
     */
    @NameInMap("StatusListStr")
    public String statusListStr;

    public static GetSubscriptionSeatDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionSeatDetailsRequest self = new GetSubscriptionSeatDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionSeatDetailsRequest setCallerUacAccountId(String callerUacAccountId) {
        this.callerUacAccountId = callerUacAccountId;
        return this;
    }
    public String getCallerUacAccountId() {
        return this.callerUacAccountId;
    }

    public GetSubscriptionSeatDetailsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
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

    public GetSubscriptionSeatDetailsRequest setStatusListStr(String statusListStr) {
        this.statusListStr = statusListStr;
        return this;
    }
    public String getStatusListStr() {
        return this.statusListStr;
    }

}
