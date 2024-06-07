// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryPhoneNoAByTrackNoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPhoneNoAByTrackNoResponseBody body;

    public static QueryPhoneNoAByTrackNoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneNoAByTrackNoResponse self = new QueryPhoneNoAByTrackNoResponse();
        return TeaModel.build(map, self);
    }

    public QueryPhoneNoAByTrackNoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPhoneNoAByTrackNoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPhoneNoAByTrackNoResponse setBody(QueryPhoneNoAByTrackNoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPhoneNoAByTrackNoResponseBody getBody() {
        return this.body;
    }

}
