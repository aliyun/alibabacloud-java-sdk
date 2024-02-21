// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDeliveryHistoryJobsResponseBody extends TeaModel {
    /**
     * <p>The list of historical event delivery tasks.</p>
     */
    @NameInMap("DeliveryHistoryJobs")
    public java.util.List<ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs> deliveryHistoryJobs;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of historical event delivery tasks returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDeliveryHistoryJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryHistoryJobsResponseBody self = new ListDeliveryHistoryJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeliveryHistoryJobsResponseBody setDeliveryHistoryJobs(java.util.List<ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs> deliveryHistoryJobs) {
        this.deliveryHistoryJobs = deliveryHistoryJobs;
        return this;
    }
    public java.util.List<ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs> getDeliveryHistoryJobs() {
        return this.deliveryHistoryJobs;
    }

    public ListDeliveryHistoryJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeliveryHistoryJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeliveryHistoryJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeliveryHistoryJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The time when the task ended.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The home region of the trail.</p>
         */
        @NameInMap("HomeRegion")
        public String homeRegion;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <p>The task status. Valid values:</p>
         * <br>
         * <p>*   0: The task is initializing.</p>
         * <p>*   1: The task is delivering historical events.</p>
         * <p>*   2: The task is complete.</p>
         * <p>*   3: The task fails.</p>
         */
        @NameInMap("JobStatus")
        public Integer jobStatus;

        /**
         * <p>The time when the task started.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The name of the trail.</p>
         */
        @NameInMap("TrailName")
        public String trailName;

        /**
         * <p>The time when the task was updated.</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs self = new ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs();
            return TeaModel.build(map, self);
        }

        public ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs setHomeRegion(String homeRegion) {
            this.homeRegion = homeRegion;
            return this;
        }
        public String getHomeRegion() {
            return this.homeRegion;
        }

        public ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs setTrailName(String trailName) {
            this.trailName = trailName;
            return this;
        }
        public String getTrailName() {
            return this.trailName;
        }

        public ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
