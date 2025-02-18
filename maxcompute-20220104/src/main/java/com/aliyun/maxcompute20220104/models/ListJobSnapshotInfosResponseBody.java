// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobSnapshotInfosResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public ListJobSnapshotInfosResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>this quota is not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: informational response. The request is received and is being processed.</li>
     * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
     * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
     * <li>4xx: client error. The request contains invalid request parameters or syntaxes, or specific request conditions cannot be met.</li>
     * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0b87b7e716665825896565060e87a4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListJobSnapshotInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobSnapshotInfosResponseBody self = new ListJobSnapshotInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobSnapshotInfosResponseBody setData(ListJobSnapshotInfosResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobSnapshotInfosResponseBodyData getData() {
        return this.data;
    }

    public ListJobSnapshotInfosResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListJobSnapshotInfosResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListJobSnapshotInfosResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListJobSnapshotInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListJobSnapshotInfosResponseBodyDataJobInfoList extends TeaModel {
        @NameInMap("cpuRequest")
        public Long cpuRequest;

        /**
         * <p>CPU usage of the job at the snapshot time. Unit: Core.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cpuUsage")
        public Long cpuUsage;

        @NameInMap("cpuUsageToRequestRatio")
        public Double cpuUsageToRequestRatio;

        /**
         * <p>The ID of the upstream node.</p>
         * 
         * <strong>example:</strong>
         * <p>76358164</p>
         */
        @NameInMap("extNodeId")
        public String extNodeId;

        /**
         * <p>The account ID of the task owner.</p>
         * 
         * <strong>example:</strong>
         * <p>duty_2</p>
         */
        @NameInMap("extNodeOnDuty")
        public String extNodeOnDuty;

        /**
         * <p>The upstream platform.</p>
         * 
         * <strong>example:</strong>
         * <p>Dataworks</p>
         */
        @NameInMap("extPlantFrom")
        public String extPlantFrom;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20241028****jkl</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The account that commits the job.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN$7632***@aliyun.com</p>
         */
        @NameInMap("jobOwner")
        public String jobOwner;

        /**
         * <p>The type of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("jobType")
        public String jobType;

        /**
         * <p>Not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("maxCpuPct")
        public Double maxCpuPct;

        /**
         * <p>Not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("maxMemoryPct")
        public Double maxMemoryPct;

        @NameInMap("memoryRequest")
        public Long memoryRequest;

        /**
         * <p>Memory usage of the job at the snapshot time. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>409600</p>
         */
        @NameInMap("memoryUsage")
        public Long memoryUsage;

        @NameInMap("memoryUsageToRequestRatio")
        public Double memoryUsageToRequestRatio;

        /**
         * <p>The CPU usage ratio of the annual or monthly subscription job at the snapshot time (CPU usage / (reserved CPU guarantee + elastic reserved CPU)). This parameter is not available for pay-as-you-go jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("minCpuPct")
        public Double minCpuPct;

        /**
         * <p>The memory usage ratio of the annual or monthly subscription job at the observation time (memory usage / (reserved memory guarantee + elastic reserved memory)). This parameter is not available for pay-as-you-go jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("minMemoryPct")
        public Double minMemoryPct;

        /**
         * <p>The priority of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("priority")
        public Long priority;

        /**
         * <p>The name of the MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>projectA</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The nickname of the computing Quota used by the job.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_A</p>
         */
        @NameInMap("quotaNickname")
        public String quotaNickname;

        /**
         * <p>The type of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>subscription</p>
         */
        @NameInMap("quotaType")
        public String quotaType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The start time of the job.</p>
         * <blockquote>
         * <p>The time when the job received the first batch of computing resources.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1736821805</p>
         */
        @NameInMap("runningAtTime")
        public Long runningAtTime;

        /**
         * <p>The running duration, which is the duration from the runningAtTime to the snapshotTime of the job.  Unit: seconds (s).</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("runningTime")
        public Long runningTime;

        /**
         * <p>The signature of the SQL job.</p>
         * 
         * <strong>example:</strong>
         * <p>signatureabc</p>
         */
        @NameInMap("signature")
        public String signature;

        /**
         * <p>The snapshot time.</p>
         * 
         * <strong>example:</strong>
         * <p>1736821848</p>
         */
        @NameInMap("snapshotTime")
        public Long snapshotTime;

        /**
         * <p>The snapshot status of the job.</p>
         * <blockquote>
         * <p>The snapshot status is only running.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the job was committed.</p>
         * 
         * <strong>example:</strong>
         * <p>1736821785</p>
         */
        @NameInMap("submittedAtTime")
        public Long submittedAtTime;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>213065738244354</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The interval from the time when the job was submitted to the snapshotTime .Unit: seconds (s).</p>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        @NameInMap("totalTime")
        public Long totalTime;

        /**
         * <p>The duration from the time the job is submitted to the time the job starts to run. Unit: seconds (s).</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("waitingTime")
        public Long waitingTime;

        public static ListJobSnapshotInfosResponseBodyDataJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListJobSnapshotInfosResponseBodyDataJobInfoList self = new ListJobSnapshotInfosResponseBodyDataJobInfoList();
            return TeaModel.build(map, self);
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setCpuRequest(Long cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }
        public Long getCpuRequest() {
            return this.cpuRequest;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setCpuUsage(Long cpuUsage) {
            this.cpuUsage = cpuUsage;
            return this;
        }
        public Long getCpuUsage() {
            return this.cpuUsage;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setCpuUsageToRequestRatio(Double cpuUsageToRequestRatio) {
            this.cpuUsageToRequestRatio = cpuUsageToRequestRatio;
            return this;
        }
        public Double getCpuUsageToRequestRatio() {
            return this.cpuUsageToRequestRatio;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setExtNodeId(String extNodeId) {
            this.extNodeId = extNodeId;
            return this;
        }
        public String getExtNodeId() {
            return this.extNodeId;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setExtNodeOnDuty(String extNodeOnDuty) {
            this.extNodeOnDuty = extNodeOnDuty;
            return this;
        }
        public String getExtNodeOnDuty() {
            return this.extNodeOnDuty;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setExtPlantFrom(String extPlantFrom) {
            this.extPlantFrom = extPlantFrom;
            return this;
        }
        public String getExtPlantFrom() {
            return this.extPlantFrom;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setJobOwner(String jobOwner) {
            this.jobOwner = jobOwner;
            return this;
        }
        public String getJobOwner() {
            return this.jobOwner;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setMaxCpuPct(Double maxCpuPct) {
            this.maxCpuPct = maxCpuPct;
            return this;
        }
        public Double getMaxCpuPct() {
            return this.maxCpuPct;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setMaxMemoryPct(Double maxMemoryPct) {
            this.maxMemoryPct = maxMemoryPct;
            return this;
        }
        public Double getMaxMemoryPct() {
            return this.maxMemoryPct;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setMemoryRequest(Long memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public Long getMemoryRequest() {
            return this.memoryRequest;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setMemoryUsage(Long memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public Long getMemoryUsage() {
            return this.memoryUsage;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setMemoryUsageToRequestRatio(Double memoryUsageToRequestRatio) {
            this.memoryUsageToRequestRatio = memoryUsageToRequestRatio;
            return this;
        }
        public Double getMemoryUsageToRequestRatio() {
            return this.memoryUsageToRequestRatio;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setMinCpuPct(Double minCpuPct) {
            this.minCpuPct = minCpuPct;
            return this;
        }
        public Double getMinCpuPct() {
            return this.minCpuPct;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setMinMemoryPct(Double minMemoryPct) {
            this.minMemoryPct = minMemoryPct;
            return this;
        }
        public Double getMinMemoryPct() {
            return this.minMemoryPct;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setQuotaNickname(String quotaNickname) {
            this.quotaNickname = quotaNickname;
            return this;
        }
        public String getQuotaNickname() {
            return this.quotaNickname;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setRunningAtTime(Long runningAtTime) {
            this.runningAtTime = runningAtTime;
            return this;
        }
        public Long getRunningAtTime() {
            return this.runningAtTime;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setRunningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Long getRunningTime() {
            return this.runningTime;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setSnapshotTime(Long snapshotTime) {
            this.snapshotTime = snapshotTime;
            return this;
        }
        public Long getSnapshotTime() {
            return this.snapshotTime;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setSubmittedAtTime(Long submittedAtTime) {
            this.submittedAtTime = submittedAtTime;
            return this;
        }
        public Long getSubmittedAtTime() {
            return this.submittedAtTime;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setWaitingTime(Long waitingTime) {
            this.waitingTime = waitingTime;
            return this;
        }
        public Long getWaitingTime() {
            return this.waitingTime;
        }

    }

    public static class ListJobSnapshotInfosResponseBodyData extends TeaModel {
        /**
         * <p>The list of jobs snapshot information</p>
         */
        @NameInMap("jobInfoList")
        public java.util.List<ListJobSnapshotInfosResponseBodyDataJobInfoList> jobInfoList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListJobSnapshotInfosResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobSnapshotInfosResponseBodyData self = new ListJobSnapshotInfosResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobSnapshotInfosResponseBodyData setJobInfoList(java.util.List<ListJobSnapshotInfosResponseBodyDataJobInfoList> jobInfoList) {
            this.jobInfoList = jobInfoList;
            return this;
        }
        public java.util.List<ListJobSnapshotInfosResponseBodyDataJobInfoList> getJobInfoList() {
            return this.jobInfoList;
        }

        public ListJobSnapshotInfosResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListJobSnapshotInfosResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListJobSnapshotInfosResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
