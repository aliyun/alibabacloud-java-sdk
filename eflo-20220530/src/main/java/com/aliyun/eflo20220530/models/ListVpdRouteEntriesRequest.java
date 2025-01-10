// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdRouteEntriesRequest extends TeaModel {
    /**
     * <p>Destination CIDR block</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Specifies whether to enable paged query. Optional values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable pagination query</li>
     * <li><strong>false</strong>: Pagination query is disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePage")
    public Boolean enablePage;

    /**
     * <p>Filter 32 detailed CIDR blocks. Default value: true</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IgnoreDetailedRouteEntry")
    public Boolean ignoreDetailedRouteEntry;

    /**
     * <p>Next Hop Instance</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-209300qha01</p>
     */
    @NameInMap("NextHopId")
    public String nextHopId;

    /**
     * <p>Next Hop Instance Type</p>
     * 
     * <strong>example:</strong>
     * <p>VCC</p>
     */
    @NameInMap("NextHopType")
    public String nextHopType;

    /**
     * <p>The page number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm4mlwqjalz7a</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Route type</p>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("RouteType")
    public String routeType;

    /**
     * <p>The status of the enterprise-level snapshot policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Lingjun CIDR block instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-fuliephf</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    /**
     * <p>Lingjun CIDR block route entry instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-rte-4r1zbhoh</p>
     */
    @NameInMap("VpdRouteEntryId")
    public String vpdRouteEntryId;

    public static ListVpdRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpdRouteEntriesRequest self = new ListVpdRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListVpdRouteEntriesRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public ListVpdRouteEntriesRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListVpdRouteEntriesRequest setIgnoreDetailedRouteEntry(Boolean ignoreDetailedRouteEntry) {
        this.ignoreDetailedRouteEntry = ignoreDetailedRouteEntry;
        return this;
    }
    public Boolean getIgnoreDetailedRouteEntry() {
        return this.ignoreDetailedRouteEntry;
    }

    public ListVpdRouteEntriesRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public ListVpdRouteEntriesRequest setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public ListVpdRouteEntriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVpdRouteEntriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVpdRouteEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpdRouteEntriesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVpdRouteEntriesRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }
    public String getRouteType() {
        return this.routeType;
    }

    public ListVpdRouteEntriesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListVpdRouteEntriesRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public ListVpdRouteEntriesRequest setVpdRouteEntryId(String vpdRouteEntryId) {
        this.vpdRouteEntryId = vpdRouteEntryId;
        return this;
    }
    public String getVpdRouteEntryId() {
        return this.vpdRouteEntryId;
    }

}
