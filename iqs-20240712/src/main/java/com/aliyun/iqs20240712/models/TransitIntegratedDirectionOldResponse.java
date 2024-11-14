// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class TransitIntegratedDirectionOldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransitIntegratedDirectionOldResponseBody body;

    public static TransitIntegratedDirectionOldResponse build(java.util.Map<String, ?> map) throws Exception {
        TransitIntegratedDirectionOldResponse self = new TransitIntegratedDirectionOldResponse();
        return TeaModel.build(map, self);
    }

    public TransitIntegratedDirectionOldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransitIntegratedDirectionOldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransitIntegratedDirectionOldResponse setBody(TransitIntegratedDirectionOldResponseBody body) {
        this.body = body;
        return this;
    }
    public TransitIntegratedDirectionOldResponseBody getBody() {
        return this.body;
    }

}
