// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenInterRegionTrafficQosQueuesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Dscps")
        public java.util.List<Integer> dscps;

        @NameInMap("RemainBandwidthPercent")
        public Integer remainBandwidthPercent;

        @NameInMap("Status")
        public String status;

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
