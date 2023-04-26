// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourceRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceRelations")
    public ListResourceRelationsResponseBodyResourceRelations resourceRelations;

    public static ListResourceRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRelationsResponseBody self = new ListResourceRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceRelationsResponseBody setResourceRelations(ListResourceRelationsResponseBodyResourceRelations resourceRelations) {
        this.resourceRelations = resourceRelations;
        return this;
    }
    public ListResourceRelationsResponseBodyResourceRelations getResourceRelations() {
        return this.resourceRelations;
    }

    public static class ListResourceRelationsResponseBodyResourceRelationsResourceRelationList extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("RelationType")
        public String relationType;

        @NameInMap("SourceResourceId")
        public String sourceResourceId;

        @NameInMap("SourceResourceRegionId")
        public String sourceResourceRegionId;

        @NameInMap("SourceResourceType")
        public String sourceResourceType;

        @NameInMap("TargetResourceId")
        public String targetResourceId;

        @NameInMap("TargetResourceType")
        public String targetResourceType;

        public static ListResourceRelationsResponseBodyResourceRelationsResourceRelationList build(java.util.Map<String, ?> map) throws Exception {
            ListResourceRelationsResponseBodyResourceRelationsResourceRelationList self = new ListResourceRelationsResponseBodyResourceRelationsResourceRelationList();
            return TeaModel.build(map, self);
        }

        public ListResourceRelationsResponseBodyResourceRelationsResourceRelationList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListResourceRelationsResponseBodyResourceRelationsResourceRelationList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public ListResourceRelationsResponseBodyResourceRelationsResourceRelationList setSourceResourceId(String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public String getSourceResourceId() {
            return this.sourceResourceId;
        }

        public ListResourceRelationsResponseBodyResourceRelationsResourceRelationList setSourceResourceRegionId(String sourceResourceRegionId) {
            this.sourceResourceRegionId = sourceResourceRegionId;
            return this;
        }
        public String getSourceResourceRegionId() {
            return this.sourceResourceRegionId;
        }

        public ListResourceRelationsResponseBodyResourceRelationsResourceRelationList setSourceResourceType(String sourceResourceType) {
            this.sourceResourceType = sourceResourceType;
            return this;
        }
        public String getSourceResourceType() {
            return this.sourceResourceType;
        }

        public ListResourceRelationsResponseBodyResourceRelationsResourceRelationList setTargetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }
        public String getTargetResourceId() {
            return this.targetResourceId;
        }

        public ListResourceRelationsResponseBodyResourceRelationsResourceRelationList setTargetResourceType(String targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }
        public String getTargetResourceType() {
            return this.targetResourceType;
        }

    }

    public static class ListResourceRelationsResponseBodyResourceRelations extends TeaModel {
        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("ResourceRelationList")
        public java.util.List<ListResourceRelationsResponseBodyResourceRelationsResourceRelationList> resourceRelationList;

        public static ListResourceRelationsResponseBodyResourceRelations build(java.util.Map<String, ?> map) throws Exception {
            ListResourceRelationsResponseBodyResourceRelations self = new ListResourceRelationsResponseBodyResourceRelations();
            return TeaModel.build(map, self);
        }

        public ListResourceRelationsResponseBodyResourceRelations setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListResourceRelationsResponseBodyResourceRelations setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListResourceRelationsResponseBodyResourceRelations setResourceRelationList(java.util.List<ListResourceRelationsResponseBodyResourceRelationsResourceRelationList> resourceRelationList) {
            this.resourceRelationList = resourceRelationList;
            return this;
        }
        public java.util.List<ListResourceRelationsResponseBodyResourceRelationsResourceRelationList> getResourceRelationList() {
            return this.resourceRelationList;
        }

    }

}
