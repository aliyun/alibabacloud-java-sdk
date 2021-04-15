// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosHistoryConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNacosHistoryConfigsResponseBody body;

    public static ListNacosHistoryConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNacosHistoryConfigsResponse self = new ListNacosHistoryConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListNacosHistoryConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNacosHistoryConfigsResponse setBody(ListNacosHistoryConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNacosHistoryConfigsResponseBody getBody() {
        return this.body;
    }

}
