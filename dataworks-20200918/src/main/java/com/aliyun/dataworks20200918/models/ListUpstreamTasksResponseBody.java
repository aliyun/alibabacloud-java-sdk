// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListUpstreamTasksResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListUpstreamTasksResponseBodyPagingInfo pagingInfo;

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

    public static class ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskDataSource extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskDataSource self = new ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskDataSource();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskRuntimeResource extends TeaModel {
        @NameInMap("Cu")
        public String cu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskRuntimeResource self = new ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger extends TeaModel {
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

        public static ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger self = new ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataSource")
        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskDataSource dataSource;

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

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        @NameInMap("RerunMode")
        public String rerunMode;

        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        @NameInMap("RuntimeResource")
        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskRuntimeResource runtimeResource;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("Trigger")
        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger trigger;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkflowId")
        public Long workflowId;

        public static ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask self = new ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setDataSource(ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskDataSource getDataSource() {
            return this.dataSource;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
            return this;
        }
        public String getInstanceMode() {
            return this.instanceMode;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setRuntimeResource(ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setTrigger(ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTaskTrigger getTrigger() {
            return this.trigger;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class ListUpstreamTasksResponseBodyPagingInfoUpstreamTasks extends TeaModel {
        @NameInMap("DependencyType")
        public String dependencyType;

        @NameInMap("Task")
        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask task;

        public static ListUpstreamTasksResponseBodyPagingInfoUpstreamTasks build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamTasksResponseBodyPagingInfoUpstreamTasks self = new ListUpstreamTasksResponseBodyPagingInfoUpstreamTasks();
            return TeaModel.build(map, self);
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasks setDependencyType(String dependencyType) {
            this.dependencyType = dependencyType;
            return this;
        }
        public String getDependencyType() {
            return this.dependencyType;
        }

        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasks setTask(ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask task) {
            this.task = task;
            return this;
        }
        public ListUpstreamTasksResponseBodyPagingInfoUpstreamTasksTask getTask() {
            return this.task;
        }

    }

    public static class ListUpstreamTasksResponseBodyPagingInfo extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("UpstreamTasks")
        public java.util.List<ListUpstreamTasksResponseBodyPagingInfoUpstreamTasks> upstreamTasks;

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

        public ListUpstreamTasksResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListUpstreamTasksResponseBodyPagingInfo setUpstreamTasks(java.util.List<ListUpstreamTasksResponseBodyPagingInfoUpstreamTasks> upstreamTasks) {
            this.upstreamTasks = upstreamTasks;
            return this;
        }
        public java.util.List<ListUpstreamTasksResponseBodyPagingInfoUpstreamTasks> getUpstreamTasks() {
            return this.upstreamTasks;
        }

    }

}
