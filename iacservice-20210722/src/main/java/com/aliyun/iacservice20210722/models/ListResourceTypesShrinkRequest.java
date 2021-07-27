// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListResourceTypesShrinkRequest extends TeaModel {
    @NameInMap("resourceTypeCodes")
    public String resourceTypeCodesShrink;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("maxResults")
    public Long maxResults;

    public static ListResourceTypesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesShrinkRequest self = new ListResourceTypesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesShrinkRequest setResourceTypeCodesShrink(String resourceTypeCodesShrink) {
        this.resourceTypeCodesShrink = resourceTypeCodesShrink;
        return this;
    }
    public String getResourceTypeCodesShrink() {
        return this.resourceTypeCodesShrink;
    }

    public ListResourceTypesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceTypesShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

}
