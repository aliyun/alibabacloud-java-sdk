// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeServerlessInstanceResponseBody extends TeaModel {
    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CuSize")
    public String cuSize;

    @NameInMap("DiskSize")
    public String diskSize;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("HaType")
    public String haType;

    @NameInMap("HasUser")
    public String hasUser;

    @NameInMap("InnerEndpoint")
    public String innerEndpoint;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IsDeletionProtection")
    public String isDeletionProtection;

    @NameInMap("LockMode")
    public String lockMode;

    @NameInMap("MainVersion")
    public String mainVersion;

    @NameInMap("OuterEndpoint")
    public String outerEndpoint;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReserverMaxQpsNum")
    public String reserverMaxQpsNum;

    @NameInMap("ReserverMinQpsNum")
    public String reserverMinQpsNum;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateStatus")
    public String updateStatus;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeServerlessInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerlessInstanceResponseBody self = new DescribeServerlessInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServerlessInstanceResponseBody setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public DescribeServerlessInstanceResponseBody setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeServerlessInstanceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeServerlessInstanceResponseBody setCuSize(String cuSize) {
        this.cuSize = cuSize;
        return this;
    }
    public String getCuSize() {
        return this.cuSize;
    }

    public DescribeServerlessInstanceResponseBody setDiskSize(String diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public String getDiskSize() {
        return this.diskSize;
    }

    public DescribeServerlessInstanceResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeServerlessInstanceResponseBody setHaType(String haType) {
        this.haType = haType;
        return this;
    }
    public String getHaType() {
        return this.haType;
    }

    public DescribeServerlessInstanceResponseBody setHasUser(String hasUser) {
        this.hasUser = hasUser;
        return this;
    }
    public String getHasUser() {
        return this.hasUser;
    }

    public DescribeServerlessInstanceResponseBody setInnerEndpoint(String innerEndpoint) {
        this.innerEndpoint = innerEndpoint;
        return this;
    }
    public String getInnerEndpoint() {
        return this.innerEndpoint;
    }

    public DescribeServerlessInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeServerlessInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeServerlessInstanceResponseBody setIsDeletionProtection(String isDeletionProtection) {
        this.isDeletionProtection = isDeletionProtection;
        return this;
    }
    public String getIsDeletionProtection() {
        return this.isDeletionProtection;
    }

    public DescribeServerlessInstanceResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeServerlessInstanceResponseBody setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

    public DescribeServerlessInstanceResponseBody setOuterEndpoint(String outerEndpoint) {
        this.outerEndpoint = outerEndpoint;
        return this;
    }
    public String getOuterEndpoint() {
        return this.outerEndpoint;
    }

    public DescribeServerlessInstanceResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeServerlessInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeServerlessInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServerlessInstanceResponseBody setReserverMaxQpsNum(String reserverMaxQpsNum) {
        this.reserverMaxQpsNum = reserverMaxQpsNum;
        return this;
    }
    public String getReserverMaxQpsNum() {
        return this.reserverMaxQpsNum;
    }

    public DescribeServerlessInstanceResponseBody setReserverMinQpsNum(String reserverMinQpsNum) {
        this.reserverMinQpsNum = reserverMinQpsNum;
        return this;
    }
    public String getReserverMinQpsNum() {
        return this.reserverMinQpsNum;
    }

    public DescribeServerlessInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeServerlessInstanceResponseBody setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }
    public String getUpdateStatus() {
        return this.updateStatus;
    }

    public DescribeServerlessInstanceResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeServerlessInstanceResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeServerlessInstanceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
