// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ListActivatedAlertsRequest extends TeaModel {
    @NameInMap("Filter")
    public String filter;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListActivatedAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActivatedAlertsRequest self = new ListActivatedAlertsRequest();
        return TeaModel.build(map, self);
    }

    public ListActivatedAlertsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListActivatedAlertsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListActivatedAlertsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListActivatedAlertsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
