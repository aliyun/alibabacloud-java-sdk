// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListTaggedResourcesOutput extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>next_token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The tagged resources.</p>
     */
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
