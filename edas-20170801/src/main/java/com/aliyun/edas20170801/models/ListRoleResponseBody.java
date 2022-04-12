// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListRoleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoleList")
    public ListRoleResponseBodyRoleList roleList;

    public static ListRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoleResponseBody self = new ListRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoleResponseBody setRoleList(ListRoleResponseBodyRoleList roleList) {
        this.roleList = roleList;
        return this;
    }
    public ListRoleResponseBodyRoleList getRoleList() {
        return this.roleList;
    }

    public static class ListRoleResponseBodyRoleListRoleItemActionListAction extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Name")
        public String name;

        public static ListRoleResponseBodyRoleListRoleItemActionListAction build(java.util.Map<String, ?> map) throws Exception {
            ListRoleResponseBodyRoleListRoleItemActionListAction self = new ListRoleResponseBodyRoleListRoleItemActionListAction();
            return TeaModel.build(map, self);
        }

        public ListRoleResponseBodyRoleListRoleItemActionListAction setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListRoleResponseBodyRoleListRoleItemActionListAction setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRoleResponseBodyRoleListRoleItemActionListAction setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListRoleResponseBodyRoleListRoleItemActionListAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRoleResponseBodyRoleListRoleItemActionList extends TeaModel {
        @NameInMap("Action")
        public java.util.List<ListRoleResponseBodyRoleListRoleItemActionListAction> action;

        public static ListRoleResponseBodyRoleListRoleItemActionList build(java.util.Map<String, ?> map) throws Exception {
            ListRoleResponseBodyRoleListRoleItemActionList self = new ListRoleResponseBodyRoleListRoleItemActionList();
            return TeaModel.build(map, self);
        }

        public ListRoleResponseBodyRoleListRoleItemActionList setAction(java.util.List<ListRoleResponseBodyRoleListRoleItemActionListAction> action) {
            this.action = action;
            return this;
        }
        public java.util.List<ListRoleResponseBodyRoleListRoleItemActionListAction> getAction() {
            return this.action;
        }

    }

    public static class ListRoleResponseBodyRoleListRoleItemRole extends TeaModel {
        @NameInMap("AdminUserId")
        public String adminUserId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Name")
        public String name;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListRoleResponseBodyRoleListRoleItemRole build(java.util.Map<String, ?> map) throws Exception {
            ListRoleResponseBodyRoleListRoleItemRole self = new ListRoleResponseBodyRoleListRoleItemRole();
            return TeaModel.build(map, self);
        }

        public ListRoleResponseBodyRoleListRoleItemRole setAdminUserId(String adminUserId) {
            this.adminUserId = adminUserId;
            return this;
        }
        public String getAdminUserId() {
            return this.adminUserId;
        }

        public ListRoleResponseBodyRoleListRoleItemRole setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListRoleResponseBodyRoleListRoleItemRole setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListRoleResponseBodyRoleListRoleItemRole setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListRoleResponseBodyRoleListRoleItemRole setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRoleResponseBodyRoleListRoleItemRole setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListRoleResponseBodyRoleListRoleItem extends TeaModel {
        @NameInMap("ActionList")
        public ListRoleResponseBodyRoleListRoleItemActionList actionList;

        @NameInMap("Role")
        public ListRoleResponseBodyRoleListRoleItemRole role;

        public static ListRoleResponseBodyRoleListRoleItem build(java.util.Map<String, ?> map) throws Exception {
            ListRoleResponseBodyRoleListRoleItem self = new ListRoleResponseBodyRoleListRoleItem();
            return TeaModel.build(map, self);
        }

        public ListRoleResponseBodyRoleListRoleItem setActionList(ListRoleResponseBodyRoleListRoleItemActionList actionList) {
            this.actionList = actionList;
            return this;
        }
        public ListRoleResponseBodyRoleListRoleItemActionList getActionList() {
            return this.actionList;
        }

        public ListRoleResponseBodyRoleListRoleItem setRole(ListRoleResponseBodyRoleListRoleItemRole role) {
            this.role = role;
            return this;
        }
        public ListRoleResponseBodyRoleListRoleItemRole getRole() {
            return this.role;
        }

    }

    public static class ListRoleResponseBodyRoleList extends TeaModel {
        @NameInMap("RoleItem")
        public java.util.List<ListRoleResponseBodyRoleListRoleItem> roleItem;

        public static ListRoleResponseBodyRoleList build(java.util.Map<String, ?> map) throws Exception {
            ListRoleResponseBodyRoleList self = new ListRoleResponseBodyRoleList();
            return TeaModel.build(map, self);
        }

        public ListRoleResponseBodyRoleList setRoleItem(java.util.List<ListRoleResponseBodyRoleListRoleItem> roleItem) {
            this.roleItem = roleItem;
            return this;
        }
        public java.util.List<ListRoleResponseBodyRoleListRoleItem> getRoleItem() {
            return this.roleItem;
        }

    }

}
