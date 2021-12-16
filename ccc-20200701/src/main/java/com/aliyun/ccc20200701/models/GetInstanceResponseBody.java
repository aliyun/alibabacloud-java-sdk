// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInstanceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

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

    public GetInstanceResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceResponseBodyDataAdminList extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Email")
        public String email;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("UserId")
        public String userId;

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

    public static class GetInstanceResponseBodyDataNumberListSkillGroups extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("PhoneNumberCount")
        public Integer phoneNumberCount;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

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
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("City")
        public String city;

        @NameInMap("ContactFlowId")
        public String contactFlowId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Number")
        public String number;

        @NameInMap("Province")
        public String province;

        @NameInMap("SkillGroups")
        public java.util.List<GetInstanceResponseBodyDataNumberListSkillGroups> skillGroups;

        @NameInMap("Usage")
        public String usage;

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
        @NameInMap("AdminList")
        public java.util.List<GetInstanceResponseBodyDataAdminList> adminList;

        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("ConsoleUrl")
        public String consoleUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NumberList")
        public java.util.List<GetInstanceResponseBodyDataNumberList> numberList;

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

        public GetInstanceResponseBodyData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
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
