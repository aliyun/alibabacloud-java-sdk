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
     * <p>The billing method. Valid values: PREPAY and POSTPAY.</p>
     * <br>
     * <p>Ignore this parameter for serverless instances.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The engine specifications. Valid values:</p>
     * <br>
     * <p>[Professional Edition]</p>
     * <br>
     * <p>*   `MSE_SC_2_4_60_c`: 2 vCPUs and 4 GB of memory</p>
     * <p>*   `MSE_SC_1_2_60_c`: 1 vCPU and 2 GB of memory</p>
     * <p>*   `MSE_SC_4_8_60_c`: 4 vCPUs and 8 GB of memory</p>
     * <p>*   `MSE_SC_8_16_60_c`: 8 vCPUs and 16 GB of memory</p>
     * <p>*   `MSE_SC_16_32_60_c`: 16 vCPUs and 32 GB of memory</p>
     * <br>
     * <p>[Developer Edition]</p>
     * <br>
     * <p>*   `MSE_SC_1_2_60_c`: 1 vCPU and 2 GB of memory</p>
     * <p>*   `MSE_SC_2_4_60_c`: 2 vCPUs and 4 GB of memory</p>
     * <br>
     * <p>[Serverless Edition]</p>
     * <br>
     * <p>Ignore this parameter or set this parameter to `MSE_SC_SERVERLESS`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterSpecification")
    public String clusterSpecification;

    /**
     * <p>The type of the instance. Valid values: ZooKeeper and Nacos-Ans.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The engine version of the instance. Valid values:</p>
     * <br>
     * <p>[Professional Edition]</p>
     * <br>
     * <p>*   `NACOS_2_0_0`</p>
     * <p>*   `ZooKeeper_3_8_0`</p>
     * <br>
     * <p>[Developer Edition]</p>
     * <br>
     * <p>*   `NACOS_2_0_0`</p>
     * <p>*   `ZooKeeper_3_8_0`</p>
     * <br>
     * <p>[Serverless Edition]</p>
     * <br>
     * <p>*   `NACOS_2_0_0`</p>
     * <p>*   `ZooKeeper_3_8_0`</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterVersion")
    public String clusterVersion;

    /**
     * <p>The network connection type. Valid values: `slb` or `single_eni`. For instances of the Developer Edition in some regions, only the value `single_eni` is supported.</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>This parameter is obsolete.</p>
     */
    @NameInMap("DiskType")
    @Deprecated
    public String diskType;

    /**
     * <p>Specifies whether to enable Internet access (Elastic IP Address) if ConnectionType is set to `single_eni`.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("EipEnabled")
    public Boolean eipEnabled;

    /**
     * <p>The number of nodes in the instance. Valid values: 1 to 9.</p>
     * <br>
     * <p>[Professional Edition]</p>
     * <br>
     * <p>*   The value must be greater than or equal to 3 and must be an odd number.</p>
     * <br>
     * <p>[Developer Edition]</p>
     * <br>
     * <p>*   The value must be 1.</p>
     * <br>
     * <p>[Serverless Edition]</p>
     * <br>
     * <p>Ignore this parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>The custom name of the instance.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Configure this parameter unless otherwise specified. Valid values:</p>
     * <br>
     * <p>*   `mse_pro`: Professional Edition</p>
     * <p>*   `mse_dev`: Developer Edition</p>
     * <p>*   `mse_dev`: Serverless Edition</p>
     */
    @NameInMap("MseVersion")
    public String mseVersion;

    /**
     * <p>The network type of the MSE instance. Valid values:</p>
     * <br>
     * <p>*   `privatenet`: VPC</p>
     * <p>*   `pubnet`: Internet</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>This parameter is obsolete.</p>
     */
    @NameInMap("PrivateSlbSpecification")
    @Deprecated
    public String privateSlbSpecification;

    /**
     * <p>This parameter is valid only if the ConnectionType parameter is set to `slb`. The value 0 indicates that the Server Load Balancer (SLB) instance is not connected over the Internet. A value greater than 1 indicates the fixed bandwidth that is used to access the SLB instance over the Internet. Unit: Mbit/s.</p>
     * <br>
     * <p>Valid values: 0 to 5000.</p>
     */
    @NameInMap("PubNetworkFlow")
    public String pubNetworkFlow;

    /**
     * <p>This parameter is obsolete.</p>
     */
    @NameInMap("PubSlbSpecification")
    @Deprecated
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
     * <p>The ID of the resource group. For the details of resource groups, see [View basic information of a resource group](https://help.aliyun.com/document_detail/457230.html).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the security group to which the instance belongs. This parameter is valid only if the ConnectionType parameter is set to `single_eni`.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   enterprise</p>
     * <p>*   normal</p>
     */
    @NameInMap("SecurityGroupType")
    public String securityGroupType;

    /**
     * <p>The tags to add to the resource. You can specify up to 20 tags.</p>
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

    public CreateClusterRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
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

    public CreateClusterRequest setEipEnabled(Boolean eipEnabled) {
        this.eipEnabled = eipEnabled;
        return this;
    }
    public Boolean getEipEnabled() {
        return this.eipEnabled;
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

    public CreateClusterRequest setSecurityGroupType(String securityGroupType) {
        this.securityGroupType = securityGroupType;
        return this;
    }
    public String getSecurityGroupType() {
        return this.securityGroupType;
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
         * <p>The key of tag N to add to the resource.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource.</p>
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
