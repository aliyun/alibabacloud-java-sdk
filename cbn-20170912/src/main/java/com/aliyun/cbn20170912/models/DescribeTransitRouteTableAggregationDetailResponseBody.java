// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouteTableAggregationDetailResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The configuration of the aggregate route.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeTransitRouteTableAggregationDetailResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeTransitRouteTableAggregationDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouteTableAggregationDetailResponseBody self = new DescribeTransitRouteTableAggregationDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouteTableAggregationDetailResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeTransitRouteTableAggregationDetailResponseBody setData(java.util.List<DescribeTransitRouteTableAggregationDetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeTransitRouteTableAggregationDetailResponseBodyData> getData() {
        return this.data;
    }

    public DescribeTransitRouteTableAggregationDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransitRouteTableAggregationDetailResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeTransitRouteTableAggregationDetailResponseBodyData extends TeaModel {
        /**
         * <p>The error message returned if the configuration of the aggregate route fails.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the virtual private cloud (VPC) for which the aggregate route is configured.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the aggregate route. Valid values:</p>
         * <br>
         * <p>*   **Configured**: The aggregate route is advertised to the VPC.</p>
         * <p>*   **Configuring**: The aggregate route is being advertised.</p>
         * <p>*   **ConfigFailed**: The aggregate route failed to be advertised.</p>
         * <p>*   **PartialConfigured**: Failed to advertise the aggregate route to some VPCs.</p>
         * <p>*   **Deleting**: The aggregate route is being deleted.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeTransitRouteTableAggregationDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouteTableAggregationDetailResponseBodyData self = new DescribeTransitRouteTableAggregationDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouteTableAggregationDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTransitRouteTableAggregationDetailResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeTransitRouteTableAggregationDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
