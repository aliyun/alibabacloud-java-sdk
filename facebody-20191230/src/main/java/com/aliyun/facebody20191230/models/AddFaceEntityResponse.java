// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddFaceEntityResponseBody body;

    public static AddFaceEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceEntityResponse self = new AddFaceEntityResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceEntityResponse setBody(AddFaceEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceEntityResponseBody getBody() {
        return this.body;
    }

}
