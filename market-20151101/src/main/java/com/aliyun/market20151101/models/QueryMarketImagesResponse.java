// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class QueryMarketImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMarketImagesResponseBody body;

    public static QueryMarketImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMarketImagesResponse self = new QueryMarketImagesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMarketImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMarketImagesResponse setBody(QueryMarketImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMarketImagesResponseBody getBody() {
        return this.body;
    }

}
