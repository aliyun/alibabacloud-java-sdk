// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class QueryInterconnectionCidMappingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryInterconnectionCidMappingResponseBody body;

    public static QueryInterconnectionCidMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInterconnectionCidMappingResponse self = new QueryInterconnectionCidMappingResponse();
        return TeaModel.build(map, self);
    }

    public QueryInterconnectionCidMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInterconnectionCidMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInterconnectionCidMappingResponse setBody(QueryInterconnectionCidMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInterconnectionCidMappingResponseBody getBody() {
        return this.body;
    }

}
