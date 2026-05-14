// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrObResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkListCdrObResponseBody body;

    public static ClinkListCdrObResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrObResponse self = new ClinkListCdrObResponse();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrObResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkListCdrObResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkListCdrObResponse setBody(ClinkListCdrObResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkListCdrObResponseBody getBody() {
        return this.body;
    }

}
