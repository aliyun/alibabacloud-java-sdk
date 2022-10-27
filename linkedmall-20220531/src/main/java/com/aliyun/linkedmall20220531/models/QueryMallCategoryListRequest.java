// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryMallCategoryListRequest extends TeaModel {
    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("DistributionMallId")
    public String distributionMallId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryMallCategoryListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMallCategoryListRequest self = new QueryMallCategoryListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMallCategoryListRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public QueryMallCategoryListRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public QueryMallCategoryListRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryMallCategoryListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
