// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ListDedicatedClusterRequest extends TeaModel {
    /**
     * <p>The sort column when the response contains multiple DTS dedicated cluster instances. Valid values:</p>
     * <ul>
     * <li><strong>gmtCreated</strong>: creation time.</li>
     * <li><strong>orderCount</strong>: number of nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gmtCreated</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: ascending order. This is the default value.</li>
     * <li><strong>desc</strong>: descending order.</li>
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
     * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of clusters to display per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The specific content of the query condition.</p>
     * <blockquote>
     * <p>You must first specify the <strong>Type</strong> parameter to define the query key.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtspk3f13r731m****</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The region ID. This parameter is used as a query condition.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfntftbiobqyky</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The cluster status. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: initializing.</li>
     * <li><strong>schedule</strong>: pending scheduling.</li>
     * <li><strong>running</strong>: running.</li>
     * <li><strong>upgrade</strong>: upgrading.</li>
     * <li><strong>downgrade</strong>: downgrading.</li>
     * <li><strong>locked</strong>: locked.</li>
     * <li><strong>releasing</strong>: being released.</li>
     * <li><strong>released</strong>: released.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>init</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The query key. Valid values:</p>
     * <ul>
     * <li><strong>NAME</strong>: cluster name.</li>
     * <li><strong>INSTANCE</strong>: cluster instance ID.</li>
     * <li><strong>DEDICATEDCLUSTERID</strong>: dedicated cluster ID.</li>
     * </ul>
     * <blockquote>
     * <p>You must also specify the <strong>Params</strong> parameter to provide the specific content of the query condition.</p>
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
