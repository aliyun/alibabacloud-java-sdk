// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryChatappPhoneNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryChatappPhoneNumbersResponseBody body;

    public static QueryChatappPhoneNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChatappPhoneNumbersResponse self = new QueryChatappPhoneNumbersResponse();
        return TeaModel.build(map, self);
    }

    public QueryChatappPhoneNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryChatappPhoneNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryChatappPhoneNumbersResponse setBody(QueryChatappPhoneNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryChatappPhoneNumbersResponseBody getBody() {
        return this.body;
    }

}
