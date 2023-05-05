// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListSubscribeAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSubscribeAppResponseBody body;

    public static ListSubscribeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribeAppResponse self = new ListSubscribeAppResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscribeAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscribeAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubscribeAppResponse setBody(ListSubscribeAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscribeAppResponseBody getBody() {
        return this.body;
    }

}
