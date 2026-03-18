// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobSnapshotInfosResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
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
     * <p>异常信息</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p>1xx: Informational - The request has been received and the process is continuing.</p>
     * </li>
     * <li><p>2xx: Success - The request was successfully received, understood, and accepted.</p>
     * </li>
     * <li><p>3xx: Redirection - Further action must be taken to complete the request.</p>
     * </li>
     * <li><p>4xx: Client Error - The request contains bad syntax or cannot be fulfilled.</p>
     * </li>
     * <li><p>5xx: Server Error - The server failed to fulfill an apparently valid request.</p>
     * </li>
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
        /**
         * <p>The amount of CPU cores requested by the job at the snapshot time.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("cpuRequest")
        public Long cpuRequest;

        /**
         * <p>The CPU usage of the job at the snapshot time. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cpuUsage")
        public Long cpuUsage;

        /**
         * <p>The CPU fulfillment ratio of the job at the snapshot time. This is calculated by dividing the CPU usage by the CPU request.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("cpuUsageToRequestRatio")
        public Double cpuUsageToRequestRatio;

        /**
         * <p>The upstream node ID.</p>
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

        @NameInMap("extPlatformId")
        public String extPlatformId;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20241028****jkl</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The job owner.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN$7632***@aliyun.com</p>
         */
        @NameInMap("jobOwner")
        public String jobOwner;

        /**
         * <p>The job type.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("jobType")
        public String jobType;

        /**
         * <p>This parameter is not used.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("maxCpuPct")
        public Double maxCpuPct;

        /**
         * <p>This parameter is not used.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("maxMemoryPct")
        public Double maxMemoryPct;

        /**
         * <p>The amount of memory requested by the job at the snapshot time, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>409600</p>
         */
        @NameInMap("memoryRequest")
        public Long memoryRequest;

        /**
         * <p>The memory usage of the job at the snapshot time. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>409600</p>
         */
        @NameInMap("memoryUsage")
        public Long memoryUsage;

        /**
         * <p>The memory fulfillment ratio of the job at the snapshot time. This is calculated by dividing the memory usage by the memory request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("memoryUsageToRequestRatio")
        public Double memoryUsageToRequestRatio;

        /**
         * <p>The CPU usage percentage of a subscription job at the snapshot time. This value is calculated by dividing the CPU usage by the sum of the reserved CPU guarantee and the elastic reserved CPU. This parameter is not available for pay-as-you-go jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("minCpuPct")
        public Double minCpuPct;

        /**
         * <p>The memory usage percentage of a subscription job at the observation time. This value is calculated by dividing the memory usage by the sum of the reserved memory guarantee and the elastic reserved memory. This parameter is not available for pay-as-you-go jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("minMemoryPct")
        public Double minMemoryPct;

        /**
         * <p>The job priority.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("priority")
        public Long priority;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>projectA</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The nickname of the computing quota that the job uses.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_A</p>
         */
        @NameInMap("quotaNickname")
        public String quotaNickname;

        /**
         * <p>The quota type.</p>
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
         * <p>The time when the job started running.</p>
         * <blockquote>
         * <p>The time when the job acquired its first computing resource.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1736821805</p>
         */
        @NameInMap("runningAtTime")
        public Long runningAtTime;

        /**
         * <p>The runtime duration, in seconds. This is the duration from when the job started running to the snapshot time. If the job has not started, this parameter is empty.</p>
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
         * <p>The job status.</p>
         * <blockquote>
         * <p>The status of a snapshot job can only be \<code>running\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the job was submitted.</p>
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
         * <p>The total duration, in seconds. This is the duration from when the job was submitted to the snapshot time.</p>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        @NameInMap("totalTime")
        public Long totalTime;

        /**
         * <p>The waiting duration, in seconds. This is the duration from when the job was submitted to when it started running. If the job has not started, this is the duration from the submission time to the snapshot time.</p>
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

        public ListJobSnapshotInfosResponseBodyDataJobInfoList setExtPlatformId(String extPlatformId) {
            this.extPlatformId = extPlatformId;
            return this;
        }
        public String getExtPlatformId() {
            return this.extPlatformId;
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
         * <p>The list of job snapshots.</p>
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
         * <p>The total number of entries returned.</p>
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
