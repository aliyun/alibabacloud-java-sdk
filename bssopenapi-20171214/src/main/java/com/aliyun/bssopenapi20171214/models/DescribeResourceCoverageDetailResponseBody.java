// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceCoverageDetailResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeResourceCoverageDetailResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeResourceCoverageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceCoverageDetailResponseBody self = new DescribeResourceCoverageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceCoverageDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeResourceCoverageDetailResponseBody setData(DescribeResourceCoverageDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResourceCoverageDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeResourceCoverageDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResourceCoverageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceCoverageDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResourceCoverageDetailResponseBodyDataItems extends TeaModel {
        /**
         * <p>The unit that is used to measure the resources deducted from deduction plans.</p>
         */
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        /**
         * <p>The code of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The name and billing method of the service.</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <p>The coverage rate of a deduction plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CoveragePercentage")
        public Float coveragePercentage;

        /**
         * <p>The currency in which deduction plans were priced.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The amount of the resources deducted from a deduction plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeductQuantity")
        public Float deductQuantity;

        /**
         * <p>The end of the time range in which the coverage details were queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 01:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of a pay-as-you-go instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1d9x623987rlj0dx4xx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The specifications of a deduction plan.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.t5-lc2m1.nano</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The amount of the bill.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        /**
         * <p>The code of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The region.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The code of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-dg-a01</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The beginning of the time range in which the coverage details were queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The total amount of resources consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalQuantity")
        public Float totalQuantity;

        /**
         * <p>The ID of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>123745698925000</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username of the account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test13@test.aliyun.com">test13@test.aliyun.com</a></p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The code of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("Zone")
        public String zone;

        /**
         * <p>The zone.</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeResourceCoverageDetailResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceCoverageDetailResponseBodyDataItems self = new DescribeResourceCoverageDetailResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setCapacityUnit(String capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public String getCapacityUnit() {
            return this.capacityUnit;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setCoveragePercentage(Float coveragePercentage) {
            this.coveragePercentage = coveragePercentage;
            return this;
        }
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setDeductQuantity(Float deductQuantity) {
            this.deductQuantity = deductQuantity;
            return this;
        }
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setTotalQuantity(Float totalQuantity) {
            this.totalQuantity = totalQuantity;
            return this;
        }
        public Float getTotalQuantity() {
            return this.totalQuantity;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public DescribeResourceCoverageDetailResponseBodyDataItems setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class DescribeResourceCoverageDetailResponseBodyData extends TeaModel {
        /**
         * <p>The data entries.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeResourceCoverageDetailResponseBodyDataItems> items;

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token of the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6MTB9</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeResourceCoverageDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceCoverageDetailResponseBodyData self = new DescribeResourceCoverageDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeResourceCoverageDetailResponseBodyData setItems(java.util.List<DescribeResourceCoverageDetailResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeResourceCoverageDetailResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeResourceCoverageDetailResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeResourceCoverageDetailResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeResourceCoverageDetailResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
