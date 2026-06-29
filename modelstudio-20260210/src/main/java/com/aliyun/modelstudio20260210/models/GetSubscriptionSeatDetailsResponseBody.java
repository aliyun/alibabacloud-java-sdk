// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetSubscriptionSeatDetailsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GetSubscriptionSeatDetailsResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSubscriptionSeatDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionSeatDetailsResponseBody self = new GetSubscriptionSeatDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionSeatDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubscriptionSeatDetailsResponseBody setData(GetSubscriptionSeatDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSubscriptionSeatDetailsResponseBodyData getData() {
        return this.data;
    }

    public GetSubscriptionSeatDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubscriptionSeatDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList extends TeaModel {
        /**
         * <p>The end time of the current cycle, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1755273600</p>
         */
        @NameInMap("CycleEndTime")
        public Long cycleEndTime;

        /**
         * <p>The equity code (subscription code). This does not need to be consumed in CREDITS scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CycleInstanceId")
        public String cycleInstanceId;

        /**
         * <p>The start time of the current cycle, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1775232000</p>
         */
        @NameInMap("CycleStartTime")
        public Long cycleStartTime;

        /**
         * <p>The remaining quota of the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>40.00000000</p>
         */
        @NameInMap("CycleSurplusValue")
        public Double cycleSurplusValue;

        /**
         * <p>The total quota of the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00000000</p>
         */
        @NameInMap("CycleTotalValue")
        public Double cycleTotalValue;

        /**
         * <p>The time-series version of the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleVersion")
        public Long cycleVersion;

        /**
         * <p>The equity type, such as CREDITS, SPN, or resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>CREDITS</p>
         */
        @NameInMap("EquityType")
        public String equityType;

        public static GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList self = new GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList setCycleEndTime(Long cycleEndTime) {
            this.cycleEndTime = cycleEndTime;
            return this;
        }
        public Long getCycleEndTime() {
            return this.cycleEndTime;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList setCycleInstanceId(String cycleInstanceId) {
            this.cycleInstanceId = cycleInstanceId;
            return this;
        }
        public String getCycleInstanceId() {
            return this.cycleInstanceId;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList setCycleStartTime(Long cycleStartTime) {
            this.cycleStartTime = cycleStartTime;
            return this;
        }
        public Long getCycleStartTime() {
            return this.cycleStartTime;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList setCycleSurplusValue(Double cycleSurplusValue) {
            this.cycleSurplusValue = cycleSurplusValue;
            return this;
        }
        public Double getCycleSurplusValue() {
            return this.cycleSurplusValue;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList setCycleTotalValue(Double cycleTotalValue) {
            this.cycleTotalValue = cycleTotalValue;
            return this;
        }
        public Double getCycleTotalValue() {
            return this.cycleTotalValue;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList setCycleVersion(Long cycleVersion) {
            this.cycleVersion = cycleVersion;
            return this;
        }
        public Long getCycleVersion() {
            return this.cycleVersion;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList setEquityType(String equityType) {
            this.equityType = equityType;
            return this;
        }
        public String getEquityType() {
            return this.equityType;
        }

    }

    public static class GetSubscriptionSeatDetailsResponseBodyDataItems extends TeaModel {
        /**
         * <p>The mailbox of the member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@email.com">test@email.com</a></p>
         */
        @NameInMap("AccountEmail")
        public String accountEmail;

        /**
         * <p>The ID of the attached member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>acc_123456789</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleName</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The assignment status. Valid values:</p>
         * <ul>
         * <li>ASSIGNED</li>
         * <li>UNASSIGNED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASSIGNED</p>
         */
        @NameInMap("AssignedStatus")
        public String assignedStatus;

        /**
         * <p>The expiration time of the seat.</p>
         * 
         * <strong>example:</strong>
         * <p>1781422733</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The currently active equity instances. For TokenPlan products, this list contains only one active equity instance.</p>
         */
        @NameInMap("EquityList")
        public java.util.List<GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList> equityList;

        /**
         * <p>The instance code of the seat.</p>
         * 
         * <strong>example:</strong>
         * <p>subs-1234567</p>
         */
        @NameInMap("InstanceCode")
        public String instanceCode;

        /**
         * <p>The seat ID.</p>
         * 
         * <strong>example:</strong>
         * <p>seat_123456</p>
         */
        @NameInMap("SeatId")
        public String seatId;

        /**
         * <p>The seat type. Valid values: </p>
         * <ul>
         * <li>standard: standard seat.</li>
         * <li>pro: pro seat.</li>
         * <li>max: premium seat.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("SpecType")
        public String specType;

        /**
         * <p>The start time of the seat.</p>
         * 
         * <strong>example:</strong>
         * <p>1781422733</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The seat status. Valid values:</p>
         * <ul>
         * <li>CREATING: being created.</li>
         * <li>NORMAL: active.</li>
         * <li>LIMIT: restricted due to overdue payment.</li>
         * <li>RELEASE: released upon expiration.</li>
         * <li>STOP: stopped upon expiration.</li>
         * <li>REFUNDED: refunded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetSubscriptionSeatDetailsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionSeatDetailsResponseBodyDataItems self = new GetSubscriptionSeatDetailsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItems setAccountEmail(String accountEmail) {
            this.accountEmail = accountEmail;
            return this;
        }
        public String getAccountEmail() {
            return this.accountEmail;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItems setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItems setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItems setAssignedStatus(String assignedStatus) {
            this.assignedStatus = assignedStatus;
            return this;
        }
        public String getAssignedStatus() {
            return this.assignedStatus;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItems setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItems setEquityList(java.util.List<GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList> equityList) {
            this.equityList = equityList;
            return this;
        }
        public java.util.List<GetSubscriptionSeatDetailsResponseBodyDataItemsEquityList> getEquityList() {
            return this.equityList;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItems setInstanceCode(String instanceCode) {
            this.instanceCode = instanceCode;
            return this;
        }
        public String getInstanceCode() {
            return this.instanceCode;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItems setSeatId(String seatId) {
            this.seatId = seatId;
            return this;
        }
        public String getSeatId() {
            return this.seatId;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItems setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetSubscriptionSeatDetailsResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetSubscriptionSeatDetailsResponseBodyData extends TeaModel {
        /**
         * <p>The data items.</p>
         */
        @NameInMap("Items")
        public java.util.List<GetSubscriptionSeatDetailsResponseBodyDataItems> items;

        /**
         * <p>The page number. The value is greater than 0 and does not exceed the maximum value of the Integer data type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of seats.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GetSubscriptionSeatDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionSeatDetailsResponseBodyData self = new GetSubscriptionSeatDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionSeatDetailsResponseBodyData setItems(java.util.List<GetSubscriptionSeatDetailsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetSubscriptionSeatDetailsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public GetSubscriptionSeatDetailsResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetSubscriptionSeatDetailsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSubscriptionSeatDetailsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
