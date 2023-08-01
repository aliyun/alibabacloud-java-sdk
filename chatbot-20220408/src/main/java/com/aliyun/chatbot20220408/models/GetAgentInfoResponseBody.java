// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetAgentInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAgentInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
