// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAvailableInstancesRequest extends TeaModel {
    /**
     * <p>The end time of the creation time range. Specify the time in the ISO 8601 standard in the UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-05-23T12:00:00Z</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The start time of the creation time range. Specify the time in the ISO 8601 standard in the UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-05-23T12:00:00Z</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <p>The end time of the expiration time range. Specify the time in the ISO 8601 standard in the UTC format. Example: 2016-05-23T12:00:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-05-23T12:00:00Z</p>
     */
    @NameInMap("EndTimeEnd")
    public String endTimeEnd;

    /**
     * <p>The start time of the expiration time range. Specify the time in the ISO 8601 standard in the UTC format. Example: 2016-05-23T12:00:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-05-23T12:00:00Z</p>
     */
    @NameInMap("EndTimeStart")
    public String endTimeStart;

    /**
     * <p>The instance IDs. Separate multiple IDs with commas. You can specify up to 100 IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-xxxxxxxxxxxx</p>
     */
    @NameInMap("InstanceIDs")
    public String instanceIDs;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product code. You can call the <strong>QueryProductList</strong> operation to query product codes.</p>
     * <blockquote>
     * <p>If the region is specified, this parameter cannot be empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product type.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The renewal status. Valid values:</p>
     * <ul>
     * <li>AutoRenewal: auto-renewal.</li>
     * <li>ManualRenewal: manual renewal.</li>
     * <li>NotRenewal: no renewal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AutoRenewal</p>
     */
    @NameInMap("RenewStatus")
    public String renewStatus;

    /**
     * <p>The subscription type.</p>
     * <ul>
     * <li>Subscription: subscription.</li>
     * <li>PayAsYouGo: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
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
