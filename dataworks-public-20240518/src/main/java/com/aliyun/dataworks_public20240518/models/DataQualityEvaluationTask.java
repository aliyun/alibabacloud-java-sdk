// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DataQualityEvaluationTask extends TeaModel {
    /**
     * <p>The ID of the data source that is used for task running.</p>
     * 
     * <strong>example:</strong>
     * <p>201</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>The description of the task. The description can be up to 65,535 characters in length.</p>
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
    public java.util.List<DataQualityEvaluationTaskHooks> hooks;

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
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configurations for alert notifications.</p>
     */
    @NameInMap("Notifications")
    public java.util.List<DataQualityEvaluationTaskNotifications> notifications;

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
     * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
     */
    @NameInMap("RuntimeConf")
    public String runtimeConf;

    /**
     * <p>The monitored object of the task.</p>
     */
    @NameInMap("Target")
    public DataQualityEvaluationTaskTarget target;

    /**
     * <p>The DataWorks tenant ID.</p>
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
         * <p>The alert notification method.</p>
         * 
         * <strong>example:</strong>
         * <p>Mail</p>
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
         * <p>The extended information in the JSON format. For example, the DingTalk chatbot can remind all members in a DingTalk group by using the at sign (@).</p>
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
         * <p>The alert recipients.</p>
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
         * <p>The alert notification methods.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<DataQualityEvaluationTaskNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>The alert recipients.</p>
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
         * <p>The trigger condition of the alert notification.</p>
         * 
         * <strong>example:</strong>
         * <p>${blockType} == &quot;Strong&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The configurations for alert notifications.</p>
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
