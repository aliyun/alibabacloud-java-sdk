// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeResourcePackInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("ResourcePacks")
    @Validation(required = true)
    public java.util.List<DescribeResourcePackInstancesResponseResourcePacks> resourcePacks;

    public static DescribeResourcePackInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackInstancesResponse self = new DescribeResourcePackInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcePackInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeResourcePackInstancesResponse setResourcePacks(java.util.List<DescribeResourcePackInstancesResponseResourcePacks> resourcePacks) {
        this.resourcePacks = resourcePacks;
        return this;
    }
    public java.util.List<DescribeResourcePackInstancesResponseResourcePacks> getResourcePacks() {
        return this.resourcePacks;
    }

    public static class DescribeResourcePackInstancesResponseResourcePacks extends TeaModel {
        @NameInMap("ResourcePackId")
        @Validation(required = true)
        public String resourcePackId;

        @NameInMap("InitCapacity")
        @Validation(required = true)
        public Long initCapacity;

        @NameInMap("CurrCapacity")
        @Validation(required = true)
        public Long currCapacity;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeResourcePackInstancesResponseResourcePacks build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackInstancesResponseResourcePacks self = new DescribeResourcePackInstancesResponseResourcePacks();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackInstancesResponseResourcePacks setResourcePackId(String resourcePackId) {
            this.resourcePackId = resourcePackId;
            return this;
        }
        public String getResourcePackId() {
            return this.resourcePackId;
        }

        public DescribeResourcePackInstancesResponseResourcePacks setInitCapacity(Long initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public Long getInitCapacity() {
            return this.initCapacity;
        }

        public DescribeResourcePackInstancesResponseResourcePacks setCurrCapacity(Long currCapacity) {
            this.currCapacity = currCapacity;
            return this;
        }
        public Long getCurrCapacity() {
            return this.currCapacity;
        }

        public DescribeResourcePackInstancesResponseResourcePacks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeResourcePackInstancesResponseResourcePacks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeResourcePackInstancesResponseResourcePacks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
