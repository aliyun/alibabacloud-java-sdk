// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetLogsRequest extends TeaModel {
    @NameInMap("From")
    public Integer from;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Query")
    public String query;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReverseOrNot")
    public Boolean reverseOrNot;

    @NameInMap("To")
    public Integer to;

    @NameInMap("Total")
    public Long total;

    public static GetLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogsRequest self = new GetLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetLogsRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public GetLogsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetLogsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLogsRequest setReverseOrNot(Boolean reverseOrNot) {
        this.reverseOrNot = reverseOrNot;
        return this;
    }
    public Boolean getReverseOrNot() {
        return this.reverseOrNot;
    }

    public GetLogsRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

    public GetLogsRequest setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
