// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class DescribeHiTSDBInstanceResponseBody extends TeaModel {
    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("GmtCreated")
    public String gmtCreated;

    @NameInMap("CpuNumber")
    public String cpuNumber;

    @NameInMap("MemSize")
    public String memSize;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("GmtExpire")
    public String gmtExpire;

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("ExpiredTime")
    public Long expiredTime;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("MaxTimelineLimit")
    public String maxTimelineLimit;

    @NameInMap("PublicConnectionString")
    public String publicConnectionString;

    @NameInMap("EngineType")
    public String engineType;

    @NameInMap("InstanceTps")
    public String instanceTps;

    @NameInMap("Status")
    public String status;

    @NameInMap("InstanceStorage")
    public String instanceStorage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("DiskCategory")
    public String diskCategory;

    @NameInMap("InstanceClass")
    public String instanceClass;

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("Series")
    public Integer series;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("SecurityIpList")
    public java.util.List<DescribeHiTSDBInstanceResponseBodySecurityIpList> securityIpList;

    @NameInMap("InstanceDescription")
    public String instanceDescription;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ConnectionString")
    public String connectionString;

    public static DescribeHiTSDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHiTSDBInstanceResponseBody self = new DescribeHiTSDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHiTSDBInstanceResponseBody setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public DescribeHiTSDBInstanceResponseBody setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public DescribeHiTSDBInstanceResponseBody setCpuNumber(String cpuNumber) {
        this.cpuNumber = cpuNumber;
        return this;
    }
    public String getCpuNumber() {
        return this.cpuNumber;
    }

    public DescribeHiTSDBInstanceResponseBody setMemSize(String memSize) {
        this.memSize = memSize;
        return this;
    }
    public String getMemSize() {
        return this.memSize;
    }

    public DescribeHiTSDBInstanceResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeHiTSDBInstanceResponseBody setGmtExpire(String gmtExpire) {
        this.gmtExpire = gmtExpire;
        return this;
    }
    public String getGmtExpire() {
        return this.gmtExpire;
    }

    public DescribeHiTSDBInstanceResponseBody setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public DescribeHiTSDBInstanceResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeHiTSDBInstanceResponseBody setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeHiTSDBInstanceResponseBody setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public DescribeHiTSDBInstanceResponseBody setMaxTimelineLimit(String maxTimelineLimit) {
        this.maxTimelineLimit = maxTimelineLimit;
        return this;
    }
    public String getMaxTimelineLimit() {
        return this.maxTimelineLimit;
    }

    public DescribeHiTSDBInstanceResponseBody setPublicConnectionString(String publicConnectionString) {
        this.publicConnectionString = publicConnectionString;
        return this;
    }
    public String getPublicConnectionString() {
        return this.publicConnectionString;
    }

    public DescribeHiTSDBInstanceResponseBody setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeHiTSDBInstanceResponseBody setInstanceTps(String instanceTps) {
        this.instanceTps = instanceTps;
        return this;
    }
    public String getInstanceTps() {
        return this.instanceTps;
    }

    public DescribeHiTSDBInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeHiTSDBInstanceResponseBody setInstanceStorage(String instanceStorage) {
        this.instanceStorage = instanceStorage;
        return this;
    }
    public String getInstanceStorage() {
        return this.instanceStorage;
    }

    public DescribeHiTSDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHiTSDBInstanceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeHiTSDBInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHiTSDBInstanceResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeHiTSDBInstanceResponseBody setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public DescribeHiTSDBInstanceResponseBody setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public DescribeHiTSDBInstanceResponseBody setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public DescribeHiTSDBInstanceResponseBody setSeries(Integer series) {
        this.series = series;
        return this;
    }
    public Integer getSeries() {
        return this.series;
    }

    public DescribeHiTSDBInstanceResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeHiTSDBInstanceResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeHiTSDBInstanceResponseBody setSecurityIpList(java.util.List<DescribeHiTSDBInstanceResponseBodySecurityIpList> securityIpList) {
        this.securityIpList = securityIpList;
        return this;
    }
    public java.util.List<DescribeHiTSDBInstanceResponseBodySecurityIpList> getSecurityIpList() {
        return this.securityIpList;
    }

    public DescribeHiTSDBInstanceResponseBody setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public DescribeHiTSDBInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHiTSDBInstanceResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public static class DescribeHiTSDBInstanceResponseBodySecurityIpList extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        public static DescribeHiTSDBInstanceResponseBodySecurityIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHiTSDBInstanceResponseBodySecurityIpList self = new DescribeHiTSDBInstanceResponseBodySecurityIpList();
            return TeaModel.build(map, self);
        }

        public DescribeHiTSDBInstanceResponseBodySecurityIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
