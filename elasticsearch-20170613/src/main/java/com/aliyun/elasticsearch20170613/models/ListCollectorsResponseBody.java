// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListCollectorsResponseBody extends TeaModel {
    /**
     * <p>The response headers.</p>
     */
    @NameInMap("Headers")
    public ListCollectorsResponseBodyHeaders headers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListCollectorsResponseBodyResult> result;

    public static ListCollectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCollectorsResponseBody self = new ListCollectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCollectorsResponseBody setHeaders(ListCollectorsResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListCollectorsResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListCollectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCollectorsResponseBody setResult(java.util.List<ListCollectorsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListCollectorsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListCollectorsResponseBodyHeaders extends TeaModel {
        /**
         * <p>The total number of returned records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListCollectorsResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListCollectorsResponseBodyHeaders self = new ListCollectorsResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListCollectorsResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListCollectorsResponseBodyResultConfigs extends TeaModel {
        /**
         * <p>The file content.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>key: log\n title: Log file content\n description: &gt;\n Contains log file lines.\n ....</li>
         * </ul>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>fields.yml</p>
         */
        @NameInMap("fileName")
        public String fileName;

        public static ListCollectorsResponseBodyResultConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListCollectorsResponseBodyResultConfigs self = new ListCollectorsResponseBodyResultConfigs();
            return TeaModel.build(map, self);
        }

        public ListCollectorsResponseBodyResultConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListCollectorsResponseBodyResultConfigs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class ListCollectorsResponseBodyResultExtendConfigsMachines extends TeaModel {
        /**
         * <p>The status of each collector on the ECS instance. Valid values:</p>
         * <ul>
         * <li>heartOk: The heartbeat is normal.</li>
         * <li>heartLost: The heartbeat is abnormal.</li>
         * <li>uninstalled: Not installed.</li>
         * <li>failed: Installation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>heartOk</p>
         */
        @NameInMap("agentStatus")
        public String agentStatus;

        /**
         * <p>The list of ECS machine IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp13y63575oypr9d****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static ListCollectorsResponseBodyResultExtendConfigsMachines build(java.util.Map<String, ?> map) throws Exception {
            ListCollectorsResponseBodyResultExtendConfigsMachines self = new ListCollectorsResponseBodyResultExtendConfigsMachines();
            return TeaModel.build(map, self);
        }

        public ListCollectorsResponseBodyResultExtendConfigsMachines setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public ListCollectorsResponseBodyResultExtendConfigsMachines setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListCollectorsResponseBodyResultExtendConfigs extends TeaModel {
        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li>collectorTargetInstance: the collector Output</li>
         * <li>collectorDeployMachine: the deployment machine of the collector</li>
         * <li>collectorElasticsearchForKibana: the Elasticsearch instance that supports Kibana dashboards.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>collectorDeployMachine</p>
         */
        @NameInMap("configType")
        public String configType;

        /**
         * <p>Indicates whether Monitoring is enabled. This parameter is displayed when <strong>configType</strong> is <strong>collectorTargetInstance</strong> and <strong>instanceType</strong> is <strong>elasticsearch</strong>. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableMonitoring")
        public Boolean enableMonitoring;

        /**
         * <p>The machine group ID. This parameter is displayed when <strong>configType</strong> is <strong>collectorDeployMachine</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>default_ct-cn-5i2l75bz4776****</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The internal-facing access address of Kibana over the private network after Kibana Dashboard is enabled. This parameter is displayed when <strong>configType</strong> is <strong>collectorElasticsearchForKibana</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****-kibana.internal.elasticsearch.aliyuncs.com:5601</p>
         */
        @NameInMap("host")
        public String host;

        @NameInMap("hosts")
        public java.util.List<String> hosts;

        /**
         * <p>The ID of the instance associated with the collector. When <strong>configType</strong> is <strong>collectorTargetInstance</strong>, this is the instance ID of the collector Output. When <strong>configType</strong> is <strong>collectorDeployMachines</strong> and <strong>type</strong> is <strong>ACKCluster</strong>, this is the ACK (Container Kubernetes) cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1z89fz003i****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The type of instance specified in the collector Output. Valid values: elasticsearch, logstash. This parameter is displayed when <strong>configType</strong> is <strong>collectorTargetInstance</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The public network access address of Kibana after Kibana Dashboard is enabled. This parameter is displayed when <strong>configType</strong> is <strong>collectorElasticsearchForKibana</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://es-cn-nif1z89fz003i****.kibana.elasticsearch.aliyuncs.com:5601">https://es-cn-nif1z89fz003i****.kibana.elasticsearch.aliyuncs.com:5601</a></p>
         */
        @NameInMap("kibanaHost")
        public String kibanaHost;

        /**
         * <p>The list of ECS machines on which the collector is deployed. This parameter is displayed when <strong>configType</strong> is <strong>collectorDeployMachines</strong> and <strong>type</strong> is <strong>ECSInstanceId</strong>.</p>
         */
        @NameInMap("machines")
        public java.util.List<ListCollectorsResponseBodyResultExtendConfigsMachines> machines;

        /**
         * <p>The transmission protocol, which must be consistent with the access protocol of the instance specified in the collector Output. Valid values: HTTP, HTTPS. This parameter is displayed when <strong>configType</strong> is <strong>collectorTargetInstance</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The number of Pod nodes successfully collected in the ACK cluster. This parameter is displayed when <strong>configType</strong> is <strong>collectorDeployMachines</strong> and <strong>type</strong> is <strong>ACKCluster</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("successPodsCount")
        public String successPodsCount;

        /**
         * <p>The total number of Pod nodes collected in the ACK cluster. This parameter is displayed when <strong>configType</strong> is <strong>collectorDeployMachines</strong> and <strong>type</strong> is <strong>ACKCluster</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalPodsCount")
        public String totalPodsCount;

        /**
         * <p>The type of machine on which the collector is deployed. This parameter is displayed when <strong>configType</strong> is <strong>collectorDeployMachine</strong>. Valid values:</p>
         * <ul>
         * <li><p>ECSInstanceId: ECS</p>
         * </li>
         * <li><p>ACKCluster: Container Kubernetes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECSInstanceId</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The username used to access the instance specified in the collector Output. Default value: elastic. This parameter is displayed when <strong>configType</strong> is <strong>collectorTargetInstance</strong> or <strong>collectorElasticsearchForKibana</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic</p>
         */
        @NameInMap("userName")
        public String userName;

        public static ListCollectorsResponseBodyResultExtendConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListCollectorsResponseBodyResultExtendConfigs self = new ListCollectorsResponseBodyResultExtendConfigs();
            return TeaModel.build(map, self);
        }

        public ListCollectorsResponseBodyResultExtendConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setEnableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }
        public Boolean getEnableMonitoring() {
            return this.enableMonitoring;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setHosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<String> getHosts() {
            return this.hosts;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setKibanaHost(String kibanaHost) {
            this.kibanaHost = kibanaHost;
            return this;
        }
        public String getKibanaHost() {
            return this.kibanaHost;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setMachines(java.util.List<ListCollectorsResponseBodyResultExtendConfigsMachines> machines) {
            this.machines = machines;
            return this;
        }
        public java.util.List<ListCollectorsResponseBodyResultExtendConfigsMachines> getMachines() {
            return this.machines;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setSuccessPodsCount(String successPodsCount) {
            this.successPodsCount = successPodsCount;
            return this;
        }
        public String getSuccessPodsCount() {
            return this.successPodsCount;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setTotalPodsCount(String totalPodsCount) {
            this.totalPodsCount = totalPodsCount;
            return this;
        }
        public String getTotalPodsCount() {
            return this.totalPodsCount;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListCollectorsResponseBodyResult extends TeaModel {
        @NameInMap("collectorPaths")
        public java.util.List<String> collectorPaths;

        /**
         * <p>The configuration file information of the collector.</p>
         */
        @NameInMap("configs")
        public java.util.List<ListCollectorsResponseBodyResultConfigs> configs;

        /**
         * <p>Indicates whether the collector is validated only without being created. Valid values:</p>
         * <ul>
         * <li>true: Only validates without creating.</li>
         * <li>false: Validates and creates.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <p>The extended configuration information.</p>
         */
        @NameInMap("extendConfigs")
        public java.util.List<ListCollectorsResponseBodyResultExtendConfigs> extendConfigs;

        /**
         * <p>The time when the collector was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-18T02:06:12.000+0000</p>
         */
        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        /**
         * <p>The time when the collector was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-18T09:40:43.000+0000</p>
         */
        @NameInMap("gmtUpdateTime")
        public String gmtUpdateTime;

        /**
         * <p>The collector name.</p>
         * 
         * <strong>example:</strong>
         * <p>FileBeat001</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>168520994880****</p>
         */
        @NameInMap("ownerId")
        public String ownerId;

        /**
         * <p>The collector instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-cn-0v3xj86085dvq****</p>
         */
        @NameInMap("resId")
        public String resId;

        /**
         * <p>The collector type. Valid values: fileBeat, metricBeat, heartBeat, and auditBeat.</p>
         * 
         * <strong>example:</strong>
         * <p>fileBeat</p>
         */
        @NameInMap("resType")
        public String resType;

        /**
         * <p>The collector version.</p>
         * 
         * <strong>example:</strong>
         * <p>6.8.5_with_community</p>
         */
        @NameInMap("resVersion")
        public String resVersion;

        /**
         * <p>The collector status. Valid values:</p>
         * <ul>
         * <li><p>activing: Taking effect.</p>
         * </li>
         * <li><p>active: Active.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the VPC where the collector resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp16k1dvzxtma*****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListCollectorsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCollectorsResponseBodyResult self = new ListCollectorsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCollectorsResponseBodyResult setCollectorPaths(java.util.List<String> collectorPaths) {
            this.collectorPaths = collectorPaths;
            return this;
        }
        public java.util.List<String> getCollectorPaths() {
            return this.collectorPaths;
        }

        public ListCollectorsResponseBodyResult setConfigs(java.util.List<ListCollectorsResponseBodyResultConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<ListCollectorsResponseBodyResultConfigs> getConfigs() {
            return this.configs;
        }

        public ListCollectorsResponseBodyResult setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public ListCollectorsResponseBodyResult setExtendConfigs(java.util.List<ListCollectorsResponseBodyResultExtendConfigs> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<ListCollectorsResponseBodyResultExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        public ListCollectorsResponseBodyResult setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public ListCollectorsResponseBodyResult setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public ListCollectorsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCollectorsResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListCollectorsResponseBodyResult setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public ListCollectorsResponseBodyResult setResType(String resType) {
            this.resType = resType;
            return this;
        }
        public String getResType() {
            return this.resType;
        }

        public ListCollectorsResponseBodyResult setResVersion(String resVersion) {
            this.resVersion = resVersion;
            return this;
        }
        public String getResVersion() {
            return this.resVersion;
        }

        public ListCollectorsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCollectorsResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
