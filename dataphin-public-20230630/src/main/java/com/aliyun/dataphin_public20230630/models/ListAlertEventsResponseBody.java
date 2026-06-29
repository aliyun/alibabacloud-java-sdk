// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAlertEventsResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
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
     * <p>Indicates whether the request was successful.</p>
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
         * <li>ALL: all</li>
         * <li>DQE: data quality</li>
         * <li>OS: data service</li>
         * <li>STREAM: real-time computing</li>
         * <li>VDM_BATCH: offline computing</li>
         * <li>SOP: O&amp;M platform</li>
         * <li>REAL_TIME_PIPELINE: real-time integration</li>
         * <li>KGB: baseline monitoring</li>
         * </ul>
         * <p>and more.</p>
         * 
         * <strong>example:</strong>
         * <p>VDM_BATCH</p>
         */
        @NameInMap("SourceSystemType")
        public String sourceSystemType;

        /**
         * <p>The alert object type. Valid values:</p>
         * <ul>
         * <li>OS_API: API operation</li>
         * <li>OS_APPLICATION_SERVICE: service application</li>
         * <li>STREAM_TASK: real-time computing</li>
         * <li>REAL_TIME_PIPELINE_TASK: real-time integration</li>
         * <li>VDM_BATCH_SHELL: SHELL</li>
         * <li>VDM_BATCH_PYTHON: PYTHON</li>
         * <li>VDM_BATCH_DATAX: DATAX</li>
         * <li>VDM_BATCH_DLINK: DLINK</li>
         * <li>VDM_BATCH_VIRTUAL: VIRTUAL</li>
         * <li>VDM_BATCH_PYTHON37: PYTHON37</li>
         * <li>VDM_BATCH_PYTHON311: PYTHON311</li>
         * <li>VDM_BATCH_MAX_COMPUTE_SQL: MAXCOMPUTE_SQL</li>
         * <li>VDM_BATCH_MAX_COMPUTE_MR: MAXCOMPUTE_MR</li>
         * <li>VDM_BATCH_SPARK_JAR_ON_MAX_COMPUTE: SPARK_JAR_ON_MAX_COMPUTE</li>
         * <li>VDM_BATCH_HIVE_SQL: HIVE_SQL</li>
         * <li>VDM_BATCH_HADOOP_MR: HADOOP_MR</li>
         * <li>VDM_BATCH_SPARK_JAR_ON_HIVE: SPARK_JAR_ON_HIVE</li>
         * <li>VDM_BATCH_SPARK_SQL_ON_HIVE: SPARK_SQL_ON_HIVE</li>
         * <li>VDM_BATCH_SPARK_SQL: VDM_BATCH_SPARK_SQL</li>
         * <li>DQE_LOGICAL_TABLE: logical table</li>
         * <li>DQE_PHYSICAL_TABLE: physical table</li>
         * <li>DQE_REALTIME_TABLE: real-time metadata table</li>
         * <li>DQE_DATA_SOURCE: data source</li>
         * <li>DQE_INDEX: metric</li>
         * <li>QD_DECISION_INVOKE: QD decision invocation</li>
         * <li>BASELINE: baseline</li>
         * </ul>
         * <p>and more.</p>
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
         * <p>The name of the alert reason parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>biz_date</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the alert reason parameter.</p>
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
         * <p>The list of alert reason parameters.</p>
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
         * <p>The alert reason type. Valid values:</p>
         * <ul>
         * <li>DQE_COLUMN: field rule exception</li>
         * <li>DQE_DATA_SOURCE: data source rule exception</li>
         * <li>DQE_CUSTOMIZE: custom rule exception</li>
         * <li>DQE_TABLE: table rule exception</li>
         * <li>DQE_REALTIME_TABLE: real-time table rule exception</li>
         * <li>DQE_INDEX: metric rule exception</li>
         * <li>OS_AVG_RESPONSE: average response time exception</li>
         * <li>OS_CALL_TIMES: call count exception</li>
         * <li>OS_ERROR_RATE: error rate exception</li>
         * <li>OS_OFFLINE: Offline percentage exception</li>
         * <li>STREAM_BIZ_DELAY: business delay too high</li>
         * <li>STREAM_DATA_RETENTION: data retention exceeds configuration</li>
         * <li>STREAM_MORE_THAN_FAILURE: failure frequency exceeds configuration</li>
         * <li>STREAM_TPS_OUT_RANGE: TPS out of range</li>
         * <li>STREAM_CHECKPOINT_FAILURE: checkpoint failures exceed configuration</li>
         * <li>STREAM_BACKPRESSURE: backpressure duration exceeds configuration</li>
         * <li>STREAM_JOB_FAILURE: job failure</li>
         * <li>VDM_BATCH_ERROR: error</li>
         * <li>VDM_BATCH_FINISH: completed</li>
         * <li>VDM_BATCH_TIME_OUT: execution timeout</li>
         * <li>VDM_BATCH_UNDONE: incomplete</li>
         * <li>VDM_BATCH_LOGIC_DATA_DELAY: data delay</li>
         * <li>QD_DECISION_CALL_TIMES: decision call count exception</li>
         * <li>QD_DECISION_MAX_RESPONSE: maximum response time exception</li>
         * <li>QD_DECISION_ERROR_RATE: error rate exception</li>
         * <li>QD_DECISION_PARAM_COUNT: decision parameter count exception</li>
         * <li>QD_DECISION_PARAM_PERCENTAGE: decision parameter percentage exception</li>
         * <li>QD_DECISION_PARAM_SUM: decision parameter sum exception</li>
         * <li>QD_DECISION_PARAM_AVG: decision parameter average exception</li>
         * <li>LOGICAL_INSTANCE_GENERATION: logical instance generation monitoring</li>
         * <li>KGB_TASK_ERROR: baseline task error</li>
         * <li>KGB_TASK_SLOW_DOWN: baseline task slowdown</li>
         * <li>KGB_EARLY_WARNING: baseline early warning</li>
         * <li>KGB_BROKEN_LINE: baseline breach</li>
         * </ul>
         * <p>and more.</p>
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
         * <p>The type of the alert receiver. Valid values:</p>
         * <ul>
         * <li>ON_CALL_TABLE: on-call schedule</li>
         * <li>USER_DEFINED: custom user</li>
         * <li>OWNER: owner.</li>
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
         * <li>ONCE: instant alert</li>
         * <li>PERIOD: periodic alert. Format: 1HOUR, 1MINUTE, 1SECOND.</li>
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
         * <p>The alert reason.</p>
         */
        @NameInMap("AlertReason")
        public ListAlertEventsResponseBodyListResultDataAlertReason alertReason;

        /**
         * <p>The list of alert receivers.</p>
         */
        @NameInMap("AlertReceiverList")
        public java.util.List<ListAlertEventsResponseBodyListResultDataAlertReceiverList> alertReceiverList;

        /**
         * <p>The project to which the alert belongs.</p>
         */
        @NameInMap("BelongProject")
        public ListAlertEventsResponseBodyListResultDataBelongProject belongProject;

        /**
         * <p>The expiration time of the do-not-disturb period.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-25 00:00:00</p>
         */
        @NameInMap("DoNotDisturbEndTime")
        public String doNotDisturbEndTime;

        /**
         * <p>The time of the first alert.</p>
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
         * <p>The time of the latest alert.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-25 10:02:47</p>
         */
        @NameInMap("LatestAlertTime")
        public String latestAlertTime;

        /**
         * <p>The alert status. Valid values:</p>
         * <ul>
         * <li>ALERTING: alerting</li>
         * <li>DO_NOT_DISTURB: do not disturb</li>
         * <li>SILENCING: alerting (cool-down period)</li>
         * <li>FINISH: completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINISH</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of alert occurrences.</p>
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
         * <p>The alert event query results.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListAlertEventsResponseBodyListResultData> data;

        /**
         * <p>The total number of entries.</p>
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
