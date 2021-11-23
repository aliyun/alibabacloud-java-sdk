// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAvailableInstancesRequest extends TeaModel {
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    @NameInMap("EndTimeEnd")
    public String endTimeEnd;

    @NameInMap("EndTimeStart")
    public String endTimeStart;

    @NameInMap("InstanceIDs")
    public String instanceIDs;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("Region")
    public String region;

    @NameInMap("RenewStatus")
    public String renewStatus;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static QueryAvailableInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableInstancesRequest self = new QueryAvailableInstancesRequest();
        return TeaModel.build(map, self);
    }

    public QueryAvailableInstancesRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryAvailableInstancesRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryAvailableInstancesRequest setEndTimeEnd(String endTimeEnd) {
        this.endTimeEnd = endTimeEnd;
        return this;
    }
    public String getEndTimeEnd() {
        return this.endTimeEnd;
    }

    public QueryAvailableInstancesRequest setEndTimeStart(String endTimeStart) {
        this.endTimeStart = endTimeStart;
        return this;
    }
    public String getEndTimeStart() {
        return this.endTimeStart;
    }

    public QueryAvailableInstancesRequest setInstanceIDs(String instanceIDs) {
        this.instanceIDs = instanceIDs;
        return this;
    }
    public String getInstanceIDs() {
        return this.instanceIDs;
    }

    public QueryAvailableInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryAvailableInstancesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryAvailableInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAvailableInstancesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryAvailableInstancesRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryAvailableInstancesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryAvailableInstancesRequest setRenewStatus(String renewStatus) {
        this.renewStatus = renewStatus;
        return this;
    }
    public String getRenewStatus() {
        return this.renewStatus;
    }

    public QueryAvailableInstancesRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
