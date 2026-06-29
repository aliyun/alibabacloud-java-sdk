// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAlertEventResponseBody extends TeaModel {
    /**
     * <p>The alert event information.</p>
     */
    @NameInMap("AlertEventInfo")
    public GetAlertEventResponseBodyAlertEventInfo alertEventInfo;

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

    public static GetAlertEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlertEventResponseBody self = new GetAlertEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlertEventResponseBody setAlertEventInfo(GetAlertEventResponseBodyAlertEventInfo alertEventInfo) {
        this.alertEventInfo = alertEventInfo;
        return this;
    }
    public GetAlertEventResponseBodyAlertEventInfo getAlertEventInfo() {
        return this.alertEventInfo;
    }

    public GetAlertEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAlertEventResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAlertEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlertEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlertEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAlertEventResponseBodyAlertEventInfoAlertObject extends TeaModel {
        /**
         * <p>The name of the alert object.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The source system type. Valid values:</p>
         * <ul>
         * <li>ALL: all systems</li>
         * <li>DQE: data quality</li>
         * <li>OS: data service</li>
         * <li>STREAM: real-time computing</li>
         * <li>VDM_BATCH: batch computing</li>
         * <li>SOP: O&amp;M platform</li>
         * <li>REAL_TIME_PIPELINE: real-time integration</li>
         * <li>KGB: baseline monitoring</li>
         * </ul>
         * <p>and more.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("SourceSystemType")
        public String sourceSystemType;

        /**
         * <p>The alerting object type. Valid values:</p>
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
         * <p>VDM_BATCH_PYTHON37</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetAlertEventResponseBodyAlertEventInfoAlertObject build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoAlertObject self = new GetAlertEventResponseBodyAlertEventInfoAlertObject();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertObject setSourceSystemType(String sourceSystemType) {
            this.sourceSystemType = sourceSystemType;
            return this;
        }
        public String getSourceSystemType() {
            return this.sourceSystemType;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList extends TeaModel {
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
         * <p>2024-11-04 00:00:00</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList self = new GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfoAlertReason extends TeaModel {
        /**
         * <p>The list of alert reason parameters.</p>
         */
        @NameInMap("AlertReasonParamList")
        public java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList> alertReasonParamList;

        /**
         * <p>The business date.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-05 16:19:32</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The type of the alert reason. Valid values:</p>
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
         * <p>t_6340131422711644160_20241104_6340142</p>
         */
        @NameInMap("UniqueKey")
        public String uniqueKey;

        public static GetAlertEventResponseBodyAlertEventInfoAlertReason build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoAlertReason self = new GetAlertEventResponseBodyAlertEventInfoAlertReason();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReason setAlertReasonParamList(java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList> alertReasonParamList) {
            this.alertReasonParamList = alertReasonParamList;
            return this;
        }
        public java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReasonAlertReasonParamList> getAlertReasonParamList() {
            return this.alertReasonParamList;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReason setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReason setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReason setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList extends TeaModel {
        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList self = new GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfoAlertReceiverList extends TeaModel {
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
        public java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList> userList;

        public static GetAlertEventResponseBodyAlertEventInfoAlertReceiverList build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoAlertReceiverList self = new GetAlertEventResponseBodyAlertEventInfoAlertReceiverList();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReceiverList setAlertChannelTypeList(java.util.List<String> alertChannelTypeList) {
            this.alertChannelTypeList = alertChannelTypeList;
            return this;
        }
        public java.util.List<String> getAlertChannelTypeList() {
            return this.alertChannelTypeList;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReceiverList setCustomAlertChannelIdList(java.util.List<String> customAlertChannelIdList) {
            this.customAlertChannelIdList = customAlertChannelIdList;
            return this;
        }
        public java.util.List<String> getCustomAlertChannelIdList() {
            return this.customAlertChannelIdList;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReceiverList setOnCallTableName(String onCallTableName) {
            this.onCallTableName = onCallTableName;
            return this;
        }
        public String getOnCallTableName() {
            return this.onCallTableName;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReceiverList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAlertEventResponseBodyAlertEventInfoAlertReceiverList setUserList(java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReceiverListUserList> getUserList() {
            return this.userList;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfoBelongProject extends TeaModel {
        /**
         * <p>The name of the business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>biz_1</p>
         */
        @NameInMap("BizName")
        public String bizName;

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>project_1</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static GetAlertEventResponseBodyAlertEventInfoBelongProject build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoBelongProject self = new GetAlertEventResponseBodyAlertEventInfoBelongProject();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoBelongProject setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public GetAlertEventResponseBodyAlertEventInfoBelongProject setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfoUrlConfig extends TeaModel {
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

        public static GetAlertEventResponseBodyAlertEventInfoUrlConfig build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfoUrlConfig self = new GetAlertEventResponseBodyAlertEventInfoUrlConfig();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfoUrlConfig setAlertConfigUrl(String alertConfigUrl) {
            this.alertConfigUrl = alertConfigUrl;
            return this;
        }
        public String getAlertConfigUrl() {
            return this.alertConfigUrl;
        }

        public GetAlertEventResponseBodyAlertEventInfoUrlConfig setLogUrl(String logUrl) {
            this.logUrl = logUrl;
            return this;
        }
        public String getLogUrl() {
            return this.logUrl;
        }

        public GetAlertEventResponseBodyAlertEventInfoUrlConfig setObjectUrl(String objectUrl) {
            this.objectUrl = objectUrl;
            return this;
        }
        public String getObjectUrl() {
            return this.objectUrl;
        }

    }

    public static class GetAlertEventResponseBodyAlertEventInfo extends TeaModel {
        /**
         * <p>The alert frequency. Valid values:</p>
         * <ul>
         * <li>ONCE: Instant alert.</li>
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
        public GetAlertEventResponseBodyAlertEventInfoAlertObject alertObject;

        /**
         * <p>The alert reason.</p>
         */
        @NameInMap("AlertReason")
        public GetAlertEventResponseBodyAlertEventInfoAlertReason alertReason;

        /**
         * <p>The list of alert receivers.</p>
         */
        @NameInMap("AlertReceiverList")
        public java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReceiverList> alertReceiverList;

        /**
         * <p>The project to which the alert event belongs.</p>
         */
        @NameInMap("BelongProject")
        public GetAlertEventResponseBodyAlertEventInfoBelongProject belongProject;

        /**
         * <p>The expiration time of the do-not-disturb period.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-05 00:00:00</p>
         */
        @NameInMap("DoNotDisturbEndTime")
        public String doNotDisturbEndTime;

        /**
         * <p>The time of the first alert.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-05 16:19:33</p>
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
        public Long id;

        /**
         * <p>The time of the latest alert.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-05 16:19:33</p>
         */
        @NameInMap("LatestAlertTime")
        public String latestAlertTime;

        /**
         * <p>The alert status. Valid values:</p>
         * <ul>
         * <li>ALERTING: Alerting.</li>
         * <li>DO_NOT_DISTURB: Do not disturb.</li>
         * <li>SILENCING: Alerting (cool-down period).</li>
         * <li>FINISH: Alert completed.</li>
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
         * <p>The URL configuration.</p>
         */
        @NameInMap("UrlConfig")
        public GetAlertEventResponseBodyAlertEventInfoUrlConfig urlConfig;

        public static GetAlertEventResponseBodyAlertEventInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAlertEventResponseBodyAlertEventInfo self = new GetAlertEventResponseBodyAlertEventInfo();
            return TeaModel.build(map, self);
        }

        public GetAlertEventResponseBodyAlertEventInfo setAlertFrequency(String alertFrequency) {
            this.alertFrequency = alertFrequency;
            return this;
        }
        public String getAlertFrequency() {
            return this.alertFrequency;
        }

        public GetAlertEventResponseBodyAlertEventInfo setAlertObject(GetAlertEventResponseBodyAlertEventInfoAlertObject alertObject) {
            this.alertObject = alertObject;
            return this;
        }
        public GetAlertEventResponseBodyAlertEventInfoAlertObject getAlertObject() {
            return this.alertObject;
        }

        public GetAlertEventResponseBodyAlertEventInfo setAlertReason(GetAlertEventResponseBodyAlertEventInfoAlertReason alertReason) {
            this.alertReason = alertReason;
            return this;
        }
        public GetAlertEventResponseBodyAlertEventInfoAlertReason getAlertReason() {
            return this.alertReason;
        }

        public GetAlertEventResponseBodyAlertEventInfo setAlertReceiverList(java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReceiverList> alertReceiverList) {
            this.alertReceiverList = alertReceiverList;
            return this;
        }
        public java.util.List<GetAlertEventResponseBodyAlertEventInfoAlertReceiverList> getAlertReceiverList() {
            return this.alertReceiverList;
        }

        public GetAlertEventResponseBodyAlertEventInfo setBelongProject(GetAlertEventResponseBodyAlertEventInfoBelongProject belongProject) {
            this.belongProject = belongProject;
            return this;
        }
        public GetAlertEventResponseBodyAlertEventInfoBelongProject getBelongProject() {
            return this.belongProject;
        }

        public GetAlertEventResponseBodyAlertEventInfo setDoNotDisturbEndTime(String doNotDisturbEndTime) {
            this.doNotDisturbEndTime = doNotDisturbEndTime;
            return this;
        }
        public String getDoNotDisturbEndTime() {
            return this.doNotDisturbEndTime;
        }

        public GetAlertEventResponseBodyAlertEventInfo setFirstAlertTime(String firstAlertTime) {
            this.firstAlertTime = firstAlertTime;
            return this;
        }
        public String getFirstAlertTime() {
            return this.firstAlertTime;
        }

        public GetAlertEventResponseBodyAlertEventInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAlertEventResponseBodyAlertEventInfo setLatestAlertTime(String latestAlertTime) {
            this.latestAlertTime = latestAlertTime;
            return this;
        }
        public String getLatestAlertTime() {
            return this.latestAlertTime;
        }

        public GetAlertEventResponseBodyAlertEventInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAlertEventResponseBodyAlertEventInfo setTotalAlertTimes(Long totalAlertTimes) {
            this.totalAlertTimes = totalAlertTimes;
            return this;
        }
        public Long getTotalAlertTimes() {
            return this.totalAlertTimes;
        }

        public GetAlertEventResponseBodyAlertEventInfo setUrlConfig(GetAlertEventResponseBodyAlertEventInfoUrlConfig urlConfig) {
            this.urlConfig = urlConfig;
            return this;
        }
        public GetAlertEventResponseBodyAlertEventInfoUrlConfig getUrlConfig() {
            return this.urlConfig;
        }

    }

}
