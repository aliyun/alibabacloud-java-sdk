// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DataQualityEvaluationTaskInstance extends TeaModel {
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
     * <p>The task instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The current running status.</p>
     * 
     * <strong>example:</strong>
     * <p>Passed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The snapshot of the data quality check task at the start of the check.</p>
     */
    @NameInMap("Task")
    public DataQualityEvaluationTaskInstanceTask task;

    public static DataQualityEvaluationTaskInstance build(java.util.Map<String, ?> map) throws Exception {
        DataQualityEvaluationTaskInstance self = new DataQualityEvaluationTaskInstance();
        return TeaModel.build(map, self);
    }

    public DataQualityEvaluationTaskInstance setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DataQualityEvaluationTaskInstance setFinishTime(Long finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public Long getFinishTime() {
        return this.finishTime;
    }

    public DataQualityEvaluationTaskInstance setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DataQualityEvaluationTaskInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DataQualityEvaluationTaskInstance setTask(DataQualityEvaluationTaskInstanceTask task) {
        this.task = task;
        return this;
    }
    public DataQualityEvaluationTaskInstanceTask getTask() {
        return this.task;
    }

    public static class DataQualityEvaluationTaskInstanceTaskHooks extends TeaModel {
        /**
         * <p>The trigger condition of the hook.</p>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The type of the subsequent action. Valid values:</p>
         * <ul>
         * <li>BlockTaskInstance: Blocks the execution of the DataWorks task instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlockTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static DataQualityEvaluationTaskInstanceTaskHooks build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskInstanceTaskHooks self = new DataQualityEvaluationTaskInstanceTaskHooks();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskInstanceTaskHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DataQualityEvaluationTaskInstanceTaskHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels extends TeaModel {
        /**
         * <p>The notification channel.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Mail&quot;]</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels self = new DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers extends TeaModel {
        /**
         * <p>The extension information in JSON format. For example, DingTalk chatbots support mentioning all users.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The notification recipient type.</p>
         * 
         * <strong>example:</strong>
         * <p>AliUid</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The notification recipient values.</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers self = new DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class DataQualityEvaluationTaskInstanceTaskNotificationsNotifications extends TeaModel {
        /**
         * <p>The notification channel.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>The notification recipient configuration.</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers> notificationReceivers;

        public static DataQualityEvaluationTaskInstanceTaskNotificationsNotifications build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskInstanceTaskNotificationsNotifications self = new DataQualityEvaluationTaskInstanceTaskNotificationsNotifications();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskInstanceTaskNotificationsNotifications setNotificationChannels(java.util.List<DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public DataQualityEvaluationTaskInstanceTaskNotificationsNotifications setNotificationReceivers(java.util.List<DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class DataQualityEvaluationTaskInstanceTaskNotifications extends TeaModel {
        /**
         * <p>The alert trigger condition.</p>
         * 
         * <strong>example:</strong>
         * <p>${blockType} == &quot;Strong&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The specific message notification settings.</p>
         */
        @NameInMap("Notifications")
        public java.util.List<DataQualityEvaluationTaskInstanceTaskNotificationsNotifications> notifications;

        public static DataQualityEvaluationTaskInstanceTaskNotifications build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskInstanceTaskNotifications self = new DataQualityEvaluationTaskInstanceTaskNotifications();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskInstanceTaskNotifications setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DataQualityEvaluationTaskInstanceTaskNotifications setNotifications(java.util.List<DataQualityEvaluationTaskInstanceTaskNotificationsNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<DataQualityEvaluationTaskInstanceTaskNotificationsNotifications> getNotifications() {
            return this.notifications;
        }

    }

    public static class DataQualityEvaluationTaskInstanceTaskTarget extends TeaModel {
        /**
         * <p>The database type to which the table belongs, applicable when the dataset is of the table type. Valid values:</p>
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
         * <p>The unique ID of the table in DataWorks Data Map.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.unit_test.tb_unit_test</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The monitored object type.</p>
         * <ul>
         * <li>Table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static DataQualityEvaluationTaskInstanceTaskTarget build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskInstanceTaskTarget self = new DataQualityEvaluationTaskInstanceTaskTarget();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskInstanceTaskTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public DataQualityEvaluationTaskInstanceTaskTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public DataQualityEvaluationTaskInstanceTaskTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public DataQualityEvaluationTaskInstanceTaskTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DataQualityEvaluationTaskInstanceTaskTrigger extends TeaModel {
        /**
         * <p>The IDs of the scheduled nodes whose successful instance execution triggers the check. This parameter takes effect only when Type is set to ByScheduledTaskInstance.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The type of event that triggers the execution of the quality check task. Valid values:</p>
         * <ul>
         * <li>ByScheduledTaskInstance: A scheduled instance completes successfully.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static DataQualityEvaluationTaskInstanceTaskTrigger build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskInstanceTaskTrigger self = new DataQualityEvaluationTaskInstanceTaskTrigger();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskInstanceTaskTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public DataQualityEvaluationTaskInstanceTaskTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DataQualityEvaluationTaskInstanceTask extends TeaModel {
        /**
         * <p>The ID of the data source used to execute the data quality check task.</p>
         * 
         * <strong>example:</strong>
         * <p>201</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <p>The callback settings for the lifecycle of the data quality check task instance. Currently, only one hook that blocks the scheduled task is supported.</p>
         */
        @NameInMap("Hooks")
        public java.util.List<DataQualityEvaluationTaskInstanceTaskHooks> hooks;

        /**
         * <p>The ID of the data quality check task.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data quality check task. The name can contain digits, letters, Chinese characters, and half-width or full-width punctuation marks, and can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Quality check task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The alert subscription configuration of the data quality check task.</p>
         */
        @NameInMap("Notifications")
        public java.util.List<DataQualityEvaluationTaskInstanceTaskNotifications> notifications;

        /**
         * <p>The ID of the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>2626</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The settings used when the data source is accessed. Currently, you can only specify the YARN queue for EMR and set the SQL engine to SPARK_SQL, KYUUBI, PRESTO_SQL, or HIVE_SQL when collecting EMR tables.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
         */
        @NameInMap("RuntimeConf")
        public String runtimeConf;

        /**
         * <p>The monitored object of the data quality check task.</p>
         */
        @NameInMap("Target")
        public DataQualityEvaluationTaskInstanceTaskTarget target;

        /**
         * <p>The ID of the DataWorks tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>195820716552192</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The trigger configuration of the data quality check task.</p>
         */
        @NameInMap("Trigger")
        public DataQualityEvaluationTaskInstanceTaskTrigger trigger;

        public static DataQualityEvaluationTaskInstanceTask build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskInstanceTask self = new DataQualityEvaluationTaskInstanceTask();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskInstanceTask setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public DataQualityEvaluationTaskInstanceTask setHooks(java.util.List<DataQualityEvaluationTaskInstanceTaskHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<DataQualityEvaluationTaskInstanceTaskHooks> getHooks() {
            return this.hooks;
        }

        public DataQualityEvaluationTaskInstanceTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DataQualityEvaluationTaskInstanceTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DataQualityEvaluationTaskInstanceTask setNotifications(java.util.List<DataQualityEvaluationTaskInstanceTaskNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<DataQualityEvaluationTaskInstanceTaskNotifications> getNotifications() {
            return this.notifications;
        }

        public DataQualityEvaluationTaskInstanceTask setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public DataQualityEvaluationTaskInstanceTask setRuntimeConf(String runtimeConf) {
            this.runtimeConf = runtimeConf;
            return this;
        }
        public String getRuntimeConf() {
            return this.runtimeConf;
        }

        public DataQualityEvaluationTaskInstanceTask setTarget(DataQualityEvaluationTaskInstanceTaskTarget target) {
            this.target = target;
            return this;
        }
        public DataQualityEvaluationTaskInstanceTaskTarget getTarget() {
            return this.target;
        }

        public DataQualityEvaluationTaskInstanceTask setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public DataQualityEvaluationTaskInstanceTask setTrigger(DataQualityEvaluationTaskInstanceTaskTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public DataQualityEvaluationTaskInstanceTaskTrigger getTrigger() {
            return this.trigger;
        }

    }

}
