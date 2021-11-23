// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansCoverageDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeSavingsPlansCoverageDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSavingsPlansCoverageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansCoverageDetailResponseBody self = new DescribeSavingsPlansCoverageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansCoverageDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSavingsPlansCoverageDetailResponseBody setData(DescribeSavingsPlansCoverageDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSavingsPlansCoverageDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeSavingsPlansCoverageDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSavingsPlansCoverageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSavingsPlansCoverageDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSavingsPlansCoverageDetailResponseBodyDataItems extends TeaModel {
        @NameInMap("CoveragePercentage")
        public Float coveragePercentage;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DeductAmount")
        public Float deductAmount;

        @NameInMap("EndPeriod")
        public String endPeriod;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("PostpaidCost")
        public Float postpaidCost;

        @NameInMap("Region")
        public String region;

        @NameInMap("StartPeriod")
        public String startPeriod;

        @NameInMap("TotalAmount")
        public Float totalAmount;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        public static DescribeSavingsPlansCoverageDetailResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansCoverageDetailResponseBodyDataItems self = new DescribeSavingsPlansCoverageDetailResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyDataItems setCoveragePercentage(Float coveragePercentage) {
            this.coveragePercentage = coveragePercentage;
            return this;
        }
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyDataItems setDeductAmount(Float deductAmount) {
            this.deductAmount = deductAmount;
            return this;
        }
        public Float getDeductAmount() {
            return this.deductAmount;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyDataItems setEndPeriod(String endPeriod) {
            this.endPeriod = endPeriod;
            return this;
        }
        public String getEndPeriod() {
            return this.endPeriod;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyDataItems setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyDataItems setPostpaidCost(Float postpaidCost) {
            this.postpaidCost = postpaidCost;
            return this;
        }
        public Float getPostpaidCost() {
            return this.postpaidCost;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyDataItems setStartPeriod(String startPeriod) {
            this.startPeriod = startPeriod;
            return this;
        }
        public String getStartPeriod() {
            return this.startPeriod;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyDataItems setTotalAmount(Float totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Float getTotalAmount() {
            return this.totalAmount;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyDataItems setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyDataItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeSavingsPlansCoverageDetailResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<DescribeSavingsPlansCoverageDetailResponseBodyDataItems> items;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSavingsPlansCoverageDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansCoverageDetailResponseBodyData self = new DescribeSavingsPlansCoverageDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyData setItems(java.util.List<DescribeSavingsPlansCoverageDetailResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeSavingsPlansCoverageDetailResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeSavingsPlansCoverageDetailResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
