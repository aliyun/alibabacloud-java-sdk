// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourceRelationsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7A25F9DE-4C8B-5AD3-A241-FFF5A259E5A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the relationship.</p>
     */
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
        /**
         * <p>The Alibaba Cloud account ID of the resource owner.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The type of the relationship between the resource and the object.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>IsContained: The object is included as part of the resource.</li>
         * <li>IsAttachedTo: The object is added to the resource.</li>
         * <li>IsAssociatedIn: The object is associated with the resource.</li>
         * <li>Contains: The object contains the resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IsAttachedTo</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The resource ID of the current resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-j6cajg9yrfoh4sas****</p>
         */
        @NameInMap("SourceResourceId")
        public String sourceResourceId;

        /**
         * <p>The region ID of the current resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("SourceResourceRegionId")
        public String sourceResourceRegionId;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("SourceResourceType")
        public String sourceResourceType;

        /**
         * <p>The resource ID of the resource that is associated with the object.</p>
         * 
         * <strong>example:</strong>
         * <p>d-j6c8k731qbrc7fxi****</p>
         */
        @NameInMap("TargetResourceId")
        public String targetResourceId;

        /**
         * <p>The type of the resource that is associated with the object.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Disk</p>
         */
        @NameInMap("TargetResourceType")
        public String targetResourceType;

        public static ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList self = new ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList();
            return TeaModel.build(map, self);
        }

        public ListAggregateResourceRelationsResponseBodyResourceRelationsResourceRelationList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
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
        /**
         * <p>The maximum number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that was used to initiate the next request.</p>
         * 
         * <strong>example:</strong>
         * <p>AcBjqMYSy0is7zSMGu16****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>An array that contains the relationships.</p>
         */
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
