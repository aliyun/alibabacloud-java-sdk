// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDeliveryHistoryJobsResponseBody extends TeaModel {
    @NameInMap("DeliveryHistoryJobs")
    public java.util.List<ListDeliveryHistoryJobsResponseBodyDeliveryHistoryJobs> deliveryHistoryJobs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("HomeRegion")
        public String homeRegion;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobStatus")
        public Integer jobStatus;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TrailName")
        public String trailName;

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
