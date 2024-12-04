// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListUpstreamTasksResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListUpstreamTasksResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUpstreamTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUpstreamTasksResponseBody self = new ListUpstreamTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUpstreamTasksResponseBody setPagingInfo(ListUpstreamTasksResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListUpstreamTasksResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListUpstreamTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUpstreamTasksResponseBodyPagingInfoTasksDataSource extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListUpstreamTasksResponseBodyPagingInfoTasksDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTasksResponseBodyPagingInfoTasksDataSource self = new ListUpstreamTasksResponseBodyPagingInfoTasksDataSource();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasksDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListUpstreamTasksResponseBodyPagingInfoTasksRuntimeResource extends TeaModel {
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

        public static ListUpstreamTasksResponseBodyPagingInfoTasksRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTasksResponseBodyPagingInfoTasksRuntimeResource self = new ListUpstreamTasksResponseBodyPagingInfoTasksRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasksRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasksRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasksRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListUpstreamTasksResponseBodyPagingInfoTasksTrigger extends TeaModel {
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

        public static ListUpstreamTasksResponseBodyPagingInfoTasksTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTasksResponseBodyPagingInfoTasksTrigger self = new ListUpstreamTasksResponseBodyPagingInfoTasksTrigger();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasksTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasksTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasksTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasksTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasksTrigger setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasksTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListUpstreamTasksResponseBodyPagingInfoTasks extends TeaModel {
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
        public ListUpstreamTasksResponseBodyPagingInfoTasksDataSource dataSource;

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

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
        public ListUpstreamTasksResponseBodyPagingInfoTasksRuntimeResource runtimeResource;

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
        public ListUpstreamTasksResponseBodyPagingInfoTasksTrigger trigger;

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

        public static ListUpstreamTasksResponseBodyPagingInfoTasks build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTasksResponseBodyPagingInfoTasks self = new ListUpstreamTasksResponseBodyPagingInfoTasks();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setDataSource(ListUpstreamTasksResponseBodyPagingInfoTasksDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListUpstreamTasksResponseBodyPagingInfoTasksDataSource getDataSource() {
            return this.dataSource;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
            return this;
        }
        public String getInstanceMode() {
            return this.instanceMode;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setProjectEnv(String projectEnv) {
            this.projectEnv = projectEnv;
            return this;
        }
        public String getProjectEnv() {
            return this.projectEnv;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setRuntimeResource(ListUpstreamTasksResponseBodyPagingInfoTasksRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListUpstreamTasksResponseBodyPagingInfoTasksRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setTrigger(ListUpstreamTasksResponseBodyPagingInfoTasksTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListUpstreamTasksResponseBodyPagingInfoTasksTrigger getTrigger() {
            return this.trigger;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListUpstreamTasksResponseBodyPagingInfoTasks setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class ListUpstreamTasksResponseBodyPagingInfo extends TeaModel {
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
        public java.util.List<ListUpstreamTasksResponseBodyPagingInfoTasks> tasks;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUpstreamTasksResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTasksResponseBodyPagingInfo self = new ListUpstreamTasksResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTasksResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListUpstreamTasksResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUpstreamTasksResponseBodyPagingInfo setTasks(java.util.List<ListUpstreamTasksResponseBodyPagingInfoTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ListUpstreamTasksResponseBodyPagingInfoTasks> getTasks() {
            return this.tasks;
        }

        public ListUpstreamTasksResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
