// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TBAccountInfoQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TBAccountInfoQueryResponseBody body;

    public static TBAccountInfoQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TBAccountInfoQueryResponse self = new TBAccountInfoQueryResponse();
        return TeaModel.build(map, self);
    }

    public TBAccountInfoQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TBAccountInfoQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TBAccountInfoQueryResponse setBody(TBAccountInfoQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TBAccountInfoQueryResponseBody getBody() {
        return this.body;
    }

}
