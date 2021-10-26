// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListServiceVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceVersionsResponseBody body;

    public static ListServiceVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceVersionsResponse self = new ListServiceVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceVersionsResponse setBody(ListServiceVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceVersionsResponseBody getBody() {
        return this.body;
    }

}
