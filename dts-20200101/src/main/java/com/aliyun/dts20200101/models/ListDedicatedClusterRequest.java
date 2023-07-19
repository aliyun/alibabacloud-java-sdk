// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ListDedicatedClusterRequest extends TeaModel {
    /**
     * <p>The basis on which the retrieved entries are sorted if multiple DTS dedicated clusters are returned. Valid values:</p>
     * <br>
     * <p>*   **gmtCreated**: the time when a cluster was created.</p>
     * <p>*   **orderCount**: the number of nodes in a cluster.</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <p>The order in which you want to sort the retrieved entries. Valid values:</p>
     * <br>
     * <p>*   asc: sorts the retrieved entries in ascending order. This is the default value.</p>
     * <p>*   desc: sorts the retrieved entries in descending order.</p>
     */
    @NameInMap("OrderDirection")
    public String orderDirection;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of the page to return. The value of this parameter must be an integer that is greater than 0. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of clusters to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The content of the query condition.</p>
     * <br>
     * <p>>  You must set the **Type parameter** to specify the type of the query condition.</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the cluster. Valid values:</p>
     * <br>
     * <p>*   **init**: The cluster is being initialized.</p>
     * <p>*   **schedule**: The cluster is pending scheduling.</p>
     * <p>*   **running**: The cluster is running.</p>
     * <p>*   **upgrade**: The cluster is being upgraded.</p>
     * <p>*   **downgrade**: The cluster is being downgraded.</p>
     * <p>*   **locked**: The cluster is locked.</p>
     * <p>*   **releasing**: The cluster is being released.</p>
     * <p>*   **released**: The cluster is released.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <br>
     * <p>*   **NAME**: the name of the cluster.</p>
     * <p>*   **INSTANCE**: the ID of a cluster instance.</p>
     * <p>*   **DEDICAETEDCLUSTERID**: the ID of a dedicated cluster.</p>
     * <br>
     * <p>>  You must specify the query condition by using the **Params** parameter.</p>
     */
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
