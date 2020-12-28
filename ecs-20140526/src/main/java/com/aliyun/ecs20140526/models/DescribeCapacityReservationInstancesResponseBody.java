// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationInstancesResponseBody extends TeaModel {
    @NameInMap("CapacityReservationItem")
    public java.util.List<DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem> capacityReservationItem;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static DescribeCapacityReservationInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationInstancesResponseBody self = new DescribeCapacityReservationInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationInstancesResponseBody setCapacityReservationItem(java.util.List<DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem> capacityReservationItem) {
        this.capacityReservationItem = capacityReservationItem;
        return this;
    }
    public java.util.List<DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem> getCapacityReservationItem() {
        return this.capacityReservationItem;
    }

    public DescribeCapacityReservationInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeCapacityReservationInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem self = new DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationInstancesResponseBodyCapacityReservationItem setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
