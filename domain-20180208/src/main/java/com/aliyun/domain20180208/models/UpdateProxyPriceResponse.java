// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class UpdateProxyPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProxyPriceResponseBody body;

    public static UpdateProxyPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProxyPriceResponse self = new UpdateProxyPriceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProxyPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProxyPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProxyPriceResponse setBody(UpdateProxyPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProxyPriceResponseBody getBody() {
        return this.body;
    }

}
