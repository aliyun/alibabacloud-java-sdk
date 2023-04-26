// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourceRelationsRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Region")
    public String region;

    @NameInMap("RelationType")
    public String relationType;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TargetResourceId")
    public String targetResourceId;

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
