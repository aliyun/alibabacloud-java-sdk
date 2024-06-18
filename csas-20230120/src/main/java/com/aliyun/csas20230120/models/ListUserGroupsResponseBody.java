// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4AB972E2-D702-5464-B132-B1911498B8BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

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
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

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
        @NameInMap("Attributes")
        public java.util.List<ListUserGroupsResponseBodyUserGroupsAttributes> attributes;

        /**
         * <strong>example:</strong>
         * <p>2022-10-10 11:39:22</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>user_group_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
