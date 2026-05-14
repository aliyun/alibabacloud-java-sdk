// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListExtensResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkListExtensResponseBody body;

    public static ClinkListExtensResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkListExtensResponse self = new ClinkListExtensResponse();
        return TeaModel.build(map, self);
    }

    public ClinkListExtensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkListExtensResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkListExtensResponse setBody(ClinkListExtensResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkListExtensResponseBody getBody() {
        return this.body;
    }

}
