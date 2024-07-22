// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDataTasksResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return results.</p>
     */
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
        /**
         * <p>The type of the target cluster. Default value: elasticsearch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dataSourceType")
        public String dataSourceType;

        /**
         * <p>The public network access address of the target cluster.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://192.168.xx.xx:4101">http://192.168.xx.xx:4101</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The target index.</p>
         * 
         * <strong>example:</strong>
         * <p>product_info</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <p>The type of the destination index.</p>
         * 
         * <strong>example:</strong>
         * <p>_doc</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The ID of the VPC to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze55voww95g82gak****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <p>The instance ID or Server Load Balancer (SLB) ID of the current cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-09k1rnu3g0002****-worker</p>
         */
        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        /**
         * <p>The access port number of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>9200</p>
         */
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
        /**
         * <p>The type of the source cluster. Default value: elasticsearch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dataSourceType")
        public String dataSourceType;

        /**
         * <p>The index whose data you want to migrate.</p>
         * 
         * <strong>example:</strong>
         * <p>product_info</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <p>The Mapping configuration of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;_doc\&quot;:{\&quot;properties\&quot;:{\&quot;user\&quot;:{\&quot;properties\&quot;:{\&quot;last\&quot;:{\&quot;type\&quot;:\&quot;text\&quot;,...}}}}}}</p>
         */
        @NameInMap("mapping")
        public String mapping;

        /**
         * <p>The routing field to index the table. It is set to the primary key by default.</p>
         * 
         * <strong>example:</strong>
         * <p>_id</p>
         */
        @NameInMap("routing")
        public String routing;

        /**
         * <p>The Settings of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>{\n  \&quot;index\&quot;: {\n    \&quot;replication\&quot;: {\n}.....}}</p>
         */
        @NameInMap("settings")
        public String settings;

        /**
         * <p>The type of the destination index.</p>
         * 
         * <strong>example:</strong>
         * <p>_doc</p>
         */
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
        /**
         * <p>The time when the site monitoring task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-30 06:32:18</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The information of the target cluster.</p>
         */
        @NameInMap("sinkCluster")
        public ListDataTasksResponseBodyResultSinkCluster sinkCluster;

        /**
         * <p>The information about the source cluster.</p>
         */
        @NameInMap("sourceCluster")
        public ListDataTasksResponseBodyResultSourceCluster sourceCluster;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>et_cn_mfv1233r47272****</p>
         */
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
