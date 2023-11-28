// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateDataTasksResponseBody extends TeaModel {
    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the source cluster.</p>
     */
    @NameInMap("Result")
    public java.util.List<CreateDataTasksResponseBodyResult> result;

    public static CreateDataTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataTasksResponseBody self = new CreateDataTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataTasksResponseBody setResult(java.util.List<CreateDataTasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<CreateDataTasksResponseBodyResult> getResult() {
        return this.result;
    }

    public static class CreateDataTasksResponseBodyResultSinkCluster extends TeaModel {
        @NameInMap("dataSourceType")
        public String dataSourceType;

        /**
         * <p>The settings configuration.</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <p>The type of the target index.</p>
         */
        @NameInMap("mapping")
        public String mapping;

        /**
         * <p>The name of the target index.</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The username of the destination cluster.</p>
         */
        @NameInMap("routing")
        public String routing;

        /**
         * <p>Mapping configuration.</p>
         */
        @NameInMap("settings")
        public String settings;

        /**
         * <p>The routing field. The primary key field is used by default.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The ID of the Virtual Private Cloud to which the cluster belongs. If the cluster access address is a public domain name, you can not specify the private endpoint.</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <p>The access port number of the cluster.</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <p>The type of the target cluster.</p>
         */
        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        /**
         * <p>The instance ID of the cluster under the Virtual Private Cloud, or the ID of the SLB instance.</p>
         */
        @NameInMap("vpcInstancePort")
        public String vpcInstancePort;

        public static CreateDataTasksResponseBodyResultSinkCluster build(java.util.Map<String, ?> map) throws Exception {
            CreateDataTasksResponseBodyResultSinkCluster self = new CreateDataTasksResponseBodyResultSinkCluster();
            return TeaModel.build(map, self);
        }

        public CreateDataTasksResponseBodyResultSinkCluster setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setMapping(String mapping) {
            this.mapping = mapping;
            return this;
        }
        public String getMapping() {
            return this.mapping;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setRouting(String routing) {
            this.routing = routing;
            return this;
        }
        public String getRouting() {
            return this.routing;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setVpcInstancePort(String vpcInstancePort) {
            this.vpcInstancePort = vpcInstancePort;
            return this;
        }
        public String getVpcInstancePort() {
            return this.vpcInstancePort;
        }

    }

    public static class CreateDataTasksResponseBodyResultSourceCluster extends TeaModel {
        /**
         * <p>The information about the target cluster.</p>
         */
        @NameInMap("dataSourceType")
        public String dataSourceType;

        /**
         * <p>The username of the source cluster.</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The type of the specified index.</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <p>Specifies the indexes to be migrated.</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The public domain name of the cluster.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The ID of the Virtual Private Cloud where the source cluster resides. If the cluster access address is a public domain name, you can not specify the private endpoint.</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <p>The instance ID of the cluster under the Virtual Private Cloud, or the ID of the SLB instance.</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <p>The access port number of the source cluster.</p>
         */
        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        /**
         * <p>The type of the source cluster. Default value: Elasticsearch.</p>
         */
        @NameInMap("vpcInstancePort")
        public Integer vpcInstancePort;

        public static CreateDataTasksResponseBodyResultSourceCluster build(java.util.Map<String, ?> map) throws Exception {
            CreateDataTasksResponseBodyResultSourceCluster self = new CreateDataTasksResponseBodyResultSourceCluster();
            return TeaModel.build(map, self);
        }

        public CreateDataTasksResponseBodyResultSourceCluster setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setVpcInstancePort(Integer vpcInstancePort) {
            this.vpcInstancePort = vpcInstancePort;
            return this;
        }
        public Integer getVpcInstancePort() {
            return this.vpcInstancePort;
        }

    }

    public static class CreateDataTasksResponseBodyResult extends TeaModel {
        /**
         * <p>The access password of the target cluster.</p>
         */
        @NameInMap("sinkCluster")
        public CreateDataTasksResponseBodyResultSinkCluster sinkCluster;

        /**
         * <p>The access password of the source cluster.</p>
         */
        @NameInMap("sourceCluster")
        public CreateDataTasksResponseBodyResultSourceCluster sourceCluster;

        public static CreateDataTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDataTasksResponseBodyResult self = new CreateDataTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateDataTasksResponseBodyResult setSinkCluster(CreateDataTasksResponseBodyResultSinkCluster sinkCluster) {
            this.sinkCluster = sinkCluster;
            return this;
        }
        public CreateDataTasksResponseBodyResultSinkCluster getSinkCluster() {
            return this.sinkCluster;
        }

        public CreateDataTasksResponseBodyResult setSourceCluster(CreateDataTasksResponseBodyResultSourceCluster sourceCluster) {
            this.sourceCluster = sourceCluster;
            return this;
        }
        public CreateDataTasksResponseBodyResultSourceCluster getSourceCluster() {
            return this.sourceCluster;
        }

    }

}
