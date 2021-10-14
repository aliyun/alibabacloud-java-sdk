// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListCollectorsResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListCollectorsResponseBodyHeaders headers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListCollectorsResponseBodyResult> result;

    public static ListCollectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCollectorsResponseBody self = new ListCollectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCollectorsResponseBody setHeaders(ListCollectorsResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListCollectorsResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListCollectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCollectorsResponseBody setResult(java.util.List<ListCollectorsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListCollectorsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListCollectorsResponseBodyHeaders extends TeaModel {
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListCollectorsResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListCollectorsResponseBodyHeaders self = new ListCollectorsResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListCollectorsResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListCollectorsResponseBodyResultConfigs extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("fileName")
        public String fileName;

        public static ListCollectorsResponseBodyResultConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListCollectorsResponseBodyResultConfigs self = new ListCollectorsResponseBodyResultConfigs();
            return TeaModel.build(map, self);
        }

        public ListCollectorsResponseBodyResultConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListCollectorsResponseBodyResultConfigs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class ListCollectorsResponseBodyResultExtendConfigsMachines extends TeaModel {
        @NameInMap("agentStatus")
        public String agentStatus;

        @NameInMap("instanceId")
        public String instanceId;

        public static ListCollectorsResponseBodyResultExtendConfigsMachines build(java.util.Map<String, ?> map) throws Exception {
            ListCollectorsResponseBodyResultExtendConfigsMachines self = new ListCollectorsResponseBodyResultExtendConfigsMachines();
            return TeaModel.build(map, self);
        }

        public ListCollectorsResponseBodyResultExtendConfigsMachines setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public ListCollectorsResponseBodyResultExtendConfigsMachines setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListCollectorsResponseBodyResultExtendConfigs extends TeaModel {
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
        public java.util.List<ListCollectorsResponseBodyResultExtendConfigsMachines> machines;

        @NameInMap("hosts")
        public java.util.List<String> hosts;

        public static ListCollectorsResponseBodyResultExtendConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListCollectorsResponseBodyResultExtendConfigs self = new ListCollectorsResponseBodyResultExtendConfigs();
            return TeaModel.build(map, self);
        }

        public ListCollectorsResponseBodyResultExtendConfigs setSuccessPodsCount(String successPodsCount) {
            this.successPodsCount = successPodsCount;
            return this;
        }
        public String getSuccessPodsCount() {
            return this.successPodsCount;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setTotalPodsCount(String totalPodsCount) {
            this.totalPodsCount = totalPodsCount;
            return this;
        }
        public String getTotalPodsCount() {
            return this.totalPodsCount;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setKibanaHost(String kibanaHost) {
            this.kibanaHost = kibanaHost;
            return this;
        }
        public String getKibanaHost() {
            return this.kibanaHost;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setEnableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }
        public Boolean getEnableMonitoring() {
            return this.enableMonitoring;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setMachines(java.util.List<ListCollectorsResponseBodyResultExtendConfigsMachines> machines) {
            this.machines = machines;
            return this;
        }
        public java.util.List<ListCollectorsResponseBodyResultExtendConfigsMachines> getMachines() {
            return this.machines;
        }

        public ListCollectorsResponseBodyResultExtendConfigs setHosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<String> getHosts() {
            return this.hosts;
        }

    }

    public static class ListCollectorsResponseBodyResult extends TeaModel {
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
        public java.util.List<ListCollectorsResponseBodyResultConfigs> configs;

        @NameInMap("extendConfigs")
        public java.util.List<ListCollectorsResponseBodyResultExtendConfigs> extendConfigs;

        @NameInMap("collectorPaths")
        public java.util.List<String> collectorPaths;

        public static ListCollectorsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCollectorsResponseBodyResult self = new ListCollectorsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCollectorsResponseBodyResult setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public ListCollectorsResponseBodyResult setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public ListCollectorsResponseBodyResult setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public ListCollectorsResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListCollectorsResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListCollectorsResponseBodyResult setResType(String resType) {
            this.resType = resType;
            return this;
        }
        public String getResType() {
            return this.resType;
        }

        public ListCollectorsResponseBodyResult setResVersion(String resVersion) {
            this.resVersion = resVersion;
            return this;
        }
        public String getResVersion() {
            return this.resVersion;
        }

        public ListCollectorsResponseBodyResult setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public ListCollectorsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCollectorsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCollectorsResponseBodyResult setConfigs(java.util.List<ListCollectorsResponseBodyResultConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<ListCollectorsResponseBodyResultConfigs> getConfigs() {
            return this.configs;
        }

        public ListCollectorsResponseBodyResult setExtendConfigs(java.util.List<ListCollectorsResponseBodyResultExtendConfigs> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<ListCollectorsResponseBodyResultExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        public ListCollectorsResponseBodyResult setCollectorPaths(java.util.List<String> collectorPaths) {
            this.collectorPaths = collectorPaths;
            return this;
        }
        public java.util.List<String> getCollectorPaths() {
            return this.collectorPaths;
        }

    }

}
