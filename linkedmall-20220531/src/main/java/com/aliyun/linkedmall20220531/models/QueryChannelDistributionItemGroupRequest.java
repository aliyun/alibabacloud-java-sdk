// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryChannelDistributionItemGroupRequest extends TeaModel {
    // 业务号
    @NameInMap("BizId")
    public String bizId;

    // 客户ID
    @NameInMap("CustomerId")
    public String customerId;

    // 商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    // 分销商id
    @NameInMap("DistributorId")
    public String distributorId;

    // 名称
    @NameInMap("Name")
    public String name;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 商品库编码
    @NameInMap("SubBizCode")
    public String subBizCode;

    public static QueryChannelDistributionItemGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChannelDistributionItemGroupRequest self = new QueryChannelDistributionItemGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryChannelDistributionItemGroupRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryChannelDistributionItemGroupRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public QueryChannelDistributionItemGroupRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public QueryChannelDistributionItemGroupRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryChannelDistributionItemGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryChannelDistributionItemGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryChannelDistributionItemGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryChannelDistributionItemGroupRequest setSubBizCode(String subBizCode) {
        this.subBizCode = subBizCode;
        return this;
    }
    public String getSubBizCode() {
        return this.subBizCode;
    }

}
