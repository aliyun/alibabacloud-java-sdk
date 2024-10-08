// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeUserQuotaResponseBody extends TeaModel {
    /**
     * <p>The quota of Container Service for Kubernetes (ACK) managed clusters. Default value: 20. If the default quota limit is reached, submit an application in the <a href="https://quotas.console.aliyun.com/products/csk/quotas">Quota Center console</a> to increase the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("amk_cluster_quota")
    public Long amkClusterQuota;

    /**
     * <p>The quota of ACK Serverless clusters. Default value: 20. If the default quota limit is reached, submit an application in the <a href="https://quotas.console.aliyun.com/products/csk/quotas">Quota Center console</a> to increase the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ask_cluster_quota")
    public Long askClusterQuota;

    /**
     * <p>The quota of node pools in an ACK cluster. Default value: 20. If the default quota limit is reached, submit an application in the <a href="https://quotas.console.aliyun.com/products/csk/quotas">Quota Center console</a> to increase the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("cluster_nodepool_quota")
    public Long clusterNodepoolQuota;

    /**
     * <p>The quota of clusters that belong to an Alibaba Cloud account. Default value: 50. If the default quota limit is reached, submit an application in the <a href="https://quotas.console.aliyun.com/products/csk/quotas">Quota Center console</a> to increase the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("cluster_quota")
    public Long clusterQuota;

    /**
     * <p>This parameter is discontinued.</p>
     * <p>The quotas of enhanced edge node pools.</p>
     */
    @NameInMap("edge_improved_nodepool_quota")
    public DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota edgeImprovedNodepoolQuota;

    /**
     * <p>The quota of nodes in an ACK cluster. Default value: 100. If the default quota limit is reached, submit an application in the <a href="https://quotas.console.aliyun.com/products/csk/quotas">Quota Center console</a> to increase the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("node_quota")
    public Long nodeQuota;

    /**
     * <p>Information about the new quota.</p>
     */
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
         * <p>This parameter is discontinued.</p>
         * <p>The maximum bandwidth of each enhanced edge node pool. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("bandwidth")
        public Integer bandwidth;

        /**
         * <p>This parameter is discontinued.</p>
         * <p>The maximum number of enhanced edge node pools that you can create within an Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>This parameter is discontinued.</p>
         * <p>The maximum subscription duration of an enhanced edge node pool. Unit: months.</p>
         * <blockquote>
         * <p> You are charged for enhanced edge node pools based on the pay-as-you-go billing method. Therefore, you can ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
