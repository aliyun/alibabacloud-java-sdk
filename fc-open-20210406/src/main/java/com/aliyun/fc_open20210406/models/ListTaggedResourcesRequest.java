// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListTaggedResourcesRequest extends TeaModel {
    /**
     * <p>Example 1</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The token used to obtain more results. You do not need to provide this parameter in the first call. The tokens for subsequent queries are obtained from the returned results.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListTaggedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaggedResourcesRequest self = new ListTaggedResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTaggedResourcesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListTaggedResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
