// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageDetailResponseBody extends TeaModel {
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
    public DescribeResourceUsageDetailResponseBodyData data;

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

    public static DescribeResourceUsageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageDetailResponseBody self = new DescribeResourceUsageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeResourceUsageDetailResponseBody setData(DescribeResourceUsageDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResourceUsageDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeResourceUsageDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResourceUsageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceUsageDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResourceUsageDetailResponseBodyDataItems extends TeaModel {
        /**
         * <p>The unit that is used to measure the resources deducted from deduction plans.</p>
         */
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        /**
         * <p>The currency in which deduction plans were priced.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The amount of the resources deducted from deduction plans.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeductQuantity")
        public Float deductQuantity;

        /**
         * <p>The end of the time range in which the usage details were queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 01:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The specifications of a deduction plan.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.t5-lc2m1.nano</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The equivalent of pay-as-you-go costs.</p>
         * 
         * <strong>example:</strong>
         * <p>0.06</p>
         */
        @NameInMap("PostpaidCost")
        public String postpaidCost;

        /**
         * <p>The potential net savings.</p>
         * 
         * <strong>example:</strong>
         * <p>0.13</p>
         */
        @NameInMap("PotentialSavedCost")
        public String potentialSavedCost;

        /**
         * <p>The number of deduction plans.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Quantity")
        public Long quantity;

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
         * <p>The fee of purchased deduction plans.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReservationCost")
        public String reservationCost;

        /**
         * <p>The ID of a deduction plan.</p>
         * 
         * <strong>example:</strong>
         * <p>ecsri-bp147nnfz21225k9mpix00</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The net savings.</p>
         * 
         * <strong>example:</strong>
         * <p>0.06</p>
         */
        @NameInMap("SavedCost")
        public String savedCost;

        /**
         * <p>The beginning of the time range in which the usage details were queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the deduction plan.</p>
         * 
         * <strong>example:</strong>
         * <p>Valid</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the state.</p>
         */
        @NameInMap("StatusName")
        public String statusName;

        /**
         * <p>The total capacity of deduction plans.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalQuantity")
        public Float totalQuantity;

        /**
         * <p>The usage of deduction plans.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("UsagePercentage")
        public Float usagePercentage;

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
         * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
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

        public static DescribeResourceUsageDetailResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageDetailResponseBodyDataItems self = new DescribeResourceUsageDetailResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setCapacityUnit(String capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public String getCapacityUnit() {
            return this.capacityUnit;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setDeductQuantity(Float deductQuantity) {
            this.deductQuantity = deductQuantity;
            return this;
        }
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setPostpaidCost(String postpaidCost) {
            this.postpaidCost = postpaidCost;
            return this;
        }
        public String getPostpaidCost() {
            return this.postpaidCost;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setPotentialSavedCost(String potentialSavedCost) {
            this.potentialSavedCost = potentialSavedCost;
            return this;
        }
        public String getPotentialSavedCost() {
            return this.potentialSavedCost;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setReservationCost(String reservationCost) {
            this.reservationCost = reservationCost;
            return this;
        }
        public String getReservationCost() {
            return this.reservationCost;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setSavedCost(String savedCost) {
            this.savedCost = savedCost;
            return this;
        }
        public String getSavedCost() {
            return this.savedCost;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setTotalQuantity(Float totalQuantity) {
            this.totalQuantity = totalQuantity;
            return this;
        }
        public Float getTotalQuantity() {
            return this.totalQuantity;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setUsagePercentage(Float usagePercentage) {
            this.usagePercentage = usagePercentage;
            return this;
        }
        public Float getUsagePercentage() {
            return this.usagePercentage;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public DescribeResourceUsageDetailResponseBodyDataItems setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class DescribeResourceUsageDetailResponseBodyData extends TeaModel {
        /**
         * <p>The data entries.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeResourceUsageDetailResponseBodyDataItems> items;

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

        public static DescribeResourceUsageDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageDetailResponseBodyData self = new DescribeResourceUsageDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageDetailResponseBodyData setItems(java.util.List<DescribeResourceUsageDetailResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeResourceUsageDetailResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeResourceUsageDetailResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeResourceUsageDetailResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeResourceUsageDetailResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
