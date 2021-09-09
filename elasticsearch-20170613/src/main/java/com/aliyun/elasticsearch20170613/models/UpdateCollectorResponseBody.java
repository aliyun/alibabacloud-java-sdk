// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateCollectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("content")
        public String content;

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
        @NameInMap("agentStatus")
        public String agentStatus;

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
        public java.util.List<UpdateCollectorResponseBodyResultExtendConfigsMachines> machines;

        @NameInMap("hosts")
        public java.util.List<String> hosts;

        public static UpdateCollectorResponseBodyResultExtendConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateCollectorResponseBodyResultExtendConfigs self = new UpdateCollectorResponseBodyResultExtendConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setSuccessPodsCount(String successPodsCount) {
            this.successPodsCount = successPodsCount;
            return this;
        }
        public String getSuccessPodsCount() {
            return this.successPodsCount;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
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

        public UpdateCollectorResponseBodyResultExtendConfigs setKibanaHost(String kibanaHost) {
            this.kibanaHost = kibanaHost;
            return this;
        }
        public String getKibanaHost() {
            return this.kibanaHost;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setEnableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }
        public Boolean getEnableMonitoring() {
            return this.enableMonitoring;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
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

        public UpdateCollectorResponseBodyResultExtendConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setMachines(java.util.List<UpdateCollectorResponseBodyResultExtendConfigsMachines> machines) {
            this.machines = machines;
            return this;
        }
        public java.util.List<UpdateCollectorResponseBodyResultExtendConfigsMachines> getMachines() {
            return this.machines;
        }

        public UpdateCollectorResponseBodyResultExtendConfigs setHosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<String> getHosts() {
            return this.hosts;
        }

    }

    public static class UpdateCollectorResponseBodyResult extends TeaModel {
        @NameInMap("resId")
        public String resId;

        @NameInMap("gmtUpdateTime")
        public String gmtUpdateTime;

        @NameInMap("dryRun")
        public Boolean dryRun;

        @NameInMap("ownerId")
        public String ownerId;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("resType")
        public String resType;

        @NameInMap("resVersion")
        public String resVersion;

        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        @NameInMap("status")
        public String status;

        @NameInMap("name")
        public String name;

        @NameInMap("configs")
        public java.util.List<UpdateCollectorResponseBodyResultConfigs> configs;

        @NameInMap("extendConfigs")
        public java.util.List<UpdateCollectorResponseBodyResultExtendConfigs> extendConfigs;

        @NameInMap("collectorPaths")
        public java.util.List<String> collectorPaths;

        public static UpdateCollectorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateCollectorResponseBodyResult self = new UpdateCollectorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateCollectorResponseBodyResult setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public UpdateCollectorResponseBodyResult setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public UpdateCollectorResponseBodyResult setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public UpdateCollectorResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public UpdateCollectorResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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

        public UpdateCollectorResponseBodyResult setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public UpdateCollectorResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateCollectorResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCollectorResponseBodyResult setConfigs(java.util.List<UpdateCollectorResponseBodyResultConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<UpdateCollectorResponseBodyResultConfigs> getConfigs() {
            return this.configs;
        }

        public UpdateCollectorResponseBodyResult setExtendConfigs(java.util.List<UpdateCollectorResponseBodyResultExtendConfigs> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<UpdateCollectorResponseBodyResultExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        public UpdateCollectorResponseBodyResult setCollectorPaths(java.util.List<String> collectorPaths) {
            this.collectorPaths = collectorPaths;
            return this;
        }
        public java.util.List<String> getCollectorPaths() {
            return this.collectorPaths;
        }

    }

}
