// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListAgentBySkillGroupIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListAgentBySkillGroupIdResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListAgentBySkillGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentBySkillGroupIdResponseBody self = new ListAgentBySkillGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentBySkillGroupIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentBySkillGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentBySkillGroupIdResponseBody setData(java.util.List<ListAgentBySkillGroupIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgentBySkillGroupIdResponseBodyData> getData() {
        return this.data;
    }

    public ListAgentBySkillGroupIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentBySkillGroupIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgentBySkillGroupIdResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("AgentId")
        public Long agentId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("TenantId")
        public Long tenantId;

        public static ListAgentBySkillGroupIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentBySkillGroupIdResponseBodyData self = new ListAgentBySkillGroupIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentBySkillGroupIdResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAgentBySkillGroupIdResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAgentBySkillGroupIdResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public ListAgentBySkillGroupIdResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListAgentBySkillGroupIdResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
