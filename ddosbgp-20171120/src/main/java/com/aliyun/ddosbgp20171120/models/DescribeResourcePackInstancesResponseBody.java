// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeResourcePackInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourcePacks")
    public java.util.List<DescribeResourcePackInstancesResponseBodyResourcePacks> resourcePacks;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeResourcePackInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackInstancesResponseBody self = new DescribeResourcePackInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcePackInstancesResponseBody setResourcePacks(java.util.List<DescribeResourcePackInstancesResponseBodyResourcePacks> resourcePacks) {
        this.resourcePacks = resourcePacks;
        return this;
    }
    public java.util.List<DescribeResourcePackInstancesResponseBodyResourcePacks> getResourcePacks() {
        return this.resourcePacks;
    }

    public DescribeResourcePackInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeResourcePackInstancesResponseBodyResourcePacks extends TeaModel {
        @NameInMap("CurrCapacity")
        public Long currCapacity;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("InitCapacity")
        public Long initCapacity;

        @NameInMap("ResourcePackId")
        public String resourcePackId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        public static DescribeResourcePackInstancesResponseBodyResourcePacks build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackInstancesResponseBodyResourcePacks self = new DescribeResourcePackInstancesResponseBodyResourcePacks();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackInstancesResponseBodyResourcePacks setCurrCapacity(Long currCapacity) {
            this.currCapacity = currCapacity;
            return this;
        }
        public Long getCurrCapacity() {
            return this.currCapacity;
        }

        public DescribeResourcePackInstancesResponseBodyResourcePacks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeResourcePackInstancesResponseBodyResourcePacks setInitCapacity(Long initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public Long getInitCapacity() {
            return this.initCapacity;
        }

        public DescribeResourcePackInstancesResponseBodyResourcePacks setResourcePackId(String resourcePackId) {
            this.resourcePackId = resourcePackId;
            return this;
        }
        public String getResourcePackId() {
            return this.resourcePackId;
        }

        public DescribeResourcePackInstancesResponseBodyResourcePacks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeResourcePackInstancesResponseBodyResourcePacks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
