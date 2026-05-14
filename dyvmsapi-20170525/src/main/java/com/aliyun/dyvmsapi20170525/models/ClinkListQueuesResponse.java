// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListQueuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkListQueuesResponseBody body;

    public static ClinkListQueuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkListQueuesResponse self = new ClinkListQueuesResponse();
        return TeaModel.build(map, self);
    }

    public ClinkListQueuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkListQueuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkListQueuesResponse setBody(ClinkListQueuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkListQueuesResponseBody getBody() {
        return this.body;
    }

}
