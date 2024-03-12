// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListAccountFactoryBaselinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccountFactoryBaselinesResponseBody body;

    public static ListAccountFactoryBaselinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountFactoryBaselinesResponse self = new ListAccountFactoryBaselinesResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountFactoryBaselinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccountFactoryBaselinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccountFactoryBaselinesResponse setBody(ListAccountFactoryBaselinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccountFactoryBaselinesResponseBody getBody() {
        return this.body;
    }

}
