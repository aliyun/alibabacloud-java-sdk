// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityEvaluationTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PagingInfo")
    public ListDataQualityEvaluationTasksResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-9441</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityEvaluationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityEvaluationTasksResponseBody self = new ListDataQualityEvaluationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityEvaluationTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataQualityEvaluationTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataQualityEvaluationTasksResponseBody setPagingInfo(ListDataQualityEvaluationTasksResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDataQualityEvaluationTasksResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDataQualityEvaluationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <strong>example:</strong>
         * <p>BlockTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels extends TeaModel {
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>AliUid</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications extends TeaModel {
        @NameInMap("NotificationChannels")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels> notificationChannels;

        @NameInMap("NotificationReceivers")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers> notificationReceivers;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications setNotificationChannels(java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications setNotificationReceivers(java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        @NameInMap("Notifications")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications> notifications;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications setNotifications(java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications> getNotifications() {
            return this.notifications;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <strong>example:</strong>
         * <p>ds=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <strong>example:</strong>
         * <p>odps.unit_test.tb_unit_test</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger extends TeaModel {
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>This is a daily run data quality evaluation plan</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Hooks")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks> hooks;

        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Notifications")
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications notifications;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK-SQL&quot; }</p>
         */
        @NameInMap("RuntimeConf")
        public String runtimeConf;

        @NameInMap("Target")
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget target;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Trigger")
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger trigger;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setHooks(java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks> getHooks() {
            return this.hooks;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setNotifications(ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications notifications) {
            this.notifications = notifications;
            return this;
        }
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications getNotifications() {
            return this.notifications;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setRuntimeConf(String runtimeConf) {
            this.runtimeConf = runtimeConf;
            return this;
        }
        public String getRuntimeConf() {
            return this.runtimeConf;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setTarget(ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget target) {
            this.target = target;
            return this;
        }
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget getTarget() {
            return this.target;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setTrigger(ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfo extends TeaModel {
        @NameInMap("DataQualityEvaluationTasks")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks> dataQualityEvaluationTasks;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <strong>example:</strong>
         * <p>131</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfo self = new ListDataQualityEvaluationTasksResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfo setDataQualityEvaluationTasks(java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks> dataQualityEvaluationTasks) {
            this.dataQualityEvaluationTasks = dataQualityEvaluationTasks;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks> getDataQualityEvaluationTasks() {
            return this.dataQualityEvaluationTasks;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfo setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfo setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfo setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
