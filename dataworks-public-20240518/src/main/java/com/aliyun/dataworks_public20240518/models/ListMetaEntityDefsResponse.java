// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMetaEntityDefsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetaEntityDefsResponseBody body;

    public static ListMetaEntityDefsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaEntityDefsResponse self = new ListMetaEntityDefsResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaEntityDefsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetaEntityDefsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetaEntityDefsResponse setBody(ListMetaEntityDefsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetaEntityDefsResponseBody getBody() {
        return this.body;
    }

}
