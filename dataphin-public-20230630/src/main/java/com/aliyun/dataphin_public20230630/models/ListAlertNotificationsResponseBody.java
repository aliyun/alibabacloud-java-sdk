// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAlertNotificationsResponseBody extends TeaModel {
    /**
     * <p>The error code. OK indicates that the request is successful.</p>
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
    public ListAlertNotificationsResponseBodyListResult listResult;

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

    public static ListAlertNotificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertNotificationsResponseBody self = new ListAlertNotificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertNotificationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAlertNotificationsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAlertNotificationsResponseBody setListResult(ListAlertNotificationsResponseBodyListResult listResult) {
        this.listResult = listResult;
        return this;
    }
    public ListAlertNotificationsResponseBodyListResult getListResult() {
        return this.listResult;
    }

    public ListAlertNotificationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlertNotificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertNotificationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlertNotificationsResponseBodyListResultDataAlertObject extends TeaModel {
        /**
         * <p>The object name.</p>
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
         * <li>KGB: Baseline monitoring.
         * etc.</li>
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
         * <p>VDM_BATCH_SHELL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAlertNotificationsResponseBodyListResultDataAlertObject build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultDataAlertObject self = new ListAlertNotificationsResponseBodyListResultDataAlertObject();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertObject setSourceSystemType(String sourceSystemType) {
            this.sourceSystemType = sourceSystemType;
            return this;
        }
        public String getSourceSystemType() {
            return this.sourceSystemType;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList extends TeaModel {
        /**
         * <p>The alert parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>biz_date</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The alert parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-24 00:00:00</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList self = new ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResultDataAlertReason extends TeaModel {
        /**
         * <p>The list of alert parameters.</p>
         */
        @NameInMap("AlertReasonParamList")
        public java.util.List<ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList> alertReasonParamList;

        /**
         * <p>The business date.</p>
         * 
         * <strong>example:</strong>
         * <p>20241125</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The alert reason type. Valid values:</p>
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
         * <li>STREAM_JOB_FAILURE: Execution failed.</li>
         * <li>VDM_BATCH_ERROR: Error occurred.</li>
         * <li>VDM_BATCH_FINISH: Completed.</li>
         * <li>VDM_BATCH_TIME_OUT: Execution timed out.</li>
         * <li>VDM_BATCH_UNDONE: Incomplete.</li>
         * <li>VDM_BATCH_LOGIC_DATA_DELAY: Data delay.</li>
         * <li>QD_DECISION_CALL_TIMES: Decision call count exception.</li>
         * <li>QD_DECISION_MAX_RESPONSE: Maximum response time exception.</li>
         * <li>QD_DECISION_ERROR_RATE: Error rate exception.</li>
         * <li>QD_DECISION_PARAM_COUNT: Decision parameter statistics count exception.</li>
         * <li>QD_DECISION_PARAM_PERCENTAGE: Decision parameter statistics percentage exception.</li>
         * <li>QD_DECISION_PARAM_SUM: Decision parameter sum exception.</li>
         * <li>QD_DECISION_PARAM_AVG: Decision parameter average exception.</li>
         * <li>LOGICAL_INSTANCE_GENERATION: Logical instance generation monitoring.</li>
         * <li>KGB_TASK_ERROR: Baseline task error.</li>
         * <li>KGB_TASK_SLOW_DOWN: Baseline task slowed down.</li>
         * <li>KGB_EARLY_WARNING: Baseline early warning.</li>
         * <li>KGB_BROKEN_LINE: Baseline SLA breached.
         * etc.</li>
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
         * <p>123456</p>
         */
        @NameInMap("UniqueKey")
        public String uniqueKey;

        public static ListAlertNotificationsResponseBodyListResultDataAlertReason build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultDataAlertReason self = new ListAlertNotificationsResponseBodyListResultDataAlertReason();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReason setAlertReasonParamList(java.util.List<ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList> alertReasonParamList) {
            this.alertReasonParamList = alertReasonParamList;
            return this;
        }
        public java.util.List<ListAlertNotificationsResponseBodyListResultDataAlertReasonAlertReasonParamList> getAlertReasonParamList() {
            return this.alertReasonParamList;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReason setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReason setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReason setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser extends TeaModel {
        /**
         * <p>The alert recipient name.</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser self = new ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResultDataAlertReceiver extends TeaModel {
        /**
         * <p>The push channel type. Valid values:</p>
         * <ul>
         * <li>VOICE: Voice calls.</li>
         * <li>SMS: Text messages.</li>
         * <li>MAIL: Email.</li>
         * <li>DINGTALK_ROBOT: DingTalk robot.</li>
         * <li>DINGDING: DingTalk work notification.</li>
         * <li>CUSTOM: Custom message channel.</li>
         * <li>WECHAT: WeCom.</li>
         * <li>FEISHU: Lark.</li>
         * <li>SILENCE: No notification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SMS</p>
         */
        @NameInMap("AlertChannelType")
        public String alertChannelType;

        /**
         * <p>The custom message channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CustomAlertChannelId")
        public String customAlertChannelId;

        /**
         * <p>The on-call schedule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("OnCallTableId")
        public String onCallTableId;

        /**
         * <p>The on-call schedule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OnCallTableName")
        public String onCallTableName;

        /**
         * <p>The alert recipient type. Valid values:</p>
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
         * <p>The user information.</p>
         */
        @NameInMap("User")
        public ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser user;

        public static ListAlertNotificationsResponseBodyListResultDataAlertReceiver build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultDataAlertReceiver self = new ListAlertNotificationsResponseBodyListResultDataAlertReceiver();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver setAlertChannelType(String alertChannelType) {
            this.alertChannelType = alertChannelType;
            return this;
        }
        public String getAlertChannelType() {
            return this.alertChannelType;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver setCustomAlertChannelId(String customAlertChannelId) {
            this.customAlertChannelId = customAlertChannelId;
            return this;
        }
        public String getCustomAlertChannelId() {
            return this.customAlertChannelId;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver setOnCallTableId(String onCallTableId) {
            this.onCallTableId = onCallTableId;
            return this;
        }
        public String getOnCallTableId() {
            return this.onCallTableId;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver setOnCallTableName(String onCallTableName) {
            this.onCallTableName = onCallTableName;
            return this;
        }
        public String getOnCallTableName() {
            return this.onCallTableName;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver setUser(ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser user) {
            this.user = user;
            return this;
        }
        public ListAlertNotificationsResponseBodyListResultDataAlertReceiverUser getUser() {
            return this.user;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResultDataAlertSend extends TeaModel {
        /**
         * <p>The alert reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <p>The delivery content.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SendContent")
        public String sendContent;

        /**
         * <p>The delivery time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-25 10:02:47</p>
         */
        @NameInMap("SendTime")
        public String sendTime;

        /**
         * <p>The delivery status. Valid values:</p>
         * <ul>
         * <li>SUCCESS: Delivered successfully.</li>
         * <li>FAILE: Delivery failed.</li>
         * <li>SENDING: Delivering.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAlertNotificationsResponseBodyListResultDataAlertSend build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultDataAlertSend self = new ListAlertNotificationsResponseBodyListResultDataAlertSend();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertSend setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertSend setSendContent(String sendContent) {
            this.sendContent = sendContent;
            return this;
        }
        public String getSendContent() {
            return this.sendContent;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertSend setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public String getSendTime() {
            return this.sendTime;
        }

        public ListAlertNotificationsResponseBodyListResultDataAlertSend setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResultData extends TeaModel {
        /**
         * <p>The alert event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("AlertEventId")
        public String alertEventId;

        /**
         * <p>The alert object.</p>
         */
        @NameInMap("AlertObject")
        public ListAlertNotificationsResponseBodyListResultDataAlertObject alertObject;

        /**
         * <p>The alert reason.</p>
         */
        @NameInMap("AlertReason")
        public ListAlertNotificationsResponseBodyListResultDataAlertReason alertReason;

        /**
         * <p>The recipient information.</p>
         */
        @NameInMap("AlertReceiver")
        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver alertReceiver;

        /**
         * <p>The alert delivery information.</p>
         */
        @NameInMap("AlertSend")
        public ListAlertNotificationsResponseBodyListResultDataAlertSend alertSend;

        public static ListAlertNotificationsResponseBodyListResultData build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResultData self = new ListAlertNotificationsResponseBodyListResultData();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResultData setAlertEventId(String alertEventId) {
            this.alertEventId = alertEventId;
            return this;
        }
        public String getAlertEventId() {
            return this.alertEventId;
        }

        public ListAlertNotificationsResponseBodyListResultData setAlertObject(ListAlertNotificationsResponseBodyListResultDataAlertObject alertObject) {
            this.alertObject = alertObject;
            return this;
        }
        public ListAlertNotificationsResponseBodyListResultDataAlertObject getAlertObject() {
            return this.alertObject;
        }

        public ListAlertNotificationsResponseBodyListResultData setAlertReason(ListAlertNotificationsResponseBodyListResultDataAlertReason alertReason) {
            this.alertReason = alertReason;
            return this;
        }
        public ListAlertNotificationsResponseBodyListResultDataAlertReason getAlertReason() {
            return this.alertReason;
        }

        public ListAlertNotificationsResponseBodyListResultData setAlertReceiver(ListAlertNotificationsResponseBodyListResultDataAlertReceiver alertReceiver) {
            this.alertReceiver = alertReceiver;
            return this;
        }
        public ListAlertNotificationsResponseBodyListResultDataAlertReceiver getAlertReceiver() {
            return this.alertReceiver;
        }

        public ListAlertNotificationsResponseBodyListResultData setAlertSend(ListAlertNotificationsResponseBodyListResultDataAlertSend alertSend) {
            this.alertSend = alertSend;
            return this;
        }
        public ListAlertNotificationsResponseBodyListResultDataAlertSend getAlertSend() {
            return this.alertSend;
        }

    }

    public static class ListAlertNotificationsResponseBodyListResult extends TeaModel {
        /**
         * <p>The list of push records.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListAlertNotificationsResponseBodyListResultData> data;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAlertNotificationsResponseBodyListResult build(java.util.Map<String, ?> map) throws Exception {
            ListAlertNotificationsResponseBodyListResult self = new ListAlertNotificationsResponseBodyListResult();
            return TeaModel.build(map, self);
        }

        public ListAlertNotificationsResponseBodyListResult setData(java.util.List<ListAlertNotificationsResponseBodyListResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListAlertNotificationsResponseBodyListResultData> getData() {
            return this.data;
        }

        public ListAlertNotificationsResponseBodyListResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
