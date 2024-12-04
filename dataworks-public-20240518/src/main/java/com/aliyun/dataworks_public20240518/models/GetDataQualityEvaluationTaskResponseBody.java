// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityEvaluationTaskResponseBody extends TeaModel {
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
         * <p>Hook触发条件</p>
         * 
         * <strong>example:</strong>
         * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>Hook类型</p>
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
         * <p>通知方式</p>
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
         * <p>扩展信息，格式为 json，例如钉钉机器人支持 at 所有人</p>
         * 
         * <strong>example:</strong>
         * <p>{  &quot;atAll&quot;: true }</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>告警接收人类型</p>
         * 
         * <strong>example:</strong>
         * <p>DingdingUrl</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>告警接收人</p>
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
         * <p>通知方式</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>告警接收人设置</p>
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
         * <p>通知触发条件</p>
         * 
         * <strong>example:</strong>
         * <p>(${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Critical&quot;) OR (${severity} == &quot;Normal&quot; AND ${status} == &quot;Error&quot;)</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>具体的消息通知设置</p>
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
         * <p>表所属的数据库类型</p>
         * 
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
         * <p>表在数据地图中的唯一ID</p>
         * 
         * <strong>example:</strong>
         * <p>odps.meta_open_api_test_sz.test_partition_tbl</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>监控对象类型</p>
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
         * <p>具体指明哪些调度节点的实例执行成功后可以触发</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>何种事件可以触发质量校验任务执行</p>
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
         * <p>质量监控任务描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>数据质量校验任务实例生命周期中的回调设置，目前只支持一个阻塞调度任务的Hook</p>
         */
        @NameInMap("Hooks")
        public java.util.List<GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskHooks> hooks;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>2178</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>质量监控任务名称</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>数据质量校验任务通知订阅配置</p>
         */
        @NameInMap("Notifications")
        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskNotifications notifications;

        /**
         * <p>项目空间Id</p>
         * 
         * <strong>example:</strong>
         * <p>2626</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>使用数据源时的一些设置，目前只支持指定EMR的yarn队列、采集EMR表时把SQL引擎指定为SPARK-SQL</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
         */
        @NameInMap("RuntimeConf")
        public String runtimeConf;

        /**
         * <p>参看 DataQualityTarget示例	数据质量校验任务的监控对象，参考 DataQualityTarget</p>
         */
        @NameInMap("Target")
        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTarget target;

        /**
         * <p>数据质量校验任务的触发配置</p>
         */
        @NameInMap("Trigger")
        public GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTaskTrigger trigger;

        public static GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask self = new GetDataQualityEvaluationTaskResponseBodyDataQualityEvaluationTask();
            return TeaModel.build(map, self);
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
