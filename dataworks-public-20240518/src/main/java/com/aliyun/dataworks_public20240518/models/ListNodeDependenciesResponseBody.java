// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListNodeDependenciesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListNodeDependenciesResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>204EAF68-CCE3-5112-8DA0-E7A60F02XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNodeDependenciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeDependenciesResponseBody self = new ListNodeDependenciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeDependenciesResponseBody setPagingInfo(ListNodeDependenciesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListNodeDependenciesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListNodeDependenciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesDataSource extends TeaModel {
        /**
         * <p>数据源名称</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>数据源类型</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesDataSource self = new ListNodeDependenciesResponseBodyPagingInfoNodesDataSource();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesInputsNodeOutputs extends TeaModel {
        /**
         * <p>节点输出</p>
         * 
         * <strong>example:</strong>
         * <p>860438872620113XXXX</p>
         */
        @NameInMap("Data")
        public String data;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesInputsNodeOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesInputsNodeOutputs self = new ListNodeDependenciesResponseBodyPagingInfoNodesInputsNodeOutputs();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsNodeOutputs setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesInputsTables extends TeaModel {
        /**
         * <p>表id</p>
         * 
         * <strong>example:</strong>
         * <p>odps.autotest.test_output_table_1</p>
         */
        @NameInMap("Guid")
        public String guid;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesInputsTables build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesInputsTables self = new ListNodeDependenciesResponseBodyPagingInfoNodesInputsTables();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsTables setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariablesNode extends TeaModel {
        /**
         * <p>节点输出</p>
         * 
         * <strong>example:</strong>
         * <p>860438872620113XXXX</p>
         */
        @NameInMap("Output")
        public String output;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariablesNode build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariablesNode self = new ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariablesNode();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariablesNode setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables extends TeaModel {
        /**
         * <p>制品类型</p>
         * 
         * <strong>example:</strong>
         * <p>Variable</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>变量id</p>
         * 
         * <strong>example:</strong>
         * <p>543218872620113XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>变量名</p>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>变量所属节点</p>
         */
        @NameInMap("Node")
        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariablesNode node;

        /**
         * <p>范围</p>
         * 
         * <strong>example:</strong>
         * <p>NodeParameter</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>类型</p>
         * 
         * <strong>example:</strong>
         * <p>Constant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>变量值</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables self = new ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables setNode(ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariablesNode node) {
            this.node = node;
            return this;
        }
        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariablesNode getNode() {
            return this.node;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesInputs extends TeaModel {
        /**
         * <p>节点输出列表</p>
         */
        @NameInMap("NodeOutputs")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesInputsNodeOutputs> nodeOutputs;

        /**
         * <p>表列表</p>
         */
        @NameInMap("Tables")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesInputsTables> tables;

        /**
         * <p>变量列表</p>
         */
        @NameInMap("Variables")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables> variables;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesInputs build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesInputs self = new ListNodeDependenciesResponseBodyPagingInfoNodesInputs();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputs setNodeOutputs(java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesInputsNodeOutputs> nodeOutputs) {
            this.nodeOutputs = nodeOutputs;
            return this;
        }
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesInputsNodeOutputs> getNodeOutputs() {
            return this.nodeOutputs;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputs setTables(java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesInputsTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesInputsTables> getTables() {
            return this.tables;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputs setVariables(java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesOutputsNodeOutputs extends TeaModel {
        /**
         * <p>节点输出</p>
         * 
         * <strong>example:</strong>
         * <p>463497880880954XXXX</p>
         */
        @NameInMap("Data")
        public String data;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesOutputsNodeOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesOutputsNodeOutputs self = new ListNodeDependenciesResponseBodyPagingInfoNodesOutputsNodeOutputs();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsNodeOutputs setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesOutputsTables extends TeaModel {
        /**
         * <p>表id</p>
         * 
         * <strong>example:</strong>
         * <p>odps.autotest.test_output_table_1</p>
         */
        @NameInMap("Guid")
        public String guid;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesOutputsTables build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesOutputsTables self = new ListNodeDependenciesResponseBodyPagingInfoNodesOutputsTables();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsTables setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariablesNode extends TeaModel {
        /**
         * <p>节点输出</p>
         * 
         * <strong>example:</strong>
         * <p>463497880880954XXXX</p>
         */
        @NameInMap("Output")
        public String output;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariablesNode build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariablesNode self = new ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariablesNode();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariablesNode setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables extends TeaModel {
        /**
         * <p>制品类型</p>
         * 
         * <strong>example:</strong>
         * <p>Variable</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>变量id</p>
         * 
         * <strong>example:</strong>
         * <p>543217824470354XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>变量名</p>
         * 
         * <strong>example:</strong>
         * <p>output</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>变量所属节点</p>
         */
        @NameInMap("Node")
        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariablesNode node;

        /**
         * <p>范围</p>
         * 
         * <strong>example:</strong>
         * <p>NodeParameter</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>类型</p>
         * 
         * <strong>example:</strong>
         * <p>Constant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>变量值</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables self = new ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables setNode(ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariablesNode node) {
            this.node = node;
            return this;
        }
        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariablesNode getNode() {
            return this.node;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesOutputs extends TeaModel {
        /**
         * <p>节点输出列表</p>
         */
        @NameInMap("NodeOutputs")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesOutputsNodeOutputs> nodeOutputs;

        /**
         * <p>表列表</p>
         */
        @NameInMap("Tables")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesOutputsTables> tables;

        /**
         * <p>变量列表</p>
         */
        @NameInMap("Variables")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables> variables;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesOutputs self = new ListNodeDependenciesResponseBodyPagingInfoNodesOutputs();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputs setNodeOutputs(java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesOutputsNodeOutputs> nodeOutputs) {
            this.nodeOutputs = nodeOutputs;
            return this;
        }
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesOutputsNodeOutputs> getNodeOutputs() {
            return this.nodeOutputs;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputs setTables(java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesOutputsTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesOutputsTables> getTables() {
            return this.tables;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputs setVariables(java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesRuntimeResource extends TeaModel {
        /**
         * <p>资源组id</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_XXXX_XXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesRuntimeResource self = new ListNodeDependenciesResponseBodyPagingInfoNodesRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesScriptRuntime extends TeaModel {
        /**
         * <p>脚本所属类型</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("Command")
        public String command;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesScriptRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesScriptRuntime self = new ListNodeDependenciesResponseBodyPagingInfoNodesScriptRuntime();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesScriptRuntime setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesScript extends TeaModel {
        /**
         * <p>脚本的id</p>
         * 
         * <strong>example:</strong>
         * <p>853573334108680XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>脚本路径</p>
         * 
         * <strong>example:</strong>
         * <p>root/demo</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>脚本的运行时信息</p>
         */
        @NameInMap("Runtime")
        public ListNodeDependenciesResponseBodyPagingInfoNodesScriptRuntime runtime;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesScript build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesScript self = new ListNodeDependenciesResponseBodyPagingInfoNodesScript();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesScript setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesScript setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesScript setRuntime(ListNodeDependenciesResponseBodyPagingInfoNodesScriptRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListNodeDependenciesResponseBodyPagingInfoNodesScriptRuntime getRuntime() {
            return this.runtime;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesStrategy extends TeaModel {
        /**
         * <p>生成实例的模式</p>
         * 
         * <strong>example:</strong>
         * <p>T+1</p>
         */
        @NameInMap("InstanceMode")
        public String instanceMode;

        /**
         * <p>重试时间间隔</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        /**
         * <p>允许重跑的模式</p>
         * 
         * <strong>example:</strong>
         * <p>Allowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>重试次数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        /**
         * <p>超时时间</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesStrategy self = new ListNodeDependenciesResponseBodyPagingInfoNodesStrategy();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesStrategy setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
            return this;
        }
        public String getInstanceMode() {
            return this.instanceMode;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesStrategy setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesStrategy setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesStrategy setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesStrategy setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesTags extends TeaModel {
        /**
         * <p>标签键</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesTags build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesTags self = new ListNodeDependenciesResponseBodyPagingInfoNodesTags();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesTrigger extends TeaModel {
        /**
         * <p>触发器的cron表达式</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>结束时间，格式为yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>9999-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>触发器id</p>
         * 
         * <strong>example:</strong>
         * <p>543680677872062XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>开始时间，格式为yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>时区</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <p>触发器类型</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListNodeDependenciesResponseBodyPagingInfoNodesTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodesTrigger self = new ListNodeDependenciesResponseBodyPagingInfoNodesTrigger();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesTrigger setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesTrigger setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodesTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodes extends TeaModel {
        /**
         * <p>节点的创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1724505917000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>数据源信息</p>
         */
        @NameInMap("DataSource")
        public ListNodeDependenciesResponseBodyPagingInfoNodesDataSource dataSource;

        /**
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>723932906364267XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>节点输入</p>
         */
        @NameInMap("Inputs")
        public ListNodeDependenciesResponseBodyPagingInfoNodesInputs inputs;

        /**
         * <p>属性修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>1724505917000</p>
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
        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputs outputs;

        /**
         * <p>节点的责任人</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>65133</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <p>资源组信息</p>
         */
        @NameInMap("RuntimeResource")
        public ListNodeDependenciesResponseBodyPagingInfoNodesRuntimeResource runtimeResource;

        /**
         * <p>工作流的脚本信息</p>
         */
        @NameInMap("Script")
        public ListNodeDependenciesResponseBodyPagingInfoNodesScript script;

        /**
         * <p>调度策略</p>
         */
        @NameInMap("Strategy")
        public ListNodeDependenciesResponseBodyPagingInfoNodesStrategy strategy;

        /**
         * <p>标签信息</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesTags> tags;

        /**
         * <p>调度任务Id</p>
         * 
         * <strong>example:</strong>
         * <p>580667964888595XXXX</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>触发器信息</p>
         */
        @NameInMap("Trigger")
        public ListNodeDependenciesResponseBodyPagingInfoNodesTrigger trigger;

        public static ListNodeDependenciesResponseBodyPagingInfoNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfoNodes self = new ListNodeDependenciesResponseBodyPagingInfoNodes();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setDataSource(ListNodeDependenciesResponseBodyPagingInfoNodesDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListNodeDependenciesResponseBodyPagingInfoNodesDataSource getDataSource() {
            return this.dataSource;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setInputs(ListNodeDependenciesResponseBodyPagingInfoNodesInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public ListNodeDependenciesResponseBodyPagingInfoNodesInputs getInputs() {
            return this.inputs;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setOutputs(ListNodeDependenciesResponseBodyPagingInfoNodesOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputs getOutputs() {
            return this.outputs;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setRuntimeResource(ListNodeDependenciesResponseBodyPagingInfoNodesRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListNodeDependenciesResponseBodyPagingInfoNodesRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setScript(ListNodeDependenciesResponseBodyPagingInfoNodesScript script) {
            this.script = script;
            return this;
        }
        public ListNodeDependenciesResponseBodyPagingInfoNodesScript getScript() {
            return this.script;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setStrategy(ListNodeDependenciesResponseBodyPagingInfoNodesStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public ListNodeDependenciesResponseBodyPagingInfoNodesStrategy getStrategy() {
            return this.strategy;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setTags(java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesTags> getTags() {
            return this.tags;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListNodeDependenciesResponseBodyPagingInfoNodes setTrigger(ListNodeDependenciesResponseBodyPagingInfoNodesTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListNodeDependenciesResponseBodyPagingInfoNodesTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodes> nodes;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static ListNodeDependenciesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDependenciesResponseBodyPagingInfo self = new ListNodeDependenciesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListNodeDependenciesResponseBodyPagingInfo setNodes(java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodes> getNodes() {
            return this.nodes;
        }

        public ListNodeDependenciesResponseBodyPagingInfo setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListNodeDependenciesResponseBodyPagingInfo setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListNodeDependenciesResponseBodyPagingInfo setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
