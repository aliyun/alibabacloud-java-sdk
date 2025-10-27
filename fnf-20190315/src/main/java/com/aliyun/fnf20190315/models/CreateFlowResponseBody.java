// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateFlowResponseBody extends TeaModel {
    /**
     * <p>The time when the flow was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-01T01:01:01.001Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>Considering compatibility, the system supports two flow definition specifications.</p>
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
    public CreateFlowResponseBodyEnvironment environment;

    /**
     * <p>The execution mode. Valid values: Express and Standard. Considering compatibility, an empty string is equivalent to the Standard execution mode.</p>
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
     * <p>The request ID. Each time an <code>HTTP status code</code> is returned, Serverless Workflow returns a value for the parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>testRequestID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Alibaba Cloud resource name (ARN) of the authorized role on which the execution of the flow relies. During the execution of the flow, CloudFlow assumes the role to call API operations of relevant services.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram:${region}:${accountID}:${role}</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The type of the flow.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li><p>FDL</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FDL</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowResponseBody self = new CreateFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public CreateFlowResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateFlowResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowResponseBody setEnvironment(CreateFlowResponseBodyEnvironment environment) {
        this.environment = environment;
        return this;
    }
    public CreateFlowResponseBodyEnvironment getEnvironment() {
        return this.environment;
    }

    public CreateFlowResponseBody setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public CreateFlowResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateFlowResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public CreateFlowResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateFlowResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateFlowResponseBodyEnvironmentVariables extends TeaModel {
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

        public static CreateFlowResponseBodyEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowResponseBodyEnvironmentVariables self = new CreateFlowResponseBodyEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public CreateFlowResponseBodyEnvironmentVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateFlowResponseBodyEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFlowResponseBodyEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateFlowResponseBodyEnvironment extends TeaModel {
        @NameInMap("Variables")
        public java.util.List<CreateFlowResponseBodyEnvironmentVariables> variables;

        public static CreateFlowResponseBodyEnvironment build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowResponseBodyEnvironment self = new CreateFlowResponseBodyEnvironment();
            return TeaModel.build(map, self);
        }

        public CreateFlowResponseBodyEnvironment setVariables(java.util.List<CreateFlowResponseBodyEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<CreateFlowResponseBodyEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

}
