// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListSessionPackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSessionPackagesResponseBody body;

    public static ListSessionPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSessionPackagesResponse self = new ListSessionPackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListSessionPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSessionPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSessionPackagesResponse setBody(ListSessionPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSessionPackagesResponseBody getBody() {
        return this.body;
    }

}
