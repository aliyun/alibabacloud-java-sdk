// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetAgentResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentResponseBody self = new GetAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentResponseBody setData(GetAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentResponseBodyData getData() {
        return this.data;
    }

    public GetAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentResponseBodyDataGroupList extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Description")
        public String description;

        @NameInMap("ChannelType")
        public Integer channelType;

        @NameInMap("SkillGroupId")
        public Long skillGroupId;

        @NameInMap("Name")
        public String name;

        public static GetAgentResponseBodyDataGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyDataGroupList self = new GetAgentResponseBodyDataGroupList();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyDataGroupList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAgentResponseBodyDataGroupList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentResponseBodyDataGroupList setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public GetAgentResponseBodyDataGroupList setSkillGroupId(Long skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public Long getSkillGroupId() {
            return this.skillGroupId;
        }

        public GetAgentResponseBodyDataGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAgentResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("AgentId")
        public Long agentId;

        @NameInMap("GroupList")
        public java.util.List<GetAgentResponseBodyDataGroupList> groupList;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("TenantId")
        public Long tenantId;

        public static GetAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyData self = new GetAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAgentResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAgentResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public GetAgentResponseBodyData setGroupList(java.util.List<GetAgentResponseBodyDataGroupList> groupList) {
            this.groupList = groupList;
            return this;
        }
        public java.util.List<GetAgentResponseBodyDataGroupList> getGroupList() {
            return this.groupList;
        }

        public GetAgentResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
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
