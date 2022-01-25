// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListWatermarksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListWatermarksResponseBody body;

    public static ListWatermarksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWatermarksResponse self = new ListWatermarksResponse();
        return TeaModel.build(map, self);
    }

    public ListWatermarksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWatermarksResponse setBody(ListWatermarksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWatermarksResponseBody getBody() {
        return this.body;
    }

}
