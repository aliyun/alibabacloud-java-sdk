// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeDataCenterResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    @NameInMap("CommodityInstance")
    public String commodityInstance;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NodeCount")
    public Integer nodeCount;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("LockMode")
    public String lockMode;

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("DataCenterName")
    public String dataCenterName;

    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    @NameInMap("DiskSize")
    public Integer diskSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("InstanceType")
    public String instanceType;

    public static DescribeDataCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCenterResponseBody self = new DescribeDataCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataCenterResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDataCenterResponseBody setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public DescribeDataCenterResponseBody setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public DescribeDataCenterResponseBody setCommodityInstance(String commodityInstance) {
        this.commodityInstance = commodityInstance;
        return this;
    }
    public String getCommodityInstance() {
        return this.commodityInstance;
    }

    public DescribeDataCenterResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeDataCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataCenterResponseBody setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public DescribeDataCenterResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeDataCenterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeDataCenterResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDataCenterResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeDataCenterResponseBody setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public DescribeDataCenterResponseBody setDataCenterName(String dataCenterName) {
        this.dataCenterName = dataCenterName;
        return this;
    }
    public String getDataCenterName() {
        return this.dataCenterName;
    }

    public DescribeDataCenterResponseBody setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public DescribeDataCenterResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeDataCenterResponseBody setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public DescribeDataCenterResponseBody setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public DescribeDataCenterResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDataCenterResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDataCenterResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
