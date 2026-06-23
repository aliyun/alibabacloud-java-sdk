// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityEvaluationTasksResponseBody extends TeaModel {
    /**
     * <p>质量校验任务分页查询结果</p>
     */
    @NameInMap("PagingInfo")
    public ListDataQualityEvaluationTasksResponseBodyPagingInfo pagingInfo;

    /**
     * <p>API请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityEvaluationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityEvaluationTasksResponseBody self = new ListDataQualityEvaluationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityEvaluationTasksResponseBody setPagingInfo(ListDataQualityEvaluationTasksResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDataQualityEvaluationTasksResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDataQualityEvaluationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks extends TeaModel {
        /**
         * <p>Hook触发条件</p>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>后续处理动作类型</p>
         * <ul>
         * <li>BlockTaskInstance：阻塞DataWorks任务实例执行</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlockTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels extends TeaModel {
        /**
         * <p>告警方式</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers extends TeaModel {
        /**
         * <p>扩展信息，格式为 json，例如钉钉机器人支持 at 所有人</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>告警接收人类型</p>
         * <ul>
         * <li>AliUid - 阿里云账号Uid</li>
         * <li>WebhookUrl - 自定义 webhook URL</li>
         * <li>DingdingUrl - 钉钉机器人Url</li>
         * <li>FeishuUrl - 飞书机器人Url</li>
         * <li>WeixinUrl - 企微机器人Url</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliUid</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>告警接收人具体值</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications extends TeaModel {
        /**
         * <p>告警方式配置</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>告警接收人配置</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers> notificationReceivers;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications setNotificationChannels(java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications setNotificationReceivers(java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotificationsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications extends TeaModel {
        /**
         * <p>Notification触发条件</p>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>具体的告警设置</p>
         */
        @NameInMap("Notifications")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications> notifications;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications setNotifications(java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotificationsNotifications> getNotifications() {
            return this.notifications;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget extends TeaModel {
        /**
         * <p>表类型的数据集，表所属的数据库类型</p>
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
         * <p>分区表的分区设置</p>
         * 
         * <strong>example:</strong>
         * <p>ds=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>表在数据地图中的唯一ID</p>
         * 
         * <strong>example:</strong>
         * <p>odps.unit_test.tb_unit_test</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>监控对象类型</p>
         * <ul>
         * <li>Table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger extends TeaModel {
        /**
         * <p>type=ByScheduledTaskInstance时生效
         * ,具体指明哪些调度节点的实例执行成功后可以触发</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>何种事件可以触发质量校验任务执行</p>
         * <ul>
         * <li>ByScheduledTaskInstance：调度实例运行成功</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks extends TeaModel {
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <p>数据质量校验任务描述，最长65535个字符</p>
         * 
         * <strong>example:</strong>
         * <p>This is a daily run data quality evaluation plan</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>数据质量校验任务实例生命周期中的回调设置，目前只支持一个阻塞调度任务的Hook</p>
         */
        @NameInMap("Hooks")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks> hooks;

        /**
         * <p>数据质量校验任务ID</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>数据质量校验任务名称，数字、英文字母、汉字、半角全角标点符号组合，最长255个字符。</p>
         * 
         * <strong>example:</strong>
         * <p>Data quality verification task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>告警配置</p>
         */
        @NameInMap("Notifications")
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications notifications;

        /**
         * <p>DataWorks工作空间ID</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>使用数据源时的一些设置，目前只支持指定EMR的yarn队列、采集EMR表时SQL引擎指定为SPARK_SQL|KYUUBI|PRESTO_SQL|HIVE_SQL</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
         */
        @NameInMap("RuntimeConf")
        public String runtimeConf;

        /**
         * <p>数据质量校验任务的监控对象</p>
         */
        @NameInMap("Target")
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget target;

        /**
         * <p>数据质量校验任务的触发配置</p>
         */
        @NameInMap("Trigger")
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger trigger;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks self = new ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setHooks(java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksHooks> getHooks() {
            return this.hooks;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setNotifications(ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications notifications) {
            this.notifications = notifications;
            return this;
        }
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksNotifications getNotifications() {
            return this.notifications;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setRuntimeConf(String runtimeConf) {
            this.runtimeConf = runtimeConf;
            return this;
        }
        public String getRuntimeConf() {
            return this.runtimeConf;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setTarget(ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget target) {
            this.target = target;
            return this;
        }
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTarget getTarget() {
            return this.target;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks setTrigger(ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasksTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class ListDataQualityEvaluationTasksResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>质量校验任务</p>
         */
        @NameInMap("DataQualityEvaluationTasks")
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks> dataQualityEvaluationTasks;

        /**
         * <p>页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <p>页大小</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>总条数</p>
         * 
         * <strong>example:</strong>
         * <p>131</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static ListDataQualityEvaluationTasksResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityEvaluationTasksResponseBodyPagingInfo self = new ListDataQualityEvaluationTasksResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfo setDataQualityEvaluationTasks(java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks> dataQualityEvaluationTasks) {
            this.dataQualityEvaluationTasks = dataQualityEvaluationTasks;
            return this;
        }
        public java.util.List<ListDataQualityEvaluationTasksResponseBodyPagingInfoDataQualityEvaluationTasks> getDataQualityEvaluationTasks() {
            return this.dataQualityEvaluationTasks;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfo setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfo setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityEvaluationTasksResponseBodyPagingInfo setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
