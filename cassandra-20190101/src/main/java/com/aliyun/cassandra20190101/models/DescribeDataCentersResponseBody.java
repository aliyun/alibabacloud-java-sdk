// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeDataCentersResponseBody extends TeaModel {
    @NameInMap("DataCenters")
    public DescribeDataCentersResponseBodyDataCenters dataCenters;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataCentersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCentersResponseBody self = new DescribeDataCentersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataCentersResponseBody setDataCenters(DescribeDataCentersResponseBodyDataCenters dataCenters) {
        this.dataCenters = dataCenters;
        return this;
    }
    public DescribeDataCentersResponseBodyDataCenters getDataCenters() {
        return this.dataCenters;
    }

    public DescribeDataCentersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataCentersResponseBodyDataCentersDataCenter extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("AutoRenewPeriod")
        public Integer autoRenewPeriod;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        @NameInMap("CommodityInstance")
        public String commodityInstance;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("DataCenterName")
        public String dataCenterName;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("DataCenterId")
        public String dataCenterId;

        public static DescribeDataCentersResponseBodyDataCentersDataCenter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataCentersResponseBodyDataCentersDataCenter self = new DescribeDataCentersResponseBodyDataCentersDataCenter();
            return TeaModel.build(map, self);
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setAutoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setCommodityInstance(String commodityInstance) {
            this.commodityInstance = commodityInstance;
            return this;
        }
        public String getCommodityInstance() {
            return this.commodityInstance;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setDataCenterName(String dataCenterName) {
            this.dataCenterName = dataCenterName;
            return this;
        }
        public String getDataCenterName() {
            return this.dataCenterName;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeDataCentersResponseBodyDataCentersDataCenter setDataCenterId(String dataCenterId) {
            this.dataCenterId = dataCenterId;
            return this;
        }
        public String getDataCenterId() {
            return this.dataCenterId;
        }

    }

    public static class DescribeDataCentersResponseBodyDataCenters extends TeaModel {
        @NameInMap("DataCenter")
        public java.util.List<DescribeDataCentersResponseBodyDataCentersDataCenter> dataCenter;

        public static DescribeDataCentersResponseBodyDataCenters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataCentersResponseBodyDataCenters self = new DescribeDataCentersResponseBodyDataCenters();
            return TeaModel.build(map, self);
        }

        public DescribeDataCentersResponseBodyDataCenters setDataCenter(java.util.List<DescribeDataCentersResponseBodyDataCentersDataCenter> dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public java.util.List<DescribeDataCentersResponseBodyDataCentersDataCenter> getDataCenter() {
            return this.dataCenter;
        }

    }

}
