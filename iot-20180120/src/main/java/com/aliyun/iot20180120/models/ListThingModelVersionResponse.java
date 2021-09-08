// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListThingModelVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListThingModelVersionResponseBody body;

    public static ListThingModelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListThingModelVersionResponse self = new ListThingModelVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListThingModelVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListThingModelVersionResponse setBody(ListThingModelVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListThingModelVersionResponseBody getBody() {
        return this.body;
    }

}
