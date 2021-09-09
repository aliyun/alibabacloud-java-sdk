// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateCollectorNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("content")
        public String content;

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
        @NameInMap("agentStatus")
        public String agentStatus;

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
        public java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigsMachines> machines;

        @NameInMap("hosts")
        public java.util.List<String> hosts;

        public static UpdateCollectorNameResponseBodyResultExtendConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateCollectorNameResponseBodyResultExtendConfigs self = new UpdateCollectorNameResponseBodyResultExtendConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setSuccessPodsCount(String successPodsCount) {
            this.successPodsCount = successPodsCount;
            return this;
        }
        public String getSuccessPodsCount() {
            return this.successPodsCount;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
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

        public UpdateCollectorNameResponseBodyResultExtendConfigs setKibanaHost(String kibanaHost) {
            this.kibanaHost = kibanaHost;
            return this;
        }
        public String getKibanaHost() {
            return this.kibanaHost;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setEnableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }
        public Boolean getEnableMonitoring() {
            return this.enableMonitoring;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
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

        public UpdateCollectorNameResponseBodyResultExtendConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setMachines(java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigsMachines> machines) {
            this.machines = machines;
            return this;
        }
        public java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigsMachines> getMachines() {
            return this.machines;
        }

        public UpdateCollectorNameResponseBodyResultExtendConfigs setHosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<String> getHosts() {
            return this.hosts;
        }

    }

    public static class UpdateCollectorNameResponseBodyResult extends TeaModel {
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
        public java.util.List<UpdateCollectorNameResponseBodyResultConfigs> configs;

        @NameInMap("extendConfigs")
        public java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigs> extendConfigs;

        @NameInMap("collectorPaths")
        public java.util.List<String> collectorPaths;

        public static UpdateCollectorNameResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateCollectorNameResponseBodyResult self = new UpdateCollectorNameResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateCollectorNameResponseBodyResult setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public UpdateCollectorNameResponseBodyResult setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public UpdateCollectorNameResponseBodyResult setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public UpdateCollectorNameResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public UpdateCollectorNameResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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

        public UpdateCollectorNameResponseBodyResult setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public UpdateCollectorNameResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateCollectorNameResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCollectorNameResponseBodyResult setConfigs(java.util.List<UpdateCollectorNameResponseBodyResultConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<UpdateCollectorNameResponseBodyResultConfigs> getConfigs() {
            return this.configs;
        }

        public UpdateCollectorNameResponseBodyResult setExtendConfigs(java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigs> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<UpdateCollectorNameResponseBodyResultExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        public UpdateCollectorNameResponseBodyResult setCollectorPaths(java.util.List<String> collectorPaths) {
            this.collectorPaths = collectorPaths;
            return this;
        }
        public java.util.List<String> getCollectorPaths() {
            return this.collectorPaths;
        }

    }

}
