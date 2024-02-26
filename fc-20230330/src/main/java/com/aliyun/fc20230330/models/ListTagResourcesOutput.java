// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListTagResourcesOutput extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagResources")
    public java.util.List<TagResource> tagResources;

    public static ListTagResourcesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesOutput self = new ListTagResourcesOutput();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesOutput setTagResources(java.util.List<TagResource> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<TagResource> getTagResources() {
        return this.tagResources;
    }

}
