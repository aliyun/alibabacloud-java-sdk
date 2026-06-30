// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenInterRegionTrafficQosPoliciesRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results. Valid values:</p>
     * <ul>
     * <li><p>If this is your first query or no next page exists, do not specify this parameter.</p>
     * </li>
     * <li><p>If a next page exists, set the value to the <strong>NextToken</strong> value returned from the previous call.</p>
     * </li>
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
     * <p>The description of the QoS policy.</p>
     * <p>The description can be empty or 1 to 256 characters in length. It cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TrafficQosPolicyDescription")
    public String trafficQosPolicyDescription;

    /**
     * <p>The ID of the QoS policy.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-rnghap5gc8155x****</p>
     */
    @NameInMap("TrafficQosPolicyId")
    public String trafficQosPolicyId;

    /**
     * <p>The name of the QoS policy.</p>
     * <p>The name can be empty or 1 to 128 characters in length. It cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TrafficQosPolicyName")
    public String trafficQosPolicyName;

    /**
     * <p>The ID of the inter-region connection.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-r6g0m3epjehw57****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The ID of the TransitRouter instance.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-bp1rmwxnk221e3fas****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static ListCenInterRegionTrafficQosPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCenInterRegionTrafficQosPoliciesRequest self = new ListCenInterRegionTrafficQosPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListCenInterRegionTrafficQosPoliciesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCenInterRegionTrafficQosPoliciesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCenInterRegionTrafficQosPoliciesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListCenInterRegionTrafficQosPoliciesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListCenInterRegionTrafficQosPoliciesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListCenInterRegionTrafficQosPoliciesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListCenInterRegionTrafficQosPoliciesRequest setTrafficQosPolicyDescription(String trafficQosPolicyDescription) {
        this.trafficQosPolicyDescription = trafficQosPolicyDescription;
        return this;
    }
    public String getTrafficQosPolicyDescription() {
        return this.trafficQosPolicyDescription;
    }

    public ListCenInterRegionTrafficQosPoliciesRequest setTrafficQosPolicyId(String trafficQosPolicyId) {
        this.trafficQosPolicyId = trafficQosPolicyId;
        return this;
    }
    public String getTrafficQosPolicyId() {
        return this.trafficQosPolicyId;
    }

    public ListCenInterRegionTrafficQosPoliciesRequest setTrafficQosPolicyName(String trafficQosPolicyName) {
        this.trafficQosPolicyName = trafficQosPolicyName;
        return this;
    }
    public String getTrafficQosPolicyName() {
        return this.trafficQosPolicyName;
    }

    public ListCenInterRegionTrafficQosPoliciesRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public ListCenInterRegionTrafficQosPoliciesRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
