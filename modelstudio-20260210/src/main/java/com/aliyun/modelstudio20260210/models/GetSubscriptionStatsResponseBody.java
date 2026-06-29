// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetSubscriptionStatsResponseBody extends TeaModel {
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
    public GetSubscriptionStatsResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
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

    public static GetSubscriptionStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionStatsResponseBody self = new GetSubscriptionStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubscriptionStatsResponseBody setData(GetSubscriptionStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSubscriptionStatsResponseBodyData getData() {
        return this.data;
    }

    public GetSubscriptionStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubscriptionStatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSubscriptionStatsResponseBodyDataItems extends TeaModel {
        /**
         * <p>The number of assigned seats.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AssignedSeats")
        public Long assignedSeats;

        /**
         * <p>The total credits quota for the seat.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SeatCredits")
        public Double seatCredits;

        /**
         * <p>The refresh time of the current cycle, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1781422734</p>
         */
        @NameInMap("SeatRefreshTime")
        public Long seatRefreshTime;

        /**
         * <p>The remaining credits for the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SeatRemainingCredits")
        public Double seatRemainingCredits;

        /**
         * <p>The seat type (specType). Valid values:</p>
         * <ul>
         * <li>standard: Standard seat.</li>
         * <li>pro: Pro seat.</li>
         * <li>max: Premium seat.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("SeatType")
        public String seatType;

        /**
         * <p>The total number of seats.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalSeats")
        public Long totalSeats;

        public static GetSubscriptionStatsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionStatsResponseBodyDataItems self = new GetSubscriptionStatsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionStatsResponseBodyDataItems setAssignedSeats(Long assignedSeats) {
            this.assignedSeats = assignedSeats;
            return this;
        }
        public Long getAssignedSeats() {
            return this.assignedSeats;
        }

        public GetSubscriptionStatsResponseBodyDataItems setSeatCredits(Double seatCredits) {
            this.seatCredits = seatCredits;
            return this;
        }
        public Double getSeatCredits() {
            return this.seatCredits;
        }

        public GetSubscriptionStatsResponseBodyDataItems setSeatRefreshTime(Long seatRefreshTime) {
            this.seatRefreshTime = seatRefreshTime;
            return this;
        }
        public Long getSeatRefreshTime() {
            return this.seatRefreshTime;
        }

        public GetSubscriptionStatsResponseBodyDataItems setSeatRemainingCredits(Double seatRemainingCredits) {
            this.seatRemainingCredits = seatRemainingCredits;
            return this;
        }
        public Double getSeatRemainingCredits() {
            return this.seatRemainingCredits;
        }

        public GetSubscriptionStatsResponseBodyDataItems setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public GetSubscriptionStatsResponseBodyDataItems setTotalSeats(Long totalSeats) {
            this.totalSeats = totalSeats;
            return this;
        }
        public Long getTotalSeats() {
            return this.totalSeats;
        }

    }

    public static class GetSubscriptionStatsResponseBodyData extends TeaModel {
        /**
         * <p>The list of seat information, grouped by specType.</p>
         */
        @NameInMap("Items")
        public java.util.List<GetSubscriptionStatsResponseBodyDataItems> items;

        /**
         * <p>The subscription end time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1781422734</p>
         */
        @NameInMap("SubscriptionEndTime")
        public Long subscriptionEndTime;

        /**
         * <p>The subscription start time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1781422733</p>
         */
        @NameInMap("SubscriptionStartTime")
        public Long subscriptionStartTime;

        public static GetSubscriptionStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionStatsResponseBodyData self = new GetSubscriptionStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionStatsResponseBodyData setItems(java.util.List<GetSubscriptionStatsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetSubscriptionStatsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public GetSubscriptionStatsResponseBodyData setSubscriptionEndTime(Long subscriptionEndTime) {
            this.subscriptionEndTime = subscriptionEndTime;
            return this;
        }
        public Long getSubscriptionEndTime() {
            return this.subscriptionEndTime;
        }

        public GetSubscriptionStatsResponseBodyData setSubscriptionStartTime(Long subscriptionStartTime) {
            this.subscriptionStartTime = subscriptionStartTime;
            return this;
        }
        public Long getSubscriptionStartTime() {
            return this.subscriptionStartTime;
        }

    }

}
