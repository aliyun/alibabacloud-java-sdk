// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListFlowControlsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowControlsMap")
    public ListFlowControlsResponseBodyFlowControlsMap flowControlsMap;

    @NameInMap("Code")
    public Integer code;

    public static ListFlowControlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlsResponseBody self = new ListFlowControlsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowControlsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlowControlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowControlsResponseBody setFlowControlsMap(ListFlowControlsResponseBodyFlowControlsMap flowControlsMap) {
        this.flowControlsMap = flowControlsMap;
        return this;
    }
    public ListFlowControlsResponseBodyFlowControlsMap getFlowControlsMap() {
        return this.flowControlsMap;
    }

    public ListFlowControlsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListFlowControlsResponseBodyFlowControlsMapAppListApp extends TeaModel {
        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("ExtSlbIp")
        public String extSlbIp;

        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("SlbPort")
        public Integer slbPort;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("ExtSlbId")
        public String extSlbId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RunningInstanceCount")
        public Integer runningInstanceCount;

        @NameInMap("SlbIp")
        public String slbIp;

        @NameInMap("BuildPackageId")
        public Long buildPackageId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Dockerize")
        public Boolean dockerize;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("Description")
        public String description;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("Name")
        public String name;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ListFlowControlsResponseBodyFlowControlsMapAppListApp build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlsResponseBodyFlowControlsMapAppListApp self = new ListFlowControlsResponseBodyFlowControlsMapAppListApp();
            return TeaModel.build(map, self);
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setExtSlbIp(String extSlbIp) {
            this.extSlbIp = extSlbIp;
            return this;
        }
        public String getExtSlbIp() {
            return this.extSlbIp;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setSlbPort(Integer slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public Integer getSlbPort() {
            return this.slbPort;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setExtSlbId(String extSlbId) {
            this.extSlbId = extSlbId;
            return this;
        }
        public String getExtSlbId() {
            return this.extSlbId;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setRunningInstanceCount(Integer runningInstanceCount) {
            this.runningInstanceCount = runningInstanceCount;
            return this;
        }
        public Integer getRunningInstanceCount() {
            return this.runningInstanceCount;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setBuildPackageId(Long buildPackageId) {
            this.buildPackageId = buildPackageId;
            return this;
        }
        public Long getBuildPackageId() {
            return this.buildPackageId;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setDockerize(Boolean dockerize) {
            this.dockerize = dockerize;
            return this;
        }
        public Boolean getDockerize() {
            return this.dockerize;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppListApp setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ListFlowControlsResponseBodyFlowControlsMapAppList extends TeaModel {
        @NameInMap("App")
        public java.util.List<ListFlowControlsResponseBodyFlowControlsMapAppListApp> app;

        public static ListFlowControlsResponseBodyFlowControlsMapAppList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlsResponseBodyFlowControlsMapAppList self = new ListFlowControlsResponseBodyFlowControlsMapAppList();
            return TeaModel.build(map, self);
        }

        public ListFlowControlsResponseBodyFlowControlsMapAppList setApp(java.util.List<ListFlowControlsResponseBodyFlowControlsMapAppListApp> app) {
            this.app = app;
            return this;
        }
        public java.util.List<ListFlowControlsResponseBodyFlowControlsMapAppListApp> getApp() {
            return this.app;
        }

    }

    public static class ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods extends TeaModel {
        @NameInMap("Method")
        public java.util.List<String> method;

        public static ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods self = new ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods();
            return TeaModel.build(map, self);
        }

        public ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods setMethod(java.util.List<String> method) {
            this.method = method;
            return this;
        }
        public java.util.List<String> getMethod() {
            return this.method;
        }

    }

    public static class ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod extends TeaModel {
        @NameInMap("Version")
        public String version;

        @NameInMap("name")
        public String name;

        @NameInMap("Methods")
        public ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods methods;

        public static ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod self = new ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod();
            return TeaModel.build(map, self);
        }

        public ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod setMethods(ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods methods) {
            this.methods = methods;
            return this;
        }
        public ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods getMethods() {
            return this.methods;
        }

    }

    public static class ListFlowControlsResponseBodyFlowControlsMapInterfaceMethods extends TeaModel {
        @NameInMap("InterfaceMethod")
        public java.util.List<ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod> interfaceMethod;

        public static ListFlowControlsResponseBodyFlowControlsMapInterfaceMethods build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlsResponseBodyFlowControlsMapInterfaceMethods self = new ListFlowControlsResponseBodyFlowControlsMapInterfaceMethods();
            return TeaModel.build(map, self);
        }

        public ListFlowControlsResponseBodyFlowControlsMapInterfaceMethods setInterfaceMethod(java.util.List<ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod> interfaceMethod) {
            this.interfaceMethod = interfaceMethod;
            return this;
        }
        public java.util.List<ListFlowControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod> getInterfaceMethod() {
            return this.interfaceMethod;
        }

    }

    public static class ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("State")
        public Integer state;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Strategy")
        public String strategy;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Granularity")
        public String granularity;

        @NameInMap("Threshold")
        public Integer threshold;

        @NameInMap("Id")
        public String id;

        public static ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule self = new ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule();
            return TeaModel.build(map, self);
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setConsumerAppId(String consumerAppId) {
            this.consumerAppId = consumerAppId;
            return this;
        }
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultList extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule> rule;

        public static ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultList self = new ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultList();
            return TeaModel.build(map, self);
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultList setRule(java.util.List<ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultListRule> getRule() {
            return this.rule;
        }

    }

    public static class ListFlowControlsResponseBodyFlowControlsMapRuleList extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("TotalSize")
        public Integer totalSize;

        @NameInMap("RuleResultList")
        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultList ruleResultList;

        @NameInMap("pageSize")
        public Integer pageSize;

        public static ListFlowControlsResponseBodyFlowControlsMapRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlsResponseBodyFlowControlsMapRuleList self = new ListFlowControlsResponseBodyFlowControlsMapRuleList();
            return TeaModel.build(map, self);
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleList setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleList setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleList setRuleResultList(ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultList ruleResultList) {
            this.ruleResultList = ruleResultList;
            return this;
        }
        public ListFlowControlsResponseBodyFlowControlsMapRuleListRuleResultList getRuleResultList() {
            return this.ruleResultList;
        }

        public ListFlowControlsResponseBodyFlowControlsMapRuleList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListFlowControlsResponseBodyFlowControlsMap extends TeaModel {
        @NameInMap("AppList")
        public ListFlowControlsResponseBodyFlowControlsMapAppList appList;

        @NameInMap("InterfaceMethods")
        public ListFlowControlsResponseBodyFlowControlsMapInterfaceMethods interfaceMethods;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("RuleList")
        public ListFlowControlsResponseBodyFlowControlsMapRuleList ruleList;

        public static ListFlowControlsResponseBodyFlowControlsMap build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlsResponseBodyFlowControlsMap self = new ListFlowControlsResponseBodyFlowControlsMap();
            return TeaModel.build(map, self);
        }

        public ListFlowControlsResponseBodyFlowControlsMap setAppList(ListFlowControlsResponseBodyFlowControlsMapAppList appList) {
            this.appList = appList;
            return this;
        }
        public ListFlowControlsResponseBodyFlowControlsMapAppList getAppList() {
            return this.appList;
        }

        public ListFlowControlsResponseBodyFlowControlsMap setInterfaceMethods(ListFlowControlsResponseBodyFlowControlsMapInterfaceMethods interfaceMethods) {
            this.interfaceMethods = interfaceMethods;
            return this;
        }
        public ListFlowControlsResponseBodyFlowControlsMapInterfaceMethods getInterfaceMethods() {
            return this.interfaceMethods;
        }

        public ListFlowControlsResponseBodyFlowControlsMap setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListFlowControlsResponseBodyFlowControlsMap setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListFlowControlsResponseBodyFlowControlsMap setRuleList(ListFlowControlsResponseBodyFlowControlsMapRuleList ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public ListFlowControlsResponseBodyFlowControlsMapRuleList getRuleList() {
            return this.ruleList;
        }

    }

}
