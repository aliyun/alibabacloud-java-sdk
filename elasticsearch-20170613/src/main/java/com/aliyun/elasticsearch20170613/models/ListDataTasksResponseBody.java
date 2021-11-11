// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDataTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListDataTasksResponseBodyResult> result;

    public static ListDataTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataTasksResponseBody self = new ListDataTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataTasksResponseBody setResult(java.util.List<ListDataTasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataTasksResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDataTasksResponseBodyResultSinkCluster extends TeaModel {
        @NameInMap("dataSourceType")
        public String dataSourceType;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("index")
        public String index;

        @NameInMap("type")
        public String type;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        @NameInMap("vpcInstancePort")
        public String vpcInstancePort;

        public static ListDataTasksResponseBodyResultSinkCluster build(java.util.Map<String, ?> map) throws Exception {
            ListDataTasksResponseBodyResultSinkCluster self = new ListDataTasksResponseBodyResultSinkCluster();
            return TeaModel.build(map, self);
        }

        public ListDataTasksResponseBodyResultSinkCluster setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ListDataTasksResponseBodyResultSinkCluster setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListDataTasksResponseBodyResultSinkCluster setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public ListDataTasksResponseBodyResultSinkCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDataTasksResponseBodyResultSinkCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListDataTasksResponseBodyResultSinkCluster setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public ListDataTasksResponseBodyResultSinkCluster setVpcInstancePort(String vpcInstancePort) {
            this.vpcInstancePort = vpcInstancePort;
            return this;
        }
        public String getVpcInstancePort() {
            return this.vpcInstancePort;
        }

    }

    public static class ListDataTasksResponseBodyResultSourceCluster extends TeaModel {
        @NameInMap("dataSourceType")
        public String dataSourceType;

        @NameInMap("index")
        public String index;

        @NameInMap("mapping")
        public String mapping;

        @NameInMap("routing")
        public String routing;

        @NameInMap("settings")
        public String settings;

        @NameInMap("type")
        public String type;

        public static ListDataTasksResponseBodyResultSourceCluster build(java.util.Map<String, ?> map) throws Exception {
            ListDataTasksResponseBodyResultSourceCluster self = new ListDataTasksResponseBodyResultSourceCluster();
            return TeaModel.build(map, self);
        }

        public ListDataTasksResponseBodyResultSourceCluster setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ListDataTasksResponseBodyResultSourceCluster setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public ListDataTasksResponseBodyResultSourceCluster setMapping(String mapping) {
            this.mapping = mapping;
            return this;
        }
        public String getMapping() {
            return this.mapping;
        }

        public ListDataTasksResponseBodyResultSourceCluster setRouting(String routing) {
            this.routing = routing;
            return this;
        }
        public String getRouting() {
            return this.routing;
        }

        public ListDataTasksResponseBodyResultSourceCluster setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

        public ListDataTasksResponseBodyResultSourceCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataTasksResponseBodyResult extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("sinkCluster")
        public ListDataTasksResponseBodyResultSinkCluster sinkCluster;

        @NameInMap("sourceCluster")
        public ListDataTasksResponseBodyResultSourceCluster sourceCluster;

        @NameInMap("status")
        public String status;

        @NameInMap("taskId")
        public String taskId;

        public static ListDataTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataTasksResponseBodyResult self = new ListDataTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataTasksResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDataTasksResponseBodyResult setSinkCluster(ListDataTasksResponseBodyResultSinkCluster sinkCluster) {
            this.sinkCluster = sinkCluster;
            return this;
        }
        public ListDataTasksResponseBodyResultSinkCluster getSinkCluster() {
            return this.sinkCluster;
        }

        public ListDataTasksResponseBodyResult setSourceCluster(ListDataTasksResponseBodyResultSourceCluster sourceCluster) {
            this.sourceCluster = sourceCluster;
            return this;
        }
        public ListDataTasksResponseBodyResultSourceCluster getSourceCluster() {
            return this.sourceCluster;
        }

        public ListDataTasksResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataTasksResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
