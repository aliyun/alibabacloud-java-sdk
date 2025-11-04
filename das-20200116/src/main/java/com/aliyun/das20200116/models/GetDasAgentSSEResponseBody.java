// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasAgentSSEResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rm-xxxx</p>
     */
    @NameInMap("Answer")
    public String answer;

    /**
     * <strong>example:</strong>
     * <p>summary</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <strong>example:</strong>
     * <p>xxx-xxx-xxx</p>
     */
    @NameInMap("Id")
    public String id;

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
         * <strong>example:</strong>
         * <p>1403</p>
         */
        @NameInMap("CharCount")
        public Long charCount;

        @NameInMap("Code")
        public Integer code;

        /**
         * <strong>example:</strong>
         * <p>04930480-9404-50CB-8252-Axxxxxxxx</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>SqlFilter</p>
         */
        @NameInMap("ToolName")
        public String toolName;

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
