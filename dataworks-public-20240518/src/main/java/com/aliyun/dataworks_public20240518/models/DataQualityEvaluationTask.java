// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DataQualityEvaluationTask extends TeaModel {
    /**
     * <p>The ID of the data source used to execute the data quality check task.</p>
     * 
     * <strong>example:</strong>
     * <p>201</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>The description of the data quality check task. The description can be up to 65,535 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a daily run data quality evaluation plan.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The callback settings for the lifecycle of the data quality check task instance. Currently, only one hook that blocks the scheduled task is supported.</p>
     */
    @NameInMap("Hooks")
    public java.util.List<DataQualityEvaluationTaskHooks> hooks;

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
     * <p>The notification subscription configuration of the data quality check task.</p>
     */
    @NameInMap("Notifications")
    public java.util.List<DataQualityEvaluationTaskNotifications> notifications;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The runtime configuration for using the data source. Currently, you can only specify the YARN queue for EMR and set the SQL engine to SPARK_SQL, KYUUBI, PRESTO_SQL, or HIVE_SQL when collecting EMR tables.</p>
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
    public DataQualityEvaluationTaskTarget target;

    /**
     * <p>The ID of the DataWorks tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    /**
     * <p>The trigger configuration of the data quality check task.</p>
     */
    @NameInMap("Trigger")
    public DataQualityEvaluationTaskTrigger trigger;

    public static DataQualityEvaluationTask build(java.util.Map<String, ?> map) throws Exception {
        DataQualityEvaluationTask self = new DataQualityEvaluationTask();
        return TeaModel.build(map, self);
    }

    public DataQualityEvaluationTask setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public DataQualityEvaluationTask setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataQualityEvaluationTask setHooks(java.util.List<DataQualityEvaluationTaskHooks> hooks) {
        this.hooks = hooks;
        return this;
    }
    public java.util.List<DataQualityEvaluationTaskHooks> getHooks() {
        return this.hooks;
    }

    public DataQualityEvaluationTask setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DataQualityEvaluationTask setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataQualityEvaluationTask setNotifications(java.util.List<DataQualityEvaluationTaskNotifications> notifications) {
        this.notifications = notifications;
        return this;
    }
    public java.util.List<DataQualityEvaluationTaskNotifications> getNotifications() {
        return this.notifications;
    }

    public DataQualityEvaluationTask setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DataQualityEvaluationTask setRuntimeConf(String runtimeConf) {
        this.runtimeConf = runtimeConf;
        return this;
    }
    public String getRuntimeConf() {
        return this.runtimeConf;
    }

    public DataQualityEvaluationTask setTarget(DataQualityEvaluationTaskTarget target) {
        this.target = target;
        return this;
    }
    public DataQualityEvaluationTaskTarget getTarget() {
        return this.target;
    }

    public DataQualityEvaluationTask setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public DataQualityEvaluationTask setTrigger(DataQualityEvaluationTaskTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public DataQualityEvaluationTaskTrigger getTrigger() {
        return this.trigger;
    }

    public static class DataQualityEvaluationTaskHooks extends TeaModel {
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

        public static DataQualityEvaluationTaskHooks build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskHooks self = new DataQualityEvaluationTaskHooks();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DataQualityEvaluationTaskHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DataQualityEvaluationTaskNotificationsNotificationsNotificationChannels extends TeaModel {
        /**
         * <p>The notification method.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Mail&quot;]</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static DataQualityEvaluationTaskNotificationsNotificationsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskNotificationsNotificationsNotificationChannels self = new DataQualityEvaluationTaskNotificationsNotificationsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskNotificationsNotificationsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class DataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers extends TeaModel {
        /**
         * <p>The extension information in JSON format. For example, DingTalk chatbots support mentioning all members.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The type of the alert recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>AliUid</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The alert recipient values.</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static DataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers self = new DataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public DataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public DataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class DataQualityEvaluationTaskNotificationsNotifications extends TeaModel {
        /**
         * <p>The notification method.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<DataQualityEvaluationTaskNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>The settings of the alert recipients.</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<DataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers> notificationReceivers;

        public static DataQualityEvaluationTaskNotificationsNotifications build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskNotificationsNotifications self = new DataQualityEvaluationTaskNotificationsNotifications();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskNotificationsNotifications setNotificationChannels(java.util.List<DataQualityEvaluationTaskNotificationsNotificationsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<DataQualityEvaluationTaskNotificationsNotificationsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public DataQualityEvaluationTaskNotificationsNotifications setNotificationReceivers(java.util.List<DataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<DataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class DataQualityEvaluationTaskNotifications extends TeaModel {
        /**
         * <p>The trigger condition of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>${blockType} == &quot;Strong&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The specific notification settings.</p>
         */
        @NameInMap("Notifications")
        public java.util.List<DataQualityEvaluationTaskNotificationsNotifications> notifications;

        public static DataQualityEvaluationTaskNotifications build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskNotifications self = new DataQualityEvaluationTaskNotifications();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskNotifications setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DataQualityEvaluationTaskNotifications setNotifications(java.util.List<DataQualityEvaluationTaskNotificationsNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<DataQualityEvaluationTaskNotificationsNotifications> getNotifications() {
            return this.notifications;
        }

    }

    public static class DataQualityEvaluationTaskTarget extends TeaModel {
        /**
         * <p>The database type of the table dataset. Valid values:</p>
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
         * <p>The monitored object type. Valid values:</p>
         * <ul>
         * <li>Table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static DataQualityEvaluationTaskTarget build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskTarget self = new DataQualityEvaluationTaskTarget();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public DataQualityEvaluationTaskTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public DataQualityEvaluationTaskTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public DataQualityEvaluationTaskTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DataQualityEvaluationTaskTrigger extends TeaModel {
        /**
         * <p>The IDs of the scheduled nodes whose successful instance execution triggers the data quality check task. This parameter takes effect only when Type is set to ByScheduledTaskInstance.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The event that triggers the execution of the data quality check task. Valid values:</p>
         * <ul>
         * <li>ByScheduledTaskInstance: A scheduled instance completes successfully.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static DataQualityEvaluationTaskTrigger build(java.util.Map<String, ?> map) throws Exception {
            DataQualityEvaluationTaskTrigger self = new DataQualityEvaluationTaskTrigger();
            return TeaModel.build(map, self);
        }

        public DataQualityEvaluationTaskTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public DataQualityEvaluationTaskTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
