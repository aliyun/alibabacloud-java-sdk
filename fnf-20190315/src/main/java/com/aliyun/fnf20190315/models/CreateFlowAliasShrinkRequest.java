// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateFlowAliasShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-flow-name</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-alias-name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoutingConfigurations")
    public String routingConfigurationsShrink;

    public static CreateFlowAliasShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowAliasShrinkRequest self = new CreateFlowAliasShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowAliasShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowAliasShrinkRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateFlowAliasShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFlowAliasShrinkRequest setRoutingConfigurationsShrink(String routingConfigurationsShrink) {
        this.routingConfigurationsShrink = routingConfigurationsShrink;
        return this;
    }
    public String getRoutingConfigurationsShrink() {
        return this.routingConfigurationsShrink;
    }

}
