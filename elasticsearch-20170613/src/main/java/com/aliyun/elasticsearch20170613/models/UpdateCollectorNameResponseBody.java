// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateCollectorNameResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public UpdateCollectorNameResponseBodyResult result;

    public static UpdateCollectorNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCollectorNameResponseBody self = new UpdateCollectorNameResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCollectorNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCollectorNameResponseBody setResult(UpdateCollectorNameResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateCollectorNameResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateCollectorNameResponseBodyResultConfigs extends TeaModel {
        /**
         * <p>The content of the file.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>key: log\n title: Log file content\n description: &gt;\n Contains log file lines.\n ....</li>
         * </ul>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>fields.yml</p>
         */
        @NameInMap("fileName")
        public String fileName;

        public static UpdateCollectorNameResponseBodyResultConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateCollectorNameResponseBodyResultConfigs self = new UpdateCollectorNameResponseBodyResultConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateCollectorNameResponseBodyResultConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateCollectorNameResponseBodyResultConfigs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class UpdateCollectorNameResponseBodyResultExtendConfigsMachines extends TeaModel {
        /**
         * <p>The status of each collector on the ECS instance. Valid values: <strong>heartOk</strong> (heartbeat normal), <strong>heartLost</strong> (heartbeat abnormal), <strong>uninstalled</strong> (not installed), and <strong>failed</strong> (installation failed).</p>
         * 
         * <strong>example:</strong>
         * <p>heartOk</p>
         */
        @NameInMap("agentStatus")
        public String agentStatus;

        /**
         * <p>The IDs of the ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>c1b9fde5172b84f82b9928e825a7b8988</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static UpdateCollectorNameResponseBodyResultExtendConfigsMachines build(java.util.Map<String, ?> map) throws Exception {
            UpdateCollectorNameResponseBodyResultExtendConfigsMachines self = new UpdateCollectorNameResponseBodyResultExtendConfigsMachines();
            return TeaModel.build(map, self);
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigsMachines setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigsMachines setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class UpdateCollectorNameResponseBodyResultExtendConfigs extends TeaModel {
        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li>collectorTargetInstance: the output of the collector</li>
         * <li>collectorDeployMachine: the machine where the collector is deployed</li>
         * <li>collectorElasticsearchForKibana: the information about the Elasticsearch instance that supports Kibana Dashboard</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>collectorDeployMachine</p>
         */
        @NameInMap("configType")
        public String configType;

        /**
         * <p>Specifies whether to enable monitoring. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorTargetInstance</strong> and <strong>instanceType</strong> is set to <strong>elasticsearch</strong>. Valid values:</p>
         * <ul>
         * <li>true: enables monitoring.</li>
         * <li>false: disables monitoring.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableMonitoring")
        public Boolean enableMonitoring;

        /**
         * <p>The ID of the machine group. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorDeployMachine</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>default_ct-cn-5i2l75bz4776****</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The internal-facing access address of Kibana on the private network after Kibana Dashboard is enabled. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorElasticsearchForKibana</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-4591jumei000u****-kibana.internal.elasticsearch.aliyuncs.com:5601</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The access endpoints of the instance specified by the collector output. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorTargetInstance</strong>.</p>
         */
        @NameInMap("hosts")
        public java.util.List<String> hosts;

        /**
         * <p>Instance ID of the instance associated with the collector. If <strong>configType</strong> is set to <strong>collectorTargetInstance</strong>, this parameter indicates instance ID of the instance specified by the collector output. If <strong>configType</strong> is set to <strong>collectorDeployMachines</strong> and <strong>type</strong> is set to <strong>ACKCluster</strong>, this parameter indicates instance ID of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The type of the instance specified by the collector output. Valid values: elasticsearch and logstash. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorTargetInstance</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The public network access address of Kibana after Kibana Dashboard is enabled. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorElasticsearchForKibana</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://es-cn-4591jumei000u****.kibana.elasticsearch.aliyuncs.com:5601">https://es-cn-4591jumei000u****.kibana.elasticsearch.aliyuncs.com:5601</a></p>
         */
        @NameInMap("kibanaHost")
        public String kibanaHost;

        /**
         * <p>The information about the ECS instances where the collector is deployed. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorDeployMachines</strong> and <strong>type</strong> is set to <strong>ECSInstanceId</strong>.</p>
         */
        @NameInMap("machines")
        public java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigsMachines> machines;

        /**
         * <p>The transmission protocol. Valid values: <strong>HTTP</strong> and <strong>HTTPS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The number of pods from which data is successfully collected in the ACK cluster. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorDeployMachines</strong> and <strong>type</strong> is set to <strong>ACKCluster</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("successPodsCount")
        public String successPodsCount;

        /**
         * <p>The total number of pods from which data is collected in the ACK cluster. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorDeployMachines</strong> and <strong>type</strong> is set to <strong>ACKCluster</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalPodsCount")
        public String totalPodsCount;

        /**
         * <p>The type of the machine where the collector is deployed. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorDeployMachine</strong>. Valid values:</p>
         * <ul>
         * <li>ECSInstanceId: ECS instance</li>
         * <li>ACKCluster: Container Service for Kubernetes (ACK) cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECSInstanceId</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The username used to access the instance specified by the collector output. Default value: elastic. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorTargetInstance</strong> or <strong>collectorElasticsearchForKibana</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic</p>
         */
        @NameInMap("userName")
        public String userName;

        public static UpdateCollectorNameResponseBodyResultExtendConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateCollectorNameResponseBodyResultExtendConfigs self = new UpdateCollectorNameResponseBodyResultExtendConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setEnableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }
        public Boolean getEnableMonitoring() {
            return this.enableMonitoring;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setHosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<String> getHosts() {
            return this.hosts;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setKibanaHost(String kibanaHost) {
            this.kibanaHost = kibanaHost;
            return this;
        }
        public String getKibanaHost() {
            return this.kibanaHost;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setMachines(java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigsMachines> machines) {
            this.machines = machines;
            return this;
        }
        public java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigsMachines> getMachines() {
            return this.machines;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setSuccessPodsCount(String successPodsCount) {
            this.successPodsCount = successPodsCount;
            return this;
        }
        public String getSuccessPodsCount() {
            return this.successPodsCount;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setTotalPodsCount(String totalPodsCount) {
            this.totalPodsCount = totalPodsCount;
            return this;
        }
        public String getTotalPodsCount() {
            return this.totalPodsCount;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class UpdateCollectorNameResponseBodyResult extends TeaModel {
        /**
         * <p>The collection path of Filebeat. This parameter is displayed when the collector is deployed on an ECS instance.</p>
         */
        @NameInMap("collectorPaths")
        public java.util.List<String> collectorPaths;

        /**
         * <p>The configuration file information of the collector.</p>
         */
        @NameInMap("configs")
        public java.util.List<UpdateCollectorNameResponseBodyResultConfigs> configs;

        /**
         * <p>Specifies whether to verify and update the collector. Valid values:</p>
         * <ul>
         * <li>true: only verifies the request without updating the collector.</li>
         * <li>false: verifies and updates the collector.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <p>The extended configurations of the collector.</p>
         */
        @NameInMap("extendConfigs")
        public java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigs> extendConfigs;

        /**
         * <p>The time when the collector was created. The time is in the YYYY-MM-DDTHH:mm:ss.SSS+HHMM format, where the suffix indicates the time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-20T07:26:47.000+0000</p>
         */
        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        /**
         * <p>The time when the collector was updated. The time is in the YYYY-MM-DDTHH:mm:ss.SSS+HHMM format, where the suffix indicates the time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-20T07:26:47.000+0000</p>
         */
        @NameInMap("gmtUpdateTime")
        public String gmtUpdateTime;

        /**
         * <p>The name of the collector.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>16852099488*****</p>
         */
        @NameInMap("ownerId")
        public String ownerId;

        /**
         * <p>The instance ID of the collector.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-cn-77uqof2s7rg5c****</p>
         */
        @NameInMap("resId")
        public String resId;

        /**
         * <p>The type of the collector. Valid values: fileBeat, metricBeat, heartBeat, and audiBeat.</p>
         * 
         * <strong>example:</strong>
         * <p>fileBeat</p>
         */
        @NameInMap("resType")
        public String resType;

        /**
         * <p>The version of the collector. The supported versions vary based on the type of the machine where the collector is deployed. Valid values:</p>
         * <ul>
         * <li>ECS: 6.8.5_with_community</li>
         * <li>ACK: 6.8.13_with_community</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6.8.5_with_community</p>
         */
        @NameInMap("resVersion")
        public String resVersion;

        /**
         * <p>The status of the collector. Valid values: activing (activating) and active (activated).</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC) where the collector resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp16k1dvzxtma*****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static UpdateCollectorNameResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateCollectorNameResponseBodyResult self = new UpdateCollectorNameResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateCollectorNameResponseBodyResult setCollectorPaths(java.util.List<String> collectorPaths) {
            this.collectorPaths = collectorPaths;
            return this;
        }
        public java.util.List<String> getCollectorPaths() {
            return this.collectorPaths;
        }

        public UpdateCollectorNameResponseBodyResult setConfigs(java.util.List<UpdateCollectorNameResponseBodyResultConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<UpdateCollectorNameResponseBodyResultConfigs> getConfigs() {
            return this.configs;
        }

        public UpdateCollectorNameResponseBodyResult setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public UpdateCollectorNameResponseBodyResult setExtendConfigs(java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigs> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        public UpdateCollectorNameResponseBodyResult setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public UpdateCollectorNameResponseBodyResult setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public UpdateCollectorNameResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCollectorNameResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public UpdateCollectorNameResponseBodyResult setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public UpdateCollectorNameResponseBodyResult setResType(String resType) {
            this.resType = resType;
            return this;
        }
        public String getResType() {
            return this.resType;
        }

        public UpdateCollectorNameResponseBodyResult setResVersion(String resVersion) {
            this.resVersion = resVersion;
            return this;
        }
        public String getResVersion() {
            return this.resVersion;
        }

        public UpdateCollectorNameResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateCollectorNameResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
