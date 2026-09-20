// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeServerlessClusterResponseBody extends TeaModel {
    /**
     * <p>Indicates whether auto-renewal is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Auto-renewal is enabled.</li>
     * <li><strong>false</strong>: Auto-renewal is not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li><strong>Cluster</strong>: Cluster Edition.</li>
     * <li><strong>Single</strong>: single-node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>single</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The time when the cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-12T14:40:46</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The compute unit (CU) size.</p>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("CuSize")
    public String cuSize;

    /**
     * <p>The disk size of the node. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("DiskSize")
    public String diskSize;

    /**
     * <p>The expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-12T14:40:46</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Indicates whether high availability (HA) is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: HA is enabled.</li>
     * <li><strong>false</strong>: HA is not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HaType")
    public String haType;

    /**
     * <p>Indicates whether the cluster has users. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The cluster has users.</li>
     * <li><strong>false</strong>: The cluster does not have users.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasUser")
    public String hasUser;

    /**
     * <p>The internal endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://sh-wz91452kg946i****-lindorm-serverless-in.lindorm.rds.aliyuncs.com:443">https://sh-wz91452kg946i****-lindorm-serverless-in.lindorm.rds.aliyuncs.com:443</a></p>
     */
    @NameInMap("InnerEndpoint")
    public String innerEndpoint;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp16f1441y6p2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Indicates whether deletion protection is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDeletionProtection")
    public String isDeletionProtection;

    /**
     * <p>The lock type of the cluster.</p>
     * <blockquote>
     * <p>This parameter does not return a value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>过期</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <p>The major version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.8</p>
     */
    @NameInMap("MainVersion")
    public String mainVersion;

    /**
     * <p>The public endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://sh-wz91452kg946i****-lindorm-serverless.lindorm.rds.aliyuncs.com:443">https://sh-wz91452kg946i****-lindorm-serverless.lindorm.rds.aliyuncs.com:443</a></p>
     */
    @NameInMap("OuterEndpoint")
    public String outerEndpoint;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89F81C30-320B-4550-91DB-C37C81D2358F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The maximum reserved QPS.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ReserverMaxQpsNum")
    public String reserverMaxQpsNum;

    /**
     * <p>The minimum reserved QPS.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ReserverMinQpsNum")
    public String reserverMinQpsNum;

    /**
     * <p>The ID of the resource group to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-fjm2d4v7sf****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The current status. Valid values:</p>
     * <ul>
     * <li><strong>CREATING</strong>: being created.</li>
     * <li><strong>ACTIVATION</strong>: running.</li>
     * <li><strong>DELETING</strong>: being deleted.</li>
     * <li><strong>RESTARTING</strong>: being restarted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The minor version upgrade status. Valid values:</p>
     * <ul>
     * <li><strong>YES</strong>: An upgrade is available.</li>
     * <li><strong>NO</strong>: No upgrade is available.</li>
     * <li><strong>PENDING</strong>: An upgrade is in progress.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NO</p>
     */
    @NameInMap("UpdateStatus")
    public String updateStatus;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp191ipotqf****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp120k6ixs4eoghz****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance.</p>
     * 
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
