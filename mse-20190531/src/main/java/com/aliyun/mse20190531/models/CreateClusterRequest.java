// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The engine specifications. Valid values:
    // 
    // \[Professional Edition]
    // 
    // *   `MSE_SC_2_4_60_c`: 2 CPU cores and 4 GB of memory
    // *   `MSE_SC_1_2_60_c`: 1 CPU core and 2 GB of memory
    // *   `MSE_SC_4_8_60_c`: 4 CPU cores and 8 GB of memory
    // *   `MSE_SC_8_16_60_c`: 8 CPU cores and 16 GB of memory
    // *   `MSE_SC_16_32_60_c`: 16 CPU cores and 32 GB of memory
    // 
    // \[Developer Edition]
    // 
    // *   `MSE_SC_1_2_60_c`: 1 CPU core and 2 GB of memory
    // *   `MSE_SC_2_4_60_c`: 2 CPU cores and 4 GB of memory
    @NameInMap("ClusterSpecification")
    public String clusterSpecification;

    // The type of the instance. Valid values: ZooKeeper and Nacos-Ans.
    @NameInMap("ClusterType")
    public String clusterType;

    // The engine version of the instance. Valid values:
    // 
    // \[Professional Edition]
    // 
    // *   `NACOS_2_0_0`: Nacos 2.0.0
    // *   `ZooKeeper_3_8_0`: ZooKeeper 3.8.0
    // 
    // \[Developer Edition]
    // 
    // *   `NACOS_2_0_0`: Nacos 2.0.0
    // *   `ZooKeeper_3_8_0`: ZooKeeper 3.8.0
    @NameInMap("ClusterVersion")
    public String clusterVersion;

    // The network connection type. Valid values:
    // 
    // *   slb
    // *   eni
    @NameInMap("ConnectionType")
    public String connectionType;

    // The disk type. Valid values:
    // 
    // *   alicloud-disk-ssd
    // *   alicloud-disk-essd-pl1
    @NameInMap("DiskType")
    public String diskType;

    // The number of nodes in the instance. Valid values: 1 to 9.
    // 
    // \[Professional Edition]
    // 
    // *   The number of nodes in an instance is greater than or equal to 3 and must be an odd number.
    // 
    // \[Developer Edition]
    // 
    // *   Only one node can be deployed for an instance.
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    // The name of the instance.
    @NameInMap("InstanceName")
    public String instanceName;

    // Set this parameter unless otherwise specified. Valid values:
    // 
    // *   `mse_pro`: Professional Edition
    // *   `mse_dev`: Developer Edition
    @NameInMap("MseVersion")
    public String mseVersion;

    // The network type of the instance. Valid values:
    // 
    // *   `privatenet`: VPC
    // *   `pubnet`: Internet
    @NameInMap("NetType")
    public String netType;

    // The specifications of the internal-facing SLB instance. Valid values:
    // 
    // *   `slb.s1.small`
    // *   `slb.s3.medium`
    @NameInMap("PrivateSlbSpecification")
    public String privateSlbSpecification;

    // The public bandwidth. Unit: Mbit/s.\
    // Valid values: 0 to 5000. The value 0 indicates no access to the Internet.
    @NameInMap("PubNetworkFlow")
    public String pubNetworkFlow;

    // The specifications of the Internet-facing Server Load Balancer (SLB) instance. Valid values:
    // 
    // *   `slb.s1.small`
    // *   `slb.s3.medium`
    @NameInMap("PubSlbSpecification")
    public String pubSlbSpecification;

    // The region where the MSE instance resides. Examples:
    // 
    // *   `cn-hangzhou`: China (Hangzhou)
    // *   `cn-beijing`: China (Beijing)
    // *   `cn-shanghai`: China (Shanghai)
    // *   `cn-zhangjiakou`: China (Zhangjiakou)
    // *   `cn-shenzhen`: China (Shenzhen)
    @NameInMap("Region")
    public String region;

    // The extended request parameter in the JSON format.
    @NameInMap("RequestPars")
    public String requestPars;

    // The ID of the resource group. For more information about resource groups, see the topic "View basic information of a resource group."
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The list of the tags that you want to add.
    @NameInMap("Tag")
    public java.util.List<CreateClusterRequestTag> tag;

    // The ID of the vSwitch.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // VPC ID.
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
        // The key of a tag.
        @NameInMap("Key")
        public String key;

        // The value of a tag.
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
