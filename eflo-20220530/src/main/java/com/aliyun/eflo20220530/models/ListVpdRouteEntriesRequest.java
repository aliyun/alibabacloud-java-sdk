// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdRouteEntriesRequest extends TeaModel {
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

    @NameInMap("VpdId")
    public String vpdId;

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
