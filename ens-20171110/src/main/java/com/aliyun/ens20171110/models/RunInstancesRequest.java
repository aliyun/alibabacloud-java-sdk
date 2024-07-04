// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunInstancesRequest extends TeaModel {
    /**
     * <p>The number of instances that you want to create. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Long amount;

    /**
     * <p>The time when to automatically release the pay-as-you-go instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in Coordinated Universal Time (UTC).</p>
     * <ul>
     * <li>If the value of <code>ss</code> is not <code>00</code>, the start time is automatically rounded down to the nearest minute based on the value of <code>mm</code>.</li>
     * <li>The specified time must be at least one hour later than the current time.</li>
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
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is not available when InstanceChargeType is set to PostPaid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to use coupons. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The billing cycle of computing resources of the instance. Only pay-as-you-go instances are supported. Valid values:</p>
     * <ul>
     * <li><strong>Day</strong></li>
     * <li><strong>Month</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Day</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The Internet service provider (ISP).</p>
     * <blockquote>
     * <p> This parameter is not available if ScheduleAreaLevel is set to Region and is required if ScheduleAreaLevel is set to other values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("Carrier")
    public String carrier;

    /**
     * <p>The specifications of the data disk.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<RunInstancesRequestDataDisk> dataDisk;

    /**
     * <p>The ID of the node.</p>
     * <blockquote>
     * <p> This parameter is required if ScheduleAreaLevel is set to Region and is not available if ScheduleAreaLevel is set to other values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-foshan-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The name of the host.</p>
     * 
     * <strong>example:</strong>
     * <p>test-HostName</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the image. For ARM PCB-based server instances, leave this parameter empty. For other instances, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-5si16wo6simkt267p8b7hcmy3</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The billing policy of the instance. Valid values:</p>
     * <ul>
     * <li><strong>instance</strong>: Bills are generated based on instances.</li>
     * <li>If you do not specify this parameter, bills are generated based on users.</li>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>The default value of this parameter is the value of the InstanceId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>TestName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ens.sn1.small</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The bandwidth billing method. Valid values:</p>
     * <ul>
     * <li><strong>BandwidthByDay</strong>: pay by daily peak bandwidth</li>
     * <li><strong>95BandwidthByMonth</strong>: pay by monthly 95th percentile bandwidth</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if you purchase an ENS instance for the first time. The value that you specified is used as the default value for subsequent purchases.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BandwidthByDay</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum public bandwidth. If the value of this parameter is greater than 0, a public IP address is assigned to the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Long internetMaxBandwidthOut;

    /**
     * <p>The type of the IP address. Valid values:</p>
     * <ul>
     * <li><strong>ipv4</strong> (default)</li>
     * <li><strong>ipv6</strong></li>
     * <li><strong>ipv4Andipv6</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("IpType")
    public String ipType;

    /**
     * <p>The name of the key pair.</p>
     * <blockquote>
     * <p> You need to specify at least one of <strong>Password</strong>, <strong>KeyPairName</strong>, and <strong>PasswordInherit</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>wx2-jumpserver</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The code of the region.</p>
     * <blockquote>
     * <p> This parameter is not available if ScheduleAreaLevel is set to Region and is required if ScheduleAreaLevel is set to other values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>350000</p>
     */
    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    /**
     * <p>The ID of the network.</p>
     * <blockquote>
     * <p> This parameter is available only if ScheduleAreaLevel is set to Region and cannot be configured if ScheduleAreaLevel is set to other values. Otherwise, an error occurs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>net-id</p>
     */
    @NameInMap("NetWorkId")
    public String netWorkId;

    /**
     * <p>The password that is used to connect to the instance.</p>
     * <blockquote>
     * <p> You need to specify at least one of <strong>Password</strong>, <strong>KeyPairName</strong>, and <strong>PasswordInherit</strong>.</p>
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
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> You need to specify at least one of <strong>Password</strong>, <strong>KeyPairName</strong>, and <strong>PasswordInherit</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The unit of the subscription period.</p>
     * <ul>
     * <li>If <strong>PeriodUnit</strong> is set to <strong>Day</strong>, <strong>Period</strong> can only be set to <strong>3</strong>.</li>
     * <li>If <strong>PeriodUnit</strong> is <strong>Month</strong>, <strong>Period</strong> can be set to <strong>1 to 9</strong> or <strong>12</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1-9,12</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong> (default)</li>
     * <li><strong>Day</strong></li>
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
     * <p> This parameter is available only if ScheduleAreaLevel is set to Region and cannot be configured if ScheduleAreaLevel is set to other values. Otherwise, an error occurs. If you specify a private IP address, the number of instances must be 1. The private IP address takes effect only when the private IP address and the vSwitch ID are not empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.120</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>Specifies whether to enable public IP address identification. Valid values: true and false. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublicIpIdentification")
    public Boolean publicIpIdentification;

    /**
     * <p>The scheduling level. This parameter specifies area-level scheduling or node-level scheduling. Valid values:</p>
     * <ul>
     * <li><strong>Big</strong>: greater area</li>
     * <li><strong>Middle</strong>: province</li>
     * <li><strong>Small</strong>: city</li>
     * <li><strong>Region</strong>: node</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Region</p>
     */
    @NameInMap("ScheduleAreaLevel")
    public String scheduleAreaLevel;

    /**
     * <p>The scheduling price policy. Valid values:</p>
     * <ul>
     * <li><strong>PriceHighPriority</strong>: The high price prevails.</li>
     * <li><strong>PriceLowPriority</strong>: The low price prevails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PriceHighPriority</p>
     */
    @NameInMap("SchedulingPriceStrategy")
    public String schedulingPriceStrategy;

    /**
     * <p>The scheduling policy of the taint. Valid values:</p>
     * <ul>
     * <li><strong>Concentrate</strong></li>
     * <li><strong>Disperse</strong></li>
     * </ul>
     * <blockquote>
     * <p> If ScheduleAreaLevel is set to Region, set this parameter to <strong>Concentrate</strong>. If ScheduleAreaLevel is set to other values, set this parameter to Concentrate or Disperse based on your business requirements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>concentrate</p>
     */
    @NameInMap("SchedulingStrategy")
    public String schedulingStrategy;

    /**
     * <p>The ID of security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-test</p>
     */
    @NameInMap("SecurityId")
    public String securityId;

    /**
     * <p>The bidding policy for the pay-as-you-go instance. This parameter is valid only when the <code>InstanceChargeType</code> parameter is set to <code>PostPaid</code>. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instance is created as a regular pay-as-you-go instance.</li>
     * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>SpotAsPriceGo</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The specification of the system disk.</p>
     */
    @NameInMap("SystemDisk")
    public RunInstancesRequestSystemDisk systemDisk;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunInstancesRequestTag> tag;

    /**
     * <p>Specifies whether to append sequential suffixes to the hostname specified by the <strong>HostName</strong> parameter and to the instance name specified by the <strong>InstanceName</strong> parameter. The sequential suffixes range from 001 to 999.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    /**
     * <p>The custom data. The maximum data size is 16 KB. You can specify <strong>UserData</strong>. <strong>UserData</strong> must be Base64-encoded.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWtest</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the vSwitch.</p>
     * <blockquote>
     * <p> This parameter is available only if ScheduleAreaLevel is set to Region and cannot be configured if ScheduleAreaLevel is set to other values. Otherwise, an error occurs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-5sagnw7m613oulalkd10nv0ob</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

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

    public RunInstancesRequest setDataDisk(java.util.List<RunInstancesRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<RunInstancesRequestDataDisk> getDataDisk() {
        return this.dataDisk;
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

    public RunInstancesRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
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

    public static class RunInstancesRequestDataDisk extends TeaModel {
        /**
         * <p>The category of the disk. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: ultra disk.</li>
         * <li><strong>cloud_ssd</strong>: all-flash disk.</li>
         * <li><strong>local_hdd</strong>: local HDD.</li>
         * <li><strong>local_ssd</strong>: local SSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to encrypt the disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used for the disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * <blockquote>
         * <p> If you set the Encrypted parameter to true, the default service key is used when the KMSKeyId parameter is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The size of a data disk. Unit: GiB.</p>
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
         * <p>The category of the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The size of the system disk. Unit: GiB.</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
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
