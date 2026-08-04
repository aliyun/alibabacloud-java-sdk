// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateUserGroupRequest extends TeaModel {
    /**
     * <p>The collection of user group attributes. You can specify a maximum of 3,000 attributes. The attributes are combined using a logical OR.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Attributes")
    public java.util.List<CreateUserGroupRequestAttributes> attributes;

    /**
     * <p>The user group description. The description must be 1 to 128 characters long and can contain Chinese characters, letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一条用户组</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The user group name. The name must be 1 to 128 characters long and can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_group_name</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupRequest self = new CreateUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupRequest setAttributes(java.util.List<CreateUserGroupRequestAttributes> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<CreateUserGroupRequestAttributes> getAttributes() {
        return this.attributes;
    }

    public CreateUserGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class CreateUserGroupRequestAttributes extends TeaModel {
        /**
         * <p>The ID of the identity provider (IdP) for the user group. This parameter is used when UserGroupType is set to <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>The relationship for the user group. Valid values:</p>
         * <ul>
         * <li><p><strong>Equal</strong>: Equal to.</p>
         * </li>
         * <li><p><strong>Unequal</strong>: Not equal to.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <li><p><strong>email</strong>: Email.</p>
         * </li>
         * <li><p><strong>telephone</strong>: Mobile phone.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        /**
         * <p>The value of the user group attribute.</p>
         * <ul>
         * <li><p>If UserGroupType is set to <strong>username</strong>, this parameter specifies the username value. The value must be 1 to 128 characters long. It can contain Chinese characters, letters, digits, periods (.), underscores (_), hyphens (-), asterisks (\*), at signs (@), and spaces.</p>
         * </li>
         * <li><p>If UserGroupType is set to <strong>department</strong>, this parameter specifies the department value. For example: OU=Department 1,OU=SASE DingTalk.</p>
         * </li>
         * <li><p>If UserGroupType is set to <strong>email</strong>, this parameter specifies the email address. For example: username\@example.com.</p>
         * </li>
         * <li><p>If UserGroupType is set to <strong>telephone</strong>, this parameter specifies the mobile phone number. For example: 13900001234.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateUserGroupRequestAttributes build(java.util.Map<String, ?> map) throws Exception {
            CreateUserGroupRequestAttributes self = new CreateUserGroupRequestAttributes();
            return TeaModel.build(map, self);
        }

        public CreateUserGroupRequestAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public CreateUserGroupRequestAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public CreateUserGroupRequestAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public CreateUserGroupRequestAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
