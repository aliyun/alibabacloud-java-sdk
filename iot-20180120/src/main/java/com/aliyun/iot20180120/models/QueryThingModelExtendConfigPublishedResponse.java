// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelExtendConfigPublishedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryThingModelExtendConfigPublishedResponseBody body;

    public static QueryThingModelExtendConfigPublishedResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelExtendConfigPublishedResponse self = new QueryThingModelExtendConfigPublishedResponse();
        return TeaModel.build(map, self);
    }

    public QueryThingModelExtendConfigPublishedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryThingModelExtendConfigPublishedResponse setBody(QueryThingModelExtendConfigPublishedResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryThingModelExtendConfigPublishedResponseBody getBody() {
        return this.body;
    }

}
