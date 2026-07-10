// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseOrgMembershipsResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public DescribeLangfuseOrgMembershipsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1F488A93-83FD-540F-9B67-0333AF64E6A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLangfuseOrgMembershipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseOrgMembershipsResponseBody self = new DescribeLangfuseOrgMembershipsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseOrgMembershipsResponseBody setData(DescribeLangfuseOrgMembershipsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLangfuseOrgMembershipsResponseBodyData getData() {
        return this.data;
    }

    public DescribeLangfuseOrgMembershipsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLangfuseOrgMembershipsResponseBodyDataMemberships extends TeaModel {
        /**
         * <p>The time when the user was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-24T10:14:33Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

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
         * <p>The role of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>VIEWER</p>
         */
        @NameInMap("Role")
        public String role;

        public static DescribeLangfuseOrgMembershipsResponseBodyDataMemberships build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseOrgMembershipsResponseBodyDataMemberships self = new DescribeLangfuseOrgMembershipsResponseBodyDataMemberships();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseOrgMembershipsResponseBodyDataMemberships setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeLangfuseOrgMembershipsResponseBodyDataMemberships setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeLangfuseOrgMembershipsResponseBodyDataMemberships setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLangfuseOrgMembershipsResponseBodyDataMemberships setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class DescribeLangfuseOrgMembershipsResponseBodyData extends TeaModel {
        /**
         * <p>The list of user roles in the organization.</p>
         */
        @NameInMap("Memberships")
        public java.util.List<DescribeLangfuseOrgMembershipsResponseBodyDataMemberships> memberships;

        /**
         * <p>The page number.</p>
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
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeLangfuseOrgMembershipsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseOrgMembershipsResponseBodyData self = new DescribeLangfuseOrgMembershipsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseOrgMembershipsResponseBodyData setMemberships(java.util.List<DescribeLangfuseOrgMembershipsResponseBodyDataMemberships> memberships) {
            this.memberships = memberships;
            return this;
        }
        public java.util.List<DescribeLangfuseOrgMembershipsResponseBodyDataMemberships> getMemberships() {
            return this.memberships;
        }

        public DescribeLangfuseOrgMembershipsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeLangfuseOrgMembershipsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeLangfuseOrgMembershipsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
