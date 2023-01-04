// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeManagedClustersResponseBody extends TeaModel {
    // Information about the master instance.
    @NameInMap("Clusters")
    public java.util.List<DescribeManagedClustersResponseBodyClusters> clusters;

    // The ID of the request.
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
        // The ID of the master instance.
        @NameInMap("ClusterID")
        public String clusterID;

        // The specification of the master instance. Valid values: - ack.pro.small: ACK Pro.
        @NameInMap("ClusterSpec")
        public String clusterSpec;

        // The type of the master instance.
        @NameInMap("ClusterType")
        public String clusterType;

        // The time when the master instance was created.
        @NameInMap("Created")
        public String created;

        // The current Kubernetes version of the master instance.
        @NameInMap("CurrentVersion")
        public String currentVersion;

        // The original Kubernetes version of the master instance.
        @NameInMap("InitVersion")
        public String initVersion;

        // The name of the master instance.
        @NameInMap("Name")
        public String name;

        // The name of the master instance.
        @NameInMap("Profile")
        public String profile;

        // The region in which the master instance resides.
        @NameInMap("Region")
        public String region;

        // The ID of the resource group.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The status of the associated clusters. Valid values: - initial: The associated clusters are being initialized. - failed: The associated clustersfailed to be created. - running: The associated clusters are running. - inactive: The associated clusters are inactive. - deleting: The associated clusters are being deleted. - deleted: The associated clusters are deleted.
        @NameInMap("State")
        public String state;

        // The time when the master instance was updated.
        @NameInMap("Updated")
        public String updated;

        // The ID of the vSwitch.
        @NameInMap("VSwitchID")
        public String vSwitchID;

        // VPC ID.
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

    public static class DescribeManagedClustersResponseBodyClustersMeshStatus extends TeaModel {
        // Indicates whether the clusters are associated with ASM instances. Valid values: - true: The clusters are associated with ASM instances. - false: The clusters are not associated with ASM instances.
        @NameInMap("InMesh")
        public Boolean inMesh;

        public static DescribeManagedClustersResponseBodyClustersMeshStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeManagedClustersResponseBodyClustersMeshStatus self = new DescribeManagedClustersResponseBodyClustersMeshStatus();
            return TeaModel.build(map, self);
        }

        public DescribeManagedClustersResponseBodyClustersMeshStatus setInMesh(Boolean inMesh) {
            this.inMesh = inMesh;
            return this;
        }
        public Boolean getInMesh() {
            return this.inMesh;
        }

    }

    public static class DescribeManagedClustersResponseBodyClustersStatus extends TeaModel {
        // The status information.
        @NameInMap("Message")
        public String message;

        // The status of the association between the clusters and the master instance. Valid values: - Installing: The clusters are being associated with the master instance. - Successed: The clusters are associated with the master instance. - Failed: The clusters failed to be associated with the master instance. - Deleting: The clusters are being disassociated from the master instance. - Deleted: The clusters are disassociated from the master instance.
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
        // The name of the master instance.
        @NameInMap("Cluster")
        public DescribeManagedClustersResponseBodyClustersCluster cluster;

        // The status of the association between the clusters and Service Mesh (ASM).
        @NameInMap("MeshStatus")
        public DescribeManagedClustersResponseBodyClustersMeshStatus meshStatus;

        // The status of the association between the clusters and the master instance.
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

        public DescribeManagedClustersResponseBodyClusters setMeshStatus(DescribeManagedClustersResponseBodyClustersMeshStatus meshStatus) {
            this.meshStatus = meshStatus;
            return this;
        }
        public DescribeManagedClustersResponseBodyClustersMeshStatus getMeshStatus() {
            return this.meshStatus;
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
