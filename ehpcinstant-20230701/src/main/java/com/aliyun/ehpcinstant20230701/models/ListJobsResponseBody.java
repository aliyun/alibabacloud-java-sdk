// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    /**
     * <p>The list of jobs.</p>
     */
    @NameInMap("JobList")
    public java.util.List<ListJobsResponseBodyJobList> jobList;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that meet the filter conditions.
     * This parameter is optional and may not be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public static class ListJobsResponseBodyJobListTags extends TeaModel {
        /**
         * <p>The key of the job tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the job tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListJobsResponseBodyJobListTags build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobListTags self = new ListJobsResponseBodyJobListTags();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobListTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListJobsResponseBodyJobListTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListJobsResponseBodyJobList extends TeaModel {
        /**
         * <p>Additional information about the application.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;xxx\&quot;: \&quot;xxxxx\&quot;}</p>
         */
        @NameInMap("AppExtraInfo")
        public String appExtraInfo;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Alphafold3</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The time when the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-25 12:29:21</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the job ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-25 12:35:23</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The number of running nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecutorCount")
        public Integer executorCount;

        /**
         * <p>The description of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>Demo</p>
         */
        @NameInMap("JobDescription")
        public String jobDescription;

        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>job-xxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>testJob</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The UID of the user who created the job.</p>
         * 
         * <strong>example:</strong>
         * <p>129**********</p>
         */
        @NameInMap("OwnerUid")
        public String ownerUid;

        /**
         * <p>The time when the job started.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-25 12:29:23</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the job. Possible values:</p>
         * <ul>
         * <li><p>Pending: The job is in the queue.</p>
         * </li>
         * <li><p>Initing: The job is initializing.</p>
         * </li>
         * <li><p>Succeeded: The job was successful.</p>
         * </li>
         * <li><p>Failed: The job failed.</p>
         * </li>
         * <li><p>Running: The job is running.</p>
         * </li>
         * <li><p>Exception: A scheduling exception occurred.</p>
         * </li>
         * <li><p>Retrying: The job is being retried.</p>
         * </li>
         * <li><p>Expired: The job timed out.</p>
         * </li>
         * <li><p>Suspended: The job is in hibernation.</p>
         * </li>
         * <li><p>Restarting: The job is restarting.</p>
         * </li>
         * <li><p>Deleted: The job is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of job tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListJobsResponseBodyJobListTags> tags;

        /**
         * <p>The number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskCount")
        public Integer taskCount;

        /**
         * <p>Indicates whether the job is a long-running job.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TaskSustainable")
        public Boolean taskSustainable;

        public static ListJobsResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobList self = new ListJobsResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobList setAppExtraInfo(String appExtraInfo) {
            this.appExtraInfo = appExtraInfo;
            return this;
        }
        public String getAppExtraInfo() {
            return this.appExtraInfo;
        }

        public ListJobsResponseBodyJobList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
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

        public ListJobsResponseBodyJobList setTags(java.util.List<ListJobsResponseBodyJobListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListJobsResponseBodyJobListTags> getTags() {
            return this.tags;
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
