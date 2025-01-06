// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenChildInstanceRouteEntriesRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-7qthudw0ll6jmc****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the network instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp18sth14qii3pnvo****</p>
     */
    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    /**
     * <p>The ID of the region where the network instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    /**
     * <p>The ID of the route table of the network instance. If you do not specify a route table ID, the system queries the routes in the system route tables of the VPCs by default.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-p0wxx3apzgn6uqp3r****</p>
     */
    @NameInMap("ChildInstanceRouteTableId")
    public String childInstanceRouteTableId;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: virtual private cloud (VPC)</li>
     * <li><strong>VBR</strong>: virtual border router (VBR)</li>
     * <li><strong>CCN</strong>: Cloud Connect Network (CCN) instance</li>
     * <li><strong>ECR</strong>: Express Connect Router (ECR)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ChildInstanceType")
    public String childInstanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>500</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the route. Valid values:</p>
     * <ul>
     * <li><strong>Active</strong>: available</li>
     * <li><strong>Candidate</strong>: standby</li>
     * <li><strong>Rejected</strong>: rejected</li>
     * <li><strong>Prohibited</strong>: prohibited</li>
     * <li><strong>All</strong> (default): all routes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeCenChildInstanceRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenChildInstanceRouteEntriesRequest self = new DescribeCenChildInstanceRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCenChildInstanceRouteEntriesRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeCenChildInstanceRouteEntriesRequest setChildInstanceId(String childInstanceId) {
        this.childInstanceId = childInstanceId;
        return this;
    }
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    public DescribeCenChildInstanceRouteEntriesRequest setChildInstanceRegionId(String childInstanceRegionId) {
        this.childInstanceRegionId = childInstanceRegionId;
        return this;
    }
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    public DescribeCenChildInstanceRouteEntriesRequest setChildInstanceRouteTableId(String childInstanceRouteTableId) {
        this.childInstanceRouteTableId = childInstanceRouteTableId;
        return this;
    }
    public String getChildInstanceRouteTableId() {
        return this.childInstanceRouteTableId;
    }

    public DescribeCenChildInstanceRouteEntriesRequest setChildInstanceType(String childInstanceType) {
        this.childInstanceType = childInstanceType;
        return this;
    }
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    public DescribeCenChildInstanceRouteEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCenChildInstanceRouteEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCenChildInstanceRouteEntriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenChildInstanceRouteEntriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenChildInstanceRouteEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCenChildInstanceRouteEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCenChildInstanceRouteEntriesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
