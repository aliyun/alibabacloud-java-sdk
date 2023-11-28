// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateCollectorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
         * <p>The content of the configuration file.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The name of the configuration file.</p>
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
         * <p>The installation status of the shipper on an ECS instance. Valid values:</p>
         * <br>
         * <p>*   heartOk</p>
         * <p>*   heartLost</p>
         * <p>*   uninstalled</p>
         * <p>*   failed</p>
         */
        @NameInMap("agentStatus")
        public String agentStatus;

        /**
         * <p>The ID of the ECS instance on which the shipper is installed.</p>
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
         * <p>The type of the configuration items. Valid values:</p>
         * <br>
         * <p>*   collectorTargetInstance: indicates the information about the output of the shipper.</p>
         * <p>*   collectorDeployMachine: indicates the information about the machine on which the shipper is installed.</p>
         * <p>*   collectorElasticsearchForKibana: indicates the information about the Elasticsearch cluster for which Kibana Dashboard is enabled.</p>
         */
        @NameInMap("configType")
        public String configType;

        /**
         * <p>Indicates whether Kibana Monitoring is enabled. This parameter is returned only when **configType** is set to **collectorTargetInstance** and **instanceType** is set to **elasticsearch**. Valid values: true and false.</p>
         */
        @NameInMap("enableMonitoring")
        public Boolean enableMonitoring;

        /**
         * <p>The machine group ID. This parameter is returned only when **configType** is set to **collectorDeployMachine**.</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The address that is used to access Kibana over an internal network after you enable Kibana Dashboard. This parameter is returned only when **configType** is set to **collectorElasticsearchForKibana**.</p>
         */
        @NameInMap("host")
        public String host;

        @NameInMap("hosts")
        public java.util.List<String> hosts;

        /**
         * <p>The ID of the object that is associated with the shipper. If **configType** is set to **collectorTargetInstance**, the value of this parameter is the ID of the output of the shipper. If **configType** is set to **collectorDeployMachines** and **type** is set to **ACKCluster**, the value of this parameter is the ID of an ACK cluster.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The type of the output of the shipper. Valid values: elasticsearch and logstash. This parameter is returned only when **configType** is set to **collectorTargetInstance**.</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The address that is used to access Kibana over the Internet after you enable Kibana Dashboard. This parameter is returned only when **configType** is set to **collectorElasticsearchForKibana**.</p>
         */
        @NameInMap("kibanaHost")
        public String kibanaHost;

        /**
         * <p>This parameter is returned only when configType is set to collectorDeployMachine.</p>
         * <br>
         * <p>This parameter indicates the information about the ECS instances or ACK clusters on which the shipper is installed.</p>
         */
        @NameInMap("machines")
        public java.util.List<UpdateCollectorResponseBodyResultExtendConfigsMachines> machines;

        /**
         * <p>The transfer protocol that is used. It is the same as the protocol over which you can access the output of the shipper. Valid values: HTTP and HTTPS. This parameter is returned only when **configType** is set to **collectorTargetInstance**.</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The number of pods from which logs are successfully collected in the ACK cluster. This parameter is returned only when **configType** is set to **collectorDeployMachines** and **type** is set to **ACKCluster**.</p>
         */
        @NameInMap("successPodsCount")
        public String successPodsCount;

        /**
         * <p>The number of pods from which logs needed to be collected in the ACK cluster. This parameter is returned only when **configType** is set to **collectorDeployMachines** and **type** is set to **ACKCluster**.</p>
         */
        @NameInMap("totalPodsCount")
        public String totalPodsCount;

        /**
         * <p>The type of the machine on which the shipper is installed. This parameter is returned only when **configType** is set to **collectorDeployMachine**. Valid values:</p>
         * <br>
         * <p>*   ECSInstanceId</p>
         * <p>*   ACKCluster</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The username that is used to access the output of the shipper. Default value: elastic. This parameter is returned only when **configType** is set to **collectorTargetInstance** or **collectorElasticsearchForKibana**.</p>
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
        @NameInMap("collectorPaths")
        public java.util.List<String> collectorPaths;

        /**
         * <p>The information about the configuration file for the shipper.</p>
         */
        @NameInMap("configs")
        public java.util.List<UpdateCollectorResponseBodyResultConfigs> configs;

        /**
         * <p>Indicates whether the shipper is checked and updated. Valid values:</p>
         * <br>
         * <p>*   true: The shipper is only checked.</p>
         * <p>*   false: The shipper is checked and updated.</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <p>The extended parameters that are configured for the shipper.</p>
         */
        @NameInMap("extendConfigs")
        public java.util.List<UpdateCollectorResponseBodyResultExtendConfigs> extendConfigs;

        /**
         * <p>The time when the shipper was created.</p>
         */
        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        /**
         * <p>The time when the shipper was updated.</p>
         */
        @NameInMap("gmtUpdateTime")
        public String gmtUpdateTime;

        /**
         * <p>The name of the shipper.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The account ID.</p>
         */
        @NameInMap("ownerId")
        public String ownerId;

        /**
         * <p>The shipper ID.</p>
         */
        @NameInMap("resId")
        public String resId;

        /**
         * <p>The type of the shipper. Valid values: fileBeat, metricBeat, heartBeat, and auditBeat.</p>
         */
        @NameInMap("resType")
        public String resType;

        /**
         * <p>The version of the shipper.</p>
         */
        @NameInMap("resVersion")
        public String resVersion;

        /**
         * <p>The status of the shipper. Valid values:</p>
         * <br>
         * <p>*   activing: The shipper is being initialized.</p>
         * <p>*   active: The shipper is in effect.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the VPC in which the shipper resides.</p>
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
