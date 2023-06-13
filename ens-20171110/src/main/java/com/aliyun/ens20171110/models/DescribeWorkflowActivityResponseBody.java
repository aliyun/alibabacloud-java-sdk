// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeWorkflowActivityResponseBody extends TeaModel {
    @NameInMap("ActivityInfo")
    public java.util.List<DescribeWorkflowActivityResponseBodyActivityInfo> activityInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWorkflowActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowActivityResponseBody self = new DescribeWorkflowActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowActivityResponseBody setActivityInfo(java.util.List<DescribeWorkflowActivityResponseBodyActivityInfo> activityInfo) {
        this.activityInfo = activityInfo;
        return this;
    }
    public java.util.List<DescribeWorkflowActivityResponseBodyActivityInfo> getActivityInfo() {
        return this.activityInfo;
    }

    public DescribeWorkflowActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWorkflowActivityResponseBodyActivityInfo extends TeaModel {
        @NameInMap("ActivityId")
        public String activityId;

        @NameInMap("ActivityName")
        public String activityName;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Error")
        public String error;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtEnd")
        public String gmtEnd;

        @NameInMap("GmtStart")
        public String gmtStart;

        @NameInMap("Input")
        public String input;

        @NameInMap("Method")
        public String method;

        @NameInMap("Output")
        public String output;

        @NameInMap("State")
        public String state;

        @NameInMap("WorkerNode")
        public String workerNode;

        public static DescribeWorkflowActivityResponseBodyActivityInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkflowActivityResponseBodyActivityInfo self = new DescribeWorkflowActivityResponseBodyActivityInfo();
            return TeaModel.build(map, self);
        }

        public DescribeWorkflowActivityResponseBodyActivityInfo setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public DescribeWorkflowActivityResponseBodyActivityInfo setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public DescribeWorkflowActivityResponseBodyActivityInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public DescribeWorkflowActivityResponseBodyActivityInfo setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public DescribeWorkflowActivityResponseBodyActivityInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeWorkflowActivityResponseBodyActivityInfo setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public DescribeWorkflowActivityResponseBodyActivityInfo setGmtStart(String gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public String getGmtStart() {
            return this.gmtStart;
        }

        public DescribeWorkflowActivityResponseBodyActivityInfo setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public DescribeWorkflowActivityResponseBodyActivityInfo setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeWorkflowActivityResponseBodyActivityInfo setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeWorkflowActivityResponseBodyActivityInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeWorkflowActivityResponseBodyActivityInfo setWorkerNode(String workerNode) {
            this.workerNode = workerNode;
            return this;
        }
        public String getWorkerNode() {
            return this.workerNode;
        }

    }

}
