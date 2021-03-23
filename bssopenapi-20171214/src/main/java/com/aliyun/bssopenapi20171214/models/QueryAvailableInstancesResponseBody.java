// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAvailableInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QueryAvailableInstancesResponseBodyData data;

    public static QueryAvailableInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableInstancesResponseBody self = new QueryAvailableInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAvailableInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAvailableInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAvailableInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAvailableInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAvailableInstancesResponseBody setData(QueryAvailableInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAvailableInstancesResponseBodyData getData() {
        return this.data;
    }

    public static class QueryAvailableInstancesResponseBodyDataInstanceList extends TeaModel {
        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("SellerId")
        public Long sellerId;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("Region")
        public String region;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StopTime")
        public String stopTime;

        @NameInMap("ReleaseTime")
        public String releaseTime;

        @NameInMap("ExpectedReleaseTime")
        public String expectedReleaseTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubStatus")
        public String subStatus;

        @NameInMap("RenewStatus")
        public String renewStatus;

        @NameInMap("RenewalDuration")
        public Integer renewalDuration;

        @NameInMap("RenewalDurationUnit")
        public String renewalDurationUnit;

        @NameInMap("Seller")
        public String seller;

        public static QueryAvailableInstancesResponseBodyDataInstanceList build(java.util.Map<String, ?> map) throws Exception {
            QueryAvailableInstancesResponseBodyDataInstanceList self = new QueryAvailableInstancesResponseBodyDataInstanceList();
            return TeaModel.build(map, self);
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setExpectedReleaseTime(String expectedReleaseTime) {
            this.expectedReleaseTime = expectedReleaseTime;
            return this;
        }
        public String getExpectedReleaseTime() {
            return this.expectedReleaseTime;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setSubStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public String getSubStatus() {
            return this.subStatus;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setRenewStatus(String renewStatus) {
            this.renewStatus = renewStatus;
            return this;
        }
        public String getRenewStatus() {
            return this.renewStatus;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setRenewalDuration(Integer renewalDuration) {
            this.renewalDuration = renewalDuration;
            return this;
        }
        public Integer getRenewalDuration() {
            return this.renewalDuration;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setRenewalDurationUnit(String renewalDurationUnit) {
            this.renewalDurationUnit = renewalDurationUnit;
            return this;
        }
        public String getRenewalDurationUnit() {
            return this.renewalDurationUnit;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setSeller(String seller) {
            this.seller = seller;
            return this;
        }
        public String getSeller() {
            return this.seller;
        }

    }

    public static class QueryAvailableInstancesResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("InstanceList")
        public java.util.List<QueryAvailableInstancesResponseBodyDataInstanceList> instanceList;

        public static QueryAvailableInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAvailableInstancesResponseBodyData self = new QueryAvailableInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAvailableInstancesResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryAvailableInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAvailableInstancesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryAvailableInstancesResponseBodyData setInstanceList(java.util.List<QueryAvailableInstancesResponseBodyDataInstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<QueryAvailableInstancesResponseBodyDataInstanceList> getInstanceList() {
            return this.instanceList;
        }

    }

}
