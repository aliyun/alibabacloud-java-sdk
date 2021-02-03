// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaBasicInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMediaBasicInfosResponseBody body;

    public static ListMediaBasicInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaBasicInfosResponse self = new ListMediaBasicInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaBasicInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaBasicInfosResponse setBody(ListMediaBasicInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaBasicInfosResponseBody getBody() {
        return this.body;
    }

}
