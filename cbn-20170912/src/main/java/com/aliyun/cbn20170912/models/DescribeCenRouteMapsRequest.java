// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenRouteMapsRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The match method that is used to match routes based on the AS path.</p>
     * <br>
     * <p>*   **Include**: fuzzy match. A route is a match if the AS path of the route overlaps with the AS path specified in the match condition.</p>
     * <p>*   **Complete**: exact match. A route is a match only if the AS path of the route is the same as the AS path specified in the match condition.</p>
     */
    @NameInMap("CenRegionId")
    public String cenRegionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The route table ID of the transit router with which the routing policy is associated.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The IDs of the destination network instances to which the routes belong.</p>
     * <br>
     * <p>>  The destination network instance IDs are valid only when the routing policy is applied to scenarios where routes are advertised from the gateway in the current region to network instances in the current region.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Indicates whether the destination network instance IDs are excluded.</p>
     * <br>
     * <p>*   **false** (default): A route is a match if its destination network instance ID is in the list specified by **DestinationInstanceIds.N**.</p>
     * <p>*   **true**: A route is a match if its destination network instance ID is not in the list specified by **DestinationInstanceIds.N**.</p>
     */
    @NameInMap("RouteMapId")
    public String routeMapId;

    /**
     * <p>The priority of the routing policy that you want to associate with the current one.</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    /**
     * <p>The match method that is used to match routes based on the community.</p>
     * <br>
     * <p>*   **Include**: fuzzy match. A route is a match if the community of the route overlaps with the community specified in the match condition.</p>
     * <p>*   **Complete**: exact match. A route is a match only if the community of the route is the same as the community specified in the match condition.</p>
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
