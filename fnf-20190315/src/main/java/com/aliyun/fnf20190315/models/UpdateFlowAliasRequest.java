// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateFlowAliasRequest extends TeaModel {
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
    public java.util.List<UpdateFlowAliasRequestRoutingConfigurations> routingConfigurations;

    public static UpdateFlowAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowAliasRequest self = new UpdateFlowAliasRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowAliasRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFlowAliasRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public UpdateFlowAliasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFlowAliasRequest setRoutingConfigurations(java.util.List<UpdateFlowAliasRequestRoutingConfigurations> routingConfigurations) {
        this.routingConfigurations = routingConfigurations;
        return this;
    }
    public java.util.List<UpdateFlowAliasRequestRoutingConfigurations> getRoutingConfigurations() {
        return this.routingConfigurations;
    }

    public static class UpdateFlowAliasRequestRoutingConfigurations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static UpdateFlowAliasRequestRoutingConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateFlowAliasRequestRoutingConfigurations self = new UpdateFlowAliasRequestRoutingConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateFlowAliasRequestRoutingConfigurations setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateFlowAliasRequestRoutingConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
