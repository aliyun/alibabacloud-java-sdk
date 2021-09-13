// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListInstancesOfUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("Data")
    public ListInstancesOfUserResponseBodyData data;

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

    public ListInstancesOfUserResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListInstancesOfUserResponseBody setData(ListInstancesOfUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstancesOfUserResponseBodyData getData() {
        return this.data;
    }

    public static class ListInstancesOfUserResponseBodyDataListAdminList extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Email")
        public String email;

        @NameInMap("WorkMode")
        public String workMode;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RoleId")
        public String roleId;

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

        public ListInstancesOfUserResponseBodyDataListAdminList setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesOfUserResponseBodyDataListAdminList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

    public static class ListInstancesOfUserResponseBodyDataListNumberListSkillGroups extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Description")
        public String description;

        @NameInMap("PhoneNumberCount")
        public Integer phoneNumberCount;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("UserCount")
        public Integer userCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        public static ListInstancesOfUserResponseBodyDataListNumberListSkillGroups build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyDataListNumberListSkillGroups self = new ListInstancesOfUserResponseBodyDataListNumberListSkillGroups();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyDataListNumberListSkillGroups setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListInstancesOfUserResponseBodyDataListNumberListSkillGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

    }

    public static class ListInstancesOfUserResponseBodyDataListNumberList extends TeaModel {
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Number")
        public String number;

        @NameInMap("City")
        public String city;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("ContactFlowId")
        public String contactFlowId;

        @NameInMap("Province")
        public String province;

        @NameInMap("SkillGroups")
        public java.util.List<ListInstancesOfUserResponseBodyDataListNumberListSkillGroups> skillGroups;

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

        public ListInstancesOfUserResponseBodyDataListNumberList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public ListInstancesOfUserResponseBodyDataListNumberList setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
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

    }

    public static class ListInstancesOfUserResponseBodyDataList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ConsoleUrl")
        public String consoleUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("Name")
        public String name;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Id")
        public String id;

        @NameInMap("AdminList")
        public java.util.List<ListInstancesOfUserResponseBodyDataListAdminList> adminList;

        @NameInMap("NumberList")
        public java.util.List<ListInstancesOfUserResponseBodyDataListNumberList> numberList;

        public static ListInstancesOfUserResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyDataList self = new ListInstancesOfUserResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListInstancesOfUserResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public ListInstancesOfUserResponseBodyDataList setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListInstancesOfUserResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

        public ListInstancesOfUserResponseBodyDataList setAdminList(java.util.List<ListInstancesOfUserResponseBodyDataListAdminList> adminList) {
            this.adminList = adminList;
            return this;
        }
        public java.util.List<ListInstancesOfUserResponseBodyDataListAdminList> getAdminList() {
            return this.adminList;
        }

        public ListInstancesOfUserResponseBodyDataList setNumberList(java.util.List<ListInstancesOfUserResponseBodyDataListNumberList> numberList) {
            this.numberList = numberList;
            return this;
        }
        public java.util.List<ListInstancesOfUserResponseBodyDataListNumberList> getNumberList() {
            return this.numberList;
        }

    }

    public static class ListInstancesOfUserResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("List")
        public java.util.List<ListInstancesOfUserResponseBodyDataList> list;

        public static ListInstancesOfUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesOfUserResponseBodyData self = new ListInstancesOfUserResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListInstancesOfUserResponseBodyData setList(java.util.List<ListInstancesOfUserResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListInstancesOfUserResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
