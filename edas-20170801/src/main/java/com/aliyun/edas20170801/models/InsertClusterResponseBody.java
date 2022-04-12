// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterResponseBody extends TeaModel {
    @NameInMap("Cluster")
    public InsertClusterResponseBodyCluster cluster;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("IaasProvider")
        public String iaasProvider;

        @NameInMap("NetworkMode")
        public Integer networkMode;

        @NameInMap("OversoldFactor")
        public Integer oversoldFactor;

        @NameInMap("RegionId")
        public String regionId;

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
