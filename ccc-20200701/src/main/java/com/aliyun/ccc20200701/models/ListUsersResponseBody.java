// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListUsersResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUsersResponseBody setData(ListUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUsersResponseBodyData getData() {
        return this.data;
    }

    public ListUsersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsersResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUsersResponseBodyDataListPersonalOutboundNumberList extends TeaModel {
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("City")
        public String city;

        @NameInMap("Number")
        public String number;

        @NameInMap("Province")
        public String province;

        @NameInMap("Usage")
        public String usage;

        public static ListUsersResponseBodyDataListPersonalOutboundNumberList build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyDataListPersonalOutboundNumberList self = new ListUsersResponseBodyDataListPersonalOutboundNumberList();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyDataListPersonalOutboundNumberList setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListUsersResponseBodyDataListPersonalOutboundNumberList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListUsersResponseBodyDataListPersonalOutboundNumberList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListUsersResponseBodyDataListPersonalOutboundNumberList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ListUsersResponseBodyDataListPersonalOutboundNumberList setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class ListUsersResponseBodyDataListSkillLevelList extends TeaModel {
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("SkillLevel")
        public Integer skillLevel;

        public static ListUsersResponseBodyDataListSkillLevelList build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyDataListSkillLevelList self = new ListUsersResponseBodyDataListSkillLevelList();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyDataListSkillLevelList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListUsersResponseBodyDataListSkillLevelList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListUsersResponseBodyDataListSkillLevelList setSkillLevel(Integer skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public Integer getSkillLevel() {
            return this.skillLevel;
        }

    }

    public static class ListUsersResponseBodyDataList extends TeaModel {
        @NameInMap("DeviceExt")
        public String deviceExt;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceState")
        public String deviceState;

        @NameInMap("DisplayId")
        public String displayId;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Email")
        public String email;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("PersonalOutboundNumberList")
        public java.util.List<ListUsersResponseBodyDataListPersonalOutboundNumberList> personalOutboundNumberList;

        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("PrimaryAccount")
        public Boolean primaryAccount;

        @NameInMap("RamId")
        public Long ramId;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("SkillLevelList")
        public java.util.List<ListUsersResponseBodyDataListSkillLevelList> skillLevelList;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WorkMode")
        public String workMode;

        public static ListUsersResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyDataList self = new ListUsersResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyDataList setDeviceExt(String deviceExt) {
            this.deviceExt = deviceExt;
            return this;
        }
        public String getDeviceExt() {
            return this.deviceExt;
        }

        public ListUsersResponseBodyDataList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListUsersResponseBodyDataList setDeviceState(String deviceState) {
            this.deviceState = deviceState;
            return this;
        }
        public String getDeviceState() {
            return this.deviceState;
        }

        public ListUsersResponseBodyDataList setDisplayId(String displayId) {
            this.displayId = displayId;
            return this;
        }
        public String getDisplayId() {
            return this.displayId;
        }

        public ListUsersResponseBodyDataList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyDataList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyDataList setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListUsersResponseBodyDataList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListUsersResponseBodyDataList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListUsersResponseBodyDataList setPersonalOutboundNumberList(java.util.List<ListUsersResponseBodyDataListPersonalOutboundNumberList> personalOutboundNumberList) {
            this.personalOutboundNumberList = personalOutboundNumberList;
            return this;
        }
        public java.util.List<ListUsersResponseBodyDataListPersonalOutboundNumberList> getPersonalOutboundNumberList() {
            return this.personalOutboundNumberList;
        }

        public ListUsersResponseBodyDataList setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public ListUsersResponseBodyDataList setPrimaryAccount(Boolean primaryAccount) {
            this.primaryAccount = primaryAccount;
            return this;
        }
        public Boolean getPrimaryAccount() {
            return this.primaryAccount;
        }

        public ListUsersResponseBodyDataList setRamId(Long ramId) {
            this.ramId = ramId;
            return this;
        }
        public Long getRamId() {
            return this.ramId;
        }

        public ListUsersResponseBodyDataList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListUsersResponseBodyDataList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListUsersResponseBodyDataList setSkillLevelList(java.util.List<ListUsersResponseBodyDataListSkillLevelList> skillLevelList) {
            this.skillLevelList = skillLevelList;
            return this;
        }
        public java.util.List<ListUsersResponseBodyDataListSkillLevelList> getSkillLevelList() {
            return this.skillLevelList;
        }

        public ListUsersResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyDataList setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class ListUsersResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListUsersResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyData self = new ListUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyData setList(java.util.List<ListUsersResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListUsersResponseBodyDataList> getList() {
            return this.list;
        }

        public ListUsersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListUsersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUsersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
