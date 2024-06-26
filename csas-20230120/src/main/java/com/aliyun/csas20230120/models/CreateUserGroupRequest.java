// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateUserGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Attributes")
    public java.util.List<CreateUserGroupRequestAttributes> attributes;

    @NameInMap("Description")
    public String description;

    /**
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
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        /**
         * <p>This parameter is required.</p>
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
