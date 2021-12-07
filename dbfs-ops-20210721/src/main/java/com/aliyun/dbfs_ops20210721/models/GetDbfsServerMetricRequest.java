// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs_ops20210721.models;

import com.aliyun.tea.*;

public class GetDbfsServerMetricRequest extends TeaModel {
    @NameInMap("From")
    public Long from;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("QueryString")
    public String queryString;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SortType")
    public String sortType;

    @NameInMap("To")
    public Long to;

    public static GetDbfsServerMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDbfsServerMetricRequest self = new GetDbfsServerMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetDbfsServerMetricRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetDbfsServerMetricRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetDbfsServerMetricRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetDbfsServerMetricRequest setQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }
    public String getQueryString() {
        return this.queryString;
    }

    public GetDbfsServerMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetDbfsServerMetricRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public GetDbfsServerMetricRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
