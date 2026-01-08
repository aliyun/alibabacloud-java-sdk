// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BindInstagramPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindInstagramPageResponseBody body;

    public static BindInstagramPageResponse build(java.util.Map<String, ?> map) throws Exception {
        BindInstagramPageResponse self = new BindInstagramPageResponse();
        return TeaModel.build(map, self);
    }

    public BindInstagramPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindInstagramPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindInstagramPageResponse setBody(BindInstagramPageResponseBody body) {
        this.body = body;
        return this;
    }
    public BindInstagramPageResponseBody getBody() {
        return this.body;
    }

}
