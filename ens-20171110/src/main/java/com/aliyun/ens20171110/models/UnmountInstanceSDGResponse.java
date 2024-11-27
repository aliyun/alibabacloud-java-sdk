// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnmountInstanceSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnmountInstanceSDGResponseBody body;

    public static UnmountInstanceSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        UnmountInstanceSDGResponse self = new UnmountInstanceSDGResponse();
        return TeaModel.build(map, self);
    }

    public UnmountInstanceSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnmountInstanceSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnmountInstanceSDGResponse setBody(UnmountInstanceSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public UnmountInstanceSDGResponseBody getBody() {
        return this.body;
    }

}
