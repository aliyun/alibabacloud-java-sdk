// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeReservedInstanceAllocationsResponseBody extends TeaModel {
    @NameInMap("Allocations")
    public Allocations allocations;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeReservedInstanceAllocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstanceAllocationsResponseBody self = new DescribeReservedInstanceAllocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstanceAllocationsResponseBody setAllocations(Allocations allocations) {
        this.allocations = allocations;
        return this;
    }
    public Allocations getAllocations() {
        return this.allocations;
    }

    public DescribeReservedInstanceAllocationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReservedInstanceAllocationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeReservedInstanceAllocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReservedInstanceAllocationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class Allocation extends TeaModel {
        @NameInMap("BeAllocatedAccountId")
        public String beAllocatedAccountId;

        @NameInMap("ReservedInstanceId")
        public String reservedInstanceId;

        @NameInMap("ResourceOwnerId")
        public String resourceOwnerId;

        public static Allocation build(java.util.Map<String, ?> map) throws Exception {
            Allocation self = new Allocation();
            return TeaModel.build(map, self);
        }

        public Allocation setBeAllocatedAccountId(String beAllocatedAccountId) {
            this.beAllocatedAccountId = beAllocatedAccountId;
            return this;
        }
        public String getBeAllocatedAccountId() {
            return this.beAllocatedAccountId;
        }

        public Allocation setReservedInstanceId(String reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        public Allocation setResourceOwnerId(String resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

    }

    public static class Allocations extends TeaModel {
        @NameInMap("Allocation")
        public java.util.List<Allocation> allocation;

        public static Allocations build(java.util.Map<String, ?> map) throws Exception {
            Allocations self = new Allocations();
            return TeaModel.build(map, self);
        }

        public Allocations setAllocation(java.util.List<Allocation> allocation) {
            this.allocation = allocation;
            return this;
        }
        public java.util.List<Allocation> getAllocation() {
            return this.allocation;
        }

    }

}
