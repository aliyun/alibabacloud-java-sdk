// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class ListResourceTypesShrinkRequest extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If you leave this parameter empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS::Disk</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The information about the resource types.</p>
     */
    @NameInMap("resourceTypes")
    public String resourceTypesShrink;

    public static ListResourceTypesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesShrinkRequest self = new ListResourceTypesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceTypesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceTypesShrinkRequest setResourceTypesShrink(String resourceTypesShrink) {
        this.resourceTypesShrink = resourceTypesShrink;
        return this;
    }
    public String getResourceTypesShrink() {
        return this.resourceTypesShrink;
    }

}
