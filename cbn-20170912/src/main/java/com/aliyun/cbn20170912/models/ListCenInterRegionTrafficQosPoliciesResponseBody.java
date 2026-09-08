// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenInterRegionTrafficQosPoliciesResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>113BFD47-63DF-5D9D-972C-033FB9C360CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of traffic scheduling policies.</p>
     */
    @NameInMap("TrafficQosPolicies")
    public java.util.List<ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies> trafficQosPolicies;

    public static ListCenInterRegionTrafficQosPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCenInterRegionTrafficQosPoliciesResponseBody self = new ListCenInterRegionTrafficQosPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCenInterRegionTrafficQosPoliciesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCenInterRegionTrafficQosPoliciesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCenInterRegionTrafficQosPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCenInterRegionTrafficQosPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCenInterRegionTrafficQosPoliciesResponseBody setTrafficQosPolicies(java.util.List<ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies> trafficQosPolicies) {
        this.trafficQosPolicies = trafficQosPolicies;
        return this;
    }
    public java.util.List<ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies> getTrafficQosPolicies() {
        return this.trafficQosPolicies;
    }

    public static class ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues extends TeaModel {
        /**
         * <p>The inter-region bandwidth allocated to the current queue when the bandwidth guarantee type is set to the absolute value mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The DSCP values of the traffic packets to be matched by the current queue.</p>
         */
        @NameInMap("Dscps")
        public java.util.List<Integer> dscps;

        /**
         * <p>The actual effective bandwidth of the current queue.</p>
         * 
         * <strong>example:</strong>
         * <p>1.35</p>
         */
        @NameInMap("EffectiveBandwidth")
        public String effectiveBandwidth;

        /**
         * <p>The description of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("QosQueueDescription")
        public String qosQueueDescription;

        /**
         * <p>The ID of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-njcrmr9fiu1jii****</p>
         */
        @NameInMap("QosQueueId")
        public String qosQueueId;

        /**
         * <p>The name of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>namtest</p>
         */
        @NameInMap("QosQueueName")
        public String qosQueueName;

        /**
         * <p>The percentage of inter-region bandwidth occupied by the current queue when the bandwidth guarantee type is set to the percentage mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RemainBandwidthPercent")
        public Integer remainBandwidthPercent;

        public static ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues build(java.util.Map<String, ?> map) throws Exception {
            ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues self = new ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues();
            return TeaModel.build(map, self);
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues setDscps(java.util.List<Integer> dscps) {
            this.dscps = dscps;
            return this;
        }
        public java.util.List<Integer> getDscps() {
            return this.dscps;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues setEffectiveBandwidth(String effectiveBandwidth) {
            this.effectiveBandwidth = effectiveBandwidth;
            return this;
        }
        public String getEffectiveBandwidth() {
            return this.effectiveBandwidth;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues setQosQueueDescription(String qosQueueDescription) {
            this.qosQueueDescription = qosQueueDescription;
            return this;
        }
        public String getQosQueueDescription() {
            return this.qosQueueDescription;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues setQosQueueId(String qosQueueId) {
            this.qosQueueId = qosQueueId;
            return this;
        }
        public String getQosQueueId() {
            return this.qosQueueId;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues setQosQueueName(String qosQueueName) {
            this.qosQueueName = qosQueueName;
            return this;
        }
        public String getQosQueueName() {
            return this.qosQueueName;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues setRemainBandwidthPercent(Integer remainBandwidthPercent) {
            this.remainBandwidthPercent = remainBandwidthPercent;
            return this;
        }
        public Integer getRemainBandwidthPercent() {
            return this.remainBandwidthPercent;
        }

    }

    public static class ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies extends TeaModel {
        /**
         * <p>The bandwidth guarantee type. Valid values:</p>
         * <ul>
         * <li><strong>byBandwidth</strong>: configures QoS queues by absolute bandwidth value.</li>
         * <li><strong>byBandwidthPercent</strong>: configures QoS queues by bandwidth percentage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>byBandwidthPercent</p>
         */
        @NameInMap("BandwidthGuaranteeMode")
        public String bandwidthGuaranteeMode;

        /**
         * <p>The description of the traffic scheduling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("TrafficQosPolicyDescription")
        public String trafficQosPolicyDescription;

        /**
         * <p>The ID of the traffic scheduling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-rnghap5gc8155x****</p>
         */
        @NameInMap("TrafficQosPolicyId")
        public String trafficQosPolicyId;

        /**
         * <p>The name of the traffic scheduling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("TrafficQosPolicyName")
        public String trafficQosPolicyName;

        /**
         * <p>The status of the traffic scheduling policy.</p>
         * <ul>
         * <li><strong>Creating</strong>: being created.</li>
         * <li><strong>Active</strong>: active.</li>
         * <li><strong>Modifying</strong>: being modified.</li>
         * <li><strong>Deleting</strong>: being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("TrafficQosPolicyStatus")
        public String trafficQosPolicyStatus;

        /**
         * <p>The list of queues.</p>
         */
        @NameInMap("TrafficQosQueues")
        public java.util.List<ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues> trafficQosQueues;

        /**
         * <p>The ID of the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-q7ct7c06jpw***</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The transit router instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-2ze4ta4v32umj0rb***</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        public static ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies self = new ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies();
            return TeaModel.build(map, self);
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies setBandwidthGuaranteeMode(String bandwidthGuaranteeMode) {
            this.bandwidthGuaranteeMode = bandwidthGuaranteeMode;
            return this;
        }
        public String getBandwidthGuaranteeMode() {
            return this.bandwidthGuaranteeMode;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies setTrafficQosPolicyDescription(String trafficQosPolicyDescription) {
            this.trafficQosPolicyDescription = trafficQosPolicyDescription;
            return this;
        }
        public String getTrafficQosPolicyDescription() {
            return this.trafficQosPolicyDescription;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies setTrafficQosPolicyId(String trafficQosPolicyId) {
            this.trafficQosPolicyId = trafficQosPolicyId;
            return this;
        }
        public String getTrafficQosPolicyId() {
            return this.trafficQosPolicyId;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies setTrafficQosPolicyName(String trafficQosPolicyName) {
            this.trafficQosPolicyName = trafficQosPolicyName;
            return this;
        }
        public String getTrafficQosPolicyName() {
            return this.trafficQosPolicyName;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies setTrafficQosPolicyStatus(String trafficQosPolicyStatus) {
            this.trafficQosPolicyStatus = trafficQosPolicyStatus;
            return this;
        }
        public String getTrafficQosPolicyStatus() {
            return this.trafficQosPolicyStatus;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies setTrafficQosQueues(java.util.List<ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues> trafficQosQueues) {
            this.trafficQosQueues = trafficQosQueues;
            return this;
        }
        public java.util.List<ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues> getTrafficQosQueues() {
            return this.trafficQosQueues;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

    }

}
