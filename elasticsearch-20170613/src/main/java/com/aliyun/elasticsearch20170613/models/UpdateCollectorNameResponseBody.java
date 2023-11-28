// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateCollectorNameResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The name of the file.</p>
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
         * <p>The status of the shipper on the ECS instance. Valid values: **heartOk**, **heartLost**, **uninstalled**, and **failed**.</p>
         */
        @NameInMap("agentStatus")
        public String agentStatus;

        /**
         * <p>The IDs of the ECS instances.</p>
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
         * <br>
         * <p>*   collectorTargetInstance</p>
         * <p>*   collectorDeployMachine</p>
         * <p>*   collectorElasticsearchForKibana</p>
         */
        @NameInMap("configType")
        public String configType;

        /**
         * <p>Indicates whether monitoring is enabled. This parameter is returned if the value of **configType** is **collectorTargetInstance** and the value of **instanceType** is **elasticsearch**. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("enableMonitoring")
        public Boolean enableMonitoring;

        /**
         * <p>The ID of the machine group. This parameter is returned if the value of **configType** is **collectorDeployMachine**.</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The private endpoint of Kibana after you enable the Kibana dashboard. This parameter is returned if the value of **configType** is **collectorElasticsearchForKibana**.</p>
         */
        @NameInMap("host")
        public String host;

        @NameInMap("hosts")
        public java.util.List<String> hosts;

        /**
         * <p>The ID of the resource that is associated with the shipper. If the value of **configType** is **collectorTargetInstance**, the value of this parameter is the ID of the resource specified in the output configuration part of the shipper. If the value of **configType** is **collectorDeployMachine** and the value of **type** is **ACKCluster**, the value of this parameter is the ID of the ACK cluster.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The type of the cluster specified in the output configuration part of the shipper. Valid values: elasticsearch and logstash. This parameter is returned if the value of **configType** is **collectorTargetInstance**.</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The public endpoint of Kibana after you enable the Kibana dashboard. This parameter is returned if the value of **configType** is **collectorElasticsearchForKibana**.</p>
         */
        @NameInMap("kibanaHost")
        public String kibanaHost;

        /**
         * <p>The information about the ECS instances on which the shipper is deployed. This parameter is returned if the value of **configType** is **collectorDeployMachine** and the value of **type** is **ECSInstanceId**.</p>
         */
        @NameInMap("machines")
        public java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigsMachines> machines;

        /**
         * <p>The transmission protocol. Valid values: **HTTP** and **HTTPS**.</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The number of pods from which data is successfully collected in the ACK cluster. This parameter is returned if the value of **configType** is **collectorDeployMachine** and the value of **type** is **ACKCluster**.</p>
         */
        @NameInMap("successPodsCount")
        public String successPodsCount;

        /**
         * <p>The total number of pods from which data is collected in the ACK cluster. This parameter is returned if the value of **configType** is **collectorDeployMachine** and the value of **type** is **ACKCluster**.</p>
         */
        @NameInMap("totalPodsCount")
        public String totalPodsCount;

        /**
         * <p>The type of the machine on which the shipper is deployed. This parameter is returned if the value of **configType** is **collectorDeployMachine**. Valid values:</p>
         * <br>
         * <p>*   ECSInstanceId</p>
         * <p>*   ACKCluster</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The username that is used to access the resource specified in the output configuration part of the shipper. The default value is elastic. This parameter is returned if the value of **configType** is **collectorTargetInstance** or **collectorElasticsearchForKibana**.</p>
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
        @NameInMap("collectorPaths")
        public java.util.List<String> collectorPaths;

        /**
         * <p>The information about the configuration file of the shipper.</p>
         */
        @NameInMap("configs")
        public java.util.List<UpdateCollectorNameResponseBodyResultConfigs> configs;

        /**
         * <p>Indicates whether a dry run is performed. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <p>The extended configurations of the shipper.</p>
         */
        @NameInMap("extendConfigs")
        public java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigs> extendConfigs;

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
         * <p>The ID of the shipper.</p>
         */
        @NameInMap("resId")
        public String resId;

        /**
         * <p>The type of the shipper. Valid values: fileBeat, metricBeat, heartBeat, and audiBeat.</p>
         */
        @NameInMap("resType")
        public String resType;

        /**
         * <p>The version of the shipper. The version of a shipper depends on the type of the machine on which the shipper is deployed.</p>
         * <br>
         * <p>*   Elastic Compute Service (ECS) instance: 6.8.5\_with_community</p>
         * <p>*   Container Service for Kubernetes (ACK) cluster: 6.8.13\_with_community</p>
         */
        @NameInMap("resVersion")
        public String resVersion;

        /**
         * <p>The status of the shipper. Valid values: activating and active.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC) where the shipper resides.</p>
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
