// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListServicesShrinkRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next query, an empty value indicates the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>7-b81a-4bc9-bbfa-a50cc6988667</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>rg-aekxxzuad5zzzz</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>app-demo</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <p>Service type</p>
     * 
     * <strong>example:</strong>
     * <p>apm</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("tags")
    public String tagsShrink;

    public static ListServicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesShrinkRequest self = new ListServicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServicesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServicesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListServicesShrinkRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListServicesShrinkRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ListServicesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
