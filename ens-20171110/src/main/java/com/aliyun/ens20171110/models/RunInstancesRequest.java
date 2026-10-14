// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunInstancesRequest extends TeaModel {
    /**
     * <p>The number of instances to create. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Long amount;

    /**
     * <p>Specifies whether to automatically install the Cloud Assistant client on the instance.</p>
     */
    @NameInMap("AutoInstallCloudAssistant")
    public Boolean autoInstallCloudAssistant;

    /**
     * <p>The automatic release time of the pay-as-you-go instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * <ul>
     * <li><p>If the value of seconds (<code>ss</code>) is not <code>00</code>, the time is automatically set to the start of the current minute (<code>mm</code>).</p>
     * </li>
     * <li><p>The earliest release time is one hour after the current time.</p>
     * </li>
     * </ul>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-28T14:38:52Z</p>
     */
    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong>: does not enable auto-renewal. (Default)</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is invalid for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to use coupons. Default value: true (AutoUseCoupon=true).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The billing cycle for instance compute resources. Only instance-level pay-as-you-go is supported. Valid values:</p>
     * <ul>
     * <li><p><strong>Day</strong>: daily billing.</p>
     * </li>
     * <li><p><strong>Month</strong>: monthly billing.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Day</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The carrier.</p>
     * <blockquote>
     * <p>This parameter is required for region-level scheduling.</br>
     * For node-level scheduling, if a node has multiple carriers and you do not specify a carrier, instances are created for each carrier on the node. For example, if a node has both China Mobile and China Unicom carriers, instances with two ISPs are created.</br>You can call <a href="https://help.aliyun.com/document_detail/2637461.html">DescribeRegionIsps</a> to query the carrier information of a node.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("Carrier")
    public String carrier;

    /**
     * <p>The region for Cloud Assistant access. Valid values: cn-zhangjiakou (Zhangjiakou) and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("CloudAssistantRegion")
    public String cloudAssistantRegion;

    /**
     * <p>The data cloud disk specifications.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<RunInstancesRequestDataDisk> dataDisk;

    /**
     * <p>The release protection property of the instance. Specifies whether the instance can be released from the console or by calling an API operation. Valid values: </p>
     * <ul>
     * <li>true: Enables instance release protection.</li>
     * <li>false: Disables instance release protection.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This property applies only to pay-as-you-go instances and can only restrict manual release operations. It does not take effect on system-initiated release operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The deployment set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-5s1p6x2l3r4b****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p>This parameter is required for node-level scheduling and is invalid for region-level scheduling.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-foshan-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The hostname.</p>
     * 
     * <strong>example:</strong>
     * <p>test-HostName</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The image ID. This parameter cannot be specified for ARM-based instances. This parameter is required for other instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>m-5si16wo6simkt267p8b7h****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The instance billing strategy. Valid values:</p>
     * <ul>
     * <li><strong>instance</strong>: instance-level billing.</li>
     * <li>If not specified, the default is user-level billing.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("InstanceChargeStrategy")
    public String instanceChargeStrategy;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription.</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance name. The name must be 2 to 128 characters in length and must start with a letter or Chinese character. It cannot start with <code>http://</code> or <code>https://</code>. It can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), or hyphens (-).</p>
     * <p>Default value: the InstanceId of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>TestName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ens.sn1.small</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Billable methods for bandwidth. Valid values:</p>
     * <ul>
     * <li><strong>BandwidthByDay</strong>: daily peak bandwidth</li>
     * <li><strong>95BandwidthByMonth</strong>: monthly 95th percentile bandwidth</li>
     * </ul>
     * <blockquote>
     * <p>You can select a billing method only for the first purchase. Subsequent purchases use the billing method selected during the first purchase by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BandwidthByDay</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum public bandwidth. If the value of this parameter is greater than 0, a public IP address is automatically assigned to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Long internetMaxBandwidthOut;

    /**
     * <p>The IP type. Valid values:</p>
     * <ul>
     * <li><p><strong>ipv4</strong> (default): IPv4.</p>
     * </li>
     * <li><p><strong>ipv6</strong>: IPv6.</p>
     * </li>
     * <li><p><strong>ipv4Andipv6</strong>: IPv4 and IPv6 (single stack).</p>
     * </li>
     * <li><p><strong>ipv4Withipv6</strong>: IPv4 and IPv6 (dual-stack).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("IpType")
    public String ipType;

    /**
     * <p>The number of randomly generated IPv6 addresses to assign to the primary ENI of the private network.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Long ipv6AddressCount;

    /**
     * <p>The key pair name.</p>
     * <blockquote>
     * <p>Specify at least one of <strong>Password</strong>, <strong>KeyPairName</strong>, and <strong>PasswordInherit</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>wx2-jumpserver</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The ID of the instance launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-test</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The name of the instance launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-test</p>
     */
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    /**
     * <p>The version of the instance launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public Integer launchTemplateVersion;

    /**
     * <p>The region code.</p>
     * <blockquote>
     * <p>This parameter is required for region-level scheduling and is invalid for node-level scheduling.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>350000</p>
     */
    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    /**
     * <p>The network ID.</p>
     * <blockquote>
     * <p>This parameter can only be used for node-level scheduling. An error is returned if this parameter is specified for region-level scheduling. If you do not specify vSwitch information, only the validity of the network ID is verified. The actual resource creation does not use this network ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>net-id</p>
     */
    @NameInMap("NetWorkId")
    public String netWorkId;

    /**
     * <p>The instance password.</p>
     * <blockquote>
     * <p>Specify at least one of <strong>Password</strong>, <strong>KeyPairName</strong>, and <strong>PasswordInherit</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the preset password of the image. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: uses the preset password.</li>
     * <li><strong>false</strong>: does not use the preset password.</li>
     * </ul>
     * <blockquote>
     * <p>Specify at least one of <strong>Password</strong>, <strong>KeyPairName</strong>, and <strong>PasswordInherit</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The duration of the purchased resource.</p>
     * <ul>
     * <li><p>If <strong>PeriodUnit</strong> is set to <strong>Day</strong>, <strong>Period</strong> can only be set to <strong>3</strong>.</p>
     * </li>
     * <li><p>If <strong>PeriodUnit</strong> is set to <strong>Month</strong>, <strong>Period</strong> can be set to <strong>1-9</strong> or <strong>12</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The unit of the purchase duration. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong> (default): monthly purchase.</li>
     * <li><strong>Day</strong>: daily purchase.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The private IP address.</p>
     * <blockquote>
     * <p>This parameter can only be used for node-level scheduling. An error is returned if this parameter is specified for region-level scheduling.
     * If a private IP address is specified, the number of instances can only be 1. The private IP address takes effect only when both the private IP address and vSwitch ID are specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>Specifies whether to enable public IP identification. Valid values:</p>
     * <ul>
     * <li><p>true: enables public IP identification.</p>
     * </li>
     * <li><p>false: does not enable public IP identification.</p>
     * </li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublicIpIdentification")
    public Boolean publicIpIdentification;

    /**
     * <p>The scheduling level. Use this parameter to specify node-level or region-level scheduling. Valid values:</p>
     * <ul>
     * <li><strong>Big</strong>: major area</li>
     * <li><strong>Middle</strong>: province</li>
     * <li><strong>Small</strong>: city</li>
     * <li><strong>Region</strong>: node</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Region</p>
     */
    @NameInMap("ScheduleAreaLevel")
    public String scheduleAreaLevel;

    /**
     * <p>The scheduling price strategy. Valid values:</p>
     * <ul>
     * <li><strong>PriceHighPriority</strong>: high price first</li>
     * <li><strong>PriceLowPriority</strong>: low price first</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PriceHighPriority</p>
     */
    @NameInMap("SchedulingPriceStrategy")
    public String schedulingPriceStrategy;

    /**
     * <p>The scheduling strategy. Valid values:</p>
     * <ul>
     * <li><strong>Concentrate</strong>: concentrated</li>
     * <li><strong>Disperse</strong>: dispersed</li>
     * </ul>
     * <blockquote>
     * <p>For node-level scheduling, the value is <strong>Concentrate</strong>. For region-level scheduling, select a value based on your requirements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Concentrate</p>
     */
    @NameInMap("SchedulingStrategy")
    public String schedulingStrategy;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-test</p>
     */
    @NameInMap("SecurityId")
    public String securityId;

    /**
     * <p>The protection period of the spot instance.</p>
     * <p>Unit: hours.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The bidding policy for the pay-as-you-go instance. This parameter takes effect when the <code>InstanceChargeType</code> parameter is set to <code>PostPaid</code>. Valid values:</p>
     * <ul>
     * <li>NoSpot: a regular pay-as-you-go instance.</li>
     * <li>SpotAsPriceGo: the system automatically bids at the current market price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>SpotAsPriceGo</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The system cloud disk specifications.</p>
     */
    @NameInMap("SystemDisk")
    public RunInstancesRequestSystemDisk systemDisk;

    /**
     * <p>The tags that are bound to the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunInstancesRequestTag> tag;

    /**
     * <p>Specifies whether to add sequential suffixes to <strong>HostName</strong> and <strong>InstanceName</strong>. The sequential suffixes start from 001 and cannot exceed 999.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    /**
     * <p>The custom user data. Maximum size: 16 KB. You can pass in <strong>UserData</strong> information. <strong>UserData</strong> is Base64-encoded.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWtest</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The vSwitch ID.</p>
     * <blockquote>
     * <p>This parameter can only be used for node-level scheduling. An error is returned if this parameter is specified for region-level scheduling.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-5sagnw7m613oulalkd10n****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPD network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-5s7xxxxxxx</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    /**
     * <p>The list of VPD vSwitch IDs.</p>
     */
    @NameInMap("VpdVSwitchIds")
    public java.util.List<String> vpdVSwitchIds;

    public static RunInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesRequest self = new RunInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RunInstancesRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public RunInstancesRequest setAutoInstallCloudAssistant(Boolean autoInstallCloudAssistant) {
        this.autoInstallCloudAssistant = autoInstallCloudAssistant;
        return this;
    }
    public Boolean getAutoInstallCloudAssistant() {
        return this.autoInstallCloudAssistant;
    }

    public RunInstancesRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public RunInstancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RunInstancesRequest setAutoUseCoupon(String autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public RunInstancesRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public RunInstancesRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public RunInstancesRequest setCloudAssistantRegion(String cloudAssistantRegion) {
        this.cloudAssistantRegion = cloudAssistantRegion;
        return this;
    }
    public String getCloudAssistantRegion() {
        return this.cloudAssistantRegion;
    }

    public RunInstancesRequest setDataDisk(java.util.List<RunInstancesRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<RunInstancesRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public RunInstancesRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public RunInstancesRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public RunInstancesRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public RunInstancesRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public RunInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RunInstancesRequest setInstanceChargeStrategy(String instanceChargeStrategy) {
        this.instanceChargeStrategy = instanceChargeStrategy;
        return this;
    }
    public String getInstanceChargeStrategy() {
        return this.instanceChargeStrategy;
    }

    public RunInstancesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public RunInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public RunInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RunInstancesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public RunInstancesRequest setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Long getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public RunInstancesRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public RunInstancesRequest setIpv6AddressCount(Long ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Long getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public RunInstancesRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public RunInstancesRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public RunInstancesRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public RunInstancesRequest setLaunchTemplateVersion(Integer launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public Integer getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public RunInstancesRequest setNetDistrictCode(String netDistrictCode) {
        this.netDistrictCode = netDistrictCode;
        return this;
    }
    public String getNetDistrictCode() {
        return this.netDistrictCode;
    }

    public RunInstancesRequest setNetWorkId(String netWorkId) {
        this.netWorkId = netWorkId;
        return this;
    }
    public String getNetWorkId() {
        return this.netWorkId;
    }

    public RunInstancesRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RunInstancesRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public RunInstancesRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public RunInstancesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RunInstancesRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public RunInstancesRequest setPublicIpIdentification(Boolean publicIpIdentification) {
        this.publicIpIdentification = publicIpIdentification;
        return this;
    }
    public Boolean getPublicIpIdentification() {
        return this.publicIpIdentification;
    }

    public RunInstancesRequest setScheduleAreaLevel(String scheduleAreaLevel) {
        this.scheduleAreaLevel = scheduleAreaLevel;
        return this;
    }
    public String getScheduleAreaLevel() {
        return this.scheduleAreaLevel;
    }

    public RunInstancesRequest setSchedulingPriceStrategy(String schedulingPriceStrategy) {
        this.schedulingPriceStrategy = schedulingPriceStrategy;
        return this;
    }
    public String getSchedulingPriceStrategy() {
        return this.schedulingPriceStrategy;
    }

    public RunInstancesRequest setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
        return this;
    }
    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }

    public RunInstancesRequest setSecurityId(String securityId) {
        this.securityId = securityId;
        return this;
    }
    public String getSecurityId() {
        return this.securityId;
    }

    public RunInstancesRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public RunInstancesRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public RunInstancesRequest setSystemDisk(RunInstancesRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public RunInstancesRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public RunInstancesRequest setTag(java.util.List<RunInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RunInstancesRequestTag> getTag() {
        return this.tag;
    }

    public RunInstancesRequest setUniqueSuffix(Boolean uniqueSuffix) {
        this.uniqueSuffix = uniqueSuffix;
        return this;
    }
    public Boolean getUniqueSuffix() {
        return this.uniqueSuffix;
    }

    public RunInstancesRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public RunInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public RunInstancesRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public RunInstancesRequest setVpdVSwitchIds(java.util.List<String> vpdVSwitchIds) {
        this.vpdVSwitchIds = vpdVSwitchIds;
        return this;
    }
    public java.util.List<String> getVpdVSwitchIds() {
        return this.vpdVSwitchIds;
    }

    public static class RunInstancesRequestDataDisk extends TeaModel {
        /**
         * <p>The disk category. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: ultra cloud disk</li>
         * <li><strong>cloud_ssd</strong>: all-flash cloud disk</li>
         * <li><strong>local_hdd</strong>: local HDD</li>
         * <li><strong>local_ssd</strong>: local SSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to encrypt the cloud disk. Valid values:</p>
         * <ul>
         * <li><p>true: encrypts the cloud disk.</p>
         * </li>
         * <li><p>false (default): does not encrypt the cloud disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the KMS key used by the cloud disk. Valid values:</p>
         * <ul>
         * <li><p>true: encrypts the cloud disk.</p>
         * </li>
         * <li><p>false (default): does not encrypt the cloud disk.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If Encrypted is set to true and KMSKeyId is empty, the default service key is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The size of the data cloud disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        public static RunInstancesRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestDataDisk self = new RunInstancesRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public RunInstancesRequestDataDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public RunInstancesRequestDataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public RunInstancesRequestDataDisk setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class RunInstancesRequestSystemDisk extends TeaModel {
        /**
         * <p>The type of the system cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The size of the system cloud disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Size")
        public Long size;

        public static RunInstancesRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestSystemDisk self = new RunInstancesRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public RunInstancesRequestSystemDisk setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class RunInstancesRequestTag extends TeaModel {
        /**
         * <p>The custom tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value cannot exceed 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>tagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static RunInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestTag self = new RunInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
