// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMediaTagResponseBody body;

    public static AddMediaTagResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMediaTagResponse self = new AddMediaTagResponse();
        return TeaModel.build(map, self);
    }

    public AddMediaTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMediaTagResponse setBody(AddMediaTagResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMediaTagResponseBody getBody() {
        return this.body;
    }

}
