// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListAgentBySkillGroupIdResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of &quot;Success&quot; indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Agent information.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAgentBySkillGroupIdResponseBodyData> data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
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
     * <p>Indicates whether the API invocation succeeded. Valid values:</p>
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

    public static ListAgentBySkillGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentBySkillGroupIdResponseBody self = new ListAgentBySkillGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentBySkillGroupIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentBySkillGroupIdResponseBody setData(java.util.List<ListAgentBySkillGroupIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgentBySkillGroupIdResponseBodyData> getData() {
        return this.data;
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

    public ListAgentBySkillGroupIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgentBySkillGroupIdResponseBodyData extends TeaModel {
        /**
         * <p>Account name of the agent, which is the phone number or mailbox entered during account registration. It is unique within the instance.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>666666</p>
         */
        @NameInMap("AgentId")
        public Long agentId;

        /**
         * <p>Display name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>刘测试</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Agent status. Only agents with a Normal status can perform Business Activities. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Normal</li>
         * <li><strong>1</strong>: Frozen</li>
         * <li><strong>2</strong>: Deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Tenant ID to which the agent belongs. This corresponds to the instance ID provided in the input parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListAgentBySkillGroupIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentBySkillGroupIdResponseBodyData self = new ListAgentBySkillGroupIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentBySkillGroupIdResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListAgentBySkillGroupIdResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public ListAgentBySkillGroupIdResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAgentBySkillGroupIdResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
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
