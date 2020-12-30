// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListExecutionPlanInstancesResponseBody extends TeaModel {
    @NameInMap("ExecutionPlanInstances")
    public ListExecutionPlanInstancesResponseBodyExecutionPlanInstances executionPlanInstances;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListExecutionPlanInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionPlanInstancesResponseBody self = new ListExecutionPlanInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExecutionPlanInstancesResponseBody setExecutionPlanInstances(ListExecutionPlanInstancesResponseBodyExecutionPlanInstances executionPlanInstances) {
        this.executionPlanInstances = executionPlanInstances;
        return this;
    }
    public ListExecutionPlanInstancesResponseBodyExecutionPlanInstances getExecutionPlanInstances() {
        return this.executionPlanInstances;
    }

    public ListExecutionPlanInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListExecutionPlanInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExecutionPlanInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExecutionPlanInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("LogEnable")
        public Boolean logEnable;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("ExecutionPlanId")
        public String executionPlanId;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("RunTime")
        public Integer runTime;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("WorkflowApp")
        public String workflowApp;

        @NameInMap("Id")
        public String id;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ExecutionPlanName")
        public String executionPlanName;

        public static ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance self = new ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance();
            return TeaModel.build(map, self);
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance setLogEnable(Boolean logEnable) {
            this.logEnable = logEnable;
            return this;
        }
        public Boolean getLogEnable() {
            return this.logEnable;
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance setExecutionPlanId(String executionPlanId) {
            this.executionPlanId = executionPlanId;
            return this;
        }
        public String getExecutionPlanId() {
            return this.executionPlanId;
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance setRunTime(Integer runTime) {
            this.runTime = runTime;
            return this;
        }
        public Integer getRunTime() {
            return this.runTime;
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance setWorkflowApp(String workflowApp) {
            this.workflowApp = workflowApp;
            return this;
        }
        public String getWorkflowApp() {
            return this.workflowApp;
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance setExecutionPlanName(String executionPlanName) {
            this.executionPlanName = executionPlanName;
            return this;
        }
        public String getExecutionPlanName() {
            return this.executionPlanName;
        }

    }

    public static class ListExecutionPlanInstancesResponseBodyExecutionPlanInstances extends TeaModel {
        @NameInMap("ExecutionPlanInstance")
        public java.util.List<ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance> executionPlanInstance;

        public static ListExecutionPlanInstancesResponseBodyExecutionPlanInstances build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionPlanInstancesResponseBodyExecutionPlanInstances self = new ListExecutionPlanInstancesResponseBodyExecutionPlanInstances();
            return TeaModel.build(map, self);
        }

        public ListExecutionPlanInstancesResponseBodyExecutionPlanInstances setExecutionPlanInstance(java.util.List<ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance> executionPlanInstance) {
            this.executionPlanInstance = executionPlanInstance;
            return this;
        }
        public java.util.List<ListExecutionPlanInstancesResponseBodyExecutionPlanInstancesExecutionPlanInstance> getExecutionPlanInstance() {
            return this.executionPlanInstance;
        }

    }

}
