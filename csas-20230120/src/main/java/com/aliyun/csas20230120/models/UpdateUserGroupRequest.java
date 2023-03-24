// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserGroupRequest extends TeaModel {
    @NameInMap("Attributes")
    public java.util.List<UpdateUserGroupRequestAttributes> attributes;

    @NameInMap("Description")
    public String description;

    @NameInMap("ModifyType")
    public String modifyType;

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
        @NameInMap("IdpId")
        public Integer idpId;

        @NameInMap("Relation")
        public String relation;

        @NameInMap("UserGroupType")
        public String userGroupType;

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
