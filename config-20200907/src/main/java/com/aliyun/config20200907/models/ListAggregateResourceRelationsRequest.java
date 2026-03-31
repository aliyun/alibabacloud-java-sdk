// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourceRelationsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-856a626622af0033****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The maximum number of entries to return for a single request. Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>AcBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region in which the resource resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

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
     * <p>The ID of the Alibaba Cloud account to which the resources in the account group belong.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100931896542****</p>
     */
    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    /**
     * <p>The resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-j6cajg9yrfoh4sas****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the resource that is associated with the object.</p>
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

    public static ListAggregateResourceRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateResourceRelationsRequest self = new ListAggregateResourceRelationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateResourceRelationsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateResourceRelationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAggregateResourceRelationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAggregateResourceRelationsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListAggregateResourceRelationsRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public ListAggregateResourceRelationsRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    public ListAggregateResourceRelationsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListAggregateResourceRelationsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAggregateResourceRelationsRequest setTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }
    public String getTargetResourceId() {
        return this.targetResourceId;
    }

    public ListAggregateResourceRelationsRequest setTargetResourceType(String targetResourceType) {
        this.targetResourceType = targetResourceType;
        return this;
    }
    public String getTargetResourceType() {
        return this.targetResourceType;
    }

}
