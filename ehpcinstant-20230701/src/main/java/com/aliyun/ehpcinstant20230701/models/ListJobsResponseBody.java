// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    @NameInMap("JobList")
    public java.util.List<ListJobsResponseBodyJobList> jobList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setJobList(java.util.List<ListJobsResponseBodyJobList> jobList) {
        this.jobList = jobList;
        return this;
    }
    public java.util.List<ListJobsResponseBodyJobList> getJobList() {
        return this.jobList;
    }

    public ListJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListJobsResponseBodyJobList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExecutorCount")
        public Integer executorCount;

        @NameInMap("JobDescription")
        public String jobDescription;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("OwnerUid")
        public String ownerUid;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskCount")
        public Integer taskCount;

        @NameInMap("TaskSustainable")
        public Boolean taskSustainable;

        public static ListJobsResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobList self = new ListJobsResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListJobsResponseBodyJobList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListJobsResponseBodyJobList setExecutorCount(Integer executorCount) {
            this.executorCount = executorCount;
            return this;
        }
        public Integer getExecutorCount() {
            return this.executorCount;
        }

        public ListJobsResponseBodyJobList setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }
        public String getJobDescription() {
            return this.jobDescription;
        }

        public ListJobsResponseBodyJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsResponseBodyJobList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListJobsResponseBodyJobList setOwnerUid(String ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public String getOwnerUid() {
            return this.ownerUid;
        }

        public ListJobsResponseBodyJobList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListJobsResponseBodyJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobsResponseBodyJobList setTaskCount(Integer taskCount) {
            this.taskCount = taskCount;
            return this;
        }
        public Integer getTaskCount() {
            return this.taskCount;
        }

        public ListJobsResponseBodyJobList setTaskSustainable(Boolean taskSustainable) {
            this.taskSustainable = taskSustainable;
            return this;
        }
        public Boolean getTaskSustainable() {
            return this.taskSustainable;
        }

    }

}
