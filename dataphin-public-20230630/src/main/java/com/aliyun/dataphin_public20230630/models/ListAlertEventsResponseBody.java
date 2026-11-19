// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAlertEventsResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request is normal.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("ListResult")
    public ListAlertEventsResponseBodyListResult listResult;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAlertEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertEventsResponseBody self = new ListAlertEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAlertEventsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAlertEventsResponseBody setListResult(ListAlertEventsResponseBodyListResult listResult) {
        this.listResult = listResult;
        return this;
    }
    public ListAlertEventsResponseBodyListResult getListResult() {
        return this.listResult;
    }

    public ListAlertEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlertEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlertEventsResponseBodyListResultDataAlertObject extends TeaModel {
        /**
         * <p>The name of the alert object.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The source system. Valid values:</p>
         * <ul>
         * <li>ALL: All.</li>
         * <li>DQE: Data quality.</li>
         * <li>OS: Data service.</li>
         * <li>STREAM: Real-time computing.</li>
         * <li>VDM_BATCH: Offline computing.</li>
         * <li>SOP: O&amp;M platform.</li>
         * <li>REAL_TIME_PIPELINE: Real-time integration.</li>
         * <li>KGB: Baseline monitoring.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VDM_BATCH</p>
         */
        @NameInMap("SourceSystemType")
        public String sourceSystemType;

        /**
         * <p>The alert object type. Valid values:</p>
         * <ul>
         * <li>OS_API: API operation.</li>
         * <li>OS_APPLICATION_SERVICE: Service application.</li>
         * <li>STREAM_TASK: Real-time computing.</li>
         * <li>REAL_TIME_PIPELINE_TASK: Real-time integration.</li>
         * <li>VDM_BATCH_SHELL: SHELL.</li>
         * <li>VDM_BATCH_PYTHON: PYTHON.</li>
         * <li>VDM_BATCH_DATAX: DATAX.</li>
         * <li>VDM_BATCH_DLINK: DLINK.</li>
         * <li>VDM_BATCH_VIRTUAL: VIRTUAL.</li>
         * <li>VDM_BATCH_PYTHON37: PYTHON37.</li>
         * <li>VDM_BATCH_PYTHON311: PYTHON311.</li>
         * <li>VDM_BATCH_MAX_COMPUTE_SQL: MAXCOMPUTE_SQL.</li>
         * <li>VDM_BATCH_MAX_COMPUTE_MR: MAXCOMPUTE_MR.</li>
         * <li>VDM_BATCH_SPARK_JAR_ON_MAX_COMPUTE: SPARK_JAR_ON_MAX_COMPUTE.</li>
         * <li>VDM_BATCH_HIVE_SQL: HIVE_SQL.</li>
         * <li>VDM_BATCH_HADOOP_MR: HADOOP_MR.</li>
         * <li>VDM_BATCH_SPARK_JAR_ON_HIVE: SPARK_JAR_ON_HIVE.</li>
         * <li>VDM_BATCH_SPARK_SQL_ON_HIVE: SPARK_SQL_ON_HIVE.</li>
         * <li>VDM_BATCH_SPARK_SQL: VDM_BATCH_SPARK_SQL.</li>
         * <li>DQE_LOGICAL_TABLE: Logical table.</li>
         * <li>DQE_PHYSICAL_TABLE: Physical table.</li>
         * <li>DQE_REALTIME_TABLE: Real-time metadata table.</li>
         * <li>DQE_DATA_SOURCE: Data source.</li>
         * <li>DQE_INDEX: Metric.</li>
         * <li>QD_DECISION_INVOKE: QD decision invocation.</li>
         * <li>BASELINE: Baseline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STREAM_TASK</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAlertEventsResponseBodyListResultDataAlertObject build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataAlertObject self = new ListAlertEventsResponseBodyListResultDataAlertObject();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataAlertObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlertEventsResponseBodyListResultDataAlertObject setSourceSystemType(String sourceSystemType) {
            this.sourceSystemType = sourceSystemType;
            return this;
        }
        public String getSourceSystemType() {
            return this.sourceSystemType;
        }

        public ListAlertEventsResponseBodyListResultDataAlertObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList extends TeaModel {
        /**
         * <p>The name of the alert cause parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>biz_date</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the alert cause parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-24 00:00:00</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList self = new ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAlertEventsResponseBodyListResultDataAlertReason extends TeaModel {
        /**
         * <p>The list of alert cause parameters.</p>
         */
        @NameInMap("AlertReasonParamList")
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList> alertReasonParamList;

        /**
         * <p>The business date.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-25 10:02:47</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The alert cause. Valid values:</p>
         * <ul>
         * <li>DQE_COLUMN: Field rule exception.</li>
         * <li>DQE_DATA_SOURCE: Data source rule exception.</li>
         * <li>DQE_CUSTOMIZE: Custom rule exception.</li>
         * <li>DQE_TABLE: Table rule exception.</li>
         * <li>DQE_REALTIME_TABLE: Real-time table rule exception.</li>
         * <li>DQE_INDEX: Metric rule exception.</li>
         * <li>OS_AVG_RESPONSE: Average response time exception.</li>
         * <li>OS_CALL_TIMES: Call count exception.</li>
         * <li>OS_ERROR_RATE: Error rate exception.</li>
         * <li>OS_OFFLINE: Offline percentage exception.</li>
         * <li>STREAM_BIZ_DELAY: High business delay.</li>
         * <li>STREAM_DATA_RETENTION: Data retention exceeds configuration.</li>
         * <li>STREAM_MORE_THAN_FAILURE: Failure frequency exceeds configuration.</li>
         * <li>STREAM_TPS_OUT_RANGE: TPS out of range.</li>
         * <li>STREAM_CHECKPOINT_FAILURE: Checkpoint failures exceed configuration.</li>
         * <li>STREAM_BACKPRESSURE: Backpressure duration exceeds configuration.</li>
         * <li>STREAM_JOB_FAILURE: Run failure.</li>
         * <li>VDM_BATCH_ERROR: Error.</li>
         * <li>VDM_BATCH_FINISH: Completed.</li>
         * <li>VDM_BATCH_TIME_OUT: Run timeout.</li>
         * <li>VDM_BATCH_UNDONE: Uncompleted.</li>
         * <li>VDM_BATCH_LOGIC_DATA_DELAY: Data delay.</li>
         * <li>QD_DECISION_CALL_TIMES: Decision call count exception.</li>
         * <li>QD_DECISION_MAX_RESPONSE: Maximum response time exception.</li>
         * <li>QD_DECISION_ERROR_RATE: Error rate exception.</li>
         * <li>QD_DECISION_PARAM_COUNT: Decision parameter count exception.</li>
         * <li>QD_DECISION_PARAM_PERCENTAGE: Decision parameter percentage exception.</li>
         * <li>QD_DECISION_PARAM_SUM: Decision parameter sum exception.</li>
         * <li>QD_DECISION_PARAM_AVG: Decision parameter average exception.</li>
         * <li>LOGICAL_INSTANCE_GENERATION: Logical instance generation monitoring.</li>
         * <li>KGB_TASK_ERROR: Baseline task error.</li>
         * <li>KGB_TASK_SLOW_DOWN: Baseline task slowdown.</li>
         * <li>KGB_EARLY_WARNING: Baseline early warning.</li>
         * <li>KGB_BROKEN_LINE: Baseline breach.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VDM_BATCH_FINISH</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The unique identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>t_6340134343289405440_20241124_639873707610</p>
         */
        @NameInMap("UniqueKey")
        public String uniqueKey;

        public static ListAlertEventsResponseBodyListResultDataAlertReason build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataAlertReason self = new ListAlertEventsResponseBodyListResultDataAlertReason();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataAlertReason setAlertReasonParamList(java.util.List<ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList> alertReasonParamList) {
            this.alertReasonParamList = alertReasonParamList;
            return this;
        }
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReasonAlertReasonParamList> getAlertReasonParamList() {
            return this.alertReasonParamList;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReason setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReason setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReason setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

    }

    public static class ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList extends TeaModel {
        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList self = new ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAlertEventsResponseBodyListResultDataAlertReceiverList extends TeaModel {
        /**
         * <p>The list of alert channel types.</p>
         */
        @NameInMap("AlertChannelTypeList")
        public java.util.List<String> alertChannelTypeList;

        /**
         * <p>The list of custom alert channel IDs.</p>
         */
        @NameInMap("CustomAlertChannelIdList")
        public java.util.List<String> customAlertChannelIdList;

        /**
         * <p>The name of the on-call schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OnCallTableName")
        public String onCallTableName;

        /**
         * <p>The type of the alert recipient. Valid values:</p>
         * <ul>
         * <li>ON_CALL_TABLE: On-call schedule.</li>
         * <li>USER_DEFINED: Custom user.</li>
         * <li>OWNER: Owner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The list of alert users.</p>
         */
        @NameInMap("UserList")
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList> userList;

        public static ListAlertEventsResponseBodyListResultDataAlertReceiverList build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataAlertReceiverList self = new ListAlertEventsResponseBodyListResultDataAlertReceiverList();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataAlertReceiverList setAlertChannelTypeList(java.util.List<String> alertChannelTypeList) {
            this.alertChannelTypeList = alertChannelTypeList;
            return this;
        }
        public java.util.List<String> getAlertChannelTypeList() {
            return this.alertChannelTypeList;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReceiverList setCustomAlertChannelIdList(java.util.List<String> customAlertChannelIdList) {
            this.customAlertChannelIdList = customAlertChannelIdList;
            return this;
        }
        public java.util.List<String> getCustomAlertChannelIdList() {
            return this.customAlertChannelIdList;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReceiverList setOnCallTableName(String onCallTableName) {
            this.onCallTableName = onCallTableName;
            return this;
        }
        public String getOnCallTableName() {
            return this.onCallTableName;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReceiverList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlertEventsResponseBodyListResultDataAlertReceiverList setUserList(java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverListUserList> getUserList() {
            return this.userList;
        }

    }

    public static class ListAlertEventsResponseBodyListResultDataBelongProject extends TeaModel {
        /**
         * <p>The business unit name.</p>
         * 
         * <strong>example:</strong>
         * <p>biz_1</p>
         */
        @NameInMap("BizName")
        public String bizName;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>project_1</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static ListAlertEventsResponseBodyListResultDataBelongProject build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataBelongProject self = new ListAlertEventsResponseBodyListResultDataBelongProject();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataBelongProject setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public ListAlertEventsResponseBodyListResultDataBelongProject setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class ListAlertEventsResponseBodyListResultDataUrlConfig extends TeaModel {
        /**
         * <p>The URL of the alert configuration page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dataphin.com/ops/test3">https://dataphin.com/ops/test3</a></p>
         */
        @NameInMap("AlertConfigUrl")
        public String alertConfigUrl;

        /**
         * <p>The URL of the log page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dataphin.com/ops/test2">https://dataphin.com/ops/test2</a></p>
         */
        @NameInMap("LogUrl")
        public String logUrl;

        /**
         * <p>The URL of the alert object page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dataphin.com/ops/test1">https://dataphin.com/ops/test1</a></p>
         */
        @NameInMap("ObjectUrl")
        public String objectUrl;

        public static ListAlertEventsResponseBodyListResultDataUrlConfig build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultDataUrlConfig self = new ListAlertEventsResponseBodyListResultDataUrlConfig();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultDataUrlConfig setAlertConfigUrl(String alertConfigUrl) {
            this.alertConfigUrl = alertConfigUrl;
            return this;
        }
        public String getAlertConfigUrl() {
            return this.alertConfigUrl;
        }

        public ListAlertEventsResponseBodyListResultDataUrlConfig setLogUrl(String logUrl) {
            this.logUrl = logUrl;
            return this;
        }
        public String getLogUrl() {
            return this.logUrl;
        }

        public ListAlertEventsResponseBodyListResultDataUrlConfig setObjectUrl(String objectUrl) {
            this.objectUrl = objectUrl;
            return this;
        }
        public String getObjectUrl() {
            return this.objectUrl;
        }

    }

    public static class ListAlertEventsResponseBodyListResultData extends TeaModel {
        /**
         * <p>The alert frequency. Valid values:</p>
         * <ul>
         * <li>ONCE: Immediate alert.</li>
         * <li>PERIOD: Periodic alert. Format: 1HOUR, 1MINUTE, 1SECOND.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONCE</p>
         */
        @NameInMap("AlertFrequency")
        public String alertFrequency;

        /**
         * <p>The alert object.</p>
         */
        @NameInMap("AlertObject")
        public ListAlertEventsResponseBodyListResultDataAlertObject alertObject;

        /**
         * <p>The alert cause.</p>
         */
        @NameInMap("AlertReason")
        public ListAlertEventsResponseBodyListResultDataAlertReason alertReason;

        /**
         * <p>The list of alert recipients.</p>
         */
        @NameInMap("AlertReceiverList")
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverList> alertReceiverList;

        /**
         * <p>The project.</p>
         */
        @NameInMap("BelongProject")
        public ListAlertEventsResponseBodyListResultDataBelongProject belongProject;

        /**
         * <p>The expiration time of the do-not-disturb mode.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-25 00:00:00</p>
         */
        @NameInMap("DoNotDisturbEndTime")
        public String doNotDisturbEndTime;

        /**
         * <p>The first alert time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-25 10:02:47</p>
         */
        @NameInMap("FirstAlertTime")
        public String firstAlertTime;

        /**
         * <p>The alert event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The latest alert time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-25 10:02:47</p>
         */
        @NameInMap("LatestAlertTime")
        public String latestAlertTime;

        /**
         * <p>The alert status. Valid values:</p>
         * <ul>
         * <li>ALERTING: Alerting.</li>
         * <li>DO_NOT_DISTURB: Do not disturb.</li>
         * <li>SILENCING: Alerting (silenced).</li>
         * <li>FINISH: Completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINISH</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalAlertTimes")
        public Long totalAlertTimes;

        /**
         * <p>The URL information.</p>
         */
        @NameInMap("UrlConfig")
        public ListAlertEventsResponseBodyListResultDataUrlConfig urlConfig;

        public static ListAlertEventsResponseBodyListResultData build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResultData self = new ListAlertEventsResponseBodyListResultData();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResultData setAlertFrequency(String alertFrequency) {
            this.alertFrequency = alertFrequency;
            return this;
        }
        public String getAlertFrequency() {
            return this.alertFrequency;
        }

        public ListAlertEventsResponseBodyListResultData setAlertObject(ListAlertEventsResponseBodyListResultDataAlertObject alertObject) {
            this.alertObject = alertObject;
            return this;
        }
        public ListAlertEventsResponseBodyListResultDataAlertObject getAlertObject() {
            return this.alertObject;
        }

        public ListAlertEventsResponseBodyListResultData setAlertReason(ListAlertEventsResponseBodyListResultDataAlertReason alertReason) {
            this.alertReason = alertReason;
            return this;
        }
        public ListAlertEventsResponseBodyListResultDataAlertReason getAlertReason() {
            return this.alertReason;
        }

        public ListAlertEventsResponseBodyListResultData setAlertReceiverList(java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverList> alertReceiverList) {
            this.alertReceiverList = alertReceiverList;
            return this;
        }
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverList> getAlertReceiverList() {
            return this.alertReceiverList;
        }

        public ListAlertEventsResponseBodyListResultData setBelongProject(ListAlertEventsResponseBodyListResultDataBelongProject belongProject) {
            this.belongProject = belongProject;
            return this;
        }
        public ListAlertEventsResponseBodyListResultDataBelongProject getBelongProject() {
            return this.belongProject;
        }

        public ListAlertEventsResponseBodyListResultData setDoNotDisturbEndTime(String doNotDisturbEndTime) {
            this.doNotDisturbEndTime = doNotDisturbEndTime;
            return this;
        }
        public String getDoNotDisturbEndTime() {
            return this.doNotDisturbEndTime;
        }

        public ListAlertEventsResponseBodyListResultData setFirstAlertTime(String firstAlertTime) {
            this.firstAlertTime = firstAlertTime;
            return this;
        }
        public String getFirstAlertTime() {
            return this.firstAlertTime;
        }

        public ListAlertEventsResponseBodyListResultData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAlertEventsResponseBodyListResultData setLatestAlertTime(String latestAlertTime) {
            this.latestAlertTime = latestAlertTime;
            return this;
        }
        public String getLatestAlertTime() {
            return this.latestAlertTime;
        }

        public ListAlertEventsResponseBodyListResultData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAlertEventsResponseBodyListResultData setTotalAlertTimes(Long totalAlertTimes) {
            this.totalAlertTimes = totalAlertTimes;
            return this;
        }
        public Long getTotalAlertTimes() {
            return this.totalAlertTimes;
        }

        public ListAlertEventsResponseBodyListResultData setUrlConfig(ListAlertEventsResponseBodyListResultDataUrlConfig urlConfig) {
            this.urlConfig = urlConfig;
            return this;
        }
        public ListAlertEventsResponseBodyListResultDataUrlConfig getUrlConfig() {
            return this.urlConfig;
        }

    }

    public static class ListAlertEventsResponseBodyListResult extends TeaModel {
        /**
         * <p>The alert event query result.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListAlertEventsResponseBodyListResultData> data;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAlertEventsResponseBodyListResult build(java.util.Map<String, ?> map) throws Exception {
            ListAlertEventsResponseBodyListResult self = new ListAlertEventsResponseBodyListResult();
            return TeaModel.build(map, self);
        }

        public ListAlertEventsResponseBodyListResult setData(java.util.List<ListAlertEventsResponseBodyListResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListAlertEventsResponseBodyListResultData> getData() {
            return this.data;
        }

        public ListAlertEventsResponseBodyListResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
