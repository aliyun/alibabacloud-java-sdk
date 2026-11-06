// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetWorkflowResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the workflow.</p>
     */
    @NameInMap("Workflow")
    public GetWorkflowResponseBodyWorkflow workflow;

    public static GetWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowResponseBody self = new GetWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowResponseBody setWorkflow(GetWorkflowResponseBodyWorkflow workflow) {
        this.workflow = workflow;
        return this;
    }
    public GetWorkflowResponseBodyWorkflow getWorkflow() {
        return this.workflow;
    }

    public static class GetWorkflowResponseBodyWorkflowDependencies extends TeaModel {
        /**
         * <p>The dependency type. Valid values:</p>
         * <ul>
         * <li>CrossCycleDependsOnChildren: cross-cycle dependency on first-level child nodes</li>
         * <li>CrossCycleDependsOnSelf: cross-cycle dependency on the node itself</li>
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
         * <p>The output identifier of the upstream task. This field is returned when the dependency type is same-cycle dependency and the input content is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("UpstreamOutput")
        public String upstreamOutput;

        /**
         * <p>The ID of the upstream task. This field is returned when the dependency type is cross-cycle dependency on other nodes or same-cycle dependency without input content configured. It is not returned in other cases.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("UpstreamTaskId")
        public Long upstreamTaskId;

        public static GetWorkflowResponseBodyWorkflowDependencies build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowDependencies self = new GetWorkflowResponseBodyWorkflowDependencies();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowDependencies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWorkflowResponseBodyWorkflowDependencies setUpstreamOutput(String upstreamOutput) {
            this.upstreamOutput = upstreamOutput;
            return this;
        }
        public String getUpstreamOutput() {
            return this.upstreamOutput;
        }

        public GetWorkflowResponseBodyWorkflowDependencies setUpstreamTaskId(Long upstreamTaskId) {
            this.upstreamTaskId = upstreamTaskId;
            return this;
        }
        public Long getUpstreamTaskId() {
            return this.upstreamTaskId;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowOutputsTaskOutputs extends TeaModel {
        /**
         * <p>The output identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>pre.odps_sql_demo_0</p>
         */
        @NameInMap("Output")
        public String output;

        public static GetWorkflowResponseBodyWorkflowOutputsTaskOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowOutputsTaskOutputs self = new GetWorkflowResponseBodyWorkflowOutputsTaskOutputs();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowOutputsTaskOutputs setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowOutputs extends TeaModel {
        /**
         * <p>The list of task output definitions.</p>
         */
        @NameInMap("TaskOutputs")
        public java.util.List<GetWorkflowResponseBodyWorkflowOutputsTaskOutputs> taskOutputs;

        public static GetWorkflowResponseBodyWorkflowOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowOutputs self = new GetWorkflowResponseBodyWorkflowOutputs();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowOutputs setTaskOutputs(java.util.List<GetWorkflowResponseBodyWorkflowOutputsTaskOutputs> taskOutputs) {
            this.taskOutputs = taskOutputs;
            return this;
        }
        public java.util.List<GetWorkflowResponseBodyWorkflowOutputsTaskOutputs> getTaskOutputs() {
            return this.taskOutputs;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowTags extends TeaModel {
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

        public static GetWorkflowResponseBodyWorkflowTags build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowTags self = new GetWorkflowResponseBodyWorkflowTags();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetWorkflowResponseBodyWorkflowTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowTasksDataSource extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetWorkflowResponseBodyWorkflowTasksDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowTasksDataSource self = new GetWorkflowResponseBodyWorkflowTasksDataSource();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowTasksDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowTasksRuntimeResource extends TeaModel {
        /**
         * <p>The CU consumption configured for task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <p>The ID of the image configured for task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The identifier of the resource group for scheduling configured for task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetWorkflowResponseBodyWorkflowTasksRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowTasksRuntimeResource self = new GetWorkflowResponseBodyWorkflowTasksRuntimeResource();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowTasksRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public GetWorkflowResponseBodyWorkflowTasksRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetWorkflowResponseBodyWorkflowTasksRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowTasks extends TeaModel {
        /**
         * <p>The ID of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The client unique code of the task, which is used to implement asynchronous and idempotent operations. If you do not specify this parameter when creating the task, the system automatically generates a code and uniquely binds it to the resource ID. If you specify this parameter when updating or deleting the resource, it must be the same as the client unique code used during creation.</p>
         * 
         * <strong>example:</strong>
         * <p>Task_0bc5213917368545132902xxxxxxxx</p>
         */
        @NameInMap("ClientUniqueCode")
        public String clientUniqueCode;

        /**
         * <p>The creation time.</p>
         * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The account ID of the user who created the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The associated data source information.</p>
         */
        @NameInMap("DataSource")
        public GetWorkflowResponseBodyWorkflowTasksDataSource dataSource;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The project environment. Valid values:</p>
         * <ul>
         * <li>Prod: Production environment.</li>
         * <li>Dev: Development environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The update time.</p>
         * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The account ID of the user who updated the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL node</p>
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
         * <p>The ID of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The retry time interval, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        /**
         * <p>The configuration that specifies whether the task can be rerun. Valid values:</p>
         * <ul>
         * <li>AllDenied: The task cannot be rerun regardless of whether it succeeds or fails.</li>
         * <li>FailureAllowed: The task can be rerun only when it fails.</li>
         * <li>AllAllowed: The task can be rerun regardless of whether it succeeds or fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The number of retries. This parameter takes effect only when the task is configured to be rerunnable.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        /**
         * <p>The runtime environment configuration, such as the resource group information.</p>
         */
        @NameInMap("RuntimeResource")
        public GetWorkflowResponseBodyWorkflowTasksRuntimeResource runtimeResource;

        /**
         * <p>The timeout period for task execution, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The running mode when the trigger is fired. Valid values:</p>
         * <ul>
         * <li>Pause: paused</li>
         * <li>Skip: dry run</li>
         * <li>Normal: normal execution</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("TriggerRecurrence")
        public String triggerRecurrence;

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

        public static GetWorkflowResponseBodyWorkflowTasks build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowTasks self = new GetWorkflowResponseBodyWorkflowTasks();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowTasks setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetWorkflowResponseBodyWorkflowTasks setClientUniqueCode(String clientUniqueCode) {
            this.clientUniqueCode = clientUniqueCode;
            return this;
        }
        public String getClientUniqueCode() {
            return this.clientUniqueCode;
        }

        public GetWorkflowResponseBodyWorkflowTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetWorkflowResponseBodyWorkflowTasks setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetWorkflowResponseBodyWorkflowTasks setDataSource(GetWorkflowResponseBodyWorkflowTasksDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public GetWorkflowResponseBodyWorkflowTasksDataSource getDataSource() {
            return this.dataSource;
        }

        public GetWorkflowResponseBodyWorkflowTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkflowResponseBodyWorkflowTasks setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetWorkflowResponseBodyWorkflowTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWorkflowResponseBodyWorkflowTasks setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetWorkflowResponseBodyWorkflowTasks setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetWorkflowResponseBodyWorkflowTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowResponseBodyWorkflowTasks setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetWorkflowResponseBodyWorkflowTasks setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetWorkflowResponseBodyWorkflowTasks setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetWorkflowResponseBodyWorkflowTasks setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public GetWorkflowResponseBodyWorkflowTasks setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public GetWorkflowResponseBodyWorkflowTasks setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public GetWorkflowResponseBodyWorkflowTasks setRuntimeResource(GetWorkflowResponseBodyWorkflowTasksRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public GetWorkflowResponseBodyWorkflowTasksRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public GetWorkflowResponseBodyWorkflowTasks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetWorkflowResponseBodyWorkflowTasks setTriggerRecurrence(String triggerRecurrence) {
            this.triggerRecurrence = triggerRecurrence;
            return this;
        }
        public String getTriggerRecurrence() {
            return this.triggerRecurrence;
        }

        public GetWorkflowResponseBodyWorkflowTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWorkflowResponseBodyWorkflowTasks setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class GetWorkflowResponseBodyWorkflowTrigger extends TeaModel {
        /**
         * <p>The cron expression. This parameter takes effect only when Type is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The expiration time of the periodic trigger. This parameter takes effect only when Type is set to Scheduler.</p>
         * <p>The format is <code>yyyy-MM-dd HH:mm:ss</code>, such as <code>1970-01-01 00:00:00</code>. The example does not include a time zone identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The running mode when the trigger is fired. This parameter takes effect only when Type is set to Scheduler. Valid values:</p>
         * <ul>
         * <li>Pause: paused</li>
         * <li>Skip: dry run</li>
         * <li>Normal: normal execution</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <p>The time when periodic triggering takes effect. This parameter takes effect only when Type is set to Scheduler.</p>
         * <p>The format is <code>yyyy-MM-dd HH:mm:ss</code>, such as <code>1970-01-01 00:00:00</code>. The example does not include a time zone identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The type of the trigger method. Valid values:</p>
         * <ul>
         * <li>Scheduler: triggered by a scheduling cycle</li>
         * <li>Manual: triggered manually</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetWorkflowResponseBodyWorkflowTrigger build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowTrigger self = new GetWorkflowResponseBodyWorkflowTrigger();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetWorkflowResponseBodyWorkflowTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetWorkflowResponseBodyWorkflowTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public GetWorkflowResponseBodyWorkflowTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetWorkflowResponseBodyWorkflowTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetWorkflowResponseBodyWorkflow extends TeaModel {
        /**
         * <p>The client unique code of the workflow, which is used to implement asynchronous and idempotent operations. If you do not specify this parameter when creating the workflow, the system automatically generates a code and uniquely binds it to the resource ID. If you specify this parameter when updating or deleting the resource, it must be the same as the client unique code used during creation.</p>
         * 
         * <strong>example:</strong>
         * <p>Workflow_0bc5213917368545132902xxxxxxxx</p>
         */
        @NameInMap("ClientUniqueCode")
        public String clientUniqueCode;

        /**
         * <p>The creation time.</p>
         * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The account ID of the user who created the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The dependency information.</p>
         */
        @NameInMap("Dependencies")
        public java.util.List<GetWorkflowResponseBodyWorkflowDependencies> dependencies;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test workflow</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The project environment. Valid values:</p>
         * <ul>
         * <li>Prod: Production environment.</li>
         * <li>Dev: Development environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The unique identifier of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The update time.</p>
         * <p>The value is a 13-digit number, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The account ID of the user who updated the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Workflow</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output information.</p>
         */
        @NameInMap("Outputs")
        public GetWorkflowResponseBodyWorkflowOutputs outputs;

        /**
         * <p>The account ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The list of parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>para1=$bizdate para2=$[yyyymmdd]</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The ID of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetWorkflowResponseBodyWorkflowTags> tags;

        /**
         * <p>The list of tasks.</p>
         */
        @NameInMap("Tasks")
        public java.util.List<GetWorkflowResponseBodyWorkflowTasks> tasks;

        /**
         * <p>The trigger configuration.</p>
         */
        @NameInMap("Trigger")
        public GetWorkflowResponseBodyWorkflowTrigger trigger;

        public static GetWorkflowResponseBodyWorkflow build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflow self = new GetWorkflowResponseBodyWorkflow();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflow setClientUniqueCode(String clientUniqueCode) {
            this.clientUniqueCode = clientUniqueCode;
            return this;
        }
        public String getClientUniqueCode() {
            return this.clientUniqueCode;
        }

        public GetWorkflowResponseBodyWorkflow setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetWorkflowResponseBodyWorkflow setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetWorkflowResponseBodyWorkflow setDependencies(java.util.List<GetWorkflowResponseBodyWorkflowDependencies> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<GetWorkflowResponseBodyWorkflowDependencies> getDependencies() {
            return this.dependencies;
        }

        public GetWorkflowResponseBodyWorkflow setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkflowResponseBodyWorkflow setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetWorkflowResponseBodyWorkflow setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWorkflowResponseBodyWorkflow setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetWorkflowResponseBodyWorkflow setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetWorkflowResponseBodyWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowResponseBodyWorkflow setOutputs(GetWorkflowResponseBodyWorkflowOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public GetWorkflowResponseBodyWorkflowOutputs getOutputs() {
            return this.outputs;
        }

        public GetWorkflowResponseBodyWorkflow setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetWorkflowResponseBodyWorkflow setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public GetWorkflowResponseBodyWorkflow setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetWorkflowResponseBodyWorkflow setTags(java.util.List<GetWorkflowResponseBodyWorkflowTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetWorkflowResponseBodyWorkflowTags> getTags() {
            return this.tags;
        }

        public GetWorkflowResponseBodyWorkflow setTasks(java.util.List<GetWorkflowResponseBodyWorkflowTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<GetWorkflowResponseBodyWorkflowTasks> getTasks() {
            return this.tasks;
        }

        public GetWorkflowResponseBodyWorkflow setTrigger(GetWorkflowResponseBodyWorkflowTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public GetWorkflowResponseBodyWorkflowTrigger getTrigger() {
            return this.trigger;
        }

    }

}
