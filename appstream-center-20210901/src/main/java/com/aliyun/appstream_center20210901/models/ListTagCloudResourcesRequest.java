// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListTagCloudResourcesRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Maximum value: 1000. Default value: 50.</p>
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
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>ptnJAAAAAAAxNzE5OTEwNQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource IDs. You can specify up to 50 resource IDs. You do not need to specify this parameter if you set ResourceType to AliUid.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The type of the cloud resource.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>AppId: app ID.</li>
     * <li>WyId: Alibaba Cloud Workspace user ID.</li>
     * <li>AppInstanceGroupId: delivery group ID.</li>
     * <li>AliUid: tenant ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppInstanceGroupId</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>All (default): all tags.</li>
     * <li>Custom: custom tag.</li>
     * <li>System: system tag.</li>
     * </ul>
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
