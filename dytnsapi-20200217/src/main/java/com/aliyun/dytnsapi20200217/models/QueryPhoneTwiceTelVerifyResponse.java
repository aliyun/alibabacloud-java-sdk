// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryPhoneTwiceTelVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPhoneTwiceTelVerifyResponseBody body;

    public static QueryPhoneTwiceTelVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneTwiceTelVerifyResponse self = new QueryPhoneTwiceTelVerifyResponse();
        return TeaModel.build(map, self);
    }

    public QueryPhoneTwiceTelVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPhoneTwiceTelVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPhoneTwiceTelVerifyResponse setBody(QueryPhoneTwiceTelVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPhoneTwiceTelVerifyResponseBody getBody() {
        return this.body;
    }

}
