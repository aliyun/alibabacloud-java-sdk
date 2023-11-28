// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAckClustersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListAckClustersResponseBodyResult> result;

    public static ListAckClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAckClustersResponseBody self = new ListAckClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAckClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAckClustersResponseBody setResult(java.util.List<ListAckClustersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAckClustersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListAckClustersResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of cluster.</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <p>The type of the cluster. The value is fixed as ManagedKubernetes.</p>
         */
        @NameInMap("clusterType")
        public String clusterType;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the VPC to which the cluster belongs.</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListAckClustersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAckClustersResponseBodyResult self = new ListAckClustersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAckClustersResponseBodyResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListAckClustersResponseBodyResult setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListAckClustersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAckClustersResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
