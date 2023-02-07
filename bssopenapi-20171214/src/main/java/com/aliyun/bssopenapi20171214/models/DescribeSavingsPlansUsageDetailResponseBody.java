// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansUsageDetailResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The return data.</p>
     */
    @NameInMap("Data")
    public DescribeSavingsPlansUsageDetailResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSavingsPlansUsageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansUsageDetailResponseBody self = new DescribeSavingsPlansUsageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansUsageDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSavingsPlansUsageDetailResponseBody setData(DescribeSavingsPlansUsageDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSavingsPlansUsageDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeSavingsPlansUsageDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSavingsPlansUsageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSavingsPlansUsageDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSavingsPlansUsageDetailResponseBodyDataItems extends TeaModel {
        /**
         * <p>The currency.</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The used amount of the savings plan.</p>
         */
        @NameInMap("DeductValue")
        public Float deductValue;

        /**
         * <p>The end time.</p>
         */
        @NameInMap("EndPeriod")
        public String endPeriod;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The total amount of the savings plan.</p>
         */
        @NameInMap("PoolValue")
        public Float poolValue;

        /**
         * <p>The pay-as-you-go cost.</p>
         */
        @NameInMap("PostpaidCost")
        public Float postpaidCost;

        /**
         * <p>The amount that is saved.</p>
         */
        @NameInMap("SavedCost")
        public Float savedCost;

        /**
         * <p>The start time.</p>
         */
        @NameInMap("StartPeriod")
        public String startPeriod;

        /**
         * <p>The status of the instance.</p>
         * <br>
         * <p>A value of -1 indicates that the payment is overdue. A value of 1 indicates that the instance is active.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the savings plan. Valid values: universal and ECS compute.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The usage.</p>
         */
        @NameInMap("UsagePercentage")
        public Float usagePercentage;

        /**
         * <p>The ID of the account.</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The username of the account.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeSavingsPlansUsageDetailResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageDetailResponseBodyDataItems self = new DescribeSavingsPlansUsageDetailResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setDeductValue(Float deductValue) {
            this.deductValue = deductValue;
            return this;
        }
        public Float getDeductValue() {
            return this.deductValue;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setEndPeriod(String endPeriod) {
            this.endPeriod = endPeriod;
            return this;
        }
        public String getEndPeriod() {
            return this.endPeriod;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setPoolValue(Float poolValue) {
            this.poolValue = poolValue;
            return this;
        }
        public Float getPoolValue() {
            return this.poolValue;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setPostpaidCost(Float postpaidCost) {
            this.postpaidCost = postpaidCost;
            return this;
        }
        public Float getPostpaidCost() {
            return this.postpaidCost;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setSavedCost(Float savedCost) {
            this.savedCost = savedCost;
            return this;
        }
        public Float getSavedCost() {
            return this.savedCost;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setStartPeriod(String startPeriod) {
            this.startPeriod = startPeriod;
            return this;
        }
        public String getStartPeriod() {
            return this.startPeriod;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setUsagePercentage(Float usagePercentage) {
            this.usagePercentage = usagePercentage;
            return this;
        }
        public Float getUsagePercentage() {
            return this.usagePercentage;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeSavingsPlansUsageDetailResponseBodyData extends TeaModel {
        /**
         * <p>The data entries.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeSavingsPlansUsageDetailResponseBodyDataItems> items;

        /**
         * <p>The token of the next page.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSavingsPlansUsageDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageDetailResponseBodyData self = new DescribeSavingsPlansUsageDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansUsageDetailResponseBodyData setItems(java.util.List<DescribeSavingsPlansUsageDetailResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeSavingsPlansUsageDetailResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
