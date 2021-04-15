// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNacosConfigsResponseBody body;

    public static ListNacosConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNacosConfigsResponse self = new ListNacosConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListNacosConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNacosConfigsResponse setBody(ListNacosConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNacosConfigsResponseBody getBody() {
        return this.body;
    }

}
