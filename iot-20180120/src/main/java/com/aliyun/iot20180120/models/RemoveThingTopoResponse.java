// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RemoveThingTopoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveThingTopoResponseBody body;

    public static RemoveThingTopoResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveThingTopoResponse self = new RemoveThingTopoResponse();
        return TeaModel.build(map, self);
    }

    public RemoveThingTopoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveThingTopoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveThingTopoResponse setBody(RemoveThingTopoResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveThingTopoResponseBody getBody() {
        return this.body;
    }

}
