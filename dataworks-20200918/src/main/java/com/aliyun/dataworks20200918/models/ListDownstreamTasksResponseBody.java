// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDownstreamTasksResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDownstreamTasksResponseBodyPagingInfo pagingInfo;

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
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

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
        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskRuntimeResource runtimeResource;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("Trigger")
        public ListDownstreamTasksResponseBodyPagingInfoDownstreamTasksTaskTrigger trigger;

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

    public static class ListDownstreamTasksResponseBodyPagingInfo extends TeaModel {
        @NameInMap("DownstreamTasks")
        public java.util.List<ListDownstreamTasksResponseBodyPagingInfoDownstreamTasks> downstreamTasks;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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

        public ListDownstreamTasksResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
