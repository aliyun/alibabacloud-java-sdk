// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserGroups")
    public java.util.List<ListPolicesForUserGroupResponseBodyUserGroups> userGroups;

    public static ListPolicesForUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicesForUserGroupResponseBody self = new ListPolicesForUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicesForUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicesForUserGroupResponseBody setUserGroups(java.util.List<ListPolicesForUserGroupResponseBodyUserGroups> userGroups) {
        this.userGroups = userGroups;
        return this;
    }
    public java.util.List<ListPolicesForUserGroupResponseBodyUserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static class ListPolicesForUserGroupResponseBodyUserGroupsPolices extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("PolicyType")
        public String policyType;

        public static ListPolicesForUserGroupResponseBodyUserGroupsPolices build(java.util.Map<String, ?> map) throws Exception {
            ListPolicesForUserGroupResponseBodyUserGroupsPolices self = new ListPolicesForUserGroupResponseBodyUserGroupsPolices();
            return TeaModel.build(map, self);
        }

        public ListPolicesForUserGroupResponseBodyUserGroupsPolices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPolicesForUserGroupResponseBodyUserGroupsPolices setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListPolicesForUserGroupResponseBodyUserGroupsPolices setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListPolicesForUserGroupResponseBodyUserGroups extends TeaModel {
        @NameInMap("Polices")
        public java.util.List<ListPolicesForUserGroupResponseBodyUserGroupsPolices> polices;

        @NameInMap("UserGroupId")
        public String userGroupId;

        public static ListPolicesForUserGroupResponseBodyUserGroups build(java.util.Map<String, ?> map) throws Exception {
            ListPolicesForUserGroupResponseBodyUserGroups self = new ListPolicesForUserGroupResponseBodyUserGroups();
            return TeaModel.build(map, self);
        }

        public ListPolicesForUserGroupResponseBodyUserGroups setPolices(java.util.List<ListPolicesForUserGroupResponseBodyUserGroupsPolices> polices) {
            this.polices = polices;
            return this;
        }
        public java.util.List<ListPolicesForUserGroupResponseBodyUserGroupsPolices> getPolices() {
            return this.polices;
        }

        public ListPolicesForUserGroupResponseBodyUserGroups setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
