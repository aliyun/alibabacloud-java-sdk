// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListExecutionsResponseBody extends TeaModel {
    /**
     * <p>The information about executions.</p>
     */
    @NameInMap("Executions")
    public java.util.List<ListExecutionsResponseBodyExecutions> executions;

    /**
     * <p>The start key for the next query. This parameter is not returned if this is the last query.</p>
     * <blockquote>
     * <p> This parameter may not be displayed in the response because no next page exists.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>exec2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>testRequestId</p>
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

    public static class ListExecutionsResponseBodyExecutionsEnvironmentVariables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListExecutionsResponseBodyExecutionsEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionsResponseBodyExecutionsEnvironmentVariables self = new ListExecutionsResponseBodyExecutionsEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public ListExecutionsResponseBodyExecutionsEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExecutionsResponseBodyExecutionsEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListExecutionsResponseBodyExecutionsEnvironment extends TeaModel {
        @NameInMap("Variables")
        public java.util.List<ListExecutionsResponseBodyExecutionsEnvironmentVariables> variables;

        public static ListExecutionsResponseBodyExecutionsEnvironment build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionsResponseBodyExecutionsEnvironment self = new ListExecutionsResponseBodyExecutionsEnvironment();
            return TeaModel.build(map, self);
        }

        public ListExecutionsResponseBodyExecutionsEnvironment setVariables(java.util.List<ListExecutionsResponseBodyExecutionsEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListExecutionsResponseBodyExecutionsEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class ListExecutionsResponseBodyExecutions extends TeaModel {
        @NameInMap("Environment")
        public ListExecutionsResponseBodyExecutionsEnvironment environment;

        /**
         * <p>The definition of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>version: v1.0\ntype: flow\nname: test\nsteps:\n  - type: pass\n    name: mypass</p>
         */
        @NameInMap("FlowDefinition")
        public String flowDefinition;

        /**
         * <p>The name of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        /**
         * <p>The input of the execution, which is in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The name of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>exec</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output of the execution, which is in the JSON format</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The time when the execution started.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
         */
        @NameInMap("StartedTime")
        public String startedTime;

        /**
         * <p>The status of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the execution stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
         */
        @NameInMap("StoppedTime")
        public String stoppedTime;

        public static ListExecutionsResponseBodyExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionsResponseBodyExecutions self = new ListExecutionsResponseBodyExecutions();
            return TeaModel.build(map, self);
        }

        public ListExecutionsResponseBodyExecutions setEnvironment(ListExecutionsResponseBodyExecutionsEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public ListExecutionsResponseBodyExecutionsEnvironment getEnvironment() {
            return this.environment;
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
