// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenInterRegionTrafficQosQueuesResponseBody extends TeaModel {
    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>- If NextToken was not returned, it indicates that no additional results exist.</p>
     * <p>- If NextToken was returned in the previous query, specify the value to obtain the next set of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of queues.</p>
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
         * <p>The differentiated services code point (DSCP) value that matches the current queue.</p>
         */
        @NameInMap("Dscps")
        public java.util.List<Integer> dscps;

        /**
         * <p>The percentage of bandwidth resources that can be allocated to the current queue.</p>
         * <br>
         * <p>For example, a value of 1 indicates that 1 percent of bandwidth resources can be allocated to the queue.</p>
         */
        @NameInMap("RemainBandwidthPercent")
        public Integer remainBandwidthPercent;

        /**
         * <p>The status of the queue. Valid values:</p>
         * <br>
         * <p>- **Creating**: The queue is being created. </p>
         * <p>- **Active**: The queue is available. </p>
         * <p>- **Deleting**: The queue is being deleted.</p>
         */
        @NameInMap("Status")
        public String status;

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

        public static ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues build(java.util.Map<String, ?> map) throws Exception {
            ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues self = new ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues();
            return TeaModel.build(map, self);
        }

        public ListCenInterRegionTrafficQosQueuesResponseBodyTrafficQosQueues setDscps(java.util.List<Integer> dscps) {
            this.dscps = dscps;
            return this;
        }
        public java.util.List<Integer> getDscps() {
            return this.dscps;
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
