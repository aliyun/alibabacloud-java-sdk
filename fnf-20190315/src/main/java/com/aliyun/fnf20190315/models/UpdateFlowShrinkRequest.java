// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateFlowShrinkRequest extends TeaModel {
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
    public String environmentShrink;

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

    public static UpdateFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowShrinkRequest self = new UpdateFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowShrinkRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public UpdateFlowShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFlowShrinkRequest setEnvironmentShrink(String environmentShrink) {
        this.environmentShrink = environmentShrink;
        return this;
    }
    public String getEnvironmentShrink() {
        return this.environmentShrink;
    }

    public UpdateFlowShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFlowShrinkRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public UpdateFlowShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
