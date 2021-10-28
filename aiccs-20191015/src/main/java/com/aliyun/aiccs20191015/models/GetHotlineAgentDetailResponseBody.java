// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineAgentDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHotlineAgentDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AgentId")
        public Long agentId;

        @NameInMap("AgentStatus")
        public Integer agentStatus;

        @NameInMap("AgentStatusCode")
        public String agentStatusCode;

        @NameInMap("Assigned")
        public Boolean assigned;

        @NameInMap("RestType")
        public Integer restType;

        @NameInMap("TenantId")
        public Long tenantId;

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
