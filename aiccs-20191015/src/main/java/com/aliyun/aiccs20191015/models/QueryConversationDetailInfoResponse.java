// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryConversationDetailInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryConversationDetailInfoResponseBody body;

    public static QueryConversationDetailInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConversationDetailInfoResponse self = new QueryConversationDetailInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryConversationDetailInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConversationDetailInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConversationDetailInfoResponse setBody(QueryConversationDetailInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConversationDetailInfoResponseBody getBody() {
        return this.body;
    }

}
