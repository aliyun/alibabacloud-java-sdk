// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UnsubscribeBillToOSSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnsubscribeBillToOSSResponseBody body;

    public static UnsubscribeBillToOSSResponse build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeBillToOSSResponse self = new UnsubscribeBillToOSSResponse();
        return TeaModel.build(map, self);
    }

    public UnsubscribeBillToOSSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnsubscribeBillToOSSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnsubscribeBillToOSSResponse setBody(UnsubscribeBillToOSSResponseBody body) {
        this.body = body;
        return this;
    }
    public UnsubscribeBillToOSSResponseBody getBody() {
        return this.body;
    }

}
