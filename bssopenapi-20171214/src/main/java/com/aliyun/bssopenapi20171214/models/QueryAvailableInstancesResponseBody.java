// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAvailableInstancesResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryAvailableInstancesResponseBodyData data;

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
     * <p>C7C15585-8349-4C62-BEE4-5A391841B9BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAvailableInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableInstancesResponseBody self = new QueryAvailableInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAvailableInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAvailableInstancesResponseBody setData(QueryAvailableInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAvailableInstancesResponseBodyData getData() {
        return this.data;
    }

    public QueryAvailableInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class QueryAvailableInstancesResponseBodyDataInstanceList extends TeaModel {
        /**
         * <p>The time when the specified instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the instance was expired.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when the specified instance was expected to be released.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        @NameInMap("ExpectedReleaseTime")
        public String expectedReleaseTime;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1049056</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The ID of the instance owner.</p>
         * 
         * <strong>example:</strong>
         * <p>325352345</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The code of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The type of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time when the instance was released.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        /**
         * <p>The renewal status of the specified instance. Valid values:</p>
         * <ul>
         * <li>AutoRenewal: The instance is automatically renewed.</li>
         * <li>ManualRenewal: The instance is manually renewed.</li>
         * <li>NotRenewal: The instance is not renewed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManualRenewal</p>
         */
        @NameInMap("RenewStatus")
        public String renewStatus;

        /**
         * <p>The number of auto-renewal cycles.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RenewalDuration")
        public Integer renewalDuration;

        /**
         * <p>The unit of the auto-renewal cycle. Valid values:</p>
         * <ul>
         * <li>M: month</li>
         * <li>Y: year</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>M</p>
         */
        @NameInMap("RenewalDurationUnit")
        public String renewalDurationUnit;

        /**
         * <p>The seller.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123</p>
         */
        @NameInMap("Seller")
        public String seller;

        /**
         * <p>The ID of the seller.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123</p>
         */
        @NameInMap("SellerId")
        public Long sellerId;

        /**
         * <p>The status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating: The instance is being created. WaitForExpire: The instance is about to expire. Normal: The instance can properly run. Expired: The instance is expired.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the specified instance was suspended.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>The sub-status of the specified instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal: The pay-as-you-go module can properly run. WaitForLimit: The pay-as-you-go module is about to be limited due to overdue payments. BandwidthLimited: The pay-as-you-go module is limited due to overdue payments.</p>
         */
        @NameInMap("SubStatus")
        public String subStatus;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>Subscription: subscription</li>
         * <li>PayAsYouGo: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        public static QueryAvailableInstancesResponseBodyDataInstanceList build(java.util.Map<String, ?> map) throws Exception {
            QueryAvailableInstancesResponseBodyDataInstanceList self = new QueryAvailableInstancesResponseBodyDataInstanceList();
            return TeaModel.build(map, self);
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

        public QueryAvailableInstancesResponseBodyDataInstanceList setExpectedReleaseTime(String expectedReleaseTime) {
            this.expectedReleaseTime = expectedReleaseTime;
            return this;
        }
        public String getExpectedReleaseTime() {
            return this.expectedReleaseTime;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
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

        public QueryAvailableInstancesResponseBodyDataInstanceList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
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

        public QueryAvailableInstancesResponseBodyDataInstanceList setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setSubStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public String getSubStatus() {
            return this.subStatus;
        }

        public QueryAvailableInstancesResponseBodyDataInstanceList setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

    }

    public static class QueryAvailableInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The instances returned.</p>
         */
        @NameInMap("InstanceList")
        public java.util.List<QueryAvailableInstancesResponseBodyDataInstanceList> instanceList;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryAvailableInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAvailableInstancesResponseBodyData self = new QueryAvailableInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAvailableInstancesResponseBodyData setInstanceList(java.util.List<QueryAvailableInstancesResponseBodyDataInstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<QueryAvailableInstancesResponseBodyDataInstanceList> getInstanceList() {
            return this.instanceList;
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

    }

}
