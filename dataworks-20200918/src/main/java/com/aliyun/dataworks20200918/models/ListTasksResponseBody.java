// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListTasksResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setPagingInfo(ListTasksResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListTasksResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTasksResponseBodyPagingInfoTasksDataSource extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListTasksResponseBodyPagingInfoTasksDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyPagingInfoTasksDataSource self = new ListTasksResponseBodyPagingInfoTasksDataSource();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyPagingInfoTasksDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListTasksResponseBodyPagingInfoTasksRuntimeResource extends TeaModel {
        @NameInMap("Cu")
        public String cu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListTasksResponseBodyPagingInfoTasksRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyPagingInfoTasksRuntimeResource self = new ListTasksResponseBodyPagingInfoTasksRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyPagingInfoTasksRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListTasksResponseBodyPagingInfoTasksRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListTasksResponseBodyPagingInfoTasksRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListTasksResponseBodyPagingInfoTasksTrigger extends TeaModel {
        @NameInMap("Cron")
        public String cron;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Recurrence")
        public String recurrence;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Type")
        public String type;

        public static ListTasksResponseBodyPagingInfoTasksTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyPagingInfoTasksTrigger self = new ListTasksResponseBodyPagingInfoTasksTrigger();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyPagingInfoTasksTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListTasksResponseBodyPagingInfoTasksTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListTasksResponseBodyPagingInfoTasksTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public ListTasksResponseBodyPagingInfoTasksTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListTasksResponseBodyPagingInfoTasksTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListTasksResponseBodyPagingInfoTasks extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataSource")
        public ListTasksResponseBodyPagingInfoTasksDataSource dataSource;

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
        public ListTasksResponseBodyPagingInfoTasksRuntimeResource runtimeResource;

        @NameInMap("ScriptParameters")
        public String scriptParameters;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("Trigger")
        public ListTasksResponseBodyPagingInfoTasksTrigger trigger;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkflowId")
        public Long workflowId;

        public static ListTasksResponseBodyPagingInfoTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyPagingInfoTasks self = new ListTasksResponseBodyPagingInfoTasks();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyPagingInfoTasks setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListTasksResponseBodyPagingInfoTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTasksResponseBodyPagingInfoTasks setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListTasksResponseBodyPagingInfoTasks setDataSource(ListTasksResponseBodyPagingInfoTasksDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ListTasksResponseBodyPagingInfoTasksDataSource getDataSource() {
            return this.dataSource;
        }

        public ListTasksResponseBodyPagingInfoTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTasksResponseBodyPagingInfoTasks setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListTasksResponseBodyPagingInfoTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTasksResponseBodyPagingInfoTasks setInstanceMode(String instanceMode) {
            this.instanceMode = instanceMode;
            return this;
        }
        public String getInstanceMode() {
            return this.instanceMode;
        }

        public ListTasksResponseBodyPagingInfoTasks setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListTasksResponseBodyPagingInfoTasks setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListTasksResponseBodyPagingInfoTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTasksResponseBodyPagingInfoTasks setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListTasksResponseBodyPagingInfoTasks setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListTasksResponseBodyPagingInfoTasks setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListTasksResponseBodyPagingInfoTasks setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public ListTasksResponseBodyPagingInfoTasks setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public ListTasksResponseBodyPagingInfoTasks setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public ListTasksResponseBodyPagingInfoTasks setRuntimeResource(ListTasksResponseBodyPagingInfoTasksRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListTasksResponseBodyPagingInfoTasksRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListTasksResponseBodyPagingInfoTasks setScriptParameters(String scriptParameters) {
            this.scriptParameters = scriptParameters;
            return this;
        }
        public String getScriptParameters() {
            return this.scriptParameters;
        }

        public ListTasksResponseBodyPagingInfoTasks setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListTasksResponseBodyPagingInfoTasks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListTasksResponseBodyPagingInfoTasks setTrigger(ListTasksResponseBodyPagingInfoTasksTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListTasksResponseBodyPagingInfoTasksTrigger getTrigger() {
            return this.trigger;
        }

        public ListTasksResponseBodyPagingInfoTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListTasksResponseBodyPagingInfoTasks setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class ListTasksResponseBodyPagingInfo extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Tasks")
        public java.util.List<ListTasksResponseBodyPagingInfoTasks> tasks;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTasksResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyPagingInfo self = new ListTasksResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListTasksResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTasksResponseBodyPagingInfo setTasks(java.util.List<ListTasksResponseBodyPagingInfoTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ListTasksResponseBodyPagingInfoTasks> getTasks() {
            return this.tasks;
        }

        public ListTasksResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
