// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UnbindSaseUserTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindSaseUserTagResponseBody body;

    public static UnbindSaseUserTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindSaseUserTagResponse self = new UnbindSaseUserTagResponse();
        return TeaModel.build(map, self);
    }

    public UnbindSaseUserTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindSaseUserTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindSaseUserTagResponse setBody(UnbindSaseUserTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindSaseUserTagResponseBody getBody() {
        return this.body;
    }

}
