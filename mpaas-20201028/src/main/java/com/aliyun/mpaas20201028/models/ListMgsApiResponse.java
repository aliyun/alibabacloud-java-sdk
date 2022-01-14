// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMgsApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMgsApiResponseBody body;

    public static ListMgsApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMgsApiResponse self = new ListMgsApiResponse();
        return TeaModel.build(map, self);
    }

    public ListMgsApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMgsApiResponse setBody(ListMgsApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMgsApiResponseBody getBody() {
        return this.body;
    }

}
