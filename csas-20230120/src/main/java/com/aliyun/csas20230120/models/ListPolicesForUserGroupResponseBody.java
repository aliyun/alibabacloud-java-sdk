// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForUserGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5F04DFBD-3F48-5F70-AE72-474026670128</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of user groups.</p>
     */
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
        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_policy_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-policy-ce2bf7236fab****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li><p><strong>PrivateAccess</strong>: private network access.</p>
         * </li>
         * <li><p><strong>URLFilter</strong>: URL filtering.</p>
         * </li>
         * <li><p><strong>AppAccessControl</strong>: application control.</p>
         * </li>
         * <li><p><strong>DLP</strong>: Data Leakage Prevention.</p>
         * </li>
         * <li><p><strong>NAC</strong>: Network Access Control.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrivateAccess</p>
         */
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
        /**
         * <p>The policies.</p>
         */
        @NameInMap("Polices")
        public java.util.List<ListPolicesForUserGroupResponseBodyUserGroupsPolices> polices;

        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>usergroup-6f1ef2fc56b6****</p>
         */
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
