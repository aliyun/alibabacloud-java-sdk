// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryConversationDetailInfoNewResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access was denied.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryConversationDetailInfoNewResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: successful.</li>
     * <li><strong>false</strong>: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryConversationDetailInfoNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConversationDetailInfoNewResponseBody self = new QueryConversationDetailInfoNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConversationDetailInfoNewResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryConversationDetailInfoNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConversationDetailInfoNewResponseBody setData(QueryConversationDetailInfoNewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryConversationDetailInfoNewResponseBodyData getData() {
        return this.data;
    }

    public QueryConversationDetailInfoNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryConversationDetailInfoNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConversationDetailInfoNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryConversationDetailInfoNewResponseBodyDataOutputTags extends TeaModel {
        /**
         * <p>The tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The tag description.</p>
         * 
         * <strong>example:</strong>
         * <p>评估客户对车型的兴趣和购买可能性</p>
         */
        @NameInMap("OutputTagDescription")
        public String outputTagDescription;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>客户意向度</p>
         */
        @NameInMap("OutputTagName")
        public String outputTagName;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;高（非常积极，大概率转化）&quot;]</p>
         */
        @NameInMap("OutputTagValue")
        public String outputTagValue;

        public static QueryConversationDetailInfoNewResponseBodyDataOutputTags build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationDetailInfoNewResponseBodyDataOutputTags self = new QueryConversationDetailInfoNewResponseBodyDataOutputTags();
            return TeaModel.build(map, self);
        }

        public QueryConversationDetailInfoNewResponseBodyDataOutputTags setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryConversationDetailInfoNewResponseBodyDataOutputTags setOutputTagDescription(String outputTagDescription) {
            this.outputTagDescription = outputTagDescription;
            return this;
        }
        public String getOutputTagDescription() {
            return this.outputTagDescription;
        }

        public QueryConversationDetailInfoNewResponseBodyDataOutputTags setOutputTagName(String outputTagName) {
            this.outputTagName = outputTagName;
            return this;
        }
        public String getOutputTagName() {
            return this.outputTagName;
        }

        public QueryConversationDetailInfoNewResponseBodyDataOutputTags setOutputTagValue(String outputTagValue) {
            this.outputTagValue = outputTagValue;
            return this;
        }
        public String getOutputTagValue() {
            return this.outputTagValue;
        }

    }

    public static class QueryConversationDetailInfoNewResponseBodyDataVariables extends TeaModel {
        /**
         * <p>The variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The variable key.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The variable name.</p>
         * 
         * <strong>example:</strong>
         * <p>user name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the variable is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>source</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The variable value.</p>
         * 
         * <strong>example:</strong>
         * <p>mike</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryConversationDetailInfoNewResponseBodyDataVariables build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationDetailInfoNewResponseBodyDataVariables self = new QueryConversationDetailInfoNewResponseBodyDataVariables();
            return TeaModel.build(map, self);
        }

        public QueryConversationDetailInfoNewResponseBodyDataVariables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryConversationDetailInfoNewResponseBodyDataVariables setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryConversationDetailInfoNewResponseBodyDataVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryConversationDetailInfoNewResponseBodyDataVariables setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public QueryConversationDetailInfoNewResponseBodyDataVariables setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryConversationDetailInfoNewResponseBodyDataVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryConversationDetailInfoNewResponseBodyData extends TeaModel {
        /**
         * <p>The batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234******</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <p>The unique ID of the call.</p>
         * 
         * <strong>example:</strong>
         * <p>123*<strong><strong><strong>^213</strong></strong></strong></p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>The call result. Valid values:</p>
         * <ul>
         * <li>CALL_FORWARDING: call forwarding.</li>
         * <li>INCOMING_CALL_BARRED: incoming call barred.</li>
         * <li>CALL_REJECTED: call rejected.</li>
         * <li>ANSWERED: the user answered.</li>
         * <li>USER_BUSY: the callee is busy.</li>
         * <li>POWERED_OFF: the phone is powered off.</li>
         * <li>NO_USER_RESPONSE: out of service area.</li>
         * <li>OPERATOR_BLOCK: blocked by the carrier.</li>
         * <li>OTHERS: other status.</li>
         * <li>SUSPEND: the phone is suspended.</li>
         * <li>CANCEL: the caller canceled.</li>
         * <li>INVALID_NUMBER: invalid number.</li>
         * <li>UNAVAILABLE: temporarily unavailable.</li>
         * <li>NETWORK_BUSY: network busy.</li>
         * <li>NO_ANSWER: no answer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ANSWERED</p>
         */
        @NameInMap("CallResult")
        public String callResult;

        /**
         * <p>The callee number.</p>
         * 
         * <strong>example:</strong>
         * <p>130********</p>
         */
        @NameInMap("CalledPhone")
        public String calledPhone;

        /**
         * <p>The caller number.</p>
         * 
         * <strong>example:</strong>
         * <p>0571*******</p>
         */
        @NameInMap("CallerPhone")
        public String callerPhone;

        /**
         * <p>The chat record information. The structure is a JSON array, and the chat records are sorted in chronological order. The structure is as follows:</p>
         * <pre><code class="language-json">[
         *     {
         *         &quot;content&quot;:&quot;聊天内容&quot;,
         *         &quot;role&quot;:&quot;角色&quot;,//Valid values: user and assistant (robot).
         *     }
         * ]
         * ```.
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;content&quot;: &quot;111您好，年龄222，性别男，我这边是<strong>汽车的官方顾问，我们新出了一款车型为</strong>；<strong>已经上市了，售价</strong>万元起，*<em>分钟破</em>台，您看要不了解一下？&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;&lt;客户打断&gt;哎，你是谁？&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;&lt;客户打断&gt;你再说一遍。&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   }]</p>
         */
        @NameInMap("ConversationRecord")
        public String conversationRecord;

        /**
         * <p>The number of conversation turns.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("ConversationTurnCount")
        public Long conversationTurnCount;

        /**
         * <p>The task detail ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234*******</p>
         */
        @NameInMap("DetailId")
        public String detailId;

        /**
         * <p>The call duration. The value is 0 if the call is not connected. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>28</p>
         */
        @NameInMap("EncryptionType")
        public Long encryptionType;

        /**
         * <p>The failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>主动取消</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The hangup direction. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the user.</li>
         * <li><strong>1</strong>: the robot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HangupDirection")
        public String hangupDirection;

        /**
         * <p>The import time. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("ImportedTime")
        public Long importedTime;

        /**
         * <p>The major intent.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("MajorIntent")
        public String majorIntent;

        /**
         * <p>The variable information used at runtime. The information is stored in this field as key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;date&quot;: &quot;666&quot;,
         *   &quot;phoneNumber&quot;: &quot;777&quot;,
         *   &quot;distance&quot;: &quot;555&quot;,
         *   &quot;mendian&quot;: &quot;444&quot;,
         *   &quot;sex&quot;: &quot;男&quot;,
         *   &quot;name&quot;: &quot;111&quot;,
         *   &quot;age&quot;: &quot;222&quot;
         * }</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The external business serial number. You can use a unique ID for business association.</p>
         * 
         * <strong>example:</strong>
         * <p>123***</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>The output tag information.</p>
         */
        @NameInMap("OutputTags")
        public java.util.List<QueryConversationDetailInfoNewResponseBodyDataOutputTags> outputTags;

        /**
         * <p>The time when the call was answered. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12349732441</p>
         */
        @NameInMap("PickUpTime")
        public Long pickUpTime;

        /**
         * <p>The download URL of the recording file. This field is available only after a recording file is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>recording.oss.file</p>
         */
        @NameInMap("RecordingFileDownloadUrl")
        public String recordingFileDownloadUrl;

        /**
         * <p>The time when the call ended. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The time when the call started. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1286987391</p>
         */
        @NameInMap("StartCallTime")
        public Long startCallTime;

        /**
         * <p>The agent status.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The call status code. For more information, see <a href="https://help.aliyun.com/document_detail/112804.html">Call status codes</a> in voice messaging.</p>
         * 
         * <strong>example:</strong>
         * <p>200005</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The call status information returned by the carrier.</p>
         * 
         * <strong>example:</strong>
         * <p>呼叫结束（双呼）</p>
         */
        @NameInMap("StatusMsg")
        public String statusMsg;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>138************</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The call variable information.</p>
         */
        @NameInMap("Variables")
        public java.util.List<QueryConversationDetailInfoNewResponseBodyDataVariables> variables;

        public static QueryConversationDetailInfoNewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationDetailInfoNewResponseBodyData self = new QueryConversationDetailInfoNewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryConversationDetailInfoNewResponseBodyData setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public QueryConversationDetailInfoNewResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public QueryConversationDetailInfoNewResponseBodyData setCallResult(String callResult) {
            this.callResult = callResult;
            return this;
        }
        public String getCallResult() {
            return this.callResult;
        }

        public QueryConversationDetailInfoNewResponseBodyData setCalledPhone(String calledPhone) {
            this.calledPhone = calledPhone;
            return this;
        }
        public String getCalledPhone() {
            return this.calledPhone;
        }

        public QueryConversationDetailInfoNewResponseBodyData setCallerPhone(String callerPhone) {
            this.callerPhone = callerPhone;
            return this;
        }
        public String getCallerPhone() {
            return this.callerPhone;
        }

        public QueryConversationDetailInfoNewResponseBodyData setConversationRecord(String conversationRecord) {
            this.conversationRecord = conversationRecord;
            return this;
        }
        public String getConversationRecord() {
            return this.conversationRecord;
        }

        public QueryConversationDetailInfoNewResponseBodyData setConversationTurnCount(Long conversationTurnCount) {
            this.conversationTurnCount = conversationTurnCount;
            return this;
        }
        public Long getConversationTurnCount() {
            return this.conversationTurnCount;
        }

        public QueryConversationDetailInfoNewResponseBodyData setDetailId(String detailId) {
            this.detailId = detailId;
            return this;
        }
        public String getDetailId() {
            return this.detailId;
        }

        public QueryConversationDetailInfoNewResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryConversationDetailInfoNewResponseBodyData setEncryptionType(Long encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public Long getEncryptionType() {
            return this.encryptionType;
        }

        public QueryConversationDetailInfoNewResponseBodyData setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public QueryConversationDetailInfoNewResponseBodyData setHangupDirection(String hangupDirection) {
            this.hangupDirection = hangupDirection;
            return this;
        }
        public String getHangupDirection() {
            return this.hangupDirection;
        }

        public QueryConversationDetailInfoNewResponseBodyData setImportedTime(Long importedTime) {
            this.importedTime = importedTime;
            return this;
        }
        public Long getImportedTime() {
            return this.importedTime;
        }

        public QueryConversationDetailInfoNewResponseBodyData setMajorIntent(String majorIntent) {
            this.majorIntent = majorIntent;
            return this;
        }
        public String getMajorIntent() {
            return this.majorIntent;
        }

        public QueryConversationDetailInfoNewResponseBodyData setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public QueryConversationDetailInfoNewResponseBodyData setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public QueryConversationDetailInfoNewResponseBodyData setOutputTags(java.util.List<QueryConversationDetailInfoNewResponseBodyDataOutputTags> outputTags) {
            this.outputTags = outputTags;
            return this;
        }
        public java.util.List<QueryConversationDetailInfoNewResponseBodyDataOutputTags> getOutputTags() {
            return this.outputTags;
        }

        public QueryConversationDetailInfoNewResponseBodyData setPickUpTime(Long pickUpTime) {
            this.pickUpTime = pickUpTime;
            return this;
        }
        public Long getPickUpTime() {
            return this.pickUpTime;
        }

        public QueryConversationDetailInfoNewResponseBodyData setRecordingFileDownloadUrl(String recordingFileDownloadUrl) {
            this.recordingFileDownloadUrl = recordingFileDownloadUrl;
            return this;
        }
        public String getRecordingFileDownloadUrl() {
            return this.recordingFileDownloadUrl;
        }

        public QueryConversationDetailInfoNewResponseBodyData setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public QueryConversationDetailInfoNewResponseBodyData setStartCallTime(Long startCallTime) {
            this.startCallTime = startCallTime;
            return this;
        }
        public Long getStartCallTime() {
            return this.startCallTime;
        }

        public QueryConversationDetailInfoNewResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryConversationDetailInfoNewResponseBodyData setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public QueryConversationDetailInfoNewResponseBodyData setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

        public QueryConversationDetailInfoNewResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryConversationDetailInfoNewResponseBodyData setVariables(java.util.List<QueryConversationDetailInfoNewResponseBodyDataVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<QueryConversationDetailInfoNewResponseBodyDataVariables> getVariables() {
            return this.variables;
        }

    }

}
