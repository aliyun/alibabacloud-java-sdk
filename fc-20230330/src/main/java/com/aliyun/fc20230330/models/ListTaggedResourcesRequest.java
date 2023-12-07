// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListTaggedResourcesRequest extends TeaModel {
    /**
     * <p>The number of resources to return.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The type of the resource quantity. ALIYUN::FC::FUNCTION indicates functions in Function Compute 3.0. ALIYUN::FC::SERVICE indicates the original service of Function Compute. The default value is ALIYUN::FC:FUNCTION.</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static ListTaggedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaggedResourcesRequest self = new ListTaggedResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTaggedResourcesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListTaggedResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTaggedResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
