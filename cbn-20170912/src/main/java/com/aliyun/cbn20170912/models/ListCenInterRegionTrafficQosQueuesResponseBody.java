// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenInterRegionTrafficQosQueuesResponseBody extends TeaModel {
    /**
     * <p>The token that determines the start point of the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0151fa6aa1ed****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1D1E15D2-416D-54F3-BDD9-BC27DE4C6352</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queue information of the traffic scheduling policy.</p>
     */
    @NameInMap("TrafficQosQueues")
    public java.util.List<ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues> trafficQosQueues;

    public static ListCenInterRegionTrafficQosQueuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCenInterRegionTrafficQosQueuesResponseBody self = new ListCenInterRegionTrafficQosQueuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCenInterRegionTrafficQosQueuesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCenInterRegionTrafficQosQueuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCenInterRegionTrafficQosQueuesResponseBody setTrafficQosQueues(java.util.List<ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues> trafficQosQueues) {
        this.trafficQosQueues = trafficQosQueues;
        return this;
    }
    public java.util.List<ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues> getTrafficQosQueues() {
        return this.trafficQosQueues;
    }

    public static class ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues extends TeaModel {
        /**
         * <p>The inter-region bandwidth allocated to the current queue when the bandwidth guarantee type is set to absolute value mode.</p>
         * <p>For example, a value of <strong>1</strong> indicates that traffic packets matching the current queue can use up to 1 Mbit/s of inter-region bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The DSCP values matched by the current queue.</p>
         */
        @NameInMap("Dscps")
        public java.util.List<Integer> dscps;

        /**
         * <p>The actual effective bandwidth value of the current queue.</p>
         * 
         * <strong>example:</strong>
         * <p>1.35</p>
         */
        @NameInMap("EffectiveBandwidth")
        public String effectiveBandwidth;

        /**
         * <p>The percentage of inter-region bandwidth that the current queue can use when the bandwidth guarantee type is set to percentage mode.</p>
         * <p>For example, a value of <strong>1</strong> indicates that traffic packets matching the current queue can use up to 1% of the inter-region bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RemainBandwidthPercent")
        public Integer remainBandwidthPercent;

        /**
         * <p>The status of the queue. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The queue is being created.</li>
         * <li><strong>Active</strong>: The queue is running.</li>
         * <li><strong>Deleting</strong>: The queue is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the traffic scheduling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-fv2qq9yqrsjowp****</p>
         */
        @NameInMap("TrafficQosPolicyId")
        public String trafficQosPolicyId;

        /**
         * <p>The description of the traffic scheduling policy queue.</p>
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
         * <p>tr-attach-nzrcv25d7ezt23****</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The ID of the transit router instance.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-p0wwagjv6fvxt4b7y****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        public static ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues build(java.util.Map<String, ?> map) throws Exception {
            ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues self = new ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues();
            return TeaModel.build(map, self);
        }

        public ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues setDscps(java.util.List<Integer> dscps) {
            this.dscps = dscps;
            return this;
        }
        public java.util.List<Integer> getDscps() {
            return this.dscps;
        }

        public ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues setEffectiveBandwidth(String effectiveBandwidth) {
            this.effectiveBandwidth = effectiveBandwidth;
            return this;
        }
        public String getEffectiveBandwidth() {
            return this.effectiveBandwidth;
        }

        public ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues setRemainBandwidthPercent(Integer remainBandwidthPercent) {
            this.remainBandwidthPercent = remainBandwidthPercent;
            return this;
        }
        public Integer getRemainBandwidthPercent() {
            return this.remainBandwidthPercent;
        }

        public ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues setTrafficQosPolicyId(String trafficQosPolicyId) {
            this.trafficQosPolicyId = trafficQosPolicyId;
            return this;
        }
        public String getTrafficQosPolicyId() {
            return this.trafficQosPolicyId;
        }

        public ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues setTrafficQosQueueDescription(String trafficQosQueueDescription) {
            this.trafficQosQueueDescription = trafficQosQueueDescription;
            return this;
        }
        public String getTrafficQosQueueDescription() {
            return this.trafficQosQueueDescription;
        }

        public ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues setTrafficQosQueueId(String trafficQosQueueId) {
            this.trafficQosQueueId = trafficQosQueueId;
            return this;
        }
        public String getTrafficQosQueueId() {
            return this.trafficQosQueueId;
        }

        public ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues setTrafficQosQueueName(String trafficQosQueueName) {
            this.trafficQosQueueName = trafficQosQueueName;
            return this;
        }
        public String getTrafficQosQueueName() {
            return this.trafficQosQueueName;
        }

        public ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

    }

}
