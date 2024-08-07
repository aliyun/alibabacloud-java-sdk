// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetAgentInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAgentInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter.Invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FC384CE1-8D42-1900-84E1-F33F990F2B5E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAgentInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentInfoResponseBody self = new GetAgentInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentInfoResponseBody setData(GetAgentInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentInfoResponseBodyData getData() {
        return this.data;
    }

    public GetAgentInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4e7400028e6f4a7393ed3acf6a7b8927_p_beebot_public</p>
         */
        @NameInMap("AgentKey")
        public String agentKey;

        @NameInMap("AgentName")
        public String agentName;

        public static GetAgentInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentInfoResponseBodyData self = new GetAgentInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentInfoResponseBodyData setAgentKey(String agentKey) {
            this.agentKey = agentKey;
            return this;
        }
        public String getAgentKey() {
            return this.agentKey;
        }

        public GetAgentInfoResponseBodyData setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

    }

}
