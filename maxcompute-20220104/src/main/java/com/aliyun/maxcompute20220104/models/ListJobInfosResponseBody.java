// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobInfosResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListJobInfosResponseBodyData data;

    /**
     * <p>Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListJobInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobInfosResponseBody self = new ListJobInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobInfosResponseBody setData(ListJobInfosResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobInfosResponseBodyData getData() {
        return this.data;
    }

    public ListJobInfosResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListJobInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListJobInfosResponseBodyDataJobInfoList extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The CU snapshot proportion of the job.</p>
         */
        @NameInMap("cuSnapshot")
        public Double cuSnapshot;

        /**
         * <p>The total number of used compute units (CUs).</p>
         */
        @NameInMap("cuUsage")
        public Long cuUsage;

        /**
         * <p>The time when the job stops running.</p>
         */
        @NameInMap("endAtTime")
        public Long endAtTime;

        /**
         * <p>The node ID of DataWorks.</p>
         */
        @NameInMap("extNodeId")
        public String extNodeId;

        /**
         * <p>The account of the node owner.</p>
         */
        @NameInMap("extNodeOnDuty")
        public String extNodeOnDuty;

        /**
         * <p>The upstream platform.</p>
         */
        @NameInMap("extPlantFrom")
        public String extPlantFrom;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The account that commits the job.</p>
         */
        @NameInMap("jobOwner")
        public String jobOwner;

        /**
         * <p>The type of the job.</p>
         */
        @NameInMap("jobType")
        public String jobType;

        /**
         * <p>The memory snapshot proportion of the job.</p>
         */
        @NameInMap("memorySnapshot")
        public Double memorySnapshot;

        /**
         * <p>The total memory usage.</p>
         */
        @NameInMap("memoryUsage")
        public Long memoryUsage;

        /**
         * <p>The priority of the job.</p>
         */
        @NameInMap("priority")
        public Long priority;

        /**
         * <p>The name of the MaxCompute project.</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The nickname of the quota that is used by the job.</p>
         */
        @NameInMap("quotaNickname")
        public String quotaNickname;

        /**
         * <p>The type of the quota.</p>
         */
        @NameInMap("quotaType")
        public String quotaType;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The time when the job starts to run.</p>
         */
        @NameInMap("runningAtTime")
        public Long runningAtTime;

        /**
         * <p>The period for which the job runs.</p>
         */
        @NameInMap("runningTime")
        public Long runningTime;

        /**
         * <p>The signature of the SQL job.</p>
         */
        @NameInMap("signature")
        public String signature;

        /**
         * <p>The status of the job.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The status of the snapshot.</p>
         */
        @NameInMap("statusSnapshot")
        public String statusSnapshot;

        /**
         * <p>The time when the job was committed.</p>
         */
        @NameInMap("submittedAtTime")
        public Long submittedAtTime;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("tags")
        public String tags;

        /**
         * <p>The tenant ID.</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The total period for which the job runs.</p>
         */
        @NameInMap("totalTime")
        public Long totalTime;

        /**
         * <p>The duration for which the job waits to start.</p>
         */
        @NameInMap("waitingTime")
        public Long waitingTime;

        public static ListJobInfosResponseBodyDataJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListJobInfosResponseBodyDataJobInfoList self = new ListJobInfosResponseBodyDataJobInfoList();
            return TeaModel.build(map, self);
        }

        public ListJobInfosResponseBodyDataJobInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListJobInfosResponseBodyDataJobInfoList setCuSnapshot(Double cuSnapshot) {
            this.cuSnapshot = cuSnapshot;
            return this;
        }
        public Double getCuSnapshot() {
            return this.cuSnapshot;
        }

        public ListJobInfosResponseBodyDataJobInfoList setCuUsage(Long cuUsage) {
            this.cuUsage = cuUsage;
            return this;
        }
        public Long getCuUsage() {
            return this.cuUsage;
        }

        public ListJobInfosResponseBodyDataJobInfoList setEndAtTime(Long endAtTime) {
            this.endAtTime = endAtTime;
            return this;
        }
        public Long getEndAtTime() {
            return this.endAtTime;
        }

        public ListJobInfosResponseBodyDataJobInfoList setExtNodeId(String extNodeId) {
            this.extNodeId = extNodeId;
            return this;
        }
        public String getExtNodeId() {
            return this.extNodeId;
        }

        public ListJobInfosResponseBodyDataJobInfoList setExtNodeOnDuty(String extNodeOnDuty) {
            this.extNodeOnDuty = extNodeOnDuty;
            return this;
        }
        public String getExtNodeOnDuty() {
            return this.extNodeOnDuty;
        }

        public ListJobInfosResponseBodyDataJobInfoList setExtPlantFrom(String extPlantFrom) {
            this.extPlantFrom = extPlantFrom;
            return this;
        }
        public String getExtPlantFrom() {
            return this.extPlantFrom;
        }

        public ListJobInfosResponseBodyDataJobInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListJobInfosResponseBodyDataJobInfoList setJobOwner(String jobOwner) {
            this.jobOwner = jobOwner;
            return this;
        }
        public String getJobOwner() {
            return this.jobOwner;
        }

        public ListJobInfosResponseBodyDataJobInfoList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListJobInfosResponseBodyDataJobInfoList setMemorySnapshot(Double memorySnapshot) {
            this.memorySnapshot = memorySnapshot;
            return this;
        }
        public Double getMemorySnapshot() {
            return this.memorySnapshot;
        }

        public ListJobInfosResponseBodyDataJobInfoList setMemoryUsage(Long memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public Long getMemoryUsage() {
            return this.memoryUsage;
        }

        public ListJobInfosResponseBodyDataJobInfoList setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ListJobInfosResponseBodyDataJobInfoList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListJobInfosResponseBodyDataJobInfoList setQuotaNickname(String quotaNickname) {
            this.quotaNickname = quotaNickname;
            return this;
        }
        public String getQuotaNickname() {
            return this.quotaNickname;
        }

        public ListJobInfosResponseBodyDataJobInfoList setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public ListJobInfosResponseBodyDataJobInfoList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListJobInfosResponseBodyDataJobInfoList setRunningAtTime(Long runningAtTime) {
            this.runningAtTime = runningAtTime;
            return this;
        }
        public Long getRunningAtTime() {
            return this.runningAtTime;
        }

        public ListJobInfosResponseBodyDataJobInfoList setRunningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Long getRunningTime() {
            return this.runningTime;
        }

        public ListJobInfosResponseBodyDataJobInfoList setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public ListJobInfosResponseBodyDataJobInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobInfosResponseBodyDataJobInfoList setStatusSnapshot(String statusSnapshot) {
            this.statusSnapshot = statusSnapshot;
            return this;
        }
        public String getStatusSnapshot() {
            return this.statusSnapshot;
        }

        public ListJobInfosResponseBodyDataJobInfoList setSubmittedAtTime(Long submittedAtTime) {
            this.submittedAtTime = submittedAtTime;
            return this;
        }
        public Long getSubmittedAtTime() {
            return this.submittedAtTime;
        }

        public ListJobInfosResponseBodyDataJobInfoList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListJobInfosResponseBodyDataJobInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListJobInfosResponseBodyDataJobInfoList setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

        public ListJobInfosResponseBodyDataJobInfoList setWaitingTime(Long waitingTime) {
            this.waitingTime = waitingTime;
            return this;
        }
        public Long getWaitingTime() {
            return this.waitingTime;
        }

    }

    public static class ListJobInfosResponseBodyData extends TeaModel {
        /**
         * <p>The list of the information about the jobs.</p>
         */
        @NameInMap("jobInfoList")
        public java.util.List<ListJobInfosResponseBodyDataJobInfoList> jobInfoList;

        /**
         * <p>The page number.</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListJobInfosResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobInfosResponseBodyData self = new ListJobInfosResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobInfosResponseBodyData setJobInfoList(java.util.List<ListJobInfosResponseBodyDataJobInfoList> jobInfoList) {
            this.jobInfoList = jobInfoList;
            return this;
        }
        public java.util.List<ListJobInfosResponseBodyDataJobInfoList> getJobInfoList() {
            return this.jobInfoList;
        }

        public ListJobInfosResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListJobInfosResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListJobInfosResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
