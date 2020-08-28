// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("EipAddresses")
    @Validation(required = true)
    public DescribeEipAddressesResponseEipAddresses eipAddresses;

    public static DescribeEipAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesResponse self = new DescribeEipAddressesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        public static DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason self = new DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public java.util.List<DescribeEipAddressesResponseEipAddressesEipAddressOperationLocksLockReason> lockReason;

        public static DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks self = new DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEipAddressesResponseEipAddressesEipAddress extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public String bandwidth;

        @NameInMap("EipBandwidth")
        @Validation(required = true)
        public String eipBandwidth;

        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        @NameInMap("AllocationTime")
        @Validation(required = true)
        public String allocationTime;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("ChargeType")
        @Validation(required = true)
        public String chargeType;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("OperationLocks")
        @Validation(required = true)
        public DescribeEipAddressesResponseEipAddressesEipAddressOperationLocks operationLocks;

        public static DescribeEipAddressesResponseEipAddressesEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddressesEipAddress self = new DescribeEipAddressesResponseEipAddressesEipAddress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEipAddressesResponseEipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        @Validation(required = true)
        public java.util.List<DescribeEipAddressesResponseEipAddressesEipAddress> eipAddress;

        public static DescribeEipAddressesResponseEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesResponseEipAddresses self = new DescribeEipAddressesResponseEipAddresses();
            return TeaModel.build(map, self);
        }

    }

}
