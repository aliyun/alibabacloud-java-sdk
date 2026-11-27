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
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryConversationDetailInfoResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
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
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
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
         * <p>The ID of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>9ca2*****************************</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The description of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Evaluate the customer&quot;s interest in the car model and likelihood of purchase</p>
         */
        @NameInMap("OutputTagDescription")
        public String outputTagDescription;

        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer intent level</p>
         */
        @NameInMap("OutputTagName")
        public String outputTagName;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;High (very positive, high probability of conversion)&quot;]</p>
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
         * <p>The ID of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The key of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the variable is required. Valid values:</p>
         * <ul>
         * <li><p>true: yes</p>
         * </li>
         * <li><p>false: no</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>The source of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The value of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
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
         * <p>The unique ID of the call.</p>
         * 
         * <strong>example:</strong>
         * <p>1231231231213^11231231231</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>The call result. Valid values:</p>
         * <ul>
         * <li>CALL_FORWARDING: call forwarding</li>
         * <li>INCOMING_CALL_BARRED: incoming calls barred</li>
         * <li>CALL_REJECTED: call rejected</li>
         * <li>ANSWERED: answered</li>
         * <li>USER_BUSY: user busy</li>
         * <li>POWERED_OFF: powered off</li>
         * <li>NO_USER_RESPONSE: no user response</li>
         * <li>OPERATOR_BLOCK: blocked by the carrier</li>
         * <li>OTHERS: other statuses</li>
         * <li>SUSPEND: suspended</li>
         * <li>CANCEL: canceled by the caller</li>
         * <li>INVALID_NUMBER: invalid number</li>
         * <li>UNAVAILABLE: temporarily unavailable</li>
         * <li>NETWORK_BUSY: network busy</li>
         * <li>NO_ANSWER: no answer</li>
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
         * <p>The chat record information. The structure is a JSON array. The chat records are sorted in chronological order. Details:</p>
         * <pre><code class="language-json">[
         *     {
         *         &quot;content&quot;:&quot;Chat content&quot;,
         *         &quot;role&quot;:&quot;Role&quot;,//Valid values: user (user), assistant (chatbot)
         *     }
         * ]
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;content&quot;: &quot;111 Hello, age 222, male. I am the official consultant of ** Automobile. We have launched a new model **; ** is now on the market, starting at ** 10,000 yuan, with * units sold in ** minutes. Would you like to learn more?&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;<Customer interrupts> Hey, who are you?&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;<Customer interrupts> Say that again.&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;Hey, I didn&quot;t catch that.&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;What are you saying?&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;Hello,&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;I am the sales service consultant at the ** Automobile headquarters.&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;We recently launched a new car, **. Would you like to know if you are interested in this model?&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;<Customer interrupts> Hey, then who am I?&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;What are you talking about?&quot;,
         *     &quot;role&quot;: &quot;user&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;Sorry to bother you, Mr. 111.&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   },
         *   {
         *     &quot;content&quot;: &quot;Have a great day! Goodbye!&quot;,
         *     &quot;role&quot;: &quot;assistant&quot;
         *   }
         * ]</p>
         */
        @NameInMap("ConversationRecord")
        public String conversationRecord;

        /**
         * <p>The duration of the call. The value is 0 if the call is not connected. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The encryption method. Valid values:</p>
         * <ul>
         * <li>0: no encryption</li>
         * <li>1: MD5</li>
         * <li>2: SHA256</li>
         * <li>3: SM3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        @NameInMap("EncryptionType")
        public String encryptionType;

        /**
         * <p>The reason for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Canceled by the caller</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The party that hung up. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: user</li>
         * <li><strong>1</strong>: chatbot</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
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
         * <p>The external business transaction ID. You can use a unique ID to associate business data.</p>
         * 
         * <strong>example:</strong>
         * <p>bb3bc32d-54b8-49c4-80d3-61583417d22e</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>The list of output tags.</p>
         */
        @NameInMap("OutputTags")
        public java.util.List<QueryConversationDetailInfoResponseBodyDataOutputTags> outputTags;

        /**
         * <p>The time when the call was answered. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1754617273000</p>
         */
        @NameInMap("PickUpTime")
        public Long pickUpTime;

        /**
         * <p>The download URL of the recording file. This field is returned only after the recording file is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>https://********</p>
         */
        @NameInMap("RecordingFileDownloadUrl")
        public String recordingFileDownloadUrl;

        /**
         * <p>The time when the call ended. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The time when the call started. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123123123</p>
         */
        @NameInMap("StartCallTime")
        public Long startCallTime;

        /**
         * <p>The call status code. For more information, see <a href="https://help.aliyun.com/document_detail/112804.html">Call status codes</a> of Voice Messaging.</p>
         * 
         * <strong>example:</strong>
         * <p>200005</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The call status message returned by the carrier.</p>
         * 
         * <strong>example:</strong>
         * <p>Call ended (two-way call)</p>
         */
        @NameInMap("StatusMsg")
        public String statusMsg;

        /**
         * <p>The list of call variables. These are the call variables associated with the call task that you created.</p>
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
