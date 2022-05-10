// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ListDedicatedClusterRequest extends TeaModel {
    @NameInMap("OrderColumn")
    public String orderColumn;

    @NameInMap("OrderDirection")
    public String orderDirection;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Params")
    public String params;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("State")
    public String state;

    @NameInMap("Type")
    public String type;

    public static ListDedicatedClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDedicatedClusterRequest self = new ListDedicatedClusterRequest();
        return TeaModel.build(map, self);
    }

    public ListDedicatedClusterRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public ListDedicatedClusterRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListDedicatedClusterRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ListDedicatedClusterRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDedicatedClusterRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDedicatedClusterRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ListDedicatedClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDedicatedClusterRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListDedicatedClusterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
