// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>The language type of the returned information:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Billing method, including PREPAY (Subscription) and POSTPAY (Pay-As-You-Go).</p>
     * <p>This parameter is ignored for the Serverless edition.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Engine specifications, with the following values:</p>
     * <p>[Professional Edition] </p>
     * <ul>
     * <li><code>MSE_SC_2_4_60_c</code>: 2 cores, 4GB</li>
     * <li><code>MSE_SC_1_2_60_c</code>: 1 core, 2GB</li>
     * <li><code>MSE_SC_4_8_60_c</code>: 4 cores, 8GB</li>
     * <li><code>MSE_SC_8_16_60_c</code>: 8 cores, 16GB</li>
     * <li><code>MSE_SC_16_32_60_c</code>: 16 cores, 32GB</li>
     * </ul>
     * <p>[Developer Edition] </p>
     * <ul>
     * <li><code>MSE_SC_1_2_60_c</code>: 1 core, 2GB</li>
     * <li><code>MSE_SC_2_4_60_c</code>: 2 cores, 4GB</li>
     * </ul>
     * <p>[Serverless Edition]</p>
     * <p>Ignore this parameter, or you can fill in <code>MSE_SC_SERVERLESS</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MSE_SC_2_4_60_c</p>
     */
    @NameInMap("ClusterSpecification")
    public String clusterSpecification;

    /**
     * <p>Cluster type, including ZooKeeper, Nacos-Ans.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Nacos-Ans</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>Cluster version, with the following values:</p>
     * <p>[Professional Edition] </p>
     * <ul>
     * <li><code>NACOS_2_0_0</code>: indicates Nacos 2.x.x version.</li>
     * <li><code>ZooKeeper_3_8_0</code>: indicates ZooKeeper 3.8.x version.</li>
     * </ul>
     * <p>[Developer Edition] </p>
     * <ul>
     * <li><code>NACOS_2_0_0</code>: indicates Nacos 2.x version.</li>
     * <li><code>ZooKeeper_3_8_0</code>: indicates ZooKeeper 3.8.x version.</li>
     * </ul>
     * <p>[Serverless Edition]</p>
     * <ul>
     * <li><code>NACOS_2_0_0</code>: indicates Nacos 2.x version.</li>
     * <li><code>ZooKeeper_3_8_0</code>: indicates ZooKeeper 3.8.x version.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NACOS_2_0_0</p>
     */
    @NameInMap("ClusterVersion")
    public String clusterVersion;

    /**
     * <p>Network access type, <code>slb</code> or <code>single_eni</code>; some regions\&quot; Developer Edition only support the <code>single_eni</code> type.</p>
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>No longer in use</p>
     * 
     * <strong>example:</strong>
     * <p>alicloud-disk-ssd</p>
     */
    @NameInMap("DiskType")
    @Deprecated
    public String diskType;

    /**
     * <p>Valid when <code>ConnectionType</code> is <code>single_eni</code>, indicating whether to enable public network access (Elastic IP).</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("EipEnabled")
    public Boolean eipEnabled;

    /**
     * <p>Number of instance nodes, with a range limit of 1 to 9.</p>
     * <p>[Professional Edition] </p>
     * <ul>
     * <li>The number of instances must be 3 or more and must be an odd number.</li>
     * </ul>
     * <p>[Developer Edition] </p>
     * <ul>
     * <li>The number of instances can only be 1.</li>
     * </ul>
     * <p>[Serverless Edition]</p>
     * <p>Ignore this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>Custom instance name</p>
     * 
     * <strong>example:</strong>
     * <p>tanshuyingtest001</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Required unless under special circumstances, with the following values:</p>
     * <ul>
     * <li><code>mse_pro</code>: indicates Professional Edition.</li>
     * <li><code>mse_dev</code>: indicates Developer Edition.</li>
     * <li><code>mse_serverless</code>: indicates Serverless Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mse_pro</p>
     */
    @NameInMap("MseVersion")
    public String mseVersion;

    /**
     * <p>Network type, with the following values:</p>
     * <ul>
     * <li><code>privatenet</code>: indicates a private network.</li>
     * <li><code>pubnet</code>: indicates a public network.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>privatenet</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>No longer in use</p>
     * 
     * <strong>example:</strong>
     * <p>slb.s1.small</p>
     */
    @NameInMap("PrivateSlbSpecification")
    @Deprecated
    public String privateSlbSpecification;

    /**
     * <p>Valid when <code>ConnectionType</code> is <code>slb</code>. 0 indicates no public network access SLB creation, and values above 1 indicate a fixed bandwidth for public network access SLB; unit: Mbps.</p>
     * <p>Value range: 0~5000.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PubNetworkFlow")
    public String pubNetworkFlow;

    /**
     * <p>No longer in use</p>
     * 
     * <strong>example:</strong>
     * <p>slb.s1.small</p>
     */
    @NameInMap("PubSlbSpecification")
    @Deprecated
    public String pubSlbSpecification;

    /**
     * <p>The region where the cluster is located, including but not limited to the following regions:</p>
     * <ul>
     * <li><code>cn-hangzhou</code>: Hangzhou</li>
     * <li><code>cn-beijing</code>: Beijing</li>
     * <li><code>cn-shanghai</code>: Shanghai</li>
     * <li><code>cn-zhangjiakou</code>: Zhangjiakou</li>
     * <li><code>cn-shenzhen</code>: Shenzhen</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Extended request parameters, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>Resource group ID. For more details about the resource group, see <a href="https://help.aliyun.com/document_detail/457230.html">Basic Information of Resource Group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzcqmoay3dlyq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Valid when <code>ConnectionType</code> is <code>single_eni</code>, indicating the security group type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("SecurityGroupType")
    public String securityGroupType;

    /**
     * <p>List of tags to be added. Contains up to 20 items.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateClusterRequestTag> tag;

    /**
     * <p>Switch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp17opt4v18sto39k****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1t50e045b5g7i3p****</p>
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

    @Deprecated
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

    @Deprecated
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

    @Deprecated
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
         * <p>Tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>prd</p>
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
