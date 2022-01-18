// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListServiceSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceSourceResponseBody body;

    public static ListServiceSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceSourceResponse self = new ListServiceSourceResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceSourceResponse setBody(ListServiceSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceSourceResponseBody getBody() {
        return this.body;
    }

}
