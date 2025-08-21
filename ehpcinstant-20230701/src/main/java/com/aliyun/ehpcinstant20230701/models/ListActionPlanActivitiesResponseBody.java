// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListActionPlanActivitiesResponseBody extends TeaModel {
    @NameInMap("ActionPlanActivities")
    public java.util.List<ListActionPlanActivitiesResponseBodyActionPlanActivities> actionPlanActivities;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1d2db86scXXXXXXXXXX</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListActionPlanActivitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActionPlanActivitiesResponseBody self = new ListActionPlanActivitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActionPlanActivitiesResponseBody setActionPlanActivities(java.util.List<ListActionPlanActivitiesResponseBodyActionPlanActivities> actionPlanActivities) {
        this.actionPlanActivities = actionPlanActivities;
        return this;
    }
    public java.util.List<ListActionPlanActivitiesResponseBodyActionPlanActivities> getActionPlanActivities() {
        return this.actionPlanActivities;
    }

    public ListActionPlanActivitiesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListActionPlanActivitiesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListActionPlanActivitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActionPlanActivitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListActionPlanActivitiesResponseBodyActionPlanActivitiesJobs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>job-hz12dqq8y3ormo1hz49h</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("JobOperationType")
        public String jobOperationType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListActionPlanActivitiesResponseBodyActionPlanActivitiesJobs build(java.util.Map<String, ?> map) throws Exception {
            ListActionPlanActivitiesResponseBodyActionPlanActivitiesJobs self = new ListActionPlanActivitiesResponseBodyActionPlanActivitiesJobs();
            return TeaModel.build(map, self);
        }

        public ListActionPlanActivitiesResponseBodyActionPlanActivitiesJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListActionPlanActivitiesResponseBodyActionPlanActivitiesJobs setJobOperationType(String jobOperationType) {
            this.jobOperationType = jobOperationType;
            return this;
        }
        public String getJobOperationType() {
            return this.jobOperationType;
        }

        public ListActionPlanActivitiesResponseBodyActionPlanActivitiesJobs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListActionPlanActivitiesResponseBodyActionPlanActivities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>et-4119e3f60eb34fc4</p>
         */
        @NameInMap("ActionPlanActivityId")
        public String actionPlanActivityId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CreatedCapacity")
        public Float createdCapacity;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DestroyCapacity")
        public Float destroyCapacity;

        /**
         * <strong>example:</strong>
         * <p>2025-08-10 18:28:05</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Jobs")
        public java.util.List<ListActionPlanActivitiesResponseBodyActionPlanActivitiesJobs> jobs;

        /**
         * <strong>example:</strong>
         * <p>2025-08-10 18:28:05</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>InProcess</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListActionPlanActivitiesResponseBodyActionPlanActivities build(java.util.Map<String, ?> map) throws Exception {
            ListActionPlanActivitiesResponseBodyActionPlanActivities self = new ListActionPlanActivitiesResponseBodyActionPlanActivities();
            return TeaModel.build(map, self);
        }

        public ListActionPlanActivitiesResponseBodyActionPlanActivities setActionPlanActivityId(String actionPlanActivityId) {
            this.actionPlanActivityId = actionPlanActivityId;
            return this;
        }
        public String getActionPlanActivityId() {
            return this.actionPlanActivityId;
        }

        public ListActionPlanActivitiesResponseBodyActionPlanActivities setCreatedCapacity(Float createdCapacity) {
            this.createdCapacity = createdCapacity;
            return this;
        }
        public Float getCreatedCapacity() {
            return this.createdCapacity;
        }

        public ListActionPlanActivitiesResponseBodyActionPlanActivities setDestroyCapacity(Float destroyCapacity) {
            this.destroyCapacity = destroyCapacity;
            return this;
        }
        public Float getDestroyCapacity() {
            return this.destroyCapacity;
        }

        public ListActionPlanActivitiesResponseBodyActionPlanActivities setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListActionPlanActivitiesResponseBodyActionPlanActivities setJobs(java.util.List<ListActionPlanActivitiesResponseBodyActionPlanActivitiesJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<ListActionPlanActivitiesResponseBodyActionPlanActivitiesJobs> getJobs() {
            return this.jobs;
        }

        public ListActionPlanActivitiesResponseBodyActionPlanActivities setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListActionPlanActivitiesResponseBodyActionPlanActivities setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
