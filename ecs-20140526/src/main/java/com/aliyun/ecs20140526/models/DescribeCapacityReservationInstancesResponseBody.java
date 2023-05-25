// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationInstancesResponseBody extends TeaModel {
    /**
     * <p>Details about the instances that match the capacity reservation.</p>
     */
    @NameInMap("CapacityReservationItem")
    public DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem capacityReservationItem;

    /**
     * <p>The maximum number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCapacityReservationInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationInstancesResponseBody self = new DescribeCapacityReservationInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationInstancesResponseBody setCapacityReservationItem(DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem capacityReservationItem) {
        this.capacityReservationItem = capacityReservationItem;
        return this;
    }
    public DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem getCapacityReservationItem() {
        return this.capacityReservationItem;
    }

    public DescribeCapacityReservationInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCapacityReservationInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCapacityReservationInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCapacityReservationInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCapacityReservationInstancesResponseBodyCapacityReservationItemInstanceIdSet extends TeaModel {
        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeCapacityReservationInstancesResponseBodyCapacityReservationItemInstanceIdSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationInstancesResponseBodyCapacityReservationItemInstanceIdSet self = new DescribeCapacityReservationInstancesResponseBodyCapacityReservationItemInstanceIdSet();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationInstancesResponseBodyCapacityReservationItemInstanceIdSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem extends TeaModel {
        @NameInMap("InstanceIdSet")
        public java.util.List<DescribeCapacityReservationInstancesResponseBodyCapacityReservationItemInstanceIdSet> instanceIdSet;

        public static DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem self = new DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem setInstanceIdSet(java.util.List<DescribeCapacityReservationInstancesResponseBodyCapacityReservationItemInstanceIdSet> instanceIdSet) {
            this.instanceIdSet = instanceIdSet;
            return this;
        }
        public java.util.List<DescribeCapacityReservationInstancesResponseBodyCapacityReservationItemInstanceIdSet> getInstanceIdSet() {
            return this.instanceIdSet;
        }

    }

}
