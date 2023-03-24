// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsForPrivateAccessPolicyResponseBody extends TeaModel {
    @NameInMap("Polices")
    public java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolices> polices;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUserGroupsForPrivateAccessPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsForPrivateAccessPolicyResponseBody self = new ListUserGroupsForPrivateAccessPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsForPrivateAccessPolicyResponseBody setPolices(java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolices> polices) {
        this.polices = polices;
        return this;
    }
    public java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolices> getPolices() {
        return this.polices;
    }

    public ListUserGroupsForPrivateAccessPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes extends TeaModel {
        @NameInMap("IdpId")
        public Integer idpId;

        @NameInMap("Relation")
        public String relation;

        @NameInMap("UserGroupType")
        public String userGroupType;

        @NameInMap("Value")
        public String value;

        public static ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes self = new ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups extends TeaModel {
        @NameInMap("Attributes")
        public java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes> attributes;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("UserGroupId")
        public String userGroupId;

        public static ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups self = new ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups setAttributes(java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes> getAttributes() {
            return this.attributes;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

    public static class ListUserGroupsForPrivateAccessPolicyResponseBodyPolices extends TeaModel {
        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("UserGroups")
        public java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups> userGroups;

        public static ListUserGroupsForPrivateAccessPolicyResponseBodyPolices build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsForPrivateAccessPolicyResponseBodyPolices self = new ListUserGroupsForPrivateAccessPolicyResponseBodyPolices();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolices setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolices setUserGroups(java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups> userGroups) {
            this.userGroups = userGroups;
            return this;
        }
        public java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups> getUserGroups() {
            return this.userGroups;
        }

    }

}
