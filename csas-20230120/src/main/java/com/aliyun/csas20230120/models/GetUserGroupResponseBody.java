// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1310DBC7-7E1F-55D3-B4B4-E4BE912517FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user group.</p>
     */
    @NameInMap("UserGroup")
    public GetUserGroupResponseBodyUserGroup userGroup;

    public static GetUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserGroupResponseBody self = new GetUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserGroupResponseBody setUserGroup(GetUserGroupResponseBodyUserGroup userGroup) {
        this.userGroup = userGroup;
        return this;
    }
    public GetUserGroupResponseBodyUserGroup getUserGroup() {
        return this.userGroup;
    }

    public static class GetUserGroupResponseBodyUserGroupAttributes extends TeaModel {
        /**
         * <p>The ID of the identity provider (IdP) for the user group. This parameter is returned when UserGroupType is set to <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>The relationship of the user group. Valid values:</p>
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
         * <li><p><strong>username</strong>: The username.</p>
         * </li>
         * <li><p><strong>department</strong>: The department.</p>
         * </li>
         * <li><p><strong>email</strong>: The email address.</p>
         * </li>
         * <li><p><strong>telephone</strong>: The mobile phone number.</p>
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
         * <li><p>If UserGroupType is set to <strong>username</strong>, this parameter specifies the value of the username. The value can be 1 to 128 characters in length and can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * </li>
         * <li><p>If UserGroupType is set to <strong>department</strong>, this parameter specifies the value of the department. Example: OU=Department 1,OU=SASE DingTalk.</p>
         * </li>
         * <li><p>If UserGroupType is set to <strong>email</strong>, this parameter specifies the value of the email address. Example: username\@example.com.</p>
         * </li>
         * <li><p>If UserGroupType is set to <strong>telephone</strong>, this parameter specifies the value of the mobile phone number. Example: 13900001234.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetUserGroupResponseBodyUserGroupAttributes build(java.util.Map<String, ?> map) throws Exception {
            GetUserGroupResponseBodyUserGroupAttributes self = new GetUserGroupResponseBodyUserGroupAttributes();
            return TeaModel.build(map, self);
        }

        public GetUserGroupResponseBodyUserGroupAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public GetUserGroupResponseBodyUserGroupAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public GetUserGroupResponseBodyUserGroupAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public GetUserGroupResponseBodyUserGroupAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetUserGroupResponseBodyUserGroup extends TeaModel {
        /**
         * <p>The collection of user group properties. The properties are evaluated with a logical OR operator.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<GetUserGroupResponseBodyUserGroupAttributes> attributes;

        /**
         * <p>The time when the user group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10 11:39:22</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the user group.</p>
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

        public static GetUserGroupResponseBodyUserGroup build(java.util.Map<String, ?> map) throws Exception {
            GetUserGroupResponseBodyUserGroup self = new GetUserGroupResponseBodyUserGroup();
            return TeaModel.build(map, self);
        }

        public GetUserGroupResponseBodyUserGroup setAttributes(java.util.List<GetUserGroupResponseBodyUserGroupAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<GetUserGroupResponseBodyUserGroupAttributes> getAttributes() {
            return this.attributes;
        }

        public GetUserGroupResponseBodyUserGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetUserGroupResponseBodyUserGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserGroupResponseBodyUserGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetUserGroupResponseBodyUserGroup setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
