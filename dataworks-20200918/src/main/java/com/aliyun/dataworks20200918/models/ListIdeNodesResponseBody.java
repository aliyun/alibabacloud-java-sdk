// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListIdeNodesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListIdeNodesResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListIdeNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdeNodesResponseBody self = new ListIdeNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdeNodesResponseBody setPagingInfo(ListIdeNodesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListIdeNodesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListIdeNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesDataSource extends TeaModel {
        /**
         * <p>数据源名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>数据源类型</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListIdeNodesResponseBodyPagingInfoNodesDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesDataSource self = new ListIdeNodesResponseBodyPagingInfoNodesDataSource();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesInputsNodeOutputs extends TeaModel {
        /**
         * <p>节点输出</p>
         */
        @NameInMap("Data")
        public String data;

        public static ListIdeNodesResponseBodyPagingInfoNodesInputsNodeOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesInputsNodeOutputs self = new ListIdeNodesResponseBodyPagingInfoNodesInputsNodeOutputs();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputsNodeOutputs setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesInputsTables extends TeaModel {
        /**
         * <p>表id</p>
         */
        @NameInMap("Guid")
        public String guid;

        public static ListIdeNodesResponseBodyPagingInfoNodesInputsTables build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesInputsTables self = new ListIdeNodesResponseBodyPagingInfoNodesInputsTables();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputsTables setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesInputsVariablesNode extends TeaModel {
        /**
         * <p>节点输出</p>
         */
        @NameInMap("Output")
        public String output;

        public static ListIdeNodesResponseBodyPagingInfoNodesInputsVariablesNode build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesInputsVariablesNode self = new ListIdeNodesResponseBodyPagingInfoNodesInputsVariablesNode();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputsVariablesNode setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesInputsVariables extends TeaModel {
        /**
         * <p>制品类型</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>变量id</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>变量名</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>变量所属节点</p>
         */
        @NameInMap("Node")
        public ListIdeNodesResponseBodyPagingInfoNodesInputsVariablesNode node;

        /**
         * <p>范围</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>类型</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>变量值</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListIdeNodesResponseBodyPagingInfoNodesInputsVariables build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesInputsVariables self = new ListIdeNodesResponseBodyPagingInfoNodesInputsVariables();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputsVariables setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputsVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputsVariables setNode(ListIdeNodesResponseBodyPagingInfoNodesInputsVariablesNode node) {
            this.node = node;
            return this;
        }
        public ListIdeNodesResponseBodyPagingInfoNodesInputsVariablesNode getNode() {
            return this.node;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputsVariables setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesInputs extends TeaModel {
        /**
         * <p>节点输出列表</p>
         */
        @NameInMap("NodeOutputs")
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesInputsNodeOutputs> nodeOutputs;

        /**
         * <p>表列表</p>
         */
        @NameInMap("Tables")
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesInputsTables> tables;

        /**
         * <p>变量列表</p>
         */
        @NameInMap("Variables")
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesInputsVariables> variables;

        public static ListIdeNodesResponseBodyPagingInfoNodesInputs build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesInputs self = new ListIdeNodesResponseBodyPagingInfoNodesInputs();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputs setNodeOutputs(java.util.List<ListIdeNodesResponseBodyPagingInfoNodesInputsNodeOutputs> nodeOutputs) {
            this.nodeOutputs = nodeOutputs;
            return this;
        }
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesInputsNodeOutputs> getNodeOutputs() {
            return this.nodeOutputs;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputs setTables(java.util.List<ListIdeNodesResponseBodyPagingInfoNodesInputsTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesInputsTables> getTables() {
            return this.tables;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesInputs setVariables(java.util.List<ListIdeNodesResponseBodyPagingInfoNodesInputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesInputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesOutputsNodeOutputs extends TeaModel {
        /**
         * <p>节点输出</p>
         */
        @NameInMap("Data")
        public String data;

        public static ListIdeNodesResponseBodyPagingInfoNodesOutputsNodeOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesOutputsNodeOutputs self = new ListIdeNodesResponseBodyPagingInfoNodesOutputsNodeOutputs();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputsNodeOutputs setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesOutputsTables extends TeaModel {
        /**
         * <p>表id</p>
         */
        @NameInMap("Guid")
        public String guid;

        public static ListIdeNodesResponseBodyPagingInfoNodesOutputsTables build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesOutputsTables self = new ListIdeNodesResponseBodyPagingInfoNodesOutputsTables();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputsTables setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesOutputsVariablesNode extends TeaModel {
        /**
         * <p>节点输出</p>
         */
        @NameInMap("Output")
        public String output;

        public static ListIdeNodesResponseBodyPagingInfoNodesOutputsVariablesNode build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesOutputsVariablesNode self = new ListIdeNodesResponseBodyPagingInfoNodesOutputsVariablesNode();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputsVariablesNode setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables extends TeaModel {
        /**
         * <p>制品类型</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>变量id</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>变量名</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>变量所属节点</p>
         */
        @NameInMap("Node")
        public ListIdeNodesResponseBodyPagingInfoNodesOutputsVariablesNode node;

        /**
         * <p>范围</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>类型</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>变量值</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables self = new ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables setNode(ListIdeNodesResponseBodyPagingInfoNodesOutputsVariablesNode node) {
            this.node = node;
            return this;
        }
        public ListIdeNodesResponseBodyPagingInfoNodesOutputsVariablesNode getNode() {
            return this.node;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesOutputs extends TeaModel {
        /**
         * <p>节点输出列表</p>
         */
        @NameInMap("NodeOutputs")
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesOutputsNodeOutputs> nodeOutputs;

        /**
         * <p>表列表</p>
         */
        @NameInMap("Tables")
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesOutputsTables> tables;

        /**
         * <p>变量列表</p>
         */
        @NameInMap("Variables")
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables> variables;

        public static ListIdeNodesResponseBodyPagingInfoNodesOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesOutputs self = new ListIdeNodesResponseBodyPagingInfoNodesOutputs();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputs setNodeOutputs(java.util.List<ListIdeNodesResponseBodyPagingInfoNodesOutputsNodeOutputs> nodeOutputs) {
            this.nodeOutputs = nodeOutputs;
            return this;
        }
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesOutputsNodeOutputs> getNodeOutputs() {
            return this.nodeOutputs;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputs setTables(java.util.List<ListIdeNodesResponseBodyPagingInfoNodesOutputsTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesOutputsTables> getTables() {
            return this.tables;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesOutputs setVariables(java.util.List<ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesOutputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesRuntimeResource extends TeaModel {
        /**
         * <p>资源组id</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListIdeNodesResponseBodyPagingInfoNodesRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesRuntimeResource self = new ListIdeNodesResponseBodyPagingInfoNodesRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesScriptRuntime extends TeaModel {
        /**
         * <p>脚本所属类型</p>
         */
        @NameInMap("Command")
        public String command;

        public static ListIdeNodesResponseBodyPagingInfoNodesScriptRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesScriptRuntime self = new ListIdeNodesResponseBodyPagingInfoNodesScriptRuntime();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesScriptRuntime setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesScript extends TeaModel {
        /**
         * <p>脚本的id</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>脚本路径</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>脚本的运行时信息</p>
         */
        @NameInMap("Runtime")
        public ListIdeNodesResponseBodyPagingInfoNodesScriptRuntime runtime;

        public static ListIdeNodesResponseBodyPagingInfoNodesScript build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesScript self = new ListIdeNodesResponseBodyPagingInfoNodesScript();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesScript setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesScript setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesScript setRuntime(ListIdeNodesResponseBodyPagingInfoNodesScriptRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListIdeNodesResponseBodyPagingInfoNodesScriptRuntime getRuntime() {
            return this.runtime;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesStrategy extends TeaModel {
        /**
         * <p>生成实例的模式</p>
         */
        @NameInMap("InstanceMode")
        public String instanceMode;

        /**
         * <p>重试时间间隔</p>
         */
        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        /**
         * <p>允许重跑的模式</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>重试次数</p>
         */
        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        /**
         * <p>超时时间</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static ListIdeNodesResponseBodyPagingInfoNodesStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesStrategy self = new ListIdeNodesResponseBodyPagingInfoNodesStrategy();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesStrategy setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
            return this;
        }
        public String getInstanceMode() {
            return this.instanceMode;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesStrategy setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesStrategy setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesStrategy setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesStrategy setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesTags extends TeaModel {
        /**
         * <p>标签键</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListIdeNodesResponseBodyPagingInfoNodesTags build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesTags self = new ListIdeNodesResponseBodyPagingInfoNodesTags();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodesTrigger extends TeaModel {
        /**
         * <p>触发器的cron表达式</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>结束时间，格式为yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>触发器id</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>开始时间，格式为yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>时区</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <p>触发器类型</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListIdeNodesResponseBodyPagingInfoNodesTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodesTrigger self = new ListIdeNodesResponseBodyPagingInfoNodesTrigger();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodesTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesTrigger setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesTrigger setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListIdeNodesResponseBodyPagingInfoNodesTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfoNodes extends TeaModel {
        /**
         * <p>节点的创建时间</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>数据源信息</p>
         */
        @NameInMap("DataSource")
        public ListIdeNodesResponseBodyPagingInfoNodesDataSource dataSource;

        /**
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        /**
         * <p>节点输入</p>
         */
        @NameInMap("Inputs")
        public ListIdeNodesResponseBodyPagingInfoNodesInputs inputs;

        /**
         * <p>属性修改时间</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>节点名</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>节点输出</p>
         */
        @NameInMap("Outputs")
        public ListIdeNodesResponseBodyPagingInfoNodesOutputs outputs;

        /**
         * <p>节点的责任人</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <p>资源组信息</p>
         */
        @NameInMap("RuntimeResource")
        public ListIdeNodesResponseBodyPagingInfoNodesRuntimeResource runtimeResource;

        /**
         * <p>工作流的脚本信息</p>
         */
        @NameInMap("Script")
        public ListIdeNodesResponseBodyPagingInfoNodesScript script;

        /**
         * <p>调度策略</p>
         */
        @NameInMap("Strategy")
        public ListIdeNodesResponseBodyPagingInfoNodesStrategy strategy;

        /**
         * <p>标签信息</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesTags> tags;

        /**
         * <p>调度任务Id</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>触发器信息</p>
         */
        @NameInMap("Trigger")
        public ListIdeNodesResponseBodyPagingInfoNodesTrigger trigger;

        public static ListIdeNodesResponseBodyPagingInfoNodes build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfoNodes self = new ListIdeNodesResponseBodyPagingInfoNodes();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setDataSource(ListIdeNodesResponseBodyPagingInfoNodesDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListIdeNodesResponseBodyPagingInfoNodesDataSource getDataSource() {
            return this.dataSource;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setInputs(ListIdeNodesResponseBodyPagingInfoNodesInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public ListIdeNodesResponseBodyPagingInfoNodesInputs getInputs() {
            return this.inputs;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setOutputs(ListIdeNodesResponseBodyPagingInfoNodesOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public ListIdeNodesResponseBodyPagingInfoNodesOutputs getOutputs() {
            return this.outputs;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setRuntimeResource(ListIdeNodesResponseBodyPagingInfoNodesRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListIdeNodesResponseBodyPagingInfoNodesRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setScript(ListIdeNodesResponseBodyPagingInfoNodesScript script) {
            this.script = script;
            return this;
        }
        public ListIdeNodesResponseBodyPagingInfoNodesScript getScript() {
            return this.script;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setStrategy(ListIdeNodesResponseBodyPagingInfoNodesStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public ListIdeNodesResponseBodyPagingInfoNodesStrategy getStrategy() {
            return this.strategy;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setTags(java.util.List<ListIdeNodesResponseBodyPagingInfoNodesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodesTags> getTags() {
            return this.tags;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListIdeNodesResponseBodyPagingInfoNodes setTrigger(ListIdeNodesResponseBodyPagingInfoNodesTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListIdeNodesResponseBodyPagingInfoNodesTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class ListIdeNodesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodes> nodes;

        @NameInMap("PageNumber")
        public String pageNumber;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TotalCount")
        public String totalCount;

        public static ListIdeNodesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListIdeNodesResponseBodyPagingInfo self = new ListIdeNodesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListIdeNodesResponseBodyPagingInfo setNodes(java.util.List<ListIdeNodesResponseBodyPagingInfoNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListIdeNodesResponseBodyPagingInfoNodes> getNodes() {
            return this.nodes;
        }

        public ListIdeNodesResponseBodyPagingInfo setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListIdeNodesResponseBodyPagingInfo setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListIdeNodesResponseBodyPagingInfo setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
