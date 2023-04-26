// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourceRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceRelations")
    public ListAggregateResourceRelationsResponseBodyResourceRelations resourceRelations;

    public static ListAggregateResourceRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateResourceRelationsResponseBody self = new ListAggregateResourceRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateResourceRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAggregateResourceRelationsResponseBody setResourceRelations(ListAggregateResourceRelationsResponseBodyResourceRelations resourceRelations) {
        this.resourceRelations = resourceRelations;
        return this;
    }
    public ListAggregateResourceRelationsResponseBodyResourceRelations getResourceRelations() {
        return this.resourceRelations;
    }

    public static class ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList extends TeaModel {
        @NameInMap("AccountId")
        public Integer accountId;

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

        public static ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList self = new ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList();
            return TeaModel.build(map, self);
        }

        public ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList setAccountId(Integer accountId) {
            this.accountId = accountId;
            return this;
        }
        public Integer getAccountId() {
            return this.accountId;
        }

        public ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList setSourceResourceId(String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public String getSourceResourceId() {
            return this.sourceResourceId;
        }

        public ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList setSourceResourceRegionId(String sourceResourceRegionId) {
            this.sourceResourceRegionId = sourceResourceRegionId;
            return this;
        }
        public String getSourceResourceRegionId() {
            return this.sourceResourceRegionId;
        }

        public ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList setSourceResourceType(String sourceResourceType) {
            this.sourceResourceType = sourceResourceType;
            return this;
        }
        public String getSourceResourceType() {
            return this.sourceResourceType;
        }

        public ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList setTargetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }
        public String getTargetResourceId() {
            return this.targetResourceId;
        }

        public ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList setTargetResourceType(String targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }
        public String getTargetResourceType() {
            return this.targetResourceType;
        }

    }

    public static class ListAggregateResourceRelationsResponseBodyResourceRelations extends TeaModel {
        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("ResourceRelationList")
        public java.util.List<ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList> resourceRelationList;

        public static ListAggregateResourceRelationsResponseBodyResourceRelations build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateResourceRelationsResponseBodyResourceRelations self = new ListAggregateResourceRelationsResponseBodyResourceRelations();
            return TeaModel.build(map, self);
        }

        public ListAggregateResourceRelationsResponseBodyResourceRelations setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListAggregateResourceRelationsResponseBodyResourceRelations setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListAggregateResourceRelationsResponseBodyResourceRelations setResourceRelationList(java.util.List<ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList> resourceRelationList) {
            this.resourceRelationList = resourceRelationList;
            return this;
        }
        public java.util.List<ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList> getResourceRelationList() {
            return this.resourceRelationList;
        }

    }

}
