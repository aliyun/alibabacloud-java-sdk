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

    }

}
