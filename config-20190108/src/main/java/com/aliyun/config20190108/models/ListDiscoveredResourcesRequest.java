// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ListDiscoveredResourcesRequest extends TeaModel {
    /**
     * <p>This parameter has been removed from 00:00:00, June 30, 2021. Account group-related operations are provided as an alternative after 00:00:00, May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related operations after 00:00:00, May 30, 2021. For more information about account groups, see [Overview](~~211534~~).</p>
     */
    @NameInMap("MemberId")
    public Long memberId;

    /**
     * <p>This parameter has been removed from 00:00:00, June 30, 2021. Account group-related operations are provided as an alternative after 00:00:00, May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related operations after 00:00:00, May 30, 2021. For more information about account groups, see [Overview](~~211534~~).</p>
     */
    @NameInMap("MultiAccount")
    public Boolean multiAccount;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which the resource resides. Separate multiple regions IDs with commas (,).</p>
     */
    @NameInMap("Regions")
    public String regions;

    /**
     * <p>The status of the resource. Valid values:</p>
     * <br>
     * <p>*   0: The resource is deleted.</p>
     * <p>*   1: The resource is retained. This is the default value.</p>
     */
    @NameInMap("ResourceDeleted")
    public Integer resourceDeleted;

    /**
     * <p>The ID of the resource.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource. Separate multiple resource types with commas (,).</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    public static ListDiscoveredResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiscoveredResourcesRequest self = new ListDiscoveredResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListDiscoveredResourcesRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public ListDiscoveredResourcesRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    public ListDiscoveredResourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDiscoveredResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDiscoveredResourcesRequest setRegions(String regions) {
        this.regions = regions;
        return this;
    }
    public String getRegions() {
        return this.regions;
    }

    public ListDiscoveredResourcesRequest setResourceDeleted(Integer resourceDeleted) {
        this.resourceDeleted = resourceDeleted;
        return this;
    }
    public Integer getResourceDeleted() {
        return this.resourceDeleted;
    }

    public ListDiscoveredResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListDiscoveredResourcesRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

}
