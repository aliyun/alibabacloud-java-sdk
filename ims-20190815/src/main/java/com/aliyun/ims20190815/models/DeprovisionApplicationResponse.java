// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeprovisionApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeprovisionApplicationResponseBody body;

    public static DeprovisionApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeprovisionApplicationResponse self = new DeprovisionApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeprovisionApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeprovisionApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeprovisionApplicationResponse setBody(DeprovisionApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeprovisionApplicationResponseBody getBody() {
        return this.body;
    }

}
