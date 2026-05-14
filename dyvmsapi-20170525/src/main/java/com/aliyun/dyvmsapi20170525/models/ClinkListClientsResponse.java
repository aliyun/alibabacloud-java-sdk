// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkListClientsResponseBody body;

    public static ClinkListClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkListClientsResponse self = new ClinkListClientsResponse();
        return TeaModel.build(map, self);
    }

    public ClinkListClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkListClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkListClientsResponse setBody(ClinkListClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkListClientsResponseBody getBody() {
        return this.body;
    }

}
