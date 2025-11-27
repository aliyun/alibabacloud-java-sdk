// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeOrgByLayerResponseBody extends TeaModel {
    /**
     * <p>The organizations.</p>
     */
    @NameInMap("Orgs")
    public java.util.List<DescribeOrgByLayerResponseBodyOrgs> orgs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOrgByLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgByLayerResponseBody self = new DescribeOrgByLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrgByLayerResponseBody setOrgs(java.util.List<DescribeOrgByLayerResponseBodyOrgs> orgs) {
        this.orgs = orgs;
        return this;
    }
    public java.util.List<DescribeOrgByLayerResponseBodyOrgs> getOrgs() {
        return this.orgs;
    }

    public DescribeOrgByLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOrgByLayerResponseBodyOrgs extends TeaModel {
        /**
         * <p>The ID of the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>org-1mox****</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The name of the organization.</p>
         */
        @NameInMap("OrgName")
        public String orgName;

        /**
         * <p>The ID of the parent organization.</p>
         * 
         * <strong>example:</strong>
         * <p>org-ezqr****</p>
         */
        @NameInMap("ParentOrgId")
        public String parentOrgId;

        public static DescribeOrgByLayerResponseBodyOrgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrgByLayerResponseBodyOrgs self = new DescribeOrgByLayerResponseBodyOrgs();
            return TeaModel.build(map, self);
        }

        public DescribeOrgByLayerResponseBodyOrgs setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public DescribeOrgByLayerResponseBodyOrgs setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

        public DescribeOrgByLayerResponseBodyOrgs setParentOrgId(String parentOrgId) {
            this.parentOrgId = parentOrgId;
            return this;
        }
        public String getParentOrgId() {
            return this.parentOrgId;
        }

    }

}
