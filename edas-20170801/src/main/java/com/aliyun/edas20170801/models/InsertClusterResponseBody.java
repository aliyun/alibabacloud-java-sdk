// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterResponseBody extends TeaModel {
    /**
     * <p>The created cluster entity.</p>
     */
    @NameInMap("Cluster")
    public InsertClusterResponseBodyCluster cluster;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b197-40ab-9155-****</p>
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
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>8705ad13-5d86-47fc-b68f-257b59ed****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>****_product_test2</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li>2: ECS cluster.</li>
         * <li>3: EDAS built-in Kubernetes cluster.</li>
         * <li>5: Kubernetes cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ClusterType")
        public Integer clusterType;

        /**
         * <p>The provider.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("IaasProvider")
        public String iaasProvider;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><p>1: Classic network.</p>
         * </li>
         * <li><p>2: VPC.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NetworkMode")
        public Integer networkMode;

        /**
         * <p><strong>[Deprecated]</strong> The CPU overselling ratio for Docker clusters. Valid values:</p>
         * <ul>
         * <li><p>2: 1:2 ratio.</p>
         * </li>
         * <li><p>4: 1:4 ratio.</p>
         * </li>
         * <li><p>8: 1:8 ratio.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OversoldFactor")
        public Integer oversoldFactor;

        /**
         * <p>The region ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zef6ob8mrlzv8x3q****</p>
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
