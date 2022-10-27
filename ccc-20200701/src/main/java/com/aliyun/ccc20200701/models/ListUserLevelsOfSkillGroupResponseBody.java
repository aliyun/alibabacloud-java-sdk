// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListUserLevelsOfSkillGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListUserLevelsOfSkillGroupResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUserLevelsOfSkillGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserLevelsOfSkillGroupResponseBody self = new ListUserLevelsOfSkillGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserLevelsOfSkillGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserLevelsOfSkillGroupResponseBody setData(ListUserLevelsOfSkillGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUserLevelsOfSkillGroupResponseBodyData getData() {
        return this.data;
    }

    public ListUserLevelsOfSkillGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUserLevelsOfSkillGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserLevelsOfSkillGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserLevelsOfSkillGroupResponseBodyDataList extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("SkillLevel")
        public Integer skillLevel;

        @NameInMap("UserId")
        public String userId;

        public static ListUserLevelsOfSkillGroupResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListUserLevelsOfSkillGroupResponseBodyDataList self = new ListUserLevelsOfSkillGroupResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListUserLevelsOfSkillGroupResponseBodyDataList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUserLevelsOfSkillGroupResponseBodyDataList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListUserLevelsOfSkillGroupResponseBodyDataList setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public ListUserLevelsOfSkillGroupResponseBodyDataList setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListUserLevelsOfSkillGroupResponseBodyDataList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListUserLevelsOfSkillGroupResponseBodyDataList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListUserLevelsOfSkillGroupResponseBodyDataList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListUserLevelsOfSkillGroupResponseBodyDataList setSkillLevel(Integer skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public Integer getSkillLevel() {
            return this.skillLevel;
        }

        public ListUserLevelsOfSkillGroupResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListUserLevelsOfSkillGroupResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListUserLevelsOfSkillGroupResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUserLevelsOfSkillGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserLevelsOfSkillGroupResponseBodyData self = new ListUserLevelsOfSkillGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserLevelsOfSkillGroupResponseBodyData setList(java.util.List<ListUserLevelsOfSkillGroupResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListUserLevelsOfSkillGroupResponseBodyDataList> getList() {
            return this.list;
        }

        public ListUserLevelsOfSkillGroupResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListUserLevelsOfSkillGroupResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUserLevelsOfSkillGroupResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
