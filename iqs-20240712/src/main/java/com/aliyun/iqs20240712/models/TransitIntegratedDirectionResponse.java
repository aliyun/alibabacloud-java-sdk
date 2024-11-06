// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class TransitIntegratedDirectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransitIntegratedDirectionResponseBody body;

    public static TransitIntegratedDirectionResponse build(java.util.Map<String, ?> map) throws Exception {
        TransitIntegratedDirectionResponse self = new TransitIntegratedDirectionResponse();
        return TeaModel.build(map, self);
    }

    public TransitIntegratedDirectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransitIntegratedDirectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransitIntegratedDirectionResponse setBody(TransitIntegratedDirectionResponseBody body) {
        this.body = body;
        return this;
    }
    public TransitIntegratedDirectionResponseBody getBody() {
        return this.body;
    }

}
