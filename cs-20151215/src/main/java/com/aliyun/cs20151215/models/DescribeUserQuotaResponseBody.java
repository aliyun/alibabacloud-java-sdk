// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeUserQuotaResponseBody extends TeaModel {
    @NameInMap("amk_cluster_quota")
    public Long amkClusterQuota;

    @NameInMap("ask_cluster_quota")
    public Long askClusterQuota;

    @NameInMap("cluster_nodepool_quota")
    public Long clusterNodepoolQuota;

    @NameInMap("cluster_quota")
    public Long clusterQuota;

    @NameInMap("edge_improved_nodepool_quota")
    public DescribeUserQuotaResponseBodyEdgeImprovedNodepoolQuota edgeImprovedNodepoolQuota;

    @NameInMap("node_quota")
    public Long nodeQuota;

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
