// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUserLoginPoliciesResponseBody extends TeaModel {
    /**
     * <p>The list of policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<DescribeUserLoginPoliciesResponseBodyPolicies> policies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserLoginPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLoginPoliciesResponseBody self = new DescribeUserLoginPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserLoginPoliciesResponseBody setPolicies(java.util.List<DescribeUserLoginPoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<DescribeUserLoginPoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public DescribeUserLoginPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserLoginPoliciesResponseBodyPoliciesUserGroups extends TeaModel {
        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ug-ilu90mhsduf****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The user group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Developers</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static DescribeUserLoginPoliciesResponseBodyPoliciesUserGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserLoginPoliciesResponseBodyPoliciesUserGroups self = new DescribeUserLoginPoliciesResponseBodyPoliciesUserGroups();
            return TeaModel.build(map, self);
        }

        public DescribeUserLoginPoliciesResponseBodyPoliciesUserGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeUserLoginPoliciesResponseBodyPoliciesUserGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class DescribeUserLoginPoliciesResponseBodyPolicies extends TeaModel {
        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>deveoper-policy</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>up-89unlabdl****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The associated user group information.</p>
         */
        @NameInMap("UserGroups")
        public java.util.List<DescribeUserLoginPoliciesResponseBodyPoliciesUserGroups> userGroups;

        public static DescribeUserLoginPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserLoginPoliciesResponseBodyPolicies self = new DescribeUserLoginPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeUserLoginPoliciesResponseBodyPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUserLoginPoliciesResponseBodyPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeUserLoginPoliciesResponseBodyPolicies setUserGroups(java.util.List<DescribeUserLoginPoliciesResponseBodyPoliciesUserGroups> userGroups) {
            this.userGroups = userGroups;
            return this;
        }
        public java.util.List<DescribeUserLoginPoliciesResponseBodyPoliciesUserGroups> getUserGroups() {
            return this.userGroups;
        }

    }

}
