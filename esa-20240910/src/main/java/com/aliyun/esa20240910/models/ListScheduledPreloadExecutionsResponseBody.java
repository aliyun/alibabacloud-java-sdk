// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListScheduledPreloadExecutionsResponseBody extends TeaModel {
    /**
     * <p>The information about prefetch plans returned.</p>
     */
    @NameInMap("Executions")
    public java.util.List<ListScheduledPreloadExecutionsResponseBodyExecutions> executions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ET5BF670-09D5-4D0B-BEBY-D96A2A528000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListScheduledPreloadExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPreloadExecutionsResponseBody self = new ListScheduledPreloadExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduledPreloadExecutionsResponseBody setExecutions(java.util.List<ListScheduledPreloadExecutionsResponseBodyExecutions> executions) {
        this.executions = executions;
        return this;
    }
    public java.util.List<ListScheduledPreloadExecutionsResponseBodyExecutions> getExecutions() {
        return this.executions;
    }

    public ListScheduledPreloadExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduledPreloadExecutionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListScheduledPreloadExecutionsResponseBodyExecutions extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>15685865xxx14622</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The end time of the prefetch plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-31T18:10:48.849+08:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the prefetch plan.</p>
         * 
         * <strong>example:</strong>
         * <p>66599bd7397885b43804901c</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time interval between each batch execution in the plan. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The ID of the prefetch task.</p>
         * 
         * <strong>example:</strong>
         * <p>665d3af3621bccf3fe29e1a4</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The number of URLs prefetched in each batch.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SliceLen")
        public Integer sliceLen;

        /**
         * <p>The start time of the prefetch plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-31T17:10:48.849+08:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the prefetch plan. Valid values:</p>
         * <ul>
         * <li><strong>waiting</strong></li>
         * <li><strong>running</strong></li>
         * <li><strong>finished</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>stopped</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListScheduledPreloadExecutionsResponseBodyExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListScheduledPreloadExecutionsResponseBodyExecutions self = new ListScheduledPreloadExecutionsResponseBodyExecutions();
            return TeaModel.build(map, self);
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setSliceLen(Integer sliceLen) {
            this.sliceLen = sliceLen;
            return this;
        }
        public Integer getSliceLen() {
            return this.sliceLen;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
