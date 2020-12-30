// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainAdminDivisionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AdminDivisions")
    public QueryDomainAdminDivisionResponseBodyAdminDivisions adminDivisions;

    public static QueryDomainAdminDivisionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainAdminDivisionResponseBody self = new QueryDomainAdminDivisionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainAdminDivisionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainAdminDivisionResponseBody setAdminDivisions(QueryDomainAdminDivisionResponseBodyAdminDivisions adminDivisions) {
        this.adminDivisions = adminDivisions;
        return this;
    }
    public QueryDomainAdminDivisionResponseBodyAdminDivisions getAdminDivisions() {
        return this.adminDivisions;
    }

    public static class QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildrenChildren extends TeaModel {
        @NameInMap("ChildDivisionName")
        public String childDivisionName;

        public static QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildrenChildren build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildrenChildren self = new QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildrenChildren();
            return TeaModel.build(map, self);
        }

        public QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildrenChildren setChildDivisionName(String childDivisionName) {
            this.childDivisionName = childDivisionName;
            return this;
        }
        public String getChildDivisionName() {
            return this.childDivisionName;
        }

    }

    public static class QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildren extends TeaModel {
        @NameInMap("Children")
        public java.util.List<QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildrenChildren> children;

        public static QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildren build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildren self = new QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildren();
            return TeaModel.build(map, self);
        }

        public QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildren setChildren(java.util.List<QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildrenChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildrenChildren> getChildren() {
            return this.children;
        }

    }

    public static class QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivision extends TeaModel {
        @NameInMap("DivisionName")
        public String divisionName;

        @NameInMap("Children")
        public QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildren children;

        public static QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivision build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivision self = new QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivision();
            return TeaModel.build(map, self);
        }

        public QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivision setDivisionName(String divisionName) {
            this.divisionName = divisionName;
            return this;
        }
        public String getDivisionName() {
            return this.divisionName;
        }

        public QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivision setChildren(QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildren children) {
            this.children = children;
            return this;
        }
        public QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivisionChildren getChildren() {
            return this.children;
        }

    }

    public static class QueryDomainAdminDivisionResponseBodyAdminDivisions extends TeaModel {
        @NameInMap("AdminDivision")
        public java.util.List<QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivision> adminDivision;

        public static QueryDomainAdminDivisionResponseBodyAdminDivisions build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainAdminDivisionResponseBodyAdminDivisions self = new QueryDomainAdminDivisionResponseBodyAdminDivisions();
            return TeaModel.build(map, self);
        }

        public QueryDomainAdminDivisionResponseBodyAdminDivisions setAdminDivision(java.util.List<QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivision> adminDivision) {
            this.adminDivision = adminDivision;
            return this;
        }
        public java.util.List<QueryDomainAdminDivisionResponseBodyAdminDivisionsAdminDivision> getAdminDivision() {
            return this.adminDivision;
        }

    }

}
