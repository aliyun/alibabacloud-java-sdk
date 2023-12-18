// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListTaggedResourcesResponseBody extends TeaModel {
    /**
     * <p>The token used to obtain more results. You do not need to provide this parameter in the first call. The tokens for subsequent queries are obtained from the returned results.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The information about tagged services.</p>
     */
    @NameInMap("resources")
    public java.util.List<Resource> resources;

    public static ListTaggedResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaggedResourcesResponseBody self = new ListTaggedResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaggedResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTaggedResourcesResponseBody setResources(java.util.List<Resource> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<Resource> getResources() {
        return this.resources;
    }

}
