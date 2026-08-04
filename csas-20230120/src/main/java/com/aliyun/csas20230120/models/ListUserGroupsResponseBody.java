// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4AB972E2-D702-5464-B132-B1911498B8BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of user groups.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    /**
     * <p>A list of user groups.</p>
     */
    @NameInMap("UserGroups")
    public java.util.List<ListUserGroupsResponseBodyUserGroups> userGroups;

    public static ListUserGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsResponseBody self = new ListUserGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserGroupsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public ListUserGroupsResponseBody setUserGroups(java.util.List<ListUserGroupsResponseBodyUserGroups> userGroups) {
        this.userGroups = userGroups;
        return this;
    }
    public java.util.List<ListUserGroupsResponseBodyUserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static class ListUserGroupsResponseBodyUserGroupsAttributes extends TeaModel {
        /**
         * <p>The identity provider ID for the user group. This parameter appears only when the user group type is <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>The relation for the user group. Valid values:</p>
         * <ul>
         * <li><p><strong>Equal</strong>: Equal to.</p>
         * </li>
         * <li><p><strong>Unequal</strong>: Not equal to.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <p>The type of the user group. Valid values:</p>
         * <ul>
         * <li><p><strong>username</strong>: Username.</p>
         * </li>
         * <li><p><strong>department</strong>: Department.</p>
         * </li>
         * <li><p><strong>email</strong>: Email address.</p>
         * </li>
         * <li><p><strong>telephone</strong>: Phone number.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        /**
         * <p>The value of the user group property.</p>
         * <ul>
         * <li><p>If the user group type is <strong>username</strong>, this is the username. The value must be 1 to 128 characters in length. It can contain letters, digits, periods (.), underscores (_), and hyphens (-). It supports both uppercase and lowercase letters and Chinese characters.</p>
         * </li>
         * <li><p>If the user group type is <strong>department</strong>, this is the department name. Example: OU=Department 1,OU=SASE DingTalk.</p>
         * </li>
         * <li><p>If the user group type is <strong>email</strong>, this is the email address. Example: username\@example.com.</p>
         * </li>
         * <li><p>If the user group type is <strong>telephone</strong>, this is the phone number. Example: 13900001234.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListUserGroupsResponseBodyUserGroupsAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsResponseBodyUserGroupsAttributes self = new ListUserGroupsResponseBodyUserGroupsAttributes();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsResponseBodyUserGroupsAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public ListUserGroupsResponseBodyUserGroupsAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public ListUserGroupsResponseBodyUserGroupsAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public ListUserGroupsResponseBodyUserGroupsAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListUserGroupsResponseBodyUserGroups extends TeaModel {
        /**
         * <p>A collection of user group properties. Multiple properties are combined with OR logic.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<ListUserGroupsResponseBodyUserGroupsAttributes> attributes;

        /**
         * <p>The time when the user group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10 11:39:22</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>A description of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条用户组</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>user_group_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>usergroup-6f1ef2fc56b6****</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        public static ListUserGroupsResponseBodyUserGroups build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsResponseBodyUserGroups self = new ListUserGroupsResponseBodyUserGroups();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsResponseBodyUserGroups setAttributes(java.util.List<ListUserGroupsResponseBodyUserGroupsAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<ListUserGroupsResponseBodyUserGroupsAttributes> getAttributes() {
            return this.attributes;
        }

        public ListUserGroupsResponseBodyUserGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserGroupsResponseBodyUserGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserGroupsResponseBodyUserGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserGroupsResponseBodyUserGroups setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
