// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseProjectMembershipsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeLangfuseProjectMembershipsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A82758F8-E793-5610-BE11-0E46664305C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLangfuseProjectMembershipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseProjectMembershipsResponseBody self = new DescribeLangfuseProjectMembershipsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseProjectMembershipsResponseBody setData(DescribeLangfuseProjectMembershipsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLangfuseProjectMembershipsResponseBodyData getData() {
        return this.data;
    }

    public DescribeLangfuseProjectMembershipsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLangfuseProjectMembershipsResponseBodyDataMemberships extends TeaModel {
        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:john@company.com">john@company.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>john</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The role of the user in the Langfuse organization.</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN</p>
         */
        @NameInMap("OrgRole")
        public String orgRole;

        /**
         * <p>The role of the user in the Langfuse project.</p>
         * 
         * <strong>example:</strong>
         * <p>VIEWER</p>
         */
        @NameInMap("ProjectRole")
        public String projectRole;

        public static DescribeLangfuseProjectMembershipsResponseBodyDataMemberships build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseProjectMembershipsResponseBodyDataMemberships self = new DescribeLangfuseProjectMembershipsResponseBodyDataMemberships();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseProjectMembershipsResponseBodyDataMemberships setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeLangfuseProjectMembershipsResponseBodyDataMemberships setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLangfuseProjectMembershipsResponseBodyDataMemberships setOrgRole(String orgRole) {
            this.orgRole = orgRole;
            return this;
        }
        public String getOrgRole() {
            return this.orgRole;
        }

        public DescribeLangfuseProjectMembershipsResponseBodyDataMemberships setProjectRole(String projectRole) {
            this.projectRole = projectRole;
            return this;
        }
        public String getProjectRole() {
            return this.projectRole;
        }

    }

    public static class DescribeLangfuseProjectMembershipsResponseBodyData extends TeaModel {
        /**
         * <p>The list of user roles in the Langfuse project.</p>
         */
        @NameInMap("Memberships")
        public java.util.List<DescribeLangfuseProjectMembershipsResponseBodyDataMemberships> memberships;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeLangfuseProjectMembershipsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseProjectMembershipsResponseBodyData self = new DescribeLangfuseProjectMembershipsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseProjectMembershipsResponseBodyData setMemberships(java.util.List<DescribeLangfuseProjectMembershipsResponseBodyDataMemberships> memberships) {
            this.memberships = memberships;
            return this;
        }
        public java.util.List<DescribeLangfuseProjectMembershipsResponseBodyDataMemberships> getMemberships() {
            return this.memberships;
        }

        public DescribeLangfuseProjectMembershipsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeLangfuseProjectMembershipsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeLangfuseProjectMembershipsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
