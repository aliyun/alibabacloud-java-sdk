// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryOrderList4DistributionRequest extends TeaModel {
    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("FilterOption")
    public String filterOption;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryOrderList4DistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderList4DistributionRequest self = new QueryOrderList4DistributionRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderList4DistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public QueryOrderList4DistributionRequest setFilterOption(String filterOption) {
        this.filterOption = filterOption;
        return this;
    }
    public String getFilterOption() {
        return this.filterOption;
    }

    public QueryOrderList4DistributionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrderList4DistributionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOrderList4DistributionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
