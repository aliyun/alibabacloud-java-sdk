// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterResponseBody extends TeaModel {
    /**
     * <p>The information about the cluster that was created.</p>
     */
    @NameInMap("Cluster")
    public InsertClusterResponseBodyCluster cluster;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InsertClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertClusterResponseBody self = new InsertClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertClusterResponseBody setCluster(InsertClusterResponseBodyCluster cluster) {
        this.cluster = cluster;
        return this;
    }
    public InsertClusterResponseBodyCluster getCluster() {
        return this.cluster;
    }

    public InsertClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InsertClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InsertClusterResponseBodyCluster extends TeaModel {
        /**
         * <p>The ID of cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <br>
         * <p>*   2: ECS cluster</p>
         * <p>*   3: self-managed Kubernetes cluster in EDAS</p>
         * <p>*   5: Kubernetes cluster</p>
         */
        @NameInMap("ClusterType")
        public Integer clusterType;

        /**
         * <p>The provider of the IaaS resources that are used in the cluster.</p>
         */
        @NameInMap("IaasProvider")
        public String iaasProvider;

        /**
         * <p>The network type of the cluster. Valid values:</p>
         * <br>
         * <p>*   1: classic network</p>
         * <p>*   2\. VPC</p>
         */
        @NameInMap("NetworkMode")
        public Integer networkMode;

        /**
         * <p>**This parameter is deprecated.** The CPU overcommit ratio supported by the Docker cluster. Valid values:</p>
         * <br>
         * <p>*   2: 1:2, which means that resources are overcommitted by 1:2.</p>
         * <p>*   4: 1:4, which means that resources are overcommitted by 1:4.</p>
         * <p>*   8: 1:8, which means that resources are overcommitted by 1:8.</p>
         */
        @NameInMap("OversoldFactor")
        public Integer oversoldFactor;

        /**
         * <p>The ID of the region in which the cluster resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static InsertClusterResponseBodyCluster build(java.util.Map<String, ?> map) throws Exception {
            InsertClusterResponseBodyCluster self = new InsertClusterResponseBodyCluster();
            return TeaModel.build(map, self);
        }

        public InsertClusterResponseBodyCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public InsertClusterResponseBodyCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public InsertClusterResponseBodyCluster setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public InsertClusterResponseBodyCluster setIaasProvider(String iaasProvider) {
            this.iaasProvider = iaasProvider;
            return this;
        }
        public String getIaasProvider() {
            return this.iaasProvider;
        }

        public InsertClusterResponseBodyCluster setNetworkMode(Integer networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public Integer getNetworkMode() {
            return this.networkMode;
        }

        public InsertClusterResponseBodyCluster setOversoldFactor(Integer oversoldFactor) {
            this.oversoldFactor = oversoldFactor;
            return this;
        }
        public Integer getOversoldFactor() {
            return this.oversoldFactor;
        }

        public InsertClusterResponseBodyCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public InsertClusterResponseBodyCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
