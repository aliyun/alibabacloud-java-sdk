// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenRouteMapsRequest extends TeaModel {
    /**
     * <p>The instance ID of the Cloud Enterprise Network (CEN) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-wx12mmlt17ld82****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the region where the route map is applied.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CenRegionId")
    public String cenRegionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the list. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Default value: <strong>10</strong>.</p>
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
     * <p>The ID of the route map.</p>
     * 
     * <strong>example:</strong>
     * <p>cenrmap-y40mxdvf7joc12****</p>
     */
    @NameInMap("RouteMapId")
    public String routeMapId;

    /**
     * <p>The ID of the transit router route table associated with the route map.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-gw8nx3515m1mbd1z1****</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    /**
     * <p>The direction in which the route map is applied. Valid values:</p>
     * <ul>
     * <li><strong>RegionIn</strong>: Routes are advertised to the regional gateway of the CEN instance.</li>
     * </ul>
     * <p> For example, routes are advertised from a network instance in the local region to the local regional gateway, or routes are advertised from a regional gateway in another region to the local regional gateway.</p>
     * <ul>
     * <li><strong>RegionOut</strong>: Routes are advertised from the regional gateway of the CEN instance.</li>
     * </ul>
     * <p> For example, routes are advertised from the local regional gateway to network instances in the local region, or routes are advertised from the local regional gateway to regional gateways in other regions.</p>
     * 
     * <strong>example:</strong>
     * <p>RegionOut</p>
     */
    @NameInMap("TransmitDirection")
    public String transmitDirection;

    public static DescribeCenRouteMapsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenRouteMapsRequest self = new DescribeCenRouteMapsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCenRouteMapsRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeCenRouteMapsRequest setCenRegionId(String cenRegionId) {
        this.cenRegionId = cenRegionId;
        return this;
    }
    public String getCenRegionId() {
        return this.cenRegionId;
    }

    public DescribeCenRouteMapsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCenRouteMapsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCenRouteMapsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenRouteMapsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenRouteMapsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCenRouteMapsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCenRouteMapsRequest setRouteMapId(String routeMapId) {
        this.routeMapId = routeMapId;
        return this;
    }
    public String getRouteMapId() {
        return this.routeMapId;
    }

    public DescribeCenRouteMapsRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public DescribeCenRouteMapsRequest setTransmitDirection(String transmitDirection) {
        this.transmitDirection = transmitDirection;
        return this;
    }
    public String getTransmitDirection() {
        return this.transmitDirection;
    }

}
