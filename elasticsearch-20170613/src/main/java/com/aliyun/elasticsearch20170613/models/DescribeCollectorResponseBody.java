// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeCollectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("content")
        public String content;

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
        @NameInMap("agentStatus")
        public String agentStatus;

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
        @NameInMap("successPodsCount")
        public String successPodsCount;

        @NameInMap("protocol")
        public String protocol;

        @NameInMap("userName")
        public String userName;

        @NameInMap("totalPodsCount")
        public String totalPodsCount;

        @NameInMap("type")
        public String type;

        @NameInMap("kibanaHost")
        public String kibanaHost;

        @NameInMap("enableMonitoring")
        public Boolean enableMonitoring;

        @NameInMap("configType")
        public String configType;

        @NameInMap("instanceType")
        public String instanceType;

        @NameInMap("groupId")
        public String groupId;

        @NameInMap("host")
        public String host;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("machines")
        public java.util.List<DescribeCollectorResponseBodyResultExtendConfigsMachines> machines;

        @NameInMap("hosts")
        public java.util.List<String> hosts;

        public static DescribeCollectorResponseBodyResultExtendConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollectorResponseBodyResultExtendConfigs self = new DescribeCollectorResponseBodyResultExtendConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setSuccessPodsCount(String successPodsCount) {
            this.successPodsCount = successPodsCount;
            return this;
        }
        public String getSuccessPodsCount() {
            return this.successPodsCount;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
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

        public DescribeCollectorResponseBodyResultExtendConfigs setKibanaHost(String kibanaHost) {
            this.kibanaHost = kibanaHost;
            return this;
        }
        public String getKibanaHost() {
            return this.kibanaHost;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setEnableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }
        public Boolean getEnableMonitoring() {
            return this.enableMonitoring;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
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

        public DescribeCollectorResponseBodyResultExtendConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setMachines(java.util.List<DescribeCollectorResponseBodyResultExtendConfigsMachines> machines) {
            this.machines = machines;
            return this;
        }
        public java.util.List<DescribeCollectorResponseBodyResultExtendConfigsMachines> getMachines() {
            return this.machines;
        }

        public DescribeCollectorResponseBodyResultExtendConfigs setHosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<String> getHosts() {
            return this.hosts;
        }

    }

    public static class DescribeCollectorResponseBodyResult extends TeaModel {
        @NameInMap("collectorPaths")
        public java.util.List<String> collectorPaths;

        @NameInMap("configs")
        public java.util.List<DescribeCollectorResponseBodyResultConfigs> configs;

        @NameInMap("dryRun")
        public Boolean dryRun;

        @NameInMap("extendConfigs")
        public java.util.List<DescribeCollectorResponseBodyResultExtendConfigs> extendConfigs;

        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        @NameInMap("gmtUpdateTime")
        public String gmtUpdateTime;

        @NameInMap("name")
        public String name;

        @NameInMap("ownerId")
        public String ownerId;

        @NameInMap("resId")
        public String resId;

        @NameInMap("resType")
        public String resType;

        @NameInMap("resVersion")
        public String resVersion;

        @NameInMap("status")
        public String status;

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
