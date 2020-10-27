// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("MaxResults")
    @Validation(required = true)
    public Integer maxResults;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("CapacityReservationItem")
    @Validation(required = true)
    public DescribeCapacityReservationInstancesResponseCapacityReservationItem capacityReservationItem;

    public static DescribeCapacityReservationInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationInstancesResponse self = new DescribeCapacityReservationInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCapacityReservationInstancesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCapacityReservationInstancesResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCapacityReservationInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCapacityReservationInstancesResponse setCapacityReservationItem(DescribeCapacityReservationInstancesResponseCapacityReservationItem capacityReservationItem) {
        this.capacityReservationItem = capacityReservationItem;
        return this;
    }
    public DescribeCapacityReservationInstancesResponseCapacityReservationItem getCapacityReservationItem() {
        return this.capacityReservationItem;
    }

    public static class DescribeCapacityReservationInstancesResponseCapacityReservationItemInstanceIdSet extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        public static DescribeCapacityReservationInstancesResponseCapacityReservationItemInstanceIdSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationInstancesResponseCapacityReservationItemInstanceIdSet self = new DescribeCapacityReservationInstancesResponseCapacityReservationItemInstanceIdSet();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationInstancesResponseCapacityReservationItemInstanceIdSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeCapacityReservationInstancesResponseCapacityReservationItem extends TeaModel {
        @NameInMap("InstanceIdSet")
        @Validation(required = true)
        public java.util.List<DescribeCapacityReservationInstancesResponseCapacityReservationItemInstanceIdSet> instanceIdSet;

        public static DescribeCapacityReservationInstancesResponseCapacityReservationItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationInstancesResponseCapacityReservationItem self = new DescribeCapacityReservationInstancesResponseCapacityReservationItem();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationInstancesResponseCapacityReservationItem setInstanceIdSet(java.util.List<DescribeCapacityReservationInstancesResponseCapacityReservationItemInstanceIdSet> instanceIdSet) {
            this.instanceIdSet = instanceIdSet;
            return this;
        }
        public java.util.List<DescribeCapacityReservationInstancesResponseCapacityReservationItemInstanceIdSet> getInstanceIdSet() {
            return this.instanceIdSet;
        }

    }

}
