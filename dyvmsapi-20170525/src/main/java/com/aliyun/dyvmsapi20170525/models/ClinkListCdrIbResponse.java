// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrIbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkListCdrIbResponseBody body;

    public static ClinkListCdrIbResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrIbResponse self = new ClinkListCdrIbResponse();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrIbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkListCdrIbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkListCdrIbResponse setBody(ClinkListCdrIbResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkListCdrIbResponseBody getBody() {
        return this.body;
    }

}
