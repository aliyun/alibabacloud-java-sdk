// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryConversationDetailInfoNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryConversationDetailInfoNewResponseBody body;

    public static QueryConversationDetailInfoNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConversationDetailInfoNewResponse self = new QueryConversationDetailInfoNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryConversationDetailInfoNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConversationDetailInfoNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConversationDetailInfoNewResponse setBody(QueryConversationDetailInfoNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConversationDetailInfoNewResponseBody getBody() {
        return this.body;
    }

}
