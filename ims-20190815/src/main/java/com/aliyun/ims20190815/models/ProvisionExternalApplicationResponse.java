// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ProvisionExternalApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProvisionExternalApplicationResponseBody body;

    public static ProvisionExternalApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ProvisionExternalApplicationResponse self = new ProvisionExternalApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ProvisionExternalApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProvisionExternalApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProvisionExternalApplicationResponse setBody(ProvisionExternalApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ProvisionExternalApplicationResponseBody getBody() {
        return this.body;
    }

}
