// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListUpstreamTasksResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListUpstreamTasksResponseBodyPagingInfo pagingInfo;

    /**
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
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
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
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <strong>example:</strong>
         * <p>9999-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
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
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataSource")
        public ListUpstreamTasksResponseBodyPagingInfoTasksDataSource dataSource;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceMode")
        public String instanceMode;

        /**
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("ProjectEnv")
        public String projectEnv;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        /**
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        @NameInMap("RuntimeResource")
        public ListUpstreamTasksResponseBodyPagingInfoTasksRuntimeResource runtimeResource;

        @NameInMap("StepType")
        public String stepType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("Trigger")
        public ListUpstreamTasksResponseBodyPagingInfoTasksTrigger trigger;

        /**
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Tasks")
        public java.util.List<ListUpstreamTasksResponseBodyPagingInfoTasks> tasks;

        /**
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
