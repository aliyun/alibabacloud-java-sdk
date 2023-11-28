// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateDataTasksRequest extends TeaModel {
    /**
     * <p>es-cn-n6w1o1x0w001c\*\*\*\*</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public java.util.List<CreateDataTasksRequestBody> body;

    public static CreateDataTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataTasksRequest self = new CreateDataTasksRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataTasksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDataTasksRequest setBody(java.util.List<CreateDataTasksRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<CreateDataTasksRequestBody> getBody() {
        return this.body;
    }

    public static class CreateDataTasksRequestBodyMigrateConfig extends TeaModel {
        @NameInMap("sourceFilterParams")
        public String sourceFilterParams;

        public static CreateDataTasksRequestBodyMigrateConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataTasksRequestBodyMigrateConfig self = new CreateDataTasksRequestBodyMigrateConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataTasksRequestBodyMigrateConfig setSourceFilterParams(String sourceFilterParams) {
            this.sourceFilterParams = sourceFilterParams;
            return this;
        }
        public String getSourceFilterParams() {
            return this.sourceFilterParams;
        }

    }

    public static class CreateDataTasksRequestBodySinkCluster extends TeaModel {
        @NameInMap("dataSourceType")
        public String dataSourceType;

        @NameInMap("index")
        public String index;

        @NameInMap("mapping")
        public String mapping;

        @NameInMap("password")
        public String password;

        @NameInMap("routing")
        public String routing;

        @NameInMap("settings")
        public String settings;

        @NameInMap("type")
        public String type;

        @NameInMap("username")
        public String username;

        public static CreateDataTasksRequestBodySinkCluster build(java.util.Map<String, ?> map) throws Exception {
            CreateDataTasksRequestBodySinkCluster self = new CreateDataTasksRequestBodySinkCluster();
            return TeaModel.build(map, self);
        }

        public CreateDataTasksRequestBodySinkCluster setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public CreateDataTasksRequestBodySinkCluster setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CreateDataTasksRequestBodySinkCluster setMapping(String mapping) {
            this.mapping = mapping;
            return this;
        }
        public String getMapping() {
            return this.mapping;
        }

        public CreateDataTasksRequestBodySinkCluster setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateDataTasksRequestBodySinkCluster setRouting(String routing) {
            this.routing = routing;
            return this;
        }
        public String getRouting() {
            return this.routing;
        }

        public CreateDataTasksRequestBodySinkCluster setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

        public CreateDataTasksRequestBodySinkCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDataTasksRequestBodySinkCluster setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateDataTasksRequestBodySourceCluster extends TeaModel {
        @NameInMap("dataSourceType")
        public String dataSourceType;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("index")
        public String index;

        @NameInMap("password")
        public String password;

        @NameInMap("type")
        public String type;

        @NameInMap("username")
        public String username;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        @NameInMap("vpcInstancePort")
        public Integer vpcInstancePort;

        public static CreateDataTasksRequestBodySourceCluster build(java.util.Map<String, ?> map) throws Exception {
            CreateDataTasksRequestBodySourceCluster self = new CreateDataTasksRequestBodySourceCluster();
            return TeaModel.build(map, self);
        }

        public CreateDataTasksRequestBodySourceCluster setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public CreateDataTasksRequestBodySourceCluster setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateDataTasksRequestBodySourceCluster setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CreateDataTasksRequestBodySourceCluster setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateDataTasksRequestBodySourceCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDataTasksRequestBodySourceCluster setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public CreateDataTasksRequestBodySourceCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateDataTasksRequestBodySourceCluster setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public CreateDataTasksRequestBodySourceCluster setVpcInstancePort(Integer vpcInstancePort) {
            this.vpcInstancePort = vpcInstancePort;
            return this;
        }
        public Integer getVpcInstancePort() {
            return this.vpcInstancePort;
        }

    }

    public static class CreateDataTasksRequestBody extends TeaModel {
        @NameInMap("migrateConfig")
        public CreateDataTasksRequestBodyMigrateConfig migrateConfig;

        @NameInMap("sinkCluster")
        public CreateDataTasksRequestBodySinkCluster sinkCluster;

        @NameInMap("sourceCluster")
        public CreateDataTasksRequestBodySourceCluster sourceCluster;

        public static CreateDataTasksRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateDataTasksRequestBody self = new CreateDataTasksRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateDataTasksRequestBody setMigrateConfig(CreateDataTasksRequestBodyMigrateConfig migrateConfig) {
            this.migrateConfig = migrateConfig;
            return this;
        }
        public CreateDataTasksRequestBodyMigrateConfig getMigrateConfig() {
            return this.migrateConfig;
        }

        public CreateDataTasksRequestBody setSinkCluster(CreateDataTasksRequestBodySinkCluster sinkCluster) {
            this.sinkCluster = sinkCluster;
            return this;
        }
        public CreateDataTasksRequestBodySinkCluster getSinkCluster() {
            return this.sinkCluster;
        }

        public CreateDataTasksRequestBody setSourceCluster(CreateDataTasksRequestBodySourceCluster sourceCluster) {
            this.sourceCluster = sourceCluster;
            return this;
        }
        public CreateDataTasksRequestBodySourceCluster getSourceCluster() {
            return this.sourceCluster;
        }

    }

}
