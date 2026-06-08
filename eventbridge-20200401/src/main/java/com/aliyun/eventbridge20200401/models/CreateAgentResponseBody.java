// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateAgentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Agent with name \&quot;XXX\&quot; already exists for account 12345</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B896B484-XXXXXX-DD0E5C361108</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentResponseBody self = new CreateAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAgentResponseBody setData(CreateAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAgentResponseBodyData getData() {
        return this.data;
    }

    public CreateAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAgentResponseBodyData extends TeaModel {
        /**
         * <p>Agent ARN</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:{region}:{accountId}:agent/{agentName}</p>
         */
        @NameInMap("AgentArn")
        public String agentArn;

        public static CreateAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentResponseBodyData self = new CreateAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAgentResponseBodyData setAgentArn(String agentArn) {
            this.agentArn = agentArn;
            return this;
        }
        public String getAgentArn() {
            return this.agentArn;
        }

    }

}
