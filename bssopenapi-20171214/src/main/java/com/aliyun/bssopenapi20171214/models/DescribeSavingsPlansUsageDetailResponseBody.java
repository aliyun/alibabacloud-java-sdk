// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansUsageDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public DescribeSavingsPlansUsageDetailResponseBodyData data;

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

    public DescribeSavingsPlansUsageDetailResponseBody setData(DescribeSavingsPlansUsageDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSavingsPlansUsageDetailResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeSavingsPlansUsageDetailResponseBodyDataItems extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UsagePercentage")
        public Float usagePercentage;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("PostpaidCost")
        public Float postpaidCost;

        @NameInMap("DeductValue")
        public Float deductValue;

        @NameInMap("StartPeriod")
        public String startPeriod;

        @NameInMap("SavedCost")
        public Float savedCost;

        @NameInMap("PoolValue")
        public Float poolValue;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("EndPeriod")
        public String endPeriod;

        public static DescribeSavingsPlansUsageDetailResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageDetailResponseBodyDataItems self = new DescribeSavingsPlansUsageDetailResponseBodyDataItems();
            return TeaModel.build(map, self);
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

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setPostpaidCost(Float postpaidCost) {
            this.postpaidCost = postpaidCost;
            return this;
        }
        public Float getPostpaidCost() {
            return this.postpaidCost;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setDeductValue(Float deductValue) {
            this.deductValue = deductValue;
            return this;
        }
        public Float getDeductValue() {
            return this.deductValue;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setStartPeriod(String startPeriod) {
            this.startPeriod = startPeriod;
            return this;
        }
        public String getStartPeriod() {
            return this.startPeriod;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setSavedCost(Float savedCost) {
            this.savedCost = savedCost;
            return this;
        }
        public Float getSavedCost() {
            return this.savedCost;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setPoolValue(Float poolValue) {
            this.poolValue = poolValue;
            return this;
        }
        public Float getPoolValue() {
            return this.poolValue;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyDataItems setEndPeriod(String endPeriod) {
            this.endPeriod = endPeriod;
            return this;
        }
        public String getEndPeriod() {
            return this.endPeriod;
        }

    }

    public static class DescribeSavingsPlansUsageDetailResponseBodyData extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("Items")
        public java.util.List<DescribeSavingsPlansUsageDetailResponseBodyDataItems> items;

        public static DescribeSavingsPlansUsageDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageDetailResponseBodyData self = new DescribeSavingsPlansUsageDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansUsageDetailResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeSavingsPlansUsageDetailResponseBodyData setItems(java.util.List<DescribeSavingsPlansUsageDetailResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeSavingsPlansUsageDetailResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
