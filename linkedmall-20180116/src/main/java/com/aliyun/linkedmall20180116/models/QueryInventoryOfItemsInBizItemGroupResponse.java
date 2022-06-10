// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryInventoryOfItemsInBizItemGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryInventoryOfItemsInBizItemGroupResponseBody body;

    public static QueryInventoryOfItemsInBizItemGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInventoryOfItemsInBizItemGroupResponse self = new QueryInventoryOfItemsInBizItemGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryInventoryOfItemsInBizItemGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInventoryOfItemsInBizItemGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInventoryOfItemsInBizItemGroupResponse setBody(QueryInventoryOfItemsInBizItemGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInventoryOfItemsInBizItemGroupResponseBody getBody() {
        return this.body;
    }

}
