// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityEvaluationTaskInstancesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-9441</p>
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
         * <p>The alert notification methods.</p>
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
         * <p>The alert recipients.</p>
         */
        @NameInMap("NofiticationReceivers")
        public java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotificationsNotificationsNofiticationReceivers> nofiticationReceivers;

        /**
         * <p>The alert notification methods.</p>
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
         * <p>The IDs of the auto triggered nodes of which the instances are successfully run.</p>
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
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a daily run data quality evaluation plan.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The callback configurations of the task during the instance lifecycle. Blocking an auto triggered node is a type of callback event. Only this type is supported.</p>
         */
        @NameInMap("Hooks")
        public java.util.List<ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskHooks> hooks;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the task.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configurations for alert notifications.</p>
         */
        @NameInMap("Notifications")
        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskNotifications notifications;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

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
        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTaskTarget target;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The trigger configuration of the task.</p>
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

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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

        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
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
         * <p>The time at which the instance was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time at which the instance finished running.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The parameters configured for the instance.</p>
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
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The status of the instance. Valid values:</p>
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
         * <p>The snapshot of the configurations for the task when the task starts.</p>
         */
        @NameInMap("Task")
        public ListDataQualityEvaluationTaskInstancesResponseBodyPagingInfoDataQualityEvaluationTaskInstancesTask task;

        /**
         * <p>The information about the trigger module of the instance.</p>
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
         * <p>The instances generated by the task.</p>
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
