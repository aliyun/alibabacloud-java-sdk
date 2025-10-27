// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateFlowRequest extends TeaModel {
    /**
     * <p>The definition of the workflow. The definition must comply with the flow definition language (FDL) syntax. Considering compatibility, the system supports the two workflow definition specifications.</p>
     * <blockquote>
     * <p> In the preceding workflow definition example, Name:my_flow_name is the workflow name, which must be consistent with the input parameter Name</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>version: v1.0\ntype: flow\nname: test\nsteps:\n  - type: pass\n    name: mypass</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The description of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>test definition</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Environment")
    public UpdateFlowRequestEnvironment environment;

    /**
     * <p>The name of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Alibaba Cloud resource name (ARN) of the authorized role on which the execution of the flow relies. During the execution of the flow, the flow execution engine assumes the role to call API operations of relevant services.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::${accountID}:${role}</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The type of the flow. Valid value: <strong>FDL</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>FDL</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowRequest self = new UpdateFlowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public UpdateFlowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFlowRequest setEnvironment(UpdateFlowRequestEnvironment environment) {
        this.environment = environment;
        return this;
    }
    public UpdateFlowRequestEnvironment getEnvironment() {
        return this.environment;
    }

    public UpdateFlowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFlowRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public UpdateFlowRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class UpdateFlowRequestEnvironmentVariables extends TeaModel {
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

        public static UpdateFlowRequestEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateFlowRequestEnvironmentVariables self = new UpdateFlowRequestEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public UpdateFlowRequestEnvironmentVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateFlowRequestEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateFlowRequestEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateFlowRequestEnvironment extends TeaModel {
        @NameInMap("Variables")
        public java.util.List<UpdateFlowRequestEnvironmentVariables> variables;

        public static UpdateFlowRequestEnvironment build(java.util.Map<String, ?> map) throws Exception {
            UpdateFlowRequestEnvironment self = new UpdateFlowRequestEnvironment();
            return TeaModel.build(map, self);
        }

        public UpdateFlowRequestEnvironment setVariables(java.util.List<UpdateFlowRequestEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateFlowRequestEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

}
