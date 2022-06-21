// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunInstancesRequest extends TeaModel {
    // 数量
    @NameInMap("Amount")
    public Long amount;

    // 是否自动续费，默认为false
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    // 运营商
    @NameInMap("Carrier")
    public String carrier;

    // 数据盘规格
    @NameInMap("DataDisk")
    public java.util.List<RunInstancesRequestDataDisk> dataDisk;

    // 节点id
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    // 主机名称
    @NameInMap("HostName")
    public String hostName;

    // 镜像id
    @NameInMap("ImageId")
    public String imageId;

    // 实例付费方式，PrePaid:预付费，包年包月 PostPaid:按量付费
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // 实例名称。长度为2~128个字符，必须以大小字母或中文开头，不能以http://和https://开头。可以包含中文、英文、数字、半角冒号（:）、下划线（_）、点号（.）或者连字符（-）。默认值为实例的InstanceId
    @NameInMap("InstanceName")
    public String instanceName;

    // 实例规格
    @NameInMap("InstanceType")
    public String instanceType;

    // 带宽计费方式
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    // 公网最大带宽，如果参数InternetMaxBandwidthOut的值大于0，则自动为实例分配公网IP。
    @NameInMap("InternetMaxBandwidthOut")
    public Long internetMaxBandwidthOut;

    // 密钥对名称
    @NameInMap("KeyPairName")
    public String keyPairName;

    // 地区code
    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    // 网络id
    @NameInMap("NetWorkId")
    public String netWorkId;

    // 实例密码
    @NameInMap("Password")
    public String password;

    // 购买资源的时长，单位为：月
    @NameInMap("Period")
    public Long period;

    // 查询云服务器ENS不同计费周期的价格。取值范围：
    // Month（默认）：按月计费的价格单位。
    // Day：按天计费的价格单位。
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // 私网ip
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("PublicIpIdentification")
    public Boolean publicIpIdentification;

    // 调度层级
    @NameInMap("ScheduleAreaLevel")
    public String scheduleAreaLevel;

    // 调度价格策略
    @NameInMap("SchedulingPriceStrategy")
    public String schedulingPriceStrategy;

    // 调度策略
    @NameInMap("SchedulingStrategy")
    public String schedulingStrategy;

    // 安全组id
    @NameInMap("SecurityId")
    public String securityId;

    // 系统盘规格
    @NameInMap("SystemDisk")
    public RunInstancesRequestSystemDisk systemDisk;

    // 是否为HostName和InstanceName添加有序后缀，有序后缀从001开始递增，最大不能超过999
    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    // 用户自定义数据，最大支持16KB 您可传入UserData信息。UserData以Base64的方式编码
    @NameInMap("UserData")
    public String userData;

    // 交换机id
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
