// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenInterRegionTrafficQosPoliciesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("Dscps")
        public java.util.List<Integer> dscps;

        @NameInMap("QosQueueDescription")
        public String qosQueueDescription;

        @NameInMap("QosQueueId")
        public String qosQueueId;

        @NameInMap("QosQueueName")
        public String qosQueueName;

        @NameInMap("RemainBandwidthPercent")
        public Integer remainBandwidthPercent;

        public static ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues build(java.util.Map<String, ?> map) throws Exception {
            ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues self = new ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues();
            return TeaModel.build(map, self);
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues setDscps(java.util.List<Integer> dscps) {
            this.dscps = dscps;
            return this;
        }
        public java.util.List<Integer> getDscps() {
            return this.dscps;
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
        @NameInMap("TrafficQosPolicyDescription")
        public String trafficQosPolicyDescription;

        @NameInMap("TrafficQosPolicyId")
        public String trafficQosPolicyId;

        @NameInMap("TrafficQosPolicyName")
        public String trafficQosPolicyName;

        @NameInMap("TrafficQosPolicyStatus")
        public String trafficQosPolicyStatus;

        @NameInMap("TrafficQosQueues")
        public java.util.List<ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPoliciesTrafficQosQueues> trafficQosQueues;

        public static ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies self = new ListCenInterRegionTrafficQosPoliciesResponseBodyTrafficQosPolicies();
            return TeaModel.build(map, self);
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

    }

}
