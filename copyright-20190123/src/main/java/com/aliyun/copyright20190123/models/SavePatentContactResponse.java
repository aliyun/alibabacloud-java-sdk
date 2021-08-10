// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class SavePatentContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SavePatentContactResponseBody body;

    public static SavePatentContactResponse build(java.util.Map<String, ?> map) throws Exception {
        SavePatentContactResponse self = new SavePatentContactResponse();
        return TeaModel.build(map, self);
    }

    public SavePatentContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SavePatentContactResponse setBody(SavePatentContactResponseBody body) {
        this.body = body;
        return this;
    }
    public SavePatentContactResponseBody getBody() {
        return this.body;
    }

}
