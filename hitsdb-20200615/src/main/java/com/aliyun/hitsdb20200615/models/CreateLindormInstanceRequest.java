// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLindormInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the vSwitch that is specified for the zone for the coordinate node of the instance. The vSwitch must be deployed in the zone specified by the ArbiterZoneId parameter. <strong>This parameter is required if you want to create a multi-zone instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6664pqjawb87k36****</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>The ID of the zone for the coordinate node of the instance. <strong>This parameter is required if you want to create a multi-zone instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-g</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>The architecture of the instance. Valid values:</p>
     * <ul>
     * <li><strong>1.0</strong>: The instance that you want to create is a single-zone instance.</li>
     * <li><strong>2.0</strong>: The instance that you want to create is a multi-zone instance.</li>
     * </ul>
     * <p>By default, the value of this parameter is 1.0. To create a multi-zone instance, set this parameter to 2.0. <strong>This parameter is required if you want to create a multi-zone instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("ArchVersion")
    public String archVersion;

    /**
     * <p>The auto-renewal duration. Unit: month.</p>
     * <p>Valid values: <strong>1</strong> to <strong>12</strong>.</p>
     * <blockquote>
     * <p> This parameter is available only when the <strong>AutoRenewal</strong> parameter is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public String autoRenewDuration;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong>: disables auto-renewal.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p> This parameter is available only when the <strong>PayType</strong> parameter is set to <strong>PREPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The cold storage capacity of the instance. By default, if you leave this parameter unspecified, cold storage is not enabled for the instance. Unit: GB. Valid values: <strong>800</strong> to <strong>1000000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("ColdStorage")
    public Integer coldStorage;

    /**
     * <p>The storage capacity of the disk of a single core node. Valid values: 400 to 64000. Unit: GB. <strong>This parameter is required if you want to create a multi-zone instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CoreSingleStorage")
    public Integer coreSingleStorage;

    /**
     * <p>The specification of the nodes in the instance if you set DiskCategory to local_ssd_pro or local_hdd_pro.</p>
     * <p>Valid values when DiskCategory is set to local_ssd_pro (i3 instance types support only subscription instances):</p>
     * <ul>
     * <li><strong>lindorm.i4.xlarge</strong>: Each node has 4 CPU cores and 32 GB of memory.</li>
     * <li><strong>lindorm.i4.2xlarge</strong>: Each node has 8 CPU cores and 64 GB of memory.</li>
     * <li><strong>lindorm.i4.4xlarge</strong>: Each node has 16 CPU cores and 128 GB of memory.</li>
     * <li><strong>lindorm.i4.8xlarge</strong>: Each node has 32 CPU cores and 256 GB of memory.</li>
     * <li><strong>lindorm.i3.xlarge</strong>: Each node has 4 CPU cores and 32 GB of memory.</li>
     * <li><strong>lindorm.i3.2xlarge</strong>: Each node has 8 CPU cores and 64 GB of memory.</li>
     * <li><strong>lindorm.i3.4xlarge</strong>: Each node has 16 CPU cores and 128 GB of memory.</li>
     * <li><strong>lindorm.i3.8xlarge</strong>: Each node has 32 CPU cores and 256 GB of memory.</li>
     * <li><strong>lindorm.i2.xlarge</strong>: Each node has 4 CPU cores and 32 GB of memory.</li>
     * <li><strong>lindorm.i2.2xlarge</strong>: Each node has 8 CPU cores and 64 GB of memory.</li>
     * <li><strong>lindorm.i2.4xlarge</strong>: Each node has 16 CPU cores and 128 GB of memory.</li>
     * <li><strong>lindorm.i2.8xlarge</strong>: Each node has 32 CPU cores and 256 GB of memory.</li>
     * </ul>
     * <p>Valid values when DiskCategory is set to local_hhd_pro:</p>
     * <ul>
     * <li><strong>lindorm.sd3c.3xlarge</strong>: Each node has 14 CPU cores and 56 GB of memory.</li>
     * <li><strong>lindorm.sd3c.7xlarge</strong>: Each node has 28 CPU cores and 112 GB of memory.</li>
     * <li><strong>lindorm.sd3c.14xlarge</strong>: Each node has 56 CPU cores and 224 GB of memory.</li>
     * <li><strong>lindorm.d2c.6xlarge</strong>: Each node has 24 CPU cores and 88 GB of memory.</li>
     * <li><strong>lindorm.d2c.12xlarge</strong>: Each node has 48 CPU cores and 176 GB of memory.</li>
     * <li><strong>lindorm.d2c.24xlarge</strong>: Each node has 96 CPU cores and 352 GB of memory.</li>
     * <li><strong>lindorm.d2s.5xlarge</strong>: Each node has 20 CPU cores and 88 GB of memory.</li>
     * <li><strong>lindorm.d2s.10xlarge</strong>: Each node has 40 CPU cores and 176 GB of memory.</li>
     * <li><strong>lindorm.d1.2xlarge</strong>: Each node has 8 CPU cores and 32 GB of memory.</li>
     * <li><strong>lindorm.d1.4xlarge</strong>: Each node has 16 CPU cores and 64 GB of memory.</li>
     * <li><strong>lindorm.d1.6xlarge</strong>: Each node has 24 CPU cores and 96 GB of memory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.i2.xlarge</p>
     */
    @NameInMap("CoreSpec")
    public String coreSpec;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: This instance uses the Standard type of storage.</li>
     * <li><strong>cloud_ssd</strong>: This instance uses the Performance type of storage.</li>
     * <li><strong>capacity_cloud_storage</strong>: This instance uses the Capacity type of storage.</li>
     * <li><strong>local_ssd_pro</strong>: This instance uses local SSDs.</li>
     * <li><strong>local_hdd_pro</strong>: This instance uses local HDDs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The subscription period of the instance. The valid values of this parameter depend on the value of the PricingCycle parameter.</p>
     * <ul>
     * <li>If PricingCycle is set to <strong>Month</strong>, set this parameter to an integer that ranges from <strong>1</strong> to <strong>9</strong>.</li>
     * <li>If PricingCycle is set to <strong>Year</strong>, set this parameter to an integer that ranges from <strong>1</strong> to <strong>3</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available and required when the PayType parameter is set to <strong>PREPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The number of LindormDFS nodes in the instance. The valid values of this parameter depend on the value of the PayType parameter.</p>
     * <ul>
     * <li>If the PayType parameter is set to <strong>PREPAY</strong>, set this parameter to an integer that ranges from <strong>0</strong> to <strong>60</strong>.</li>
     * <li>If the PayType parameter is set to <strong>POSTPAY</strong>, set this parameter to an integer that ranges from <strong>0</strong> to <strong>8</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FilestoreNum")
    public Integer filestoreNum;

    /**
     * <p>The specification of LindormDFS nodes in the instance. Set the value of this parameter to <strong>lindorm.c.xlarge</strong>, which indicates that each node has 4 dedicated CPU cores and 8 GB of dedicated memory.</p>
     * 
     * <strong>example:</strong>
     * <p>lindorm.c.xlarge</p>
     */
    @NameInMap("FilestoreSpec")
    public String filestoreSpec;

    /**
     * <p>The name of the instance that you want to create.</p>
     * 
     * <strong>example:</strong>
     * <p>lindorm_test</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    /**
     * <p>The storage capacity of the instance you want to create. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>480</p>
     */
    @NameInMap("InstanceStorage")
    public String instanceStorage;

    /**
     * <p>The number of LindormTable nodes in the instance. The valid values of this parameter depend on the value of the PayType parameter.</p>
     * <ul>
     * <li>If the PayType parameter is set to <strong>PREPAY</strong>, set this parameter to an integer that ranges from <strong>0</strong> to <strong>90</strong>.</li>
     * <li>If the PayType parameter is set to <strong>POSTPAY</strong>, set this parameter to an integer that ranges from <strong>0</strong> to <strong>400</strong>.</li>
     * </ul>
     * <p><strong>This parameter is required if you want to create a multi-zone instance</strong>.  The valid values of this parameter range from 4 to 400 if you want to create a multi-zone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LindormNum")
    public Integer lindormNum;

    /**
     * <p>The specification of LindormTable nodes in the instance. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.c.xlarge</strong>: Each node has 4 dedicated CPU cores and 8 GB of dedicated memory.</li>
     * <li><strong>lindorm.c.2xlarge</strong>: Each node has 8 dedicated CPU cores and 16 GB of dedicated memory.</li>
     * <li><strong>lindorm.c.4xlarge</strong>: Each node has 16 dedicated CPU cores and 32 GB of dedicated memory.</li>
     * <li><strong>lindorm.c.8xlarge</strong>: Each node has 32 dedicated CPU cores and 64 GB of dedicated memory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.c.xlarge</p>
     */
    @NameInMap("LindormSpec")
    public String lindormSpec;

    /**
     * <p>The disk type of the log nodes. Valid values:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: This instance uses the Standard type of storage.</li>
     * <li><strong>cloud_ssd</strong>: This instance uses the Performance type of storage.</li>
     * </ul>
     * <p><strong>This parameter is required if you want to create a multi-zone instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("LogDiskCategory")
    public String logDiskCategory;

    /**
     * <p>The number of the log nodes. Valid values: 4 to 400. <strong>This parameter is required if you want to create a multi-zone instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogNum")
    public Integer logNum;

    /**
     * <p>The storage capacity of the disk of a single log node. Valid values: 400 to 64000. Unit: GB. <strong>This parameter is required if you want to create a multi-zone instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("LogSingleStorage")
    public Integer logSingleStorage;

    /**
     * <p>The type of the log nodes. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.sn1.xlarge</strong>: Each node has 4 dedicated CPU cores and 8 GB of dedicated memory.</li>
     * <li><strong>lindorm.sn1.2xlarge</strong>: Each node has 8 dedicated CPU cores and 16 GB of dedicated memory.</li>
     * </ul>
     * <p><strong>This parameter is required if you want to create a multi-zone instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>lindorm.sn1.large</p>
     */
    @NameInMap("LogSpec")
    public String logSpec;

    /**
     * <p>The number of LTS nodes in the instance. Valid values: <strong>0</strong> to <strong>60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LtsNum")
    public String ltsNum;

    /**
     * <p>The specification of LTS nodes in the instance. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.c.xlarge</strong>: Each node has 4 dedicated CPU cores and 8 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.xlarge</strong>: Each node has 4 dedicated CPU cores and 16 GB of dedicated memory.</li>
     * <li><strong>lindorm.c.2xlarge</strong>: Each node has 8 dedicated CPU cores and 16 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.2xlarge</strong>: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</li>
     * <li><strong>lindorm.c.4xlarge</strong>: Each node has 16 dedicated CPU cores and 32 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.4xlarge</strong>: Each node has 16 dedicated CPU cores and 64 GB of dedicated memory.</li>
     * <li><strong>lindorm.c.8xlarge</strong>: Each node has 32 dedicated CPU cores and 64 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.8xlarge</strong>: Each node has 32 dedicated CPU cores and 128 GB of dedicated memory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("LtsSpec")
    public String ltsSpec;

    /**
     * <p>The combinations of zones that are available for the multi-zone instance. You can go to the purchase page of Lindorm to view the supported zone combinations.</p>
     * <ul>
     * <li><strong>ap-southeast-5abc-aliyun</strong>: Zone A+B+C in the Indonesia (Jakarta) region.</li>
     * <li><strong>cn-hangzhou-ehi-aliyun</strong>: Zone E+H+I in the China (Hangzhou) region.</li>
     * <li><strong>cn-beijing-acd-aliyun</strong>: Zone A+C+D in the China (Beijing) region.</li>
     * <li><strong>ap-southeast-1-abc-aliyun</strong>: Zone A+B+C in the Singapore region.</li>
     * <li><strong>cn-zhangjiakou-abc-aliyun</strong>: Zone A+B+C in the China (Zhangjiakou) region.</li>
     * <li><strong>cn-shanghai-efg-aliyun</strong>: Zone E+F+G in the China (Shanghai) region.</li>
     * <li><strong>cn-shanghai-abd-aliyun</strong>: Zone A+B+D in the China (Shanghai) region.</li>
     * <li><strong>cn-hangzhou-bef-aliyun</strong>: Zone B+E+F in the China (Hangzhou) region.</li>
     * <li><strong>cn-hangzhou-bce-aliyun</strong>: Zone B+C+E in the China (Hangzhou) region.</li>
     * <li><strong>cn-beijing-fgh-aliyun</strong>: Zone F+G+H in the China (Beijing) region.</li>
     * <li><strong>cn-shenzhen-abc-aliyun</strong>: Zone A+B+C in the China (Shenzhen) region.</li>
     * </ul>
     * <p><strong>This parameter is required if you want to create a multi-zone instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-efg-aliyun</p>
     */
    @NameInMap("MultiZoneCombination")
    public String multiZoneCombination;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the instance you want to create. Valid values:</p>
     * <ul>
     * <li><strong>PREPAY</strong>: subscription.</li>
     * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The period based on which you are charged for the instance. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: You are charged for the instance on a monthly basis.</li>
     * <li><strong>Year</strong>: You are charged for the instance on a yearly basis.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available and required when the PayType parameter is set to <strong>PREPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the vSwitch that is specified for the secondary zone of the instance. The vSwitch must be deployed in the zone specified by the StandbyZoneId parameter. <strong>This parameter is required if you want to create a multi-zone instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6fdqa7c0pipnqzq****</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <p>Multi-zone instance, availability zone ID of the primary zone. <strong>This parameter is required if you need to create a multi-zone instance.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-e</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>The ID of the region in which you want to create the instance. You can call the <a href="https://help.aliyun.com/document_detail/426062.html">DescribeRegions</a> operation to query the region in which you can create the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Lindorm instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2i6weeb4nfii</p>
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
     * <p>The number of LindormSearch nodes in the instance. Valid values: integers from <strong>0</strong> to <strong>60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SolrNum")
    public Integer solrNum;

    /**
     * <p>The specification of the LindormSearch nodes in the instance. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.g.xlarge</strong>: Each node has 4 dedicated CPU cores and 16 GB of dedicated memory.</li>
     * <li><strong>lindorm.c.2xlarge</strong>: Each node has 8 dedicated CPU cores and 16 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.2xlarge</strong>: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</li>
     * <li><strong>lindorm.c.4xlarge</strong>: Each node has 16 dedicated CPU cores and 32 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.4xlarge</strong>: Each node has 16 dedicated CPU cores and 64 GB of dedicated memory.</li>
     * <li><strong>lindorm.c.8xlarge</strong>: Each node has 32 dedicated CPU cores and 64 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.8xlarge</strong>: Each node has 32 dedicated CPU cores and 128 GB of dedicated memory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("SolrSpec")
    public String solrSpec;

    /**
     * <p>The ID of the vSwitch that is specified for the secondary zone of the instance. The vSwitch must be deployed in the zone specified by the StandbyZoneId parameter. <strong>This parameter is required if you want to create a multi-zone instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zec0kcn08cgdtr6****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>The ID of the secondary zone of the instance. <strong>This parameter is required if you want to create a multi-zone instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The number of LindormStream nodes in the instance. Valid values: integers from <strong>0</strong> to <strong>60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StreamNum")
    public Integer streamNum;

    /**
     * <p>The specification of the LindormStream nodes in the instance. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.g.xlarge</strong>: Each node has 4 dedicated CPU cores and 16 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.2xlarge</strong>: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.4xlarge</strong>: Each node has 16 dedicated CPU cores and 64 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.8xlarge</strong>: Each node has 32 dedicated CPU cores and 128 GB of dedicated memory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("StreamSpec")
    public String streamSpec;

    /**
     * <p>The tags that are added to instances.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateLindormInstanceRequestTag> tag;

    /**
     * <p>The number of the LindormTSDB nodes in the instance. The valid values of this parameter depend on the value of the PayType parameter.</p>
     * <ul>
     * <li>If the PayType parameter is set to <strong>PREPAY</strong>, set this parameter to an integer that ranges from <strong>0</strong> to <strong>24</strong>.</li>
     * <li>If the PayType parameter is set to <strong>POSTPAY</strong>, set this parameter to an integer that ranges from <strong>0</strong> to <strong>32</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TsdbNum")
    public Integer tsdbNum;

    /**
     * <p>The specification of the LindormTSDB nodes in the instance. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.g.xlarge</strong>: Each node has 4 dedicated CPU cores and 16 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.2xlarge</strong>: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.4xlarge</strong>: Each node has 16 dedicated CPU cores and 64 GB of dedicated memory.</li>
     * <li><strong>lindorm.g.8xlarge</strong>: Each node has 32 dedicated CPU cores and 128 GB of dedicated memory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("TsdbSpec")
    public String tsdbSpec;

    /**
     * <p>The ID of the VPC in which you want to create the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch to which you want the instance to connect.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the zone in which you want to create the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
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

    public CreateLindormInstanceRequest setAutoRenewDuration(String autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public String getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public CreateLindormInstanceRequest setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
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

    public CreateLindormInstanceRequest setLtsNum(String ltsNum) {
        this.ltsNum = ltsNum;
        return this;
    }
    public String getLtsNum() {
        return this.ltsNum;
    }

    public CreateLindormInstanceRequest setLtsSpec(String ltsSpec) {
        this.ltsSpec = ltsSpec;
        return this;
    }
    public String getLtsSpec() {
        return this.ltsSpec;
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

    public CreateLindormInstanceRequest setTag(java.util.List<CreateLindormInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateLindormInstanceRequestTag> getTag() {
        return this.tag;
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

    public static class CreateLindormInstanceRequestTag extends TeaModel {
        /**
         * <p>The tag key. Valid values of N: 1 to 20.</p>
         * <blockquote>
         * <p> You can specify the keys of multiple tags. For example, you can specify the key of the first tag in the first key-value pair contained in the value of this parameter and specify the key of the second tag in the second key-value pair.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: 1 to 20.</p>
         * <blockquote>
         * <p> You can specify the values of multiple tags. For example, you can specify the value of the first tag in the first key-value pair contained in the value of this parameter and specify the value of the second tag in the second key-value pair.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateLindormInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLindormInstanceRequestTag self = new CreateLindormInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateLindormInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLindormInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
