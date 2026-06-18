// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineAgentDetailResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Agent service data.</p>
     */
    @NameInMap("Data")
    public GetHotlineAgentDetailResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetHotlineAgentDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineAgentDetailResponseBody self = new GetHotlineAgentDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineAgentDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineAgentDetailResponseBody setData(GetHotlineAgentDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotlineAgentDetailResponseBodyData getData() {
        return this.data;
    }

    public GetHotlineAgentDetailResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHotlineAgentDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineAgentDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotlineAgentDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHotlineAgentDetailResponseBodyData extends TeaModel {
        /**
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2235****</p>
         */
        @NameInMap("AgentId")
        public Long agentId;

        /**
         * <p>Agent status. Valid values: <strong>1~6</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentStatus")
        public Integer agentStatus;

        /**
         * <p>Agent status code. Valid values:  </p>
         * <ul>
         * <li><strong>AgentCheckout</strong>: Agent logged off.  </li>
         * <li><strong>AgentReady</strong>: Agent idle.  </li>
         * <li><strong>AgentBreak</strong>: Agent on break.  </li>
         * <li><strong>AgentAcw</strong>: Post-processing after a call.  </li>
         * <li><strong>AgentBusyForCall</strong>: In a call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AgentCheckout</p>
         */
        @NameInMap("AgentStatusCode")
        public String agentStatusCode;

        /**
         * <p>Indicates whether the agent is assigned. Valid values:<br><strong>false</strong>: Not assigned (no call).<br><strong>true</strong>: Assigned (in a call).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Assigned")
        public Boolean assigned;

        /**
         * <p>Break type. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Short break.  </li>
         * <li><strong>2</strong>: Meal break.  </li>
         * <li><strong>3</strong>: Meeting.  </li>
         * <li><strong>4</strong>: Coaching.  </li>
         * <li><strong>5</strong>: Training.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RestType")
        public Integer restType;

        /**
         * <p>Tenant ID to which the agent belongs, corresponding to the instance ID in the input parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>Heartbeat signature.</p>
         * 
         * <strong>example:</strong>
         * <p>dnthF_oinHg7JMJDmKqex3Ux****</p>
         */
        @NameInMap("Token")
        public String token;

        public static GetHotlineAgentDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineAgentDetailResponseBodyData self = new GetHotlineAgentDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineAgentDetailResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public GetHotlineAgentDetailResponseBodyData setAgentStatus(Integer agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public Integer getAgentStatus() {
            return this.agentStatus;
        }

        public GetHotlineAgentDetailResponseBodyData setAgentStatusCode(String agentStatusCode) {
            this.agentStatusCode = agentStatusCode;
            return this;
        }
        public String getAgentStatusCode() {
            return this.agentStatusCode;
        }

        public GetHotlineAgentDetailResponseBodyData setAssigned(Boolean assigned) {
            this.assigned = assigned;
            return this;
        }
        public Boolean getAssigned() {
            return this.assigned;
        }

        public GetHotlineAgentDetailResponseBodyData setRestType(Integer restType) {
            this.restType = restType;
            return this;
        }
        public Integer getRestType() {
            return this.restType;
        }

        public GetHotlineAgentDetailResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetHotlineAgentDetailResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
