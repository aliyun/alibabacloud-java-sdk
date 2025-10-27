// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeFlowResponseBody extends TeaModel {
    /**
     * <p>The time when the flow was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-01T01:01:01.001Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The definition of the workflow. The definition must comply with the flow definition language (FDL) syntax. Considering compatibility, the system supports the flow definition specifications of the old version and new version.</p>
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
    public DescribeFlowResponseBodyEnvironment environment;

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
     * <p>e589e092-e2c0-4dee-b306-3574ddfdddf5****</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>testRequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Alibaba Cloud resource name (ARN) of the authorized role on which the execution of the flow relies. During the execution of the flow, CloudFlow assumes the role to call API operations of relevant services.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::${accountID}:${role}</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The type of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>FDL</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowResponseBody self = new DescribeFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeFlowResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public DescribeFlowResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeFlowResponseBody setEnvironment(DescribeFlowResponseBodyEnvironment environment) {
        this.environment = environment;
        return this;
    }
    public DescribeFlowResponseBodyEnvironment getEnvironment() {
        return this.environment;
    }

    public DescribeFlowResponseBody setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public DescribeFlowResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFlowResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public DescribeFlowResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public DescribeFlowResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeFlowResponseBodyEnvironmentVariables extends TeaModel {
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

        public static DescribeFlowResponseBodyEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowResponseBodyEnvironmentVariables self = new DescribeFlowResponseBodyEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public DescribeFlowResponseBodyEnvironmentVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFlowResponseBodyEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFlowResponseBodyEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeFlowResponseBodyEnvironment extends TeaModel {
        @NameInMap("Variables")
        public java.util.List<DescribeFlowResponseBodyEnvironmentVariables> variables;

        public static DescribeFlowResponseBodyEnvironment build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowResponseBodyEnvironment self = new DescribeFlowResponseBodyEnvironment();
            return TeaModel.build(map, self);
        }

        public DescribeFlowResponseBodyEnvironment setVariables(java.util.List<DescribeFlowResponseBodyEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<DescribeFlowResponseBodyEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

}
