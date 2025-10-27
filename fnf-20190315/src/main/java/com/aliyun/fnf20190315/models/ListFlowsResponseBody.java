// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListFlowsResponseBody extends TeaModel {
    /**
     * <p>The details of flows.</p>
     */
    @NameInMap("Flows")
    public java.util.List<ListFlowsResponseBodyFlows> flows;

    /**
     * <p>The start key for the next query. This parameter is not returned if all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>flow_nextxxx</p>
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

    public static ListFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsResponseBody self = new ListFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowsResponseBody setFlows(java.util.List<ListFlowsResponseBodyFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<ListFlowsResponseBodyFlows> getFlows() {
        return this.flows;
    }

    public ListFlowsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFlowsResponseBodyFlowsEnvironmentVariables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

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

        public static ListFlowsResponseBodyFlowsEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsResponseBodyFlowsEnvironmentVariables self = new ListFlowsResponseBodyFlowsEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public ListFlowsResponseBodyFlowsEnvironmentVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowsResponseBodyFlowsEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowsResponseBodyFlowsEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListFlowsResponseBodyFlowsEnvironment extends TeaModel {
        @NameInMap("Variables")
        public java.util.List<ListFlowsResponseBodyFlowsEnvironmentVariables> variables;

        public static ListFlowsResponseBodyFlowsEnvironment build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsResponseBodyFlowsEnvironment self = new ListFlowsResponseBodyFlowsEnvironment();
            return TeaModel.build(map, self);
        }

        public ListFlowsResponseBodyFlowsEnvironment setVariables(java.util.List<ListFlowsResponseBodyFlowsEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListFlowsResponseBodyFlowsEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class ListFlowsResponseBodyFlows extends TeaModel {
        /**
         * <p>The time when the flow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The definition of the flow. The definition must comply with the Flow Definition Language (FDL) syntax.</p>
         * 
         * <strong>example:</strong>
         * <p>version: v1.0\ntype: flow\nname: test\nsteps:\n - type: pass\n name: mypass</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The description of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>test flow</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Environment")
        public ListFlowsResponseBodyFlowsEnvironment environment;

        /**
         * <p>The execution mode or the enumeration type. Valid values: Express and Standard. A value of Standard indicates an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("ExecutionMode")
        public String executionMode;

        /**
         * <p>The unique ID of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>e589e092-e2c0-4dee-b306-3574ddf5****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the flow was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
         */
        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        /**
         * <p>The name of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Alibaba Cloud resource name (ARN) of the specified Resource Access Management (RAM) role that Serverless Workflow assumes to invoke resources when the flow is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::${accountID}:${role}</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The type of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>FDL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListFlowsResponseBodyFlows build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsResponseBodyFlows self = new ListFlowsResponseBodyFlows();
            return TeaModel.build(map, self);
        }

        public ListFlowsResponseBodyFlows setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListFlowsResponseBodyFlows setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public ListFlowsResponseBodyFlows setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowsResponseBodyFlows setEnvironment(ListFlowsResponseBodyFlowsEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public ListFlowsResponseBodyFlowsEnvironment getEnvironment() {
            return this.environment;
        }

        public ListFlowsResponseBodyFlows setExecutionMode(String executionMode) {
            this.executionMode = executionMode;
            return this;
        }
        public String getExecutionMode() {
            return this.executionMode;
        }

        public ListFlowsResponseBodyFlows setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFlowsResponseBodyFlows setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListFlowsResponseBodyFlows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowsResponseBodyFlows setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListFlowsResponseBodyFlows setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
