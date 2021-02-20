// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class EditSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EditSessionResponseBody body;

    public static EditSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        EditSessionResponse self = new EditSessionResponse();
        return TeaModel.build(map, self);
    }

    public EditSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditSessionResponse setBody(EditSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public EditSessionResponseBody getBody() {
        return this.body;
    }

}
