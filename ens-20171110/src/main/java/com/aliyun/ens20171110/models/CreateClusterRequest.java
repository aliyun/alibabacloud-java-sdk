// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The version of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>1.18.8</p>
     */
    @NameInMap("ClusterVersion")
    public String clusterVersion;

    /**
     * <strong>example:</strong>
     * <p>172.20.0.0/16</p>
     */
    @NameInMap("ContainerCidr")
    public String containerCidr;

    @NameInMap("ControlPlaneConfig")
    public CreateClusterRequestControlPlaneConfig controlPlaneConfig;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <strong>example:</strong>
     * <p>1.32.1</p>
     */
    @NameInMap("KubernetesVersion")
    public String kubernetesVersion;

    /**
     * <strong>example:</strong>
     * <p>lb-wz9t256gqa3vbouk****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>mycluster-1</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("PodVswitchIds")
    public java.util.List<String> podVswitchIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublicAccess")
    public Boolean publicAccess;

    /**
     * <strong>example:</strong>
     * <p>172.19.0.0/20</p>
     */
    @NameInMap("ServiceCidr")
    public String serviceCidr;

    /**
     * <strong>example:</strong>
     * <p>vpc-xxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;vsw-xxx&quot;, &quot;vsw-yyy&quot;]</p>
     */
    @NameInMap("VswitchIds")
    public java.util.List<String> vswitchIds;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterRequest setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }
    public String getClusterVersion() {
        return this.clusterVersion;
    }

    public CreateClusterRequest setContainerCidr(String containerCidr) {
        this.containerCidr = containerCidr;
        return this;
    }
    public String getContainerCidr() {
        return this.containerCidr;
    }

    public CreateClusterRequest setControlPlaneConfig(CreateClusterRequestControlPlaneConfig controlPlaneConfig) {
        this.controlPlaneConfig = controlPlaneConfig;
        return this;
    }
    public CreateClusterRequestControlPlaneConfig getControlPlaneConfig() {
        return this.controlPlaneConfig;
    }

    public CreateClusterRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateClusterRequest setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public CreateClusterRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateClusterRequest setPodVswitchIds(java.util.List<String> podVswitchIds) {
        this.podVswitchIds = podVswitchIds;
        return this;
    }
    public java.util.List<String> getPodVswitchIds() {
        return this.podVswitchIds;
    }

    public CreateClusterRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public CreateClusterRequest setPublicAccess(Boolean publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }
    public Boolean getPublicAccess() {
        return this.publicAccess;
    }

    public CreateClusterRequest setServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }
    public String getServiceCidr() {
        return this.serviceCidr;
    }

    public CreateClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateClusterRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public static class CreateClusterRequestControlPlaneConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>m-5ul335umat4e2y9ynwi84p3f9</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>ens.esk.sn1.medium</p>
         */
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("LoginPassword")
        public String loginPassword;

        /**
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("NodePortRange")
        public String nodePortRange;

        /**
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("Runtime")
        public String runtime;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("SystemDiskSize")
        public Long systemDiskSize;

        public static CreateClusterRequestControlPlaneConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestControlPlaneConfig self = new CreateClusterRequestControlPlaneConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestControlPlaneConfig setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateClusterRequestControlPlaneConfig setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public CreateClusterRequestControlPlaneConfig setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public CreateClusterRequestControlPlaneConfig setNodePortRange(String nodePortRange) {
            this.nodePortRange = nodePortRange;
            return this;
        }
        public String getNodePortRange() {
            return this.nodePortRange;
        }

        public CreateClusterRequestControlPlaneConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public CreateClusterRequestControlPlaneConfig setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateClusterRequestControlPlaneConfig setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public CreateClusterRequestControlPlaneConfig setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

}
