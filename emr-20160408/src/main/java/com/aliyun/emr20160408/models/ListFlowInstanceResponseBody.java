// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowInstanceResponseBody extends TeaModel {
    @NameInMap("FlowInstances")
    public ListFlowInstanceResponseBodyFlowInstances flowInstances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    public static ListFlowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowInstanceResponseBody self = new ListFlowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowInstanceResponseBody setFlowInstances(ListFlowInstanceResponseBodyFlowInstances flowInstances) {
        this.flowInstances = flowInstances;
        return this;
    }
    public ListFlowInstanceResponseBodyFlowInstances getFlowInstances() {
        return this.flowInstances;
    }

    public ListFlowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowInstanceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowInstanceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowInstanceResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListFlowInstanceResponseBodyFlowInstancesFlowInstance extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("HasNodeFailed")
        public Boolean hasNodeFailed;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("ScheduleTime")
        public Long scheduleTime;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Id")
        public String id;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ListFlowInstanceResponseBodyFlowInstancesFlowInstance build(java.util.Map<String, ?> map) throws Exception {
            ListFlowInstanceResponseBodyFlowInstancesFlowInstance self = new ListFlowInstanceResponseBodyFlowInstancesFlowInstance();
            return TeaModel.build(map, self);
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setHasNodeFailed(Boolean hasNodeFailed) {
            this.hasNodeFailed = hasNodeFailed;
            return this;
        }
        public Boolean getHasNodeFailed() {
            return this.hasNodeFailed;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setScheduleTime(Long scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public Long getScheduleTime() {
            return this.scheduleTime;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFlowInstanceResponseBodyFlowInstancesFlowInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ListFlowInstanceResponseBodyFlowInstances extends TeaModel {
        @NameInMap("FlowInstance")
        public java.util.List<ListFlowInstanceResponseBodyFlowInstancesFlowInstance> flowInstance;

        public static ListFlowInstanceResponseBodyFlowInstances build(java.util.Map<String, ?> map) throws Exception {
            ListFlowInstanceResponseBodyFlowInstances self = new ListFlowInstanceResponseBodyFlowInstances();
            return TeaModel.build(map, self);
        }

        public ListFlowInstanceResponseBodyFlowInstances setFlowInstance(java.util.List<ListFlowInstanceResponseBodyFlowInstancesFlowInstance> flowInstance) {
            this.flowInstance = flowInstance;
            return this;
        }
        public java.util.List<ListFlowInstanceResponseBodyFlowInstancesFlowInstance> getFlowInstance() {
            return this.flowInstance;
        }

    }

}
