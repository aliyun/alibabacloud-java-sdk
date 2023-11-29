// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLindormInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the vSwitch that is specified for the zone for the coordinate node of the instance. The vSwitch must be deployed in the zone specified by the ArbiterZoneId parameter. **This parameter is required if you want to create a multi-zone instance**.</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>The ID of the zone for the coordinate node of the instance. **This parameter is required if you want to create a multi-zone instance**.</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>The architecture of the instance. Valid values:</p>
     * <br>
     * <p>*   **1.0**: The instance that you want to create is a single-zone instance.</p>
     * <p>*   **2.0**: The instance that you want to create is a multi-zone instance.</p>
     * <br>
     * <p>By default, the value of this parameter is 1.0. To create a multi-zone instance, set this parameter to 2.0. **This parameter is required if you want to create a multi-zone instance**.</p>
     */
    @NameInMap("ArchVersion")
    public String archVersion;

    /**
     * <p>The cold storage capacity of the instance. By default, if you leave this parameter unspecified, cold storage is not enabled for the instance. Unit: GB. Valid values: **800** to **1000000**.</p>
     */
    @NameInMap("ColdStorage")
    public Integer coldStorage;

    /**
     * <p>The storage capacity of the disk of a single core node. Valid values: 400 to 64000. Unit: GB. **This parameter is required if you want to create a multi-zone instance**.</p>
     */
    @NameInMap("CoreSingleStorage")
    public Integer coreSingleStorage;

    /**
     * <p>The specification of the nodes in the instance if you set DiskCategory to local_ssd_pro or local_hdd_pro.</p>
     * <br>
     * <p>When DiskCategory is set to local_ssd_pro, you can set this parameter to the following values:</p>
     * <br>
     * <p>*   **lindorm.i2.xlarge**: Each node has 4 dedicated CPU cores and 32 GB of dedicated memory.</p>
     * <p>*   **lindorm.i2.2xlarge**: Each node has 8 dedicated CPU cores and 64 GB of dedicated memory.</p>
     * <p>*   **lindorm.i2.4xlarge**: Each node has 16 dedicated CPU cores and 128 GB of dedicated memory.</p>
     * <p>*   **lindorm.i2.8xlarge**: Each node has 32 dedicated CPU cores and 256 GB of dedicated memory.</p>
     * <br>
     * <p>When DiskCategory is set to local_hdd_pro, you can set this parameter to the following values:</p>
     * <br>
     * <p>*   **lindorm.d1.2xlarge**: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</p>
     * <p>*   **lindorm.d1.4xlarge**: Each node has 16 dedicated CPU cores and 64 GB of dedicated memory.</p>
     * <p>*   **lindorm.d1.6xlarge**: Each node has 24 dedicated CPU cores and 96 GB of dedicated memory.</p>
     */
    @NameInMap("CoreSpec")
    public String coreSpec;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **cloud_efficiency**: This instance uses the Standard type of storage.</p>
     * <p>*   **cloud_ssd**: This instance uses the Performance type of storage.</p>
     * <p>*   **capacity_cloud_storage**: This instance uses the Capacity type of storage.</p>
     * <p>*   **local_ssd_pro**: This instance uses local SSDs.</p>
     * <p>*   **local_hdd_pro**: This instance uses local HDDs.</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The subscription period of the instance. The valid values of this parameter depend on the value of the PricingCycle parameter.</p>
     * <br>
     * <p>*   If PricingCycle is set to **Month**, set this parameter to an integer that ranges from **1** to **9**.</p>
     * <p>*   If PricingCycle is set to **Year**, set this parameter to an integer that ranges from **1** to **3**.</p>
     * <br>
     * <p>> This parameter is available and required when the PayType parameter is set to **PREPAY**.</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The number of LindormDFS nodes in the instance. The valid values of this parameter depend on the value of the PayType parameter.</p>
     * <br>
     * <p>*   If the PayType parameter is set to **PREPAY**, set this parameter to an integer that ranges from **0** to **60**.</p>
     * <p>*   If the PayType parameter is set to **POSTPAY**, set this parameter to an integer that ranges from **0** to **8**.</p>
     */
    @NameInMap("FilestoreNum")
    public Integer filestoreNum;

    /**
     * <p>The specification of LindormDFS nodes in the instance. Set the value of this parameter to **lindorm.c.xlarge**, which indicates that each node has 4 dedicated CPU cores and 8 GB of dedicated memory.</p>
     */
    @NameInMap("FilestoreSpec")
    public String filestoreSpec;

    /**
     * <p>The name of the instance that you want to create.</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    /**
     * <p>The storage capacity of the instance you want to create. Unit: GB.</p>
     */
    @NameInMap("InstanceStorage")
    public String instanceStorage;

    /**
     * <p>The number of LindormTable nodes in the instance. The valid values of this parameter depend on the value of the PayType parameter.</p>
     * <br>
     * <p>*   If the PayType parameter is set to **PREPAY**, set this parameter to an integer that ranges from **0** to **90**.</p>
     * <p>*   If the PayType parameter is set to **POSTPAY**, set this parameter to an integer that ranges from **0** to **400**.</p>
     * <br>
     * <p>**This parameter is required if you want to create a multi-zone instance**.  The valid values of this parameter range from 4 to 400 if you want to create a multi-zone instance.</p>
     */
    @NameInMap("LindormNum")
    public Integer lindormNum;

    /**
     * <p>The specification of LindormTable nodes in the instance. Valid values:</p>
     * <br>
     * <p>*   **lindorm.c.xlarge**: Each node has 4 dedicated CPU cores and 8 GB of dedicated memory.</p>
     * <p>*   **lindorm.c.2xlarge**: Each node has 8 dedicated CPU cores and 16 GB of dedicated memory.</p>
     * <p>*   **lindorm.c.4xlarge**: Each node has 16 dedicated CPU cores and 32 GB of dedicated memory.</p>
     * <p>*   **lindorm.c.8xlarge**: Each node has 32 dedicated CPU cores and 64 GB of dedicated memory.</p>
     */
    @NameInMap("LindormSpec")
    public String lindormSpec;

    /**
     * <p>The disk type of the log nodes. Valid values:</p>
     * <br>
     * <p>*   **cloud_efficiency**: This instance uses the Standard type of storage.</p>
     * <p>*   **cloud_ssd**: This instance uses the Performance type of storage.</p>
     * <br>
     * <p>**This parameter is required if you want to create a multi-zone instance**.</p>
     */
    @NameInMap("LogDiskCategory")
    public String logDiskCategory;

    /**
     * <p>The number of the log nodes. Valid values: 4 to 400. **This parameter is required if you want to create a multi-zone instance**.</p>
     */
    @NameInMap("LogNum")
    public Integer logNum;

    /**
     * <p>The storage capacity of the disk of a single log node. Valid values: 400 to 64000. Unit: GB. **This parameter is required if you want to create a multi-zone instance**.</p>
     */
    @NameInMap("LogSingleStorage")
    public Integer logSingleStorage;

    /**
     * <p>The type of the log nodes. Valid values:</p>
     * <br>
     * <p>*   **lindorm.sn1.xlarge**: Each node has 4 dedicated CPU cores and 8 GB of dedicated memory.</p>
     * <p>*   **lindorm.sn1.2xlarge**: Each node has 8 dedicated CPU cores and 16 GB of dedicated memory.</p>
     * <br>
     * <p>**This parameter is required if you want to create a multi-zone instance**.</p>
     */
    @NameInMap("LogSpec")
    public String logSpec;

    /**
     * <p>The combinations of zones that are available for the multi-zone instance. You can go to the purchase page of Lindorm to view the supported zone combinations.</p>
     * <br>
     * <p>*   **ap-southeast-5abc-aliyun**: Zone A+B+C in the Indonesia (Jakarta) region.</p>
     * <p>*   **cn-hangzhou-ehi-aliyun**: Zone E+H+I in the China (Hangzhou) region.</p>
     * <p>*   **cn-beijing-acd-aliyun**: Zone A+C+D in the China (Beijing) region.</p>
     * <p>*   **ap-southeast-1-abc-aliyun**: Zone A+B+C in the Singapore region.</p>
     * <p>*   **cn-zhangjiakou-abc-aliyun**: Zone A+B+C in the China (Zhangjiakou) region.</p>
     * <p>*   **cn-shanghai-efg-aliyun**: Zone E+F+G in the China (Shanghai) region.</p>
     * <p>*   **cn-shanghai-abd-aliyun**: Zone A+B+D in the China (Shanghai) region.</p>
     * <p>*   **cn-hangzhou-bef-aliyun**: Zone B+E+F in the China (Hangzhou) region.</p>
     * <p>*   **cn-hangzhou-bce-aliyun**: Zone B+C+E in the China (Hangzhou) region.</p>
     * <p>*   **cn-beijing-fgh-aliyun**: Zone F+G+H in the China (Beijing) region.</p>
     * <p>*   **cn-shenzhen-abc-aliyun**: Zone A+B+C in the China (Shenzhen) region.</p>
     * <br>
     * <p>**This parameter is required if you want to create a multi-zone instance**.</p>
     */
    @NameInMap("MultiZoneCombination")
    public String multiZoneCombination;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the instance you want to create. Valid values:</p>
     * <br>
     * <p>*   **PREPAY**: subscription.</p>
     * <p>*   **POSTPAY**: pay-as-you-go.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The period based on which you are charged for the instance. Valid values:</p>
     * <br>
     * <p>*   **Month**: You are charged for the instance on a monthly basis.</p>
     * <p>*   **Year**: You are charged for the instance on a yearly basis.</p>
     * <br>
     * <p>> This parameter is available and required when the PayType parameter is set to **PREPAY**.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the vSwitch that is specified for the secondary zone of the instance. The vSwitch must be deployed in the zone specified by the StandbyZoneId parameter. **This parameter is required if you want to create a multi-zone instance**.</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>The ID of the region in which you want to create the instance. You can call the [DescribeRegions](~~426062~~) operation to query the region in which you can create the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Lindorm instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The number of LindormSearch nodes in the instance. Valid values: integers from **0** to **60**.</p>
     */
    @NameInMap("SolrNum")
    public Integer solrNum;

    /**
     * <p>The specification of the LindormSearch nodes in the instance. Valid values:</p>
     * <br>
     * <p>*   **lindorm.g.xlarge**: Each node has 4 dedicated CPU cores and 16 GB of dedicated memory.</p>
     * <p>*   **lindorm.g.2xlarge**: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</p>
     * <p>*   **lindorm.g.4xlarge**: Each node has 16 dedicated CPU cores and 64 GB of dedicated memory.</p>
     * <p>*   **lindorm.g.8xlarge**: Each node has 32 dedicated CPU cores and 128 GB of dedicated memory.</p>
     */
    @NameInMap("SolrSpec")
    public String solrSpec;

    /**
     * <p>The ID of the vSwitch that is specified for the secondary zone of the instance. The vSwitch must be deployed in the zone specified by the StandbyZoneId parameter. **This parameter is required if you want to create a multi-zone instance**.</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>The ID of the secondary zone of the instance. **This parameter is required if you want to create a multi-zone instance**.</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The number of LindormStream nodes in the instance. Valid values: integers from **0** to **60**.</p>
     */
    @NameInMap("StreamNum")
    public Integer streamNum;

    /**
     * <p>The specification of the LindormStream nodes in the instance. Valid values:</p>
     * <br>
     * <p>*   **lindorm.g.xlarge**: Each node has 4 dedicated CPU cores and 16 GB of dedicated memory.</p>
     * <p>*   **lindorm.g.2xlarge**: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</p>
     * <p>*   **lindorm.g.4xlarge**: Each node has 16 dedicated CPU cores and 64 GB of dedicated memory.</p>
     * <p>*   **lindorm.g.8xlarge**: Each node has 32 dedicated CPU cores and 128 GB of dedicated memory.</p>
     */
    @NameInMap("StreamSpec")
    public String streamSpec;

    /**
     * <p>The number of the LindormTSDB nodes in the instance. The valid values of this parameter depend on the value of the PayType parameter.</p>
     * <br>
     * <p>*   If the PayType parameter is set to **PREPAY**, set this parameter to an integer that ranges from **0** to **24**.</p>
     * <p>*   If the PayType parameter is set to **POSTPAY**, set this parameter to an integer that ranges from **0** to **32**.</p>
     */
    @NameInMap("TsdbNum")
    public Integer tsdbNum;

    /**
     * <p>The specification of the LindormTSDB nodes in the instance. Valid values:</p>
     * <br>
     * <p>*   **lindorm.g.xlarge**: Each node has 4 dedicated CPU cores and 16 GB of dedicated memory.</p>
     * <p>*   **lindorm.g.2xlarge**: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</p>
     * <p>*   **lindorm.g.4xlarge**: Each node has 16 dedicated CPU cores and 64 GB of dedicated memory.</p>
     * <p>*   **lindorm.g.8xlarge**: Each node has 32 dedicated CPU cores and 128 GB of dedicated memory.</p>
     */
    @NameInMap("TsdbSpec")
    public String tsdbSpec;

    /**
     * <p>The ID of the VPC in which you want to create the instance.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch to which you want the instance to connect.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the zone in which you want to create the instance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateLindormInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLindormInstanceRequest self = new CreateLindormInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateLindormInstanceRequest setArbiterVSwitchId(String arbiterVSwitchId) {
        this.arbiterVSwitchId = arbiterVSwitchId;
        return this;
    }
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    public CreateLindormInstanceRequest setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public CreateLindormInstanceRequest setArchVersion(String archVersion) {
        this.archVersion = archVersion;
        return this;
    }
    public String getArchVersion() {
        return this.archVersion;
    }

    public CreateLindormInstanceRequest setColdStorage(Integer coldStorage) {
        this.coldStorage = coldStorage;
        return this;
    }
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    public CreateLindormInstanceRequest setCoreSingleStorage(Integer coreSingleStorage) {
        this.coreSingleStorage = coreSingleStorage;
        return this;
    }
    public Integer getCoreSingleStorage() {
        return this.coreSingleStorage;
    }

    public CreateLindormInstanceRequest setCoreSpec(String coreSpec) {
        this.coreSpec = coreSpec;
        return this;
    }
    public String getCoreSpec() {
        return this.coreSpec;
    }

    public CreateLindormInstanceRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public CreateLindormInstanceRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateLindormInstanceRequest setFilestoreNum(Integer filestoreNum) {
        this.filestoreNum = filestoreNum;
        return this;
    }
    public Integer getFilestoreNum() {
        return this.filestoreNum;
    }

    public CreateLindormInstanceRequest setFilestoreSpec(String filestoreSpec) {
        this.filestoreSpec = filestoreSpec;
        return this;
    }
    public String getFilestoreSpec() {
        return this.filestoreSpec;
    }

    public CreateLindormInstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public CreateLindormInstanceRequest setInstanceStorage(String instanceStorage) {
        this.instanceStorage = instanceStorage;
        return this;
    }
    public String getInstanceStorage() {
        return this.instanceStorage;
    }

    public CreateLindormInstanceRequest setLindormNum(Integer lindormNum) {
        this.lindormNum = lindormNum;
        return this;
    }
    public Integer getLindormNum() {
        return this.lindormNum;
    }

    public CreateLindormInstanceRequest setLindormSpec(String lindormSpec) {
        this.lindormSpec = lindormSpec;
        return this;
    }
    public String getLindormSpec() {
        return this.lindormSpec;
    }

    public CreateLindormInstanceRequest setLogDiskCategory(String logDiskCategory) {
        this.logDiskCategory = logDiskCategory;
        return this;
    }
    public String getLogDiskCategory() {
        return this.logDiskCategory;
    }

    public CreateLindormInstanceRequest setLogNum(Integer logNum) {
        this.logNum = logNum;
        return this;
    }
    public Integer getLogNum() {
        return this.logNum;
    }

    public CreateLindormInstanceRequest setLogSingleStorage(Integer logSingleStorage) {
        this.logSingleStorage = logSingleStorage;
        return this;
    }
    public Integer getLogSingleStorage() {
        return this.logSingleStorage;
    }

    public CreateLindormInstanceRequest setLogSpec(String logSpec) {
        this.logSpec = logSpec;
        return this;
    }
    public String getLogSpec() {
        return this.logSpec;
    }

    public CreateLindormInstanceRequest setMultiZoneCombination(String multiZoneCombination) {
        this.multiZoneCombination = multiZoneCombination;
        return this;
    }
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
    }

    public CreateLindormInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLindormInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLindormInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateLindormInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateLindormInstanceRequest setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public CreateLindormInstanceRequest setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public CreateLindormInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLindormInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLindormInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateLindormInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateLindormInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateLindormInstanceRequest setSolrNum(Integer solrNum) {
        this.solrNum = solrNum;
        return this;
    }
    public Integer getSolrNum() {
        return this.solrNum;
    }

    public CreateLindormInstanceRequest setSolrSpec(String solrSpec) {
        this.solrSpec = solrSpec;
        return this;
    }
    public String getSolrSpec() {
        return this.solrSpec;
    }

    public CreateLindormInstanceRequest setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public CreateLindormInstanceRequest setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public CreateLindormInstanceRequest setStreamNum(Integer streamNum) {
        this.streamNum = streamNum;
        return this;
    }
    public Integer getStreamNum() {
        return this.streamNum;
    }

    public CreateLindormInstanceRequest setStreamSpec(String streamSpec) {
        this.streamSpec = streamSpec;
        return this;
    }
    public String getStreamSpec() {
        return this.streamSpec;
    }

    public CreateLindormInstanceRequest setTsdbNum(Integer tsdbNum) {
        this.tsdbNum = tsdbNum;
        return this;
    }
    public Integer getTsdbNum() {
        return this.tsdbNum;
    }

    public CreateLindormInstanceRequest setTsdbSpec(String tsdbSpec) {
        this.tsdbSpec = tsdbSpec;
        return this;
    }
    public String getTsdbSpec() {
        return this.tsdbSpec;
    }

    public CreateLindormInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateLindormInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateLindormInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
