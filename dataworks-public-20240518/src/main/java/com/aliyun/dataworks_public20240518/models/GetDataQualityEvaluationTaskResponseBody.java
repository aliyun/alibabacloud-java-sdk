// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityEvaluationTaskResponseBody extends TeaModel {
    /**
     * <p>The details of the monitor.</p>
     */
    @NameInMap("DataQualityEvaluationTask")
    public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask dataQualityEvaluationTask;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>SDFSDFSDF-SDFSDF-SDFDSF-SDFSDF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataQualityEvaluationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityEvaluationTaskResponseBody self = new GetDataQualityEvaluationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataQualityEvaluationTaskResponseBody setDataQualityEvaluationTask(GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask dataQualityEvaluationTask) {
        this.dataQualityEvaluationTask = dataQualityEvaluationTask;
        return this;
    }
    public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask getDataQualityEvaluationTask() {
        return this.dataQualityEvaluationTask;
    }

    public GetDataQualityEvaluationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskHooks extends TeaModel {
        /**
         * <p>Hook trigger condition. When this condition is met, hook action is triggered. Currently, only two conditional expressions are supported:</p>
         * <ul>
         * <li>Specify only one set of rule severity types AND rule verification status, such as <code>${severity} = = &quot;High&quot; AND ${status} = = &quot;Critical&quot;</code>, which indicates that in the executed rule, if the rule verification result of severity High is Critical, the condition is met.</li>
         * <li>Specify multiple sets of rule severity types AND rule verification status, such as <code>(${severity} = = &quot;High&quot; AND ${status} = &quot;Critical&quot;) OR (${severity} = &quot;Normal&quot; AND ${status} = &quot;Critical&quot;) OR (${severity} = &quot;Normal&quot; AND ${status} = &quot;Error&quot;)</code>, if the rule verification result of severity High is Critical, the rule verification result of severity Normal is Critical, or the rule verification result of severity Normal is Error, the enumeration that satisfies the condition expression severity is consistent with the enumeration DataQualityRule in severity, and the enumeration of status is consistent with the status in DataQualityResult.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The hook type. Only one hook type is supported.</p>
         * <ul>
         * <li>BlockTaskInstance: Blocks the running of scheduling tasks. A monitor is triggered by scheduling tasks. After a monitor finishes running, the monitor determines whether to block the running of scheduling tasks based on the hook condition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlockTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskHooks build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskHooks self = new GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskHooks();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationChannels extends TeaModel {
        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationChannels self = new GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers extends TeaModel {
        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{  &quot;atAll&quot;: true }</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The additional parameters that are required when alerts are sent. The parameters are JSON-formatted strings. The following keys are supported:</p>
         * <ul>
         * <li>atAll: specifies that all members in a group are mentioned when alerts are sent by using DingTalk. This parameter is valid only if you set ReceiverType to DingdingUrl.</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>WebhookUrl</li>
         * <li>FeishuUrl</li>
         * <li>DingdingUrl</li>
         * <li>WeixinUrl</li>
         * <li>AliUid</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DingdingUrl</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The alert recipients.</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers self = new GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotifications extends TeaModel {
        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>The configurations of alert recipients.</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers> notificationReceivers;

        public static GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotifications build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotifications self = new GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotifications();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotifications setNotificationChannels(java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotifications setNotificationReceivers(java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotifications extends TeaModel {
        /**
         * <p>The notification trigger condition. When this condition is met, a message notification is triggered. Currently, only two conditional expressions are supported:</p>
         * <ul>
         * <li>Specify only one set of rule severity types AND rule verification status, such as <code>${severity} = = &quot;High&quot; AND ${status} = = &quot;Critical&quot;</code>, which indicates that in the executed rule, if the rule verification result of severity High is Critical, the condition is met.</li>
         * <li>Specify multiple sets of rule severity types AND rule verification status, such as <code>(${severity} = = &quot;High&quot; AND ${status} = &quot;Critical&quot;) OR (${severity} = &quot;Normal&quot; AND ${status} = &quot;Critical&quot;) OR (${severity} = &quot;Normal&quot; AND ${status} = &quot;Error&quot;)</code>, if the rule verification result of severity High is Critical, the rule verification result of severity Normal is Critical, or the rule verification result of severity Normal is Error, the enumeration that satisfies the condition expression severity is consistent with the enumeration DataQualityRule in severity, and the enumeration of status is consistent with the status in DataQualityResult.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The configurations of alert notifications.</p>
         */
        @NameInMap("Notifications")
        public java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotifications> notifications;

        public static GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotifications build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotifications self = new GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotifications();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotifications setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotifications setNotifications(java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotifications> getNotifications() {
            return this.notifications;
        }

    }

    public static class GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTarget extends TeaModel {
        /**
         * <p>The type of the database to which the table belongs. Valid values:</p>
         * <ul>
         * <li>maxcompute</li>
         * <li>hologres</li>
         * <li>cdh</li>
         * <li>analyticdb_for_mysql</li>
         * <li>starrocks</li>
         * <li>emr</li>
         * <li>analyticdb_for_postgresql</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>Data quality monitoring partition range settings.</p>
         * 
         * <strong>example:</strong>
         * <p>pt=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>The ID of the table in Data Map.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.meta_open_api_test_sz.test_partition_tbl</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The type of the monitoring object.</p>
         * <ul>
         * <li>Table: Table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTarget build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTarget self = new GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTarget();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTrigger extends TeaModel {
        /**
         * <p>The IDs of scheduling tasks. This parameter is valid only if you set Type to ByScheduledTaskInstance.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The trigger type of the monitor. Valid values:</p>
         * <ul>
         * <li>ByManual: The monitor is manually triggered.</li>
         * <li>ByScheduledTaskInstance: The monitor is triggered by associated scheduling tasks.</li>
         * <li>ByQualityNode: The monitor is triggered by created data quality monitoring nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTrigger build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTrigger self = new GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTrigger();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask extends TeaModel {
        /**
         * <p>The ID of the data source used for the monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>45238</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <p>The description of the monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the quality monitoring task.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The hook.</p>
         */
        @NameInMap("Hooks")
        public java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskHooks> hooks;

        /**
         * <p>The ID of the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>2178</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the monitor.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI create a data quality monitoring test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configurations of alert notifications.</p>
         */
        @NameInMap("Notifications")
        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotifications notifications;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2626</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Extended configuration, JSON-formatted string, takes effect only for EMR-type data quality monitoring.</p>
         * <ul>
         * <li>queue: the yarn queue used when performing EMR data quality verification. The default queue is the queue configured for this project.</li>
         * <li>sqlEngine: SQL engine used when performing EMR data verification<ul>
         * <li>HIVE_ SQL</li>
         * <li>SPARK_ SQL</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
         */
        @NameInMap("RuntimeConf")
        public String runtimeConf;

        /**
         * <p>The monitored object of the monitor.</p>
         */
        @NameInMap("Target")
        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTarget target;

        /**
         * <p>The trigger configuration of the monitor.</p>
         */
        @NameInMap("Trigger")
        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTrigger trigger;

        public static GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask self = new GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask setHooks(java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskHooks> getHooks() {
            return this.hooks;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask setNotifications(GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotifications notifications) {
            this.notifications = notifications;
            return this;
        }
        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotifications getNotifications() {
            return this.notifications;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask setRuntimeConf(String runtimeConf) {
            this.runtimeConf = runtimeConf;
            return this;
        }
        public String getRuntimeConf() {
            return this.runtimeConf;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask setTarget(GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTarget target) {
            this.target = target;
            return this;
        }
        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTarget getTarget() {
            return this.target;
        }

        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask setTrigger(GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTrigger getTrigger() {
            return this.trigger;
        }

    }

}
