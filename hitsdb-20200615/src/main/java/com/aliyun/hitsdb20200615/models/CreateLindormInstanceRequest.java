// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLindormInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the VSwitch for the arbiter zone of the multi-zone instance. The VSwitch must be in the zone specified by <code>ArbiterZoneId</code>. <strong>This parameter is required for multi-zone instances.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6664pqjawb87k36****</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>The ID of the arbiter zone for the multi-zone instance. <strong>This parameter is required for multi-zone instances.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-g</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <p>The deployment architecture of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>1.0</strong>: Single-zone deployment.</p>
     * </li>
     * <li><p><strong>2.0</strong>: Multi-zone deployment.</p>
     * </li>
     * </ul>
     * <p>The default value is 1.0. To create a multi-zone instance, set this parameter to 2.0. <strong>This parameter is required for multi-zone instances.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("ArchVersion")
    public String archVersion;

    /**
     * <p>The auto-renewal duration, in months.</p>
     * <p>The value of this parameter ranges from <strong>1</strong> to <strong>12</strong>.</p>
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
     * <p>Specifies whether to enable auto-renewal for the Subscription instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Auto-renewal is enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Auto-renewal is disabled.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the <strong>PayType</strong> parameter is set to <strong>PREPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The cold storage capacity of the instance, in GB. The value of this parameter ranges from <strong>800</strong> to <strong>1,000,000</strong>. If you do not specify this parameter, cold storage is not enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("ColdStorage")
    public Integer coldStorage;

    /**
     * <p>The storage capacity of a single core node in the multi-zone instance. Unit: GB. The value of this parameter ranges from 400 to 64,000. <strong>This parameter is required for multi-zone instances.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CoreSingleStorage")
    public Integer coreSingleStorage;

    /**
     * <p>The node specification for an instance that uses local disks.</p>
     * <p>If the storage type is <strong>local_ssd_pro</strong>, valid values include the following: Note that I3-family specifications are available only for Subscription instances.</p>
     * <ul>
     * <li><p><strong>lindorm.i4.xlarge</strong>: 4 cores, 32 GB memory (I4).</p>
     * </li>
     * <li><p><strong>lindorm.i4.2xlarge</strong>: 8 cores, 64 GB memory (I4).</p>
     * </li>
     * <li><p><strong>lindorm.i4.4xlarge</strong>: 16 cores, 128 GB memory (I4).</p>
     * </li>
     * <li><p><strong>lindorm.i4.8xlarge</strong>: 32 cores, 256 GB memory (I4).</p>
     * </li>
     * <li><p><strong>lindorm.i3.xlarge</strong>: 4 cores, 32 GB memory (I3).</p>
     * </li>
     * <li><p><strong>lindorm.i3.2xlarge</strong>: 8 cores, 64 GB memory (I3).</p>
     * </li>
     * <li><p><strong>lindorm.i3.4xlarge</strong>: 16 cores, 128 GB memory (I3).</p>
     * </li>
     * <li><p><strong>lindorm.i3.8xlarge</strong>: 32 cores, 256 GB memory (I3).</p>
     * </li>
     * <li><p><strong>lindorm.i2.xlarge</strong>: 4 cores, 32 GB memory (I2).</p>
     * </li>
     * <li><p><strong>lindorm.i2.2xlarge</strong>: 8 cores, 64 GB memory (I2).</p>
     * </li>
     * <li><p><strong>lindorm.i2.4xlarge</strong>: 16 cores, 128 GB memory (I2).</p>
     * </li>
     * <li><p><strong>lindorm.i2.8xlarge</strong>: 32 cores, 256 GB memory (I2).</p>
     * </li>
     * </ul>
     * <p>If the storage type is <strong>local_hdd_pro</strong>, valid values include:</p>
     * <ul>
     * <li><p><strong>lindorm.sd3c.3xlarge</strong>: 14 cores, 56 GB memory (D3C PRO).</p>
     * </li>
     * <li><p><strong>lindorm.sd3c.7xlarge</strong>: 28 cores, 112 GB memory (D3C PRO).</p>
     * </li>
     * <li><p><strong>lindorm.sd3c.14xlarge</strong>: 56 cores, 224 GB memory (D3C PRO).</p>
     * </li>
     * <li><p><strong>lindorm.d2c.6xlarge</strong>: 24 cores, 88 GB memory (D2C).</p>
     * </li>
     * <li><p><strong>lindorm.d2c.12xlarge</strong>: 48 cores, 176 GB memory (D2C).</p>
     * </li>
     * <li><p><strong>lindorm.d2c.24xlarge</strong>: 96 cores, 352 GB memory (D2C).</p>
     * </li>
     * <li><p><strong>lindorm.d2s.5xlarge</strong>: 20 cores, 88 GB memory (D2S).</p>
     * </li>
     * <li><p><strong>lindorm.d2s.10xlarge</strong>: 40 cores, 176 GB memory (D2S).</p>
     * </li>
     * <li><p><strong>lindorm.d1.2xlarge</strong>: 8 cores, 32 GB memory (D1NE).</p>
     * </li>
     * <li><p><strong>lindorm.d1.4xlarge</strong>: 16 cores, 64 GB memory (D1NE).</p>
     * </li>
     * <li><p><strong>lindorm.d1.6xlarge</strong>: 24 cores, 96 GB memory (D1NE).</p>
     * </li>
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
     * <li><p><strong>cloud_efficiency</strong>: Efficiency cloud disk.</p>
     * </li>
     * <li><p><strong>cloud_ssd</strong>: Performance cloud disk.</p>
     * </li>
     * <li><p><strong>cloud_essd</strong>: Enhanced SSD (ESSD).</p>
     * </li>
     * <li><p><strong>cloud_essd_pl0</strong>: ESSD PL0.</p>
     * </li>
     * <li><p><strong>capacity_cloud_storage</strong>: Capacity-optimized cloud storage. (Not available for multi-zone instances.)</p>
     * </li>
     * <li><p><strong>local_ssd_pro</strong>: Local SSD. (Not available for multi-zone instances.)</p>
     * </li>
     * <li><p><strong>local_hdd_pro</strong>: Local HDD. (Not available for multi-zone instances.)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The subscription duration for the instance. Valid values:</p>
     * <ul>
     * <li><p>If <strong>PricingCycle</strong> is set to <strong>Month</strong>, the value can range from <strong>1</strong> to <strong>9</strong>.</p>
     * </li>
     * <li><p>If <strong>PricingCycle</strong> is set to <strong>Year</strong>, the value can range from <strong>1</strong> to <strong>3</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if you set <strong>PayType</strong> to <strong>PREPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The number of nodes in the file engine. Valid values:</p>
     * <ul>
     * <li><p>For a Subscription instance, the value of this parameter ranges from <strong>0</strong> to <strong>60</strong>.</p>
     * </li>
     * <li><p>For a Pay-As-You-Go instance, the value of this parameter ranges from <strong>0</strong> to <strong>8</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FilestoreNum")
    public Integer filestoreNum;

    /**
     * <p>The specification of the file engine nodes. Valid values:</p>
     * <ul>
     * <li><strong>lindorm.c.xlarge</strong>: 4 cores, 8 GB memory (standard).</li>
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
     * <p>The storage capacity of the instance, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>480</p>
     */
    @NameInMap("InstanceStorage")
    public String instanceStorage;

    /**
     * <p>The number of nodes in the wide table engine.</p>
     * <p>For a single-zone instance, the value of this parameter ranges from <strong>0</strong> to <strong>90</strong>.</p>
     * <p><strong>This parameter is required for multi-zone instances.</strong> For an instance that uses cloud disks, the value ranges from <strong>4</strong> to <strong>400</strong>. For an instance that uses local disks, the value ranges from <strong>6</strong> to <strong>400</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LindormNum")
    public Integer lindormNum;

    /**
     * <p>The specification of the wide table engine nodes. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB memory (dedicated).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.c.xlarge</p>
     */
    @NameInMap("LindormSpec")
    public String lindormSpec;

    /**
     * <p>The storage type of the log nodes for the multi-zone instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cloud_efficiency</strong>: Efficiency cloud disk.</p>
     * </li>
     * <li><p><strong>cloud_ssd</strong>: Performance cloud disk.</p>
     * </li>
     * </ul>
     * <p><strong>This parameter is required for multi-zone instances.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("LogDiskCategory")
    public String logDiskCategory;

    /**
     * <p>The number of log nodes for the multi-zone instance. The value of this parameter ranges from 4 to 400. <strong>This parameter is required for multi-zone instances.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogNum")
    public Integer logNum;

    /**
     * <p>The storage capacity of a single log node in the multi-zone instance. Unit: GB. The value of this parameter ranges from 400 to 64,000. <strong>This parameter is required for multi-zone instances.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("LogSingleStorage")
    public Integer logSingleStorage;

    /**
     * <p>The specification of the log nodes for the multi-zone instance. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm.sn1.large</strong>: 4 cores, 8 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.sn1.2xlarge</strong>: 8 cores, 16 GB memory (dedicated).</p>
     * </li>
     * </ul>
     * <p><strong>This parameter is required for multi-zone instances.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>lindorm.sn1.large</p>
     */
    @NameInMap("LogSpec")
    public String logSpec;

    /**
     * <p>The number of nodes in the LTS engine. The value of this parameter ranges from <strong>0</strong> to <strong>60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LtsNum")
    public String ltsNum;

    /**
     * <p>The specification of the LTS engine nodes. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm.c.xlarge</strong>: 4 cores, 8 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB memory (dedicated).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("LtsSpec")
    public String ltsSpec;

    /**
     * <p>The combination of zones for the multi-zone instance. For a list of supported combinations, refer to the instance purchase page.</p>
     * <ul>
     * <li><p><strong>ap-southeast-5abc-aliyun</strong>: Indonesia (Jakarta) A+B+C.</p>
     * </li>
     * <li><p><strong>cn-hangzhou-ehi-aliyun</strong>: China (Hangzhou) E+H+I.</p>
     * </li>
     * <li><p><strong>cn-beijing-acd-aliyun</strong>: China (Beijing) A+C+D.</p>
     * </li>
     * <li><p><strong>ap-southeast-1-abc-aliyun</strong>: Singapore A+B+C.</p>
     * </li>
     * <li><p><strong>cn-zhangjiakou-abc-aliyun</strong>: China (Zhangjiakou) A+B+C.</p>
     * </li>
     * <li><p><strong>cn-shanghai-efg-aliyun</strong>: China (Shanghai) E+F+G.</p>
     * </li>
     * <li><p><strong>cn-shanghai-abd-aliyun</strong>: China (Shanghai) A+B+D.</p>
     * </li>
     * <li><p><strong>cn-hangzhou-bef-aliyun</strong>: China (Hangzhou) B+E+F.</p>
     * </li>
     * <li><p><strong>cn-hangzhou-bce-aliyun</strong>: China (Hangzhou) B+C+E.</p>
     * </li>
     * <li><p><strong>cn-beijing-fgh-aliyun</strong>: China (Beijing) F+G+H.</p>
     * </li>
     * <li><p><strong>cn-shenzhen-abc-aliyun</strong>: China (Shenzhen) A+B+C.</p>
     * </li>
     * </ul>
     * <p><strong>This parameter is required for multi-zone instances.</strong></p>
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
     * <li><p><strong>PREPAY</strong>: Subscription.</p>
     * </li>
     * <li><p><strong>POSTPAY</strong>: Pay-As-You-Go.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle for the Subscription instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong></p>
     * </li>
     * <li><p><strong>Year</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if you set <strong>PayType</strong> to <strong>PREPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the VSwitch for the primary zone of the multi-zone instance. The VSwitch must be in the zone specified by <code>PrimaryZoneId</code>. <strong>This parameter is required for multi-zone instances.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6fdqa7c0pipnqzq****</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <p>The ID of the primary zone for the multi-zone instance. <strong>This parameter is required for multi-zone instances.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-e</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <p>The ID of the region in which to create the instance. You can call the <a href="https://help.aliyun.com/document_detail/426062.html">DescribeRegions</a> operation to query the latest region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
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
     * <p>The number of search engine nodes. The value of this parameter ranges from <strong>0</strong> to <strong>60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SolrNum")
    public Integer solrNum;

    /**
     * <p>The specification of the search engine nodes. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB memory (dedicated).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("SolrSpec")
    public String solrSpec;

    /**
     * <p>The ID of the VSwitch for the standby zone of the multi-zone instance. The VSwitch must be in the zone specified by <code>StandbyZoneId</code>. <strong>This parameter is required for multi-zone instances.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zec0kcn08cgdtr6****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>The ID of the standby zone for the multi-zone instance. <strong>This parameter is required for multi-zone instances.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <p>The number of nodes in the stream engine. The value of this parameter ranges from <strong>0</strong> to <strong>60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StreamNum")
    public Integer streamNum;

    /**
     * <p>The specification of the stream engine nodes. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB memory (dedicated).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("StreamSpec")
    public String streamSpec;

    /**
     * <p>The tags to add to the instance. You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateLindormInstanceRequestTag> tag;

    /**
     * <p>The number of nodes in the time series engine. Valid values:</p>
     * <ul>
     * <li><p>For a Subscription instance, the value of this parameter ranges from <strong>0</strong> to <strong>24</strong>.</p>
     * </li>
     * <li><p>For a Pay-As-You-Go instance, the value of this parameter ranges from <strong>0</strong> to <strong>32</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TsdbNum")
    public Integer tsdbNum;

    /**
     * <p>The specification of the time series engine nodes. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB memory (dedicated).</p>
     * </li>
     * <li><p><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB memory (dedicated).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("TsdbSpec")
    public String tsdbSpec;

    /**
     * <p>The ID of the VPC where you want to create the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the VSwitch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the zone where you want to create the instance.</p>
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
         * <p>The key of a tag.</p>
         * <blockquote>
         * <p>You can specify the keys of multiple tags. For example, <code>Tag.1.Key</code> specifies the key of the first tag and <code>Tag.2.Key</code> specifies the key of the second tag.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag.</p>
         * <blockquote>
         * <p>You can specify the values of multiple tags. For example, <code>Tag.1.Value</code> specifies the value of the first tag and <code>Tag.2.Value</code> specifies the value of the second tag.</p>
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
