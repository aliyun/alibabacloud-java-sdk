// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClustersResponseBody extends TeaModel {
    @NameInMap("DedicatedBlockStorageClusters")
    public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters dedicatedBlockStorageClusters;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDedicatedBlockStorageClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedBlockStorageClustersResponseBody self = new DescribeDedicatedBlockStorageClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedBlockStorageClustersResponseBody setDedicatedBlockStorageClusters(DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters dedicatedBlockStorageClusters) {
        this.dedicatedBlockStorageClusters = dedicatedBlockStorageClusters;
        return this;
    }
    public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters getDedicatedBlockStorageClusters() {
        return this.dedicatedBlockStorageClusters;
    }

    public DescribeDedicatedBlockStorageClustersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDedicatedBlockStorageClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterDedicatedBlockStorageClusterCapacity extends TeaModel {
        @NameInMap("AvailableCapacity")
        public Long availableCapacity;

        @NameInMap("TotalCapacity")
        public Long totalCapacity;

        public static DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterDedicatedBlockStorageClusterCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterDedicatedBlockStorageClusterCapacity self = new DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterDedicatedBlockStorageClusterCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterDedicatedBlockStorageClusterCapacity setAvailableCapacity(Long availableCapacity) {
            this.availableCapacity = availableCapacity;
            return this;
        }
        public Long getAvailableCapacity() {
            return this.availableCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterDedicatedBlockStorageClusterCapacity setTotalCapacity(Long totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Long getTotalCapacity() {
            return this.totalCapacity;
        }

    }

    public static class DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DedicatedBlockStorageClusterCapacity")
        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterDedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity;

        @NameInMap("DedicatedBlockStorageClusterId")
        public String dedicatedBlockStorageClusterId;

        @NameInMap("DedicatedBlockStorageClusterName")
        public String dedicatedBlockStorageClusterName;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster self = new DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster setDedicatedBlockStorageClusterCapacity(DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterDedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity) {
            this.dedicatedBlockStorageClusterCapacity = dedicatedBlockStorageClusterCapacity;
            return this;
        }
        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterDedicatedBlockStorageClusterCapacity getDedicatedBlockStorageClusterCapacity() {
            return this.dedicatedBlockStorageClusterCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster setDedicatedBlockStorageClusterId(String dedicatedBlockStorageClusterId) {
            this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
            return this;
        }
        public String getDedicatedBlockStorageClusterId() {
            return this.dedicatedBlockStorageClusterId;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster setDedicatedBlockStorageClusterName(String dedicatedBlockStorageClusterName) {
            this.dedicatedBlockStorageClusterName = dedicatedBlockStorageClusterName;
            return this;
        }
        public String getDedicatedBlockStorageClusterName() {
            return this.dedicatedBlockStorageClusterName;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters extends TeaModel {
        @NameInMap("DedicatedBlockStorageCluster")
        public java.util.List<DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster> dedicatedBlockStorageCluster;

        public static DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters self = new DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setDedicatedBlockStorageCluster(java.util.List<DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster> dedicatedBlockStorageCluster) {
            this.dedicatedBlockStorageCluster = dedicatedBlockStorageCluster;
            return this;
        }
        public java.util.List<DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageCluster> getDedicatedBlockStorageCluster() {
            return this.dedicatedBlockStorageCluster;
        }

    }

}
