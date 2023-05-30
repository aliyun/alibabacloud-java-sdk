// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListTaggedResourcesResponseBody extends TeaModel {
    @NameInMap("nextToken")
    public String nextToken;

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
