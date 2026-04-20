// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DescribeChatMessageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>2026-03-18T02:01:56Z</p>
     */
    @NameInMap("CompletedAt")
    public String completedAt;

    @NameInMap("Content")
    public java.util.List<DescribeChatMessageResponseBodyContent> content;

    /**
     * <strong>example:</strong>
     * <p>2026-03-18T02:01:56Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Data")
    public DescribeChatMessageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Delta")
    public Boolean delta;

    /**
     * <strong>example:</strong>
     * <p>Failed to get sse streaming, please try again later.</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <strong>example:</strong>
     * <p>97616</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Index")
    public Long index;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>msg_294c8b98-dc64-4c82-9417-e03522a631f6</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("Object")
    public String object;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;: &quot;text&quot;, &quot;text&quot;: &quot;Skill not found: instance_health_inspection&quot;}]</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <strong>example:</strong>
     * <p>B47EED99-BFA5-529D-8D85-A6642421D390</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>assistant</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SequenceNumber")
    public Long sequenceNumber;

    /**
     * <strong>example:</strong>
     * <p>593b51eef93b443fb2ba2a6dc68b737b</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>created</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>：-636 KB</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeChatMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChatMessageResponseBody self = new DescribeChatMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChatMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeChatMessageResponseBody setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public String getCompletedAt() {
        return this.completedAt;
    }

    public DescribeChatMessageResponseBody setContent(java.util.List<DescribeChatMessageResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DescribeChatMessageResponseBodyContent> getContent() {
        return this.content;
    }

    public DescribeChatMessageResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public DescribeChatMessageResponseBody setData(DescribeChatMessageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeChatMessageResponseBodyData getData() {
        return this.data;
    }

    public DescribeChatMessageResponseBody setDelta(Boolean delta) {
        this.delta = delta;
        return this;
    }
    public Boolean getDelta() {
        return this.delta;
    }

    public DescribeChatMessageResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public DescribeChatMessageResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeChatMessageResponseBody setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public DescribeChatMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeChatMessageResponseBody setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public DescribeChatMessageResponseBody setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public DescribeChatMessageResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public DescribeChatMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChatMessageResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DescribeChatMessageResponseBody setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public DescribeChatMessageResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DescribeChatMessageResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeChatMessageResponseBody setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public DescribeChatMessageResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeChatMessageResponseBodyContentData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>call_e0e9ee423c7e4ba88d058fd6</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <strong>example:</strong>
         * <p>describeScalingRecommendation</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;: &quot;text&quot;, &quot;text&quot;: &quot;Skill not found: instance_health_inspection&quot;}]</p>
         */
        @NameInMap("Output")
        public String output;

        public static DescribeChatMessageResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            DescribeChatMessageResponseBodyContentData self = new DescribeChatMessageResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public DescribeChatMessageResponseBodyContentData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public DescribeChatMessageResponseBodyContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeChatMessageResponseBodyContentData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class DescribeChatMessageResponseBodyContent extends TeaModel {
        @NameInMap("Data")
        public DescribeChatMessageResponseBodyContentData data;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Delta")
        public Boolean delta;

        /**
         * <strong>example:</strong>
         * <p>Failed to get sse streaming, please try again later.</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <strong>example:</strong>
         * <p>msg_294c8b98-dc64-4c82-9417-e03522a631f6</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        /**
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SequenceNumber")
        public Long sequenceNumber;

        /**
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>3 MB\n-</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeChatMessageResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeChatMessageResponseBodyContent self = new DescribeChatMessageResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeChatMessageResponseBodyContent setData(DescribeChatMessageResponseBodyContentData data) {
            this.data = data;
            return this;
        }
        public DescribeChatMessageResponseBodyContentData getData() {
            return this.data;
        }

        public DescribeChatMessageResponseBodyContent setDelta(Boolean delta) {
            this.delta = delta;
            return this;
        }
        public Boolean getDelta() {
            return this.delta;
        }

        public DescribeChatMessageResponseBodyContent setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public DescribeChatMessageResponseBodyContent setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeChatMessageResponseBodyContent setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public DescribeChatMessageResponseBodyContent setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public DescribeChatMessageResponseBodyContent setSequenceNumber(Long sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }
        public Long getSequenceNumber() {
            return this.sequenceNumber;
        }

        public DescribeChatMessageResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeChatMessageResponseBodyContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeChatMessageResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeChatMessageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;instanceName&quot;: &quot;amv-bp1b9y9xhvpzm9p0&quot;, &quot;pageNumber&quot;: 1, &quot;pageSize&quot;: 10}</p>
         */
        @NameInMap("Arguments")
        public String arguments;

        /**
         * <strong>example:</strong>
         * <p>call_1891f1689bc44ab292aadff3</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <strong>example:</strong>
         * <p>describeScalingRecommendation</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;: &quot;text&quot;, &quot;text&quot;: &quot;Skill not found: instance_health_inspection&quot;}]</p>
         */
        @NameInMap("Output")
        public String output;

        public static DescribeChatMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeChatMessageResponseBodyData self = new DescribeChatMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeChatMessageResponseBodyData setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public DescribeChatMessageResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public DescribeChatMessageResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeChatMessageResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

}
