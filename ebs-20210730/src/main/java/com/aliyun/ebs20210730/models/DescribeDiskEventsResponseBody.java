// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskEventsResponseBody extends TeaModel {
    /**
     * <p>The risk events of the disk.</p>
     */
    @NameInMap("DiskEvents")
    public java.util.List<DescribeDiskEventsResponseBodyDiskEvents> diskEvents;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
        /**
         * <p>The description of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1bq5g3dxxo1x4o****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The recommended action after the event occurred. Valid values:</p>
         * <ul>
         * <li>Resize: resizes the disk.</li>
         * <li>ModifyDiskSpec: changes the category of the disk.</li>
         * <li>NoAction: performs no operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoAction</p>
         */
        @NameInMap("RecommendAction")
        public String recommendAction;

        /**
         * <p>The region ID of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The state of the event. Valid values:</p>
         * <ul>
         * <li>Solved</li>
         * <li>UnSolved</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Solved</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the event occurred. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-01T08:00:00Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The type of the event. Only DataNeedProtect can be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>DataNeedProtect</p>
         */
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
