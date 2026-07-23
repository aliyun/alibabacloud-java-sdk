// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateAgentResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li>Success: The operation was successful.                                 </li>
     * <li>Other values: An error code was returned. For more information, see error codes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the operation was successful.</p>
     */
    @NameInMap("Data")
    public UpdateAgentResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidArgument</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>382E6272-XXXXX-A8AF0BFAC1A5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns true if the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentResponseBody self = new UpdateAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAgentResponseBody setData(UpdateAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAgentResponseBodyData getData() {
        return this.data;
    }

    public UpdateAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateAgentResponseBodyData extends TeaModel {
        /**
         * <p>Agent ARN</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:{region}:{accountId}:agent/{agentName}</p>
         */
        @NameInMap("AgentArn")
        public String agentArn;

        public static UpdateAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentResponseBodyData self = new UpdateAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAgentResponseBodyData setAgentArn(String agentArn) {
            this.agentArn = agentArn;
            return this;
        }
        public String getAgentArn() {
            return this.agentArn;
        }

    }

}
