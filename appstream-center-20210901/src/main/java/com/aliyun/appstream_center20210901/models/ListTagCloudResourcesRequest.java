// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListTagCloudResourcesRequest extends TeaModel {
    /**
     * <p>The number of entries per page.
     * Maximum value: 1000. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>ptnJAAAAAAAxNzE5OTEwNQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of resource IDs. A maximum of 50 resource IDs are supported. You do not need to specify this parameter when the resource type is tenant ID.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The cloud resource type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppInstanceGroupId</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag type.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static ListTagCloudResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagCloudResourcesRequest self = new ListTagCloudResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagCloudResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTagCloudResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagCloudResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public ListTagCloudResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagCloudResourcesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
