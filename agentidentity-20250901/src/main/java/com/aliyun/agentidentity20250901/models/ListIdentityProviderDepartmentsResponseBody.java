// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListIdentityProviderDepartmentsResponseBody extends TeaModel {
    @NameInMap("Departments")
    public java.util.List<ListIdentityProviderDepartmentsResponseBodyDepartments> departments;

    /**
     * <strong>example:</strong>
     * <p>eyJwYWdlIjoyfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>EXAMPLE-REQUEST-ID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListIdentityProviderDepartmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProviderDepartmentsResponseBody self = new ListIdentityProviderDepartmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdentityProviderDepartmentsResponseBody setDepartments(java.util.List<ListIdentityProviderDepartmentsResponseBodyDepartments> departments) {
        this.departments = departments;
        return this;
    }
    public java.util.List<ListIdentityProviderDepartmentsResponseBodyDepartments> getDepartments() {
        return this.departments;
    }

    public ListIdentityProviderDepartmentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIdentityProviderDepartmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIdentityProviderDepartmentsResponseBodyDepartments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasChildren")
        public Boolean hasChildren;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MemberCount")
        public Long memberCount;

        /**
         * <strong>example:</strong>
         * <p>研发部</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        public static ListIdentityProviderDepartmentsResponseBodyDepartments build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProviderDepartmentsResponseBodyDepartments self = new ListIdentityProviderDepartmentsResponseBodyDepartments();
            return TeaModel.build(map, self);
        }

        public ListIdentityProviderDepartmentsResponseBodyDepartments setHasChildren(Boolean hasChildren) {
            this.hasChildren = hasChildren;
            return this;
        }
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        public ListIdentityProviderDepartmentsResponseBodyDepartments setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListIdentityProviderDepartmentsResponseBodyDepartments setMemberCount(Long memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Long getMemberCount() {
            return this.memberCount;
        }

        public ListIdentityProviderDepartmentsResponseBodyDepartments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIdentityProviderDepartmentsResponseBodyDepartments setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

    }

}
