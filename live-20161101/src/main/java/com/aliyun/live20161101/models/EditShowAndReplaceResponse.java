// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditShowAndReplaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditShowAndReplaceResponseBody body;

    public static EditShowAndReplaceResponse build(java.util.Map<String, ?> map) throws Exception {
        EditShowAndReplaceResponse self = new EditShowAndReplaceResponse();
        return TeaModel.build(map, self);
    }

    public EditShowAndReplaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditShowAndReplaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditShowAndReplaceResponse setBody(EditShowAndReplaceResponseBody body) {
        this.body = body;
        return this;
    }
    public EditShowAndReplaceResponseBody getBody() {
        return this.body;
    }

}
