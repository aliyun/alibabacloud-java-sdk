// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("EipAddresses")
    public DescribeEipAddressesResponseBodyEipAddresses eipAddresses;

    public static DescribeEipAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesResponseBody self = new DescribeEipAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEipAddressesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEipAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEipAddressesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEipAddressesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeEipAddressesResponseBody setEipAddresses(DescribeEipAddressesResponseBodyEipAddresses eipAddresses) {
        this.eipAddresses = eipAddresses;
        return this;
    }
    public DescribeEipAddressesResponseBodyEipAddresses getEipAddresses() {
        return this.eipAddresses;
    }

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason self = new DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason> lockReason;

        public static DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks self = new DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks setLockReason(java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeEipAddressesResponseBodyEipAddressesEipAddress extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("AllocationTime")
        public String allocationTime;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("EipBandwidth")
        public String eipBandwidth;

        @NameInMap("OperationLocks")
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks operationLocks;

        public static DescribeEipAddressesResponseBodyEipAddressesEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddressesEipAddress self = new DescribeEipAddressesResponseBodyEipAddressesEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setAllocationTime(String allocationTime) {
            this.allocationTime = allocationTime;
            return this;
        }
        public String getAllocationTime() {
            return this.allocationTime;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setEipBandwidth(String eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public String getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeEipAddressesResponseBodyEipAddressesEipAddress setOperationLocks(DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeEipAddressesResponseBodyEipAddressesEipAddressOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

    }

    public static class DescribeEipAddressesResponseBodyEipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        public java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddress> eipAddress;

        public static DescribeEipAddressesResponseBodyEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseBodyEipAddresses self = new DescribeEipAddressesResponseBodyEipAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesResponseBodyEipAddresses setEipAddress(java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddress> eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public java.util.List<DescribeEipAddressesResponseBodyEipAddressesEipAddress> getEipAddress() {
            return this.eipAddress;
        }

    }

}
