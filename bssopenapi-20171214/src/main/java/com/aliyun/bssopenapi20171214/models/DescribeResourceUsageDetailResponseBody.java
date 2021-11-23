// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeResourceUsageDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DeductQuantity")
        public Float deductQuantity;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("PostpaidCost")
        public String postpaidCost;

        @NameInMap("PotentialSavedCost")
        public String potentialSavedCost;

        @NameInMap("Quantity")
        public Long quantity;

        @NameInMap("Region")
        public String region;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("ReservationCost")
        public String reservationCost;

        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        @NameInMap("SavedCost")
        public String savedCost;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("TotalQuantity")
        public Float totalQuantity;

        @NameInMap("UsagePercentage")
        public Float usagePercentage;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Zone")
        public String zone;

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
        @NameInMap("Items")
        public java.util.List<DescribeResourceUsageDetailResponseBodyDataItems> items;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

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
