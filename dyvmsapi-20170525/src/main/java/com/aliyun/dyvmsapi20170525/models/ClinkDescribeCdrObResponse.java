// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeCdrObResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkDescribeCdrObResponseBody body;

    public static ClinkDescribeCdrObResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeCdrObResponse self = new ClinkDescribeCdrObResponse();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeCdrObResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkDescribeCdrObResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkDescribeCdrObResponse setBody(ClinkDescribeCdrObResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkDescribeCdrObResponseBody getBody() {
        return this.body;
    }

}
