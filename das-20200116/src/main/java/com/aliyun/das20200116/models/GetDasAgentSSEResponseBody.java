// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasAgentSSEResponseBody extends TeaModel {
    /**
     * <p>The answer content.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-xxxx</p>
     */
    @NameInMap("Answer")
    public String answer;

    /**
     * <p>The type of the returned answer information.</p>
     * 
     * <strong>example:</strong>
     * <p>summary</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <p>The session ID, which is the same as the SessionId in the request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The metadata.</p>
     */
    @NameInMap("Metadata")
    public GetDasAgentSSEResponseBodyMetadata metadata;

    public static GetDasAgentSSEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDasAgentSSEResponseBody self = new GetDasAgentSSEResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDasAgentSSEResponseBody setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public GetDasAgentSSEResponseBody setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public GetDasAgentSSEResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetDasAgentSSEResponseBody setMetadata(GetDasAgentSSEResponseBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public GetDasAgentSSEResponseBodyMetadata getMetadata() {
        return this.metadata;
    }

    public static class GetDasAgentSSEResponseBodyMetadata extends TeaModel {
        /**
         * <p>The number of characters in the answer.</p>
         * 
         * <strong>example:</strong>
         * <p>1403</p>
         */
        @NameInMap("CharCount")
        public Long charCount;

        /**
         * <p>The error type returned when an exception occurs. This field is empty when no exception occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>-1810001</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04930480-9404-50CB-8252-Axxxxxxxx</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The tool command that is called.</p>
         * 
         * <strong>example:</strong>
         * <p>SqlFilter</p>
         */
        @NameInMap("ToolName")
        public String toolName;

        /**
         * <p>The tool parameters.</p>
         */
        @NameInMap("ToolParams")
        public java.util.List<String> toolParams;

        public static GetDasAgentSSEResponseBodyMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetDasAgentSSEResponseBodyMetadata self = new GetDasAgentSSEResponseBodyMetadata();
            return TeaModel.build(map, self);
        }

        public GetDasAgentSSEResponseBodyMetadata setCharCount(Long charCount) {
            this.charCount = charCount;
            return this;
        }
        public Long getCharCount() {
            return this.charCount;
        }

        public GetDasAgentSSEResponseBodyMetadata setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetDasAgentSSEResponseBodyMetadata setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetDasAgentSSEResponseBodyMetadata setToolName(String toolName) {
            this.toolName = toolName;
            return this;
        }
        public String getToolName() {
            return this.toolName;
        }

        public GetDasAgentSSEResponseBodyMetadata setToolParams(java.util.List<String> toolParams) {
            this.toolParams = toolParams;
            return this;
        }
        public java.util.List<String> getToolParams() {
            return this.toolParams;
        }

    }

}
