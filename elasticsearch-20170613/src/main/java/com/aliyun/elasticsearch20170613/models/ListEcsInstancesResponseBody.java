// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListEcsInstancesResponseBody extends TeaModel {
    /**
     * <p>The number of returned records.</p>
     */
    @NameInMap("Headers")
    public ListEcsInstancesResponseBodyHeaders headers;

    /**
     * <p>The header of the response.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Cloud Assistant the installation status, support:</p>
     * <br>
     * <p>*   true: The Prometheus agent was installed.</p>
     * <p>*   false: The Prometheus agent was not installed.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListEcsInstancesResponseBodyResult> result;

    public static ListEcsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEcsInstancesResponseBody self = new ListEcsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEcsInstancesResponseBody setHeaders(ListEcsInstancesResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListEcsInstancesResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListEcsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEcsInstancesResponseBody setResult(java.util.List<ListEcsInstancesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListEcsInstancesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListEcsInstancesResponseBodyHeaders extends TeaModel {
        /**
         * <p>The returned data.</p>
         */
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListEcsInstancesResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListEcsInstancesResponseBodyHeaders self = new ListEcsInstancesResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListEcsInstancesResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListEcsInstancesResponseBodyResultCollectorsConfigs extends TeaModel {
        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The information about the extended parameter.</p>
         */
        @NameInMap("fileName")
        public String fileName;

        public static ListEcsInstancesResponseBodyResultCollectorsConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListEcsInstancesResponseBodyResultCollectorsConfigs self = new ListEcsInstancesResponseBodyResultCollectorsConfigs();
            return TeaModel.build(map, self);
        }

        public ListEcsInstancesResponseBodyResultCollectorsConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListEcsInstancesResponseBodyResultCollectorsConfigs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class ListEcsInstancesResponseBodyResultCollectorsExtendConfigsMachines extends TeaModel {
        /**
         * <p>The IDs of ECS instances.</p>
         */
        @NameInMap("agentStatus")
        public String agentStatus;

        /**
         * <p>The list of access addresses of the specified instance for the output of the collector. Displayed when the **configType** is **collectorTargetInstance**.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static ListEcsInstancesResponseBodyResultCollectorsExtendConfigsMachines build(java.util.Map<String, ?> map) throws Exception {
            ListEcsInstancesResponseBodyResultCollectorsExtendConfigsMachines self = new ListEcsInstancesResponseBodyResultCollectorsExtendConfigsMachines();
            return TeaModel.build(map, self);
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigsMachines setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigsMachines setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListEcsInstancesResponseBodyResultCollectorsExtendConfigs extends TeaModel {
        /**
         * <p>The instance type specified by Collector Output. Supports Elasticsearch and Logstash. Displayed when the **configType** is **collectorTargetInstance**.</p>
         */
        @NameInMap("configType")
        public String configType;

        /**
         * <p>The ID of the host group. Displayed when the **configType** is **collectorDeployMachine**.</p>
         */
        @NameInMap("enableMonitoring")
        public Boolean enableMonitoring;

        /**
         * <p>The configuration type. Valid values:</p>
         * <br>
         * <p>*   collectorTargetInstance: Collector Output</p>
         * <p>*   collectorDeployMachine: Collector Deployment Machine</p>
         * <p>*   Collector Elasticsearch ForKibana: Elasticsearch instance information that supports the Kibana dashboard</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The path in which Filebeat is collected.</p>
         */
        @NameInMap("hosts")
        public java.util.List<String> hosts;

        /**
         * <p>The list of ECS instances on which the collector is deployed. Displayed when the **configType** is **collectorDeployMachines** and the **type** is **ECSInstanceId**.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The transmission protocol, which must be the same as the access protocol of the instance specified by Output. HTTP and HTTPS. Displayed when the **configType** is **collectorTargetInstance**.</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The status of each crawl on the ECS instance. Valid values:</p>
         * <br>
         * <p>*   heartOk: The heartbeat is normal.</p>
         * <p>*   heartLost: The heartbeat is abnormal.</p>
         * <p>*   uninstalled</p>
         * <p>*   failed: The installation failed.</p>
         */
        @NameInMap("machines")
        public java.util.List<ListEcsInstancesResponseBodyResultCollectorsExtendConfigsMachines> machines;

        /**
         * <p>The username that is used to access the instance. The default value is elastic. Displayed when the **configType** is **collectorTargetInstance** or **collectorElasticsearchForKibana**.</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The ID of the instance that is associated with the crawker. If the **configType** parameter is set to **collectorTargetInstance**, the value of this parameter is the ID of the output collector. If the **configType** parameter is set to **collectorDeployMachines** and the **type** parameter is set to **ACKCluster**, the value of this parameter is the ID of the ACK cluster.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The type of the machine on which the Collector is deployed. This parameter is displayed when the **configType** is **collectorDeployMachine**. Valid values:</p>
         * <br>
         * <p>*   ECSInstanceId:ECS</p>
         * <p>*   ACKCluster: Container Kubernetes</p>
         */
        @NameInMap("userName")
        public String userName;

        public static ListEcsInstancesResponseBodyResultCollectorsExtendConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListEcsInstancesResponseBodyResultCollectorsExtendConfigs self = new ListEcsInstancesResponseBodyResultCollectorsExtendConfigs();
            return TeaModel.build(map, self);
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setEnableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }
        public Boolean getEnableMonitoring() {
            return this.enableMonitoring;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setHosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<String> getHosts() {
            return this.hosts;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setMachines(java.util.List<ListEcsInstancesResponseBodyResultCollectorsExtendConfigsMachines> machines) {
            this.machines = machines;
            return this;
        }
        public java.util.List<ListEcsInstancesResponseBodyResultCollectorsExtendConfigsMachines> getMachines() {
            return this.machines;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListEcsInstancesResponseBodyResultCollectors extends TeaModel {
        @NameInMap("collectorPaths")
        public java.util.List<String> collectorPaths;

        /**
         * <p>The content of the file.</p>
         */
        @NameInMap("configs")
        public java.util.List<ListEcsInstancesResponseBodyResultCollectorsConfigs> configs;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <p>Whether Monitoring is enabled. This field is displayed when the **configType** is **collectorTargetInstance** and the **instanceType** is **Elasticsearch**. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("extendConfigs")
        public java.util.List<ListEcsInstancesResponseBodyResultCollectorsExtendConfigs> extendConfigs;

        /**
         * <p>The status of the collector. Valid values:</p>
         * <br>
         * <p>*   activating: The project is taking effect.</p>
         * <p>*   active: The instance has taken effect.</p>
         */
        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        /**
         * <p>Specifies whether to verify and create a crawer. Valid values:</p>
         * <br>
         * <p>*   true: only verifies and does not create a</p>
         * <p>*   false: verifies and creates a</p>
         */
        @NameInMap("gmtUpdateTime")
        public String gmtUpdateTime;

        /**
         * <p>The configuration file information of the collector.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the Virtual Private Cloud to which the collector belongs.</p>
         */
        @NameInMap("ownerId")
        public String ownerId;

        /**
         * <p>The time when the collector was updated.</p>
         */
        @NameInMap("resId")
        public String resId;

        /**
         * <p>The version of the collector. If the machine type of the collector is ECS, only **6.8.5_with_community** is supported.</p>
         */
        @NameInMap("resType")
        public String resType;

        /**
         * <p>The time when the crawl collector was created.</p>
         */
        @NameInMap("resVersion")
        public String resVersion;

        /**
         * <p>The name of the collector.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the collector. FileBeat, metricBeat, heartBeat, and auditBeat are supported.</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListEcsInstancesResponseBodyResultCollectors build(java.util.Map<String, ?> map) throws Exception {
            ListEcsInstancesResponseBodyResultCollectors self = new ListEcsInstancesResponseBodyResultCollectors();
            return TeaModel.build(map, self);
        }

        public ListEcsInstancesResponseBodyResultCollectors setCollectorPaths(java.util.List<String> collectorPaths) {
            this.collectorPaths = collectorPaths;
            return this;
        }
        public java.util.List<String> getCollectorPaths() {
            return this.collectorPaths;
        }

        public ListEcsInstancesResponseBodyResultCollectors setConfigs(java.util.List<ListEcsInstancesResponseBodyResultCollectorsConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<ListEcsInstancesResponseBodyResultCollectorsConfigs> getConfigs() {
            return this.configs;
        }

        public ListEcsInstancesResponseBodyResultCollectors setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public ListEcsInstancesResponseBodyResultCollectors setExtendConfigs(java.util.List<ListEcsInstancesResponseBodyResultCollectorsExtendConfigs> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<ListEcsInstancesResponseBodyResultCollectorsExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        public ListEcsInstancesResponseBodyResultCollectors setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public ListEcsInstancesResponseBodyResultCollectors setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public ListEcsInstancesResponseBodyResultCollectors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEcsInstancesResponseBodyResultCollectors setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListEcsInstancesResponseBodyResultCollectors setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public ListEcsInstancesResponseBodyResultCollectors setResType(String resType) {
            this.resType = resType;
            return this;
        }
        public String getResType() {
            return this.resType;
        }

        public ListEcsInstancesResponseBodyResultCollectors setResVersion(String resVersion) {
            this.resVersion = resVersion;
            return this;
        }
        public String getResVersion() {
            return this.resVersion;
        }

        public ListEcsInstancesResponseBodyResultCollectors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEcsInstancesResponseBodyResultCollectors setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListEcsInstancesResponseBodyResultIpAddress extends TeaModel {
        /**
         * <p>The information about the collectors on the ECS instance.</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The IP address of the endpoint.</p>
         */
        @NameInMap("ipType")
        public String ipType;

        public static ListEcsInstancesResponseBodyResultIpAddress build(java.util.Map<String, ?> map) throws Exception {
            ListEcsInstancesResponseBodyResultIpAddress self = new ListEcsInstancesResponseBodyResultIpAddress();
            return TeaModel.build(map, self);
        }

        public ListEcsInstancesResponseBodyResultIpAddress setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListEcsInstancesResponseBodyResultIpAddress setIpType(String ipType) {
            this.ipType = ipType;
            return this;
        }
        public String getIpType() {
            return this.ipType;
        }

    }

    public static class ListEcsInstancesResponseBodyResult extends TeaModel {
        /**
         * <p>The name of the ECS instance.</p>
         */
        @NameInMap("cloudAssistantStatus")
        public String cloudAssistantStatus;

        /**
         * <p>The ID of the collector instance.</p>
         */
        @NameInMap("collectors")
        public java.util.List<ListEcsInstancesResponseBodyResultCollectors> collectors;

        /**
         * <p>The tags of the ECS instance.</p>
         */
        @NameInMap("ecsInstanceId")
        public String ecsInstanceId;

        /**
         * <p>The ID of the ECS instance.</p>
         */
        @NameInMap("ecsInstanceName")
        public String ecsInstanceName;

        /**
         * <p>The type of the IP address that is used by the instance. Valid values:</p>
         * <br>
         * <p>*   public: public endpoint</p>
         * <p>*   private: private network address</p>
         */
        @NameInMap("ipAddress")
        public java.util.List<ListEcsInstancesResponseBodyResultIpAddress> ipAddress;

        /**
         * <p>The status of the ECS instance. Valid values:</p>
         * <br>
         * <p>*   running: The master instance is running</p>
         * <p>*   starting</p>
         * <p>*   stopping: The task is being stopped.</p>
         * <p>*   stopped: The node is stopped.</p>
         */
        @NameInMap("osType")
        public String osType;

        /**
         * <p>The IP address of the ECS instance.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The operating system type of the ECS instance. Valid values:</p>
         * <br>
         * <p>*   windows:Windows operating system</p>
         * <p>*   linux:Linux operating system</p>
         */
        @NameInMap("tags")
        public String tags;

        public static ListEcsInstancesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListEcsInstancesResponseBodyResult self = new ListEcsInstancesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListEcsInstancesResponseBodyResult setCloudAssistantStatus(String cloudAssistantStatus) {
            this.cloudAssistantStatus = cloudAssistantStatus;
            return this;
        }
        public String getCloudAssistantStatus() {
            return this.cloudAssistantStatus;
        }

        public ListEcsInstancesResponseBodyResult setCollectors(java.util.List<ListEcsInstancesResponseBodyResultCollectors> collectors) {
            this.collectors = collectors;
            return this;
        }
        public java.util.List<ListEcsInstancesResponseBodyResultCollectors> getCollectors() {
            return this.collectors;
        }

        public ListEcsInstancesResponseBodyResult setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public ListEcsInstancesResponseBodyResult setEcsInstanceName(String ecsInstanceName) {
            this.ecsInstanceName = ecsInstanceName;
            return this;
        }
        public String getEcsInstanceName() {
            return this.ecsInstanceName;
        }

        public ListEcsInstancesResponseBodyResult setIpAddress(java.util.List<ListEcsInstancesResponseBodyResultIpAddress> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<ListEcsInstancesResponseBodyResultIpAddress> getIpAddress() {
            return this.ipAddress;
        }

        public ListEcsInstancesResponseBodyResult setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListEcsInstancesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEcsInstancesResponseBodyResult setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

}
