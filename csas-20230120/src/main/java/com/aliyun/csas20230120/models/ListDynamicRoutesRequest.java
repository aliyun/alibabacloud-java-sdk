// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicRoutesRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DynamicRouteIds")
    public java.util.List<String> dynamicRouteIds;

    @NameInMap("Name")
    public String name;

    @NameInMap("NextHop")
    public String nextHop;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    @NameInMap("Status")
    public String status;

    @NameInMap("TagId")
    public String tagId;

    public static ListDynamicRoutesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicRoutesRequest self = new ListDynamicRoutesRequest();
        return TeaModel.build(map, self);
    }

    public ListDynamicRoutesRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListDynamicRoutesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDynamicRoutesRequest setDynamicRouteIds(java.util.List<String> dynamicRouteIds) {
        this.dynamicRouteIds = dynamicRouteIds;
        return this;
    }
    public java.util.List<String> getDynamicRouteIds() {
        return this.dynamicRouteIds;
    }

    public ListDynamicRoutesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDynamicRoutesRequest setNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }
    public String getNextHop() {
        return this.nextHop;
    }

    public ListDynamicRoutesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDynamicRoutesRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public ListDynamicRoutesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListDynamicRoutesRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
