// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClustersV1ResponseBody extends TeaModel {
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
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        @NameInMap("ContainerRuntime")
        public String containerRuntime;

        /**
         * <strong>example:</strong>
         * <p>m-68be8cb9f71fhyvjekxa23qsf</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>ens.sn1.medium</p>
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
         * <p>5</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
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
         * <strong>example:</strong>
         * <p>1375383353108460</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <strong>example:</strong>
         * <p>eck-xxxxxxx</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
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
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("ContainerCidr")
        public String containerCidr;

        @NameInMap("ControlPlaneConfig")
        public DescribeClustersV1ResponseBodyClustersControlPlaneConfig controlPlaneConfig;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-55</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <strong>example:</strong>
         * <p>xxxxxxxxxx.yyyyyyy</p>
         */
        @NameInMap("JoinToken")
        public String joinToken;

        /**
         * <strong>example:</strong>
         * <p>1.31.9-aliyunedge.1</p>
         */
        @NameInMap("KubernetesVersion")
        public String kubernetesVersion;

        /**
         * <strong>example:</strong>
         * <p>lb-58dngw0fyimzzvwljfec7hy0z</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <strong>example:</strong>
         * <p>test-eck-name</p>
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
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("ServiceCidr")
        public String serviceCidr;

        /**
         * <strong>example:</strong>
         * <p>n-5wsgr3xeolb2ist303wp3cscp</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

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
