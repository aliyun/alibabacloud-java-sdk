// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ListPatentContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPatentContactResponseBody body;

    public static ListPatentContactResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPatentContactResponse self = new ListPatentContactResponse();
        return TeaModel.build(map, self);
    }

    public ListPatentContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPatentContactResponse setBody(ListPatentContactResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPatentContactResponseBody getBody() {
        return this.body;
    }

}
