// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateScheduledPreloadExecutionsResponseBody extends TeaModel {
    /**
     * <p>The information about prefetch plans that failed to be created.</p>
     */
    @NameInMap("FailedExecutions")
    public java.util.List<CreateScheduledPreloadExecutionsResponseBodyFailedExecutions> failedExecutions;

    /**
     * <p>The information about plan failures.</p>
     */
    @NameInMap("FailedMessages")
    public java.util.List<String> failedMessages;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of prefetch plans that are created.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    /**
     * <p>The information about created prefetch plans.</p>
     */
    @NameInMap("SuccessExecutions")
    public java.util.List<CreateScheduledPreloadExecutionsResponseBodySuccessExecutions> successExecutions;

    /**
     * <p>The total number of new plans requested.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static CreateScheduledPreloadExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledPreloadExecutionsResponseBody self = new CreateScheduledPreloadExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduledPreloadExecutionsResponseBody setFailedExecutions(java.util.List<CreateScheduledPreloadExecutionsResponseBodyFailedExecutions> failedExecutions) {
        this.failedExecutions = failedExecutions;
        return this;
    }
    public java.util.List<CreateScheduledPreloadExecutionsResponseBodyFailedExecutions> getFailedExecutions() {
        return this.failedExecutions;
    }

    public CreateScheduledPreloadExecutionsResponseBody setFailedMessages(java.util.List<String> failedMessages) {
        this.failedMessages = failedMessages;
        return this;
    }
    public java.util.List<String> getFailedMessages() {
        return this.failedMessages;
    }

    public CreateScheduledPreloadExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduledPreloadExecutionsResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public CreateScheduledPreloadExecutionsResponseBody setSuccessExecutions(java.util.List<CreateScheduledPreloadExecutionsResponseBodySuccessExecutions> successExecutions) {
        this.successExecutions = successExecutions;
        return this;
    }
    public java.util.List<CreateScheduledPreloadExecutionsResponseBodySuccessExecutions> getSuccessExecutions() {
        return this.successExecutions;
    }

    public CreateScheduledPreloadExecutionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class CreateScheduledPreloadExecutionsResponseBodyFailedExecutions extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>15685865xxx14622</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The end time of the prefetch plans.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-03T02:43:35Z</p>
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
         * <p>The time interval between each batch execution. Unit: seconds.</p>
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
         * <p>The start time of the prefetch plans.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-02T02:43:35Z</p>
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

        public static CreateScheduledPreloadExecutionsResponseBodyFailedExecutions build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledPreloadExecutionsResponseBodyFailedExecutions self = new CreateScheduledPreloadExecutionsResponseBodyFailedExecutions();
            return TeaModel.build(map, self);
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setSliceLen(Integer sliceLen) {
            this.sliceLen = sliceLen;
            return this;
        }
        public Integer getSliceLen() {
            return this.sliceLen;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateScheduledPreloadExecutionsResponseBodySuccessExecutions extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>15685865xxx14622</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The end time of the prefetch plans.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-03T02:43:35Z</p>
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
         * <p>The time interval between each batch execution. Unit: seconds.</p>
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
         * <p>The start time of the prefetch plans.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-02T02:43:35Z</p>
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
         * <p>failed</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateScheduledPreloadExecutionsResponseBodySuccessExecutions build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledPreloadExecutionsResponseBodySuccessExecutions self = new CreateScheduledPreloadExecutionsResponseBodySuccessExecutions();
            return TeaModel.build(map, self);
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setSliceLen(Integer sliceLen) {
            this.sliceLen = sliceLen;
            return this;
        }
        public Integer getSliceLen() {
            return this.sliceLen;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
