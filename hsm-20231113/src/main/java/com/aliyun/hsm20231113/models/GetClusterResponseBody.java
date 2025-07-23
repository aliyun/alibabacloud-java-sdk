// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class GetClusterResponseBody extends TeaModel {
    /**
     * <p>The cluster details.</p>
     */
    @NameInMap("Cluster")
    public GetClusterResponseBodyCluster cluster;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterResponseBody self = new GetClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterResponseBody setCluster(GetClusterResponseBodyCluster cluster) {
        this.cluster = cluster;
        return this;
    }
    public GetClusterResponseBodyCluster getCluster() {
        return this.cluster;
    }

    public GetClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClusterResponseBodyClusterInstances extends TeaModel {
        /**
         * <p>The ID of the HSM.</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-cn-g6z3v0uf****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the HSM is a master HSM. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Master")
        public Boolean master;

        /**
         * <p>The ID of the HSM in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeId")
        public Integer nodeId;

        public static GetClusterResponseBodyClusterInstances build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyClusterInstances self = new GetClusterResponseBodyClusterInstances();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyClusterInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetClusterResponseBodyClusterInstances setMaster(Boolean master) {
            this.master = master;
            return this;
        }
        public Boolean getMaster() {
            return this.master;
        }

        public GetClusterResponseBodyClusterInstances setNodeId(Integer nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Integer getNodeId() {
            return this.nodeId;
        }

    }

    public static class GetClusterResponseBodyClusterZones extends TeaModel {
        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf61s651p69bdgmki****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetClusterResponseBodyClusterZones build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyClusterZones self = new GetClusterResponseBodyClusterZones();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyClusterZones setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetClusterResponseBodyClusterZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetClusterResponseBodyCluster extends TeaModel {
        @NameInMap("CertManaged")
        public Boolean certManaged;

        /**
         * <p>The cluster certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIDfTCCAmWgAwIBAgIJAMRqQMr5if66MA0GCSqGSIb3DQEBCwUAMFUxCzAJBgNV
         * BAYTAmNuMQswCQYDVQQIDAJ6ajELMAkGA1UEBwwCaHoxFjAUBgNVBAoMDUFsaWJh
         * YmEgQ2xvdWQxFDA****
         * -----END CERTIFICATE-----</p>
         */
        @NameInMap("ClusterCertificate")
        public String clusterCertificate;

        /**
         * <p>The certificate signing request (CSR) file of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE REQUEST-----\nMIIC5TCCAc0CAQAwgZ8xWTAJBgNVBAYTAlVTMAkGA1UECAwCQ0EwDQYDVQQKDAZD\nYXZpdW0wDQYDVQQLDAZOM0ZJUFMwDgYDVQQHDAdTYW5Kb3NlMBMGA1UdEQwMMTk****
         * -----END CERTIFICATE REQUEST-----</p>
         */
        @NameInMap("ClusterCsr")
        public String clusterCsr;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-p94y1dud9ts****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The cluster mode.</p>
         * <p>2: automatically synchronizes the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ClusterMode")
        public Integer clusterMode;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster_polar_****</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The self-signed certificate of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>----BEGIN CERTIFICATE-----
         * MIIDaTCCAlECAQEwDQYJKoZIhvcNAQELBQAwVTELMAkGA1UEBhMCY24xCzAJBgNV
         * BAgMAnpqMQswCQYDVQQHDAJoejEWMBQGA1UECgwNQWxpYmFiYSBDbG91ZDEUMBIG
         * A1UECwwLU2VjQ2xvdWRIc20wHhcNMjQwNzAzM****
         * -----END CERTIFICATE-----</p>
         */
        @NameInMap("ClusterOwnerCertificate")
        public String clusterOwnerCertificate;

        /**
         * <p>The time when the cluster was created. Unit: milliseconds. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1641275680000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The type of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>jnta</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("EntityCertExpireTime")
        public String entityCertExpireTime;

        /**
         * <p>The HSMs in the cluster.</p>
         */
        @NameInMap("Instances")
        public java.util.List<GetClusterResponseBodyClusterInstances> instances;

        /**
         * <p>The ID of the region in which the cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of hardware security modules (HSMs) in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li>NEW: The cluster is not initialized.</li>
         * <li>INITIALIZED: The cluster is initialized.</li>
         * <li>DELETED: The cluster is deleted.</li>
         * <li>SYNCHRONIZING: The cluster is being synchronized.</li>
         * <li>TO_DELETE: The cluster is pending deletion.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NEW</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbt0fjdm29hofvbo****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The IP address whitelist of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>130.176.XX.XX</p>
         */
        @NameInMap("Whitelist")
        public String whitelist;

        /**
         * <p>The information about the zones in which the cluster is deployed.</p>
         */
        @NameInMap("Zones")
        public java.util.List<GetClusterResponseBodyClusterZones> zones;

        public static GetClusterResponseBodyCluster build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResponseBodyCluster self = new GetClusterResponseBodyCluster();
            return TeaModel.build(map, self);
        }

        public GetClusterResponseBodyCluster setCertManaged(Boolean certManaged) {
            this.certManaged = certManaged;
            return this;
        }
        public Boolean getCertManaged() {
            return this.certManaged;
        }

        public GetClusterResponseBodyCluster setClusterCertificate(String clusterCertificate) {
            this.clusterCertificate = clusterCertificate;
            return this;
        }
        public String getClusterCertificate() {
            return this.clusterCertificate;
        }

        public GetClusterResponseBodyCluster setClusterCsr(String clusterCsr) {
            this.clusterCsr = clusterCsr;
            return this;
        }
        public String getClusterCsr() {
            return this.clusterCsr;
        }

        public GetClusterResponseBodyCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetClusterResponseBodyCluster setClusterMode(Integer clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Integer getClusterMode() {
            return this.clusterMode;
        }

        public GetClusterResponseBodyCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetClusterResponseBodyCluster setClusterOwnerCertificate(String clusterOwnerCertificate) {
            this.clusterOwnerCertificate = clusterOwnerCertificate;
            return this;
        }
        public String getClusterOwnerCertificate() {
            return this.clusterOwnerCertificate;
        }

        public GetClusterResponseBodyCluster setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetClusterResponseBodyCluster setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public GetClusterResponseBodyCluster setEntityCertExpireTime(String entityCertExpireTime) {
            this.entityCertExpireTime = entityCertExpireTime;
            return this;
        }
        public String getEntityCertExpireTime() {
            return this.entityCertExpireTime;
        }

        public GetClusterResponseBodyCluster setInstances(java.util.List<GetClusterResponseBodyClusterInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<GetClusterResponseBodyClusterInstances> getInstances() {
            return this.instances;
        }

        public GetClusterResponseBodyCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetClusterResponseBodyCluster setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetClusterResponseBodyCluster setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetClusterResponseBodyCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetClusterResponseBodyCluster setWhitelist(String whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public String getWhitelist() {
            return this.whitelist;
        }

        public GetClusterResponseBodyCluster setZones(java.util.List<GetClusterResponseBodyClusterZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<GetClusterResponseBodyClusterZones> getZones() {
            return this.zones;
        }

    }

}
