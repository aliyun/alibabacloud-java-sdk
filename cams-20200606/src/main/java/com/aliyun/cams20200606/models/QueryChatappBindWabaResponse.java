// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryChatappBindWabaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryChatappBindWabaResponseBody body;

    public static QueryChatappBindWabaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChatappBindWabaResponse self = new QueryChatappBindWabaResponse();
        return TeaModel.build(map, self);
    }

    public QueryChatappBindWabaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryChatappBindWabaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryChatappBindWabaResponse setBody(QueryChatappBindWabaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryChatappBindWabaResponseBody getBody() {
        return this.body;
    }

}
