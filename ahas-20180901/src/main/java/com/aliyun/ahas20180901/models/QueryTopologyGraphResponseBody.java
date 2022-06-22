// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyGraphResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyGraphResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyGraphResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyGraphResponseBody self = new QueryTopologyGraphResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyGraphResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyGraphResponseBody setData(QueryTopologyGraphResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyGraphResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyGraphResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyGraphResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyGraphResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyGraphResponseBodyDataCombos extends TeaModel {
        @NameInMap("alarmCount")
        public Integer alarmCount;

        @NameInMap("category")
        public String category;

        @NameInMap("comboId")
        public String comboId;

        @NameInMap("containerConfigurationId")
        public String containerConfigurationId;

        @NameInMap("count")
        public Integer count;

        @NameInMap("cpuUtil")
        public Float cpuUtil;

        @NameInMap("deviceType")
        public Integer deviceType;

        @NameInMap("display")
        public Boolean display;

        @NameInMap("eventCount")
        public Integer eventCount;

        @NameInMap("extFields")
        public java.util.Map<String, ?> extFields;

        @NameInMap("group")
        public String group;

        @NameInMap("hostConfigurationId")
        public String hostConfigurationId;

        @NameInMap("icon")
        public String icon;

        @NameInMap("id")
        public String id;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("kubContainerCount")
        public Integer kubContainerCount;

        @NameInMap("kubNamespace")
        public String kubNamespace;

        @NameInMap("memUtil")
        public Float memUtil;

        @NameInMap("name")
        public String name;

        @NameInMap("nameMinor")
        public String nameMinor;

        @NameInMap("origin")
        public String origin;

        @NameInMap("parentDeviceId")
        public String parentDeviceId;

        @NameInMap("podConfigurationId")
        public String podConfigurationId;

        @NameInMap("rankdir")
        public String rankdir;

        @NameInMap("riskCount")
        public Integer riskCount;

        @NameInMap("riskLevel")
        public String riskLevel;

        @NameInMap("selfConnected")
        public Boolean selfConnected;

        @NameInMap("state")
        public String state;

        @NameInMap("type")
        public String type;

        @NameInMap("viewId")
        public String viewId;

        @NameInMap("zone")
        public String zone;

        public static QueryTopologyGraphResponseBodyDataCombos build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyGraphResponseBodyDataCombos self = new QueryTopologyGraphResponseBodyDataCombos();
            return TeaModel.build(map, self);
        }

        public QueryTopologyGraphResponseBodyDataCombos setAlarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        public QueryTopologyGraphResponseBodyDataCombos setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryTopologyGraphResponseBodyDataCombos setComboId(String comboId) {
            this.comboId = comboId;
            return this;
        }
        public String getComboId() {
            return this.comboId;
        }

        public QueryTopologyGraphResponseBodyDataCombos setContainerConfigurationId(String containerConfigurationId) {
            this.containerConfigurationId = containerConfigurationId;
            return this;
        }
        public String getContainerConfigurationId() {
            return this.containerConfigurationId;
        }

        public QueryTopologyGraphResponseBodyDataCombos setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryTopologyGraphResponseBodyDataCombos setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyGraphResponseBodyDataCombos setDeviceType(Integer deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public Integer getDeviceType() {
            return this.deviceType;
        }

        public QueryTopologyGraphResponseBodyDataCombos setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public QueryTopologyGraphResponseBodyDataCombos setEventCount(Integer eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Integer getEventCount() {
            return this.eventCount;
        }

        public QueryTopologyGraphResponseBodyDataCombos setExtFields(java.util.Map<String, ?> extFields) {
            this.extFields = extFields;
            return this;
        }
        public java.util.Map<String, ?> getExtFields() {
            return this.extFields;
        }

        public QueryTopologyGraphResponseBodyDataCombos setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public QueryTopologyGraphResponseBodyDataCombos setHostConfigurationId(String hostConfigurationId) {
            this.hostConfigurationId = hostConfigurationId;
            return this;
        }
        public String getHostConfigurationId() {
            return this.hostConfigurationId;
        }

        public QueryTopologyGraphResponseBodyDataCombos setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTopologyGraphResponseBodyDataCombos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyGraphResponseBodyDataCombos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTopologyGraphResponseBodyDataCombos setKubContainerCount(Integer kubContainerCount) {
            this.kubContainerCount = kubContainerCount;
            return this;
        }
        public Integer getKubContainerCount() {
            return this.kubContainerCount;
        }

        public QueryTopologyGraphResponseBodyDataCombos setKubNamespace(String kubNamespace) {
            this.kubNamespace = kubNamespace;
            return this;
        }
        public String getKubNamespace() {
            return this.kubNamespace;
        }

        public QueryTopologyGraphResponseBodyDataCombos setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyGraphResponseBodyDataCombos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTopologyGraphResponseBodyDataCombos setNameMinor(String nameMinor) {
            this.nameMinor = nameMinor;
            return this;
        }
        public String getNameMinor() {
            return this.nameMinor;
        }

        public QueryTopologyGraphResponseBodyDataCombos setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public QueryTopologyGraphResponseBodyDataCombos setParentDeviceId(String parentDeviceId) {
            this.parentDeviceId = parentDeviceId;
            return this;
        }
        public String getParentDeviceId() {
            return this.parentDeviceId;
        }

        public QueryTopologyGraphResponseBodyDataCombos setPodConfigurationId(String podConfigurationId) {
            this.podConfigurationId = podConfigurationId;
            return this;
        }
        public String getPodConfigurationId() {
            return this.podConfigurationId;
        }

        public QueryTopologyGraphResponseBodyDataCombos setRankdir(String rankdir) {
            this.rankdir = rankdir;
            return this;
        }
        public String getRankdir() {
            return this.rankdir;
        }

        public QueryTopologyGraphResponseBodyDataCombos setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public QueryTopologyGraphResponseBodyDataCombos setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public QueryTopologyGraphResponseBodyDataCombos setSelfConnected(Boolean selfConnected) {
            this.selfConnected = selfConnected;
            return this;
        }
        public Boolean getSelfConnected() {
            return this.selfConnected;
        }

        public QueryTopologyGraphResponseBodyDataCombos setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryTopologyGraphResponseBodyDataCombos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTopologyGraphResponseBodyDataCombos setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

        public QueryTopologyGraphResponseBodyDataCombos setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class QueryTopologyGraphResponseBodyDataConfigFilters extends TeaModel {
        @NameInMap("data")
        public String data;

        @NameInMap("type")
        public String type;

        public static QueryTopologyGraphResponseBodyDataConfigFilters build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyGraphResponseBodyDataConfigFilters self = new QueryTopologyGraphResponseBodyDataConfigFilters();
            return TeaModel.build(map, self);
        }

        public QueryTopologyGraphResponseBodyDataConfigFilters setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryTopologyGraphResponseBodyDataConfigFilters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTopologyGraphResponseBodyDataConfig extends TeaModel {
        @NameInMap("detailConnection")
        public Boolean detailConnection;

        @NameInMap("filters")
        public java.util.List<QueryTopologyGraphResponseBodyDataConfigFilters> filters;

        @NameInMap("groupViewId")
        public String groupViewId;

        @NameInMap("layout")
        public String layout;

        @NameInMap("rankdir")
        public String rankdir;

        @NameInMap("setting")
        public String setting;

        @NameInMap("viewType")
        public Integer viewType;

        public static QueryTopologyGraphResponseBodyDataConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyGraphResponseBodyDataConfig self = new QueryTopologyGraphResponseBodyDataConfig();
            return TeaModel.build(map, self);
        }

        public QueryTopologyGraphResponseBodyDataConfig setDetailConnection(Boolean detailConnection) {
            this.detailConnection = detailConnection;
            return this;
        }
        public Boolean getDetailConnection() {
            return this.detailConnection;
        }

        public QueryTopologyGraphResponseBodyDataConfig setFilters(java.util.List<QueryTopologyGraphResponseBodyDataConfigFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<QueryTopologyGraphResponseBodyDataConfigFilters> getFilters() {
            return this.filters;
        }

        public QueryTopologyGraphResponseBodyDataConfig setGroupViewId(String groupViewId) {
            this.groupViewId = groupViewId;
            return this;
        }
        public String getGroupViewId() {
            return this.groupViewId;
        }

        public QueryTopologyGraphResponseBodyDataConfig setLayout(String layout) {
            this.layout = layout;
            return this;
        }
        public String getLayout() {
            return this.layout;
        }

        public QueryTopologyGraphResponseBodyDataConfig setRankdir(String rankdir) {
            this.rankdir = rankdir;
            return this;
        }
        public String getRankdir() {
            return this.rankdir;
        }

        public QueryTopologyGraphResponseBodyDataConfig setSetting(String setting) {
            this.setting = setting;
            return this;
        }
        public String getSetting() {
            return this.setting;
        }

        public QueryTopologyGraphResponseBodyDataConfig setViewType(Integer viewType) {
            this.viewType = viewType;
            return this;
        }
        public Integer getViewType() {
            return this.viewType;
        }

    }

    public static class QueryTopologyGraphResponseBodyDataEdges extends TeaModel {
        @NameInMap("protocol")
        public String protocol;

        @NameInMap("scope")
        public String scope;

        @NameInMap("source")
        public String source;

        @NameInMap("target")
        public String target;

        public static QueryTopologyGraphResponseBodyDataEdges build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyGraphResponseBodyDataEdges self = new QueryTopologyGraphResponseBodyDataEdges();
            return TeaModel.build(map, self);
        }

        public QueryTopologyGraphResponseBodyDataEdges setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public QueryTopologyGraphResponseBodyDataEdges setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public QueryTopologyGraphResponseBodyDataEdges setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryTopologyGraphResponseBodyDataEdges setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class QueryTopologyGraphResponseBodyDataNodes extends TeaModel {
        @NameInMap("alarmCount")
        public Integer alarmCount;

        @NameInMap("category")
        public String category;

        @NameInMap("comboId")
        public String comboId;

        @NameInMap("containerConfigurationId")
        public String containerConfigurationId;

        @NameInMap("count")
        public Integer count;

        @NameInMap("cpuUtil")
        public Float cpuUtil;

        @NameInMap("deviceType")
        public Integer deviceType;

        @NameInMap("display")
        public Boolean display;

        @NameInMap("eventCount")
        public Integer eventCount;

        @NameInMap("experimentFlag")
        public Integer experimentFlag;

        @NameInMap("extFields")
        public java.util.Map<String, ?> extFields;

        @NameInMap("group")
        public String group;

        @NameInMap("hostConfigurationId")
        public String hostConfigurationId;

        @NameInMap("icon")
        public String icon;

        @NameInMap("id")
        public String id;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("kubContainerCount")
        public Integer kubContainerCount;

        @NameInMap("kubNamespace")
        public String kubNamespace;

        @NameInMap("memUtil")
        public Float memUtil;

        @NameInMap("name")
        public String name;

        @NameInMap("nameMinor")
        public String nameMinor;

        @NameInMap("origin")
        public String origin;

        @NameInMap("parentDeviceId")
        public String parentDeviceId;

        @NameInMap("podConfigurationId")
        public String podConfigurationId;

        @NameInMap("rankdir")
        public String rankdir;

        @NameInMap("riskCount")
        public Integer riskCount;

        @NameInMap("riskLevel")
        public String riskLevel;

        @NameInMap("selfConnected")
        public Boolean selfConnected;

        @NameInMap("state")
        public String state;

        @NameInMap("type")
        public String type;

        @NameInMap("viewId")
        public String viewId;

        @NameInMap("zone")
        public Integer zone;

        public static QueryTopologyGraphResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyGraphResponseBodyDataNodes self = new QueryTopologyGraphResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public QueryTopologyGraphResponseBodyDataNodes setAlarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        public QueryTopologyGraphResponseBodyDataNodes setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryTopologyGraphResponseBodyDataNodes setComboId(String comboId) {
            this.comboId = comboId;
            return this;
        }
        public String getComboId() {
            return this.comboId;
        }

        public QueryTopologyGraphResponseBodyDataNodes setContainerConfigurationId(String containerConfigurationId) {
            this.containerConfigurationId = containerConfigurationId;
            return this;
        }
        public String getContainerConfigurationId() {
            return this.containerConfigurationId;
        }

        public QueryTopologyGraphResponseBodyDataNodes setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryTopologyGraphResponseBodyDataNodes setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyGraphResponseBodyDataNodes setDeviceType(Integer deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public Integer getDeviceType() {
            return this.deviceType;
        }

        public QueryTopologyGraphResponseBodyDataNodes setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

        public QueryTopologyGraphResponseBodyDataNodes setEventCount(Integer eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Integer getEventCount() {
            return this.eventCount;
        }

        public QueryTopologyGraphResponseBodyDataNodes setExperimentFlag(Integer experimentFlag) {
            this.experimentFlag = experimentFlag;
            return this;
        }
        public Integer getExperimentFlag() {
            return this.experimentFlag;
        }

        public QueryTopologyGraphResponseBodyDataNodes setExtFields(java.util.Map<String, ?> extFields) {
            this.extFields = extFields;
            return this;
        }
        public java.util.Map<String, ?> getExtFields() {
            return this.extFields;
        }

        public QueryTopologyGraphResponseBodyDataNodes setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public QueryTopologyGraphResponseBodyDataNodes setHostConfigurationId(String hostConfigurationId) {
            this.hostConfigurationId = hostConfigurationId;
            return this;
        }
        public String getHostConfigurationId() {
            return this.hostConfigurationId;
        }

        public QueryTopologyGraphResponseBodyDataNodes setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTopologyGraphResponseBodyDataNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyGraphResponseBodyDataNodes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTopologyGraphResponseBodyDataNodes setKubContainerCount(Integer kubContainerCount) {
            this.kubContainerCount = kubContainerCount;
            return this;
        }
        public Integer getKubContainerCount() {
            return this.kubContainerCount;
        }

        public QueryTopologyGraphResponseBodyDataNodes setKubNamespace(String kubNamespace) {
            this.kubNamespace = kubNamespace;
            return this;
        }
        public String getKubNamespace() {
            return this.kubNamespace;
        }

        public QueryTopologyGraphResponseBodyDataNodes setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyGraphResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTopologyGraphResponseBodyDataNodes setNameMinor(String nameMinor) {
            this.nameMinor = nameMinor;
            return this;
        }
        public String getNameMinor() {
            return this.nameMinor;
        }

        public QueryTopologyGraphResponseBodyDataNodes setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public QueryTopologyGraphResponseBodyDataNodes setParentDeviceId(String parentDeviceId) {
            this.parentDeviceId = parentDeviceId;
            return this;
        }
        public String getParentDeviceId() {
            return this.parentDeviceId;
        }

        public QueryTopologyGraphResponseBodyDataNodes setPodConfigurationId(String podConfigurationId) {
            this.podConfigurationId = podConfigurationId;
            return this;
        }
        public String getPodConfigurationId() {
            return this.podConfigurationId;
        }

        public QueryTopologyGraphResponseBodyDataNodes setRankdir(String rankdir) {
            this.rankdir = rankdir;
            return this;
        }
        public String getRankdir() {
            return this.rankdir;
        }

        public QueryTopologyGraphResponseBodyDataNodes setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public QueryTopologyGraphResponseBodyDataNodes setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public QueryTopologyGraphResponseBodyDataNodes setSelfConnected(Boolean selfConnected) {
            this.selfConnected = selfConnected;
            return this;
        }
        public Boolean getSelfConnected() {
            return this.selfConnected;
        }

        public QueryTopologyGraphResponseBodyDataNodes setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryTopologyGraphResponseBodyDataNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTopologyGraphResponseBodyDataNodes setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

        public QueryTopologyGraphResponseBodyDataNodes setZone(Integer zone) {
            this.zone = zone;
            return this;
        }
        public Integer getZone() {
            return this.zone;
        }

    }

    public static class QueryTopologyGraphResponseBodyData extends TeaModel {
        @NameInMap("combos")
        public java.util.List<QueryTopologyGraphResponseBodyDataCombos> combos;

        @NameInMap("config")
        public QueryTopologyGraphResponseBodyDataConfig config;

        @NameInMap("edges")
        public java.util.List<QueryTopologyGraphResponseBodyDataEdges> edges;

        @NameInMap("nodes")
        public java.util.List<QueryTopologyGraphResponseBodyDataNodes> nodes;

        public static QueryTopologyGraphResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyGraphResponseBodyData self = new QueryTopologyGraphResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyGraphResponseBodyData setCombos(java.util.List<QueryTopologyGraphResponseBodyDataCombos> combos) {
            this.combos = combos;
            return this;
        }
        public java.util.List<QueryTopologyGraphResponseBodyDataCombos> getCombos() {
            return this.combos;
        }

        public QueryTopologyGraphResponseBodyData setConfig(QueryTopologyGraphResponseBodyDataConfig config) {
            this.config = config;
            return this;
        }
        public QueryTopologyGraphResponseBodyDataConfig getConfig() {
            return this.config;
        }

        public QueryTopologyGraphResponseBodyData setEdges(java.util.List<QueryTopologyGraphResponseBodyDataEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<QueryTopologyGraphResponseBodyDataEdges> getEdges() {
            return this.edges;
        }

        public QueryTopologyGraphResponseBodyData setNodes(java.util.List<QueryTopologyGraphResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<QueryTopologyGraphResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
