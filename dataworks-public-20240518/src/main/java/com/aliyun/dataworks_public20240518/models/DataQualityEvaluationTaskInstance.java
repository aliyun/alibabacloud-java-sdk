// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DataQualityEvaluationTaskInstance extends TeaModel {
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
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The status of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Passed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The snapshot of the configurations for the data quality monitoring task when the task starts.</p>
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
         * <li>BlockTaskInstance: An auto triggered node is blocked.</li>
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
         * <p>The alert notification methods.</p>
         * 
         * <strong>example:</strong>
         * <p>Mail</p>
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
         * <p>The extended information in the JSON format. For example, the DingTalk chatbot can remind all members in a DingTalk group by using the at sign (@).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The alert recipient configuration.</p>
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
         * <p>The alert notification methods.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<DataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>The alert recipient configurations.</p>
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
         * <p>The trigger condition of the alert notification.</p>
         * 
         * <strong>example:</strong>
         * <p>${blockType} == &quot;Strong&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The configurations for the alert notification.</p>
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
         * <p>The IDs of the auto triggered nodes of which the instances are successfully run. This parameter takes effect only if the Type parameter is set to ByScheduledTaskInstance.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The trigger condition of the task. Valid values:</p>
         * <ul>
         * <li>ByScheduledTaskInstance: The task is triggered when the instance of an auto triggered node is successfully run.</li>
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
         * <p>The ID of the data source that is used for task running.</p>
         * 
         * <strong>example:</strong>
         * <p>201</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <p>The callback configurations of the task during the instance lifecycle. Blocking an auto triggered node is a type of callback event. Only this type is supported.</p>
         */
        @NameInMap("Hooks")
        public java.util.List<DataQualityEvaluationTaskInstanceTaskHooks> hooks;

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
         * <p>The subscription configurations for alert notifications.</p>
         */
        @NameInMap("Notifications")
        public java.util.List<DataQualityEvaluationTaskInstanceTaskNotifications> notifications;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2626</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The configuration of the data source. The value of the queue field is default, and that of the sqlEngine field can be SPARK_SQL, KYUUBI, PRESTO_SQL, or HIVE_SQL to collect EMR data. The value default indicates the YARN queue for E-MapReduce (EMR) tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
         */
        @NameInMap("RuntimeConf")
        public String runtimeConf;

        /**
         * <p>The monitored object of the data quality monitoring task.</p>
         */
        @NameInMap("Target")
        public DataQualityEvaluationTaskInstanceTaskTarget target;

        /**
         * <p>The DataWorks tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>195820716552192</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The trigger configuration of the data quality monitoring task.</p>
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
