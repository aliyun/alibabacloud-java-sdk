// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityEvaluationTaskInstanceResponseBody extends TeaModel {
    @NameInMap("DataQualityEvaluationTaskInstance")
    public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstance dataQualityEvaluationTaskInstance;

    /**
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
         * <strong>example:</strong>
         * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
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
         * <strong>example:</strong>
         * <p>{ &quot;atAll&quot;: true }</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>DingdingUrl</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

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
        @NameInMap("NotificationChannels")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotificationsNotificationsNotificationChannels> notificationChannels;

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
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

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
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <strong>example:</strong>
         * <p>pt=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <strong>example:</strong>
         * <p>odps.api_trace.ods_d_api_log</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
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
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
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
        @NameInMap("Description")
        public String description;

        @NameInMap("Hooks")
        public java.util.List<GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskHooks> hooks;

        /**
         * <strong>example:</strong>
         * <p>28544990</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Notifications")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskNotifications notifications;

        /**
         * <strong>example:</strong>
         * <p>20629</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>{ &quot;queue&quot;: &quot;default&quot; }</p>
         */
        @NameInMap("RuntimeConf")
        public String runtimeConf;

        @NameInMap("Target")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTaskTarget target;

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
         * <strong>example:</strong>
         * <p>1716344665000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1716344665000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <strong>example:</strong>
         * <p>7234231689</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>{ &quot;triggerTime&quot;: 1733284062000 }</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <strong>example:</strong>
         * <p>98330</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>Passed</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Task")
        public GetDataQualityEvaluationTaskInstanceResponseBodyDataQualityEvaluationTaskInstanceTask task;

        /**
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
