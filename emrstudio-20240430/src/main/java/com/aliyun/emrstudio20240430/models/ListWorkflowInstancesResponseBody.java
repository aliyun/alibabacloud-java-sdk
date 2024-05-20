// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListWorkflowInstancesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListWorkflowInstancesResponseBodyData> data;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalSize")
    public Integer totalSize;

    public static ListWorkflowInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowInstancesResponseBody self = new ListWorkflowInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowInstancesResponseBody setData(java.util.List<ListWorkflowInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWorkflowInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListWorkflowInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkflowInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowInstancesResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class ListWorkflowInstancesResponseBodyData extends TeaModel {
        @NameInMap("endTime")
        public String endTime;

        @NameInMap("name")
        public String name;

        @NameInMap("scheduleTime")
        public String scheduleTime;

        @NameInMap("startTime")
        public String startTime;

        @NameInMap("status")
        public String status;

        @NameInMap("workflowId")
        public String workflowId;

        @NameInMap("workflowInstanceId")
        public String workflowInstanceId;

        @NameInMap("workflowVersion")
        public Integer workflowVersion;

        public static ListWorkflowInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowInstancesResponseBodyData self = new ListWorkflowInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkflowInstancesResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListWorkflowInstancesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowInstancesResponseBodyData setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public ListWorkflowInstancesResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListWorkflowInstancesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkflowInstancesResponseBodyData setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

        public ListWorkflowInstancesResponseBodyData setWorkflowInstanceId(String workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public String getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public ListWorkflowInstancesResponseBodyData setWorkflowVersion(Integer workflowVersion) {
            this.workflowVersion = workflowVersion;
            return this;
        }
        public Integer getWorkflowVersion() {
            return this.workflowVersion;
        }

    }

}
