// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouteTableAggregationDetailResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The configuration details of the aggregate route.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeTransitRouteTableAggregationDetailResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C2EE7A8-74D4-4081-8236-CEBDE3BBCF50</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The message returned if the configuration of the aggregate route fails.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the VPC instance for which the aggregate route is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-6eh7fp9hdqa2wv85t****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The configuration status of the aggregate route.</p>
         * <ul>
         * <li><p><strong>Configured</strong>: The aggregate route is advertised to the VPC instance.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: The aggregate route is being advertised.</p>
         * </li>
         * <li><p><strong>ConfigFailed</strong>: The aggregate route failed to be advertised.</p>
         * </li>
         * <li><p><strong>PartialConfigured</strong>: The aggregate route was partially advertised.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The aggregate route is being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Configured</p>
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
