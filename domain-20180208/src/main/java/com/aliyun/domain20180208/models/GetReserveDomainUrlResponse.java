// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class GetReserveDomainUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetReserveDomainUrlResponseBody body;

    public static GetReserveDomainUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReserveDomainUrlResponse self = new GetReserveDomainUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetReserveDomainUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReserveDomainUrlResponse setBody(GetReserveDomainUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReserveDomainUrlResponseBody getBody() {
        return this.body;
    }

}
