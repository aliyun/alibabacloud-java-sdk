// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityEvaluationTasksResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDataQualityEvaluationTasksResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-9441</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityEvaluationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityEvaluationTasksResponseBody self = new ListDataQualityEvaluationTasksResponseBody();
        return TeaModel.build(map, self);
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
         * <p>The trigger configuration of the callback event.</p>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The type of the callback event. Valid values:</p>
         * <ul>
         * <li>BlockTaskInstance. The value indicates that an auto triggered node is blocked.</li>
         * </ul>
         * 
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
        /**
         * <p>The alert notification methods.</p>
         */
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
         * <p>The extended information in the JSON format. For example, the DingTalk chatbot can remind all members in a DingTalk group by using the at sign (@).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The type of the alert recipient. Valid values:</p>
         * <ul>
         * <li>AliUid: Alibaba Cloud account ID</li>
         * <li>WebhookUrl: URL of a custom webhook</li>
         * <li>DingdingUrl: DingTalk chatbot URL</li>
         * <li>FeishuUrl: Lark chatbot URL</li>
         * <li>WeixinUrl: WeCom chatbot URL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliUid</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The alert recipients.</p>
         */
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
        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>The alert recipients.</p>
         */
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
         * <p>The trigger condition of the alert notification.</p>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The configurations for the alert notification.</p>
         */
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
         * <p>The type of the database to which the table belongs. Valid values:</p>
         * <ul>
         * <li>maxcompute</li>
         * <li>emr</li>
         * <li>cdh</li>
         * <li>hologres</li>
         * <li>analyticdb_for_postgresql</li>
         * <li>analyticdb_for_mysql</li>
         * <li>starrocks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The configuration of the partitioned table.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>The ID of the table in Data Map.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.unit_test.tb_unit_test</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The type of the monitored object. Valid values:</p>
         * <ul>
         * <li>Table</li>
         * </ul>
         * 
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
        /**
         * <p>The IDs of the auto triggered nodes of which the instances are successfully run. This parameter takes effect only if the Type parameter is set to ByScheduledTaskInstance.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The trigger condition of the task. Valid values:</p>
         * <ul>
         * <li>ByScheduledTaskInstance. The value indicates that the task is triggered when the instance of an auto triggered node is successfully run.</li>
         * </ul>
         * 
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
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <p>The description of the data quality monitoring task. The description can be up to 65,535 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a daily run data quality evaluation plan</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The callback configurations of the task during the instance lifecycle. Blocking an auto triggered node is a type of callback event. Only this type is supported.</p>
         */
        @NameInMap("Hooks")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks> hooks;

        /**
         * <p>The ID of the data quality monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data quality monitoring task. The name can be up to 255 characters in length and can contain digits, letters, and punctuation marks.</p>
         * 
         * <strong>example:</strong>
         * <p>Data quality verification task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configurations for alert notifications.</p>
         */
        @NameInMap("Notifications")
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications notifications;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The configuration of the data source. The value of the queue field is default, and that of the sqlEngine field can be set to SPARK_SQL, KYUUBI, PRESTO_SQL, or HIVE_SQL. The value default indicates the YARN queue for E-MapReduce (EMR) tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK-SQL&quot; }</p>
         */
        @NameInMap("RuntimeConf")
        public String runtimeConf;

        /**
         * <p>The monitored object of the task.</p>
         */
        @NameInMap("Target")
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget target;

        /**
         * <p>The trigger configuration of the task.</p>
         */
        @NameInMap("Trigger")
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger trigger;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
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

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setTrigger(ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The data quality monitoring tasks.</p>
         */
        @NameInMap("DataQualityEvaluationTasks")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks> dataQualityEvaluationTasks;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
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
