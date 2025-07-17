// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListMetaCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetaCategoryResponseBody body;

    public static ListMetaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaCategoryResponse self = new ListMetaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetaCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetaCategoryResponse setBody(ListMetaCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetaCategoryResponseBody getBody() {
        return this.body;
    }

}
