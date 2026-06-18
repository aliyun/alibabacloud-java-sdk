// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryConversationDetailInfoResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
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
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public QueryConversationDetailInfoResponseBodyData data;

    /**
     * <p>The status code message.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F2051E18-FF3F-5C08-8D24-6F150D2AF757</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryConversationDetailInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConversationDetailInfoResponseBody self = new QueryConversationDetailInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConversationDetailInfoResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryConversationDetailInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConversationDetailInfoResponseBody setData(QueryConversationDetailInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryConversationDetailInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryConversationDetailInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryConversationDetailInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConversationDetailInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryConversationDetailInfoResponseBodyDataOutputTags extends TeaModel {
        /**
         * <p>The tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9ca2*****************************</p>
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

        public static QueryConversationDetailInfoResponseBodyDataOutputTags build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationDetailInfoResponseBodyDataOutputTags self = new QueryConversationDetailInfoResponseBodyDataOutputTags();
            return TeaModel.build(map, self);
        }

        public QueryConversationDetailInfoResponseBodyDataOutputTags setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryConversationDetailInfoResponseBodyDataOutputTags setOutputTagDescription(String outputTagDescription) {
            this.outputTagDescription = outputTagDescription;
            return this;
        }
        public String getOutputTagDescription() {
            return this.outputTagDescription;
        }

        public QueryConversationDetailInfoResponseBodyDataOutputTags setOutputTagName(String outputTagName) {
            this.outputTagName = outputTagName;
            return this;
        }
        public String getOutputTagName() {
            return this.outputTagName;
        }

        public QueryConversationDetailInfoResponseBodyDataOutputTags setOutputTagValue(String outputTagValue) {
            this.outputTagValue = outputTagValue;
            return this;
        }
        public String getOutputTagValue() {
            return this.outputTagValue;
        }

    }

    public static class QueryConversationDetailInfoResponseBodyDataVariables extends TeaModel {
        /**
         * <p>The variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
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
         * <p>姓名</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the variable is required. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The variable is required.</p>
         * </li>
         * <li><p><code>false</code>: The variable is optional.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The variable value.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryConversationDetailInfoResponseBodyDataVariables build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationDetailInfoResponseBodyDataVariables self = new QueryConversationDetailInfoResponseBodyDataVariables();
            return TeaModel.build(map, self);
        }

        public QueryConversationDetailInfoResponseBodyDataVariables setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryConversationDetailInfoResponseBodyDataVariables setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryConversationDetailInfoResponseBodyDataVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryConversationDetailInfoResponseBodyDataVariables setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public QueryConversationDetailInfoResponseBodyDataVariables setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryConversationDetailInfoResponseBodyDataVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryConversationDetailInfoResponseBodyData extends TeaModel {
        /**
         * <p>The unique call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1231231231213^11231231231</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>The call result. Valid values:</p>
         * <ul>
         * <li><p><code>CALL_FORWARDING</code>: Call forwarding.</p>
         * </li>
         * <li><p><code>INCOMING_CALL_BARRED</code>: Incoming call barred.</p>
         * </li>
         * <li><p><code>CALL_REJECTED</code>: Call rejected.</p>
         * </li>
         * <li><p><code>ANSWERED</code>: Answered by user.</p>
         * </li>
         * <li><p><code>USER_BUSY</code>: Called party busy.</p>
         * </li>
         * <li><p><code>POWERED_OFF</code>: Powered off.</p>
         * </li>
         * <li><p><code>NO_USER_RESPONSE</code>: Out of service area.</p>
         * </li>
         * <li><p><code>OPERATOR_BLOCK</code>: Blocked by carrier.</p>
         * </li>
         * <li><p><code>OTHERS</code>: Other.</p>
         * </li>
         * <li><p><code>SUSPEND</code>: Suspended.</p>
         * </li>
         * <li><p><code>CANCEL</code>: Canceled by caller.</p>
         * </li>
         * <li><p><code>INVALID_NUMBER</code>: Invalid number.</p>
         * </li>
         * <li><p><code>UNAVAILABLE</code>: Temporarily unavailable.</p>
         * </li>
         * <li><p><code>NETWORK_BUSY</code>: Network busy.</p>
         * </li>
         * <li><p><code>NO_ANSWER</code>: No answer.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ANSWERED</p>
         */
        @NameInMap("CallResult")
        public String callResult;

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>186******</p>
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
         * <p>The conversation record. The structure is a JSON array in which entries are sorted by time. Example:</p>
         * <pre><code class="language-json">[
         *     {
         *         &quot;content&quot;:&quot;Conversation content&quot;,
         *         &quot;role&quot;:&quot;Role&quot;, // Valid values: user, assistant
         *     }
         * ]
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;content&quot;: &quot;111您好，年龄222，性别男，我这边是<strong>汽车的官方顾问，我们新出了一款车型为</strong>；<strong>已经上市了，售价</strong>万元起，<strong>分钟破*台，您看要不了解一下？&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;&lt;客户打断&gt;哎，你是谁？&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;&lt;客户打断&gt;你再说一遍。&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;哎，我没听清。&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;你在说什么？&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;您好，&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;我是</strong>汽车总部销售服务顾问。&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;我们最近推出了一款新车**，想了解一下您是否对这款车型感兴趣？&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;&lt;客户打断&gt;哎，那我是谁？&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;你在说什么呢？&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;抱歉打扰了，111先生。&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;祝您生活愉快！再见！&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   }
         * ]</p>
         */
        @NameInMap("ConversationRecord")
        public String conversationRecord;

        /**
         * <p>The duration of the call, in seconds. If the call was not connected, the value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("EncryptionType")
        public String encryptionType;

        /**
         * <p>The failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>主动取消</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The party that hung up. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: user.</p>
         * </li>
         * <li><p><strong>1</strong>: assistant.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>用户</p>
         */
        @NameInMap("HangupDirection")
        public String hangupDirection;

        /**
         * <p>The primary intent.</p>
         * 
         * <strong>example:</strong>
         * <p>D</p>
         */
        @NameInMap("MajorIntent")
        public String majorIntent;

        /**
         * <p>The business-specific ID that is passed in. You can use this unique ID to associate the call with your business.</p>
         * 
         * <strong>example:</strong>
         * <p>bb3bc32d-54b8-49c4-80d3-61583417d22e</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>A list of output tags.</p>
         */
        @NameInMap("OutputTags")
        public java.util.List<QueryConversationDetailInfoResponseBodyDataOutputTags> outputTags;

        /**
         * <p>The timestamp when the call was answered, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1754617273000</p>
         */
        @NameInMap("PickUpTime")
        public Long pickUpTime;

        /**
         * <p>The download URL for the recording file. This parameter is returned only after the recording file is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>https://********</p>
         */
        @NameInMap("RecordingFileDownloadUrl")
        public String recordingFileDownloadUrl;

        /**
         * <p>The timestamp when the call ended, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The timestamp when the call was initiated, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123123123</p>
         */
        @NameInMap("StartCallTime")
        public Long startCallTime;

        /**
         * <p>The call status code. For more information, see <a href="https://help.aliyun.com/document_detail/112804.html">Call status codes</a> for the voice service.</p>
         * 
         * <strong>example:</strong>
         * <p>200005</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The status message returned by the carrier.</p>
         * 
         * <strong>example:</strong>
         * <p>呼叫结束（双呼）</p>
         */
        @NameInMap("StatusMsg")
        public String statusMsg;

        /**
         * <p>A list of variables associated with the call task.</p>
         */
        @NameInMap("Variables")
        public java.util.List<QueryConversationDetailInfoResponseBodyDataVariables> variables;

        public static QueryConversationDetailInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryConversationDetailInfoResponseBodyData self = new QueryConversationDetailInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryConversationDetailInfoResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public QueryConversationDetailInfoResponseBodyData setCallResult(String callResult) {
            this.callResult = callResult;
            return this;
        }
        public String getCallResult() {
            return this.callResult;
        }

        public QueryConversationDetailInfoResponseBodyData setCalledPhone(String calledPhone) {
            this.calledPhone = calledPhone;
            return this;
        }
        public String getCalledPhone() {
            return this.calledPhone;
        }

        public QueryConversationDetailInfoResponseBodyData setCallerPhone(String callerPhone) {
            this.callerPhone = callerPhone;
            return this;
        }
        public String getCallerPhone() {
            return this.callerPhone;
        }

        public QueryConversationDetailInfoResponseBodyData setConversationRecord(String conversationRecord) {
            this.conversationRecord = conversationRecord;
            return this;
        }
        public String getConversationRecord() {
            return this.conversationRecord;
        }

        public QueryConversationDetailInfoResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryConversationDetailInfoResponseBodyData setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public String getEncryptionType() {
            return this.encryptionType;
        }

        public QueryConversationDetailInfoResponseBodyData setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public QueryConversationDetailInfoResponseBodyData setHangupDirection(String hangupDirection) {
            this.hangupDirection = hangupDirection;
            return this;
        }
        public String getHangupDirection() {
            return this.hangupDirection;
        }

        public QueryConversationDetailInfoResponseBodyData setMajorIntent(String majorIntent) {
            this.majorIntent = majorIntent;
            return this;
        }
        public String getMajorIntent() {
            return this.majorIntent;
        }

        public QueryConversationDetailInfoResponseBodyData setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public QueryConversationDetailInfoResponseBodyData setOutputTags(java.util.List<QueryConversationDetailInfoResponseBodyDataOutputTags> outputTags) {
            this.outputTags = outputTags;
            return this;
        }
        public java.util.List<QueryConversationDetailInfoResponseBodyDataOutputTags> getOutputTags() {
            return this.outputTags;
        }

        public QueryConversationDetailInfoResponseBodyData setPickUpTime(Long pickUpTime) {
            this.pickUpTime = pickUpTime;
            return this;
        }
        public Long getPickUpTime() {
            return this.pickUpTime;
        }

        public QueryConversationDetailInfoResponseBodyData setRecordingFileDownloadUrl(String recordingFileDownloadUrl) {
            this.recordingFileDownloadUrl = recordingFileDownloadUrl;
            return this;
        }
        public String getRecordingFileDownloadUrl() {
            return this.recordingFileDownloadUrl;
        }

        public QueryConversationDetailInfoResponseBodyData setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public QueryConversationDetailInfoResponseBodyData setStartCallTime(Long startCallTime) {
            this.startCallTime = startCallTime;
            return this;
        }
        public Long getStartCallTime() {
            return this.startCallTime;
        }

        public QueryConversationDetailInfoResponseBodyData setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public QueryConversationDetailInfoResponseBodyData setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

        public QueryConversationDetailInfoResponseBodyData setVariables(java.util.List<QueryConversationDetailInfoResponseBodyDataVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<QueryConversationDetailInfoResponseBodyDataVariables> getVariables() {
            return this.variables;
        }

    }

}
