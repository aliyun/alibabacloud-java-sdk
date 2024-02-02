// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelExtendConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryThingModelExtendConfigResponseBody body;

    public static QueryThingModelExtendConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelExtendConfigResponse self = new QueryThingModelExtendConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryThingModelExtendConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryThingModelExtendConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryThingModelExtendConfigResponse setBody(QueryThingModelExtendConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryThingModelExtendConfigResponseBody getBody() {
        return this.body;
    }

}
