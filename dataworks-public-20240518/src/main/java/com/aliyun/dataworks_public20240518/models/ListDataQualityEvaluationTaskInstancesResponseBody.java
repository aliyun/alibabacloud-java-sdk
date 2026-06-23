// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityEvaluationTaskInstancesResponseBody extends TeaModel {
    /**
     * <p>The pagination query result of quality evaluation task instances.</p>
     */
    @NameInMap("PagingInfo")
    public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The API request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityEvaluationTaskInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityEvaluationTaskInstancesResponseBody self = new ListDataQualityEvaluationTaskInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityEvaluationTaskInstancesResponseBody setPagingInfo(ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDataQualityEvaluationTaskInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskHooks extends TeaModel {
        /**
         * <p>The trigger condition of the Hook.</p>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The type of the subsequent processing action.</p>
         * <ul>
         * <li>BlockTaskInstance: Blocks the execution of the DataWorks task instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlockTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskHooks build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskHooks self = new ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskHooks();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNofiticationReceivers extends TeaModel {
        /**
         * <p>The extension information, in JSON format. For example, a DingTalk bot supports at-all.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The type of the alert recipient.</p>
         * <ul>
         * <li>AliUid - The UID of the Alibaba Cloud account</li>
         * <li>WebhookUrl - A custom webhook URL</li>
         * <li>DingdingUrl - The URL of a DingTalk bot</li>
         * <li>FeishuUrl - The URL of a Lark bot</li>
         * <li>WeixinUrl - The URL of a WeCom bot</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliUid</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The alert recipient.</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNofiticationReceivers build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNofiticationReceivers self = new ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNofiticationReceivers();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNofiticationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNofiticationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNofiticationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNotificationChannels extends TeaModel {
        /**
         * <p>The alert method.</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNotificationChannels self = new ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotifications extends TeaModel {
        /**
         * <p>The alert recipient settings.</p>
         */
        @NameInMap("NofiticationReceivers")
        public java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNofiticationReceivers> nofiticationReceivers;

        /**
         * <p>The alert method.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNotificationChannels> notificationChannels;

        public static ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotifications build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotifications self = new ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotifications();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotifications setNofiticationReceivers(java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNofiticationReceivers> nofiticationReceivers) {
            this.nofiticationReceivers = nofiticationReceivers;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNofiticationReceivers> getNofiticationReceivers() {
            return this.nofiticationReceivers;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotifications setNotificationChannels(java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

    }

    public static class ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotifications extends TeaModel {
        /**
         * <p>The trigger condition of the notification.</p>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The notification settings.</p>
         */
        @NameInMap("Notifications")
        public java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotifications> notifications;

        public static ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotifications build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotifications self = new ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotifications();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotifications setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotifications setNotifications(java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotifications> getNotifications() {
            return this.notifications;
        }

    }

    public static class ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTarget extends TeaModel {
        /**
         * <p>For a dataset of table type, the database type to which the table belongs.</p>
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
         * <p>The partition settings of the partitioned table.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>The unique ID of the table in Data Map.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.unit_test.tb_unit_test</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The type of the monitoring object.</p>
         * <ul>
         * <li>Table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTarget build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTarget self = new ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTarget();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTrigger extends TeaModel {
        /**
         * <p>The IDs of scheduled task nodes.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The type of event that can trigger the execution of the quality evaluation task.</p>
         * <ul>
         * <li>ByScheduledTaskInstance: A scheduled instance runs successfully.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTrigger self = new ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTrigger();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask extends TeaModel {
        /**
         * <p>The description of the quality monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a daily run data quality evaluation plan.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The callback settings in the lifecycle of the data quality evaluation task instance. Currently, only one Hook for blocking scheduled tasks is supported.</p>
         */
        @NameInMap("Hooks")
        public java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskHooks> hooks;

        /**
         * <p>The ID of the data quality evaluation task.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the quality monitoring task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Quality verification task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The notification subscription configuration.</p>
         */
        @NameInMap("Notifications")
        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotifications notifications;

        /**
         * <p>The ID of the project workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Settings used when accessing data sources. Currently, only specifying the YARN queue of EMR and specifying the SQL engine as SPARK_SQL|KYUUBI|PRESTO_SQL|HIVE_SQL when collecting EMR tables are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
         */
        @NameInMap("RuntimeConf")
        public String runtimeConf;

        /**
         * <p>The monitoring object of the data quality evaluation task.</p>
         */
        @NameInMap("Target")
        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTarget target;

        /**
         * <p>The trigger configuration of the data quality evaluation task.</p>
         */
        @NameInMap("Trigger")
        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTrigger trigger;

        public static ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask self = new ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask setHooks(java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskHooks> getHooks() {
            return this.hooks;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask setNotifications(ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotifications notifications) {
            this.notifications = notifications;
            return this;
        }
        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotifications getNotifications() {
            return this.notifications;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask setRuntimeConf(String runtimeConf) {
            this.runtimeConf = runtimeConf;
            return this;
        }
        public String getRuntimeConf() {
            return this.runtimeConf;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask setTarget(ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTarget target) {
            this.target = target;
            return this;
        }
        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTarget getTarget() {
            return this.target;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask setTrigger(ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances extends TeaModel {
        /**
         * <p>The creation time of the task instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The end time of the task instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The ID of the quality check task instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The parameter settings used during the actual runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;bizdate&quot;: &quot;20240517&quot;,
         *   &quot;triggerTime&quot;: &quot;1710239005403&quot;
         * }</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The ID of the DataWorks project workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The current running status.</p>
         * <ul>
         * <li>Running</li>
         * <li>Error</li>
         * <li>Passed</li>
         * <li>Warned</li>
         * <li>Critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Critical</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The snapshot of the data quality evaluation task when the evaluation starts.</p>
         */
        @NameInMap("Task")
        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask task;

        /**
         * <p>The context information when the instance is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;TriggerClientId&quot;: 10001,
         *   &quot;TriggerClient&quot;: &quot;CWF2&quot;
         * }</p>
         */
        @NameInMap("TriggerContext")
        public String triggerContext;

        public static ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances self = new ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances setTask(ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask task) {
            this.task = task;
            return this;
        }
        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask getTask() {
            return this.task;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances setTriggerContext(String triggerContext) {
            this.triggerContext = triggerContext;
            return this;
        }
        public String getTriggerContext() {
            return this.triggerContext;
        }

    }

    public static class ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The successfully triggered TaskInstance.</p>
         */
        @NameInMap("DataQualityEvaluationTaskInstances")
        public java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances> dataQualityEvaluationTaskInstances;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>294</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfo self = new ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfo setDataQualityEvaluationTaskInstances(java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances> dataQualityEvaluationTaskInstances) {
            this.dataQualityEvaluationTaskInstances = dataQualityEvaluationTaskInstances;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstances> getDataQualityEvaluationTaskInstances() {
            return this.dataQualityEvaluationTaskInstances;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
