// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicRoutesRequest extends TeaModel {
    /**
     * <p>The ID of the private access application for the dynamic route. You cannot filter by both the private access application ID and the private access tag ID. You can obtain the ID from the following sources:</p>
     * <ul>
     * <li><p><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: Queries multiple private access applications.</p>
     * </li>
     * <li><p><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: Creates a private access application.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pa-application-e12860ef6c48****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The number of the page to return for a paged query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The IDs of the dynamic routes. You can specify up to 100 dynamic route IDs.</p>
     */
    @NameInMap("DynamicRouteIds")
    public java.util.List<String> dynamicRouteIds;

    /**
     * <p>The name of the dynamic route. The name must be 1 to 128 characters in length and can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>dynamic_route_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the next hop instance for the dynamic route. You can obtain the ID from the following source:</p>
     * <ul>
     * <li><a href="~~ListConnectors~~">ListConnectors</a>: Queries multiple connectors.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>connector-8ccb13b6f52c****</p>
     */
    @NameInMap("NextHop")
    public String nextHop;

    /**
     * <p>The number of entries to return on each page for a paged query. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of regions where the SASE POP cluster endpoint is supported.</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The status of the dynamic route. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: The dynamic route is enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: The dynamic route is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the private access tag for the dynamic route. You cannot filter by both the private access tag ID and the private access application ID. You can obtain the ID from the following sources:</p>
     * <ul>
     * <li><p><a href="~~ListPrivateAccessTags~~">ListPrivateAccessTags</a>: Queries multiple private access tags.</p>
     * </li>
     * <li><p><a href="~~CreatePrivateAccessTag~~">CreatePrivateAccessTag</a>: Creates a private access tag.</p>
     * </li>
     * </ul>
     * 
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
