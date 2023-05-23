// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenInterRegionTrafficQosQueuesRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

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

    @NameInMap("TrafficQosPolicyId")
    public String trafficQosPolicyId;

    @NameInMap("TrafficQosQueueDescription")
    public String trafficQosQueueDescription;

    @NameInMap("TrafficQosQueueId")
    public String trafficQosQueueId;

    @NameInMap("TrafficQosQueueName")
    public String trafficQosQueueName;

    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

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
