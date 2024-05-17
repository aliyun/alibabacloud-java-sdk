// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenInterRegionTrafficQosQueuesRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query.</p>
     * <br>
     * <p>- If NextToken was not returned in the previous query, it indicates that no additional results exist.</p>
     * <p>- If NextToken was returned in the previous query, specify the value to obtain the next set of results.</p>
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
     * <p>The ID of the QoS policy.</p>
     */
    @NameInMap("TrafficQosPolicyId")
    public String trafficQosPolicyId;

    /**
     * <p>The description of the queue.</p>
     */
    @NameInMap("TrafficQosQueueDescription")
    public String trafficQosQueueDescription;

    /**
     * <p>The ID of the queue.</p>
     */
    @NameInMap("TrafficQosQueueId")
    public String trafficQosQueueId;

    /**
     * <p>The name of the queue.</p>
     */
    @NameInMap("TrafficQosQueueName")
    public String trafficQosQueueName;

    /**
     * <p>The ID of the inter-region connection.</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The ID of the transit router.</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static ListCenInterRegionTrafficQosQueuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCenInterRegionTrafficQosQueuesRequest self = new ListCenInterRegionTrafficQosQueuesRequest();
        return TeaModel.build(map, self);
    }

    public ListCenInterRegionTrafficQosQueuesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCenInterRegionTrafficQosQueuesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCenInterRegionTrafficQosQueuesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListCenInterRegionTrafficQosQueuesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListCenInterRegionTrafficQosQueuesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListCenInterRegionTrafficQosQueuesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListCenInterRegionTrafficQosQueuesRequest setTrafficQosPolicyId(String trafficQosPolicyId) {
        this.trafficQosPolicyId = trafficQosPolicyId;
        return this;
    }
    public String getTrafficQosPolicyId() {
        return this.trafficQosPolicyId;
    }

    public ListCenInterRegionTrafficQosQueuesRequest setTrafficQosQueueDescription(String trafficQosQueueDescription) {
        this.trafficQosQueueDescription = trafficQosQueueDescription;
        return this;
    }
    public String getTrafficQosQueueDescription() {
        return this.trafficQosQueueDescription;
    }

    public ListCenInterRegionTrafficQosQueuesRequest setTrafficQosQueueId(String trafficQosQueueId) {
        this.trafficQosQueueId = trafficQosQueueId;
        return this;
    }
    public String getTrafficQosQueueId() {
        return this.trafficQosQueueId;
    }

    public ListCenInterRegionTrafficQosQueuesRequest setTrafficQosQueueName(String trafficQosQueueName) {
        this.trafficQosQueueName = trafficQosQueueName;
        return this;
    }
    public String getTrafficQosQueueName() {
        return this.trafficQosQueueName;
    }

    public ListCenInterRegionTrafficQosQueuesRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public ListCenInterRegionTrafficQosQueuesRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
