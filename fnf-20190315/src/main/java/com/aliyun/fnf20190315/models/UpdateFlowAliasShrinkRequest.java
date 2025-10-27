// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateFlowAliasShrinkRequest extends TeaModel {
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
     * <p>alias name</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RoutingConfigurations")
    public String routingConfigurationsShrink;

    public static UpdateFlowAliasShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowAliasShrinkRequest self = new UpdateFlowAliasShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowAliasShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFlowAliasShrinkRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public UpdateFlowAliasShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFlowAliasShrinkRequest setRoutingConfigurationsShrink(String routingConfigurationsShrink) {
        this.routingConfigurationsShrink = routingConfigurationsShrink;
        return this;
    }
    public String getRoutingConfigurationsShrink() {
        return this.routingConfigurationsShrink;
    }

}
