// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListSchemaSubscribesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSchemaSubscribesResponseBody body;

    public static ListSchemaSubscribesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSchemaSubscribesResponse self = new ListSchemaSubscribesResponse();
        return TeaModel.build(map, self);
    }

    public ListSchemaSubscribesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSchemaSubscribesResponse setBody(ListSchemaSubscribesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSchemaSubscribesResponseBody getBody() {
        return this.body;
    }

}
