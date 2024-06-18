// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicRoutesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-application-e12860ef6c48****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DynamicRouteIds")
    public java.util.List<String> dynamicRouteIds;

    /**
     * <strong>example:</strong>
     * <p>dynamic_route_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>connector-8ccb13b6f52c****</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>tag-d3f64e8bdd4a****</p>
     */
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
