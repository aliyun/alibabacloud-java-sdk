// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBusinessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBusinessResponseBody body;

    public static ListBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessResponse self = new ListBusinessResponse();
        return TeaModel.build(map, self);
    }

    public ListBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBusinessResponse setBody(ListBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBusinessResponseBody getBody() {
        return this.body;
    }

}
