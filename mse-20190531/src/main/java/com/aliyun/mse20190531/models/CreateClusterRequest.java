// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The engine specifications. Valid values:</p>
     * <br>
     * <p>\[Professional Edition]</p>
     * <br>
     * <p>*   `MSE_SC_2_4_60_c`: 2 CPU cores and 4 GB of memory</p>
     * <p>*   `MSE_SC_1_2_60_c`: 1 CPU core and 2 GB of memory</p>
     * <p>*   `MSE_SC_4_8_60_c`: 4 CPU cores and 8 GB of memory</p>
     * <p>*   `MSE_SC_8_16_60_c`: 8 CPU cores and 16 GB of memory</p>
     * <p>*   `MSE_SC_16_32_60_c`: 16 CPU cores and 32 GB of memory</p>
     * <br>
     * <p>\[Developer Edition]</p>
     * <br>
     * <p>*   `MSE_SC_1_2_60_c`: 1 CPU core and 2 GB of memory</p>
     * <p>*   `MSE_SC_2_4_60_c`: 2 CPU cores and 4 GB of memory</p>
     */
    @NameInMap("ClusterSpecification")
    public String clusterSpecification;

    /**
     * <p>The type of the instance. Valid values: ZooKeeper and Nacos-Ans.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The engine version of the instance. Valid values:</p>
     * <br>
     * <p>\[Professional version]</p>
     * <br>
     * <p>*   `NACOS_2_0_0`: Nacos 2.0.0</p>
     * <p>*   `ZooKeeper_3_8_0`: ZooKeeper 3.8.0</p>
     * <br>
     * <p>\[Developer Edition]</p>
     * <br>
     * <p>*   `NACOS_2_0_0`: Nacos 2.0.0</p>
     * <p>*   `ZooKeeper_3_8_0`: ZooKeeper 3.8.0</p>
     */
    @NameInMap("ClusterVersion")
    public String clusterVersion;

    /**
     * <p>The network connection type. Valid values:</p>
     * <br>
     * <p>*   slb</p>
     * <p>*   eni</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>The disk type of the MSE instance. Valid values:</p>
     * <br>
     * <p>*   alicloud-disk-ssd</p>
     * <p>*   alicloud-disk-essd-pl1</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The number of nodes in the instance. Valid values: 1 to 9.</p>
     * <br>
     * <p>\[Professional Edition]</p>
     * <br>
     * <p>*   The number of nodes in an instance is greater than or equal to 3 and must be an odd number.</p>
     * <br>
     * <p>\[Developer Edition]</p>
     * <br>
     * <p>*   Only one node can be deployed for an instance.</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>The name of the MSE instance.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Configure this parameter unless otherwise specified. Valid values:</p>
     * <br>
     * <p>*   `mse_pro`: Professional Edition</p>
     * <p>*   `mse_dev`: Developer Edition</p>
     */
    @NameInMap("MseVersion")
    public String mseVersion;

    /**
     * <p>The network type of the MSE instance. Valid values:</p>
     * <br>
     * <p>*   `privatenet`: VPC</p>
     * <p>*   `pubnet`: Internet</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>The specifications of the internal-facing SLB instance. Valid values:</p>
     * <br>
     * <p>*   `slb.s1.small`</p>
     * <p>*   `slb.s3.medium`</p>
     */
    @NameInMap("PrivateSlbSpecification")
    public String privateSlbSpecification;

    /**
     * <p>The public bandwidth. Unit: Mbit/s.\</p>
     * <p>Valid values: 0 to 5000. The value 0 indicates no access to the Internet.</p>
     */
    @NameInMap("PubNetworkFlow")
    public String pubNetworkFlow;

    /**
     * <p>The specifications of the Internet-facing Server Load Balancer (SLB) instance. Valid values:</p>
     * <br>
     * <p>*   `slb.s1.small`</p>
     * <p>*   `slb.s3.medium`</p>
     */
    @NameInMap("PubSlbSpecification")
    public String pubSlbSpecification;

    /**
     * <p>The region where the instance resides. Examples:</p>
     * <br>
     * <p>*   `cn-hangzhou`: China (Hangzhou)</p>
     * <p>*   `cn-beijing`: China (Beijing)</p>
     * <p>*   `cn-shanghai`: China (Shanghai)</p>
     * <p>*   `cn-zhangjiakou`: China (Zhangjiakou)</p>
     * <p>*   `cn-shenzhen`: China (Shenzhen)</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The ID of the resource group. For more information, see [View basic information of a resource group](~~457230~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of the tags that you want to add.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateClusterRequestTag> tag;

    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateClusterRequest setClusterSpecification(String clusterSpecification) {
        this.clusterSpecification = clusterSpecification;
        return this;
    }
    public String getClusterSpecification() {
        return this.clusterSpecification;
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

    public CreateClusterRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public CreateClusterRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreateClusterRequest setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public CreateClusterRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateClusterRequest setMseVersion(String mseVersion) {
        this.mseVersion = mseVersion;
        return this;
    }
    public String getMseVersion() {
        return this.mseVersion;
    }

    public CreateClusterRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public CreateClusterRequest setPrivateSlbSpecification(String privateSlbSpecification) {
        this.privateSlbSpecification = privateSlbSpecification;
        return this;
    }
    public String getPrivateSlbSpecification() {
        return this.privateSlbSpecification;
    }

    public CreateClusterRequest setPubNetworkFlow(String pubNetworkFlow) {
        this.pubNetworkFlow = pubNetworkFlow;
        return this;
    }
    public String getPubNetworkFlow() {
        return this.pubNetworkFlow;
    }

    public CreateClusterRequest setPubSlbSpecification(String pubSlbSpecification) {
        this.pubSlbSpecification = pubSlbSpecification;
        return this;
    }
    public String getPubSlbSpecification() {
        return this.pubSlbSpecification;
    }

    public CreateClusterRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateClusterRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public CreateClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClusterRequest setTag(java.util.List<CreateClusterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateClusterRequestTag> getTag() {
        return this.tag;
    }

    public CreateClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateClusterRequestTag extends TeaModel {
        /**
         * <p>The key of a tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateClusterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestTag self = new CreateClusterRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClusterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
