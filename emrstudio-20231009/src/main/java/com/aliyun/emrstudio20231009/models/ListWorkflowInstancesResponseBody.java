// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

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
        @NameInMap("endDate")
        public String endDate;

        @NameInMap("name")
        public String name;

        @NameInMap("runTimes")
        public String runTimes;

        @NameInMap("scheduleTime")
        public String scheduleTime;

        @NameInMap("startDate")
        public String startDate;

        @NameInMap("state")
        public String state;

        @NameInMap("workflowId")
        public Long workflowId;

        @NameInMap("workflowInstanceId")
        public Long workflowInstanceId;

        @NameInMap("workflowVersion")
        public String workflowVersion;

        public static ListWorkflowInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowInstancesResponseBodyData self = new ListWorkflowInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkflowInstancesResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListWorkflowInstancesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowInstancesResponseBodyData setRunTimes(String runTimes) {
            this.runTimes = runTimes;
            return this;
        }
        public String getRunTimes() {
            return this.runTimes;
        }

        public ListWorkflowInstancesResponseBodyData setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public ListWorkflowInstancesResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListWorkflowInstancesResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListWorkflowInstancesResponseBodyData setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ListWorkflowInstancesResponseBodyData setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public ListWorkflowInstancesResponseBodyData setWorkflowVersion(String workflowVersion) {
            this.workflowVersion = workflowVersion;
            return this;
        }
        public String getWorkflowVersion() {
            return this.workflowVersion;
        }

    }

}
