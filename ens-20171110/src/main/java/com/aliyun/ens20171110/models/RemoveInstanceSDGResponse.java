// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveInstanceSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveInstanceSDGResponseBody body;

    public static RemoveInstanceSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceSDGResponse self = new RemoveInstanceSDGResponse();
        return TeaModel.build(map, self);
    }

    public RemoveInstanceSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveInstanceSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveInstanceSDGResponse setBody(RemoveInstanceSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveInstanceSDGResponseBody getBody() {
        return this.body;
    }

}
