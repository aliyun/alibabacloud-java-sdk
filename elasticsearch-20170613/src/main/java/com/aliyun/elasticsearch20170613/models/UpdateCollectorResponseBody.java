// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateCollectorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public UpdateCollectorResponseBodyResult result;

    public static UpdateCollectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCollectorResponseBody self = new UpdateCollectorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCollectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCollectorResponseBody setResult(UpdateCollectorResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateCollectorResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateCollectorResponseBodyResultConfigs extends TeaModel {
        /**
         * <p>The content of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>filebeat.inputs:xxx</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>filebeat.yml</p>
         */
        @NameInMap("fileName")
        public String fileName;

        public static UpdateCollectorResponseBodyResultConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateCollectorResponseBodyResultConfigs self = new UpdateCollectorResponseBodyResultConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateCollectorResponseBodyResultConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateCollectorResponseBodyResultConfigs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class UpdateCollectorResponseBodyResultExtendConfigsMachines extends TeaModel {
        /**
         * <p>The status of each collector on the ECS instance. Valid values:</p>
         * <ul>
         * <li>heartOk: The heartbeat is normal.</li>
         * <li>heartLost: The heartbeat is abnormal.</li>
         * <li>uninstalled: The collector is not installed.</li>
         * <li>failed: The installation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>heartOk</p>
         */
        @NameInMap("agentStatus")
        public String agentStatus;

        /**
         * <p>The list of ECS instance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp13y63575oypr9d****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static UpdateCollectorResponseBodyResultExtendConfigsMachines build(java.util.Map<String, ?> map) throws Exception {
            UpdateCollectorResponseBodyResultExtendConfigsMachines self = new UpdateCollectorResponseBodyResultExtendConfigsMachines();
            return TeaModel.build(map, self);
        }

        public UpdateCollectorResponseBodyResultExtendConfigsMachines setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public UpdateCollectorResponseBodyResultExtendConfigsMachines setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class UpdateCollectorResponseBodyResultExtendConfigs extends TeaModel {
        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li>collectorTargetInstance: the output of the collector.</li>
         * <li>collectorDeployMachine: the machine on which the collector is deployed.</li>
         * <li>collectorElasticsearchForKibana: the information about the Elasticsearch instance that supports Kibana Dashboard.</li>
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
         * <li>true: Enables monitoring.</li>
         * <li>false: Disables monitoring.</li>
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
         * <p>The internal-facing access address of Kibana over the private network after Kibana Dashboard is enabled. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorElasticsearchForKibana</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****-kibana.internal.elasticsearch.aliyuncs.com:5601</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The list of host addresses of the target instance for the collector.</p>
         */
        @NameInMap("hosts")
        public java.util.List<String> hosts;

        /**
         * <p>Instance ID of the instance associated with the collector. If <strong>configType</strong> is set to <strong>collectorTargetInstance</strong>, this parameter indicates instance ID of the instance specified by the collector output. If <strong>configType</strong> is set to <strong>collectorDeployMachines</strong> and <strong>type</strong> is set to <strong>ACKCluster</strong>, this parameter indicates instance ID of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1z89fz003i****</p>
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
         * <p><a href="https://es-cn-nif1z89fz003i****.kibana.elasticsearch.aliyuncs.com:5601">https://es-cn-nif1z89fz003i****.kibana.elasticsearch.aliyuncs.com:5601</a></p>
         */
        @NameInMap("kibanaHost")
        public String kibanaHost;

        /**
         * <p>Specific to the collectorDeployMachine type:</p>
         * <p>The information about the ECS instances or ACK cluster on which the collector is deployed.</p>
         */
        @NameInMap("machines")
        public java.util.List<UpdateCollectorResponseBodyResultExtendConfigsMachines> machines;

        /**
         * <p>The transmission protocol, which must be consistent with the access protocol of the instance specified by the collector output. Valid values: HTTP and HTTPS. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorTargetInstance</strong>.</p>
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
         * <p>The type of the machine on which the collector is deployed. This parameter is displayed when <strong>configType</strong> is set to <strong>collectorDeployMachine</strong>. Valid values:</p>
         * <ul>
         * <li><p>ECSInstanceId: ECS instance.</p>
         * </li>
         * <li><p>ACKCluster: ACK cluster.</p>
         * </li>
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

        public static UpdateCollectorResponseBodyResultExtendConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateCollectorResponseBodyResultExtendConfigs self = new UpdateCollectorResponseBodyResultExtendConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setEnableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }
        public Boolean getEnableMonitoring() {
            return this.enableMonitoring;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setHosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<String> getHosts() {
            return this.hosts;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setKibanaHost(String kibanaHost) {
            this.kibanaHost = kibanaHost;
            return this;
        }
        public String getKibanaHost() {
            return this.kibanaHost;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setMachines(java.util.List<UpdateCollectorResponseBodyResultExtendConfigsMachines> machines) {
            this.machines = machines;
            return this;
        }
        public java.util.List<UpdateCollectorResponseBodyResultExtendConfigsMachines> getMachines() {
            return this.machines;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setSuccessPodsCount(String successPodsCount) {
            this.successPodsCount = successPodsCount;
            return this;
        }
        public String getSuccessPodsCount() {
            return this.successPodsCount;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setTotalPodsCount(String totalPodsCount) {
            this.totalPodsCount = totalPodsCount;
            return this;
        }
        public String getTotalPodsCount() {
            return this.totalPodsCount;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class UpdateCollectorResponseBodyResult extends TeaModel {
        /**
         * <p>The list of Filebeat collection paths.</p>
         */
        @NameInMap("collectorPaths")
        public java.util.List<String> collectorPaths;

        /**
         * <p>The configuration file information of the collector.</p>
         */
        @NameInMap("configs")
        public java.util.List<UpdateCollectorResponseBodyResultConfigs> configs;

        /**
         * <p>Specifies whether to verify and create the collector. Valid values:</p>
         * <ul>
         * <li>true: Only verifies the configuration and does not create the collector.</li>
         * <li>false: Verifies the configuration and creates the collector.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <p>The extended parameter information.</p>
         */
        @NameInMap("extendConfigs")
        public java.util.List<UpdateCollectorResponseBodyResultExtendConfigs> extendConfigs;

        /**
         * <p>The time when the collector was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-20T07:26:47.000+0000</p>
         */
        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        /**
         * <p>The time when the collector was updated.</p>
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
         * <p>ct-cn-0v3xj86085dvq****</p>
         */
        @NameInMap("resId")
        public String resId;

        /**
         * <p>The type of the collector. Valid values: fileBeat, metricBeat, heartBeat, and auditBeat.</p>
         * 
         * <strong>example:</strong>
         * <p>fileBeat</p>
         */
        @NameInMap("resType")
        public String resType;

        /**
         * <p>The version of the collector.</p>
         * 
         * <strong>example:</strong>
         * <p>6.8.5_with_community</p>
         */
        @NameInMap("resVersion")
        public String resVersion;

        /**
         * <p>The status of the collector. Valid values:</p>
         * <ul>
         * <li><p>activing: taking effect</p>
         * </li>
         * <li><p>active: effective</p>
         * </li>
         * </ul>
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

        public static UpdateCollectorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateCollectorResponseBodyResult self = new UpdateCollectorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateCollectorResponseBodyResult setCollectorPaths(java.util.List<String> collectorPaths) {
            this.collectorPaths = collectorPaths;
            return this;
        }
        public java.util.List<String> getCollectorPaths() {
            return this.collectorPaths;
        }

        public UpdateCollectorResponseBodyResult setConfigs(java.util.List<UpdateCollectorResponseBodyResultConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<UpdateCollectorResponseBodyResultConfigs> getConfigs() {
            return this.configs;
        }

        public UpdateCollectorResponseBodyResult setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public UpdateCollectorResponseBodyResult setExtendConfigs(java.util.List<UpdateCollectorResponseBodyResultExtendConfigs> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<UpdateCollectorResponseBodyResultExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        public UpdateCollectorResponseBodyResult setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public UpdateCollectorResponseBodyResult setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public UpdateCollectorResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCollectorResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public UpdateCollectorResponseBodyResult setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public UpdateCollectorResponseBodyResult setResType(String resType) {
            this.resType = resType;
            return this;
        }
        public String getResType() {
            return this.resType;
        }

        public UpdateCollectorResponseBodyResult setResVersion(String resVersion) {
            this.resVersion = resVersion;
            return this;
        }
        public String getResVersion() {
            return this.resVersion;
        }

        public UpdateCollectorResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateCollectorResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
