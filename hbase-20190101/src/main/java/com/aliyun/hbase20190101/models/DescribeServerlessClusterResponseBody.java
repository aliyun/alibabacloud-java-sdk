// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeServerlessClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <strong>example:</strong>
     * <p>single</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <strong>example:</strong>
     * <p>2019-10-12T14:40:46</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("CuSize")
    public String cuSize;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("DiskSize")
    public String diskSize;

    /**
     * <strong>example:</strong>
     * <p>2019-10-12T14:40:46</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HaType")
    public String haType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasUser")
    public String hasUser;

    /**
     * <strong>example:</strong>
     * <p><a href="https://sh-wz91452kg946i****-lindorm-serverless-in.lindorm.rds.aliyuncs.com:443">https://sh-wz91452kg946i****-lindorm-serverless-in.lindorm.rds.aliyuncs.com:443</a></p>
     */
    @NameInMap("InnerEndpoint")
    public String innerEndpoint;

    /**
     * <strong>example:</strong>
     * <p>hb-bp16f1441y6p2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDeletionProtection")
    public String isDeletionProtection;

    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <strong>example:</strong>
     * <p>2.0.8</p>
     */
    @NameInMap("MainVersion")
    public String mainVersion;

    /**
     * <strong>example:</strong>
     * <p><a href="https://sh-wz91452kg946i****-lindorm-serverless.lindorm.rds.aliyuncs.com:443">https://sh-wz91452kg946i****-lindorm-serverless.lindorm.rds.aliyuncs.com:443</a></p>
     */
    @NameInMap("OuterEndpoint")
    public String outerEndpoint;

    /**
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>89F81C30-320B-4550-91DB-C37C81D2358F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ReserverMaxQpsNum")
    public String reserverMaxQpsNum;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ReserverMinQpsNum")
    public String reserverMinQpsNum;

    /**
     * <strong>example:</strong>
     * <p>rg-fjm2d4v7sf****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>NO</p>
     */
    @NameInMap("UpdateStatus")
    public String updateStatus;

    /**
     * <strong>example:</strong>
     * <p>vsw-bp191ipotqf****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp120k6ixs4eoghz****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-f</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeServerlessClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerlessClusterResponseBody self = new DescribeServerlessClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServerlessClusterResponseBody setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public DescribeServerlessClusterResponseBody setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeServerlessClusterResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeServerlessClusterResponseBody setCuSize(String cuSize) {
        this.cuSize = cuSize;
        return this;
    }
    public String getCuSize() {
        return this.cuSize;
    }

    public DescribeServerlessClusterResponseBody setDiskSize(String diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public String getDiskSize() {
        return this.diskSize;
    }

    public DescribeServerlessClusterResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeServerlessClusterResponseBody setHaType(String haType) {
        this.haType = haType;
        return this;
    }
    public String getHaType() {
        return this.haType;
    }

    public DescribeServerlessClusterResponseBody setHasUser(String hasUser) {
        this.hasUser = hasUser;
        return this;
    }
    public String getHasUser() {
        return this.hasUser;
    }

    public DescribeServerlessClusterResponseBody setInnerEndpoint(String innerEndpoint) {
        this.innerEndpoint = innerEndpoint;
        return this;
    }
    public String getInnerEndpoint() {
        return this.innerEndpoint;
    }

    public DescribeServerlessClusterResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeServerlessClusterResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeServerlessClusterResponseBody setIsDeletionProtection(String isDeletionProtection) {
        this.isDeletionProtection = isDeletionProtection;
        return this;
    }
    public String getIsDeletionProtection() {
        return this.isDeletionProtection;
    }

    public DescribeServerlessClusterResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeServerlessClusterResponseBody setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

    public DescribeServerlessClusterResponseBody setOuterEndpoint(String outerEndpoint) {
        this.outerEndpoint = outerEndpoint;
        return this;
    }
    public String getOuterEndpoint() {
        return this.outerEndpoint;
    }

    public DescribeServerlessClusterResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeServerlessClusterResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeServerlessClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServerlessClusterResponseBody setReserverMaxQpsNum(String reserverMaxQpsNum) {
        this.reserverMaxQpsNum = reserverMaxQpsNum;
        return this;
    }
    public String getReserverMaxQpsNum() {
        return this.reserverMaxQpsNum;
    }

    public DescribeServerlessClusterResponseBody setReserverMinQpsNum(String reserverMinQpsNum) {
        this.reserverMinQpsNum = reserverMinQpsNum;
        return this;
    }
    public String getReserverMinQpsNum() {
        return this.reserverMinQpsNum;
    }

    public DescribeServerlessClusterResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeServerlessClusterResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeServerlessClusterResponseBody setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }
    public String getUpdateStatus() {
        return this.updateStatus;
    }

    public DescribeServerlessClusterResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeServerlessClusterResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeServerlessClusterResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
