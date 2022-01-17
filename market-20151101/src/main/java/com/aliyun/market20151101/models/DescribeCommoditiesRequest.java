// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeCommoditiesRequest extends TeaModel {
    @NameInMap("CommodityAuditStatuses")
    public String commodityAuditStatuses;

    @NameInMap("CommodityCategoryIds")
    public String commodityCategoryIds;

    @NameInMap("CommodityGmtCreatedFrom")
    public String commodityGmtCreatedFrom;

    @NameInMap("CommodityGmtCreatedTo")
    public String commodityGmtCreatedTo;

    @NameInMap("CommodityGmtModifiedFrom")
    public String commodityGmtModifiedFrom;

    @NameInMap("CommodityGmtModifiedTo")
    public String commodityGmtModifiedTo;

    @NameInMap("CommodityGmtPublishFrom")
    public String commodityGmtPublishFrom;

    @NameInMap("CommodityGmtPublishTo")
    public String commodityGmtPublishTo;

    @NameInMap("CommodityId")
    public String commodityId;

    @NameInMap("CommodityIds")
    public String commodityIds;

    @NameInMap("CommodityStatuses")
    public String commodityStatuses;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Properties")
    public String properties;

    public static DescribeCommoditiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommoditiesRequest self = new DescribeCommoditiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommoditiesRequest setCommodityAuditStatuses(String commodityAuditStatuses) {
        this.commodityAuditStatuses = commodityAuditStatuses;
        return this;
    }
    public String getCommodityAuditStatuses() {
        return this.commodityAuditStatuses;
    }

    public DescribeCommoditiesRequest setCommodityCategoryIds(String commodityCategoryIds) {
        this.commodityCategoryIds = commodityCategoryIds;
        return this;
    }
    public String getCommodityCategoryIds() {
        return this.commodityCategoryIds;
    }

    public DescribeCommoditiesRequest setCommodityGmtCreatedFrom(String commodityGmtCreatedFrom) {
        this.commodityGmtCreatedFrom = commodityGmtCreatedFrom;
        return this;
    }
    public String getCommodityGmtCreatedFrom() {
        return this.commodityGmtCreatedFrom;
    }

    public DescribeCommoditiesRequest setCommodityGmtCreatedTo(String commodityGmtCreatedTo) {
        this.commodityGmtCreatedTo = commodityGmtCreatedTo;
        return this;
    }
    public String getCommodityGmtCreatedTo() {
        return this.commodityGmtCreatedTo;
    }

    public DescribeCommoditiesRequest setCommodityGmtModifiedFrom(String commodityGmtModifiedFrom) {
        this.commodityGmtModifiedFrom = commodityGmtModifiedFrom;
        return this;
    }
    public String getCommodityGmtModifiedFrom() {
        return this.commodityGmtModifiedFrom;
    }

    public DescribeCommoditiesRequest setCommodityGmtModifiedTo(String commodityGmtModifiedTo) {
        this.commodityGmtModifiedTo = commodityGmtModifiedTo;
        return this;
    }
    public String getCommodityGmtModifiedTo() {
        return this.commodityGmtModifiedTo;
    }

    public DescribeCommoditiesRequest setCommodityGmtPublishFrom(String commodityGmtPublishFrom) {
        this.commodityGmtPublishFrom = commodityGmtPublishFrom;
        return this;
    }
    public String getCommodityGmtPublishFrom() {
        return this.commodityGmtPublishFrom;
    }

    public DescribeCommoditiesRequest setCommodityGmtPublishTo(String commodityGmtPublishTo) {
        this.commodityGmtPublishTo = commodityGmtPublishTo;
        return this;
    }
    public String getCommodityGmtPublishTo() {
        return this.commodityGmtPublishTo;
    }

    public DescribeCommoditiesRequest setCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }
    public String getCommodityId() {
        return this.commodityId;
    }

    public DescribeCommoditiesRequest setCommodityIds(String commodityIds) {
        this.commodityIds = commodityIds;
        return this;
    }
    public String getCommodityIds() {
        return this.commodityIds;
    }

    public DescribeCommoditiesRequest setCommodityStatuses(String commodityStatuses) {
        this.commodityStatuses = commodityStatuses;
        return this;
    }
    public String getCommodityStatuses() {
        return this.commodityStatuses;
    }

    public DescribeCommoditiesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCommoditiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCommoditiesRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
