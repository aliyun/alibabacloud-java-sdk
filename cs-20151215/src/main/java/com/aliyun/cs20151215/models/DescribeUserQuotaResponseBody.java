// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeUserQuotaResponseBody extends TeaModel {
    /**
     * <p>The quota of Container Service for Kubernetes (ACK) managed clusters. Default value: 20. To increase the quota, [go to the Quota Center page to submit a ticket](https://quotas.console.aliyun.com/products/csk/quotas).</p>
     */
    @NameInMap("amk_cluster_quota")
    public Long amkClusterQuota;

    /**
     * <p>The quota of serverless Kubernetes (ASK) clusters. Default value: 20. To increase the quota, [go to the Quota Center page to submit a ticket](https://quotas.console.aliyun.com/products/csk/quotas).</p>
     */
    @NameInMap("ask_cluster_quota")
    public Long askClusterQuota;

    /**
     * <p>The quota of node pools in an ACK cluster. Default value: 20. To increase the quota, [go to the Quota Center page to submit a ticket](https://quotas.console.aliyun.com/products/csk/quotas).</p>
     */
    @NameInMap("cluster_nodepool_quota")
    public Long clusterNodepoolQuota;

    /**
     * <p>The quota of clusters within an Alibaba Cloud account. Default value: 50. To increase the quota, [go to the Quota Center page to submit a ticket](https://quotas.console.aliyun.com/products/csk/quotas).</p>
     */
    @NameInMap("cluster_quota")
    public Long clusterQuota;

    /**
     * <p>The quota of enhanced edge node pools.</p>
     */
    @NameInMap("edge_improved_nodepool_quota")
    public DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota edgeImprovedNodepoolQuota;

    /**
     * <p>The quota of nodes in an ACK cluster. Default value: 100. To increase the quota, [go to the Quota Center page to submit a ticket](https://quotas.console.aliyun.com/products/csk/quotas).</p>
     */
    @NameInMap("node_quota")
    public Long nodeQuota;

    @NameInMap("quotas")
    public java.util.Map<String, QuotasValue> quotas;

    public static DescribeUserQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserQuotaResponseBody self = new DescribeUserQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserQuotaResponseBody setAmkClusterQuota(Long amkClusterQuota) {
        this.amkClusterQuota = amkClusterQuota;
        return this;
    }
    public Long getAmkClusterQuota() {
        return this.amkClusterQuota;
    }

    public DescribeUserQuotaResponseBody setAskClusterQuota(Long askClusterQuota) {
        this.askClusterQuota = askClusterQuota;
        return this;
    }
    public Long getAskClusterQuota() {
        return this.askClusterQuota;
    }

    public DescribeUserQuotaResponseBody setClusterNodepoolQuota(Long clusterNodepoolQuota) {
        this.clusterNodepoolQuota = clusterNodepoolQuota;
        return this;
    }
    public Long getClusterNodepoolQuota() {
        return this.clusterNodepoolQuota;
    }

    public DescribeUserQuotaResponseBody setClusterQuota(Long clusterQuota) {
        this.clusterQuota = clusterQuota;
        return this;
    }
    public Long getClusterQuota() {
        return this.clusterQuota;
    }

    public DescribeUserQuotaResponseBody setEdgeImprovedNodepoolQuota(DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota edgeImprovedNodepoolQuota) {
        this.edgeImprovedNodepoolQuota = edgeImprovedNodepoolQuota;
        return this;
    }
    public DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota getEdgeImprovedNodepoolQuota() {
        return this.edgeImprovedNodepoolQuota;
    }

    public DescribeUserQuotaResponseBody setNodeQuota(Long nodeQuota) {
        this.nodeQuota = nodeQuota;
        return this;
    }
    public Long getNodeQuota() {
        return this.nodeQuota;
    }

    public DescribeUserQuotaResponseBody setQuotas(java.util.Map<String, QuotasValue> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.Map<String, QuotasValue> getQuotas() {
        return this.quotas;
    }

    public static class DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota extends TeaModel {
        /**
         * <p>The maximum bandwidth of each enhanced node pool. Unit: Mbit/s.</p>
         */
        @NameInMap("bandwidth")
        public Integer bandwidth;

        /**
         * <p>The quota of enhanced edge node pools within an Alibaba Cloud account.</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>The maximum subscription duration of an enhanced edge node pool. Unit: months.</p>
         * <br>
         * <p>>  Enhanced node pools use the pay-as-you-go billing method. Therefore, this parameter is not required.</p>
         */
        @NameInMap("period")
        public Integer period;

        public static DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota self = new DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota();
            return TeaModel.build(map, self);
        }

        public DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

    }

}
