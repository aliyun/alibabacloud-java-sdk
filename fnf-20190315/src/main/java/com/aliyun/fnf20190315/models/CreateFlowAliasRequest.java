// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateFlowAliasRequest extends TeaModel {
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
    public java.util.List<CreateFlowAliasRequestRoutingConfigurations> routingConfigurations;

    public static CreateFlowAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowAliasRequest self = new CreateFlowAliasRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowAliasRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowAliasRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateFlowAliasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFlowAliasRequest setRoutingConfigurations(java.util.List<CreateFlowAliasRequestRoutingConfigurations> routingConfigurations) {
        this.routingConfigurations = routingConfigurations;
        return this;
    }
    public java.util.List<CreateFlowAliasRequestRoutingConfigurations> getRoutingConfigurations() {
        return this.routingConfigurations;
    }

    public static class CreateFlowAliasRequestRoutingConfigurations extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateFlowAliasRequestRoutingConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowAliasRequestRoutingConfigurations self = new CreateFlowAliasRequestRoutingConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateFlowAliasRequestRoutingConfigurations setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateFlowAliasRequestRoutingConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
