// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ModifyFlowRequest extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("FlowRole")
    public String flowRole;

    public static ModifyFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowRequest self = new ModifyFlowRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ModifyFlowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyFlowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFlowRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public ModifyFlowRequest setFlowRole(String flowRole) {
        this.flowRole = flowRole;
        return this;
    }
    public String getFlowRole() {
        return this.flowRole;
    }

}
