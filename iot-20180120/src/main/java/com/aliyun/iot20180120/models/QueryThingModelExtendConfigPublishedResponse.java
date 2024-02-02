// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelExtendConfigPublishedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryThingModelExtendConfigPublishedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryThingModelExtendConfigPublishedResponse setBody(QueryThingModelExtendConfigPublishedResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryThingModelExtendConfigPublishedResponseBody getBody() {
        return this.body;
    }

}
