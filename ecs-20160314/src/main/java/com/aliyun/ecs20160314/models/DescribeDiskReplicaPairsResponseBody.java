// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairsResponseBody extends TeaModel {
    @NameInMap("DiskReplicaPairs")
    public DiskReplicaPairs diskReplicaPairs;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiskReplicaPairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaPairsResponseBody self = new DescribeDiskReplicaPairsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskReplicaPairsResponseBody setDiskReplicaPairs(DiskReplicaPairs diskReplicaPairs) {
        this.diskReplicaPairs = diskReplicaPairs;
        return this;
    }
    public DiskReplicaPairs getDiskReplicaPairs() {
        return this.diskReplicaPairs;
    }

    public DescribeDiskReplicaPairsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiskReplicaPairsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DiskReplicaPair extends TeaModel {
        @NameInMap("AsyncCycle")
        public Integer asyncCycle;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationDiskId")
        public String destinationDiskId;

        @NameInMap("DestinationRegion")
        public String destinationRegion;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("PairName")
        public String pairName;

        @NameInMap("ReplicaPairId")
        public String replicaPairId;

        @NameInMap("RpoTime")
        public String rpoTime;

        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        @NameInMap("SourceRegion")
        public String sourceRegion;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalCopiedSize")
        public Long totalCopiedSize;

        public static DiskReplicaPair build(java.util.Map<String, ?> map) throws Exception {
            DiskReplicaPair self = new DiskReplicaPair();
            return TeaModel.build(map, self);
        }

        public DiskReplicaPair setAsyncCycle(Integer asyncCycle) {
            this.asyncCycle = asyncCycle;
            return this;
        }
        public Integer getAsyncCycle() {
            return this.asyncCycle;
        }

        public DiskReplicaPair setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DiskReplicaPair setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DiskReplicaPair setDestinationDiskId(String destinationDiskId) {
            this.destinationDiskId = destinationDiskId;
            return this;
        }
        public String getDestinationDiskId() {
            return this.destinationDiskId;
        }

        public DiskReplicaPair setDestinationRegion(String destinationRegion) {
            this.destinationRegion = destinationRegion;
            return this;
        }
        public String getDestinationRegion() {
            return this.destinationRegion;
        }

        public DiskReplicaPair setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DiskReplicaPair setPairName(String pairName) {
            this.pairName = pairName;
            return this;
        }
        public String getPairName() {
            return this.pairName;
        }

        public DiskReplicaPair setReplicaPairId(String replicaPairId) {
            this.replicaPairId = replicaPairId;
            return this;
        }
        public String getReplicaPairId() {
            return this.replicaPairId;
        }

        public DiskReplicaPair setRpoTime(String rpoTime) {
            this.rpoTime = rpoTime;
            return this;
        }
        public String getRpoTime() {
            return this.rpoTime;
        }

        public DiskReplicaPair setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DiskReplicaPair setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public DiskReplicaPair setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DiskReplicaPair setTotalCopiedSize(Long totalCopiedSize) {
            this.totalCopiedSize = totalCopiedSize;
            return this;
        }
        public Long getTotalCopiedSize() {
            return this.totalCopiedSize;
        }

    }

    public static class DiskReplicaPairs extends TeaModel {
        @NameInMap("DiskReplicaPair")
        public java.util.List<DiskReplicaPair> diskReplicaPair;

        public static DiskReplicaPairs build(java.util.Map<String, ?> map) throws Exception {
            DiskReplicaPairs self = new DiskReplicaPairs();
            return TeaModel.build(map, self);
        }

        public DiskReplicaPairs setDiskReplicaPair(java.util.List<DiskReplicaPair> diskReplicaPair) {
            this.diskReplicaPair = diskReplicaPair;
            return this;
        }
        public java.util.List<DiskReplicaPair> getDiskReplicaPair() {
            return this.diskReplicaPair;
        }

    }

}
