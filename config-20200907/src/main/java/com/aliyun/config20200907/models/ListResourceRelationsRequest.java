// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourceRelationsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return for a single request. Valid values: 1 to 1000.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the resource resides.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The type of the relationship between the resource and the object.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   IsContained: The object is included as part of the resource.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   IsAttachedTo: The object is added to the resource.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   IsAssociatedIn: The object is associated with the resource.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Contains: The object contains the resource.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("RelationType")
    public String relationType;

    /**
     * <p>The resource ID.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the resource that is associated with the object.</p>
     */
    @NameInMap("TargetResourceId")
    public String targetResourceId;

    /**
     * <p>The type of the resource that is associated with the object.</p>
     */
    @NameInMap("TargetResourceType")
    public String targetResourceType;

    public static ListResourceRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRelationsRequest self = new ListResourceRelationsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceRelationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceRelationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceRelationsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListResourceRelationsRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public ListResourceRelationsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListResourceRelationsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListResourceRelationsRequest setTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }
    public String getTargetResourceId() {
        return this.targetResourceId;
    }

    public ListResourceRelationsRequest setTargetResourceType(String targetResourceType) {
        this.targetResourceType = targetResourceType;
        return this;
    }
    public String getTargetResourceType() {
        return this.targetResourceType;
    }

}
