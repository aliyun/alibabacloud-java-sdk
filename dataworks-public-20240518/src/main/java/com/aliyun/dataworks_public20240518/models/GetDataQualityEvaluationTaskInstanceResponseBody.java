// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityEvaluationTaskInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the monitor instance.</p>
     */
    @NameInMap("DataQualityEvaluationTaskInstance")
    public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance dataQualityEvaluationTaskInstance;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataQualityEvaluationTaskInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityEvaluationTaskInstanceResponseBody self = new GetDataQualityEvaluationTaskInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataQualityEvaluationTaskInstanceResponseBody setDataQualityEvaluationTaskInstance(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance dataQualityEvaluationTaskInstance) {
        this.dataQualityEvaluationTaskInstance = dataQualityEvaluationTaskInstance;
        return this;
    }
    public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance getDataQualityEvaluationTaskInstance() {
        return this.dataQualityEvaluationTaskInstance;
    }

    public GetDataQualityEvaluationTaskInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks extends TeaModel {
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
         * <p>Hook type. Currently, only one type is supported:</p>
         * <ul>
         * <li>BlockTaskInstance: the blocking scheduling task continues to run. Data quality monitoring is triggered by the scheduling task. After the data quality monitoring is completed, the Hook.Condition is used to determine whether the blocking scheduling task continues to run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlockTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels extends TeaModel {
        /**
         * <p>The notification method.</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers extends TeaModel {
        /**
         * <p>Additional parameter settings for sending alerts in json format. The supported keys are as follows:</p>
         * <ul>
         * <li>atAll: when sending DingTalk alerts, do you need to @ everyone in the group. It takes effect when ReceiverType is DingdingUrl.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;atAll&quot;: true }</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The type of alert recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>DingdingUrl</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The recipient of the alert.</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications extends TeaModel {
        /**
         * <p>The notification method.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>The value of the receiver.</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers> notificationReceivers;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications setNotificationChannels(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications setNotificationReceivers(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications extends TeaModel {
        /**
         * <p>The notification trigger condition. When this condition is met, a message notification is triggered. Currently, only two conditional expressions are supported:</p>
         * <ul>
         * <li>Specify only one set of rule severity types AND rule verification status, such as <code>${severity} = = &quot;High&quot; AND ${status} = = &quot;Critical&quot;</code>, which indicates that in the executed rule, if the rule verification result of severity High is Critical, the condition is met.</li>
         * <li>Specify multiple sets of rule severity types AND rule verification status, such as <code>(${severity} = = &quot;High&quot; AND ${status} = &quot;Critical&quot;) OR (${severity} = &quot;Normal&quot; AND ${status} = &quot;Critical&quot;) OR (${severity} = &quot;Normal&quot; AND ${status} = &quot;Error&quot;)</code>, if the rule verification result of severity High is Critical, the rule verification result of severity Normal is Critical, or the rule verification result of severity Normal is Error, the enumeration that satisfies the condition expression severity is consistent with the enumeration DataQualityRule in severity, and the enumeration of status is consistent with the status in DataQualityResult.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("Notifications")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications> notifications;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications setNotifications(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotifications> getNotifications() {
            return this.notifications;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget extends TeaModel {
        /**
         * <p>The type of the database to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The partition range monitored.</p>
         * 
         * <strong>example:</strong>
         * <p>pt=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>The unique ID of the table in the data map.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.api_trace.ods_d_api_log</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The type of the monitoring object.</p>
         * <ul>
         * <li>Table: Table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger extends TeaModel {
        /**
         * <p>The Id list of the scheduled task, which is valid when the Type is ByScheduledTaskInstance.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>Quality Monitoring trigger type:</p>
         * <ul>
         * <li>ByManual: manually triggered. Default value</li>
         * <li>ByScheduledTaskInstance: triggered by associated scheduling tasks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask extends TeaModel {
        /**
         * <p>The description of the monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI quality monitoring test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Callback settings.</p>
         */
        @NameInMap("Hooks")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks> hooks;

        /**
         * <p>The ID of the data quality monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>28544990</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>Data quality OpenAPI monitoring test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configurations of alert notifications.</p>
         */
        @NameInMap("Notifications")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications notifications;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>20629</p>
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
         * <p>{ &quot;queue&quot;: &quot;default&quot; }</p>
         */
        @NameInMap("RuntimeConf")
        public String runtimeConf;

        /**
         * <p>For more information, see DataQualityTarget monitoring objects for the sample data quality verification task. For more information, see DataQualityTarget.</p>
         */
        @NameInMap("Target")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget target;

        /**
         * <p>The trigger configuration of the data quality verification task.</p>
         */
        @NameInMap("Trigger")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger trigger;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setHooks(java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks> getHooks() {
            return this.hooks;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setNotifications(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications notifications) {
            this.notifications = notifications;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications getNotifications() {
            return this.notifications;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setRuntimeConf(String runtimeConf) {
            this.runtimeConf = runtimeConf;
            return this;
        }
        public String getRuntimeConf() {
            return this.runtimeConf;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setTarget(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget target) {
            this.target = target;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget getTarget() {
            return this.target;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask setTrigger(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1716344665000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The end time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1716344665000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The ID of the data quality monitoring instance.</p>
         * 
         * <strong>example:</strong>
         * <p>7234231689</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Data quality verification execution parameters in JSON format. The available keys are as follows:</p>
         * <ul>
         * <li>triggerTime: the millisecond timestamp of the trigger time. The baseline time of the $[yyyymmdd] expression in the data range of data quality monitoring. Required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;triggerTime&quot;: 1733284062000 }</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>98330</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The status of the data quality monitoring instance.</p>
         * <ul>
         * <li>Running: Verifying</li>
         * <li>Error: A rule verification Error occurred.</li>
         * <li>Passed: all rules are verified</li>
         * <li>Warned: normal alarm threshold triggered by rules</li>
         * <li>Critical: Threshold for serious alerts triggered by rules</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Passed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The monitor.</p>
         */
        @NameInMap("Task")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask task;

        /**
         * <p>The context information when the instance is triggered, in JSON format. The possible keys are as follows:</p>
         * <ul>
         * <li>TriggerClient: the trigger source of the data quality monitoring instance, such as CWF2 (scheduling system), may be added later.</li>
         * <li>TriggerClientId: associated with a specific business resource in the source system. For example, if TriggerClient is CWF2, the ID of the scheduling task is recorded here.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;triggerClient&quot;: &quot;CWF2&quot;, &quot;triggerClientId&quot;: 70001238945 }</p>
         */
        @NameInMap("TriggerContext")
        public String triggerContext;

        public static GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance self = new GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance();
            return TeaModel.build(map, self);
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setTask(GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask task) {
            this.task = task;
            return this;
        }
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask getTask() {
            return this.task;
        }

        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance setTriggerContext(String triggerContext) {
            this.triggerContext = triggerContext;
            return this;
        }
        public String getTriggerContext() {
            return this.triggerContext;
        }

    }

}
