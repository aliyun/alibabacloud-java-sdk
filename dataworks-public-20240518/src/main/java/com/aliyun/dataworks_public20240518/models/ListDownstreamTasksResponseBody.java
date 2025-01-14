// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDownstreamTasksResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDownstreamTasksResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDownstreamTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDownstreamTasksResponseBody self = new ListDownstreamTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDownstreamTasksResponseBody setPagingInfo(ListDownstreamTasksResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDownstreamTasksResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDownstreamTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskDataSource extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskDataSource self = new ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskDataSource();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskRuntimeResource extends TeaModel {
        @NameInMap("Cu")
        public String cu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskRuntimeResource self = new ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger extends TeaModel {
        @NameInMap("Cron")
        public String cron;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Recurrence")
        public String recurrence;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timezone")
        public String timezone;

        @NameInMap("Type")
        public String type;

        public static ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger self = new ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask extends TeaModel {
        /**
         * <p>The ID of the baseline.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The information about the data source.</p>
         */
        @NameInMap("DataSource")
        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskDataSource dataSource;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceMode")
        public String instanceMode;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the task. Valid values: 1 to 8.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The interval between two consecutive reruns. Unit: seconds.</p>
         */
        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        /**
         * <p>The rerun mode.</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The number of reruns.</p>
         */
        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        /**
         * <p>The configurations of the runtime environment, such as the resource group information.</p>
         */
        @NameInMap("RuntimeResource")
        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskRuntimeResource runtimeResource;

        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The timeout period of task running. Unit: seconds.</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The method to trigger the running of the task.</p>
         */
        @NameInMap("Trigger")
        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger trigger;

        /**
         * <p>The type of the task.</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("WorkflowId")
        public Long workflowId;

        public static ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask self = new ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setDataSource(ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskDataSource getDataSource() {
            return this.dataSource;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
            return this;
        }
        public String getInstanceMode() {
            return this.instanceMode;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setRuntimeResource(ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setTrigger(ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger getTrigger() {
            return this.trigger;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class ListDownstreamTasksResponseBodyPagingInfoDownstreamTasks extends TeaModel {
        /**
         * <p>The dependency type.</p>
         */
        @NameInMap("DependencyType")
        public String dependencyType;

        @NameInMap("Task")
        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask task;

        public static ListDownstreamTasksResponseBodyPagingInfoDownstreamTasks build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTasksResponseBodyPagingInfoDownstreamTasks self = new ListDownstreamTasksResponseBodyPagingInfoDownstreamTasks();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasks setDependencyType(String dependencyType) {
            this.dependencyType = dependencyType;
            return this;
        }
        public String getDependencyType() {
            return this.dependencyType;
        }

        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasks setTask(ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask task) {
            this.task = task;
            return this;
        }
        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTask getTask() {
            return this.task;
        }

    }

    public static class ListDownstreamTasksResponseBodyPagingInfoTasksDataSource extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListDownstreamTasksResponseBodyPagingInfoTasksDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTasksResponseBodyPagingInfoTasksDataSource self = new ListDownstreamTasksResponseBodyPagingInfoTasksDataSource();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasksDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListDownstreamTasksResponseBodyPagingInfoTasksRuntimeResource extends TeaModel {
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

        public static ListDownstreamTasksResponseBodyPagingInfoTasksRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTasksResponseBodyPagingInfoTasksRuntimeResource self = new ListDownstreamTasksResponseBodyPagingInfoTasksRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasksRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasksRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasksRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListDownstreamTasksResponseBodyPagingInfoTasksTrigger extends TeaModel {
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
         * <li>Scheduler: scheduling cycle-based trigger</li>
         * <li>Manual: manual trigger</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDownstreamTasksResponseBodyPagingInfoTasksTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTasksResponseBodyPagingInfoTasksTrigger self = new ListDownstreamTasksResponseBodyPagingInfoTasksTrigger();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasksTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasksTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasksTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasksTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasksTrigger setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasksTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDownstreamTasksResponseBodyPagingInfoTasks extends TeaModel {
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
        public ListDownstreamTasksResponseBodyPagingInfoTasksDataSource dataSource;

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
         * <p>The configurations of the runtime environment, such as the resource group information.</p>
         */
        @NameInMap("RuntimeResource")
        public ListDownstreamTasksResponseBodyPagingInfoTasksRuntimeResource runtimeResource;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("StepType")
        public String stepType;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

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
        public ListDownstreamTasksResponseBodyPagingInfoTasksTrigger trigger;

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

        public static ListDownstreamTasksResponseBodyPagingInfoTasks build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTasksResponseBodyPagingInfoTasks self = new ListDownstreamTasksResponseBodyPagingInfoTasks();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setDataSource(ListDownstreamTasksResponseBodyPagingInfoTasksDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListDownstreamTasksResponseBodyPagingInfoTasksDataSource getDataSource() {
            return this.dataSource;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
            return this;
        }
        public String getInstanceMode() {
            return this.instanceMode;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        @Deprecated
        public ListDownstreamTasksResponseBodyPagingInfoTasks setProjectEnv(String projectEnv) {
            this.projectEnv = projectEnv;
            return this;
        }
        public String getProjectEnv() {
            return this.projectEnv;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setRuntimeResource(ListDownstreamTasksResponseBodyPagingInfoTasksRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListDownstreamTasksResponseBodyPagingInfoTasksRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setTrigger(ListDownstreamTasksResponseBodyPagingInfoTasksTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListDownstreamTasksResponseBodyPagingInfoTasksTrigger getTrigger() {
            return this.trigger;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDownstreamTasksResponseBodyPagingInfoTasks setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class ListDownstreamTasksResponseBodyPagingInfo extends TeaModel {
        @NameInMap("DownstreamTasks")
        public java.util.List<ListDownstreamTasksResponseBodyPagingInfoDownstreamTasks> downstreamTasks;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The tasks.</p>
         */
        @NameInMap("Tasks")
        public java.util.List<ListDownstreamTasksResponseBodyPagingInfoTasks> tasks;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDownstreamTasksResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTasksResponseBodyPagingInfo self = new ListDownstreamTasksResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDownstreamTasksResponseBodyPagingInfo setDownstreamTasks(java.util.List<ListDownstreamTasksResponseBodyPagingInfoDownstreamTasks> downstreamTasks) {
            this.downstreamTasks = downstreamTasks;
            return this;
        }
        public java.util.List<ListDownstreamTasksResponseBodyPagingInfoDownstreamTasks> getDownstreamTasks() {
            return this.downstreamTasks;
        }

        public ListDownstreamTasksResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDownstreamTasksResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDownstreamTasksResponseBodyPagingInfo setTasks(java.util.List<ListDownstreamTasksResponseBodyPagingInfoTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ListDownstreamTasksResponseBodyPagingInfoTasks> getTasks() {
            return this.tasks;
        }

        public ListDownstreamTasksResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
