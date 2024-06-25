// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCardSmsLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCardSmsLinkResponseBody body;

    public static GetCardSmsLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCardSmsLinkResponse self = new GetCardSmsLinkResponse();
        return TeaModel.build(map, self);
    }

    public GetCardSmsLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCardSmsLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCardSmsLinkResponse setBody(GetCardSmsLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCardSmsLinkResponseBody getBody() {
        return this.body;
    }

}
