// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ListDedicatedClusterRequest extends TeaModel {
    /**
     * <p>The basis on which the retrieved entries are sorted if multiple DTS dedicated clusters are returned. Valid values:</p>
     * <ul>
     * <li><strong>gmtCreated</strong>: the time when a cluster was created.</li>
     * <li><strong>orderCount</strong>: the number of nodes in a cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gmtCreated</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <p>The order in which you want to sort the retrieved entries. Valid values:</p>
     * <ul>
     * <li>asc: sorts the retrieved entries in ascending order. This is the default value.</li>
     * <li>desc: sorts the retrieved entries in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("OrderDirection")
    public String orderDirection;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of the page to return. The value of this parameter must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of clusters to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The content of the query condition.</p>
     * <blockquote>
     * <p> You must set the <strong>Type parameter</strong> to specify the type of the query condition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtspk3f13r731m****</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: The cluster is being initialized.</li>
     * <li><strong>schedule</strong>: The cluster is pending scheduling.</li>
     * <li><strong>running</strong>: The cluster is running.</li>
     * <li><strong>upgrade</strong>: The cluster is being upgraded.</li>
     * <li><strong>downgrade</strong>: The cluster is being downgraded.</li>
     * <li><strong>locked</strong>: The cluster is locked.</li>
     * <li><strong>releasing</strong>: The cluster is being released.</li>
     * <li><strong>released</strong>: The cluster is released.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>init</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <ul>
     * <li><strong>NAME</strong>: the name of the cluster.</li>
     * <li><strong>INSTANCE</strong>: the ID of a cluster instance.</li>
     * <li><strong>DEDICAETEDCLUSTERID</strong>: the ID of a dedicated cluster.</li>
     * </ul>
     * <blockquote>
     * <p> You must specify the query condition by using the <strong>Params</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NAME</p>
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

    public ListDedicatedClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
