// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeprovisionExternalApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeprovisionExternalApplicationResponseBody body;

    public static DeprovisionExternalApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeprovisionExternalApplicationResponse self = new DeprovisionExternalApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeprovisionExternalApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeprovisionExternalApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeprovisionExternalApplicationResponse setBody(DeprovisionExternalApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeprovisionExternalApplicationResponseBody getBody() {
        return this.body;
    }

}
