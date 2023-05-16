// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunInstancesRequest extends TeaModel {
    @NameInMap("Amount")
    public Long amount;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("Carrier")
    public String carrier;

    @NameInMap("DataDisk")
    public java.util.List<RunInstancesRequestDataDisk> dataDisk;

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
    public RunInstancesRequestSystemDisk systemDisk;

    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    @NameInMap("UserData")
    public String userData;

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

    public RunInstancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
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

    public RunInstancesRequest setSystemDisk(RunInstancesRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public RunInstancesRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
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
        @NameInMap("Category")
        public String category;

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

        public RunInstancesRequestDataDisk setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class RunInstancesRequestSystemDisk extends TeaModel {
        @NameInMap("Size")
        public Long size;

        public static RunInstancesRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestSystemDisk self = new RunInstancesRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestSystemDisk setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
