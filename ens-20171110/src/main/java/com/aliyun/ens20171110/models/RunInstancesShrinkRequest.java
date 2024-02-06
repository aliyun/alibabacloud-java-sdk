// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The number of instances that you want to create. Valid values: 1 to 100.</p>
     */
    @NameInMap("Amount")
    public Long amount;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     * <br>
     * <p>>  This parameter is not available when InstanceChargeType is set to PostPaid.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to use vouchers. Default values: true. Valid values:</p>
     * <br>
     * <p>- true </p>
     * <br>
     * <p>- false</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The billing cycle of computing resources of the instance. Only pay-as-you-go instances are supported. Valid values:</p>
     * <br>
     * <p>*   Hour</p>
     * <p>*   Day</p>
     * <p>*   Month</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The Internet service provider (ISP).</p>
     * <br>
     * <p>>  This parameter is not available if ScheduleAreaLevel is set to Region and is required if ScheduleAreaLevel is set to other values.</p>
     */
    @NameInMap("Carrier")
    public String carrier;

    /**
     * <p>The specification of the data disk.</p>
     */
    @NameInMap("DataDisk")
    public String dataDiskShrink;

    /**
     * <p>The ID of the node.</p>
     * <br>
     * <p>>  This parameter is required if ScheduleAreaLevel is set to Region and is not available if ScheduleAreaLevel is set to other values.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The name of the host.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the image. For ARM PCB-based server instances, leave this parameter empty. For other instances, this parameter is required.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The billing policy of the instance. Valid values:</p>
     * <br>
     * <p>*   **instance**: Bills are generated based on instances.</p>
     * <p>*   If you do not specify this parameter, bills are generated based on users.</p>
     */
    @NameInMap("InstanceChargeStrategy")
    public String instanceChargeStrategy;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **PrePaid**: subscription.</p>
     * <p>*   **PostPaid**: pay-as-you-go.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).</p>
     * <br>
     * <p>The default value of this parameter is the value of the InstanceId parameter.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The bandwidth billing method. Valid values:</p>
     * <br>
     * <p>*   **BandwidthByDay**: pay by daily peak bandwidth</p>
     * <p>*   **95BandwidthByMonth**: pay by monthly 95th percentile bandwidth</p>
     * <br>
     * <p>>  This parameter is required if you purchase an ENS instance for the first time. The value that you specified is used as the default value for subsequent purchases.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum public bandwidth. If the value of this parameter is greater than 0, a public IP address is assigned to the instance.</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Long internetMaxBandwidthOut;

    /**
     * <p>The type of IP address. Valid values:</p>
     * <br>
     * <p>*   **ipv4**: IPv4. This is the default value.</p>
     * <p>*   **ipv6**: IPv6.</p>
     * <p>*   **ipv4Andipv6**: IPv4 and IPv6.</p>
     */
    @NameInMap("IpType")
    public String ipType;

    /**
     * <p>The name of the key pair.</p>
     * <br>
     * <p>>  You need to specify at least one of **Password**, **KeyPairName**, and **PasswordInherit**.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The code of the region.</p>
     * <br>
     * <p>>  This parameter is not available if ScheduleAreaLevel is set to Region and is required if ScheduleAreaLevel is set to other values.</p>
     */
    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    /**
     * <p>The ID of the network.</p>
     * <br>
     * <p>>  This parameter is available only if ScheduleAreaLevel is set to Region and cannot be configured if ScheduleAreaLevel is set to other values. Otherwise, an error occurs.</p>
     */
    @NameInMap("NetWorkId")
    public String netWorkId;

    /**
     * <p>The password that is used to connect to the instance.</p>
     * <br>
     * <p>>  You need to specify at least one of **Password**, **KeyPairName**, and **PasswordInherit**.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the preset password of the image. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>>  You need to specify at least one of **Password**, **KeyPairName**, and **PasswordInherit**.</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The unit of the subscription period.</p>
     * <br>
     * <p>*   If **PeriodUnit** is set to **Day**, **Period** can only be set to **3**.</p>
     * <p>*   If **PeriodUnit** is **Month**, **Period** can be set to **1 to 9** or **12**.</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <br>
     * <p>*   **Month** (default)</p>
     * <p>*   **Day**</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The private IP address.</p>
     * <br>
     * <p>>  This parameter is available only if ScheduleAreaLevel is set to Region and cannot be configured if ScheduleAreaLevel is set to other values. Otherwise, an error occurs. If you specify a private IP address, the number of instances must be 1. The private IP address takes effect only when the private IP address and the vSwitch ID are not empty.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>Specifies whether to enable public IP address identification. Valid values: true and false. Default value: false.</p>
     */
    @NameInMap("PublicIpIdentification")
    public Boolean publicIpIdentification;

    /**
     * <p>The scheduling level. This parameter specifies area-level scheduling or node-level scheduling. Valid values:</p>
     * <br>
     * <p>*   **Big**: greater area</p>
     * <p>*   **Middle**: province</p>
     * <p>*   **Small**: city</p>
     * <p>*   **Region**: node</p>
     */
    @NameInMap("ScheduleAreaLevel")
    public String scheduleAreaLevel;

    /**
     * <p>The scheduling price policy. Valid values:</p>
     * <br>
     * <p>*   **PriceHighPriority**: The high price prevails.</p>
     * <p>*   **PriceLowPriority**: The low price prevails.</p>
     */
    @NameInMap("SchedulingPriceStrategy")
    public String schedulingPriceStrategy;

    /**
     * <p>The scheduling policy of the taint. Valid values:</p>
     * <br>
     * <p>*   **Concentrate**</p>
     * <p>*   **Disperse**</p>
     * <br>
     * <p>>  If ScheduleAreaLevel is set to Region, set this parameter to **Concentrate**. If ScheduleAreaLevel is set to other values, set this parameter to Concentrate or Disperse based on your business requirements.</p>
     */
    @NameInMap("SchedulingStrategy")
    public String schedulingStrategy;

    /**
     * <p>The ID of security group.</p>
     */
    @NameInMap("SecurityId")
    public String securityId;

    /**
     * <p>The specification of the system disk.</p>
     */
    @NameInMap("SystemDisk")
    public String systemDiskShrink;

    @NameInMap("Tag")
    public java.util.List<RunInstancesShrinkRequestTag> tag;

    /**
     * <p>Specifies whether to append sequential suffixes to the hostname specified by the **HostName** parameter and to the instance name specified by the **InstanceName** parameter. The sequential suffixes range from 001 to 999.</p>
     */
    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    /**
     * <p>The custom data. The maximum data size is 16 KB. You can specify **UserData**. **UserData** must be Base64-encoded.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the vSwitch.</p>
     * <br>
     * <p>>  This parameter is available only if ScheduleAreaLevel is set to Region and cannot be configured if ScheduleAreaLevel is set to other values. Otherwise, an error occurs.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static RunInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesShrinkRequest self = new RunInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunInstancesShrinkRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public RunInstancesShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RunInstancesShrinkRequest setAutoUseCoupon(String autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public RunInstancesShrinkRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public RunInstancesShrinkRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public RunInstancesShrinkRequest setDataDiskShrink(String dataDiskShrink) {
        this.dataDiskShrink = dataDiskShrink;
        return this;
    }
    public String getDataDiskShrink() {
        return this.dataDiskShrink;
    }

    public RunInstancesShrinkRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public RunInstancesShrinkRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public RunInstancesShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RunInstancesShrinkRequest setInstanceChargeStrategy(String instanceChargeStrategy) {
        this.instanceChargeStrategy = instanceChargeStrategy;
        return this;
    }
    public String getInstanceChargeStrategy() {
        return this.instanceChargeStrategy;
    }

    public RunInstancesShrinkRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public RunInstancesShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public RunInstancesShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RunInstancesShrinkRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public RunInstancesShrinkRequest setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Long getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public RunInstancesShrinkRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public RunInstancesShrinkRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public RunInstancesShrinkRequest setNetDistrictCode(String netDistrictCode) {
        this.netDistrictCode = netDistrictCode;
        return this;
    }
    public String getNetDistrictCode() {
        return this.netDistrictCode;
    }

    public RunInstancesShrinkRequest setNetWorkId(String netWorkId) {
        this.netWorkId = netWorkId;
        return this;
    }
    public String getNetWorkId() {
        return this.netWorkId;
    }

    public RunInstancesShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RunInstancesShrinkRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public RunInstancesShrinkRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public RunInstancesShrinkRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RunInstancesShrinkRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public RunInstancesShrinkRequest setPublicIpIdentification(Boolean publicIpIdentification) {
        this.publicIpIdentification = publicIpIdentification;
        return this;
    }
    public Boolean getPublicIpIdentification() {
        return this.publicIpIdentification;
    }

    public RunInstancesShrinkRequest setScheduleAreaLevel(String scheduleAreaLevel) {
        this.scheduleAreaLevel = scheduleAreaLevel;
        return this;
    }
    public String getScheduleAreaLevel() {
        return this.scheduleAreaLevel;
    }

    public RunInstancesShrinkRequest setSchedulingPriceStrategy(String schedulingPriceStrategy) {
        this.schedulingPriceStrategy = schedulingPriceStrategy;
        return this;
    }
    public String getSchedulingPriceStrategy() {
        return this.schedulingPriceStrategy;
    }

    public RunInstancesShrinkRequest setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
        return this;
    }
    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }

    public RunInstancesShrinkRequest setSecurityId(String securityId) {
        this.securityId = securityId;
        return this;
    }
    public String getSecurityId() {
        return this.securityId;
    }

    public RunInstancesShrinkRequest setSystemDiskShrink(String systemDiskShrink) {
        this.systemDiskShrink = systemDiskShrink;
        return this;
    }
    public String getSystemDiskShrink() {
        return this.systemDiskShrink;
    }

    public RunInstancesShrinkRequest setTag(java.util.List<RunInstancesShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RunInstancesShrinkRequestTag> getTag() {
        return this.tag;
    }

    public RunInstancesShrinkRequest setUniqueSuffix(Boolean uniqueSuffix) {
        this.uniqueSuffix = uniqueSuffix;
        return this;
    }
    public Boolean getUniqueSuffix() {
        return this.uniqueSuffix;
    }

    public RunInstancesShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public RunInstancesShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class RunInstancesShrinkRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static RunInstancesShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesShrinkRequestTag self = new RunInstancesShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public RunInstancesShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunInstancesShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
