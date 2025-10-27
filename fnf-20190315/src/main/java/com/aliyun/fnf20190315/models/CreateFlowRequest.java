// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateFlowRequest extends TeaModel {
    /**
     * <p>The definition of the workflow. The definition must comply with the flow definition language (FDL) syntax. Considering compatibility, the system supports two flow definition specifications.</p>
     * <blockquote>
     * <p> In the preceding flow definition example, Name:my_flow_name is the workflow name, which must be consistent with the input parameter Name</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>version:&nbsp;v1.0<br/>type:&nbsp;flow<br/>steps:<br/>&nbsp;-&nbsp;type:&nbsp;pass<br/>&nbsp;name:&nbsp;mypass</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The description of the flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test flow</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Environment")
    public CreateFlowRequestEnvironment environment;

    /**
     * <p>The execution mode. Valid values: Express and Standard. Considering compatibility, an empty string is equivalent to the Standard execution mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>The path of the external storage.</p>
     * 
     * <strong>example:</strong>
     * <p>/path</p>
     */
    @NameInMap("ExternalStorageLocation")
    public String externalStorageLocation;

    /**
     * <p>The name of the flow. The name is unique within the same region and cannot be modified after the flow is created. Set this parameter based on the following rules:</p>
     * <ul>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>The name must start with a letter or an underscore (_).</li>
     * <li>The name is case-sensitive.</li>
     * <li>The name must be 1 to 128 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Alibaba Cloud resource name (ARN) of the authorized role on which the execution of the flow relies. During the execution of the flow, CloudFlow assumes the role to call API operations of relevant services.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram:${region}:${accountID}:${role}</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The type of the flow. Set this parameter to <strong>FDL</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FDL</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRequest self = new CreateFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateFlowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowRequest setEnvironment(CreateFlowRequestEnvironment environment) {
        this.environment = environment;
        return this;
    }
    public CreateFlowRequestEnvironment getEnvironment() {
        return this.environment;
    }

    public CreateFlowRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public CreateFlowRequest setExternalStorageLocation(String externalStorageLocation) {
        this.externalStorageLocation = externalStorageLocation;
        return this;
    }
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
    }

    public CreateFlowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFlowRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateFlowRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateFlowRequestEnvironmentVariables extends TeaModel {
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

        public static CreateFlowRequestEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowRequestEnvironmentVariables self = new CreateFlowRequestEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public CreateFlowRequestEnvironmentVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateFlowRequestEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFlowRequestEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateFlowRequestEnvironment extends TeaModel {
        @NameInMap("Variables")
        public java.util.List<CreateFlowRequestEnvironmentVariables> variables;

        public static CreateFlowRequestEnvironment build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowRequestEnvironment self = new CreateFlowRequestEnvironment();
            return TeaModel.build(map, self);
        }

        public CreateFlowRequestEnvironment setVariables(java.util.List<CreateFlowRequestEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<CreateFlowRequestEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

}
