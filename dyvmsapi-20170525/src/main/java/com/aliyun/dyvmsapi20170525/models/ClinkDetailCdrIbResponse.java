// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDetailCdrIbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkDetailCdrIbResponseBody body;

    public static ClinkDetailCdrIbResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkDetailCdrIbResponse self = new ClinkDetailCdrIbResponse();
        return TeaModel.build(map, self);
    }

    public ClinkDetailCdrIbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkDetailCdrIbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkDetailCdrIbResponse setBody(ClinkDetailCdrIbResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkDetailCdrIbResponseBody getBody() {
        return this.body;
    }

}
