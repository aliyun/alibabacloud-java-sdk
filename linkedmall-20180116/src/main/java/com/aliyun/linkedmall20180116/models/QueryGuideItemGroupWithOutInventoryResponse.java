// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryGuideItemGroupWithOutInventoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGuideItemGroupWithOutInventoryResponseBody body;

    public static QueryGuideItemGroupWithOutInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGuideItemGroupWithOutInventoryResponse self = new QueryGuideItemGroupWithOutInventoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryGuideItemGroupWithOutInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGuideItemGroupWithOutInventoryResponse setBody(QueryGuideItemGroupWithOutInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGuideItemGroupWithOutInventoryResponseBody getBody() {
        return this.body;
    }

}
