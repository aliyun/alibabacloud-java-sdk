// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateFlowAliasResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2020-01-01T01:01:01.001Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>example-flow-name</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <strong>example:</strong>
     * <p>exampe-alias-name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>testRequestID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoutingConfigurations")
    public java.util.List<CreateFlowAliasResponseBodyRoutingConfigurations> routingConfigurations;

    public static CreateFlowAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowAliasResponseBody self = new CreateFlowAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowAliasResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public CreateFlowAliasResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowAliasResponseBody setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateFlowAliasResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFlowAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowAliasResponseBody setRoutingConfigurations(java.util.List<CreateFlowAliasResponseBodyRoutingConfigurations> routingConfigurations) {
        this.routingConfigurations = routingConfigurations;
        return this;
    }
    public java.util.List<CreateFlowAliasResponseBodyRoutingConfigurations> getRoutingConfigurations() {
        return this.routingConfigurations;
    }

    public static class CreateFlowAliasResponseBodyRoutingConfigurations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateFlowAliasResponseBodyRoutingConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowAliasResponseBodyRoutingConfigurations self = new CreateFlowAliasResponseBodyRoutingConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateFlowAliasResponseBodyRoutingConfigurations setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateFlowAliasResponseBodyRoutingConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
