// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListExecutionsResponseBody extends TeaModel {
    @NameInMap("Executions")
    public java.util.List<ListExecutionsResponseBodyExecutions> executions;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionsResponseBody self = new ListExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExecutionsResponseBody setExecutions(java.util.List<ListExecutionsResponseBodyExecutions> executions) {
        this.executions = executions;
        return this;
    }
    public java.util.List<ListExecutionsResponseBodyExecutions> getExecutions() {
        return this.executions;
    }

    public ListExecutionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListExecutionsResponseBodyExecutions extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StoppedTime")
        public String stoppedTime;

        @NameInMap("StartedTime")
        public String startedTime;

        @NameInMap("FlowDefinition")
        public String flowDefinition;

        @NameInMap("ExternalInputUri")
        public String externalInputUri;

        @NameInMap("Output")
        public String output;

        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("ExternalOutputUri")
        public String externalOutputUri;

        @NameInMap("Name")
        public String name;

        @NameInMap("Input")
        public String input;

        public static ListExecutionsResponseBodyExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionsResponseBodyExecutions self = new ListExecutionsResponseBodyExecutions();
            return TeaModel.build(map, self);
        }

        public ListExecutionsResponseBodyExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExecutionsResponseBodyExecutions setStoppedTime(String stoppedTime) {
            this.stoppedTime = stoppedTime;
            return this;
        }
        public String getStoppedTime() {
            return this.stoppedTime;
        }

        public ListExecutionsResponseBodyExecutions setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
        }

        public ListExecutionsResponseBodyExecutions setFlowDefinition(String flowDefinition) {
            this.flowDefinition = flowDefinition;
            return this;
        }
        public String getFlowDefinition() {
            return this.flowDefinition;
        }

        public ListExecutionsResponseBodyExecutions setExternalInputUri(String externalInputUri) {
            this.externalInputUri = externalInputUri;
            return this;
        }
        public String getExternalInputUri() {
            return this.externalInputUri;
        }

        public ListExecutionsResponseBodyExecutions setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public ListExecutionsResponseBodyExecutions setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListExecutionsResponseBodyExecutions setExternalOutputUri(String externalOutputUri) {
            this.externalOutputUri = externalOutputUri;
            return this;
        }
        public String getExternalOutputUri() {
            return this.externalOutputUri;
        }

        public ListExecutionsResponseBodyExecutions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExecutionsResponseBodyExecutions setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

    }

}
