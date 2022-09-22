// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeStorageCapacityUnitAllocationsResponseBody extends TeaModel {
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

    public static DescribeStorageCapacityUnitAllocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageCapacityUnitAllocationsResponseBody self = new DescribeStorageCapacityUnitAllocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageCapacityUnitAllocationsResponseBody setAllocations(Allocations allocations) {
        this.allocations = allocations;
        return this;
    }
    public Allocations getAllocations() {
        return this.allocations;
    }

    public DescribeStorageCapacityUnitAllocationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageCapacityUnitAllocationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageCapacityUnitAllocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageCapacityUnitAllocationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class Allocation extends TeaModel {
        @NameInMap("BeAllocatedAccountId")
        public String beAllocatedAccountId;

        @NameInMap("ResourceOwnerId")
        public String resourceOwnerId;

        @NameInMap("StorageCapacityUnitId")
        public String storageCapacityUnitId;

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

        public Allocation setResourceOwnerId(String resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public Allocation setStorageCapacityUnitId(String storageCapacityUnitId) {
            this.storageCapacityUnitId = storageCapacityUnitId;
            return this;
        }
        public String getStorageCapacityUnitId() {
            return this.storageCapacityUnitId;
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
