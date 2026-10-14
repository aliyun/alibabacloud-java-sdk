// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateClusterShrinkRequest extends TeaModel {
    /**
     * <p>Kubernetes or ManagedKubernetes. The former indicates an ECK cluster, and the latter indicates a serverless VC.
     * Must be used together with the profile parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The pod network CIDR block. The CIDR block must be a valid private CIDR block, which includes the following CIDR blocks and their subnets: 10.0.0.0/8, 172.16-31.0.0/12-16, and 192.168.0.0/16. The CIDR block cannot overlap with the CIDR blocks used by the VPC or existing Kubernetes clusters in the VPC. You cannot modify the CIDR block after the cluster is created.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.0.0/16</p>
     */
    @NameInMap("ContainerCidr")
    public String containerCidr;

    /**
     * <p>The control plane configuration.</p>
     */
    @NameInMap("ControlPlaneConfig")
    public String controlPlaneConfigShrink;

    /**
     * <p>The ENS Region ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The cluster version, which is consistent with the Kubernetes community baseline version. Select the latest version. If you do not specify this parameter, the latest version is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1.32.1</p>
     */
    @NameInMap("KubernetesVersion")
    public String kubernetesVersion;

    /**
     * <p>The ID of the CLB instance used for API Server access. If you specify this parameter, automatic creation of a CLB instance for the API Server is skipped.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-wz9t256gqa3vbouk****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>mycluster-1</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>Each pod vSwitch corresponds to a worker node vSwitch. The zone of the pod vSwitch must be the same as that of the worker node vSwitch. If you do not specify this parameter, vswitch_ids is used by default.</p>
     */
    @NameInMap("PodVswitchIds")
    public String podVswitchIdsShrink;

    /**
     * <p>Default or Serverless. The former indicates an ECK cluster, and the latter indicates a serverless VC.
     * Must be used together with the cluster_type parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <p>Specifies whether to enable public network access. The API Server is exposed through an EIP to enable public access to the cluster.
     * ● true: Enable public network access.
     * ● false: Disable public network access. If you select this option, you cannot access the cluster API Server from the Internet.
     * Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublicAccess")
    public Boolean publicAccess;

    /**
     * <p>The service network CIDR block. Valid ranges: 10.0.0.0/16-24, 172.16-31.0.0/16-24, and 192.168.0.0/16-24. The CIDR block cannot overlap with the VPC CIDR block 10.1.0.0/21 or the CIDR blocks used by existing Kubernetes clusters in the VPC. You cannot modify the CIDR block after the cluster is created.</p>
     * 
     * <strong>example:</strong>
     * <p>172.19.0.0/20</p>
     */
    @NameInMap("ServiceCidr")
    public String serviceCidr;

    /**
     * <p>The VPC used by the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The IDs of the vSwitches for cluster nodes. The ENS Region of the vswitch_ids must be the same as the ens_region_id value.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vsw-xxx&quot;, &quot;vsw-yyy&quot;]</p>
     */
    @NameInMap("VswitchIds")
    public String vswitchIdsShrink;

    public static CreateClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterShrinkRequest self = new CreateClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterShrinkRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterShrinkRequest setContainerCidr(String containerCidr) {
        this.containerCidr = containerCidr;
        return this;
    }
    public String getContainerCidr() {
        return this.containerCidr;
    }

    public CreateClusterShrinkRequest setControlPlaneConfigShrink(String controlPlaneConfigShrink) {
        this.controlPlaneConfigShrink = controlPlaneConfigShrink;
        return this;
    }
    public String getControlPlaneConfigShrink() {
        return this.controlPlaneConfigShrink;
    }

    public CreateClusterShrinkRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateClusterShrinkRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public CreateClusterShrinkRequest setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public CreateClusterShrinkRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateClusterShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateClusterShrinkRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CreateClusterShrinkRequest setPodVswitchIdsShrink(String podVswitchIdsShrink) {
        this.podVswitchIdsShrink = podVswitchIdsShrink;
        return this;
    }
    public String getPodVswitchIdsShrink() {
        return this.podVswitchIdsShrink;
    }

    public CreateClusterShrinkRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public CreateClusterShrinkRequest setPublicAccess(Boolean publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }
    public Boolean getPublicAccess() {
        return this.publicAccess;
    }

    public CreateClusterShrinkRequest setServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }
    public String getServiceCidr() {
        return this.serviceCidr;
    }

    public CreateClusterShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateClusterShrinkRequest setVswitchIdsShrink(String vswitchIdsShrink) {
        this.vswitchIdsShrink = vswitchIdsShrink;
        return this;
    }
    public String getVswitchIdsShrink() {
        return this.vswitchIdsShrink;
    }

}
