// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Cluster")
    public InsertClusterResponseBodyCluster cluster;

    @NameInMap("Code")
    public Integer code;

    public static InsertClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertClusterResponseBody self = new InsertClusterResponseBody();
        return TeaModel.build(map, self);
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

    public static class InsertClusterResponseBodyCluster extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("OversoldFactor")
        public Integer oversoldFactor;

        @NameInMap("NetworkMode")
        public Integer networkMode;

        @NameInMap("IaasProvider")
        public String iaasProvider;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("RegionId")
        public String regionId;

        public static InsertClusterResponseBodyCluster build(java.util.Map<String, ?> map) throws Exception {
            InsertClusterResponseBodyCluster self = new InsertClusterResponseBodyCluster();
            return TeaModel.build(map, self);
        }

        public InsertClusterResponseBodyCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public InsertClusterResponseBodyCluster setOversoldFactor(Integer oversoldFactor) {
            this.oversoldFactor = oversoldFactor;
            return this;
        }
        public Integer getOversoldFactor() {
            return this.oversoldFactor;
        }

        public InsertClusterResponseBodyCluster setNetworkMode(Integer networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public Integer getNetworkMode() {
            return this.networkMode;
        }

        public InsertClusterResponseBodyCluster setIaasProvider(String iaasProvider) {
            this.iaasProvider = iaasProvider;
            return this;
        }
        public String getIaasProvider() {
            return this.iaasProvider;
        }

        public InsertClusterResponseBodyCluster setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public InsertClusterResponseBodyCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public InsertClusterResponseBodyCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public InsertClusterResponseBodyCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
