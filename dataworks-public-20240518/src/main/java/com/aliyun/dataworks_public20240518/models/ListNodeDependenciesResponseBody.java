// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListNodeDependenciesResponseBody extends TeaModel {
    /**
     * <p>The pagination settings.</p>
     */
    @NameInMap("PagingInfo")
    public ListNodeDependenciesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. Use this ID to locate logs and troubleshoot issues.</p>
     * 
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
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data source type.</p>
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
         * <p>The node output.</p>
         * 
         * <strong>example:</strong>
         * <p>860438872620113XXXX</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>A human-readable name for the node\&quot;s target data table. This identifier is for display purposes only and does not enforce logical constraints.</p>
         * 
         * <strong>example:</strong>
         * <p>testProject.testTableName</p>
         */
        @NameInMap("RefTableName")
        public String refTableName;

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

        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsNodeOutputs setRefTableName(String refTableName) {
            this.refTableName = refTableName;
            return this;
        }
        public String getRefTableName() {
            return this.refTableName;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesInputsTables extends TeaModel {
        /**
         * <p>The ID of the table.</p>
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
         * <p>The node output.</p>
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
         * <p>The artifact type.</p>
         * 
         * <strong>example:</strong>
         * <p>Variable</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>The ID of the variable.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The data type for this parameter is <code>Long</code> for SDKs earlier than v8.0.0 and <code>String</code> for SDK v8.0.0 and later. <strong>This change does not affect normal usage, as the parameter\&quot;s data type matches the SDK definition.</strong> However, upgrading from a pre-8.0.0 SDK version may cause a compilation error, requiring you to manually update the data type in your code.</p>
         * 
         * <strong>example:</strong>
         * <p>543218872620113XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The node to which the variable belongs.</p>
         */
        @NameInMap("Node")
        public ListNodeDependenciesResponseBodyPagingInfoNodesInputsVariablesNode node;

        /**
         * <p>The scope of the variable.</p>
         * <ul>
         * <li><p>NodeParameter</p>
         * </li>
         * <li><p>NodeContext</p>
         * </li>
         * <li><p>Workflow</p>
         * </li>
         * <li><p>Workspace</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NodeParameter</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The type of the variable.</p>
         * <ul>
         * <li><p>NoKvVariableExpression</p>
         * </li>
         * <li><p>Constant</p>
         * </li>
         * <li><p>PassThrough</p>
         * </li>
         * <li><p>System</p>
         * </li>
         * <li><p>NodeOutput</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Constant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the variable.</p>
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
         * <p>A list of node outputs.</p>
         */
        @NameInMap("NodeOutputs")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesInputsNodeOutputs> nodeOutputs;

        /**
         * <p>A list of tables.</p>
         */
        @NameInMap("Tables")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesInputsTables> tables;

        /**
         * <p>A list of variables.</p>
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
         * <p>The node output.</p>
         * 
         * <strong>example:</strong>
         * <p>463497880880954XXXX</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>A human-readable name for the node\&quot;s target data table. This identifier is for display purposes only and does not enforce logical constraints.</p>
         * 
         * <strong>example:</strong>
         * <p>testProject.testTableName</p>
         */
        @NameInMap("RefTableName")
        public String refTableName;

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

        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsNodeOutputs setRefTableName(String refTableName) {
            this.refTableName = refTableName;
            return this;
        }
        public String getRefTableName() {
            return this.refTableName;
        }

    }

    public static class ListNodeDependenciesResponseBodyPagingInfoNodesOutputsTables extends TeaModel {
        /**
         * <p>The ID of the table.</p>
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
         * <p>The node output that corresponds to the variable.</p>
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
         * <p>The artifact type.</p>
         * 
         * <strong>example:</strong>
         * <p>Variable</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>The ID of the variable.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The data type for this parameter is <code>Long</code> for SDKs earlier than v8.0.0 and <code>String</code> for SDK v8.0.0 and later. <strong>This change does not affect normal usage, as the parameter\&quot;s data type matches the SDK definition.</strong> However, upgrading from a pre-8.0.0 SDK version may cause a compilation error, requiring you to manually update the data type in your code.</p>
         * 
         * <strong>example:</strong>
         * <p>543217824470354XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>output</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The node to which the variable belongs.</p>
         */
        @NameInMap("Node")
        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputsVariablesNode node;

        /**
         * <p>The scope of the variable.</p>
         * <ul>
         * <li><p>NodeParameter</p>
         * </li>
         * <li><p>NodeContext</p>
         * </li>
         * <li><p>Workflow</p>
         * </li>
         * <li><p>Workspace</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NodeParameter</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The type of the variable.</p>
         * <ul>
         * <li><p>NoKvVariableExpression</p>
         * </li>
         * <li><p>Constant</p>
         * </li>
         * <li><p>PassThrough</p>
         * </li>
         * <li><p>System</p>
         * </li>
         * <li><p>NodeOutput</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Constant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the variable.</p>
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
         * <p>A list of node outputs.</p>
         */
        @NameInMap("NodeOutputs")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesOutputsNodeOutputs> nodeOutputs;

        /**
         * <p>A list of tables.</p>
         */
        @NameInMap("Tables")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesOutputsTables> tables;

        /**
         * <p>A list of variables.</p>
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
         * <p>The ID of the resource group.</p>
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
         * <p>The command that is used to distinguish between node types.</p>
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
         * <p>The ID of the script.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The data type for this parameter is <code>Long</code> for SDKs earlier than v8.0.0 and <code>String</code> for SDK v8.0.0 and later. <strong>This change does not affect normal usage, as the parameter\&quot;s data type matches the SDK definition.</strong> However, upgrading from a pre-8.0.0 SDK version may cause a compilation error, requiring you to manually update the data type in your code.</p>
         * 
         * <strong>example:</strong>
         * <p>853573334108680XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The path of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>root/demo</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The runtime environment.</p>
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
         * <p>The instance generation mode.</p>
         * <ul>
         * <li><p>T+1</p>
         * </li>
         * <li><p>Immediately</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T+1</p>
         */
        @NameInMap("InstanceMode")
        public String instanceMode;

        /**
         * <p>The retry interval after a failure, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        /**
         * <p>The rerun mode.</p>
         * <ul>
         * <li><p>Allowed</p>
         * </li>
         * <li><p>Denied</p>
         * </li>
         * <li><p>FailureAllowed</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The number of retries after a failure.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        /**
         * <p>The timeout period, in milliseconds.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
         * <p>The cron expression used for scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The time when scheduling expires, in <code>yyyy-MM-dd HH:mm:ss</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>9999-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The unique ID of the trigger.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The data type for this parameter is <code>Long</code> for SDKs earlier than v8.0.0 and <code>String</code> for SDK v8.0.0 and later. <strong>This change does not affect normal usage, as the parameter\&quot;s data type matches the SDK definition.</strong> However, upgrading from a pre-8.0.0 SDK version may cause a compilation error, requiring you to manually update the data type in your code.</p>
         * 
         * <strong>example:</strong>
         * <p>543680677872062XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when scheduling becomes effective, in <code>yyyy-MM-dd HH:mm:ss</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <p>The trigger type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>Scheduler</code>: Periodic scheduling.</p>
         * </li>
         * <li><p><code>Manual</code>: Manual scheduling.</p>
         * </li>
         * <li><p><code>Streaming</code>: Stream-based scheduling.</p>
         * </li>
         * </ul>
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
         * <p>The creation timestamp of the data development node.</p>
         * 
         * <strong>example:</strong>
         * <p>1724505917000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The data source.</p>
         */
        @NameInMap("DataSource")
        public ListNodeDependenciesResponseBodyPagingInfoNodesDataSource dataSource;

        /**
         * <p>The description of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Node description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the data development node.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The data type for this parameter is <code>Long</code> for SDKs earlier than v8.0.0 and <code>String</code> for SDK v8.0.0 and later. <strong>This change does not affect normal usage, as the parameter\&quot;s data type matches the SDK definition.</strong> However, upgrading from a pre-8.0.0 SDK version may cause a compilation error, requiring you to manually update the data type in your code.</p>
         * 
         * <strong>example:</strong>
         * <p>723932906364267XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Details about the node\&quot;s inputs.</p>
         */
        @NameInMap("Inputs")
        public ListNodeDependenciesResponseBodyPagingInfoNodesInputs inputs;

        /**
         * <p>The last modification timestamp of the data development node.</p>
         * 
         * <strong>example:</strong>
         * <p>1724505917000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the data development node.</p>
         * 
         * <strong>example:</strong>
         * <p>Node name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Details about the node\&quot;s outputs.</p>
         */
        @NameInMap("Outputs")
        public ListNodeDependenciesResponseBodyPagingInfoNodesOutputs outputs;

        /**
         * <p>The owner of the data development node.</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the project that contains the node.</p>
         * 
         * <strong>example:</strong>
         * <p>65133</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The execution mode of the node.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>Normal</code>: The node runs as normal.</p>
         * </li>
         * <li><p><code>Pause</code>: The node is paused. This action blocks the execution of downstream nodes that depend on this node.</p>
         * </li>
         * <li><p><code>Skip</code>: The node is skipped (dry run). The system immediately returns a success status with an execution time of 0 seconds. This action does not block downstream nodes or consume resources.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <p>Details about the resource group.</p>
         */
        @NameInMap("RuntimeResource")
        public ListNodeDependenciesResponseBodyPagingInfoNodesRuntimeResource runtimeResource;

        /**
         * <p>Details about the script.</p>
         */
        @NameInMap("Script")
        public ListNodeDependenciesResponseBodyPagingInfoNodesScript script;

        /**
         * <p>The scheduling strategy.</p>
         */
        @NameInMap("Strategy")
        public ListNodeDependenciesResponseBodyPagingInfoNodesStrategy strategy;

        /**
         * <p>A list of tags. This parameter is currently not in use.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodesTags> tags;

        /**
         * <p>The ID of the scheduling task.</p>
         * 
         * <strong>example:</strong>
         * <p>580667964888595XXXX</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The trigger.</p>
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

        public ListNodeDependenciesResponseBodyPagingInfoNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
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

        public ListNodeDependenciesResponseBodyPagingInfoNodes setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
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
        /**
         * <p>A list of dependent nodes.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<ListNodeDependenciesResponseBodyPagingInfoNodes> nodes;

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The total number of matching entries.</p>
         * 
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
