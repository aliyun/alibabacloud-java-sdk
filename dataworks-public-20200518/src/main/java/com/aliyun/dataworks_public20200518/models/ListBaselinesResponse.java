// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBaselinesResponseBody body;

    public static ListBaselinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaselinesResponse self = new ListBaselinesResponse();
        return TeaModel.build(map, self);
    }

    public ListBaselinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBaselinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBaselinesResponse setBody(ListBaselinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaselinesResponseBody getBody() {
        return this.body;
    }

}
