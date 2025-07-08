// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveSDGsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveSDGsResponseBody body;

    public static RemoveSDGsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSDGsResponse self = new RemoveSDGsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSDGsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSDGsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveSDGsResponse setBody(RemoveSDGsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSDGsResponseBody getBody() {
        return this.body;
    }

}
