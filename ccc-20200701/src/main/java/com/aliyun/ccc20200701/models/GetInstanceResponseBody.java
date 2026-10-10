// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public GetInstanceResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2778FA12-EDD6-42AA-9B15-AF855072E5E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceResponseBody setData(GetInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceResponseBodyDataAdminList extends TeaModel {
        /**
         * <p>The display name of the administrator.</p>
         * 
         * <strong>example:</strong>
         * <p>Administrator</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The extension number of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>8032****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The logon name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <p>The personal phone number of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>1382114****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The role ID, in the format of Role@Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin@ccc-test</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The work mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

        public static GetInstanceResponseBodyDataAdminList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataAdminList self = new GetInstanceResponseBodyDataAdminList();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataAdminList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetInstanceResponseBodyDataAdminList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetInstanceResponseBodyDataAdminList setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetInstanceResponseBodyDataAdminList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyDataAdminList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetInstanceResponseBodyDataAdminList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetInstanceResponseBodyDataAdminList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public GetInstanceResponseBodyDataAdminList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetInstanceResponseBodyDataAdminList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetInstanceResponseBodyDataAdminList setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class GetInstanceResponseBodyDataChatbotBusinessUnit extends TeaModel {
        /**
         * <p>The ID of the chatbot business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnitId")
        public Long unitId;

        /**
         * <p>The identifier of the chatbot business unit.</p>
         */
        @NameInMap("UnitKey")
        public String unitKey;

        public static GetInstanceResponseBodyDataChatbotBusinessUnit build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataChatbotBusinessUnit self = new GetInstanceResponseBodyDataChatbotBusinessUnit();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataChatbotBusinessUnit setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public GetInstanceResponseBodyDataChatbotBusinessUnit setUnitKey(String unitKey) {
            this.unitKey = unitKey;
            return this;
        }
        public String getUnitKey() {
            return this.unitKey;
        }

    }

    public static class GetInstanceResponseBodyDataNumberListSkillGroups extends TeaModel {
        /**
         * <p>The description of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>Test skill group of Cloud Call Center</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>Test skill group</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The skill group name.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of phone numbers associated with the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PhoneNumberCount")
        public Integer phoneNumberCount;

        /**
         * <p>The skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <p>The number of agents associated with the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("UserCount")
        public Integer userCount;

        public static GetInstanceResponseBodyDataNumberListSkillGroups build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataNumberListSkillGroups self = new GetInstanceResponseBodyDataNumberListSkillGroups();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataNumberListSkillGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetInstanceResponseBodyDataNumberListSkillGroups setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetInstanceResponseBodyDataNumberListSkillGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyDataNumberListSkillGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceResponseBodyDataNumberListSkillGroups setPhoneNumberCount(Integer phoneNumberCount) {
            this.phoneNumberCount = phoneNumberCount;
            return this;
        }
        public Integer getPhoneNumberCount() {
            return this.phoneNumberCount;
        }

        public GetInstanceResponseBodyDataNumberListSkillGroups setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public GetInstanceResponseBodyDataNumberListSkillGroups setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

    }

    public static class GetInstanceResponseBodyDataNumberList extends TeaModel {
        /**
         * <p>Indicates whether the phone number is available.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The city to which the phone number belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Leshan</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The ID of the contact flow (IVR) associated with the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>2ec7a58f-3243-4815-bb21-97b480b95f5e</p>
         */
        @NameInMap("ContactFlowId")
        public String contactFlowId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>0830011****</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>The province to which the phone number belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Sichuan</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>The list of skill groups associated with the phone number.</p>
         */
        @NameInMap("SkillGroups")
        public java.util.List<GetInstanceResponseBodyDataNumberListSkillGroups> skillGroups;

        /**
         * <p>The usage of the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>Bidirection</p>
         */
        @NameInMap("Usage")
        public String usage;

        /**
         * <p>The agent ID. If this parameter is not empty, the phone number is a personal outbound phone number of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetInstanceResponseBodyDataNumberList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataNumberList self = new GetInstanceResponseBodyDataNumberList();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataNumberList setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public GetInstanceResponseBodyDataNumberList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetInstanceResponseBodyDataNumberList setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public GetInstanceResponseBodyDataNumberList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyDataNumberList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetInstanceResponseBodyDataNumberList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GetInstanceResponseBodyDataNumberList setSkillGroups(java.util.List<GetInstanceResponseBodyDataNumberListSkillGroups> skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyDataNumberListSkillGroups> getSkillGroups() {
            return this.skillGroups;
        }

        public GetInstanceResponseBodyDataNumberList setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public GetInstanceResponseBodyDataNumberList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The list of administrators.</p>
         */
        @NameInMap("AdminList")
        public java.util.List<GetInstanceResponseBodyDataAdminList> adminList;

        /**
         * <p>The agent type used by the instance.</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The ID of the Alibaba Cloud account to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>157123456789****</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <p>The chatbot business unit associated with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;UnitId&quot;:0,&quot;UnitKey&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ChatbotBusinessUnit")
        public GetInstanceResponseBodyDataChatbotBusinessUnit chatbotBusinessUnit;

        /**
         * <p>The URL of the Cloud Call Center instance. This URL is used to access the homepage of the instance and consists of a specific Cloud Call Center URL and the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ccc-v2.aliyun.com/#/workbench/ccc-test">https://ccc-v2.aliyun.com/#/workbench/ccc-test</a></p>
         */
        @NameInMap("ConsoleUrl")
        public String consoleUrl;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance of Cloud Call Center</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The globally unique domain name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of phone numbers.</p>
         */
        @NameInMap("NumberList")
        public java.util.List<GetInstanceResponseBodyDataNumberList> numberList;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyData self = new GetInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyData setAdminList(java.util.List<GetInstanceResponseBodyDataAdminList> adminList) {
            this.adminList = adminList;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyDataAdminList> getAdminList() {
            return this.adminList;
        }

        public GetInstanceResponseBodyData setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public GetInstanceResponseBodyData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public GetInstanceResponseBodyData setChatbotBusinessUnit(GetInstanceResponseBodyDataChatbotBusinessUnit chatbotBusinessUnit) {
            this.chatbotBusinessUnit = chatbotBusinessUnit;
            return this;
        }
        public GetInstanceResponseBodyDataChatbotBusinessUnit getChatbotBusinessUnit() {
            return this.chatbotBusinessUnit;
        }

        public GetInstanceResponseBodyData setConsoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }
        public String getConsoleUrl() {
            return this.consoleUrl;
        }

        public GetInstanceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetInstanceResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetInstanceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetInstanceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceResponseBodyData setNumberList(java.util.List<GetInstanceResponseBodyDataNumberList> numberList) {
            this.numberList = numberList;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyDataNumberList> getNumberList() {
            return this.numberList;
        }

        public GetInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
