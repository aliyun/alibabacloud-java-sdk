// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListRoleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The roles.</p>
     */
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
        /**
         * <p>The serial number of the permission that is granted to the role.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The description of the permission to be granted to the role.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the permission group to which the permission that is granted to the role belongs.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the permission to be granted to the role.</p>
         */
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
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("AdminUserId")
        public String adminUserId;

        /**
         * <p>The timestamp when the role was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the role.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>Indicates whether the role is a default role.</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The name of the role.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The timestamp when the role was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
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
        /**
         * <p>The set of permissions to be granted to the role.</p>
         */
        @NameInMap("ActionList")
        public ListRoleResponseBodyRoleListRoleItemActionList actionList;

        /**
         * <p>The roles.</p>
         */
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
