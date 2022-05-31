// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryDistributionMallDistributionItemGroupRequest extends TeaModel {
    // 业务号
    @NameInMap("BizId")
    public String bizId;

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

    public static QueryDistributionMallDistributionItemGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionMallDistributionItemGroupRequest self = new QueryDistributionMallDistributionItemGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryDistributionMallDistributionItemGroupRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryDistributionMallDistributionItemGroupRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public QueryDistributionMallDistributionItemGroupRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryDistributionMallDistributionItemGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDistributionMallDistributionItemGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryDistributionMallDistributionItemGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDistributionMallDistributionItemGroupRequest setSubBizCode(String subBizCode) {
        this.subBizCode = subBizCode;
        return this;
    }
    public String getSubBizCode() {
        return this.subBizCode;
    }

}
