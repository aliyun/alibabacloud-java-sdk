// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClustersV1ResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information about clusters.</p>
     */
    @NameInMap("Clusters")
    public java.util.List<DescribeClustersV1ResponseBodyClusters> clusters;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClustersV1ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersV1ResponseBody self = new DescribeClustersV1ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClustersV1ResponseBody setClusters(java.util.List<DescribeClustersV1ResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeClustersV1ResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeClustersV1ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClustersV1ResponseBodyClustersControlPlaneConfig extends TeaModel {
        /**
         * <p>The runtime type used by the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("ContainerRuntime")
        public String containerRuntime;

        /**
         * <p>The ID of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-68be8cb9f71fhyvjekxa23qsf</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ens.sn1.medium</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        /**
         * <p>The node port range.</p>
         * 
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("NodePortRange")
        public String nodePortRange;

        /**
         * <p>The number of control plane nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The system disk type of the node. Valid value: local_ssd, cloud_ssd, cloud_efficiency, and local_hdd.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The size of the system disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SystemDiskSize")
        public Long systemDiskSize;

        public static DescribeClustersV1ResponseBodyClustersControlPlaneConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersV1ResponseBodyClustersControlPlaneConfig self = new DescribeClustersV1ResponseBodyClustersControlPlaneConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClustersV1ResponseBodyClustersControlPlaneConfig setContainerRuntime(String containerRuntime) {
            this.containerRuntime = containerRuntime;
            return this;
        }
        public String getContainerRuntime() {
            return this.containerRuntime;
        }

        public DescribeClustersV1ResponseBodyClustersControlPlaneConfig setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClustersV1ResponseBodyClustersControlPlaneConfig setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeClustersV1ResponseBodyClustersControlPlaneConfig setNodePortRange(String nodePortRange) {
            this.nodePortRange = nodePortRange;
            return this;
        }
        public String getNodePortRange() {
            return this.nodePortRange;
        }

        public DescribeClustersV1ResponseBodyClustersControlPlaneConfig setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeClustersV1ResponseBodyClustersControlPlaneConfig setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeClustersV1ResponseBodyClustersControlPlaneConfig setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

    public static class DescribeClustersV1ResponseBodyClusters extends TeaModel {
        /**
         * <p>The user IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>1375383353108460</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The cluster instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eck-xxxxxxx</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The kubeconfig file of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;kind&quot;: &quot;Config&quot;,
         *         &quot;apiVersion&quot;: &quot;v1&quot;,
         *         &quot;preferences&quot;: {},
         *         &quot;clusters&quot;: [
         *           {
         *             &quot;name&quot;: &quot;kubernetes&quot;,
         *             &quot;cluster&quot;: {
         *               &quot;server&quot;: &quot;<a href="https://000.000.000.000:6443">https://000.000.000.000:6443</a>&quot;,
         *               &quot;certificate-authority-data&quot;: &quot;&quot;
         *             }
         *           }
         *         ],
         *         &quot;users&quot;: [
         *           {
         *             &quot;name&quot;: &quot;kubernetes-admin&quot;,
         *             &quot;user&quot;: {
         *               &quot;client-certificate-data&quot;: &quot;&quot;,
         *               &quot;client-key-data&quot;: &quot;&quot;
         *             }
         *           }
         *         ],
         *         &quot;contexts&quot;: [
         *           {
         *             &quot;name&quot;: &quot;kubernetes-admin@kubernetes&quot;,
         *             &quot;context&quot;: {
         *               &quot;cluster&quot;: &quot;kubernetes&quot;,
         *               &quot;user&quot;: &quot;kubernetes-admin&quot;
         *             }
         *           }
         *         ],
         *         &quot;current-context&quot;: &quot;kubernetes-admin@kubernetes&quot;
         *       }</p>
         */
        @NameInMap("Config")
        public Object config;

        /**
         * <p>The pod CIDR block. You can specify 10.0.0.0/8, 172.16-31.0.0/12-16, 192.168.0.0/16, or their subnets as the pod CIDR block. The pod CIDR block cannot overlap with the CIDR block of the VPC in which the cluster is deployed and the CIDR blocks of existing clusters in the VPC. You cannot modify the pod CIDR block after you create the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("ContainerCidr")
        public String containerCidr;

        /**
         * <p>Control plane configuration.</p>
         */
        @NameInMap("ControlPlaneConfig")
        public DescribeClustersV1ResponseBodyClustersControlPlaneConfig controlPlaneConfig;

        /**
         * <p>The ID of the ENS node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-55</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The cluster access authentication token.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxxxx.yyyyyyy</p>
         */
        @NameInMap("JoinToken")
        public String joinToken;

        /**
         * <p>The Kubernetes version of the cluster. The Kubernetes versions supported are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not specify this parameter, the latest Kubernetes version is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1.31.9-aliyunedge.1</p>
         */
        @NameInMap("KubernetesVersion")
        public String kubernetesVersion;

        /**
         * <p>The ID of the ALB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-58dngw0fyimzzvwljfec7hy0z</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the monitoring object.</p>
         * 
         * <strong>example:</strong>
         * <p>test-eck-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>For each vSwitch that allocates IP addresses to worker nodes, you must select a vSwitch in the same zone to allocate IP addresses to pods. If you do not specify this parameter, vswitch_ids is used by default.</p>
         */
        @NameInMap("PodVswitchIds")
        public java.util.List<String> podVswitchIds;

        /**
         * <p>Specifies whether to enable Internet access for the application. You can use an elastic IP address (EIP) to expose the API server. This way, you can access the cluster over the Internet. Valid values: true: enables Internet access for the application. false: disables Internet access to the API server of the cluster. If you set the value to false, the API server cannot be accessed over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PublicAccess")
        public Boolean publicAccess;

        /**
         * <p>Valid values: 10.0.0.0/16-24, 172.16-31.0.0/16-24, and 192.168.0.0/16-24. The Service CIDR block cannot overlap with the VPC CIDR block 10.1.0.0/21 or the CIDR blocks of existing ACK clusters in the VPC. You cannot change the Service CIDR block after you create the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("ServiceCidr")
        public String serviceCidr;

        @NameInMap("State")
        public String state;

        /**
         * <p>The VPC of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5wsgr3xeolb2ist303wp3cscp</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>the id of the vswitch to which the cluster node belongs. The ENS region of the vswitch_ids service must be the same as that of the ens_region_id.</p>
         */
        @NameInMap("VswitchIds")
        public java.util.List<String> vswitchIds;

        public static DescribeClustersV1ResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersV1ResponseBodyClusters self = new DescribeClustersV1ResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersV1ResponseBodyClusters setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeClustersV1ResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClustersV1ResponseBodyClusters setConfig(Object config) {
            this.config = config;
            return this;
        }
        public Object getConfig() {
            return this.config;
        }

        public DescribeClustersV1ResponseBodyClusters setContainerCidr(String containerCidr) {
            this.containerCidr = containerCidr;
            return this;
        }
        public String getContainerCidr() {
            return this.containerCidr;
        }

        public DescribeClustersV1ResponseBodyClusters setControlPlaneConfig(DescribeClustersV1ResponseBodyClustersControlPlaneConfig controlPlaneConfig) {
            this.controlPlaneConfig = controlPlaneConfig;
            return this;
        }
        public DescribeClustersV1ResponseBodyClustersControlPlaneConfig getControlPlaneConfig() {
            return this.controlPlaneConfig;
        }

        public DescribeClustersV1ResponseBodyClusters setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeClustersV1ResponseBodyClusters setJoinToken(String joinToken) {
            this.joinToken = joinToken;
            return this;
        }
        public String getJoinToken() {
            return this.joinToken;
        }

        public DescribeClustersV1ResponseBodyClusters setKubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }
        public String getKubernetesVersion() {
            return this.kubernetesVersion;
        }

        public DescribeClustersV1ResponseBodyClusters setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeClustersV1ResponseBodyClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClustersV1ResponseBodyClusters setPodVswitchIds(java.util.List<String> podVswitchIds) {
            this.podVswitchIds = podVswitchIds;
            return this;
        }
        public java.util.List<String> getPodVswitchIds() {
            return this.podVswitchIds;
        }

        public DescribeClustersV1ResponseBodyClusters setPublicAccess(Boolean publicAccess) {
            this.publicAccess = publicAccess;
            return this;
        }
        public Boolean getPublicAccess() {
            return this.publicAccess;
        }

        public DescribeClustersV1ResponseBodyClusters setServiceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        public DescribeClustersV1ResponseBodyClusters setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClustersV1ResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClustersV1ResponseBodyClusters setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

}
