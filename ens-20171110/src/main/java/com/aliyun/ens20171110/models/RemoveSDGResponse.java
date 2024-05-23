// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveSDGResponseBody body;

    public static RemoveSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSDGResponse self = new RemoveSDGResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveSDGResponse setBody(RemoveSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSDGResponseBody getBody() {
        return this.body;
    }

}
