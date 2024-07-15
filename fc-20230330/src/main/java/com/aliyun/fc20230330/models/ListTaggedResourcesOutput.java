// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListTaggedResourcesOutput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>next_token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("resources")
    public java.util.List<Resource> resources;

    public static ListTaggedResourcesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListTaggedResourcesOutput self = new ListTaggedResourcesOutput();
        return TeaModel.build(map, self);
    }

    public ListTaggedResourcesOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTaggedResourcesOutput setResources(java.util.List<Resource> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<Resource> getResources() {
        return this.resources;
    }

}
