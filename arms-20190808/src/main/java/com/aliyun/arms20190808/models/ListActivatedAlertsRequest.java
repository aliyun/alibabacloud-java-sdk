// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListActivatedAlertsRequest extends TeaModel {
    // The number of the page to return. Default value: `1`.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The filter condition in the `{"key":"value"}`format. You must specify the `key` and `value` of the filter condition.
    @NameInMap("Filter")
    public String filter;

    // The number of entries to return on each page. Default value: `10`.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static ListActivatedAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActivatedAlertsRequest self = new ListActivatedAlertsRequest();
        return TeaModel.build(map, self);
    }

    public ListActivatedAlertsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListActivatedAlertsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListActivatedAlertsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListActivatedAlertsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
