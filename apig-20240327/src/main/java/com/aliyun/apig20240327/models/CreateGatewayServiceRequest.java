// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayServiceRequest extends TeaModel {
    @NameInMap("gatewayServiceConfigs")
    public java.util.List<CreateGatewayServiceRequestGatewayServiceConfigs> gatewayServiceConfigs;

    /**
     * <strong>example:</strong>
     * <p>MSE_NACOS</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    public static CreateGatewayServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayServiceRequest self = new CreateGatewayServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayServiceRequest setGatewayServiceConfigs(java.util.List<CreateGatewayServiceRequestGatewayServiceConfigs> gatewayServiceConfigs) {
        this.gatewayServiceConfigs = gatewayServiceConfigs;
        return this;
    }
    public java.util.List<CreateGatewayServiceRequestGatewayServiceConfigs> getGatewayServiceConfigs() {
        return this.gatewayServiceConfigs;
    }

    public CreateGatewayServiceRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class CreateGatewayServiceRequestGatewayServiceConfigs extends TeaModel {
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <strong>example:</strong>
         * <p>group-1</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>itemcenter-provider</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MSE_NACOS</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        @NameInMap("qualifier")
        public String qualifier;

        public static CreateGatewayServiceRequestGatewayServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayServiceRequestGatewayServiceConfigs self = new CreateGatewayServiceRequestGatewayServiceConfigs();
            return TeaModel.build(map, self);
        }

        public CreateGatewayServiceRequestGatewayServiceConfigs setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public CreateGatewayServiceRequestGatewayServiceConfigs setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateGatewayServiceRequestGatewayServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateGatewayServiceRequestGatewayServiceConfigs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateGatewayServiceRequestGatewayServiceConfigs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateGatewayServiceRequestGatewayServiceConfigs setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

    }

}
