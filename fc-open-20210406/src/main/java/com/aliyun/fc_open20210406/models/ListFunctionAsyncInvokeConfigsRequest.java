// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListFunctionAsyncInvokeConfigsRequest extends TeaModel {
    @NameInMap("limit")
    public Integer limit;

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
