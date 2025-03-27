// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ExecuteAdhocWorkflowInstanceRequest extends TeaModel {
    /**
     * <p>The data timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("BizDate")
    public Long bizDate;

    /**
     * <p>The environment of the workspace. Valid values:</p>
     * <ul>
     * <li>Prod: production environment</li>
     * <li>Dev: development environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The name of the workflow instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WorkflowInstance1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The account ID of the owner.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tasks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ExecuteAdhocWorkflowInstanceRequestTasks> tasks;

    public static ExecuteAdhocWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAdhocWorkflowInstanceRequest self = new ExecuteAdhocWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAdhocWorkflowInstanceRequest setBizDate(Long bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public Long getBizDate() {
        return this.bizDate;
    }

    public ExecuteAdhocWorkflowInstanceRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ExecuteAdhocWorkflowInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExecuteAdhocWorkflowInstanceRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ExecuteAdhocWorkflowInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ExecuteAdhocWorkflowInstanceRequest setTasks(java.util.List<ExecuteAdhocWorkflowInstanceRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ExecuteAdhocWorkflowInstanceRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class ExecuteAdhocWorkflowInstanceRequestTasksDataSource extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static ExecuteAdhocWorkflowInstanceRequestTasksDataSource build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdhocWorkflowInstanceRequestTasksDataSource self = new ExecuteAdhocWorkflowInstanceRequestTasksDataSource();
            return TeaModel.build(map, self);
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ExecuteAdhocWorkflowInstanceRequestTasksDependencies extends TeaModel {
        /**
         * <p>The identifier of the output of the ancestor task.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("UpstreamOutput")
        public String upstreamOutput;

        public static ExecuteAdhocWorkflowInstanceRequestTasksDependencies build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdhocWorkflowInstanceRequestTasksDependencies self = new ExecuteAdhocWorkflowInstanceRequestTasksDependencies();
            return TeaModel.build(map, self);
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksDependencies setUpstreamOutput(String upstreamOutput) {
            this.upstreamOutput = upstreamOutput;
            return this;
        }
        public String getUpstreamOutput() {
            return this.upstreamOutput;
        }

    }

    public static class ExecuteAdhocWorkflowInstanceRequestTasksInputsVariables extends TeaModel {
        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the variable. You must configure this parameter in the <code>The ancestor output: The output variable name of the ancestor task</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>Value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ExecuteAdhocWorkflowInstanceRequestTasksInputsVariables build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdhocWorkflowInstanceRequestTasksInputsVariables self = new ExecuteAdhocWorkflowInstanceRequestTasksInputsVariables();
            return TeaModel.build(map, self);
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksInputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksInputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecuteAdhocWorkflowInstanceRequestTasksInputs extends TeaModel {
        /**
         * <p>The variables.</p>
         */
        @NameInMap("Variables")
        public java.util.List<ExecuteAdhocWorkflowInstanceRequestTasksInputsVariables> variables;

        public static ExecuteAdhocWorkflowInstanceRequestTasksInputs build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdhocWorkflowInstanceRequestTasksInputs self = new ExecuteAdhocWorkflowInstanceRequestTasksInputs();
            return TeaModel.build(map, self);
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksInputs setVariables(java.util.List<ExecuteAdhocWorkflowInstanceRequestTasksInputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ExecuteAdhocWorkflowInstanceRequestTasksInputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class ExecuteAdhocWorkflowInstanceRequestTasksOutputsTaskOutputs extends TeaModel {
        /**
         * <p>The identifier of the output.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("Output")
        public String output;

        public static ExecuteAdhocWorkflowInstanceRequestTasksOutputsTaskOutputs build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdhocWorkflowInstanceRequestTasksOutputsTaskOutputs self = new ExecuteAdhocWorkflowInstanceRequestTasksOutputsTaskOutputs();
            return TeaModel.build(map, self);
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksOutputsTaskOutputs setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class ExecuteAdhocWorkflowInstanceRequestTasksOutputsVariables extends TeaModel {
        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type. Valid values:</p>
         * <ul>
         * <li>System</li>
         * <li>Constant</li>
         * <li>NodeOutput</li>
         * <li>PassThrough</li>
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
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ExecuteAdhocWorkflowInstanceRequestTasksOutputsVariables build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdhocWorkflowInstanceRequestTasksOutputsVariables self = new ExecuteAdhocWorkflowInstanceRequestTasksOutputsVariables();
            return TeaModel.build(map, self);
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksOutputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksOutputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksOutputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecuteAdhocWorkflowInstanceRequestTasksOutputs extends TeaModel {
        /**
         * <p>The task outputs.</p>
         */
        @NameInMap("TaskOutputs")
        public java.util.List<ExecuteAdhocWorkflowInstanceRequestTasksOutputsTaskOutputs> taskOutputs;

        /**
         * <p>The variables.</p>
         */
        @NameInMap("Variables")
        public java.util.List<ExecuteAdhocWorkflowInstanceRequestTasksOutputsVariables> variables;

        public static ExecuteAdhocWorkflowInstanceRequestTasksOutputs build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdhocWorkflowInstanceRequestTasksOutputs self = new ExecuteAdhocWorkflowInstanceRequestTasksOutputs();
            return TeaModel.build(map, self);
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksOutputs setTaskOutputs(java.util.List<ExecuteAdhocWorkflowInstanceRequestTasksOutputsTaskOutputs> taskOutputs) {
            this.taskOutputs = taskOutputs;
            return this;
        }
        public java.util.List<ExecuteAdhocWorkflowInstanceRequestTasksOutputsTaskOutputs> getTaskOutputs() {
            return this.taskOutputs;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksOutputs setVariables(java.util.List<ExecuteAdhocWorkflowInstanceRequestTasksOutputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ExecuteAdhocWorkflowInstanceRequestTasksOutputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class ExecuteAdhocWorkflowInstanceRequestTasksRuntimeResource extends TeaModel {
        /**
         * <p>The default number of compute units (CUs) configured for task running.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <p>The ID of the image configured for task running.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The ID of the resource group for scheduling configured for task running.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ExecuteAdhocWorkflowInstanceRequestTasksRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdhocWorkflowInstanceRequestTasksRuntimeResource self = new ExecuteAdhocWorkflowInstanceRequestTasksRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ExecuteAdhocWorkflowInstanceRequestTasksScript extends TeaModel {
        /**
         * <p>The script content.</p>
         * 
         * <strong>example:</strong>
         * <p>echo &quot;helloWorld&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The script parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>para1=$bizdate</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        public static ExecuteAdhocWorkflowInstanceRequestTasksScript build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdhocWorkflowInstanceRequestTasksScript self = new ExecuteAdhocWorkflowInstanceRequestTasksScript();
            return TeaModel.build(map, self);
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksScript setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasksScript setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

    }

    public static class ExecuteAdhocWorkflowInstanceRequestTasks extends TeaModel {
        /**
         * <p>The unique code of the client. This code uniquely identifies a task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Task_0bc5213917368545132902xxxxxxxx</p>
         */
        @NameInMap("ClientUniqueCode")
        public String clientUniqueCode;

        /**
         * <p>The information about the associated data source.</p>
         */
        @NameInMap("DataSource")
        public ExecuteAdhocWorkflowInstanceRequestTasksDataSource dataSource;

        /**
         * <p>The dependency information.</p>
         */
        @NameInMap("Dependencies")
        public java.util.List<ExecuteAdhocWorkflowInstanceRequestTasksDependencies> dependencies;

        /**
         * <p>The input information.</p>
         */
        @NameInMap("Inputs")
        public ExecuteAdhocWorkflowInstanceRequestTasksInputs inputs;

        /**
         * <p>The name of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL node.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output information.</p>
         */
        @NameInMap("Outputs")
        public ExecuteAdhocWorkflowInstanceRequestTasksOutputs outputs;

        /**
         * <p>The account ID of the owner.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The configurations of the runtime environment, such as the resource group information.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuntimeResource")
        public ExecuteAdhocWorkflowInstanceRequestTasksRuntimeResource runtimeResource;

        /**
         * <p>The script information.</p>
         */
        @NameInMap("Script")
        public ExecuteAdhocWorkflowInstanceRequestTasksScript script;

        /**
         * <p>The timeout period of task running. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The type of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ExecuteAdhocWorkflowInstanceRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdhocWorkflowInstanceRequestTasks self = new ExecuteAdhocWorkflowInstanceRequestTasks();
            return TeaModel.build(map, self);
        }

        public ExecuteAdhocWorkflowInstanceRequestTasks setClientUniqueCode(String clientUniqueCode) {
            this.clientUniqueCode = clientUniqueCode;
            return this;
        }
        public String getClientUniqueCode() {
            return this.clientUniqueCode;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasks setDataSource(ExecuteAdhocWorkflowInstanceRequestTasksDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ExecuteAdhocWorkflowInstanceRequestTasksDataSource getDataSource() {
            return this.dataSource;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasks setDependencies(java.util.List<ExecuteAdhocWorkflowInstanceRequestTasksDependencies> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<ExecuteAdhocWorkflowInstanceRequestTasksDependencies> getDependencies() {
            return this.dependencies;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasks setInputs(ExecuteAdhocWorkflowInstanceRequestTasksInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public ExecuteAdhocWorkflowInstanceRequestTasksInputs getInputs() {
            return this.inputs;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasks setOutputs(ExecuteAdhocWorkflowInstanceRequestTasksOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public ExecuteAdhocWorkflowInstanceRequestTasksOutputs getOutputs() {
            return this.outputs;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasks setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasks setRuntimeResource(ExecuteAdhocWorkflowInstanceRequestTasksRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ExecuteAdhocWorkflowInstanceRequestTasksRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasks setScript(ExecuteAdhocWorkflowInstanceRequestTasksScript script) {
            this.script = script;
            return this;
        }
        public ExecuteAdhocWorkflowInstanceRequestTasksScript getScript() {
            return this.script;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ExecuteAdhocWorkflowInstanceRequestTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
