// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunInstancesShrinkRequest extends TeaModel {
    @NameInMap("Amount")
    public Long amount;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("Carrier")
    public String carrier;

    @NameInMap("DataDisk")
    public String dataDiskShrink;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceChargeStrategy")
    public String instanceChargeStrategy;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandwidthOut")
    public Long internetMaxBandwidthOut;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    @NameInMap("NetWorkId")
    public String netWorkId;

    @NameInMap("Password")
    public String password;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("Period")
    public Long period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("PublicIpIdentification")
    public Boolean publicIpIdentification;

    @NameInMap("ScheduleAreaLevel")
    public String scheduleAreaLevel;

    @NameInMap("SchedulingPriceStrategy")
    public String schedulingPriceStrategy;

    @NameInMap("SchedulingStrategy")
    public String schedulingStrategy;

    @NameInMap("SecurityId")
    public String securityId;

    @NameInMap("SystemDisk")
    public String systemDiskShrink;

    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    @NameInMap("UserData")
    public String userData;

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

}
