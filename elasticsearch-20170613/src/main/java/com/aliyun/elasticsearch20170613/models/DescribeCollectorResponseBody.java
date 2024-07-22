// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeCollectorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
    public DescribeCollectorResponseBodyResult result;

    public static DescribeCollectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCollectorResponseBody self = new DescribeCollectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCollectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCollectorResponseBody setResult(DescribeCollectorResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeCollectorResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeCollectorResponseBodyResultConfigs extends TeaModel {
        /**
         * <p>The content of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>fileBeat.inputs:xxx</p>
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

        public static DescribeCollectorResponseBodyResultConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollectorResponseBodyResultConfigs self = new DescribeCollectorResponseBodyResultConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCollectorResponseBodyResultConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeCollectorResponseBodyResultConfigs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class DescribeCollectorResponseBodyResultExtendConfigsMachines extends TeaModel {
        /**
         * <p>The status of the shipper on the ECS instance. Valid values:</p>
         * <ul>
         * <li>heartOk: The heartbeat is normal.</li>
         * <li>heartLost: The heartbeat is abnormal.</li>
         * <li>uninstalled: The shipper is not installed.</li>
         * <li>failed: The shipper fails to be installed.</li>
         * </ul>
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
         * <p>i-bp1gyhphjaj73jsr****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static DescribeCollectorResponseBodyResultExtendConfigsMachines build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollectorResponseBodyResultExtendConfigsMachines self = new DescribeCollectorResponseBodyResultExtendConfigsMachines();
            return TeaModel.build(map, self);
        }

        public DescribeCollectorResponseBodyResultExtendConfigsMachines setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public DescribeCollectorResponseBodyResultExtendConfigsMachines setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeCollectorResponseBodyResultExtendConfigs extends TeaModel {
        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li>collectorTargetInstance</li>
         * <li>collectorDeployMachine</li>
         * <li>collectorElasticsearchForKibana</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>collectorDeployMachine</p>
         */
        @NameInMap("configType")
        public String configType;

        /**
         * <p>Indicates whether monitoring is enabled. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorTargetInstance</strong>. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableMonitoring")
        public Boolean enableMonitoring;

        /**
         * <p>The ID of the machine group. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorDeployMachine</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>default_ct-cn-5i2l75bz4776****</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The private endpoint of Kibana after you enable the Kibana dashboard. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorElasticsearchForKibana</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****-kibana.internal.elasticsearch.aliyuncs.com:5601</p>
         */
        @NameInMap("host")
        public String host;

        @NameInMap("hosts")
        public java.util.List<String> hosts;

        /**
         * <p>The ID of the resource that is associated with the shipper. If the value of <strong>configType</strong> is <strong>collectorTargetInstance</strong>, the value of this parameter is the ID of the resource specified in the output configuration part of the shipper. If the value of <strong>configType</strong> is <strong>collectorDeployMachines</strong> and the value of <strong>type</strong> is <strong>ACKCluster</strong>, the value of this parameter is the ID of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The type of the cluster specified in the output configuration part of the shipper. Valid values: elasticsearch and logstash. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorTargetInstance</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The public endpoint of Kibana after you enable the Kibana dashboard. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorElasticsearchForKibana</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://es-cn-nif1z89fz003i****.kibana.elasticsearch.aliyuncs.com:5601">https://es-cn-nif1z89fz003i****.kibana.elasticsearch.aliyuncs.com:5601</a></p>
         */
        @NameInMap("kibanaHost")
        public String kibanaHost;

        /**
         * <p>The information about the Elastic Compute Service (ECS) instances on which the shipper is deployed. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorDeployMachines</strong> and the value of <strong>type</strong> is <strong>ECSInstanceId</strong>.</p>
         */
        @NameInMap("machines")
        public java.util.List<DescribeCollectorResponseBodyResultExtendConfigsMachines> machines;

        /**
         * <p>The transmission protocol, which must be the same as the access protocol of the resource specified in the output configuration part of the shipper. Valid values: HTTP and HTTPS. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorTargetInstance</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The number of pods from which data is succcessfully collected in the Container Service for Kubernetes (ACK) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("successPodsCount")
        public String successPodsCount;

        /**
         * <p>The total number of pods from which data is collected in the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalPodsCount")
        public String totalPodsCount;

        /**
         * <p>The type of the machine on which the shipper is deployed. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorDeployMachine</strong>. Valid values:</p>
         * <ul>
         * <li>ECSInstanceId</li>
         * <li>ACKCluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECSInstanceId</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The username that is used to access the resource specified in the output configuration part of the shipper. The default value is elastic. This parameter is returned if the value of <strong>configType</strong> is <strong>collectorTargetInstance</strong> or <strong>collectorElasticsearchForKibana</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic</p>
         */
        @NameInMap("userName")
        public String userName;

        public static DescribeCollectorResponseBodyResultExtendConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollectorResponseBodyResultExtendConfigs self = new DescribeCollectorResponseBodyResultExtendConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setEnableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }
        public Boolean getEnableMonitoring() {
            return this.enableMonitoring;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setHosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<String> getHosts() {
            return this.hosts;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setKibanaHost(String kibanaHost) {
            this.kibanaHost = kibanaHost;
            return this;
        }
        public String getKibanaHost() {
            return this.kibanaHost;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setMachines(java.util.List<DescribeCollectorResponseBodyResultExtendConfigsMachines> machines) {
            this.machines = machines;
            return this;
        }
        public java.util.List<DescribeCollectorResponseBodyResultExtendConfigsMachines> getMachines() {
            return this.machines;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setSuccessPodsCount(String successPodsCount) {
            this.successPodsCount = successPodsCount;
            return this;
        }
        public String getSuccessPodsCount() {
            return this.successPodsCount;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setTotalPodsCount(String totalPodsCount) {
            this.totalPodsCount = totalPodsCount;
            return this;
        }
        public String getTotalPodsCount() {
            return this.totalPodsCount;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeCollectorResponseBodyResult extends TeaModel {
        @NameInMap("collectorPaths")
        public java.util.List<String> collectorPaths;

        /**
         * <p>The information about the configuration file of the shipper.</p>
         */
        @NameInMap("configs")
        public java.util.List<DescribeCollectorResponseBodyResultConfigs> configs;

        /**
         * <p>Indicates whether a dry run is performed. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <p>The extended configurations of the shipper.</p>
         */
        @NameInMap("extendConfigs")
        public java.util.List<DescribeCollectorResponseBodyResultExtendConfigs> extendConfigs;

        /**
         * <p>The time when the shipper was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-20T07:26:47.000+0000</p>
         */
        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        /**
         * <p>The time when the shipper was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-20T07:26:47.000+0000</p>
         */
        @NameInMap("gmtUpdateTime")
        public String gmtUpdateTime;

        /**
         * <p>The name of the shipper.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-cn-4135is2tj194p****</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16852099488*****</p>
         */
        @NameInMap("ownerId")
        public String ownerId;

        /**
         * <p>The ID of the shipper.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-cn-rg31ahn82m0qd****</p>
         */
        @NameInMap("resId")
        public String resId;

        /**
         * <p>The type of the shipper. Valid values: fileBeat, metricBeat, heartBeat, and auditBeat.</p>
         * 
         * <strong>example:</strong>
         * <p>fileBeat</p>
         */
        @NameInMap("resType")
        public String resType;

        /**
         * <p>The version of the shipper.</p>
         * 
         * <strong>example:</strong>
         * <p>6.8.5_with_community</p>
         */
        @NameInMap("resVersion")
        public String resVersion;

        /**
         * <p>The status of the shipper. Valid values:</p>
         * <ul>
         * <li>activating</li>
         * <li>active</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC) where the shipper resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp16k1dvzxtma*****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static DescribeCollectorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollectorResponseBodyResult self = new DescribeCollectorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeCollectorResponseBodyResult setCollectorPaths(java.util.List<String> collectorPaths) {
            this.collectorPaths = collectorPaths;
            return this;
        }
        public java.util.List<String> getCollectorPaths() {
            return this.collectorPaths;
        }

        public DescribeCollectorResponseBodyResult setConfigs(java.util.List<DescribeCollectorResponseBodyResultConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<DescribeCollectorResponseBodyResultConfigs> getConfigs() {
            return this.configs;
        }

        public DescribeCollectorResponseBodyResult setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public DescribeCollectorResponseBodyResult setExtendConfigs(java.util.List<DescribeCollectorResponseBodyResultExtendConfigs> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<DescribeCollectorResponseBodyResultExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        public DescribeCollectorResponseBodyResult setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public DescribeCollectorResponseBodyResult setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public DescribeCollectorResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCollectorResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeCollectorResponseBodyResult setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public DescribeCollectorResponseBodyResult setResType(String resType) {
            this.resType = resType;
            return this;
        }
        public String getResType() {
            return this.resType;
        }

        public DescribeCollectorResponseBodyResult setResVersion(String resVersion) {
            this.resVersion = resVersion;
            return this;
        }
        public String getResVersion() {
            return this.resVersion;
        }

        public DescribeCollectorResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCollectorResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
