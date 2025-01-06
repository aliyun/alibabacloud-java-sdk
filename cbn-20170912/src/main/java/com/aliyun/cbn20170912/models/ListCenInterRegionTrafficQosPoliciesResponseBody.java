// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenInterRegionTrafficQosPoliciesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query.</p>
     * <ul>
     * <li>If <strong>NextToken</strong> was not returned in the previous query, it indicates that no additional results exist.</li>
     * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
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
     * <p>A list of QoS policies.</p>
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
         * <p>If the QoS queues are assigned absolute bandwidth values, this parameter indicates the absolute bandwidth value that is allocated to the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The differentiated services code point (DSCP) value that is used to match packets.</p>
         */
        @NameInMap("Dscps")
        public java.util.List<Integer> dscps;

        /**
         * <p>The actual bandwidth value of the current queue.</p>
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
         * <p>The queue ID.</p>
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
         * <p>If the QoS queues are assigned bandwidth percentages, this parameter indicates the percentage of bandwidth that is allocated to the queue.</p>
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
         * <p>The guaranteed bandwidth mode.</p>
         * <ul>
         * <li><strong>byBandwidth</strong>: allocates absolute bandwidth values to QoS queues.</li>
         * <li><strong>byBandwidthPercent</strong>: assigns bandwidth percentages to QoS queues.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>byBandwidthPercent</p>
         */
        @NameInMap("BandwidthGuaranteeMode")
        public String bandwidthGuaranteeMode;

        /**
         * <p>The description of the QoS policy.</p>
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
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("TrafficQosPolicyName")
        public String trafficQosPolicyName;

        /**
         * <p>The status of the QoS policy.</p>
         * <ul>
         * <li><strong>Creating</strong>: The QoS policy is being created.</li>
         * <li><strong>Active</strong>: The QoS policy is available.</li>
         * <li><strong>Modifying</strong>: The policy is being modified.</li>
         * <li><strong>Deleting</strong>: The QoS policy is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("TrafficQosPolicyStatus")
        public String trafficQosPolicyStatus;

        /**
         * <p>A list of queues.</p>
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
         * <p>The ID of the transit router.</p>
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
