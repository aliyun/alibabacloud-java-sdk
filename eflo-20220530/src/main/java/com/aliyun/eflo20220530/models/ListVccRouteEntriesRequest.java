// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccRouteEntriesRequest extends TeaModel {
    /**
     * <p>Destination CIDR block</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Specifies whether to enable pagination query.</p>
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
     * <p>vcc-cn-jaj34d75h01</p>
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
     * <p>The number of entries to return on each page. Default value: 20.</p>
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
     * <p>rg-aek2l4sq6l7unhi</p>
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
     * <p>The ID of the Lingjun connection instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-zvp2w222001</p>
     */
    @NameInMap("VccId")
    public String vccId;

    /**
     * <p>Lingjun CIDR block route entry instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-rte-toekyqel</p>
     */
    @NameInMap("VpdRouteEntryId")
    public String vpdRouteEntryId;

    public static ListVccRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVccRouteEntriesRequest self = new ListVccRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListVccRouteEntriesRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public ListVccRouteEntriesRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListVccRouteEntriesRequest setIgnoreDetailedRouteEntry(Boolean ignoreDetailedRouteEntry) {
        this.ignoreDetailedRouteEntry = ignoreDetailedRouteEntry;
        return this;
    }
    public Boolean getIgnoreDetailedRouteEntry() {
        return this.ignoreDetailedRouteEntry;
    }

    public ListVccRouteEntriesRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public ListVccRouteEntriesRequest setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public ListVccRouteEntriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVccRouteEntriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVccRouteEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVccRouteEntriesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVccRouteEntriesRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }
    public String getRouteType() {
        return this.routeType;
    }

    public ListVccRouteEntriesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListVccRouteEntriesRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

    public ListVccRouteEntriesRequest setVpdRouteEntryId(String vpdRouteEntryId) {
        this.vpdRouteEntryId = vpdRouteEntryId;
        return this;
    }
    public String getVpdRouteEntryId() {
        return this.vpdRouteEntryId;
    }

}
