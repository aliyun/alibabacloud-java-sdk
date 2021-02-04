// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAvailableInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryAvailableInstancesResponseData data;

    public static QueryAvailableInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableInstancesResponse self = new QueryAvailableInstancesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAvailableInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAvailableInstancesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAvailableInstancesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAvailableInstancesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAvailableInstancesResponse setData(QueryAvailableInstancesResponseData data) {
        this.data = data;
        return this;
    }
    public QueryAvailableInstancesResponseData getData() {
        return this.data;
    }

    public static class QueryAvailableInstancesResponseDataInstanceList extends TeaModel {
        @NameInMap("OwnerId")
        @Validation(required = true)
        public Long ownerId;

        @NameInMap("SellerId")
        @Validation(required = true)
        public Long sellerId;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        @NameInMap("InstanceID")
        @Validation(required = true)
        public String instanceID;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("StopTime")
        @Validation(required = true)
        public String stopTime;

        @NameInMap("ReleaseTime")
        @Validation(required = true)
        public String releaseTime;

        @NameInMap("ExpectedReleaseTime")
        @Validation(required = true)
        public String expectedReleaseTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("SubStatus")
        @Validation(required = true)
        public String subStatus;

        @NameInMap("RenewStatus")
        @Validation(required = true)
        public String renewStatus;

        @NameInMap("RenewalDuration")
        @Validation(required = true)
        public Integer renewalDuration;

        @NameInMap("RenewalDurationUnit")
        @Validation(required = true)
        public String renewalDurationUnit;

        @NameInMap("Seller")
        @Validation(required = true)
        public String seller;

        public static QueryAvailableInstancesResponseDataInstanceList build(java.util.Map<String, ?> map) throws Exception {
            QueryAvailableInstancesResponseDataInstanceList self = new QueryAvailableInstancesResponseDataInstanceList();
            return TeaModel.build(map, self);
        }

        public QueryAvailableInstancesResponseDataInstanceList setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public QueryAvailableInstancesResponseDataInstanceList setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryAvailableInstancesResponseDataInstanceList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryAvailableInstancesResponseDataInstanceList setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryAvailableInstancesResponseDataInstanceList setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryAvailableInstancesResponseDataInstanceList setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QueryAvailableInstancesResponseDataInstanceList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryAvailableInstancesResponseDataInstanceList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAvailableInstancesResponseDataInstanceList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryAvailableInstancesResponseDataInstanceList setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public QueryAvailableInstancesResponseDataInstanceList setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public QueryAvailableInstancesResponseDataInstanceList setExpectedReleaseTime(String expectedReleaseTime) {
            this.expectedReleaseTime = expectedReleaseTime;
            return this;
        }
        public String getExpectedReleaseTime() {
            return this.expectedReleaseTime;
        }

        public QueryAvailableInstancesResponseDataInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryAvailableInstancesResponseDataInstanceList setSubStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public String getSubStatus() {
            return this.subStatus;
        }

        public QueryAvailableInstancesResponseDataInstanceList setRenewStatus(String renewStatus) {
            this.renewStatus = renewStatus;
            return this;
        }
        public String getRenewStatus() {
            return this.renewStatus;
        }

        public QueryAvailableInstancesResponseDataInstanceList setRenewalDuration(Integer renewalDuration) {
            this.renewalDuration = renewalDuration;
            return this;
        }
        public Integer getRenewalDuration() {
            return this.renewalDuration;
        }

        public QueryAvailableInstancesResponseDataInstanceList setRenewalDurationUnit(String renewalDurationUnit) {
            this.renewalDurationUnit = renewalDurationUnit;
            return this;
        }
        public String getRenewalDurationUnit() {
            return this.renewalDurationUnit;
        }

        public QueryAvailableInstancesResponseDataInstanceList setSeller(String seller) {
            this.seller = seller;
            return this;
        }
        public String getSeller() {
            return this.seller;
        }

    }

    public static class QueryAvailableInstancesResponseData extends TeaModel {
        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("InstanceList")
        @Validation(required = true)
        public java.util.List<QueryAvailableInstancesResponseDataInstanceList> instanceList;

        public static QueryAvailableInstancesResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAvailableInstancesResponseData self = new QueryAvailableInstancesResponseData();
            return TeaModel.build(map, self);
        }

        public QueryAvailableInstancesResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryAvailableInstancesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAvailableInstancesResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryAvailableInstancesResponseData setInstanceList(java.util.List<QueryAvailableInstancesResponseDataInstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<QueryAvailableInstancesResponseDataInstanceList> getInstanceList() {
            return this.instanceList;
        }

    }

}
