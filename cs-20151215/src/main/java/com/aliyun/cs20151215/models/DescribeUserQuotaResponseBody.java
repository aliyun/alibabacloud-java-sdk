// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeUserQuotaResponseBody extends TeaModel {
    /**
     * <p>The quota for managed clusters. Default value: 20. To request a quota increase beyond the default value, <a href="https://quotas.console.aliyun.com/products/csk/quotas">submit a request on the Quota Center page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("amk_cluster_quota")
    public Long amkClusterQuota;

    /**
     * <p>The quota for ASK clusters. Default value: 20. To request a quota increase beyond the default value, <a href="https://quotas.console.aliyun.com/products/csk/quotas">submit a request on the Quota Center page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ask_cluster_quota")
    public Long askClusterQuota;

    /**
     * <p>The node pool quota per cluster. Default value: 20. To request a quota increase beyond the default value, <a href="https://quotas.console.aliyun.com/products/csk/quotas">submit a request on the Quota Center page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("cluster_nodepool_quota")
    public Long clusterNodepoolQuota;

    /**
     * <p>The total cluster quota per account. Default value: 50. To request a quota increase beyond the default value, <a href="https://quotas.console.aliyun.com/products/csk/quotas">submit a request on the Quota Center page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("cluster_quota")
    public Long clusterQuota;

    @NameInMap("edge_improved_nodepool_quota")
    public DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota edgeImprovedNodepoolQuota;

    /**
     * <p>The node quota per cluster. Default value: 100. To request a quota increase beyond the default value, <a href="https://quotas.console.aliyun.com/products/csk/quotas">submit a request on the Quota Center page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("node_quota")
    public Long nodeQuota;

    /**
     * <p>The new quota items. If this field is returned, the values in this field take precedence.</p>
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
        @NameInMap("bandwidth")
        public Integer bandwidth;

        @NameInMap("count")
        public Integer count;

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
