// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ListProtectedResourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("CreatedByProduct")
    public String createdByProduct;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>aWQj********MCMy</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>i-wz95************7zrd</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    /**
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ListProtectedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProtectedResourcesRequest self = new ListProtectedResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListProtectedResourcesRequest setCreatedByProduct(String createdByProduct) {
        this.createdByProduct = createdByProduct;
        return this;
    }
    public String getCreatedByProduct() {
        return this.createdByProduct;
    }

    public ListProtectedResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProtectedResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProtectedResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListProtectedResourcesRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListProtectedResourcesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
