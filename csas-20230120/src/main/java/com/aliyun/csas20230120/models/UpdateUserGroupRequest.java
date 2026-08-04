// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserGroupRequest extends TeaModel {
    /**
     * <p>The set of user group attributes. The maximum total number is 3000. Multiple user group attributes have an OR relationship and take effect as a union.</p>
     */
    @NameInMap("Attributes")
    public java.util.List<UpdateUserGroupRequestAttributes> attributes;

    /**
     * <p>The description of the user group. The description must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一条用户组</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The modification type of the user group. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong> (default): overwrites the original user group attribute set with the value of the <strong>Attributes</strong> parameter.</li>
     * <li><strong>Append</strong>: separately appends the values entered in the <strong>Attributes</strong> parameter to the user group attribute set.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The ID of the user group. Value sources:</p>
     * <ul>
     * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: queries user groups in batches.</li>
     * <li><a href="~~CreateUserGroup~~">CreateUserGroup</a>: creates a user group.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>usergroup-6f1ef2fc56b6****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static UpdateUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupRequest self = new UpdateUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupRequest setAttributes(java.util.List<UpdateUserGroupRequestAttributes> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<UpdateUserGroupRequestAttributes> getAttributes() {
        return this.attributes;
    }

    public UpdateUserGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUserGroupRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public UpdateUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static class UpdateUserGroupRequestAttributes extends TeaModel {
        /**
         * <p>The identity provider ID of the user group. This value exists when the custom user group type is <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>The relation of the user group. Valid values:</p>
         * <ul>
         * <li><strong>Equal</strong>: equal to.</li>
         * <li><strong>Unequal</strong>: not equal to.</li>
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
         * <li><strong>username</strong>: username.</li>
         * <li><strong>department</strong>: department.</li>
         * <li><strong>email</strong>: email.</li>
         * <li><strong>telephone</strong>: mobile phone.</li>
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
         * <li>If the user group type is <strong>username</strong>, this parameter indicates the username value. The value must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), asterisks (*), at signs (@), and spaces.</li>
         * <li>If the user group type is <strong>department</strong>, this parameter indicates the department value. Example: OU=Department1,OU=SASEDingTalk.</li>
         * <li>If the user group type is <strong>email</strong>, this parameter indicates the email value. Example: <a href="mailto:username@example.com">username@example.com</a>.</li>
         * <li>If the user group type is <strong>telephone</strong>, this parameter indicates the mobile phone value. Example: 13900001234.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateUserGroupRequestAttributes build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserGroupRequestAttributes self = new UpdateUserGroupRequestAttributes();
            return TeaModel.build(map, self);
        }

        public UpdateUserGroupRequestAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public UpdateUserGroupRequestAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public UpdateUserGroupRequestAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public UpdateUserGroupRequestAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
