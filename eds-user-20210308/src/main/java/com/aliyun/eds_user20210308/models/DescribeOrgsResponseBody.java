// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeOrgsResponseBody extends TeaModel {
    /**
     * <p>The pagination token. Set this parameter to the value of NextToken that was returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of organizations.</p>
     */
    @NameInMap("Orgs")
    public java.util.List<DescribeOrgsResponseBodyOrgs> orgs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B4BB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOrgsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgsResponseBody self = new DescribeOrgsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrgsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeOrgsResponseBody setOrgs(java.util.List<DescribeOrgsResponseBodyOrgs> orgs) {
        this.orgs = orgs;
        return this;
    }
    public java.util.List<DescribeOrgsResponseBodyOrgs> getOrgs() {
        return this.orgs;
    }

    public DescribeOrgsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOrgsResponseBodyOrgsResourcePolicyList extends TeaModel {
        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("PolicyName")
        public String policyName;

        public static DescribeOrgsResponseBodyOrgsResourcePolicyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrgsResponseBodyOrgsResourcePolicyList self = new DescribeOrgsResponseBodyOrgsResourcePolicyList();
            return TeaModel.build(map, self);
        }

        public DescribeOrgsResponseBodyOrgsResourcePolicyList setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeOrgsResponseBodyOrgsResourcePolicyList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

    }

    public static class DescribeOrgsResponseBodyOrgs extends TeaModel {
        /**
         * <p>The access type of the organization node. Valid values:</p>
         * <ul>
         * <li>MANAGEABLE: indicates a manageable node.</li>
         * <li>PATH_ONLY: indicates a node used only to display the full path to the root organization.</li>
         * </ul>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org-1mox****</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The organization name.</p>
         * 
         * <strong>example:</strong>
         * <p>DesignDepartment****</p>
         */
        @NameInMap("OrgName")
        public String orgName;

        @NameInMap("OrgNamePath")
        public String orgNamePath;

        /**
         * <p>The parent organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org-ezqr****</p>
         */
        @NameInMap("ParentOrgId")
        public String parentOrgId;

        @NameInMap("ResourcePolicyList")
        public java.util.List<DescribeOrgsResponseBodyOrgsResourcePolicyList> resourcePolicyList;

        public static DescribeOrgsResponseBodyOrgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrgsResponseBodyOrgs self = new DescribeOrgsResponseBodyOrgs();
            return TeaModel.build(map, self);
        }

        public DescribeOrgsResponseBodyOrgs setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public DescribeOrgsResponseBodyOrgs setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public DescribeOrgsResponseBodyOrgs setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

        public DescribeOrgsResponseBodyOrgs setOrgNamePath(String orgNamePath) {
            this.orgNamePath = orgNamePath;
            return this;
        }
        public String getOrgNamePath() {
            return this.orgNamePath;
        }

        public DescribeOrgsResponseBodyOrgs setParentOrgId(String parentOrgId) {
            this.parentOrgId = parentOrgId;
            return this;
        }
        public String getParentOrgId() {
            return this.parentOrgId;
        }

        public DescribeOrgsResponseBodyOrgs setResourcePolicyList(java.util.List<DescribeOrgsResponseBodyOrgsResourcePolicyList> resourcePolicyList) {
            this.resourcePolicyList = resourcePolicyList;
            return this;
        }
        public java.util.List<DescribeOrgsResponseBodyOrgsResourcePolicyList> getResourcePolicyList() {
            return this.resourcePolicyList;
        }

    }

}
