// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeCdrIbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkDescribeCdrIbResponseBody body;

    public static ClinkDescribeCdrIbResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeCdrIbResponse self = new ClinkDescribeCdrIbResponse();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeCdrIbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkDescribeCdrIbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkDescribeCdrIbResponse setBody(ClinkDescribeCdrIbResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkDescribeCdrIbResponseBody getBody() {
        return this.body;
    }

}
