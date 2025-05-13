// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListTaggedResourcesRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return. Default value: 20. Maximum value: 100. The number of returned resources is less than or equal to the specified number.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The token required to obtain more results. If the number of layers exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.</p>
     * 
     * <strong>example:</strong>
     * <p>a-service</p>
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
