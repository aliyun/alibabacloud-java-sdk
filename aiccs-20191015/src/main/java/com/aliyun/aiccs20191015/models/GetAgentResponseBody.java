// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of Success indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Agent data.</p>
     */
    @NameInMap("Data")
    public GetAgentResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

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

    public static GetAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentResponseBody self = new GetAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentResponseBody setData(GetAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentResponseBodyData getData() {
        return this.data;
    }

    public GetAgentResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentResponseBodyDataGroupList extends TeaModel {
        /**
         * <p>Skill group channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChannelType")
        public Integer channelType;

        /**
         * <p>Skill group description.</p>
         * 
         * <strong>example:</strong>
         * <p>自动化技能组</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Display name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>自动化技能组</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Skill group name.</p>
         * 
         * <strong>example:</strong>
         * <p>自动化技能组</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("SkillGroupId")
        public Long skillGroupId;

        public static GetAgentResponseBodyDataGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyDataGroupList self = new GetAgentResponseBodyDataGroupList();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyDataGroupList setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public GetAgentResponseBodyDataGroupList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentResponseBodyDataGroupList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAgentResponseBodyDataGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentResponseBodyDataGroupList setSkillGroupId(Long skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public Long getSkillGroupId() {
            return this.skillGroupId;
        }

    }

    public static class GetAgentResponseBodyData extends TeaModel {
        /**
         * <p>Agent account name, which is the phone number or mailbox entered during account registration. Unique within the instance.</p>
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
         * <p>222222</p>
         */
        @NameInMap("AgentId")
        public Long agentId;

        /**
         * <p>Agent display name shown externally.</p>
         * 
         * <strong>example:</strong>
         * <p>XX测试</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Skill group information to which the agent belongs.</p>
         */
        @NameInMap("GroupList")
        public java.util.List<GetAgentResponseBodyDataGroupList> groupList;

        /**
         * <p>Agent status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Normal</li>
         * <li><strong>1</strong>: Freeze</li>
         * <li><strong>2</strong>: Delete</li>
         * </ul>
         * <blockquote>
         * <p>Only agents with a Normal status can perform Business Activities.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Tenant ID to which the agent belongs, corresponding to the instance ID in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static GetAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyData self = new GetAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetAgentResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public GetAgentResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAgentResponseBodyData setGroupList(java.util.List<GetAgentResponseBodyDataGroupList> groupList) {
            this.groupList = groupList;
            return this;
        }
        public java.util.List<GetAgentResponseBodyDataGroupList> getGroupList() {
            return this.groupList;
        }

        public GetAgentResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAgentResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
