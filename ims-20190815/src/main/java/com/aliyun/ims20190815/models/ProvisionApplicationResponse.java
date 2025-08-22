// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ProvisionApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProvisionApplicationResponseBody body;

    public static ProvisionApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ProvisionApplicationResponse self = new ProvisionApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ProvisionApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProvisionApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProvisionApplicationResponse setBody(ProvisionApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ProvisionApplicationResponseBody getBody() {
        return this.body;
    }

}
