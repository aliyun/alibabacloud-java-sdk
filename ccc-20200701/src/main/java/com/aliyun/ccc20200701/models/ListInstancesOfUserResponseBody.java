// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListInstancesOfUserResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public ListInstancesOfUserResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3969FC68-CEC2-4398-B76A-60D2F7EDEBAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstancesOfUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesOfUserResponseBody self = new ListInstancesOfUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesOfUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstancesOfUserResponseBody setData(ListInstancesOfUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstancesOfUserResponseBodyData getData() {
        return this.data;
    }

    public ListInstancesOfUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesOfUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesOfUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstancesOfUserResponseBodyDataListAdminList extends TeaModel {
        /**
         * <p>The administrator\&quot;s name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试坐席</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Mailbox.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Agent extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>8032****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Agent logon name.</p>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <p>The agent\&quot;s personal phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1382114****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The role ID, in the format: role\@instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin@ccc-test</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>Role name.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Work mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

        public static ListInstancesOfUserResponseBodyDataListAdminList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyDataListAdminList self = new ListInstancesOfUserResponseBodyDataListAdminList();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class ListInstancesOfUserResponseBodyDataListNumberListSkillGroups extends TeaModel {
        /**
         * <p>Skill group description.</p>
         * 
         * <strong>example:</strong>
         * <p>云联络中心的测试技能组。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>测试技能组</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Number of phone numbers associated with the skill group.</p>
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
         * <p>2</p>
         */
        @NameInMap("UserCount")
        public Integer userCount;

        public static ListInstancesOfUserResponseBodyDataListNumberListSkillGroups build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyDataListNumberListSkillGroups self = new ListInstancesOfUserResponseBodyDataListNumberListSkillGroups();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyDataListNumberListSkillGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstancesOfUserResponseBodyDataListNumberListSkillGroups setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListInstancesOfUserResponseBodyDataListNumberListSkillGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesOfUserResponseBodyDataListNumberListSkillGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstancesOfUserResponseBodyDataListNumberListSkillGroups setPhoneNumberCount(Integer phoneNumberCount) {
            this.phoneNumberCount = phoneNumberCount;
            return this;
        }
        public Integer getPhoneNumberCount() {
            return this.phoneNumberCount;
        }

        public ListInstancesOfUserResponseBodyDataListNumberListSkillGroups setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListInstancesOfUserResponseBodyDataListNumberListSkillGroups setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

    }

    public static class ListInstancesOfUserResponseBodyDataListNumberList extends TeaModel {
        /**
         * <p>Indicates whether the number is active.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The city of the phone number\&quot;s registration location.</p>
         * 
         * <strong>example:</strong>
         * <p>乐山</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The contact flow ID (IVR) associated with this phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>a3fb6c62-9b49-4942-ae5b-cf2abd4123ek</p>
         */
        @NameInMap("ContactFlowId")
        public String contactFlowId;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number.</p>
         * 
         * <strong>example:</strong>
         * <p>0830011****</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>The province of the phone number\&quot;s registration location.</p>
         * 
         * <strong>example:</strong>
         * <p>四川</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>List of skill groups associated with the phone number.</p>
         */
        @NameInMap("SkillGroups")
        public java.util.List<ListInstancesOfUserResponseBodyDataListNumberListSkillGroups> skillGroups;

        /**
         * <p>The usage of the number.</p>
         * 
         * <strong>example:</strong>
         * <p>Bidirection</p>
         */
        @NameInMap("Usage")
        public String usage;

        /**
         * <p>Agent ID. If this parameter is not empty, the number is a personal outbound number assigned to the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListInstancesOfUserResponseBodyDataListNumberList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyDataListNumberList self = new ListInstancesOfUserResponseBodyDataListNumberList();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setSkillGroups(java.util.List<ListInstancesOfUserResponseBodyDataListNumberListSkillGroups> skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }
        public java.util.List<ListInstancesOfUserResponseBodyDataListNumberListSkillGroups> getSkillGroups() {
            return this.skillGroups;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListInstancesOfUserResponseBodyDataList extends TeaModel {
        /**
         * <p>Administrator list.</p>
         */
        @NameInMap("AdminList")
        public java.util.List<ListInstancesOfUserResponseBodyDataListAdminList> adminList;

        /**
         * <p>The Alibaba Cloud Account ID to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>157123456789****</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <p>The URL of the Cloud Contact Center instance, used to access the homepage of the Cloud Contact Center instance. It consists of the specific Cloud Contact Center URL followed by the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ccc-v2.aliyun.com/#/workbench/ccc-test">https://ccc-v2.aliyun.com/#/workbench/ccc-test</a></p>
         */
        @NameInMap("ConsoleUrl")
        public String consoleUrl;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>云联络中心的测试实例。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name of the instance, which is globally unique.</p>
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
         * <p>测试实例</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>List of numbers.</p>
         */
        @NameInMap("NumberList")
        public java.util.List<ListInstancesOfUserResponseBodyDataListNumberList> numberList;

        /**
         * <p>Instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListInstancesOfUserResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyDataList self = new ListInstancesOfUserResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyDataList setAdminList(java.util.List<ListInstancesOfUserResponseBodyDataListAdminList> adminList) {
            this.adminList = adminList;
            return this;
        }
        public java.util.List<ListInstancesOfUserResponseBodyDataListAdminList> getAdminList() {
            return this.adminList;
        }

        public ListInstancesOfUserResponseBodyDataList setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListInstancesOfUserResponseBodyDataList setConsoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }
        public String getConsoleUrl() {
            return this.consoleUrl;
        }

        public ListInstancesOfUserResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstancesOfUserResponseBodyDataList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListInstancesOfUserResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListInstancesOfUserResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstancesOfUserResponseBodyDataList setNumberList(java.util.List<ListInstancesOfUserResponseBodyDataListNumberList> numberList) {
            this.numberList = numberList;
            return this;
        }
        public java.util.List<ListInstancesOfUserResponseBodyDataListNumberList> getNumberList() {
            return this.numberList;
        }

        public ListInstancesOfUserResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListInstancesOfUserResponseBodyData extends TeaModel {
        /**
         * <p>List.</p>
         */
        @NameInMap("List")
        public java.util.List<ListInstancesOfUserResponseBodyDataList> list;

        /**
         * <p>Page number, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInstancesOfUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyData self = new ListInstancesOfUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyData setList(java.util.List<ListInstancesOfUserResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListInstancesOfUserResponseBodyDataList> getList() {
            return this.list;
        }

        public ListInstancesOfUserResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListInstancesOfUserResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInstancesOfUserResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
