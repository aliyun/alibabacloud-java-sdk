// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourceRelationsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6525F8DE-5A8B-5AD3-A241-BBF5A259E5B2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the relationship.</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
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
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-j6cajg9yrfoh4sas****</p>
         */
        @NameInMap("SourceResourceId")
        public String sourceResourceId;

        /**
         * <p>The ID of the region in which the resource resides.</p>
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
         * <p>The ID of the associated resource.</p>
         * 
         * <strong>example:</strong>
         * <p>d-j6c8k731qbrc7fxi****</p>
         */
        @NameInMap("TargetResourceId")
        public String targetResourceId;

        /**
         * <p>The type of the associated resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Disk</p>
         */
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
         * <p>C2DjqMYSy0is7zSMGf21****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>An array that contains the relationships.</p>
         */
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
