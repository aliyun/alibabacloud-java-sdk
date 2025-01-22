// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the task.</p>
     */
    @NameInMap("Task")
    public GetTaskResponseBodyTask task;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setTask(GetTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetTaskResponseBodyTaskDataSource extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetTaskResponseBodyTaskDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskDataSource self = new GetTaskResponseBodyTaskDataSource();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetTaskResponseBodyTaskDependencies extends TeaModel {
        /**
         * <p>The dependency type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CrossCycleDependsOnChildren: cross-cycle dependency on the level-1 descendant nodes of a node</li>
         * <li>CrossCycleDependsOnSelf: cross-cycle dependency on the current node</li>
         * <li>CrossCycleDependsOnOtherNode: cross-cycle dependency on other nodes</li>
         * <li>Normal: same-cycle dependency</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>上游任务的输出标识符。（<code>同周期依赖</code>返回此字段）</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("UpstreamOutput")
        public String upstreamOutput;

        /**
         * <p>上游任务的Id。（<code>跨周期依赖其他节点</code>依赖返回此字段，其他跨周期依赖类型不返回）</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("UpstreamTaskId")
        public String upstreamTaskId;

        public static GetTaskResponseBodyTaskDependencies build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskDependencies self = new GetTaskResponseBodyTaskDependencies();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskDependencies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskResponseBodyTaskDependencies setUpstreamOutput(String upstreamOutput) {
            this.upstreamOutput = upstreamOutput;
            return this;
        }
        public String getUpstreamOutput() {
            return this.upstreamOutput;
        }

        public GetTaskResponseBodyTaskDependencies setUpstreamTaskId(String upstreamTaskId) {
            this.upstreamTaskId = upstreamTaskId;
            return this;
        }
        public String getUpstreamTaskId() {
            return this.upstreamTaskId;
        }

    }

    public static class GetTaskResponseBodyTaskInputsVariables extends TeaModel {
        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Constant: constant</li>
         * <li>PassThrough: parameter pass-through</li>
         * <li>System: variable</li>
         * <li>NodeOutput: script output</li>
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
         * <p>Value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTaskResponseBodyTaskInputsVariables build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskInputsVariables self = new GetTaskResponseBodyTaskInputsVariables();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskInputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskResponseBodyTaskInputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskResponseBodyTaskInputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTaskResponseBodyTaskInputs extends TeaModel {
        /**
         * <p>The variables.</p>
         */
        @NameInMap("Variables")
        public java.util.List<GetTaskResponseBodyTaskInputsVariables> variables;

        public static GetTaskResponseBodyTaskInputs build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskInputs self = new GetTaskResponseBodyTaskInputs();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskInputs setVariables(java.util.List<GetTaskResponseBodyTaskInputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskInputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class GetTaskResponseBodyTaskOutputsTaskOutputs extends TeaModel {
        /**
         * <p>The identifier of the output.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("Output")
        public String output;

        public static GetTaskResponseBodyTaskOutputsTaskOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskOutputsTaskOutputs self = new GetTaskResponseBodyTaskOutputsTaskOutputs();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskOutputsTaskOutputs setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class GetTaskResponseBodyTaskOutputsVariables extends TeaModel {
        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Constant: constant</li>
         * <li>PassThrough: parameter pass-through</li>
         * <li>System: system variable</li>
         * <li>NodeOutput: script output</li>
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

        public static GetTaskResponseBodyTaskOutputsVariables build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskOutputsVariables self = new GetTaskResponseBodyTaskOutputsVariables();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskOutputsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskResponseBodyTaskOutputsVariables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskResponseBodyTaskOutputsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTaskResponseBodyTaskOutputs extends TeaModel {
        /**
         * <p>The task outputs.</p>
         */
        @NameInMap("TaskOutputs")
        public java.util.List<GetTaskResponseBodyTaskOutputsTaskOutputs> taskOutputs;

        /**
         * <p>The variables.</p>
         */
        @NameInMap("Variables")
        public java.util.List<GetTaskResponseBodyTaskOutputsVariables> variables;

        public static GetTaskResponseBodyTaskOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskOutputs self = new GetTaskResponseBodyTaskOutputs();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskOutputs setTaskOutputs(java.util.List<GetTaskResponseBodyTaskOutputsTaskOutputs> taskOutputs) {
            this.taskOutputs = taskOutputs;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskOutputsTaskOutputs> getTaskOutputs() {
            return this.taskOutputs;
        }

        public GetTaskResponseBodyTaskOutputs setVariables(java.util.List<GetTaskResponseBodyTaskOutputsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskOutputsVariables> getVariables() {
            return this.variables;
        }

    }

    public static class GetTaskResponseBodyTaskRuntimeResource extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetTaskResponseBodyTaskRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskRuntimeResource self = new GetTaskResponseBodyTaskRuntimeResource();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public GetTaskResponseBodyTaskRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetTaskResponseBodyTaskRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class GetTaskResponseBodyTaskScript extends TeaModel {
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

        public static GetTaskResponseBodyTaskScript build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskScript self = new GetTaskResponseBodyTaskScript();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskScript setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTaskResponseBodyTaskScript setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

    }

    public static class GetTaskResponseBodyTaskSubTasksSubTasksDataSource extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetTaskResponseBodyTaskSubTasksSubTasksDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskSubTasksSubTasksDataSource self = new GetTaskResponseBodyTaskSubTasksSubTasksDataSource();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource extends TeaModel {
        /**
         * <p>The default number of CUs configured for task running.</p>
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
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource self = new GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class GetTaskResponseBodyTaskSubTasksSubTasksTrigger extends TeaModel {
        /**
         * <p>The CRON expression of the task. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The end time of the time range during which the task is periodically scheduled. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>9999-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The running mode of the task after it is triggered. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Pause</li>
         * <li>Skip</li>
         * <li>Normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <p>The start time of the time range during which the task is periodically scheduled. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The trigger type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Scheduler: scheduling cycle-based trigger</li>
         * <li>Manual: manual trigger</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetTaskResponseBodyTaskSubTasksSubTasksTrigger build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskSubTasksSubTasksTrigger self = new GetTaskResponseBodyTaskSubTasksSubTasksTrigger();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTaskResponseBodyTaskSubTasksSubTasks extends TeaModel {
        /**
         * <p>The baseline ID.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The account ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The information about the associated data source.</p>
         */
        @NameInMap("DataSource")
        public GetTaskResponseBodyTaskSubTasksSubTasksDataSource dataSource;

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The account ID of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name of the task.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The account ID of the task owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the task. Valid values: 1 to 8. A larger value indicates a higher priority. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The environment of the workspace.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Prod: production environment</li>
         * <li>Dev: development environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("ProjectEnv")
        @Deprecated
        public String projectEnv;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The rerun interval. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        /**
         * <p>The rerun mode.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AllDenied: The task cannot be rerun regardless of whether it is successfully run or fails to run.</li>
         * <li>FailureAllowed: The task can be rerun only after it fails to run.</li>
         * <li>AllAllowed: The task can be rerun regardless of whether it is successfully run or fails to run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The number of times that the task is rerun. This parameter takes effect only if the RerunMode parameter is set to AllAllowed or FailureAllowed.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        /**
         * <p>The runtime environment configuration of the task, such as the resource group.</p>
         */
        @NameInMap("RuntimeResource")
        public GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource runtimeResource;

        /**
         * <p>The timeout period of task running. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The method to trigger task scheduling.</p>
         */
        @NameInMap("Trigger")
        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger trigger;

        /**
         * <p>The type of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the workflow to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        public static GetTaskResponseBodyTaskSubTasksSubTasks build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskSubTasksSubTasks self = new GetTaskResponseBodyTaskSubTasksSubTasks();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setDataSource(GetTaskResponseBodyTaskSubTasksSubTasksDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public GetTaskResponseBodyTaskSubTasksSubTasksDataSource getDataSource() {
            return this.dataSource;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        @Deprecated
        public GetTaskResponseBodyTaskSubTasksSubTasks setProjectEnv(String projectEnv) {
            this.projectEnv = projectEnv;
            return this;
        }
        public String getProjectEnv() {
            return this.projectEnv;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setRuntimeResource(GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public GetTaskResponseBodyTaskSubTasksSubTasksRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setTrigger(GetTaskResponseBodyTaskSubTasksSubTasksTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public GetTaskResponseBodyTaskSubTasksSubTasksTrigger getTrigger() {
            return this.trigger;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskResponseBodyTaskSubTasksSubTasks setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class GetTaskResponseBodyTaskSubTasks extends TeaModel {
        /**
         * <p>The subtasks.</p>
         */
        @NameInMap("SubTasks")
        public java.util.List<GetTaskResponseBodyTaskSubTasksSubTasks> subTasks;

        /**
         * <p>The type of the subtask.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DoWhile: do-while node</li>
         * <li>Combined: node group</li>
         * <li>ForEach: for-each node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Combined</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetTaskResponseBodyTaskSubTasks build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskSubTasks self = new GetTaskResponseBodyTaskSubTasks();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskSubTasks setSubTasks(java.util.List<GetTaskResponseBodyTaskSubTasksSubTasks> subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskSubTasksSubTasks> getSubTasks() {
            return this.subTasks;
        }

        public GetTaskResponseBodyTaskSubTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTaskResponseBodyTaskTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTaskResponseBodyTaskTags build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskTags self = new GetTaskResponseBodyTaskTags();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTaskResponseBodyTaskTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTaskResponseBodyTaskTrigger extends TeaModel {
        /**
         * <p>The CRON expression of the task. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The end time of the time range during which the task is periodically scheduled. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>9999-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The running mode of the task after it is triggered. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Pause</li>
         * <li>Skip</li>
         * <li>Normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <p>The start time of the time range during which the task is periodically scheduled. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The trigger type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Scheduler: scheduling cycle-based trigger</li>
         * <li>Manual: manual trigger</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetTaskResponseBodyTaskTrigger build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskTrigger self = new GetTaskResponseBodyTaskTrigger();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetTaskResponseBodyTaskTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetTaskResponseBodyTaskTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public GetTaskResponseBodyTaskTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetTaskResponseBodyTaskTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTaskResponseBodyTask extends TeaModel {
        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The account ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The information about the associated data source.</p>
         */
        @NameInMap("DataSource")
        public GetTaskResponseBodyTaskDataSource dataSource;

        /**
         * <p>The dependency information.</p>
         */
        @NameInMap("Dependencies")
        public java.util.List<GetTaskResponseBodyTaskDependencies> dependencies;

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The input information.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("Inputs")
        public GetTaskResponseBodyTaskInputs inputs;

        /**
         * <p>实例生成模式。</p>
         * <p>T+1（第二天生成）</p>
         * <p>Immediately（立即生成）</p>
         * 
         * <strong>example:</strong>
         * <p>T+1</p>
         */
        @NameInMap("InstanceMode")
        public String instanceMode;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The account ID of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name of the task.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output information.</p>
         */
        @NameInMap("Outputs")
        public GetTaskResponseBodyTaskOutputs outputs;

        /**
         * <p>The account ID of the task owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the task. Valid values: 1 to 8. A larger value indicates a higher priority. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The environment of the workspace.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Prod: production environment</li>
         * <li>Dev: development environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("ProjectEnv")
        @Deprecated
        public String projectEnv;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The rerun interval. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        /**
         * <p>The rerun mode.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AllDenied: The task cannot be rerun regardless of whether the task is successfully run or fails to run.</li>
         * <li>FailureAllowed: The task can be rerun only after it fails to run.</li>
         * <li>AllAllowed: The task can be rerun regardless of whether it is successfully run or fails to run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The number of times that the task is rerun. This parameter takes effect only if the RerunMode parameter is set to AllAllowed or FailureAllowed.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        /**
         * <p>The configurations of the runtime environment, such as the resource group information.</p>
         */
        @NameInMap("RuntimeResource")
        public GetTaskResponseBodyTaskRuntimeResource runtimeResource;

        /**
         * <p>The script information.</p>
         */
        @NameInMap("Script")
        public GetTaskResponseBodyTaskScript script;

        /**
         * <p>The configurations of the subtasks, such as a do-while node.</p>
         */
        @NameInMap("SubTasks")
        public GetTaskResponseBodyTaskSubTasks subTasks;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetTaskResponseBodyTaskTags> tags;

        /**
         * <p>The timeout period of task running. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The method to trigger task scheduling.</p>
         */
        @NameInMap("Trigger")
        public GetTaskResponseBodyTaskTrigger trigger;

        /**
         * <p>The type of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        public static GetTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTask self = new GetTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTask setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetTaskResponseBodyTask setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTaskResponseBodyTask setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetTaskResponseBodyTask setDataSource(GetTaskResponseBodyTaskDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public GetTaskResponseBodyTaskDataSource getDataSource() {
            return this.dataSource;
        }

        public GetTaskResponseBodyTask setDependencies(java.util.List<GetTaskResponseBodyTaskDependencies> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskDependencies> getDependencies() {
            return this.dependencies;
        }

        public GetTaskResponseBodyTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTaskResponseBodyTask setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetTaskResponseBodyTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTaskResponseBodyTask setInputs(GetTaskResponseBodyTaskInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public GetTaskResponseBodyTaskInputs getInputs() {
            return this.inputs;
        }

        public GetTaskResponseBodyTask setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
            return this;
        }
        public String getInstanceMode() {
            return this.instanceMode;
        }

        public GetTaskResponseBodyTask setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetTaskResponseBodyTask setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetTaskResponseBodyTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskResponseBodyTask setOutputs(GetTaskResponseBodyTaskOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public GetTaskResponseBodyTaskOutputs getOutputs() {
            return this.outputs;
        }

        public GetTaskResponseBodyTask setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTaskResponseBodyTask setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        @Deprecated
        public GetTaskResponseBodyTask setProjectEnv(String projectEnv) {
            this.projectEnv = projectEnv;
            return this;
        }
        public String getProjectEnv() {
            return this.projectEnv;
        }

        public GetTaskResponseBodyTask setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTaskResponseBodyTask setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public GetTaskResponseBodyTask setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public GetTaskResponseBodyTask setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public GetTaskResponseBodyTask setRuntimeResource(GetTaskResponseBodyTaskRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public GetTaskResponseBodyTaskRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public GetTaskResponseBodyTask setScript(GetTaskResponseBodyTaskScript script) {
            this.script = script;
            return this;
        }
        public GetTaskResponseBodyTaskScript getScript() {
            return this.script;
        }

        public GetTaskResponseBodyTask setSubTasks(GetTaskResponseBodyTaskSubTasks subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public GetTaskResponseBodyTaskSubTasks getSubTasks() {
            return this.subTasks;
        }

        public GetTaskResponseBodyTask setTags(java.util.List<GetTaskResponseBodyTaskTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskTags> getTags() {
            return this.tags;
        }

        public GetTaskResponseBodyTask setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetTaskResponseBodyTask setTrigger(GetTaskResponseBodyTaskTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public GetTaskResponseBodyTaskTrigger getTrigger() {
            return this.trigger;
        }

        public GetTaskResponseBodyTask setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskResponseBodyTask setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

}
