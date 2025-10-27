// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateFlowAliasResponseBody extends TeaModel {
    @NameInMap("Alias")
    public UpdateFlowAliasResponseBodyAlias alias;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>294D68C1-5108-5971-853A-1A9CC87B4816</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFlowAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowAliasResponseBody self = new UpdateFlowAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFlowAliasResponseBody setAlias(UpdateFlowAliasResponseBodyAlias alias) {
        this.alias = alias;
        return this;
    }
    public UpdateFlowAliasResponseBodyAlias getAlias() {
        return this.alias;
    }

    public UpdateFlowAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateFlowAliasResponseBodyAliasRoutingConfigurations extends TeaModel {
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

        public static UpdateFlowAliasResponseBodyAliasRoutingConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateFlowAliasResponseBodyAliasRoutingConfigurations self = new UpdateFlowAliasResponseBodyAliasRoutingConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateFlowAliasResponseBodyAliasRoutingConfigurations setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateFlowAliasResponseBodyAliasRoutingConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateFlowAliasResponseBodyAlias extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-10-24T14:11:26+08:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>my alias description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>my-alias-name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RoutingConfigurations")
        public java.util.List<UpdateFlowAliasResponseBodyAliasRoutingConfigurations> routingConfigurations;

        public static UpdateFlowAliasResponseBodyAlias build(java.util.Map<String, ?> map) throws Exception {
            UpdateFlowAliasResponseBodyAlias self = new UpdateFlowAliasResponseBodyAlias();
            return TeaModel.build(map, self);
        }

        public UpdateFlowAliasResponseBodyAlias setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public UpdateFlowAliasResponseBodyAlias setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateFlowAliasResponseBodyAlias setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateFlowAliasResponseBodyAlias setRoutingConfigurations(java.util.List<UpdateFlowAliasResponseBodyAliasRoutingConfigurations> routingConfigurations) {
            this.routingConfigurations = routingConfigurations;
            return this;
        }
        public java.util.List<UpdateFlowAliasResponseBodyAliasRoutingConfigurations> getRoutingConfigurations() {
            return this.routingConfigurations;
        }

    }

}
