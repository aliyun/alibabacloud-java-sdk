// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskEventsResponseBody extends TeaModel {
    @NameInMap("DiskEvents")
    public java.util.List<DescribeDiskEventsResponseBodyDiskEvents> diskEvents;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDiskEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskEventsResponseBody self = new DescribeDiskEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskEventsResponseBody setDiskEvents(java.util.List<DescribeDiskEventsResponseBodyDiskEvents> diskEvents) {
        this.diskEvents = diskEvents;
        return this;
    }
    public java.util.List<DescribeDiskEventsResponseBodyDiskEvents> getDiskEvents() {
        return this.diskEvents;
    }

    public DescribeDiskEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiskEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiskEventsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDiskEventsResponseBodyDiskEvents extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("RecommendAction")
        public String recommendAction;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Type")
        public String type;

        public static DescribeDiskEventsResponseBodyDiskEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskEventsResponseBodyDiskEvents self = new DescribeDiskEventsResponseBodyDiskEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDiskEventsResponseBodyDiskEvents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDiskEventsResponseBodyDiskEvents setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDiskEventsResponseBodyDiskEvents setRecommendAction(String recommendAction) {
            this.recommendAction = recommendAction;
            return this;
        }
        public String getRecommendAction() {
            return this.recommendAction;
        }

        public DescribeDiskEventsResponseBodyDiskEvents setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDiskEventsResponseBodyDiskEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDiskEventsResponseBodyDiskEvents setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeDiskEventsResponseBodyDiskEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
