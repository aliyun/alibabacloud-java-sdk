// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListExecutionsResponseBody extends TeaModel {
    /**
     * <p>The queried executions.</p>
     */
    @NameInMap("Executions")
    public java.util.List<ListExecutionsResponseBodyExecutions> executions;

    /**
     * <p>The start key for the next query. This parameter is not returned if all results have been returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The definition of the flow.</p>
         */
        @NameInMap("FlowDefinition")
        public String flowDefinition;

        /**
         * <p>The name of the flow.</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        /**
         * <p>The input of the execution, which is in the JSON format.</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The name of the execution.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The execution result, which is in the JSON format.</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The time when the execution started.</p>
         */
        @NameInMap("StartedTime")
        public String startedTime;

        /**
         * <p>The state of the execution.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the execution stopped.</p>
         */
        @NameInMap("StoppedTime")
        public String stoppedTime;

        public static ListExecutionsResponseBodyExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionsResponseBodyExecutions self = new ListExecutionsResponseBodyExecutions();
            return TeaModel.build(map, self);
        }

        public ListExecutionsResponseBodyExecutions setFlowDefinition(String flowDefinition) {
            this.flowDefinition = flowDefinition;
            return this;
        }
        public String getFlowDefinition() {
            return this.flowDefinition;
        }

        public ListExecutionsResponseBodyExecutions setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListExecutionsResponseBodyExecutions setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public ListExecutionsResponseBodyExecutions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExecutionsResponseBodyExecutions setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public ListExecutionsResponseBodyExecutions setStartedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public String getStartedTime() {
            return this.startedTime;
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

    }

}
