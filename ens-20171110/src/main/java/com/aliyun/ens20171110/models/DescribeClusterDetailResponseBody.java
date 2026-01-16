// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1574790082031102</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <strong>example:</strong>
     * <p>eck-11111111</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>apiVersion: v1
     * clusters:</p>
     * <ul>
     * <li>cluster:
     *   certificate-authority-data: x
     *   server: <a href="https://111.111.111.111:6443">https://111.111.111.111:6443</a>
     * name: kubernetes
     * contexts:</li>
     * <li>context:
     *   cluster: kubernetes
     *   user: user
     * name: eck-xxxxx
     * current-context: eck-xxxx
     * kind: Config
     * preferences: {}
     * users:</li>
     * <li>name: user
     * user:
     *   client-certificate-data: x
     *   client-key-data: x</li>
     * </ul>
     */
    @NameInMap("Config")
    public Object config;

    /**
     * <strong>example:</strong>
     * <p>172.20.0.0/16</p>
     */
    @NameInMap("ContainerCidr")
    public String containerCidr;

    @NameInMap("ControlPlaneConfig")
    public DescribeClusterDetailResponseBodyControlPlaneConfig controlPlaneConfig;

    /**
     * <strong>example:</strong>
     * <p>cn-fuzhou-23</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <strong>example:</strong>
     * <p>xxxx.yyy</p>
     */
    @NameInMap("JoinToken")
    public String joinToken;

    /**
     * <strong>example:</strong>
     * <p>1.32.1.aliyunedge.1</p>
     */
    @NameInMap("KubernetesVersion")
    public String kubernetesVersion;

    /**
     * <strong>example:</strong>
     * <p>lb-5snthcyu1x10g7tywj7iu****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <strong>example:</strong>
     * <p>your-cluster-name</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("PodVswitchIds")
    public java.util.List<String> podVswitchIds;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublicAccess")
    public Boolean publicAccess;

    /**
     * <p>Id of the request。</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>172.19.0.0/20</p>
     */
    @NameInMap("ServiceCidr")
    public String serviceCidr;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>n-xxxxxxxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VswitchIds")
    public java.util.List<String> vswitchIds;

    public static DescribeClusterDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDetailResponseBody self = new DescribeClusterDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDetailResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public DescribeClusterDetailResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterDetailResponseBody setConfig(Object config) {
        this.config = config;
        return this;
    }
    public Object getConfig() {
        return this.config;
    }

    public DescribeClusterDetailResponseBody setContainerCidr(String containerCidr) {
        this.containerCidr = containerCidr;
        return this;
    }
    public String getContainerCidr() {
        return this.containerCidr;
    }

    public DescribeClusterDetailResponseBody setControlPlaneConfig(DescribeClusterDetailResponseBodyControlPlaneConfig controlPlaneConfig) {
        this.controlPlaneConfig = controlPlaneConfig;
        return this;
    }
    public DescribeClusterDetailResponseBodyControlPlaneConfig getControlPlaneConfig() {
        return this.controlPlaneConfig;
    }

    public DescribeClusterDetailResponseBody setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeClusterDetailResponseBody setJoinToken(String joinToken) {
        this.joinToken = joinToken;
        return this;
    }
    public String getJoinToken() {
        return this.joinToken;
    }

    public DescribeClusterDetailResponseBody setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public DescribeClusterDetailResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeClusterDetailResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeClusterDetailResponseBody setPodVswitchIds(java.util.List<String> podVswitchIds) {
        this.podVswitchIds = podVswitchIds;
        return this;
    }
    public java.util.List<String> getPodVswitchIds() {
        return this.podVswitchIds;
    }

    public DescribeClusterDetailResponseBody setPublicAccess(Boolean publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }
    public Boolean getPublicAccess() {
        return this.publicAccess;
    }

    public DescribeClusterDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterDetailResponseBody setServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }
    public String getServiceCidr() {
        return this.serviceCidr;
    }

    public DescribeClusterDetailResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeClusterDetailResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeClusterDetailResponseBody setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public static class DescribeClusterDetailResponseBodyControlPlaneConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("ContainerRuntime")
        public String containerRuntime;

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

        /**
         * <strong>example:</strong>
         * <p>30000-32767</p>
         */
        @NameInMap("NodePortRange")
        public String nodePortRange;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Size")
        public Long size;

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

        public static DescribeClusterDetailResponseBodyControlPlaneConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyControlPlaneConfig self = new DescribeClusterDetailResponseBodyControlPlaneConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setContainerRuntime(String containerRuntime) {
            this.containerRuntime = containerRuntime;
            return this;
        }
        public String getContainerRuntime() {
            return this.containerRuntime;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setNodePortRange(String nodePortRange) {
            this.nodePortRange = nodePortRange;
            return this;
        }
        public String getNodePortRange() {
            return this.nodePortRange;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeClusterDetailResponseBodyControlPlaneConfig setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

}
