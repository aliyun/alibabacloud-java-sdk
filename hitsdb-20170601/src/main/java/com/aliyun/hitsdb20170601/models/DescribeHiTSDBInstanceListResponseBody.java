// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class DescribeHiTSDBInstanceListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("InstanceList")
    public java.util.List<DescribeHiTSDBInstanceListResponseBodyInstanceList> instanceList;

    public static DescribeHiTSDBInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHiTSDBInstanceListResponseBody self = new DescribeHiTSDBInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHiTSDBInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHiTSDBInstanceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHiTSDBInstanceListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHiTSDBInstanceListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeHiTSDBInstanceListResponseBody setInstanceList(java.util.List<DescribeHiTSDBInstanceListResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<DescribeHiTSDBInstanceListResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public static class DescribeHiTSDBInstanceListResponseBodyInstanceList extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("MaxSeriesPerDatabase")
        public String maxSeriesPerDatabase;

        @NameInMap("PaymentType")
        public String paymentType;

        @NameInMap("EngineType")
        public String engineType;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("InstanceStorage")
        public String instanceStorage;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("InstanceAlias")
        public String instanceAlias;

        @NameInMap("InstanceTps")
        public String instanceTps;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("GmtExpire")
        public String gmtExpire;

        public static DescribeHiTSDBInstanceListResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHiTSDBInstanceListResponseBodyInstanceList self = new DescribeHiTSDBInstanceListResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setMaxSeriesPerDatabase(String maxSeriesPerDatabase) {
            this.maxSeriesPerDatabase = maxSeriesPerDatabase;
            return this;
        }
        public String getMaxSeriesPerDatabase() {
            return this.maxSeriesPerDatabase;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setInstanceStorage(String instanceStorage) {
            this.instanceStorage = instanceStorage;
            return this;
        }
        public String getInstanceStorage() {
            return this.instanceStorage;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setInstanceTps(String instanceTps) {
            this.instanceTps = instanceTps;
            return this;
        }
        public String getInstanceTps() {
            return this.instanceTps;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeHiTSDBInstanceListResponseBodyInstanceList setGmtExpire(String gmtExpire) {
            this.gmtExpire = gmtExpire;
            return this;
        }
        public String getGmtExpire() {
            return this.gmtExpire;
        }

    }

}
