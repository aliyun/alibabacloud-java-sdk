// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListResourceInformationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceInformationsResponseBody body;

    public static ListResourceInformationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceInformationsResponse self = new ListResourceInformationsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceInformationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceInformationsResponse setBody(ListResourceInformationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceInformationsResponseBody getBody() {
        return this.body;
    }

}
