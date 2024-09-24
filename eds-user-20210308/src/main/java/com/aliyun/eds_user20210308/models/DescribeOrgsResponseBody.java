// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeOrgsResponseBody extends TeaModel {
    /**
     * <p>The token that determines the start point of the query. The return value is the value of the NextToken response parameter that was returned last time the DescribeOrgs operation was called.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The organizations.</p>
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

    public static class DescribeOrgsResponseBodyOrgs extends TeaModel {
        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org-****</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The name of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>org****</p>
         */
        @NameInMap("OrgName")
        public String orgName;

        /**
         * <p>The parent organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org-****</p>
         */
        @NameInMap("ParentOrgId")
        public String parentOrgId;

        public static DescribeOrgsResponseBodyOrgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrgsResponseBodyOrgs self = new DescribeOrgsResponseBodyOrgs();
            return TeaModel.build(map, self);
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

        public DescribeOrgsResponseBodyOrgs setParentOrgId(String parentOrgId) {
            this.parentOrgId = parentOrgId;
            return this;
        }
        public String getParentOrgId() {
            return this.parentOrgId;
        }

    }

}
