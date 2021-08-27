// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DiskReplicaPairs")
    public DescribeDiskReplicaPairsResponseBodyDiskReplicaPairs diskReplicaPairs;

    public static DescribeDiskReplicaPairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaPairsResponseBody self = new DescribeDiskReplicaPairsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDiskReplicaPairsResponseBody setDiskReplicaPairs(DescribeDiskReplicaPairsResponseBodyDiskReplicaPairs diskReplicaPairs) {
        this.diskReplicaPairs = diskReplicaPairs;
        return this;
    }
    public DescribeDiskReplicaPairsResponseBodyDiskReplicaPairs getDiskReplicaPairs() {
        return this.diskReplicaPairs;
    }

    public static class DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        @NameInMap("ReplicaPairId")
        public String replicaPairId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationRegion")
        public String destinationRegion;

        @NameInMap("PairName")
        public String pairName;

        @NameInMap("SourceRegion")
        public String sourceRegion;

        @NameInMap("DestinationDiskId")
        public String destinationDiskId;

        public static DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair self = new DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair();
            return TeaModel.build(map, self);
        }

        public DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair setReplicaPairId(String replicaPairId) {
            this.replicaPairId = replicaPairId;
            return this;
        }
        public String getReplicaPairId() {
            return this.replicaPairId;
        }

        public DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair setDestinationRegion(String destinationRegion) {
            this.destinationRegion = destinationRegion;
            return this;
        }
        public String getDestinationRegion() {
            return this.destinationRegion;
        }

        public DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair setPairName(String pairName) {
            this.pairName = pairName;
            return this;
        }
        public String getPairName() {
            return this.pairName;
        }

        public DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair setDestinationDiskId(String destinationDiskId) {
            this.destinationDiskId = destinationDiskId;
            return this;
        }
        public String getDestinationDiskId() {
            return this.destinationDiskId;
        }

    }

    public static class DescribeDiskReplicaPairsResponseBodyDiskReplicaPairs extends TeaModel {
        @NameInMap("DiskReplicaPair")
        public java.util.List<DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair> diskReplicaPair;

        public static DescribeDiskReplicaPairsResponseBodyDiskReplicaPairs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskReplicaPairsResponseBodyDiskReplicaPairs self = new DescribeDiskReplicaPairsResponseBodyDiskReplicaPairs();
            return TeaModel.build(map, self);
        }

        public DescribeDiskReplicaPairsResponseBodyDiskReplicaPairs setDiskReplicaPair(java.util.List<DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair> diskReplicaPair) {
            this.diskReplicaPair = diskReplicaPair;
            return this;
        }
        public java.util.List<DescribeDiskReplicaPairsResponseBodyDiskReplicaPairsDiskReplicaPair> getDiskReplicaPair() {
            return this.diskReplicaPair;
        }

    }

}
