// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenInterRegionTrafficQosQueuesRequest extends TeaModel {
    /**
     * <p>Filters results by the actual effective bandwidth value. Only positive integers are allowed. Unit: Mbit/s.</p>
     */
    @NameInMap("EffectiveBandwidthFilter")
    public ListCenInterRegionTrafficQosQueuesRequestEffectiveBandwidthFilter effectiveBandwidthFilter;

    /**
     * <p>The number of entries per page for a paged query. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2ca1ed1573cb****</p>
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
     * <p>The ID of the traffic scheduling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-rnghap5gc8155x****</p>
     */
    @NameInMap("TrafficQosPolicyId")
    public String trafficQosPolicyId;

    /**
     * <p>The description of the traffic scheduling policy queue.</p>
     * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>qosQueueDescription</p>
     */
    @NameInMap("TrafficQosQueueDescription")
    public String trafficQosQueueDescription;

    /**
     * <p>The ID of the traffic scheduling policy queue.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-queue-siakjb2nn9gz5z****</p>
     */
    @NameInMap("TrafficQosQueueId")
    public String trafficQosQueueId;

    /**
     * <p>The name of the traffic scheduling policy queue.</p>
     * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>qosQueueName</p>
     */
    @NameInMap("TrafficQosQueueName")
    public String trafficQosQueueName;

    /**
     * <p>The ID of the inter-region connection.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-a6p8voaodog5c0****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The ID of the transit router instance.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-bp1rmwxnk221e3fas****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static ListCenInterRegionTrafficQosQueuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCenInterRegionTrafficQosQueuesRequest self = new ListCenInterRegionTrafficQosQueuesRequest();
        return TeaModel.build(map, self);
    }

    public ListCenInterRegionTrafficQosQueuesRequest setEffectiveBandwidthFilter(ListCenInterRegionTrafficQosQueuesRequestEffectiveBandwidthFilter effectiveBandwidthFilter) {
        this.effectiveBandwidthFilter = effectiveBandwidthFilter;
        return this;
    }
    public ListCenInterRegionTrafficQosQueuesRequestEffectiveBandwidthFilter getEffectiveBandwidthFilter() {
        return this.effectiveBandwidthFilter;
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

    public static class ListCenInterRegionTrafficQosQueuesRequestEffectiveBandwidthFilter extends TeaModel {
        /**
         * <p>The actual effective bandwidth is greater than or equal to the specified bandwidth value.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Gte")
        public Long gte;

        /**
         * <p>The actual effective bandwidth is less than or equal to the specified bandwidth value.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Lte")
        public Long lte;

        public static ListCenInterRegionTrafficQosQueuesRequestEffectiveBandwidthFilter build(java.util.Map<String, ?> map) throws Exception {
            ListCenInterRegionTrafficQosQueuesRequestEffectiveBandwidthFilter self = new ListCenInterRegionTrafficQosQueuesRequestEffectiveBandwidthFilter();
            return TeaModel.build(map, self);
        }

        public ListCenInterRegionTrafficQosQueuesRequestEffectiveBandwidthFilter setGte(Long gte) {
            this.gte = gte;
            return this;
        }
        public Long getGte() {
            return this.gte;
        }

        public ListCenInterRegionTrafficQosQueuesRequestEffectiveBandwidthFilter setLte(Long lte) {
            this.lte = lte;
            return this;
        }
        public Long getLte() {
            return this.lte;
        }

    }

}
