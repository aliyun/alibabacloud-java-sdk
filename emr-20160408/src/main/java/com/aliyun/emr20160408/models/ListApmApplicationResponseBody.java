// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListApmApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ApmAppInfoList")
    public ListApmApplicationResponseBodyApmAppInfoList apmAppInfoList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    public static ListApmApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApmApplicationResponseBody self = new ListApmApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApmApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApmApplicationResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApmApplicationResponseBody setApmAppInfoList(ListApmApplicationResponseBodyApmAppInfoList apmAppInfoList) {
        this.apmAppInfoList = apmAppInfoList;
        return this;
    }
    public ListApmApplicationResponseBodyApmAppInfoList getApmAppInfoList() {
        return this.apmAppInfoList;
    }

    public ListApmApplicationResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApmApplicationResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListApmApplicationResponseBodyApmAppInfoListApmAppInfo extends TeaModel {
        @NameInMap("VcoreSeconds")
        public Long vcoreSeconds;

        @NameInMap("Diagnostics")
        public String diagnostics;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("DiagnoseCode")
        public String diagnoseCode;

        @NameInMap("FinalStatus")
        public String finalStatus;

        @NameInMap("AllocatedVcore")
        public Long allocatedVcore;

        @NameInMap("QueueUsagePercent")
        public Float queueUsagePercent;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceRequests")
        public String resourceRequests;

        @NameInMap("Progress")
        public Float progress;

        @NameInMap("State")
        public String state;

        @NameInMap("ClusterUsagePercent")
        public Float clusterUsagePercent;

        @NameInMap("RunningContainers")
        public Integer runningContainers;

        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("User")
        public String user;

        @NameInMap("AllocatedMemory")
        public Long allocatedMemory;

        @NameInMap("RunningDuration")
        public Integer runningDuration;

        @NameInMap("MemorySeconds")
        public Long memorySeconds;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("DiagnoseResult")
        public String diagnoseResult;

        @NameInMap("FinishedTime")
        public Long finishedTime;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("ClusterBizId")
        public String clusterBizId;

        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("SubmitTime")
        public Long submitTime;

        public static ListApmApplicationResponseBodyApmAppInfoListApmAppInfo build(java.util.Map<String, ?> map) throws Exception {
            ListApmApplicationResponseBodyApmAppInfoListApmAppInfo self = new ListApmApplicationResponseBodyApmAppInfoListApmAppInfo();
            return TeaModel.build(map, self);
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setVcoreSeconds(Long vcoreSeconds) {
            this.vcoreSeconds = vcoreSeconds;
            return this;
        }
        public Long getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setDiagnostics(String diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }
        public String getDiagnostics() {
            return this.diagnostics;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setDiagnoseCode(String diagnoseCode) {
            this.diagnoseCode = diagnoseCode;
            return this;
        }
        public String getDiagnoseCode() {
            return this.diagnoseCode;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setFinalStatus(String finalStatus) {
            this.finalStatus = finalStatus;
            return this;
        }
        public String getFinalStatus() {
            return this.finalStatus;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setAllocatedVcore(Long allocatedVcore) {
            this.allocatedVcore = allocatedVcore;
            return this;
        }
        public Long getAllocatedVcore() {
            return this.allocatedVcore;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setQueueUsagePercent(Float queueUsagePercent) {
            this.queueUsagePercent = queueUsagePercent;
            return this;
        }
        public Float getQueueUsagePercent() {
            return this.queueUsagePercent;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setResourceRequests(String resourceRequests) {
            this.resourceRequests = resourceRequests;
            return this;
        }
        public String getResourceRequests() {
            return this.resourceRequests;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setClusterUsagePercent(Float clusterUsagePercent) {
            this.clusterUsagePercent = clusterUsagePercent;
            return this;
        }
        public Float getClusterUsagePercent() {
            return this.clusterUsagePercent;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setRunningContainers(Integer runningContainers) {
            this.runningContainers = runningContainers;
            return this;
        }
        public Integer getRunningContainers() {
            return this.runningContainers;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setAllocatedMemory(Long allocatedMemory) {
            this.allocatedMemory = allocatedMemory;
            return this;
        }
        public Long getAllocatedMemory() {
            return this.allocatedMemory;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setRunningDuration(Integer runningDuration) {
            this.runningDuration = runningDuration;
            return this;
        }
        public Integer getRunningDuration() {
            return this.runningDuration;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setMemorySeconds(Long memorySeconds) {
            this.memorySeconds = memorySeconds;
            return this;
        }
        public Long getMemorySeconds() {
            return this.memorySeconds;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setDiagnoseResult(String diagnoseResult) {
            this.diagnoseResult = diagnoseResult;
            return this;
        }
        public String getDiagnoseResult() {
            return this.diagnoseResult;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setClusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApmApplicationResponseBodyApmAppInfoListApmAppInfo setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class ListApmApplicationResponseBodyApmAppInfoList extends TeaModel {
        @NameInMap("ApmAppInfo")
        public java.util.List<ListApmApplicationResponseBodyApmAppInfoListApmAppInfo> apmAppInfo;

        public static ListApmApplicationResponseBodyApmAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListApmApplicationResponseBodyApmAppInfoList self = new ListApmApplicationResponseBodyApmAppInfoList();
            return TeaModel.build(map, self);
        }

        public ListApmApplicationResponseBodyApmAppInfoList setApmAppInfo(java.util.List<ListApmApplicationResponseBodyApmAppInfoListApmAppInfo> apmAppInfo) {
            this.apmAppInfo = apmAppInfo;
            return this;
        }
        public java.util.List<ListApmApplicationResponseBodyApmAppInfoListApmAppInfo> getApmAppInfo() {
            return this.apmAppInfo;
        }

    }

}
