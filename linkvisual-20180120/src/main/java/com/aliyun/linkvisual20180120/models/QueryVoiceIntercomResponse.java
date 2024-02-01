// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryVoiceIntercomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryVoiceIntercomResponseBody body;

    public static QueryVoiceIntercomResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceIntercomResponse self = new QueryVoiceIntercomResponse();
        return TeaModel.build(map, self);
    }

    public QueryVoiceIntercomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVoiceIntercomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVoiceIntercomResponse setBody(QueryVoiceIntercomResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVoiceIntercomResponseBody getBody() {
        return this.body;
    }

}
