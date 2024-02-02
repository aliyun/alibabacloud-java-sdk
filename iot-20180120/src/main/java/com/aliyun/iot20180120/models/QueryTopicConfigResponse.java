// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTopicConfigResponseBody body;

    public static QueryTopicConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicConfigResponse self = new QueryTopicConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopicConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopicConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopicConfigResponse setBody(QueryTopicConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopicConfigResponseBody getBody() {
        return this.body;
    }

}
