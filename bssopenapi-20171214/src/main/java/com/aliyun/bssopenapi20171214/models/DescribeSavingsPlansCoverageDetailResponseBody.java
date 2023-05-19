// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansCoverageDetailResponseBody extends TeaModel {
    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("Data")
    public DescribeSavingsPlansCoverageDetailResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the operation was successful.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return data.</p>
     */
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
        /**
         * <p>The region.</p>
         */
        @NameInMap("CoveragePercentage")
        public Float coveragePercentage;

        /**
         * <p>The specifications.</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The start time.</p>
         */
        @NameInMap("DeductAmount")
        public Float deductAmount;

        @NameInMap("EndPeriod")
        public String endPeriod;

        /**
         * <p>The currency.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The pay-as-you-go cost.</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The coverage.</p>
         */
        @NameInMap("PostpaidCost")
        public Float postpaidCost;

        /**
         * <p>The deducted amount.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The total expenditure.</p>
         */
        @NameInMap("StartPeriod")
        public String startPeriod;

        /**
         * <p>The username of the account.</p>
         */
        @NameInMap("TotalAmount")
        public Float totalAmount;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The end time.</p>
         */
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
        /**
         * <p>The ID of the account.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeSavingsPlansCoverageDetailResponseBodyDataItems> items;

        /**
         * <p>The data entries.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The token of the next page.</p>
         */
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
