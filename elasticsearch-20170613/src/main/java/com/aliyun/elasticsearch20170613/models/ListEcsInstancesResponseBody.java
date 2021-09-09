// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListEcsInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Headers")
    public ListEcsInstancesResponseBodyHeaders headers;

    @NameInMap("Result")
    public java.util.List<ListEcsInstancesResponseBodyResult> result;

    public static ListEcsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEcsInstancesResponseBody self = new ListEcsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEcsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEcsInstancesResponseBody setHeaders(ListEcsInstancesResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListEcsInstancesResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListEcsInstancesResponseBody setResult(java.util.List<ListEcsInstancesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListEcsInstancesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListEcsInstancesResponseBodyHeaders extends TeaModel {
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

    public static class ListEcsInstancesResponseBodyResultIpAddress extends TeaModel {
        @NameInMap("ipType")
        public String ipType;

        @NameInMap("host")
        public String host;

        public static ListEcsInstancesResponseBodyResultIpAddress build(java.util.Map<String, ?> map) throws Exception {
            ListEcsInstancesResponseBodyResultIpAddress self = new ListEcsInstancesResponseBodyResultIpAddress();
            return TeaModel.build(map, self);
        }

        public ListEcsInstancesResponseBodyResultIpAddress setIpType(String ipType) {
            this.ipType = ipType;
            return this;
        }
        public String getIpType() {
            return this.ipType;
        }

        public ListEcsInstancesResponseBodyResultIpAddress setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

    }

    public static class ListEcsInstancesResponseBodyResultCollectorsConfigs extends TeaModel {
        @NameInMap("content")
        public String content;

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
        @NameInMap("agentStatus")
        public String agentStatus;

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
        @NameInMap("enableMonitoring")
        public Boolean enableMonitoring;

        @NameInMap("groupId")
        public String groupId;

        @NameInMap("configType")
        public String configType;

        @NameInMap("instanceType")
        public String instanceType;

        @NameInMap("protocol")
        public String protocol;

        @NameInMap("userName")
        public String userName;

        @NameInMap("type")
        public String type;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("machines")
        public java.util.List<ListEcsInstancesResponseBodyResultCollectorsExtendConfigsMachines> machines;

        @NameInMap("hosts")
        public java.util.List<String> hosts;

        public static ListEcsInstancesResponseBodyResultCollectorsExtendConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListEcsInstancesResponseBodyResultCollectorsExtendConfigs self = new ListEcsInstancesResponseBodyResultCollectorsExtendConfigs();
            return TeaModel.build(map, self);
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

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setMachines(java.util.List<ListEcsInstancesResponseBodyResultCollectorsExtendConfigsMachines> machines) {
            this.machines = machines;
            return this;
        }
        public java.util.List<ListEcsInstancesResponseBodyResultCollectorsExtendConfigsMachines> getMachines() {
            return this.machines;
        }

        public ListEcsInstancesResponseBodyResultCollectorsExtendConfigs setHosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<String> getHosts() {
            return this.hosts;
        }

    }

    public static class ListEcsInstancesResponseBodyResultCollectors extends TeaModel {
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
        public java.util.List<ListEcsInstancesResponseBodyResultCollectorsConfigs> configs;

        @NameInMap("extendConfigs")
        public java.util.List<ListEcsInstancesResponseBodyResultCollectorsExtendConfigs> extendConfigs;

        @NameInMap("collectorPaths")
        public java.util.List<String> collectorPaths;

        public static ListEcsInstancesResponseBodyResultCollectors build(java.util.Map<String, ?> map) throws Exception {
            ListEcsInstancesResponseBodyResultCollectors self = new ListEcsInstancesResponseBodyResultCollectors();
            return TeaModel.build(map, self);
        }

        public ListEcsInstancesResponseBodyResultCollectors setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public ListEcsInstancesResponseBodyResultCollectors setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public ListEcsInstancesResponseBodyResultCollectors setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public ListEcsInstancesResponseBodyResultCollectors setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListEcsInstancesResponseBodyResultCollectors setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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

        public ListEcsInstancesResponseBodyResultCollectors setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public ListEcsInstancesResponseBodyResultCollectors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEcsInstancesResponseBodyResultCollectors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEcsInstancesResponseBodyResultCollectors setConfigs(java.util.List<ListEcsInstancesResponseBodyResultCollectorsConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<ListEcsInstancesResponseBodyResultCollectorsConfigs> getConfigs() {
            return this.configs;
        }

        public ListEcsInstancesResponseBodyResultCollectors setExtendConfigs(java.util.List<ListEcsInstancesResponseBodyResultCollectorsExtendConfigs> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<ListEcsInstancesResponseBodyResultCollectorsExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        public ListEcsInstancesResponseBodyResultCollectors setCollectorPaths(java.util.List<String> collectorPaths) {
            this.collectorPaths = collectorPaths;
            return this;
        }
        public java.util.List<String> getCollectorPaths() {
            return this.collectorPaths;
        }

    }

    public static class ListEcsInstancesResponseBodyResult extends TeaModel {
        @NameInMap("cloudAssistantStatus")
        public String cloudAssistantStatus;

        @NameInMap("ecsInstanceName")
        public String ecsInstanceName;

        @NameInMap("ecsInstanceId")
        public String ecsInstanceId;

        @NameInMap("tags")
        public String tags;

        @NameInMap("osType")
        public String osType;

        @NameInMap("status")
        public String status;

        @NameInMap("ipAddress")
        public java.util.List<ListEcsInstancesResponseBodyResultIpAddress> ipAddress;

        @NameInMap("collectors")
        public java.util.List<ListEcsInstancesResponseBodyResultCollectors> collectors;

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

        public ListEcsInstancesResponseBodyResult setEcsInstanceName(String ecsInstanceName) {
            this.ecsInstanceName = ecsInstanceName;
            return this;
        }
        public String getEcsInstanceName() {
            return this.ecsInstanceName;
        }

        public ListEcsInstancesResponseBodyResult setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public ListEcsInstancesResponseBodyResult setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
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

        public ListEcsInstancesResponseBodyResult setIpAddress(java.util.List<ListEcsInstancesResponseBodyResultIpAddress> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<ListEcsInstancesResponseBodyResultIpAddress> getIpAddress() {
            return this.ipAddress;
        }

        public ListEcsInstancesResponseBodyResult setCollectors(java.util.List<ListEcsInstancesResponseBodyResultCollectors> collectors) {
            this.collectors = collectors;
            return this;
        }
        public java.util.List<ListEcsInstancesResponseBodyResultCollectors> getCollectors() {
            return this.collectors;
        }

    }

}
