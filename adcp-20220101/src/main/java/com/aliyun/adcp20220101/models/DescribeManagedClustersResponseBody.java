// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeManagedClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public java.util.List<DescribeManagedClustersResponseBodyClusters> clusters;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeManagedClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeManagedClustersResponseBody self = new DescribeManagedClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeManagedClustersResponseBody setClusters(java.util.List<DescribeManagedClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeManagedClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeManagedClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeManagedClustersResponseBodyClustersCluster extends TeaModel {
        @NameInMap("ClusterID")
        public String clusterID;

        @NameInMap("ClusterSpec")
        public String clusterSpec;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("Created")
        public String created;

        @NameInMap("CurrentVersion")
        public String currentVersion;

        @NameInMap("InitVersion")
        public String initVersion;

        @NameInMap("Name")
        public String name;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("State")
        public String state;

        @NameInMap("Updated")
        public String updated;

        @NameInMap("VSwitchID")
        public String vSwitchID;

        @NameInMap("VpcID")
        public String vpcID;

        public static DescribeManagedClustersResponseBodyClustersCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeManagedClustersResponseBodyClustersCluster self = new DescribeManagedClustersResponseBodyClustersCluster();
            return TeaModel.build(map, self);
        }

        public DescribeManagedClustersResponseBodyClustersCluster setClusterID(String clusterID) {
            this.clusterID = clusterID;
            return this;
        }
        public String getClusterID() {
            return this.clusterID;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setClusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setInitVersion(String initVersion) {
            this.initVersion = initVersion;
            return this;
        }
        public String getInitVersion() {
            return this.initVersion;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setVSwitchID(String vSwitchID) {
            this.vSwitchID = vSwitchID;
            return this;
        }
        public String getVSwitchID() {
            return this.vSwitchID;
        }

        public DescribeManagedClustersResponseBodyClustersCluster setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

    }

    public static class DescribeManagedClustersResponseBodyClustersStatus extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("State")
        public String state;

        public static DescribeManagedClustersResponseBodyClustersStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeManagedClustersResponseBodyClustersStatus self = new DescribeManagedClustersResponseBodyClustersStatus();
            return TeaModel.build(map, self);
        }

        public DescribeManagedClustersResponseBodyClustersStatus setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeManagedClustersResponseBodyClustersStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeManagedClustersResponseBodyClusters extends TeaModel {
        @NameInMap("Cluster")
        public DescribeManagedClustersResponseBodyClustersCluster cluster;

        @NameInMap("Status")
        public DescribeManagedClustersResponseBodyClustersStatus status;

        public static DescribeManagedClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeManagedClustersResponseBodyClusters self = new DescribeManagedClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeManagedClustersResponseBodyClusters setCluster(DescribeManagedClustersResponseBodyClustersCluster cluster) {
            this.cluster = cluster;
            return this;
        }
        public DescribeManagedClustersResponseBodyClustersCluster getCluster() {
            return this.cluster;
        }

        public DescribeManagedClustersResponseBodyClusters setStatus(DescribeManagedClustersResponseBodyClustersStatus status) {
            this.status = status;
            return this;
        }
        public DescribeManagedClustersResponseBodyClustersStatus getStatus() {
            return this.status;
        }

    }

}
