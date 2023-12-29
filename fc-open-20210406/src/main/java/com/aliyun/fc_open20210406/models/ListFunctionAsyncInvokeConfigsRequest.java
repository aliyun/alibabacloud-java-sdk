// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListFunctionAsyncInvokeConfigsRequest extends TeaModel {
    /**
     * <p>The maximum number of resources to return. Default value: 20. The value cannot exceed 100. The number of returned configurations is less than or equal to the specified number.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The token required to obtain more results. If the number of resources exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListFunctionAsyncInvokeConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionAsyncInvokeConfigsRequest self = new ListFunctionAsyncInvokeConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionAsyncInvokeConfigsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFunctionAsyncInvokeConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
