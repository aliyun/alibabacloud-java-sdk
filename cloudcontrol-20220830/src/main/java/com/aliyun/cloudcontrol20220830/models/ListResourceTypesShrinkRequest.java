// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class ListResourceTypesShrinkRequest extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

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
