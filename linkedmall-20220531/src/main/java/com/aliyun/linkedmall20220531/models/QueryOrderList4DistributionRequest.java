// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryOrderList4DistributionRequest extends TeaModel {
    // 分销商ID
    @NameInMap("DistributorId")
    public String distributorId;

    // 订单过滤条件
    @NameInMap("FilterOption")
    public String filterOption;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页行数
    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求标识
    @NameInMap("RequestId")
    public String requestId;

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

    public QueryOrderList4DistributionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
