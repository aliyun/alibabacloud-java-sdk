// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkStatIbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkStatIbResponseBody body;

    public static ClinkStatIbResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkStatIbResponse self = new ClinkStatIbResponse();
        return TeaModel.build(map, self);
    }

    public ClinkStatIbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkStatIbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkStatIbResponse setBody(ClinkStatIbResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkStatIbResponseBody getBody() {
        return this.body;
    }

}
