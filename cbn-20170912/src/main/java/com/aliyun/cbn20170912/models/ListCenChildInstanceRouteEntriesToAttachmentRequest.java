// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenChildInstanceRouteEntriesToAttachmentRequest extends TeaModel {
    /**
     * <p>The Cloud Enterprise Network (CEN) instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-dc4vwznpwbobrl****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The route table ID of the network instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp174d1gje79u1g4t****</p>
     */
    @NameInMap("ChildInstanceRouteTableId")
    public String childInstanceRouteTableId;

    /**
     * <p>The number of entries per page for a paged query. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether a next query token (Token) exists. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first query or if no next query exists.</li>
     * <li>If a next query exists, set this parameter to the NextToken value returned by the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The destination CIDR block filter.</p>
     */
    @NameInMap("RouteFilter")
    public java.util.List<ListCenChildInstanceRouteEntriesToAttachmentRequestRouteFilter> routeFilter;

    /**
     * <p>The type of route hosting. If this field is empty, the route is not hosted. Valid values: TR, which indicates that the hosting type is transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>TR</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The ID of the network instance connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-r6g0m3epjehw57****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    public static ListCenChildInstanceRouteEntriesToAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCenChildInstanceRouteEntriesToAttachmentRequest self = new ListCenChildInstanceRouteEntriesToAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public ListCenChildInstanceRouteEntriesToAttachmentRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentRequest setChildInstanceRouteTableId(String childInstanceRouteTableId) {
        this.childInstanceRouteTableId = childInstanceRouteTableId;
        return this;
    }
    public String getChildInstanceRouteTableId() {
        return this.childInstanceRouteTableId;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentRequest setRouteFilter(java.util.List<ListCenChildInstanceRouteEntriesToAttachmentRequestRouteFilter> routeFilter) {
        this.routeFilter = routeFilter;
        return this;
    }
    public java.util.List<ListCenChildInstanceRouteEntriesToAttachmentRequestRouteFilter> getRouteFilter() {
        return this.routeFilter;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public static class ListCenChildInstanceRouteEntriesToAttachmentRequestRouteFilter extends TeaModel {
        /**
         * <p>The route match mode.</p>
         * <ul>
         * <li><strong>prefix-exact-match</strong>: exact match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>prefix-exact-match</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The list of destination CIDR blocks.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListCenChildInstanceRouteEntriesToAttachmentRequestRouteFilter build(java.util.Map<String, ?> map) throws Exception {
            ListCenChildInstanceRouteEntriesToAttachmentRequestRouteFilter self = new ListCenChildInstanceRouteEntriesToAttachmentRequestRouteFilter();
            return TeaModel.build(map, self);
        }

        public ListCenChildInstanceRouteEntriesToAttachmentRequestRouteFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListCenChildInstanceRouteEntriesToAttachmentRequestRouteFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
