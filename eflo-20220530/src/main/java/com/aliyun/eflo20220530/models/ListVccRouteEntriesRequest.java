// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccRouteEntriesRequest extends TeaModel {
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("EnablePage")
    public Boolean enablePage;

    @NameInMap("NextHopId")
    public String nextHopId;

    @NameInMap("NextHopType")
    public String nextHopType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RouteType")
    public String routeType;

    @NameInMap("Status")
    public String status;

    @NameInMap("VccId")
    public String vccId;

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
