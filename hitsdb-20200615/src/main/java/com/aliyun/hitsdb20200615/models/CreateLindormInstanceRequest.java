// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLindormInstanceRequest extends TeaModel {
    /**
     * <p>The vSwitch ID of the arbiter zone for a multi-zone instance. The vSwitch must be in the zone specified by ArbiterZoneId. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6664pqjawb87k36****</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>The zone ID of the arbiter zone for a multi-zone instance. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-g</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>The deployment architecture. Valid values:</p>
     * <ul>
     * <li><strong>1.0</strong>: single-zone.</li>
     * <li><strong>2.0</strong>: multi-zone.</li>
     * </ul>
     * <p>If this parameter is not specified, the default value is 1.0. To create a multi-zone instance, set this parameter to 2.0. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("ArchVersion")
    public String archVersion;

    /**
     * <p>The auto-renewal duration. Unit: months.</p>
     * <p>Valid values: <strong>1</strong> to <strong>12</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>AutoRenewal</strong> is set to <strong>true</strong>.</p>
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
     * <li><strong>true</strong>: Auto-renewal is enabled.</li>
     * <li><strong>false</strong>: Auto-renewal is disabled.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>PayType</strong> is set to <strong>PREPAY</strong> (subscription).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The capacity cloud storage capacity of the instance. Unit: GB. If this parameter is not specified, capacity cloud storage is not enabled. Valid values: <strong>800</strong> to <strong>1000000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("ColdStorage")
    public Integer coldStorage;

    /**
     * <p>The storage capacity per core node for a multi-zone instance. Valid values: 400 to 64000. Unit: GB. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CoreSingleStorage")
    public Integer coreSingleStorage;

    /**
     * <p>The node specifications for local disk type of the instance.</p>
     * <p>When the local storage type is local_ssd_pro, valid values are as follows. I3 instance types currently support only subscription:</p>
     * <ul>
     * <li><strong>lindorm.i4.xlarge</strong>: 4 cores, 32 GB (I4).</li>
     * <li><strong>lindorm.i4.2xlarge</strong>: 8 cores, 64 GB (I4).</li>
     * <li><strong>lindorm.i4.4xlarge</strong>: 16 cores, 128 GB (I4).</li>
     * <li><strong>lindorm.i4.8xlarge</strong>: 32 cores, 256 GB (I4).</li>
     * <li><strong>lindorm.i3.xlarge</strong>: 4 cores, 32 GB (I3).</li>
     * <li><strong>lindorm.i3.2xlarge</strong>: 8 cores, 64 GB (I3).</li>
     * <li><strong>lindorm.i3.4xlarge</strong>: 16 cores, 128 GB (I3).</li>
     * <li><strong>lindorm.i3.8xlarge</strong>: 32 cores, 256 GB (I3).</li>
     * <li><strong>lindorm.i2.xlarge</strong>: 4 cores, 32 GB (I2).</li>
     * <li><strong>lindorm.i2.2xlarge</strong>: 8 cores, 64 GB (I2).</li>
     * <li><strong>lindorm.i2.4xlarge</strong>: 16 cores, 128 GB (I2).</li>
     * <li><strong>lindorm.i2.8xlarge</strong>: 32 cores, 256 GB (I2).</li>
     * </ul>
     * <p>When the local storage type is local_hdd_pro, valid values are as follows:</p>
     * <ul>
     * <li><strong>lindorm.sd3c.3xlarge</strong>: 14 cores, 56 GB (D3C PRO).</li>
     * <li><strong>lindorm.sd3c.7xlarge</strong>: 28 cores, 112 GB (D3C PRO).</li>
     * <li><strong>lindorm.sd3c.14xlarge</strong>: 56 cores, 224 GB (D3C PRO).</li>
     * <li><strong>lindorm.d2c.6xlarge</strong>: 24 cores, 88 GB (D2C).</li>
     * <li><strong>lindorm.d2c.12xlarge</strong>: 48 cores, 176 GB (D2C).</li>
     * <li><strong>lindorm.d2c.24xlarge</strong>: 96 cores, 352 GB (D2C).</li>
     * <li><strong>lindorm.d2s.5xlarge</strong>: 20 cores, 88 GB (D2S).</li>
     * <li><strong>lindorm.d2s.10xlarge</strong>: 40 cores, 176 GB (D2S).</li>
     * <li><strong>lindorm.d1.2xlarge</strong>: 8 cores, 32 GB (D1NE).</li>
     * <li><strong>lindorm.d1.4xlarge</strong>: 16 cores, 64 GB (D1NE).</li>
     * <li><strong>lindorm.d1.6xlarge</strong>: 24 cores, 96 GB (D1NE).</li>
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
     * <li><strong>cloud_efficiency</strong>: standard cloud storage.</li>
     * <li><strong>cloud_ssd</strong>: performance cloud storage.</li>
     * <li><strong>cloud_essd</strong>: enhanced performance cloud storage.</li>
     * <li><strong>cloud_essd_pl0</strong>: performance cloud storage PL0.</li>
     * <li><strong>capacity_cloud_storage</strong>: capacity cloud storage (not supported for multi-zone instances).</li>
     * <li><strong>local_ssd_pro</strong>: local SSD (not supported for multi-zone instances).</li>
     * <li><strong>local_hdd_pro</strong>: local HDD (not supported for multi-zone instances).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The subscription duration of the instance. Valid values:</p>
     * <ul>
     * <li>If PricingCycle is set to <strong>Month</strong>, valid values are <strong>1</strong> to <strong>9</strong>.</li>
     * <li>If PricingCycle is set to <strong>Year</strong>, valid values are <strong>1</strong> to <strong>3</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available and required when PayType is set to <strong>PREPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The number of file engine nodes of the instance. Valid values:</p>
     * <ul>
     * <li>If the billing method of the instance is <strong>PREPAY</strong>, valid values are <strong>0</strong> to <strong>60</strong>.</li>
     * <li>If the billing method of the instance is <strong>POSTPAY</strong>, valid values are <strong>0</strong> to <strong>8</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FilestoreNum")
    public Integer filestoreNum;

    /**
     * <p>The file engine node specifications of the instance. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.c.xlarge</strong>: 4 cores, 8 GB (standard).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.c.xlarge</p>
     */
    @NameInMap("FilestoreSpec")
    public String filestoreSpec;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lindorm_test</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    /**
     * <p>The storage capacity of the instance. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>480</p>
     */
    @NameInMap("InstanceStorage")
    public String instanceStorage;

    /**
     * <p>The number of LindormTable engine nodes of the instance.</p>
     * <p>To create a single-zone instance, valid values are <strong>0</strong> to <strong>90</strong>.</p>
     * <p><strong>To create a multi-zone instance, this parameter is required.</strong> For instances with non-local disk storage types, valid values are <strong>4</strong> to <strong>400</strong>. For instances with local disk storage types, valid values are <strong>6</strong> to <strong>400</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LindormNum")
    public Integer lindormNum;

    /**
     * <p>The LindormTable engine node specifications of the instance. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB (dedicated).</li>
     * <li><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB (dedicated).</li>
     * <li><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB (dedicated).</li>
     * <li><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB (dedicated).</li>
     * <li><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB (dedicated).</li>
     * <li><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB (dedicated).</li>
     * <li><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB (dedicated).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.4xlarge</p>
     */
    @NameInMap("LindormSpec")
    public String lindormSpec;

    /**
     * <p>The disk type of log nodes for a multi-zone instance. Valid values:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: standard cloud storage.</li>
     * <li><strong>cloud_ssd</strong>: performance cloud storage.</li>
     * </ul>
     * <p><strong>To create a multi-zone instance, this parameter is required.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("LogDiskCategory")
    public String logDiskCategory;

    /**
     * <p>The number of log nodes for a multi-zone instance. Valid values: 4 to 400. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogNum")
    public Integer logNum;

    /**
     * <p>The storage capacity per log node for a multi-zone instance. Valid values: 400 to 64000. Unit: GB. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("LogSingleStorage")
    public Integer logSingleStorage;

    /**
     * <p>The log node specifications for a multi-zone instance. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.sn1.large</strong>: 4 cores, 8 GB (dedicated).</li>
     * <li><strong>lindorm.sn1.2xlarge</strong>: 8 cores, 16 GB (dedicated).</li>
     * </ul>
     * <p><strong>To create a multi-zone instance, this parameter is required and active.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>lindorm.sn1.large</p>
     */
    @NameInMap("LogSpec")
    public String logSpec;

    /**
     * <p>The number of LTS engine nodes of the instance. Valid values: <strong>0</strong> to <strong>60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LtsNum")
    public String ltsNum;

    /**
     * <p>The LTS engine node specifications of the instance. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.c.xlarge</strong>: 4 cores, 8 GB (dedicated).</li>
     * <li><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB (dedicated).</li>
     * <li><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB (dedicated).</li>
     * <li><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB (dedicated).</li>
     * <li><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB (dedicated).</li>
     * <li><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB (dedicated).</li>
     * <li><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB (dedicated).</li>
     * <li><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB (dedicated).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("LtsSpec")
    public String ltsSpec;

    /**
     * <p>The multi-zone combination. You can check the supported zone combinations on the buy page.</p>
     * <ul>
     * <li><strong>ap-southeast-5abc-aliyun</strong>: Indonesia (Jakarta) A+B+C.</li>
     * <li><strong>cn-hangzhou-ehi-aliyun</strong>: China (Hangzhou) E+H+I.</li>
     * <li><strong>cn-beijing-acd-aliyun</strong>: China (Beijing) A+C+D.</li>
     * <li><strong>ap-southeast-1-abc-aliyun</strong>: Singapore A+B+C.</li>
     * <li><strong>cn-zhangjiakou-abc-aliyun</strong>: China (Zhangjiakou) A+B+C.</li>
     * <li><strong>cn-shanghai-efg-aliyun</strong>: China (Shanghai) E+F+G.</li>
     * <li><strong>cn-shanghai-abd-aliyun</strong>: China (Shanghai) A+B+D.</li>
     * <li><strong>cn-hangzhou-bef-aliyun</strong>: China (Hangzhou) B+E+F.</li>
     * <li><strong>cn-hangzhou-bce-aliyun</strong>: China (Hangzhou) B+C+E.</li>
     * <li><strong>cn-beijing-fgh-aliyun</strong>: China (Beijing) F+G+H.</li>
     * <li><strong>cn-shenzhen-abc-aliyun</strong>: China (Shenzhen) A+B+C.</li>
     * </ul>
     * <p><strong>To create a multi-zone instance, this parameter is required.</strong></p>
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
     * <p>The billing method of the instance. Valid values:</p>
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
     * <p>The billing cycle of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: monthly billing.</li>
     * <li><strong>Year</strong>: yearly billing.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available and required when PayType is set to <strong>PREPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The vSwitch ID of the primary zone for a multi-zone instance. The vSwitch must be in the zone specified by PrimaryZoneId. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6fdqa7c0pipnqzq****</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <p>The zone ID of the primary zone for a multi-zone instance. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-e</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/426062.html">DescribeRegions</a> to query available regions. Use this parameter to specify the region in which to create the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
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
     * <p>The number of search index engine nodes of the instance. Valid values: <strong>0</strong> to <strong>60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SolrNum")
    public Integer solrNum;

    /**
     * <p>The search index engine node specifications of the instance. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB (dedicated).</li>
     * <li><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB (dedicated).</li>
     * <li><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB (dedicated).</li>
     * <li><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB (dedicated).</li>
     * <li><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB (dedicated).</li>
     * <li><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB (dedicated).</li>
     * <li><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB (dedicated).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("SolrSpec")
    public String solrSpec;

    /**
     * <p>The vSwitch ID of the secondary zone for a multi-zone instance. The vSwitch must be in the zone specified by StandbyZoneId. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zec0kcn08cgdtr6****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>The zone ID of the secondary zone for a multi-zone instance. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The number of stream engine nodes of the instance. Valid values: <strong>0</strong> to <strong>60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StreamNum")
    public Integer streamNum;

    /**
     * <p>The stream engine node specifications of the instance. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB (dedicated).</li>
     * <li><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB (dedicated).</li>
     * <li><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB (dedicated).</li>
     * <li><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB (dedicated).</li>
     * <li><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB (dedicated).</li>
     * <li><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB (dedicated).</li>
     * <li><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB (dedicated).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("StreamSpec")
    public String streamSpec;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateLindormInstanceRequestTag> tag;

    /**
     * <p>The number of LindormTSDB engine nodes of the instance. Valid values:</p>
     * <ul>
     * <li>If the billing method of the instance is <strong>PREPAY</strong>, valid values are <strong>0</strong> to <strong>24</strong>.</li>
     * <li>If the billing method of the instance is <strong>POSTPAY</strong>, valid values are <strong>0</strong> to <strong>32</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TsdbNum")
    public Integer tsdbNum;

    /**
     * <p>The LindormTSDB engine node specifications of the instance. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB (dedicated).</li>
     * <li><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB (dedicated).</li>
     * <li><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB (dedicated).</li>
     * <li><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB (dedicated).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("TsdbSpec")
    public String tsdbSpec;

    /**
     * <p>The VPC ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the instance.</p>
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
         * <p>You can specify multiple tag keys. For example, the Key in the first pair specifies the first tag key, and the Key in the second pair specifies the second tag key.</p>
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
         * <p>You can specify multiple tag values. For example, the Value in the first pair specifies the first tag value, and the Value in the second pair specifies the second tag value.</p>
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
