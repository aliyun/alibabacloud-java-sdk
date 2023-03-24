// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("IdpId")
        public Integer idpId;

        @NameInMap("Relation")
        public String relation;

        @NameInMap("UserGroupType")
        public String userGroupType;

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
        @NameInMap("Attributes")
        public java.util.List<GetUserGroupResponseBodyUserGroupAttributes> attributes;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

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
