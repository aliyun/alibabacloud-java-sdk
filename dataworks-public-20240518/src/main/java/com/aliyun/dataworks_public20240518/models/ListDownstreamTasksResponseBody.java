// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDownstreamTasksResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDownstreamTasksResponseBodyPagingInfo pagingInfo;

    /**
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

    public static class ListDownstreamTasksResponseBodyPagingInfoTasksDataSource extends TeaModel {
        /**
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
        public ListDownstreamTasksResponseBodyPagingInfoTasksDataSource dataSource;

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
        public ListDownstreamTasksResponseBodyPagingInfoTasksRuntimeResource runtimeResource;

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
        public ListDownstreamTasksResponseBodyPagingInfoTasksTrigger trigger;

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

        public ListDownstreamTasksResponseBodyPagingInfoTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
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
        public java.util.List<ListDownstreamTasksResponseBodyPagingInfoTasks> tasks;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDownstreamTasksResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDownstreamTasksResponseBodyPagingInfo self = new ListDownstreamTasksResponseBodyPagingInfo();
            return TeaModel.build(map, self);
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
